// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import com.kik.android.a;
import com.kik.sdkutils.y;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, dh, di

final class dg
    implements rl.a
{

    final KikChatFragment a;

    dg(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(String s)
    {
        a.g.b("Suggested Response Unsupported Type").a("Type", s).b();
        a.a(KikChatFragment.ac(a));
    }

    public final void a(String s, View view)
    {
        KikChatFragment.ab(a);
        if ((a._suggestedRecyclerView.b() instanceof LinearLayoutManager) && y.a(11))
        {
            LinearLayoutManager linearlayoutmanager = (LinearLayoutManager)a._suggestedRecyclerView.b();
            AnimatorSet animatorset = new AnimatorSet();
            ArrayList arraylist = new ArrayList();
            for (int i = 0; i <= linearlayoutmanager.p(); i++)
            {
                View view1 = linearlayoutmanager.d(i);
                if (view1 != null && !view1.equals(view))
                {
                    arraylist.add(ObjectAnimator.ofFloat(view1, View.ALPHA, new float[] {
                        1.0F, 0.0F
                    }));
                }
            }

            animatorset.addListener(new dh(this, s));
            animatorset.setDuration(100L);
            animatorset.playTogether(arraylist);
            a.b(new di(this, animatorset));
            return;
        } else
        {
            kik.android.chat.fragment.KikChatFragment.a(a, s, kik.a.d.s.a.b);
            return;
        }
    }

    public final boolean a(MotionEvent motionevent, int i)
    {
        android.support.v7.widget.RecyclerView.i j = a._suggestedRecyclerView.b();
        if (j instanceof LinearLayoutManager)
        {
            int k = ((LinearLayoutManager)j).k();
            if (motionevent.getAction() == 0 && k > i)
            {
                a._suggestedRecyclerView.a(i);
            }
        }
        return false;
    }
}
