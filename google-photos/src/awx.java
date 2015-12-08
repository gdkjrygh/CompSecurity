// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Handler;

final class awx extends azf
{

    final int a;
    Bitmap b;
    private final Handler c;
    private final long d;

    awx(Handler handler, int i, long l)
    {
        c = handler;
        a = i;
        d = l;
    }

    public final void a(Object obj, azp azp)
    {
        b = (Bitmap)obj;
        obj = c.obtainMessage(1, this);
        c.sendMessageAtTime(((android.os.Message) (obj)), d);
    }
}
