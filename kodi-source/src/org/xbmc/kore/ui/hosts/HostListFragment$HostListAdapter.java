// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import org.xbmc.kore.host.HostInfo;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostListFragment

private class this._cls0 extends ArrayAdapter
{

    final HostListFragment this$0;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(getActivity()).inflate(0x7f03003c, viewgroup, false);
        }
        view = (this._cls0)getItem(i);
        ((TextView)view1.findViewById(0x7f0e00bf)).setText(((getItem) (view)).Info.getName());
        viewgroup = (new StringBuilder()).append(((Info) (view)).Info.getAddress()).append(":").append(((Info) (view)).Info.getHttpPort()).toString();
        ((TextView)view1.findViewById(0x7f0e00c0)).setText(viewgroup);
        viewgroup = (ImageView)view1.findViewById(0x7f0e00be);
        ((Info) (view)).us;
        JVM INSTR tableswitch 0 2: default 148
    //                   0 158
    //                   1 231
    //                   2 212;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new RuntimeException("Invalid host status");
_L2:
        i = getActivity().getResources().getColor(0x7f0d00a4);
_L6:
        viewgroup.setColorFilter(i);
        viewgroup = (ImageView)view1.findViewById(0x7f0e00bd);
        viewgroup.setTag(((us) (view)).Info);
        viewgroup.setOnClickListener(HostListFragment.access$400(HostListFragment.this));
        return view1;
_L4:
        i = getActivity().getResources().getColor(0x7f0d00a5);
        continue; /* Loop/switch isn't completed */
_L3:
        i = getActivity().getResources().getColor(0x7f0d00a3);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public (Context context, int i, List list)
    {
        this$0 = HostListFragment.this;
        super(context, i, list);
    }
}
