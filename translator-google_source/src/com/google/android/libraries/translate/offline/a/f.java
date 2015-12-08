// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;


final class f
{

    static final int a[];

    static 
    {
        a = new int[com.google.android.libraries.translate.offline.OfflinePackage.Status.values().length];
        try
        {
            a[com.google.android.libraries.translate.offline.OfflinePackage.Status.DOWNLOADED_POST_PROCESSED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[com.google.android.libraries.translate.offline.OfflinePackage.Status.ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.google.android.libraries.translate.offline.OfflinePackage.Status.AVAILABLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.google.android.libraries.translate.offline.OfflinePackage.Status.INPROGRESS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.android.libraries.translate.offline.OfflinePackage.Status.DOWNLOAD_NOT_STARTED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.libraries.translate.offline.OfflinePackage.Status.PAUSED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
