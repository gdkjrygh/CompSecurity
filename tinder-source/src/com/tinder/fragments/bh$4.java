// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.res.Resources;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.tinder.activities.ActivityVerification;
import com.tinder.e.ar;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.fragments:
//            bh

final class a
    implements ar
{

    final bh a;

    public final void a()
    {
        bh.e(a).setVisibility(0);
        bh.e(a).setImageResource(0x7f02019c);
        if (a.getActivity() != null)
        {
            ((ActivityVerification)a.getActivity()).f();
            int i = a.getResources().getColor(0x7f0d0096);
            bh.c(a).setTextColor(i);
            bh.f(a).setColorFilter(i);
            ((ActivityVerification)a.getActivity()).g = false;
            bh.c(a).postDelayed(new Runnable() {

                final bh._cls4 a;

                public final void run()
                {
                    ((ActivityVerification)a.a.getActivity()).g();
                }

            
            {
                a = bh._cls4.this;
                super();
            }
            }, 200L);
            return;
        } else
        {
            v.a("Not doing shit, activity null");
            return;
        }
    }

    public final void b()
    {
        bh.e(a).setVisibility(0);
        bh.e(a).setImageResource(0x7f02019b);
        if (a.getActivity() != null)
        {
            ((ActivityVerification)a.getActivity()).f();
            int i = a.getResources().getColor(0x7f0d00fb);
            bh.c(a).setTextColor(i);
            bh.f(a).setColorFilter(null);
            Toast.makeText(a.getActivity(), 0x7f0600a8, 1).show();
            return;
        } else
        {
            v.a("Not doing shit, activity null");
            return;
        }
    }

    _cls1.a(bh bh1)
    {
        a = bh1;
        super();
    }
}
