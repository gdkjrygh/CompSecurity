// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;
import android.util.Log;
import java.io.IOException;

final class bwb extends bxh
{

    private bvz a;

    transient bwb(bvz bvz1, bmb bmb, bxg abxg[])
    {
        a = bvz1;
        super(bmb, abxg);
    }

    public final void b()
    {
        bwl bwl1;
        android.net.Uri uri;
        bvz.b(a, (bwj)bvz.a(a).b);
        if (!bvz.a(a).b() || c.c.l == null || !c.c.n)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        if (!c.c.q)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        c.a(false);
        bwl1 = bvz.b(a);
        uri = c.c.l.d;
        bwl1.a();
        bwl1.d = new MediaPlayer();
        bwl1.d.setAudioStreamType(3);
        bwl1.d.setDataSource(bwl1.b, uri);
        bwl1.d.setOnPreparedListener(bwl1.c);
        bwl1.d.setOnErrorListener(bwl1.c);
        bwl1.d.setOnCompletionListener(bwl1.c);
        bwl1.d.prepareAsync();
        return;
        IOException ioexception;
        ioexception;
        Log.e(bwl.a, "Media player produced an exception.", ioexception);
        return;
        bvz.b(a).a();
        return;
    }
}
