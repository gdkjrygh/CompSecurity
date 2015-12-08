// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.List;

public final class gwa
{

    Uri a;
    int b;
    int c;
    int d;
    boolean e;
    boolean f;
    boolean g;
    List h;
    android.graphics.Bitmap.Config i;
    com.squareup.picasso.Picasso.Priority j;

    gwa(Uri uri, int k, android.graphics.Bitmap.Config config)
    {
        a = uri;
        b = k;
        i = config;
    }

    public final gwa a(com.squareup.picasso.Picasso.Priority priority)
    {
        if (priority == null)
        {
            throw new IllegalArgumentException("Priority invalid.");
        }
        if (j != null)
        {
            throw new IllegalStateException("Priority already set.");
        } else
        {
            j = priority;
            return this;
        }
    }

    final boolean a()
    {
        return a != null || b != 0;
    }
}
