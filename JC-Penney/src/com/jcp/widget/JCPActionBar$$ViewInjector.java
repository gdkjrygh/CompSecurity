// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.view.View;
import android.widget.TextView;
import com.jcp.views.TypefaceTextView;

// Referenced classes of package com.jcp.widget:
//            JCPActionBar

public class 
    implements butterknife.or
{

    public void inject(butterknife.or or, JCPActionBar jcpactionbar, Object obj)
    {
        jcpactionbar.tvTitle = (TypefaceTextView)or.((View)or.iredView(obj, 0x7f0e0219, "field 'tvTitle'"), 0x7f0e0219, "field 'tvTitle'");
        jcpactionbar.tvItemCount = (TextView)or.((View)or.iredView(obj, 0x7f0e021d, "field 'tvItemCount'"), 0x7f0e021d, "field 'tvItemCount'");
    }

    public volatile void inject(butterknife.or or, Object obj, Object obj1)
    {
        inject(or, (JCPActionBar)obj, obj1);
    }

    public void reset(JCPActionBar jcpactionbar)
    {
        jcpactionbar.tvTitle = null;
        jcpactionbar.tvItemCount = null;
    }

    public volatile void reset(Object obj)
    {
        reset((JCPActionBar)obj);
    }

    public ()
    {
    }
}
