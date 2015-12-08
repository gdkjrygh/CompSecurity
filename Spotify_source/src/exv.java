// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;

public class exv
    implements dmx
{

    public final gcz a;

    public exv(gcz gcz1)
    {
        a = gcz1;
    }

    public final void a(Verified verified, String s)
    {
        s = ClientEventFactory.a(s, com.spotify.mobile.android.util.ClientEvent.SubEvent.X, null, null);
        s.a("installation_id", a.f());
        fop.a(verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.A, s);
    }

    public final void a(Verified verified, String s, int i)
    {
        s = ClientEventFactory.a(Uri.parse(s), i);
        s.a("installation_id", a.f());
        fop.a(verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.A, s);
    }
}
