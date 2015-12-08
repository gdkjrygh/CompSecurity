// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;

final class bgy extends jjc
{

    private bgv i;

    public bgy(bgv bgv1, Context context, jjl jjl)
    {
        i = bgv1;
        super(context, jjl, 1, 100L, new Handler(Looper.getMainLooper()), bgv1, 0x7fffffff);
    }

    public final void a()
    {
        super.a();
        bgv.f(i).b(bgv.e(i));
    }

    protected final void a(MediaCodec mediacodec, String s, boolean flag, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        super.a(mediacodec, s, flag, mediaformat, mediacrypto);
        p.b(bgv.f(i).a(bgv.e(i)));
    }
}
