// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class dor
{

    private static final Uri a = Uri.parse("content://com.google.android.apps.photos.allphotos.data.chapter");

    public static Uri a(int i)
    {
        return a.buildUpon().appendEncodedPath(String.valueOf(i)).build();
    }

}
