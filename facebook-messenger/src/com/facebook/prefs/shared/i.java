// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.net.Uri;
import android.provider.BaseColumns;

final class i
    implements BaseColumns
{

    final Uri a;

    i(Uri uri)
    {
        a = Uri.withAppendedPath(uri, "prefs");
    }

    public Uri a()
    {
        return a;
    }
}
