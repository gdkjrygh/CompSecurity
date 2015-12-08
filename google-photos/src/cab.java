// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class cab
    implements android.media.MediaScannerConnection.OnScanCompletedListener
{

    private bzv a;

    cab(bzv bzv1)
    {
        a = bzv1;
        super();
    }

    public final void onScanCompleted(String s, Uri uri)
    {
        s = bzv.j(a);
        c.a(((bww) (s)).b.G.e, "mPersistentState.isVideoRendering()");
        long l = ((bww) (s)).b.K;
        bzv.a(a, uri, l);
        bzv.a(a, uri);
    }
}
