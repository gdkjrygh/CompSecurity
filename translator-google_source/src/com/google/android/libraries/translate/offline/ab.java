// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;


// Referenced classes of package com.google.android.libraries.translate.offline:
//            PackageType

final class ab
{

    static final int a[];

    static 
    {
        a = new int[PackageType.values().length];
        try
        {
            a[PackageType.WORD_LENS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[PackageType.TRANSLATE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
