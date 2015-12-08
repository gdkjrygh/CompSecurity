// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView

private final class  extends BaseAdapter
{

    final ActivityChooserView this$0;

    public final int getCount()
    {
        throw new NullPointerException();
    }

    public final Object getItem(int i)
    {
        switch (getItemViewType(i))
        {
        default:
            throw new IllegalArgumentException();

        case 0: // '\0'
            throw new NullPointerException();

        case 1: // '\001'
            return null;
        }
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final int getItemViewType(int i)
    {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 28
    //                   0 104
    //                   1 36;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L3:
        if (view == null) goto _L5; else goto _L4
_L4:
        View view1 = view;
        if (view.getId() == 1) goto _L6; else goto _L5
_L5:
        view1 = LayoutInflater.from(getContext()).inflate(0x7f040008, viewgroup, false);
        view1.setId(1);
        ((TextView)view1.findViewById(0x7f0d0075)).setText(getContext().getString(0x7f100006));
_L6:
        return view1;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        view1 = view;
        if (view.getId() == 0x7f0d00b7) goto _L9; else goto _L8
_L8:
        view1 = LayoutInflater.from(getContext()).inflate(0x7f040008, viewgroup, false);
_L9:
        view = getContext().getPackageManager();
        viewgroup = (ImageView)view1.findViewById(0x7f0d006b);
        ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
        viewgroup.setImageDrawable(resolveinfo.loadIcon(view));
        ((TextView)view1.findViewById(0x7f0d0075)).setText(resolveinfo.loadLabel(view));
        ViewCompat.setActivated(view1, false);
        return view1;
    }

    public final int getViewTypeCount()
    {
        return 3;
    }
}
