// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.cenc;

import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

public class CencEncryptingSampleList extends AbstractList
{
    private class EncryptedSampleImpl
        implements Sample
    {

        static final boolean $assertionsDisabled;
        private final SecretKey cek;
        private final CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat;
        private final Cipher cipher;
        private final Sample clearSample;
        final CencEncryptingSampleList this$0;

        public ByteBuffer asByteBuffer()
        {
            Object obj;
            ByteBuffer bytebuffer;
            CencSampleAuxiliaryDataFormat cencsampleauxiliarydataformat;
            int i;
            i = 0;
            obj = (ByteBuffer)clearSample.asByteBuffer().rewind();
            bytebuffer = ByteBuffer.allocate(((ByteBuffer) (obj)).limit());
            cencsampleauxiliarydataformat = cencSampleAuxiliaryDataFormat;
            initCipher(cencSampleAuxiliaryDataFormat.iv, cek);
            if (cencsampleauxiliarydataformat.pairs == null) goto _L2; else goto _L1
_L1:
            Object aobj[];
            int j;
            aobj = cencsampleauxiliarydataformat.pairs;
            j = aobj.length;
              goto _L3
_L6:
            byte abyte1[];
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair pair;
            byte abyte0[];
            try
            {
                ((ByteBuffer) (obj)).rewind();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException(((Throwable) (obj)));
            }
            bytebuffer.rewind();
            return bytebuffer;
_L7:
            pair = aobj[i];
            abyte1 = new byte[pair.clear()];
            ((ByteBuffer) (obj)).get(abyte1);
            bytebuffer.put(abyte1);
            if (pair.encrypted() <= 0L) goto _L5; else goto _L4
_L4:
            abyte0 = new byte[CastUtils.l2i(pair.encrypted())];
            ((ByteBuffer) (obj)).get(abyte0);
            if (!$assertionsDisabled && abyte0.length % 16 != 0)
            {
                throw new AssertionError();
            }
            abyte1 = cipher.update(abyte0);
            if (!$assertionsDisabled && abyte1.length != abyte0.length)
            {
                throw new AssertionError();
            }
            bytebuffer.put(abyte1);
              goto _L5
_L2:
            aobj = new byte[((ByteBuffer) (obj)).limit()];
            ((ByteBuffer) (obj)).get(((byte []) (aobj)));
            if ("cbc1".equals(encryptionAlgo))
            {
                i = (aobj.length / 16) * 16;
                bytebuffer.put(cipher.doFinal(((byte []) (aobj)), 0, i));
                bytebuffer.put(((byte []) (aobj)), i, aobj.length - i);
                break; /* Loop/switch isn't completed */
            }
            if (!"cenc".equals(encryptionAlgo))
            {
                break; /* Loop/switch isn't completed */
            }
            bytebuffer.put(cipher.doFinal(((byte []) (aobj))));
            break; /* Loop/switch isn't completed */
_L3:
            if (i < j) goto _L7; else goto _L6
_L5:
            i++;
              goto _L3
        }

        public long getSize()
        {
            return clearSample.getSize();
        }

        public void writeTo(WritableByteChannel writablebytechannel)
        {
            ByteBuffer bytebuffer;
            int i;
            i = 0;
            bytebuffer = (ByteBuffer)clearSample.asByteBuffer().rewind();
            initCipher(cencSampleAuxiliaryDataFormat.iv, cek);
            if (cencSampleAuxiliaryDataFormat.pairs == null || cencSampleAuxiliaryDataFormat.pairs.length <= 0) goto _L2; else goto _L1
_L1:
            byte abyte0[];
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair apair[];
            int l;
            abyte0 = new byte[bytebuffer.limit()];
            bytebuffer.get(abyte0);
            apair = cencSampleAuxiliaryDataFormat.pairs;
            l = apair.length;
            int j = 0;
_L11:
            if (j < l) goto _L4; else goto _L3
_L3:
            writablebytechannel.write(ByteBuffer.wrap(abyte0));
_L8:
            bytebuffer.rewind();
            return;
_L4:
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair pair = apair[j];
            int k;
            try
            {
                k = i + pair.clear();
            }
            // Misplaced declaration of an exception variable
            catch (WritableByteChannel writablebytechannel)
            {
                throw new RuntimeException(writablebytechannel);
            }
            // Misplaced declaration of an exception variable
            catch (WritableByteChannel writablebytechannel)
            {
                throw new RuntimeException(writablebytechannel);
            }
            // Misplaced declaration of an exception variable
            catch (WritableByteChannel writablebytechannel)
            {
                throw new RuntimeException(writablebytechannel);
            }
            i = k;
            if (pair.encrypted() > 0L)
            {
                cipher.update(abyte0, k, CastUtils.l2i(pair.encrypted()), abyte0, k);
                i = (int)((long)k + pair.encrypted());
            }
              goto _L5
_L2:
            abyte0 = new byte[bytebuffer.limit()];
            bytebuffer.get(abyte0);
            if (!"cbc1".equals(encryptionAlgo)) goto _L7; else goto _L6
_L6:
            i = (abyte0.length / 16) * 16;
            writablebytechannel.write(ByteBuffer.wrap(cipher.doFinal(abyte0, 0, i)));
            writablebytechannel.write(ByteBuffer.wrap(abyte0, i, abyte0.length - i));
              goto _L8
_L7:
            if (!"cenc".equals(encryptionAlgo)) goto _L8; else goto _L9
_L9:
            writablebytechannel.write(ByteBuffer.wrap(cipher.doFinal(abyte0)));
              goto _L8
_L5:
            j++;
            if (true) goto _L11; else goto _L10
_L10:
        }

        static 
        {
            boolean flag;
            if (!com/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        private EncryptedSampleImpl(Sample sample, CencSampleAuxiliaryDataFormat cencsampleauxiliarydataformat, Cipher cipher1, SecretKey secretkey)
        {
            this$0 = CencEncryptingSampleList.this;
            super();
            clearSample = sample;
            cencSampleAuxiliaryDataFormat = cencsampleauxiliarydataformat;
            cipher = cipher1;
            cek = secretkey;
        }

        EncryptedSampleImpl(Sample sample, CencSampleAuxiliaryDataFormat cencsampleauxiliarydataformat, Cipher cipher1, SecretKey secretkey, EncryptedSampleImpl encryptedsampleimpl)
        {
            this(sample, cencsampleauxiliarydataformat, cipher1, secretkey);
        }
    }


    List auxiliaryDataFormats;
    RangeStartMap ceks;
    Cipher cipher;
    private final String encryptionAlgo;
    List parent;

    public CencEncryptingSampleList(RangeStartMap rangestartmap, List list, List list1, String s)
    {
        ceks = new RangeStartMap();
        auxiliaryDataFormats = list1;
        ceks = rangestartmap;
        encryptionAlgo = s;
        parent = list;
        try
        {
            if ("cenc".equals(s))
            {
                cipher = Cipher.getInstance("AES/CTR/NoPadding");
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (RangeStartMap rangestartmap)
        {
            throw new RuntimeException(rangestartmap);
        }
        // Misplaced declaration of an exception variable
        catch (RangeStartMap rangestartmap)
        {
            throw new RuntimeException(rangestartmap);
        }
        if ("cbc1".equals(s))
        {
            cipher = Cipher.getInstance("AES/CBC/NoPadding");
            return;
        }
        throw new RuntimeException("Only cenc & cbc1 is supported as encryptionAlgo");
    }

    public CencEncryptingSampleList(SecretKey secretkey, List list, List list1)
    {
        this(new RangeStartMap(Integer.valueOf(0), secretkey), list, list1, "cenc");
    }

    public Sample get(int i)
    {
        Sample sample = (Sample)parent.get(i);
        if (ceks.get(Integer.valueOf(i)) != null)
        {
            return new EncryptedSampleImpl(sample, (CencSampleAuxiliaryDataFormat)auxiliaryDataFormats.get(i), cipher, (SecretKey)ceks.get(Integer.valueOf(i)), null);
        } else
        {
            return sample;
        }
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    protected void initCipher(byte abyte0[], SecretKey secretkey)
    {
        try
        {
            byte abyte1[] = new byte[16];
            System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
            cipher.init(1, secretkey, new IvParameterSpec(abyte1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
    }

    public int size()
    {
        return parent.size();
    }

}
