// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.fitbit.data.bl.ChallengesUtils;
import com.fitbit.data.domain.challenges.Challenge;
import java.util.List;
import se.emilsjolander.stickylistheaders.h;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengesFragment, ChallengeHeaderView, ChallengePlaceholderView, ChallengeItemView, 
//            ChallengeTypeContainerView

class h extends BaseAdapter
    implements h
{

    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    private static final long i = 0L;
    private static final long j = 1L;
    private static final long k = 2L;
    protected Context a;
    final ChallengesFragment e;
    private c f;
    private boolean g;
    private int h;

    private List c(int l)
    {
        l = d(l);
        int i1 = h;
        int j1 = a(f).size();
        int k1 = h;
        k1 = Math.max(0, Math.min(((l + 1) - a(f).size()) * k1, b(f).size()));
        return b(f).subList(i1 * (l - j1), k1);
    }

    private int d(int l)
    {
        int i1 = l;
        if (b())
        {
            i1 = l - 1;
        }
        return i1;
    }

    public int a()
    {
        return h;
    }

    public long a(int l)
    {
label0:
        {
            long l1 = 2L;
            if (!b())
            {
                if (getItemViewType(l) != 0)
                {
                    break label0;
                }
                l1 = 0L;
            }
            return l1;
        }
        return 1L;
    }

    public View a(int l, View view, ViewGroup viewgroup)
    {
        long l1 = a(l);
        if (view == null)
        {
            if (l1 == 2L)
            {
                view = new View(e.getActivity());
            } else
            {
                view = ChallengeHeaderView.a(e.getActivity());
            }
        }
        if (l1 != 2L)
        {
            viewgroup = (ChallengeHeaderView)view;
            ChallengesFragment challengesfragment = e;
            if (l1 == 0L)
            {
                l = 0x7f0802cb;
            } else
            {
                l = 0x7f0802c9;
            }
            viewgroup.a(challengesfragment.getString(l).toUpperCase());
        }
        return view;
    }

    public void a(tString tstring)
    {
        f = tstring;
        notifyDataSetChanged();
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public void b(int l)
    {
        h = l;
    }

    public boolean b()
    {
        return g;
    }

    public g c()
    {
        return f;
    }

    public int getCount()
    {
        int l = 0;
        int i1 = 0;
        if (f != null)
        {
            int j1 = a(f).size();
            l = i1;
            if (h != 0)
            {
                l = (int)Math.ceil((double)b(f).size() / (double)h);
            }
            l += j1;
        }
        i1 = l;
        if (b())
        {
            i1 = l + 1;
        }
        return i1;
    }

    public Object getItem(int l)
    {
        int i1 = getItemViewType(l);
        l = d(l);
        if (i1 == 0)
        {
            return a(f).get(l);
        } else
        {
            return b(f).get(l - a(f).size());
        }
    }

    public long getItemId(int l)
    {
        return (long)l;
    }

    public int getItemViewType(int l)
    {
        byte byte0 = 1;
        if (b() && l == 0)
        {
            byte0 = 2;
        } else
        if (d(l) < a(f).size())
        {
            return 0;
        }
        return byte0;
    }

    public View getView(int l, View view, ViewGroup viewgroup)
    {
        getItemViewType(l);
        JVM INSTR tableswitch 0 2: default 32
    //                   0 46
    //                   1 121
    //                   2 34;
           goto _L1 _L2 _L3 _L4
_L1:
        return view;
_L4:
        if (view == null)
        {
            return ChallengePlaceholderView.a(a);
        }
          goto _L1
_L2:
        Challenge challenge;
        if (view == null)
        {
            view = ChallengeItemView.a(a, e);
        } else
        {
            view = (ChallengeItemView)view;
        }
        challenge = (Challenge)getItem(l);
        if (f != null)
        {
            viewgroup = ChallengesUtils.a(b(f), challenge);
        } else
        {
            viewgroup = null;
        }
        view.a(challenge, viewgroup, c(f));
        return view;
_L3:
        if (view == null)
        {
            view = ChallengeTypeContainerView.a(a, e, h);
        } else
        {
            view = (ChallengeTypeContainerView)view;
        }
        view.a(c(l));
        return view;
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public boolean isEnabled(int l)
    {
        return false;
    }

    public rView(ChallengesFragment challengesfragment, Context context)
    {
        e = challengesfragment;
        super();
        g = false;
        a = context;
    }

    public a(ChallengesFragment challengesfragment, Context context, int l)
    {
        e = challengesfragment;
        super();
        g = false;
        a = context;
        h = l;
    }
}
