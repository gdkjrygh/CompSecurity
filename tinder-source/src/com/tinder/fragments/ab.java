// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.activities.ActivityMain;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.d;
import com.tinder.e.au;
import com.tinder.views.CustomActionBar;
import com.tinder.views.LoadingView;
import java.util.Queue;

// Referenced classes of package com.tinder.fragments:
//            by

public class ab extends d
    implements by
{

    private LoadingView c;

    public ab()
    {
    }

    static LoadingView a(ab ab1)
    {
        return ab1.c;
    }

    public int a()
    {
        return 0x7f0600c7;
    }

    public String e()
    {
        return "FRAGMENT_LOADING";
    }

    public void onAttach(Context context)
    {
        super.onAttach(context);
        context = new Runnable() {

            final ab a;

            public final void run()
            {
                if (ab.a(a) != null)
                {
                    ab.a(a).refreshProfileAvatarImage();
                    ab.a(a).setLoadingText(a.a());
                    ab.a(a).animateAvatarIn(new au(this) {

                        final _cls1 a;

                        public final void onAnimationEnd(Animator animator)
                        {
                            if (a.a.getActivity() != null)
                            {
                                ((ActivityMain)a.a.getActivity()).G();
                            }
                            ab.a(a.a).startAllPingAnimations();
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }
            }

            
            {
                a = ab.this;
                super();
            }
        };
        if (super.a)
        {
            context.run();
            return;
        } else
        {
            super.b.add(context);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (getActivity() instanceof ActivityMain)
        {
            ((ActivitySignedInBase)getActivity()).H().setMenu(this);
        }
        return layoutinflater.inflate(0x7f030098, viewgroup, false);
    }

    public void onResume()
    {
        super.onResume();
        c.refreshProfileAvatarImage();
        c.setLoadingText(a());
        c.animateAvatarIn(new au() {

            final ab a;

            public final void onAnimationEnd(Animator animator)
            {
                try
                {
                    ((ActivityMain)a.getActivity()).G();
                }
                // Misplaced declaration of an exception variable
                catch (Animator animator) { }
                ab.a(a).startAllPingAnimations();
            }

            
            {
                a = ab.this;
                super();
            }
        });
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        c = (LoadingView)view.findViewById(0x7f0e0294);
    }
}
