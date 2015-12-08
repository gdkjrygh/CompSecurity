// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;


// Referenced classes of package com.google.android.libraries.translate.offline:
//            PackageType

final class u
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[PackageType.values().length];
        try
        {
            b[PackageType.TRANSLATE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[PackageType.WORD_LENS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[OfflinePackage.Status.values().length];
        try
        {
            a[OfflinePackage.Status.DOWNLOADED_POST_PROCESSED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[OfflinePackage.Status.ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[OfflinePackage.Status.AVAILABLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
