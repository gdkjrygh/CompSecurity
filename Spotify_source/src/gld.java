// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class gld
    implements azh
{

    final azh a;
    final Handler b;
    boolean c;

    gld(azh azh1, Handler handler)
    {
        a = azh1;
        b = handler;
        c = false;
    }

    public final void a()
    {
    }

    public final void a(int i, int j, float f)
    {
        a.a(i, j, f);
    }

    public final void a(android.media.MediaCodec.CryptoException cryptoexception)
    {
        a.a(cryptoexception);
    }

    public final void a(com.google.android.exoplayer.MediaCodecTrackRenderer.DecoderInitializationException decoderinitializationexception)
    {
        a.a(decoderinitializationexception);
    }

    // Unreferenced inner class gld$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        private gld a;

        public final void run()
        {
            a.a.a();
        }

            
            {
                a = gld.this;
                super();
            }
    }

}
