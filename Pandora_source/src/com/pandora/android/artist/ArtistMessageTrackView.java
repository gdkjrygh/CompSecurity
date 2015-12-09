// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.artist;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pandora.android.util.s;
import com.pandora.android.view.TrackView;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.c;

// Referenced classes of package com.pandora.android.artist:
//            a

public class ArtistMessageTrackView extends TrackView
    implements android.view.View.OnClickListener, android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private TextView f;
    private View g;

    public ArtistMessageTrackView(Context context)
    {
        super(context);
    }

    public static ArtistMessageTrackView a(Context context, aa aa1)
    {
        if (aa1 == null || aa1.l() != ac.c)
        {
            throw new IllegalArgumentException("Arguments must be non-null and must be an ArtistMessage trackDataType");
        } else
        {
            return new ArtistMessageTrackView(context);
        }
    }

    private void l()
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            getViewTreeObserver().removeGlobalOnLayoutListener(this);
            return;
        } else
        {
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
            return;
        }
    }

    protected void a()
    {
        super.a();
        f = (TextView)findViewById(0x7f1000db);
        g = findViewById(0x7f1000d9);
    }

    public void a(aa aa1, String s1, String s2)
    {
        super.a(aa1, s1, s2);
        aa1 = (c)getTrackData();
        boolean flag = aa1.r_();
        s1 = f;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        s1.setVisibility(i);
        if (aa1.r_())
        {
            f.setText(aa1.d());
            f.setOnClickListener(this);
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public boolean c()
    {
        return false;
    }

    protected void g_()
    {
        super.g_();
        c c1 = (c)getTrackData();
        TextView textview = getTitle();
        String s1 = c1.g();
        textview.setText(Html.fromHtml(s1));
        if (!s.a(s1))
        {
            textview.setOnClickListener(this);
        }
        getArtist().setText(c1.t());
    }

    protected int getLayoutResId()
    {
        return 0x7f040027;
    }

    public void onClick(View view)
    {
        c c1 = (c)getTrackData();
        int i = view.getId();
        if (i == 0x7f1000db)
        {
            if (c1.r_())
            {
                com.pandora.android.artist.a.a(c1, a.a.e);
                com.pandora.android.artist.a.b(getContext(), c1);
            }
        } else
        if (i == getTitle().getId())
        {
            s.a(c1.q_(), c1.b(), getContext().getResources().getString(0x7f0800a3));
            return;
        }
    }

    public void onGlobalLayout()
    {
        l();
        if (g != null)
        {
            g.getLayoutParams().height = Math.min(getAlbumArt().getWidth(), getAlbumArt().getHeight());
        }
        if (android.os.Build.VERSION.SDK_INT <= 19)
        {
            LinearLayout linearlayout = (LinearLayout)findViewById(0x7f1000dc);
            if (linearlayout != null)
            {
                linearlayout.getLayoutParams().width = getAlbumArt().getWidth();
            }
        }
    }
}
