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
import javax.jmdns.ServiceInfo;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            AddHostFragmentZeroconf

private class this._cls0 extends ArrayAdapter
{

    final AddHostFragmentZeroconf this$0;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(getActivity()).inflate(0x7f03003c, viewgroup, false);
        }
        view = (ServiceInfo)getItem(i);
        ((TextView)view1.findViewById(0x7f0e00bf)).setText(view.getName());
        viewgroup = view.getHostAddresses();
        if (viewgroup.length > 0)
        {
            view = (new StringBuilder()).append(viewgroup[0]).append(":").append(view.getPort()).toString();
        } else
        {
            view = getString(0x7f0700e3);
        }
        ((TextView)view1.findViewById(0x7f0e00c0)).setText(view);
        ((ImageView)view1.findViewById(0x7f0e00be)).setColorFilter(getActivity().getResources().getColor(0x7f0d00a3));
        ((ImageView)view1.findViewById(0x7f0e00bd)).setVisibility(8);
        return view1;
    }

    public (Context context, int i, ServiceInfo aserviceinfo[])
    {
        this$0 = AddHostFragmentZeroconf.this;
        super(context, i, aserviceinfo);
    }
}
