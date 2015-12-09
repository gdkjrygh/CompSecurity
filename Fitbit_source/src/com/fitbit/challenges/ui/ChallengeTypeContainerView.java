// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.fitbit.data.domain.challenges.ChallengeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeTypeContainerView_, ChallengeTypeItemView

public class ChallengeTypeContainerView extends LinearLayout
{

    int a;
    private List b;
    private ChallengeTypeItemView.a c;

    public ChallengeTypeContainerView(Context context)
    {
        super(context);
        b = new ArrayList();
    }

    public ChallengeTypeContainerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new ArrayList();
    }

    public ChallengeTypeContainerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new ArrayList();
    }

    public static ChallengeTypeContainerView a(Context context)
    {
        return ChallengeTypeContainerView_.b(context);
    }

    public static ChallengeTypeContainerView a(Context context, ChallengeTypeItemView.a a1)
    {
        context = a(context);
        context.a(a1);
        return context;
    }

    public static ChallengeTypeContainerView a(Context context, ChallengeTypeItemView.a a1, int i)
    {
        context = a(context, a1);
        context.a(i);
        return context;
    }

    private int b()
    {
        return b.size();
    }

    public List a()
    {
        return b;
    }

    public void a(int i)
    {
        if (i > 0)
        {
            a = i;
        }
    }

    public void a(ChallengeTypeItemView.a a1)
    {
        c = a1;
    }

    public void a(List list)
    {
        if (list != null)
        {
            int j = list.size() - b();
            if (j < 0)
            {
                j = Math.max(Math.min(b(), a), j + b());
                Iterator iterator = b.iterator();
                while (iterator.hasNext()) 
                {
                    View view = (View)iterator.next();
                    byte byte0;
                    if (b.indexOf(view) < j)
                    {
                        byte0 = 4;
                    } else
                    {
                        byte0 = 8;
                    }
                    view.setVisibility(byte0);
                }
            } else
            if (j > 0)
            {
                for (int i = 0; i < Math.max(j, a); i++)
                {
                    ChallengeTypeItemView challengetypeitemview = ChallengeTypeItemView.a(getContext());
                    android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
                    challengetypeitemview.setVisibility(4);
                    challengetypeitemview.a(c);
                    addView(challengetypeitemview, layoutparams);
                    b.add(challengetypeitemview);
                }

            }
            Iterator iterator1 = list.iterator();
            while (iterator1.hasNext()) 
            {
                ChallengeType challengetype = (ChallengeType)iterator1.next();
                ChallengeTypeItemView challengetypeitemview1 = (ChallengeTypeItemView)b.get(list.indexOf(challengetype));
                challengetypeitemview1.setVisibility(0);
                challengetypeitemview1.a(challengetype);
            }
        }
    }
}
