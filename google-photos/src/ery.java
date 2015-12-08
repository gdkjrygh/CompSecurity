// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

public class ery
{

    final ContentResolver a;

    ery(Context context)
    {
        a = context.getContentResolver();
    }

    public static Uri a(int i, String s)
    {
        return erz.a(i, s);
    }
}
