// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class ang.Object
    implements eby
{

    private int a;
    private int b;
    private int c;
    private ehe d;

    public final void a(Uri uri)
    {
        String.valueOf(uri);
        ehe.a(d).a(c, new com.spotify.mobile.android.spotlets.appprotocol.model.tocol.Message(String.format("Failed to load image %s", new Object[] {
            uri.toString()
        })), "wamp.error");
    }

    public final void a(Uri uri, byte abyte0[])
    {
        uri = new com.spotify.mobile.android.spotlets.appprotocol.model.tocol.Image(abyte0, a, b);
        ehe.a(d).a(c, uri);
    }

    (ehe ehe1, int i, int j, int k)
    {
        d = ehe1;
        a = i;
        b = j;
        c = k;
        super();
    }
}
