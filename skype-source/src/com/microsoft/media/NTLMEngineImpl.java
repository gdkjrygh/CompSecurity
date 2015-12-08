// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.impl.auth.NTLMEngine;
import org.apache.http.impl.auth.NTLMEngineException;
import org.apache.http.util.EncodingUtils;

final class NTLMEngineImpl
    implements NTLMEngine
{
    static class HMACMD5
    {

        protected byte ipad[];
        protected MessageDigest md5;
        protected byte opad[];

        byte[] getOutput()
        {
            byte abyte0[] = md5.digest();
            md5.update(opad);
            return md5.digest(abyte0);
        }

        void update(byte abyte0[])
        {
            md5.update(abyte0);
        }

        void update(byte abyte0[], int i, int j)
        {
            md5.update(abyte0, i, j);
        }

        HMACMD5(byte abyte0[])
            throws NTLMEngineException
        {
            byte abyte1[];
            int i;
            int j;
            int k;
            try
            {
                md5 = MessageDigest.getInstance("MD5");
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new NTLMEngineException((new StringBuilder("Error getting md5 message digest implementation: ")).append(abyte0.getMessage()).toString(), abyte0);
            }
            ipad = new byte[64];
            opad = new byte[64];
            i = abyte0.length;
            j = i;
            abyte1 = abyte0;
            if (i > 64)
            {
                md5.update(abyte0);
                abyte1 = md5.digest();
                j = abyte1.length;
            }
            i = 0;
            do
            {
                k = i;
                if (i >= j)
                {
                    break;
                }
                ipad[i] = (byte)(abyte1[i] ^ 0x36);
                opad[i] = (byte)(abyte1[i] ^ 0x5c);
                i++;
            } while (true);
            for (; k < 64; k++)
            {
                ipad[k] = 54;
                opad[k] = 92;
            }

            md5.reset();
            md5.update(ipad);
        }
    }

    static class MD4
    {

        protected int A;
        protected int B;
        protected int C;
        protected int D;
        protected long count;
        protected byte dataBuffer[];

        byte[] getOutput()
        {
            int i = (int)(count & 63L);
            byte abyte0[];
            if (i < 56)
            {
                i = 56 - i;
            } else
            {
                i = 120 - i;
            }
            abyte0 = new byte[i + 8];
            abyte0[0] = -128;
            for (int j = 0; j < 8; j++)
            {
                abyte0[i + j] = (byte)(int)(count * 8L >>> j * 8);
            }

            update(abyte0);
            abyte0 = new byte[16];
            NTLMEngineImpl.writeULong(abyte0, A, 0);
            NTLMEngineImpl.writeULong(abyte0, B, 4);
            NTLMEngineImpl.writeULong(abyte0, C, 8);
            NTLMEngineImpl.writeULong(abyte0, D, 12);
            return abyte0;
        }

        protected void processBuffer()
        {
            int ai[] = new int[16];
            for (int i = 0; i < 16; i++)
            {
                ai[i] = (dataBuffer[i * 4] & 0xff) + ((dataBuffer[i * 4 + 1] & 0xff) << 8) + ((dataBuffer[i * 4 + 2] & 0xff) << 16) + ((dataBuffer[i * 4 + 3] & 0xff) << 24);
            }

            int j = A;
            int k = B;
            int l = C;
            int i1 = D;
            round1(ai);
            round2(ai);
            round3(ai);
            A = A + j;
            B = B + k;
            C = C + l;
            D = D + i1;
        }

        protected void round1(int ai[])
        {
            A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.F(B, C, D) + ai[0], 3);
            D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.F(A, B, C) + ai[1], 7);
            C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.F(D, A, B) + ai[2], 11);
            B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.F(C, D, A) + ai[3], 19);
            A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.F(B, C, D) + ai[4], 3);
            D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.F(A, B, C) + ai[5], 7);
            C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.F(D, A, B) + ai[6], 11);
            B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.F(C, D, A) + ai[7], 19);
            A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.F(B, C, D) + ai[8], 3);
            D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.F(A, B, C) + ai[9], 7);
            C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.F(D, A, B) + ai[10], 11);
            B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.F(C, D, A) + ai[11], 19);
            A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.F(B, C, D) + ai[12], 3);
            D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.F(A, B, C) + ai[13], 7);
            C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.F(D, A, B) + ai[14], 11);
            B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.F(C, D, A) + ai[15], 19);
        }

        protected void round2(int ai[])
        {
            A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.G(B, C, D) + ai[0] + 0x5a827999, 3);
            D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.G(A, B, C) + ai[4] + 0x5a827999, 5);
            C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.G(D, A, B) + ai[8] + 0x5a827999, 9);
            B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.G(C, D, A) + ai[12] + 0x5a827999, 13);
            A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.G(B, C, D) + ai[1] + 0x5a827999, 3);
            D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.G(A, B, C) + ai[5] + 0x5a827999, 5);
            C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.G(D, A, B) + ai[9] + 0x5a827999, 9);
            B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.G(C, D, A) + ai[13] + 0x5a827999, 13);
            A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.G(B, C, D) + ai[2] + 0x5a827999, 3);
            D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.G(A, B, C) + ai[6] + 0x5a827999, 5);
            C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.G(D, A, B) + ai[10] + 0x5a827999, 9);
            B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.G(C, D, A) + ai[14] + 0x5a827999, 13);
            A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.G(B, C, D) + ai[3] + 0x5a827999, 3);
            D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.G(A, B, C) + ai[7] + 0x5a827999, 5);
            C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.G(D, A, B) + ai[11] + 0x5a827999, 9);
            B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.G(C, D, A) + ai[15] + 0x5a827999, 13);
        }

        protected void round3(int ai[])
        {
            A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.H(B, C, D) + ai[0] + 0x6ed9eba1, 3);
            D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.H(A, B, C) + ai[8] + 0x6ed9eba1, 9);
            C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.H(D, A, B) + ai[4] + 0x6ed9eba1, 11);
            B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.H(C, D, A) + ai[12] + 0x6ed9eba1, 15);
            A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.H(B, C, D) + ai[2] + 0x6ed9eba1, 3);
            D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.H(A, B, C) + ai[10] + 0x6ed9eba1, 9);
            C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.H(D, A, B) + ai[6] + 0x6ed9eba1, 11);
            B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.H(C, D, A) + ai[14] + 0x6ed9eba1, 15);
            A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.H(B, C, D) + ai[1] + 0x6ed9eba1, 3);
            D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.H(A, B, C) + ai[9] + 0x6ed9eba1, 9);
            C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.H(D, A, B) + ai[5] + 0x6ed9eba1, 11);
            B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.H(C, D, A) + ai[13] + 0x6ed9eba1, 15);
            A = NTLMEngineImpl.rotintlft(A + NTLMEngineImpl.H(B, C, D) + ai[3] + 0x6ed9eba1, 3);
            D = NTLMEngineImpl.rotintlft(D + NTLMEngineImpl.H(A, B, C) + ai[11] + 0x6ed9eba1, 9);
            C = NTLMEngineImpl.rotintlft(C + NTLMEngineImpl.H(D, A, B) + ai[7] + 0x6ed9eba1, 11);
            B = NTLMEngineImpl.rotintlft(B + NTLMEngineImpl.H(C, D, A) + ai[15] + 0x6ed9eba1, 15);
        }

        void update(byte abyte0[])
        {
            int j = (int)(count & 63L);
            int i;
            for (i = 0; (abyte0.length - i) + j >= dataBuffer.length;)
            {
                int k = dataBuffer.length - j;
                System.arraycopy(abyte0, i, dataBuffer, j, k);
                count = count + (long)k;
                j = 0;
                i += k;
                processBuffer();
            }

            if (i < abyte0.length)
            {
                int l = abyte0.length - i;
                System.arraycopy(abyte0, i, dataBuffer, j, l);
                count = count + (long)l;
            }
        }

        MD4()
        {
            A = 0x67452301;
            B = 0xefcdab89;
            C = 0x98badcfe;
            D = 0x10325476;
            count = 0L;
            dataBuffer = new byte[64];
        }
    }

    static class NTLMMessage
    {

        private int currentOutputPosition;
        private byte messageContents[];

        protected void addByte(byte byte0)
        {
            messageContents[currentOutputPosition] = byte0;
            currentOutputPosition = currentOutputPosition + 1;
        }

        protected void addBytes(byte abyte0[])
        {
            for (int i = 0; i < abyte0.length; i++)
            {
                messageContents[currentOutputPosition] = abyte0[i];
                currentOutputPosition = currentOutputPosition + 1;
            }

        }

        protected void addULong(int i)
        {
            addByte((byte)(i & 0xff));
            addByte((byte)(i >> 8 & 0xff));
            addByte((byte)(i >> 16 & 0xff));
            addByte((byte)(i >> 24 & 0xff));
        }

        protected void addUShort(int i)
        {
            addByte((byte)(i & 0xff));
            addByte((byte)(i >> 8 & 0xff));
        }

        protected int getMessageLength()
        {
            return currentOutputPosition;
        }

        protected int getPreambleLength()
        {
            return NTLMEngineImpl.SIGNATURE.length + 4;
        }

        String getResponse()
        {
            byte abyte0[];
            if (messageContents.length > currentOutputPosition)
            {
                abyte0 = new byte[currentOutputPosition];
                for (int i = 0; i < currentOutputPosition; i++)
                {
                    abyte0[i] = messageContents[i];
                }

            } else
            {
                abyte0 = messageContents;
            }
            return EncodingUtils.getAsciiString(Base64.encodeBase64(abyte0));
        }

        protected void prepareResponse(int i, int j)
        {
            messageContents = new byte[i];
            currentOutputPosition = 0;
            addBytes(NTLMEngineImpl.SIGNATURE);
            addULong(j);
        }

        protected byte readByte(int i)
            throws NTLMEngineException
        {
            if (messageContents.length < i + 1)
            {
                throw new NTLMEngineException("NTLM: Message too short");
            } else
            {
                return messageContents[i];
            }
        }

        protected void readBytes(byte abyte0[], int i)
            throws NTLMEngineException
        {
            if (messageContents.length < abyte0.length + i)
            {
                throw new NTLMEngineException("NTLM: Message too short");
            } else
            {
                System.arraycopy(messageContents, i, abyte0, 0, abyte0.length);
                return;
            }
        }

        protected byte[] readSecurityBuffer(int i)
            throws NTLMEngineException
        {
            return NTLMEngineImpl.readSecurityBuffer(messageContents, i);
        }

        protected int readULong(int i)
            throws NTLMEngineException
        {
            return NTLMEngineImpl.readULong(messageContents, i);
        }

        protected int readUShort(int i)
            throws NTLMEngineException
        {
            return NTLMEngineImpl.readUShort(messageContents, i);
        }

        NTLMMessage()
        {
            messageContents = null;
            currentOutputPosition = 0;
        }

        NTLMMessage(String s, int i)
            throws NTLMEngineException
        {
            messageContents = null;
            currentOutputPosition = 0;
            messageContents = Base64.decodeBase64(EncodingUtils.getBytes(s, "ASCII"));
            if (messageContents.length < NTLMEngineImpl.SIGNATURE.length)
            {
                throw new NTLMEngineException("NTLM message decoding error - packet too short");
            }
            for (int j = 0; j < NTLMEngineImpl.SIGNATURE.length; j++)
            {
                if (messageContents[j] != NTLMEngineImpl.SIGNATURE[j])
                {
                    throw new NTLMEngineException("NTLM message expected - instead got unrecognized bytes");
                }
            }

            int k = readULong(NTLMEngineImpl.SIGNATURE.length);
            if (k != i)
            {
                throw new NTLMEngineException((new StringBuilder("NTLM type ")).append(Integer.toString(i)).append(" message expected - instead got type ").append(Integer.toString(k)).toString());
            } else
            {
                currentOutputPosition = messageContents.length;
                return;
            }
        }
    }

    static class Type1Message extends NTLMMessage
    {

        protected byte domainBytes[];
        protected byte hostBytes[];

        String getResponse()
        {
            prepareResponse(hostBytes.length + 32 + domainBytes.length, 1);
            addULong(0x20080235);
            addUShort(domainBytes.length);
            addUShort(domainBytes.length);
            addULong(hostBytes.length + 32);
            addUShort(hostBytes.length);
            addUShort(hostBytes.length);
            addULong(32);
            addBytes(hostBytes);
            addBytes(domainBytes);
            return super.getResponse();
        }

        Type1Message(String s, String s1)
            throws NTLMEngineException
        {
            try
            {
                s1 = NTLMEngineImpl.convertHost(s1);
                s = NTLMEngineImpl.convertDomain(s);
                hostBytes = s1.getBytes("UnicodeLittleUnmarked");
                domainBytes = s.toUpperCase(Locale.US).getBytes("UnicodeLittleUnmarked");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new NTLMEngineException((new StringBuilder("Unicode unsupported: ")).append(s.getMessage()).toString(), s);
            }
        }
    }

    static class Type2Message extends NTLMMessage
    {

        protected byte challenge[];
        protected int flags;
        protected String target;
        protected byte targetInfo[];

        byte[] getChallenge()
        {
            return challenge;
        }

        int getFlags()
        {
            return flags;
        }

        String getTarget()
        {
            return target;
        }

        byte[] getTargetInfo()
        {
            return targetInfo;
        }

        Type2Message(String s)
            throws NTLMEngineException
        {
            super(s, 2);
            challenge = new byte[8];
            readBytes(challenge, 24);
            flags = readULong(20);
            if ((flags & 1) == 0)
            {
                throw new NTLMEngineException((new StringBuilder("NTLM type 2 message has flags that make no sense: ")).append(Integer.toString(flags)).toString());
            }
            target = null;
            if (getMessageLength() >= 20)
            {
                s = readSecurityBuffer(12);
                if (s.length != 0)
                {
                    try
                    {
                        target = new String(s, "UnicodeLittleUnmarked");
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw new NTLMEngineException(s.getMessage(), s);
                    }
                }
            }
            targetInfo = null;
            if (getMessageLength() >= 48)
            {
                s = readSecurityBuffer(40);
                if (s.length != 0)
                {
                    targetInfo = s;
                }
            }
        }
    }

    static class Type3Message extends NTLMMessage
    {

        protected byte domainBytes[];
        protected byte hostBytes[];
        protected byte lmResp[];
        protected byte ntResp[];
        protected int type2Flags;
        protected byte userBytes[];

        String getResponse()
        {
            int i = ntResp.length;
            int j = lmResp.length;
            int k = domainBytes.length;
            int l = hostBytes.length;
            int i1 = userBytes.length;
            int j1 = j + 64;
            int k1 = j1 + i;
            int l1 = k1 + k;
            int i2 = l1 + i1;
            int j2 = i2 + l + 0;
            prepareResponse(j2, 3);
            addUShort(j);
            addUShort(j);
            addULong(64);
            addUShort(i);
            addUShort(i);
            addULong(j1);
            addUShort(k);
            addUShort(k);
            addULong(k1);
            addUShort(i1);
            addUShort(i1);
            addULong(l1);
            addUShort(l);
            addUShort(l);
            addULong(i2);
            addULong(0);
            addULong(j2);
            addULong(0x20000205 | type2Flags & 0x80000 | type2Flags & 0x10 | type2Flags & 0x20 | type2Flags & 0x40000000 | type2Flags & 0x8000);
            addBytes(lmResp);
            addBytes(ntResp);
            addBytes(domainBytes);
            addBytes(userBytes);
            addBytes(hostBytes);
            return super.getResponse();
        }

        Type3Message(String s, String s1, String s2, String s3, byte abyte0[], int i, String s4, 
                byte abyte1[])
            throws NTLMEngineException
        {
            type2Flags = i;
            s1 = NTLMEngineImpl.convertHost(s1);
            s = NTLMEngineImpl.convertDomain(s);
            if (abyte1 == null || s4 == null) goto _L2; else goto _L1
_L1:
            try
            {
                byte abyte2[] = NTLMEngineImpl.makeRandomChallenge();
                ntResp = NTLMEngineImpl.getNTLMv2Response(s4, s2, s3, abyte0, abyte2, abyte1);
                lmResp = NTLMEngineImpl.getLMv2Response(s4, s2, s3, abyte0, abyte2);
            }
            // Misplaced declaration of an exception variable
            catch (String s4)
            {
                ntResp = new byte[0];
                lmResp = NTLMEngineImpl.getLMResponse(s3, abyte0);
            }
_L3:
            try
            {
                domainBytes = s.toUpperCase(Locale.US).getBytes("UnicodeLittleUnmarked");
                hostBytes = s1.getBytes("UnicodeLittleUnmarked");
                userBytes = s2.getBytes("UnicodeLittleUnmarked");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new NTLMEngineException((new StringBuilder("Unicode not supported: ")).append(s.getMessage()).toString(), s);
            }
_L2:
            if ((0x80000 & i) == 0)
            {
                break MISSING_BLOCK_LABEL_164;
            }
            s4 = NTLMEngineImpl.makeNTLM2RandomChallenge();
            ntResp = NTLMEngineImpl.getNTLM2SessionResponse(s3, abyte0, s4);
            lmResp = s4;
            break MISSING_BLOCK_LABEL_69;
            ntResp = NTLMEngineImpl.getNTLMResponse(s3, abyte0);
            lmResp = NTLMEngineImpl.getLMResponse(s3, abyte0);
              goto _L3
        }
    }


    static final String DEFAULT_CHARSET = "ASCII";
    protected static final int FLAG_NEGOTIATE_128 = 0x20000000;
    protected static final int FLAG_NEGOTIATE_ALWAYS_SIGN = 32768;
    protected static final int FLAG_NEGOTIATE_KEY_EXCH = 0x40000000;
    protected static final int FLAG_NEGOTIATE_NTLM = 512;
    protected static final int FLAG_NEGOTIATE_NTLM2 = 0x80000;
    protected static final int FLAG_NEGOTIATE_SEAL = 32;
    protected static final int FLAG_NEGOTIATE_SIGN = 16;
    protected static final int FLAG_TARGET_DESIRED = 4;
    protected static final int FLAG_UNICODE_ENCODING = 1;
    private static final SecureRandom RND_GEN;
    private static byte SIGNATURE[];
    private String credentialCharset;

    NTLMEngineImpl()
    {
        credentialCharset = "ASCII";
    }

    static int F(int i, int j, int k)
    {
        return i & j | ~i & k;
    }

    static int G(int i, int j, int k)
    {
        return i & j | i & k | j & k;
    }

    static int H(int i, int j, int k)
    {
        return i ^ j ^ k;
    }

    private static String convertDomain(String s)
    {
        return stripDotSuffix(s);
    }

    private static String convertHost(String s)
    {
        return stripDotSuffix(s);
    }

    private static byte[] createBlob(byte abyte0[], byte abyte1[])
    {
        long l = (System.currentTimeMillis() + 0xa9730b66800L) * 10000L;
        byte abyte2[] = new byte[8];
        for (int i = 0; i < 8; i++)
        {
            abyte2[i] = (byte)(int)l;
            l >>>= 8;
        }

        byte abyte3[] = new byte[abyte1.length + 28];
        System.arraycopy(new byte[] {
            1, 1, 0, 0
        }, 0, abyte3, 0, 4);
        System.arraycopy(new byte[] {
            0, 0, 0, 0
        }, 0, abyte3, 4, 4);
        System.arraycopy(abyte2, 0, abyte3, 8, 8);
        System.arraycopy(abyte0, 0, abyte3, 16, 8);
        System.arraycopy(new byte[] {
            0, 0, 0, 0
        }, 0, abyte3, 24, 4);
        System.arraycopy(abyte1, 0, abyte3, 28, abyte1.length);
        return abyte3;
    }

    private static Key createDESKey(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[7];
        System.arraycopy(abyte0, i, abyte1, 0, 7);
        abyte0 = new byte[8];
        abyte0[0] = abyte1[0];
        abyte0[1] = (byte)(abyte1[0] << 7 | (abyte1[1] & 0xff) >>> 1);
        abyte0[2] = (byte)(abyte1[1] << 6 | (abyte1[2] & 0xff) >>> 2);
        abyte0[3] = (byte)(abyte1[2] << 5 | (abyte1[3] & 0xff) >>> 3);
        abyte0[4] = (byte)(abyte1[3] << 4 | (abyte1[4] & 0xff) >>> 4);
        abyte0[5] = (byte)(abyte1[4] << 3 | (abyte1[5] & 0xff) >>> 5);
        abyte0[6] = (byte)(abyte1[5] << 2 | (abyte1[6] & 0xff) >>> 6);
        abyte0[7] = (byte)(abyte1[6] << 1);
        oddParity(abyte0);
        return new SecretKeySpec(abyte0, "DES");
    }

    static byte[] getLMResponse(String s, byte abyte0[])
        throws NTLMEngineException
    {
        return lmResponse(lmHash(s), abyte0);
    }

    static byte[] getLMv2Response(String s, String s1, String s2, byte abyte0[], byte abyte1[])
        throws NTLMEngineException
    {
        return lmv2Response(ntlmv2Hash(s, s1, s2), abyte0, abyte1);
    }

    static byte[] getNTLM2SessionResponse(String s, byte abyte0[], byte abyte1[])
        throws NTLMEngineException
    {
        try
        {
            s = ntlmHash(s);
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(abyte0);
            messagedigest.update(abyte1);
            abyte0 = messagedigest.digest();
            abyte1 = new byte[8];
            System.arraycopy(abyte0, 0, abyte1, 0, 8);
            s = lmResponse(s, abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (s instanceof NTLMEngineException)
            {
                throw (NTLMEngineException)s;
            } else
            {
                throw new NTLMEngineException(s.getMessage(), s);
            }
        }
        return s;
    }

    static byte[] getNTLMResponse(String s, byte abyte0[])
        throws NTLMEngineException
    {
        return lmResponse(ntlmHash(s), abyte0);
    }

    static byte[] getNTLMv2Response(String s, String s1, String s2, byte abyte0[], byte abyte1[], byte abyte2[])
        throws NTLMEngineException
    {
        return lmv2Response(ntlmv2Hash(s, s1, s2), abyte0, createBlob(abyte1, abyte2));
    }

    private static byte[] lmHash(String s)
        throws NTLMEngineException
    {
        byte abyte1[];
        try
        {
            s = s.toUpperCase(Locale.US).getBytes("US-ASCII");
            int i = Math.min(s.length, 14);
            byte abyte0[] = new byte[14];
            System.arraycopy(s, 0, abyte0, 0, i);
            s = createDESKey(abyte0, 0);
            Key key = createDESKey(abyte0, 7);
            abyte1 = "KGS!@#$%".getBytes("US-ASCII");
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, s);
            s = cipher.doFinal(abyte1);
            cipher.init(1, key);
            key = cipher.doFinal(abyte1);
            abyte1 = new byte[16];
            System.arraycopy(s, 0, abyte1, 0, 8);
            System.arraycopy(key, 0, abyte1, 8, 8);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NTLMEngineException(s.getMessage(), s);
        }
        return abyte1;
    }

    private static byte[] lmResponse(byte abyte0[], byte abyte1[])
        throws NTLMEngineException
    {
        byte abyte3[];
        try
        {
            abyte3 = new byte[21];
            System.arraycopy(abyte0, 0, abyte3, 0, 16);
            abyte0 = createDESKey(abyte3, 0);
            Key key = createDESKey(abyte3, 7);
            Key key1 = createDESKey(abyte3, 14);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, abyte0);
            abyte0 = cipher.doFinal(abyte1);
            cipher.init(1, key);
            byte abyte2[] = cipher.doFinal(abyte1);
            cipher.init(1, key1);
            abyte1 = cipher.doFinal(abyte1);
            key1 = new byte[24];
            System.arraycopy(abyte0, 0, key1, 0, 8);
            System.arraycopy(abyte2, 0, key1, 8, 8);
            System.arraycopy(abyte1, 0, key1, 16, 8);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new NTLMEngineException(abyte0.getMessage(), abyte0);
        }
        return key1;
    }

    private static byte[] lmv2Response(byte abyte0[], byte abyte1[], byte abyte2[])
        throws NTLMEngineException
    {
        abyte0 = new HMACMD5(abyte0);
        abyte0.update(abyte1);
        abyte0.update(abyte2);
        abyte0 = abyte0.getOutput();
        abyte1 = new byte[abyte0.length + abyte2.length];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        System.arraycopy(abyte2, 0, abyte1, abyte0.length, abyte2.length);
        return abyte1;
    }

    private static byte[] makeNTLM2RandomChallenge()
        throws NTLMEngineException
    {
        if (RND_GEN == null)
        {
            throw new NTLMEngineException("Random generator not available");
        }
        byte abyte0[] = new byte[24];
        synchronized (RND_GEN)
        {
            RND_GEN.nextBytes(abyte0);
        }
        Arrays.fill(abyte0, 8, 24, (byte)0);
        return abyte0;
        exception;
        securerandom;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static byte[] makeRandomChallenge()
        throws NTLMEngineException
    {
        if (RND_GEN == null)
        {
            throw new NTLMEngineException("Random generator not available");
        }
        byte abyte0[] = new byte[8];
        synchronized (RND_GEN)
        {
            RND_GEN.nextBytes(abyte0);
        }
        return abyte0;
        exception;
        securerandom;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static byte[] ntlmHash(String s)
        throws NTLMEngineException
    {
        try
        {
            s = s.getBytes("UnicodeLittleUnmarked");
            MD4 md4 = new MD4();
            md4.update(s);
            s = md4.getOutput();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NTLMEngineException((new StringBuilder("Unicode not supported: ")).append(s.getMessage()).toString(), s);
        }
        return s;
    }

    private static byte[] ntlmv2Hash(String s, String s1, String s2)
        throws NTLMEngineException
    {
        try
        {
            s2 = new HMACMD5(ntlmHash(s2));
            s2.update(s1.toUpperCase(Locale.US).getBytes("UnicodeLittleUnmarked"));
            s2.update(s.getBytes("UnicodeLittleUnmarked"));
            s = s2.getOutput();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NTLMEngineException((new StringBuilder("Unicode not supported! ")).append(s.getMessage()).toString(), s);
        }
        return s;
    }

    private static void oddParity(byte abyte0[])
    {
        int i = 0;
        while (i < abyte0.length) 
        {
            byte byte0 = abyte0[i];
            boolean flag;
            if (((byte0 >>> 7 ^ byte0 >>> 6 ^ byte0 >>> 5 ^ byte0 >>> 4 ^ byte0 >>> 3 ^ byte0 >>> 2 ^ byte0 >>> 1) & 1) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                abyte0[i] = (byte)(abyte0[i] | 1);
            } else
            {
                abyte0[i] = (byte)(abyte0[i] & -2);
            }
            i++;
        }
    }

    private static byte[] readSecurityBuffer(byte abyte0[], int i)
        throws NTLMEngineException
    {
        int j = readUShort(abyte0, i);
        i = readULong(abyte0, i + 4);
        if (abyte0.length < i + j)
        {
            throw new NTLMEngineException("NTLM authentication - buffer too small for data item");
        } else
        {
            byte abyte1[] = new byte[j];
            System.arraycopy(abyte0, i, abyte1, 0, j);
            return abyte1;
        }
    }

    private static int readULong(byte abyte0[], int i)
        throws NTLMEngineException
    {
        if (abyte0.length < i + 4)
        {
            throw new NTLMEngineException("NTLM authentication - buffer too small for DWORD");
        } else
        {
            return abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | (abyte0[i + 3] & 0xff) << 24;
        }
    }

    private static int readUShort(byte abyte0[], int i)
        throws NTLMEngineException
    {
        if (abyte0.length < i + 2)
        {
            throw new NTLMEngineException("NTLM authentication - buffer too small for WORD");
        } else
        {
            return abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8;
        }
    }

    static int rotintlft(int i, int j)
    {
        return i << j | i >>> 32 - j;
    }

    private static String stripDotSuffix(String s)
    {
        int i = s.indexOf(".");
        String s1 = s;
        if (i != -1)
        {
            s1 = s.substring(0, i);
        }
        return s1;
    }

    static void writeULong(byte abyte0[], int i, int j)
    {
        abyte0[j] = (byte)(i & 0xff);
        abyte0[j + 1] = (byte)(i >> 8 & 0xff);
        abyte0[j + 2] = (byte)(i >> 16 & 0xff);
        abyte0[j + 3] = (byte)(i >> 24 & 0xff);
    }

    public final String generateType1Msg(String s, String s1)
        throws NTLMEngineException
    {
        return getType1Message(s1, s);
    }

    public final String generateType3Msg(String s, String s1, String s2, String s3, String s4)
        throws NTLMEngineException
    {
        s4 = new Type2Message(s4);
        return getType3Message(s, s1, s3, s2, s4.getChallenge(), s4.getFlags(), s4.getTarget(), s4.getTargetInfo());
    }

    final String getCredentialCharset()
    {
        return credentialCharset;
    }

    final String getResponseFor(String s, String s1, String s2, String s3, String s4)
        throws NTLMEngineException
    {
        if (s == null || s.trim().equals(""))
        {
            return getType1Message(s3, s4);
        } else
        {
            s = new Type2Message(s);
            return getType3Message(s1, s2, s3, s4, s.getChallenge(), s.getFlags(), s.getTarget(), s.getTargetInfo());
        }
    }

    final String getType1Message(String s, String s1)
    {
        try
        {
            s = (new Type1Message(s1, s)).getResponse();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    final String getType3Message(String s, String s1, String s2, String s3, byte abyte0[], int i, String s4, 
            byte abyte1[])
    {
        try
        {
            s = (new Type3Message(s3, s2, s, s1, abyte0, i, s4, abyte1)).getResponse();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    final void setCredentialCharset(String s)
    {
        credentialCharset = s;
    }

    static 
    {
        SecureRandom securerandom = null;
        SecureRandom securerandom1 = SecureRandom.getInstance("SHA1PRNG");
        securerandom = securerandom1;
_L2:
        RND_GEN = securerandom;
        byte abyte0[] = EncodingUtils.getBytes("NTLMSSP", "ASCII");
        SIGNATURE = new byte[abyte0.length + 1];
        System.arraycopy(abyte0, 0, SIGNATURE, 0, abyte0.length);
        SIGNATURE[abyte0.length] = 0;
        return;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }








}
