// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.reflex;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import com.facebook.orca.threadlist.bo;
import com.facebook.orca.threadlist.i;
import com.facebook.reflex.ah;
import com.facebook.reflex.view.h;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.reflex:
//            l, m

public class k extends h
    implements bo
{

    private i a;
    private final ah b;
    private android.widget.AbsListView.OnScrollListener c;

    public k(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public k(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        b = new l(this);
        c = new m(this);
        a(b);
        a(c);
    }

    static i a(k k1)
    {
        return k1.a;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        Preconditions.checkNotNull(a);
        a.a();
    }

    public void setPublisherController(i j)
    {
        a = j;
    }
}
