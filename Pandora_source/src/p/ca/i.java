// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.pandora.android.activity.a;
import com.pandora.android.util.ae;
import com.pandora.android.util.af;
import com.pandora.android.util.p;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ag;
import com.pandora.radio.util.k;
import p.dd.bh;
import p.l.c;
import p.l.d;
import p.l.g;
import p.l.j;
import p.s.b;

// Referenced classes of package p.ca:
//            o

public class i extends o
{

    private ImageView a;
    private View b;
    private ImageButton c;
    private aa d;
    private final android.view.View.OnClickListener e = new android.view.View.OnClickListener() {

        final i a;

        public void onClick(View view)
        {
            com.pandora.android.activity.a.a(a.getActivity(), p.ca.i.a(a));
        }

            
            {
                a = i.this;
                super();
            }
    };

    public i()
    {
    }

    static aa a(i k)
    {
        return k.d;
    }

    private void e()
    {
        g.a(this).a(d.v()).a(b.c).a(0x7f0200e9).a(a);
    }

    public boolean e_()
    {
        return false;
    }

    public boolean f_()
    {
        return false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        j = layoutinflater.inflate(0x7f040028, viewgroup, false);
        b = b(0x7f1000b0);
        layoutinflater = getArguments();
        d = (aa)layoutinflater.getSerializable("intent_track_data");
        boolean flag = layoutinflater.getBoolean("intent_advertiser_station", false);
        layoutinflater = b;
        int k;
        if (!flag && d.M())
        {
            k = 0;
        } else
        {
            k = 8;
        }
        layoutinflater.setVisibility(k);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            final i a;

            public void onClick(View view)
            {
                view = af.a().b();
                if (view != com.pandora.android.util.af.c.aa)
                {
                    view = ((com.pandora.android.util.af.c) (view)).ab.O;
                    if (view == null)
                    {
                        return;
                    }
                    com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.a.c, view, null, new com.pandora.radio.data.b());
                }
                com.pandora.android.activity.a.a(a.getActivity(), a.k.a(), null, a.k.b());
            }

            
            {
                a = i.this;
                super();
            }
        });
        layoutinflater = com.pandora.android.provider.b.a.b().k().G();
        if (layoutinflater != null)
        {
            ((TextView)b(0x7f1000e2)).setText(Html.fromHtml(layoutinflater));
        }
        c = (ImageButton)b(0x7f1000e1);
        c.setOnClickListener(new android.view.View.OnClickListener() {

            final i a;

            public void onClick(View view)
            {
                com.pandora.android.provider.b.a.b().d().b();
            }

            
            {
                a = i.this;
                super();
            }
        });
        a = (ImageView)b(0x7f1000e0);
        a.setOnClickListener(e);
        a.setClickable(d.M());
        e();
        return j;
    }

    public void onTrackState(bh bh1)
    {
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.bh.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        p.ca._cls4.a[bh1.a.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 37
    //                   3 81;
           goto _L1 _L2 _L2 _L3
_L1:
        return;
_L2:
        if (c != null)
        {
            boolean flag;
            if (!com.pandora.android.provider.b.a.b().d().o())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ae.a(flag, c, 0x7f020236, 0x7f020233);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (bh1.b != null)
        {
            if (!bh1.b.M())
            {
                k.a(-1);
                return;
            }
            if (!bh1.b.equals(d))
            {
                d = bh1.b;
                e();
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
