// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.app.a;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            ah, ak

final class aj extends BaseAdapter
{

    final ah a;

    private aj(ah ah1)
    {
        a = ah1;
        super();
    }

    aj(ah ah1, byte byte0)
    {
        this(ah1);
    }

    public final int getCount()
    {
        return android.support.v7.internal.widget.ah.a(a).getChildCount();
    }

    public final Object getItem(int i)
    {
        return ((ak)android.support.v7.internal.widget.ah.a(a).getChildAt(i)).a();
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return android.support.v7.internal.widget.ah.a(a, (a)getItem(i));
        } else
        {
            ((ak)view).a((a)getItem(i));
            return view;
        }
    }
}
