// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengesFragment

public final class ChallengesFragment_ extends ChallengesFragment
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Bundle a;

        public ChallengesFragment a()
        {
            ChallengesFragment_ challengesfragment_ = new ChallengesFragment_();
            challengesfragment_.setArguments(a);
            return challengesfragment_;
        }

        private a()
        {
            a = new Bundle();
        }

    }


    private final c k = new c();
    private View l;

    public ChallengesFragment_()
    {
    }

    private void a(Bundle bundle)
    {
        c.a(this);
    }

    public static a e()
    {
        return new a();
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        j = a1.findViewById(0x7f1100a4);
        h = a1.findViewById(0x1020002);
        g = (TextView)a1.findViewById(0x1020004);
        b = a1.findViewById(0x102000d);
        c = (Button)a1.findViewById(0x7f1103d5);
        b = a1.findViewById(0x102000d);
        d = (ProgressBar)a1.findViewById(0x7f11009b);
        a = (StickyListHeadersListView)a1.findViewById(0x7f110086);
        a1 = a1.findViewById(0x7f1103d5);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final ChallengesFragment_ a;

                public void onClick(View view)
                {
                    a.a();
                }

            
            {
                a = ChallengesFragment_.this;
                super();
            }
            });
        }
        f();
        c();
    }

    public View findViewById(int i)
    {
        if (l == null)
        {
            return null;
        } else
        {
            return l.findViewById(i);
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(k);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        l = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (l == null)
        {
            l = layoutinflater.inflate(0x7f04008f, viewgroup, false);
        }
        return l;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        k.a(this);
    }
}
