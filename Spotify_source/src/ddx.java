// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Set;

public final class ddx
    implements ddv
{

    ProgressBar a;
    private deb b;
    private ddz c;
    private ddy d;
    private dea e;
    private final Handler f = new Handler();
    private Set g;
    private Runnable h;

    public ddx(Context context, deh deh1, Picasso picasso, String s, Set set)
    {
        h = new Runnable() {

            private ddx a;

            public final void run()
            {
                a.a.setVisibility(0);
            }

            
            {
                a = ddx.this;
                super();
            }
        };
        g = set;
        e = new dea(context);
        b = new deb(context);
        c = new ddz(b, picasso);
        d = new ddy(context, b, s);
        a = b.f;
        a(deh1);
    }

    public final LinearLayout a()
    {
        return b.b;
    }

    public final void a(deh deh1)
    {
        Object obj1 = c;
        String s = deh1.a;
        Object obj = deh1.c;
        Object obj2 = deh1.d;
        Object obj4 = deh1.e;
        boolean flag1 = deh1.f;
        com.spotify.android.paste.graphics.SpotifyIcon spotifyicon = deh1.g;
        ImageView imageview;
        byte byte0;
        if (((ddz) (obj1)).c == null)
        {
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = ((ddz) (obj1)).a;
                obj = dcx.a(((Context) (obj))).a(((Context) (obj)));
            } else
            {
                obj = dcx.b(((ddz) (obj1)).a);
            }
            obj1.c = ((dcw) (obj));
            ((ddz) (obj1)).b.addView(((ddz) (obj1)).c.a());
        }
        obj = ((ddz) (obj1)).c;
        imageview = ((dcw) (obj)).c();
        obj4 = ((ddz) (obj1)).e.a(((android.net.Uri) (obj4)));
        ((gwb) (obj4)).a(dff.a(((ddz) (obj1)).a, spotifyicon));
        if (flag1)
        {
            ((gwb) (obj4)).a(gft.a(imageview));
        } else
        {
            ((gwb) (obj4)).a(imageview, null);
        }
        if (!flag1)
        {
            imageview.setBackgroundColor(((ddz) (obj1)).d);
        }
        ((dcw) (obj)).a(s);
        ((dcw) (obj)).b(((String) (obj2)));
        obj1 = d;
        s = deh1.i;
        obj = deh1.j;
        obj2 = ((ddy) (obj1)).a;
        if (TextUtils.isEmpty(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((TextView) (obj2)).setVisibility(byte0);
        ((ddy) (obj1)).a.setText(s);
        ((ddy) (obj1)).a();
        obj1 = ((ddy) (obj1)).c.g;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((TextView) (obj1)).setVisibility(byte0);
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
        if (deh1.l)
        {
            a.setVisibility(4);
            f.postDelayed(h, 200L);
        } else
        {
            f.removeCallbacks(h);
            a.setVisibility(8);
            LinearLayout linearlayout = b.h;
            linearlayout.removeAllViews();
            List list = deh1.k;
            int i = 0;
            while (i < list.size()) 
            {
                list.size();
                dei dei1 = (dei)list.get(i);
                Object obj3;
                CharSequence charsequence;
                ddu ddu1;
                boolean flag;
                boolean flag2;
                if (!deh1.m && g.contains(Integer.valueOf(dei1.a)))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj3 = e;
                charsequence = dei1.c;
                ddu1 = new ddu(LayoutInflater.from(((dea) (obj3)).a).inflate(0x7f0300ba, linearlayout, false));
                dcq.a(ddu1);
                ddu1.a(charsequence);
                ddu1.a().setLayoutParams(((dea) (obj3)).b);
                obj3 = ddu1.a();
                ((View) (obj3)).setOnClickListener(dei1.e);
                if (dei1.d && !flag)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                ((View) (obj3)).setEnabled(flag2);
                linearlayout.addView(((View) (obj3)));
                i++;
            }
        }
    }

    public final void b()
    {
        ddy ddy1 = d;
        if (ddy1.a != null)
        {
            gcg.a(ddy1.a.getViewTreeObserver(), ddy1.d);
        }
    }
}
