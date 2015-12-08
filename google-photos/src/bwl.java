// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaPlayer;

public class bwl
{

    static final String a = bwl.getSimpleName();
    final Context b;
    final bwm c = new bwm(this);
    MediaPlayer d;

    public bwl(Context context)
    {
        b = (Context)b.a(context, "context", null);
    }

    static String b()
    {
        return a;
    }

    public final void a()
    {
        if (d != null)
        {
            d.release();
            d = null;
        }
    }

}
