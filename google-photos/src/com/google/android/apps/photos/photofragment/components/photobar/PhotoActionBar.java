// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.photofragment.components.photobar;

import am;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import gyc;
import gyd;
import mry;
import msm;
import msn;
import nwm;
import olm;
import p;
import pwt;

public class PhotoActionBar extends LinearLayout
    implements android.view.View.OnClickListener
{

    public gyd a;

    public PhotoActionBar(Context context)
    {
        super(context);
    }

    public PhotoActionBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public PhotoActionBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void a(boolean flag, gyc gyc1)
    {
        View view = findViewById(gyc.a(gyc1));
        int i;
        if (flag && view == null)
        {
            gyc1 = ((ViewStub)findViewById(gyc.c(gyc1))).inflate().findViewById(gyc.a(gyc1));
            gyc1.setOnClickListener(this);
        } else
        {
            gyc1 = view;
        }
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        if (gyc1 != null)
        {
            ((View)gyc1.getParent()).setVisibility(i);
        }
    }

    public void onClick(View view)
    {
        if (a != null)
        {
            int i = view.getId();
            Object obj = (nwm)olm.b(getContext(), nwm);
            View view1;
            msn msn1;
            if (obj != null && ((nwm) (obj)).b() != null)
            {
                view1 = ((nwm) (obj)).b().R;
            } else
            {
                view1 = null;
            }
            msn1 = new msn();
            if (i == p.aa)
            {
                obj = pwt.v;
            } else
            if (i == p.ah)
            {
                obj = pwt.E;
            } else
            if (i == p.aj)
            {
                obj = pwt.r;
            } else
            if (i == p.Y)
            {
                obj = pwt.s;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder(32)).append("Unknown Button.  Id: ").append(i).toString());
            }
            obj = msn1.a(new msm(((msp) (obj))));
            if (view1 == null)
            {
                view1 = view;
            }
            obj = ((msn) (obj)).a(view1);
            mry.a(getContext(), 4, ((msn) (obj)));
            i = view.getId();
            if (i == p.aa)
            {
                a.a();
                return;
            }
            if (i == p.ah)
            {
                a.b();
                return;
            }
            if (i == p.Y)
            {
                a.d();
                return;
            }
            if (i == p.aj)
            {
                a.c();
                return;
            }
        }
    }
}
