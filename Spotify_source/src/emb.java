// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.mobile.android.spotlets.browse.model.Playable;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class emb extends LinearLayout
{

    public int a;
    public final gji b;
    public final eln c;
    public final FeatureIdentifier d;
    public final FeatureIdentifier e;
    private final elr f;

    public emb(Context context, int i, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1)
    {
        int j = 0;
        super(context);
        f = new elr(new elq(com.spotify.mobile.android.util.ClientEvent.SubEvent.K, ViewUri.r, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.i));
        c = new eln(new elq(com.spotify.mobile.android.util.ClientEvent.SubEvent.N, ViewUri.r, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.i));
        setOrientation(0);
        setBackgroundResource(0x7f020277);
        int k = getResources().getDimensionPixelSize(0x7f0c009c);
        setPadding(k, k, k, k);
        a = i;
        for (; j < i; j++)
        {
            addView(elt.a(getContext()), j);
        }

        dmz.a(gjj);
        b = gjj.a(context);
        d = featureidentifier;
        e = featureidentifier1;
    }

    static elr a(emb emb1)
    {
        return emb1.f;
    }

    // Unreferenced inner class emb$1

/* anonymous class */
    public final class _cls1
        implements android.view.View.OnClickListener
    {

        private Playlist a;
        private dlz b;

        public final void onClick(View view)
        {
            if (((Playable) (a)).d)
            {
                b.b();
                return;
            } else
            {
                b.a();
                return;
            }
        }

            public 
            {
                a = playlist;
                b = dlz1;
                super();
            }
    }


    // Unreferenced inner class emb$2

/* anonymous class */
    public final class _cls2
        implements android.view.View.OnClickListener
    {

        private int a;
        private String b;
        private String c;
        private String d;
        private emb e;

        public final void onClick(View view)
        {
            emb.a(e).a(e.getContext(), a, b, c, d);
        }

            public 
            {
                e = emb.this;
                a = i;
                b = s;
                c = s1;
                d = s2;
                super();
            }
    }

}
