// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;


// Referenced classes of package com.mopub.common.util:
//            Utils

final class c
{

    c()
    {
    }

    public final boolean hasFlag(Class class1, int i, int j)
    {
        return Utils.bitMaskContainsFlag(i, j);
    }
}
