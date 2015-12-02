// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.c;

import android.net.Uri;
import android.provider.BaseColumns;

public final class l
    implements BaseColumns
{

    public static final Uri a = Uri.parse("content://sms");

    public l()
    {
    }

    public static boolean a(int i)
    {
        return i == 5 || i == 4 || i == 2 || i == 6;
    }

}
