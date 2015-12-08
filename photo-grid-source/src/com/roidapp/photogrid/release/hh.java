// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.video.bj;
import com.roidapp.videolib.b.u;
import com.roidapp.videolib.core.e;
import com.roidapp.videolib.core.n;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            ht, ih, ng, hi, 
//            hj, PhotoGridActivity

public class hh extends ht
    implements android.widget.AdapterView.OnItemClickListener
{

    public static final String a = com/roidapp/photogrid/release/hh.getSimpleName();

    public hh()
    {
    }

    protected final void a()
    {
        e = new bj[u.k.ordinal()];
        e[u.a.ordinal()] = new bj(u.a, 0x7f0703cb, 0x7f0203c2, false);
        e[u.b.ordinal()] = new bj(u.b, 0x7f0703cd, 0x7f0203ca, PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("new_feature_video_transition_one_love", false));
        e[u.c.ordinal()] = new bj(u.c, 0x7f0703c6, 0x7f020420, false);
    }

    protected final int b()
    {
        return 0x7f0300c5;
    }

    protected final int c()
    {
        return 0x7f030134;
    }

    protected final void d()
    {
        u u1 = ih.C().ab();
        if (u1 == u.a || u1 == u.b || u1 == u.c)
        {
            f = e[u1.ordinal()].g.getId();
        } else
        {
            f = e[u.a.ordinal()].g.getId();
            u1 = u.a;
        }
        if (u1 != u.d)
        {
            e[u1.ordinal()].g.setSelected(true);
        }
        if (ng.a(getActivity()))
        {
            b(u.b.ordinal());
            b(u.c.ordinal());
            return;
        } else
        {
            e[u.b.ordinal()].g.setVisibility(8);
            e[u.c.ordinal()].g.setVisibility(8);
            return;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i = view.getId();
        try
        {
            if (f == i)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview)
        {
            return;
        }
        if (!e.a(u.values()[i]))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (!a(i))
        {
            an.a(new WeakReference(getActivity()), getString(0x7f0702f8, new Object[] {
                Integer.valueOf(e.c(u.values()[i]))
            }));
            return;
        }
        if (n.b(c))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (!n.a(c))
        {
            adapterview = new android.app.AlertDialog.Builder(c);
            adapterview.setTitle(0x7f0702e7);
            adapterview.setMessage(0x7f070134);
            adapterview.setNegativeButton(0x7f070049, new hi(this));
            adapterview.setPositiveButton(0x7f07027f, new hj(this));
            adapterview.show();
            return;
        }
        if (1 == n.c(c))
        {
            an.a(new WeakReference(getActivity()), getString(0x7f070048));
            return;
        }
        e[f].g.setSelected(false);
        f = i;
        e[f].g.setSelected(true);
        adapterview = u.values()[i];
        if (adapterview != u.b) goto _L2; else goto _L1
_L1:
        if (e[i].f.isShown())
        {
            e[i].f.setVisibility(8);
            PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putBoolean("new_feature_video_transition_one_love", false).apply();
        }
        c.f(false);
_L3:
        if (d != null)
        {
            d.a(adapterview);
        }
        ((PhotoGridActivity)getActivity()).G();
        return;
_L2:
label0:
        {
            if (adapterview != u.c)
            {
                break label0;
            }
            if (e[i].f.isShown())
            {
                e[i].f.setVisibility(8);
            }
            c.f(false);
        }
          goto _L3
        c.f(true);
          goto _L3
    }

}
