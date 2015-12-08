// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;

public class ecb
    implements dmx
{

    private final Uri a;

    public ecb(Context context)
    {
        a = Uri.parse((new StringBuilder("content://")).append(context.getString(0x7f08064e)).toString());
    }

    public final Uri a(Uri uri)
    {
        if (uri == null)
        {
            return null;
        } else
        {
            return a.buildUpon().encodedPath(uri.getEncodedPath()).build();
        }
    }
}
