// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.domain.challenges.ChallengeType;
import com.fitbit.ui.loadable.LoadablePicassoImageView;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeTypeItemView_

public class ChallengeTypeItemView extends LinearLayout
{
    public static interface a
    {

        public abstract void a(ChallengeType challengetype);
    }


    protected LoadablePicassoImageView a;
    protected TextView b;
    private ChallengeType c;
    private a d;

    public ChallengeTypeItemView(Context context)
    {
        super(context);
    }

    public ChallengeTypeItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ChallengeTypeItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static ChallengeTypeItemView a(Context context)
    {
        return ChallengeTypeItemView_.b(context);
    }

    public ChallengeType a()
    {
        return c;
    }

    public void a(a a1)
    {
        d = a1;
    }

    public void a(ChallengeType challengetype)
    {
        c = challengetype;
        b.setText(challengetype.d());
        a.a(challengetype.g());
    }

    public a b()
    {
        return d;
    }

    protected void c()
    {
        if (d == null)
        {
            return;
        } else
        {
            d.a(c);
            return;
        }
    }
}
