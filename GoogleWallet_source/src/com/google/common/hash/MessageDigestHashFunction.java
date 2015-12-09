// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.google.common.hash:
//            HashFunction, Hasher, AbstractByteHasher, HashCode

final class MessageDigestHashFunction extends HashFunction
    implements Serializable
{
    static final class MessageDigestHasher extends AbstractByteHasher
    {

        private final int bytes;
        private final MessageDigest digest;
        private boolean done;

        private void checkNotDone()
        {
            boolean flag;
            if (!done)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Cannot re-use a Hasher after calling hash() on it");
        }

        public final HashCode hash()
        {
            checkNotDone();
            done = true;
            if (bytes == digest.getDigestLength())
            {
                return HashCode.fromBytesNoCopy(digest.digest());
            } else
            {
                return HashCode.fromBytesNoCopy(MessageDigestHashFunction.copyOf(digest.digest(), bytes));
            }
        }

        protected final void update(byte byte0)
        {
            checkNotDone();
            digest.update(byte0);
        }

        protected final void update(byte abyte0[], int i, int j)
        {
            checkNotDone();
            digest.update(abyte0, i, j);
        }

        private MessageDigestHasher(MessageDigest messagedigest, int i)
        {
            digest = messagedigest;
            bytes = i;
        }

    }


    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone = supportsClone();
    private final String toString;

    MessageDigestHashFunction(String s, String s1)
    {
        prototype = getMessageDigest(s);
        bytes = prototype.getDigestLength();
        toString = (String)Preconditions.checkNotNull(s1);
    }

    private static byte[] copyOf(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, Math.min(i, abyte0.length));
        return abyte1;
    }

    private static MessageDigest getMessageDigest(String s)
    {
        try
        {
            s = MessageDigest.getInstance(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

    private boolean supportsClone()
    {
        try
        {
            prototype.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return false;
        }
        return true;
    }

    public final Hasher newHasher()
    {
        if (!supportsClone)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        MessageDigestHasher messagedigesthasher = new MessageDigestHasher((MessageDigest)prototype.clone(), bytes);
        return messagedigesthasher;
        CloneNotSupportedException clonenotsupportedexception;
        clonenotsupportedexception;
        return new MessageDigestHasher(getMessageDigest(prototype.getAlgorithm()), bytes);
    }

    public final String toString()
    {
        return toString;
    }

}
