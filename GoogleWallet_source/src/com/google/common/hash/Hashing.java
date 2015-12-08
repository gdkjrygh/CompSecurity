// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;


// Referenced classes of package com.google.common.hash:
//            HashFunction, MessageDigestHashFunction

public final class Hashing
{
    static final class Md5Holder
    {

        static final HashFunction MD5 = new MessageDigestHashFunction("MD5", "Hashing.md5()");

    }

    static final class Sha1Holder
    {

        static final HashFunction SHA_1 = new MessageDigestHashFunction("SHA-1", "Hashing.sha1()");

    }


    private static final int GOOD_FAST_HASH_SEED = (int)System.currentTimeMillis();

    public static HashFunction md5()
    {
        return Md5Holder.MD5;
    }

    public static HashFunction sha1()
    {
        return Sha1Holder.SHA_1;
    }

}
