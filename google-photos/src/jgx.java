// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaPlayer;

public final class jgx extends Enum
    implements jhg
{

    public static final jgx a;
    private static final jgx b[];

    private jgx(String s, int i)
    {
        super(s, 0);
    }

    public static jgx valueOf(String s)
    {
        return (jgx)Enum.valueOf(jgx, s);
    }

    public static jgx[] values()
    {
        return (jgx[])b.clone();
    }

    public final void a()
    {
    }

    public final void a(jfq jfq)
    {
    }

    public final void a(boolean flag)
    {
    }

    public final boolean a(Canvas canvas)
    {
        return false;
    }

    public final void b()
    {
    }

    public final void c()
    {
    }

    public final void d()
    {
    }

    public final boolean e()
    {
        return false;
    }

    public final void f()
    {
    }

    public final Bitmap g()
    {
        return null;
    }

    public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
    }

    static 
    {
        a = new jgx("INSTANCE", 0);
        b = (new jgx[] {
            a
        });
    }
}
