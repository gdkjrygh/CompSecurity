// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class jfo
    implements mti, omb, ooi, opv
{

    public final List a = new ArrayList();
    public jfn b;
    public mtj c;
    public nal d;
    public mmr e;
    private final ar f;

    public jfo(Activity activity)
    {
        p.a(activity instanceof ar, "Can only bind MediaPlayerProvider to FragmentActivity to preserve during rotation.");
        p.a(activity instanceof opc, "Can only bind MediaPlayerProvider to Activity that has a lifecycle.");
        f = (ar)activity;
        ((opc)activity).x_().a(this);
    }

    public final jfq a(Uri uri)
    {
        jfn jfn1 = b;
        if (jfn1.a(uri))
        {
            return jfn1.a;
        } else
        {
            return null;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mtj)olm1.a(mtj);
        c.a(this);
        d = (nal)olm1.a(nal);
        e = (mmr)olm1.a(mmr);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        boolean flag = false;
        if ("com.google.android.apps.photos.httpauth.LoadAuthHeadersTask".equals(s) && mue1 != null && !mue1.c())
        {
            p.a(mue1);
            boolean flag1;
            if (!mue1.c())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            p.a(flag1);
            s = (Map)mue1.a().getSerializable("extra_headers");
            for (mue1 = a.iterator(); mue1.hasNext(); a((jfq)mue1.next(), ((Map) (s)))) { }
            a.clear();
        } else
        if ("com.google.android.apps.photos.videoplayer.InitializeMediaPlayerHeadersTask".equals(s) && mue1 != null)
        {
            s = (Uri)mue1.a().getParcelable("com.google.android.apps.photos.videoplayer.InitHeaderTask.URI");
            if (!mue1.c())
            {
                flag = true;
            }
            s = a(((Uri) (s)));
            if (s != null)
            {
                if (!flag)
                {
                    s.onError(((jfq) (s)).a, 1, 1);
                    return;
                }
                if (s.h())
                {
                    s.a();
                    return;
                }
            }
        }
    }

    public void a(jfq jfq1, Map map)
    {
        c.a(new jfm(jfq1, map));
    }

    public final void b_(Bundle bundle)
    {
        b = (jfn)f.c().a("media_player_holder");
        if (b == null)
        {
            b = new jfn();
            f.c().a().a(b, "media_player_holder").c();
        }
    }
}
