// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import android.database.Cursor;

public final class d
{

    public static final String a(Cursor cursor, String s)
    {
        return cursor.getString(cursor.getColumnIndexOrThrow(s));
    }
}
