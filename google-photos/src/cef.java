// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;

final class cef extends jjc
{

    private cec i;

    public cef(cec cec1, Context context, jjl jjl)
    {
        i = cec1;
        super(context, jjl, 1, 100L, new Handler(Looper.getMainLooper()), cec1, 0x7fffffff);
    }

    public final void a()
    {
        super.a();
        cec.g(i).b(cec.f(i));
    }

    protected final void a(MediaCodec mediacodec, String s, boolean flag, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        super.a(mediacodec, s, flag, mediaformat, mediacrypto);
        p.b(cec.g(i).a(cec.f(i)));
    }
}
