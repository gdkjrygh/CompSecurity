// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

public class eum
{

    private static final Uri a = Uri.parse("content://GPhotos/shared_photos");
    private final noz b;
    private final ContentResolver c;

    eum(Context context)
    {
        c = context.getContentResolver();
        b = noz.a(context, 2, "SharedMediaMonitor", new String[] {
            "sync", "perf"
        });
    }

    public static Uri a(int i)
    {
        return a(i, null);
    }

    public static Uri a(int i, String s)
    {
        android.net.Uri.Builder builder = a.buildUpon();
        if (s != null)
        {
            builder.appendEncodedPath(s);
        }
        return builder.appendEncodedPath(Integer.toString(i)).build();
    }

    public final void a(int i, String s, String s1)
    {
        if (b.a())
        {
            noy.a(i);
            noy.a("source", s);
            noy.a("collectionMediaKey", s1);
        }
        c.notifyChange(a(i, s1), null);
    }

}
