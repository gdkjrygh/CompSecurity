// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

// Referenced classes of package com.google.common.io:
//            GwtWorkarounds

public abstract class BaseEncoding
{
    static final class Alphabet extends CharMatcher
    {

        final int bitsPerChar;
        final int bytesPerChunk;
        private final char chars[];
        final int charsPerChunk;
        private final byte decodabet[];
        final int mask;
        private final String name;
        private final boolean validPadding[];

        final int decode(char c)
            throws IOException
        {
            if (c > '\177' || decodabet[c] == -1)
            {
                throw new DecodingException((new StringBuilder("Unrecognized character: ")).append(c).toString());
            } else
            {
                return decodabet[c];
            }
        }

        final char encode(int i)
        {
            return chars[i];
        }

        final boolean isValidPaddingStartPosition(int i)
        {
            return validPadding[i % charsPerChunk];
        }

        public final boolean matches(char c)
        {
            return CharMatcher.ASCII.matches(c) && decodabet[c] != -1;
        }

        public final String toString()
        {
            return name;
        }

        Alphabet(String s, char ac[])
        {
            name = (String)Preconditions.checkNotNull(s);
            chars = (char[])Preconditions.checkNotNull(ac);
            int i;
            try
            {
                bitsPerChar = IntMath.log2(ac.length, RoundingMode.UNNECESSARY);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IllegalArgumentException((new StringBuilder("Illegal alphabet length ")).append(ac.length).toString(), s);
            }
            i = Math.min(8, Integer.lowestOneBit(bitsPerChar));
            charsPerChunk = 8 / i;
            bytesPerChunk = bitsPerChar / i;
            mask = ac.length - 1;
            s = new byte[128];
            Arrays.fill(s, (byte)-1);
            i = 0;
            while (i < ac.length) 
            {
                char c = ac[i];
                Preconditions.checkArgument(CharMatcher.ASCII.matches(c), "Non-ASCII character: %s", new Object[] {
                    Character.valueOf(c)
                });
                boolean flag;
                if (s[c] == -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "Duplicate character: %s", new Object[] {
                    Character.valueOf(c)
                });
                s[c] = (byte)i;
                i++;
            }
            decodabet = s;
            s = new boolean[charsPerChunk];
            for (int j = 0; j < bytesPerChunk; j++)
            {
                s[IntMath.divide(j << 3, bitsPerChar, RoundingMode.CEILING)] = 1;
            }

            validPadding = s;
        }
    }

    public static final class DecodingException extends IOException
    {

        DecodingException(String s)
        {
            super(s);
        }
    }

    static final class StandardBaseEncoding extends BaseEncoding
    {

        private final Alphabet alphabet;
        private final Character paddingChar;

        final GwtWorkarounds.ByteInput decodingStream(GwtWorkarounds.CharInput charinput)
        {
            Preconditions.checkNotNull(charinput);
            return charinput. new GwtWorkarounds.ByteInput() {

                int bitBuffer;
                int bitBufferLength;
                boolean hitPadding;
                final CharMatcher paddingMatcher;
                int readChars;
                final StandardBaseEncoding this$0;
                final GwtWorkarounds.CharInput val$reader;

                public final int read()
                    throws IOException
                {
                    byte byte0 = -1;
                    int i;
label0:
                    do
                    {
                        char c;
                        do
                        {
                            i = reader.read();
                            if (i == -1)
                            {
                                i = byte0;
                                if (!hitPadding)
                                {
                                    i = byte0;
                                    if (!alphabet.isValidPaddingStartPosition(readChars))
                                    {
                                        throw new DecodingException((new StringBuilder("Invalid input length ")).append(readChars).toString());
                                    }
                                }
                                break label0;
                            }
                            readChars = readChars + 1;
                            c = (char)i;
                            if (!paddingMatcher.matches(c))
                            {
                                break;
                            }
                            if (!hitPadding && (readChars == 1 || !alphabet.isValidPaddingStartPosition(readChars - 1)))
                            {
                                throw new DecodingException((new StringBuilder("Padding cannot start at index ")).append(readChars).toString());
                            }
                            hitPadding = true;
                        } while (true);
                        if (hitPadding)
                        {
                            throw new DecodingException((new StringBuilder("Expected padding character but found '")).append(c).append("' at index ").append(readChars).toString());
                        }
                        bitBuffer = bitBuffer << alphabet.bitsPerChar;
                        bitBuffer = bitBuffer | alphabet.decode(c);
                        bitBufferLength = bitBufferLength + alphabet.bitsPerChar;
                        if (bitBufferLength < 8)
                        {
                            continue;
                        }
                        bitBufferLength = bitBufferLength - 8;
                        i = bitBuffer >> bitBufferLength & 0xff;
                        break;
                    } while (true);
                    return i;
                }

            
            {
                this$0 = final_standardbaseencoding;
                reader = GwtWorkarounds.CharInput.this;
                super();
                bitBuffer = 0;
                bitBufferLength = 0;
                readChars = 0;
                hitPadding = false;
                paddingMatcher = padding();
            }
            };
        }

        final GwtWorkarounds.ByteOutput encodingStream(GwtWorkarounds.CharOutput charoutput)
        {
            Preconditions.checkNotNull(charoutput);
            return charoutput. new GwtWorkarounds.ByteOutput() {

                int bitBuffer;
                int bitBufferLength;
                final StandardBaseEncoding this$0;
                final GwtWorkarounds.CharOutput val$out;
                int writtenChars;

                public final void close()
                    throws IOException
                {
                    if (bitBufferLength > 0)
                    {
                        int i = bitBuffer;
                        int j = alphabet.bitsPerChar;
                        int k = bitBufferLength;
                        int l = alphabet.mask;
                        out.write(alphabet.encode(i << j - k & l));
                        writtenChars = writtenChars + 1;
                        if (paddingChar != null)
                        {
                            for (; writtenChars % alphabet.charsPerChunk != 0; writtenChars = writtenChars + 1)
                            {
                                out.write(paddingChar.charValue());
                            }

                        }
                    }
                    GwtWorkarounds.CharOutput charoutput = out;
                }

                public final void write(byte byte0)
                    throws IOException
                {
                    bitBuffer = bitBuffer << 8;
                    bitBuffer = bitBuffer | byte0 & 0xff;
                    for (bitBufferLength = bitBufferLength + 8; bitBufferLength >= alphabet.bitsPerChar; bitBufferLength = bitBufferLength - alphabet.bitsPerChar)
                    {
                        byte0 = bitBuffer;
                        int i = bitBufferLength;
                        int j = alphabet.bitsPerChar;
                        int k = alphabet.mask;
                        out.write(alphabet.encode(byte0 >> i - j & k));
                        writtenChars = writtenChars + 1;
                    }

                }

            
            {
                this$0 = final_standardbaseencoding;
                out = GwtWorkarounds.CharOutput.this;
                super();
                bitBuffer = 0;
                bitBufferLength = 0;
                writtenChars = 0;
            }
            };
        }

        final int maxDecodedSize(int i)
        {
            return (int)(((long)alphabet.bitsPerChar * (long)i + 7L) / 8L);
        }

        final int maxEncodedSize(int i)
        {
            return alphabet.charsPerChunk * IntMath.divide(i, alphabet.bytesPerChunk, RoundingMode.CEILING);
        }

        public final BaseEncoding omitPadding()
        {
            if (paddingChar == null)
            {
                return this;
            } else
            {
                return new StandardBaseEncoding(alphabet, null);
            }
        }

        final CharMatcher padding()
        {
            if (paddingChar == null)
            {
                return CharMatcher.NONE;
            } else
            {
                return CharMatcher.is(paddingChar.charValue());
            }
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder("BaseEncoding.");
            stringbuilder.append(alphabet.toString());
            if (8 % alphabet.bitsPerChar != 0)
            {
                if (paddingChar == null)
                {
                    stringbuilder.append(".omitPadding()");
                } else
                {
                    stringbuilder.append(".withPadChar(").append(paddingChar).append(')');
                }
            }
            return stringbuilder.toString();
        }



        private StandardBaseEncoding(Alphabet alphabet1, Character character)
        {
            alphabet = (Alphabet)Preconditions.checkNotNull(alphabet1);
            boolean flag;
            if (character == null || !alphabet1.matches(character.charValue()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Padding character %s was already in alphabet", new Object[] {
                character
            });
            paddingChar = character;
        }

        StandardBaseEncoding(String s, String s1, Character character)
        {
            this(new Alphabet(s, s1.toCharArray()), character);
        }
    }


    private static final BaseEncoding BASE16 = new StandardBaseEncoding("base16()", "0123456789ABCDEF", null);
    private static final BaseEncoding BASE32 = new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
    private static final BaseEncoding BASE32_HEX = new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
    private static final BaseEncoding BASE64 = new StandardBaseEncoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
    private static final BaseEncoding BASE64_URL = new StandardBaseEncoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));

    BaseEncoding()
    {
    }

    public static BaseEncoding base64()
    {
        return BASE64;
    }

    public static BaseEncoding base64Url()
    {
        return BASE64_URL;
    }

    private byte[] decodeChecked(CharSequence charsequence)
        throws DecodingException
    {
        byte abyte0[];
        int i;
        String s = padding().trimTrailingFrom(charsequence);
        charsequence = decodingStream(GwtWorkarounds.asCharInput(s));
        abyte0 = new byte[maxDecodedSize(s.length())];
        int j;
        try
        {
            j = charsequence.read();
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new AssertionError(charsequence);
        }
        i = 0;
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0[i] = (byte)j;
        j = charsequence.read();
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_41;
_L1:
        return extract(abyte0, i);
    }

    private String encode(byte abyte0[], int i, int j)
    {
        Preconditions.checkNotNull(abyte0);
        Preconditions.checkPositionIndexes(i, i + j, abyte0.length);
        GwtWorkarounds.CharOutput charoutput = GwtWorkarounds.stringBuilderOutput(maxEncodedSize(j));
        GwtWorkarounds.ByteOutput byteoutput = encodingStream(charoutput);
        int k = 0;
        while (k < j) 
        {
            try
            {
                byteoutput.write(abyte0[i + k]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new AssertionError("impossible");
            }
            k++;
        }
        byteoutput.close();
        return charoutput.toString();
    }

    private static byte[] extract(byte abyte0[], int i)
    {
        if (i == abyte0.length)
        {
            return abyte0;
        } else
        {
            byte abyte1[] = new byte[i];
            System.arraycopy(abyte0, 0, abyte1, 0, i);
            return abyte1;
        }
    }

    public final byte[] decode(CharSequence charsequence)
    {
        try
        {
            charsequence = decodeChecked(charsequence);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new IllegalArgumentException(charsequence);
        }
        return charsequence;
    }

    abstract GwtWorkarounds.ByteInput decodingStream(GwtWorkarounds.CharInput charinput);

    public final String encode(byte abyte0[])
    {
        return encode((byte[])Preconditions.checkNotNull(abyte0), 0, abyte0.length);
    }

    abstract GwtWorkarounds.ByteOutput encodingStream(GwtWorkarounds.CharOutput charoutput);

    abstract int maxDecodedSize(int i);

    abstract int maxEncodedSize(int i);

    public abstract BaseEncoding omitPadding();

    abstract CharMatcher padding();

}
