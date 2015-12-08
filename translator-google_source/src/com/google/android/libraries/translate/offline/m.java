// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;


// Referenced classes of package com.google.android.libraries.translate.offline:
//            PackageType

final class m
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[OfflinePackage.Status.values().length];
        try
        {
            b[OfflinePackage.Status.DOWNLOADED_POST_PROCESSED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            b[OfflinePackage.Status.ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            b[OfflinePackage.Status.AVAILABLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[OfflinePackage.Status.DOWNLOADED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[OfflinePackage.Status.REMOVED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[OfflinePackage.Status.PAUSED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[OfflinePackage.Status.INPROGRESS.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            b[OfflinePackage.Status.DOWNLOAD_NOT_STARTED.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
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
