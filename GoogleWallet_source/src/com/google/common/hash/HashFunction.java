// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;


// Referenced classes of package com.google.common.hash:
//            Hasher, HashCode

public abstract class HashFunction
{

    HashFunction()
    {
    }

    public HashCode hashUnencodedChars(CharSequence charsequence)
    {
        return newHasher().putUnencodedChars(charsequence).hash();
    }

    public abstract Hasher newHasher();
}
