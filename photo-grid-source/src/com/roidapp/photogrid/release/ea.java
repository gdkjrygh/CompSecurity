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
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk, PhotoGridActivity, ei, dz, 
//            hh, ng, ih, ig, 
//            el, ev, ht, by, 
//            ck, ej, cg

final class ea
    implements android.widget.AdapterView.OnItemClickListener
{

    final dk a;

    ea(dk dk1)
    {
        a = dk1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j;
        boolean flag;
        boolean flag2;
        flag2 = true;
        flag = true;
        i = 0;
        if (dk.b(a).i)
        {
            return;
        }
        if (dk.c(a) == view.getId())
        {
            dk.b(a).a(dk.b(a).k);
            if (dk.d(a) != null)
            {
                dk.d(a).setSelected(false);
                dk.a(a, null);
            }
            dk.a(a, -1);
            return;
        }
        j = ei.a()[view.getId()];
        dz.a[j - 1];
        JVM INSTR tableswitch 3 8: default 152
    //                   3 426
    //                   4 278
    //                   5 315
    //                   6 152
    //                   7 352
    //                   8 389;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L6
_L1:
        if (dk.d(a) != null)
        {
            dk.d(a).setSelected(false);
        }
        dk.a(a, dk.b(a, j));
        dk.d(a).setSelected(true);
        dz.a[j - 1];
        JVM INSTR tableswitch 1 10: default 264
    //                   1 655
    //                   2 766
    //                   3 824
    //                   4 915
    //                   5 959
    //                   6 1041
    //                   7 1153
    //                   8 994
    //                   9 463
    //                   10 576;
           goto _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L7:
        break; /* Loop/switch isn't completed */
_L14:
        break MISSING_BLOCK_LABEL_1153;
_L18:
        if (i != 0)
        {
            dk.a(a, -1);
            return;
        } else
        {
            dk.a(a, view.getId());
            return;
        }
_L3:
        if (dk.e(a))
        {
            an.a(new WeakReference(dk.b(a)), a.getString(0x7f0701fc));
            return;
        }
          goto _L1
_L4:
        if (dk.e(a))
        {
            an.a(new WeakReference(dk.b(a)), a.getString(0x7f0701ff));
            return;
        }
          goto _L1
_L5:
        if (dk.e(a))
        {
            an.a(new WeakReference(dk.b(a)), a.getString(0x7f0703ba));
            return;
        }
          goto _L1
_L6:
        if (dk.e(a))
        {
            an.a(new WeakReference(dk.b(a)), a.getString(0x7f070204));
            return;
        }
          goto _L1
_L2:
        if (dk.e(a))
        {
            an.a(new WeakReference(dk.b(a)), a.getString(0x7f070206));
            return;
        }
          goto _L1
_L16:
        dk.b(a);
        if (PhotoGridActivity.j() < 2)
        {
            an.c(new WeakReference(a.getActivity()), a.getString(0x7f070320));
            dk.d(a).setSelected(false);
        } else
        {
            dk.b(a).a(0x7f0d03ec, new hh(), hh.a);
            adapterview = dk.b(a);
            if (!dk.e(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            adapterview.f(flag);
        }
          goto _L18
_L17:
        int k = dk.f(a).p();
        adapterview = ih.C().M();
        if (adapterview != null && k >= 0 && k < adapterview.length)
        {
            if (((ig) (adapterview[k])).e != null)
            {
                dk.g(a);
            } else
            {
                dk.h(a);
            }
        } else
        {
            dk.d(a).setSelected(false);
        }
          goto _L18
_L8:
        if (ih.C().ar() == null)
        {
            dk.c(a, dk.c(a));
            dk.d(a).setSelected(false);
            dk.a(a, -1);
            dk.i(a);
            i = 1;
        } else
        {
            dk.b(a).a(0x7f0d03ec, new el(), "fragmentEditVideoPopupMusic");
            i = 0;
        }
        adapterview = dk.b(a);
        if (dk.e(a))
        {
            flag = false;
        }
        adapterview.f(flag);
          goto _L18
_L9:
        dk.b(a).a(0x7f0d03ec, new ev(), "fragmentEditVideoPopupTime");
        adapterview = dk.b(a);
        boolean flag1;
        if (!dk.e(a))
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        adapterview.f(flag1);
          goto _L18
_L10:
        dk.b(a);
        if (PhotoGridActivity.j() < 2)
        {
            an.c(new WeakReference(a.getActivity()), a.getString(0x7f070320));
            dk.d(a).setSelected(false);
        } else
        {
            dk.b(a).a(0x7f0d03ec, new ht(), ht.b);
            dk.b(a).f(true);
        }
          goto _L18
_L11:
        adapterview = new by();
        adapterview.a(true, false, 0);
        dk.b(a).a(0x7f0d03ec, adapterview, "FragmentBgList");
        dk.b(a).f(true);
          goto _L18
_L12:
        dk.b(a).a(0x7f0d03ec, new ck(), "FragmentBorder");
        dk.b(a).f(true);
          goto _L18
_L15:
        dk.c(a, dk.c(a));
        dk.f(a).a(false, false);
        dk.b(a).f(true);
        dk.j(a);
          goto _L18
_L13:
        if (PreferenceManager.getDefaultSharedPreferences(a.getActivity()).getBoolean("new_feature_video_entry", true))
        {
            PreferenceManager.getDefaultSharedPreferences(a.getActivity()).edit().putBoolean("new_feature_video_entry", false).apply();
            adapterview = (ImageView)dk.d(a).findViewById(0x7f0d031d);
            if (adapterview != null)
            {
                adapterview.setVisibility(8);
            }
        }
        adapterview = new ej();
        dk.b(a).a(0x7f0d03ec, adapterview, "FragmentEditVideoFilter");
        dk.b(a).f(true);
          goto _L18
        if (PreferenceManager.getDefaultSharedPreferences(a.getActivity()).getBoolean("new_feature_video_blur_entry", true))
        {
            PreferenceManager.getDefaultSharedPreferences(a.getActivity()).edit().putBoolean("new_feature_video_blur_entry", false).apply();
            adapterview = (ImageView)dk.d(a).findViewById(0x7f0d031d);
            if (adapterview != null)
            {
                adapterview.setVisibility(8);
            }
        }
        dk.f(a).c(ih.C().ag(), true);
        adapterview = new cg();
        dk.b(a).a(0x7f0d03ec, adapterview, "FragmentBlur");
        dk.b(a).f(true);
          goto _L18
    }
}
