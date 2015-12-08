// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            AddonListFragment

private class artHeight extends ArrayAdapter
{

    private int artHeight;
    private int artWidth;
    private HostManager hostManager;
    final AddonListFragment this$0;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(getActivity()).inflate(0x7f030036, viewgroup, false);
            view = new it>(null);
            view.leView = (TextView)view1.findViewById(0x7f0e002d);
            view.ailsView = (TextView)view1.findViewById(0x7f0e00a5);
            view.View = (ImageView)view1.findViewById(0x7f0e0070);
            view1.setTag(view);
        }
        view = (View)view1.getTag();
        viewgroup = (org.xbmc.kore.jsonrpc.type.r)getItem(i);
        view.onId = ((org.xbmc.kore.jsonrpc.type.r) (viewgroup)).r;
        view.onName = ((org.xbmc.kore.jsonrpc.type.r) (viewgroup)).r;
        (() (view)).leView.setText(((leView) (view)).onName);
        ((onName) (view)).ailsView.setText(((org.xbmc.kore.jsonrpc.type.r) (viewgroup)).r);
        UIUtils.loadImageWithCharacterAvatar(getContext(), hostManager, ((org.xbmc.kore.jsonrpc.type.r) (viewgroup)).r, ((bnail) (view)).onName, ((onName) (view)).View, artWidth, artHeight);
        return view1;
    }

    public (Context context, int i)
    {
        this$0 = AddonListFragment.this;
        super(context, i);
        hostManager = HostManager.getInstance(context);
        addonlistfragment = context.getResources();
        artWidth = (int)(getDimension(0x7f080012) / 1.0F);
        artHeight = (int)(getDimension(0x7f080011) / 1.0F);
    }
}
