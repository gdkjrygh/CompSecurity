// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            AllCastActivity

public static class hostManager extends ArrayAdapter
{

    private int artHeight;
    private int artWidth;
    private HostManager hostManager;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(getContext()).inflate(0x7f03003a, viewgroup, false);
            if (artWidth == -1)
            {
                view = getContext().getResources();
                int j = view.getDimensionPixelSize(0x7f080096);
                viewgroup = new DisplayMetrics();
                ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getMetrics(viewgroup);
                int k = view.getInteger(0x7f0b0000);
                artWidth = (((DisplayMetrics) (viewgroup)).widthPixels - ((k + 2) - 1) * j) / k;
                artHeight = (int)((double)artWidth * 1.5D);
                LogUtils.LOGD(AllCastActivity.access$000(), (new StringBuilder()).append("width: ").append(artWidth).toString());
            }
            view = new (null);
            view.ew = (TextView)view1.findViewById(0x7f0e00b9);
            view.ew = (TextView)view1.findViewById(0x7f0e00b6);
            view.eView = (ImageView)view1.findViewById(0x7f0e00b7);
            view1.setTag(view);
            view1.getLayoutParams().ctureView = artWidth;
            view1.getLayoutParams().artWidth = artHeight;
        }
        view = (artHeight)view1.getTag();
        viewgroup = (org.xbmc.kore.jsonrpc.type.)getItem(i);
        ((getItem) (view)).ew.setText(((org.xbmc.kore.jsonrpc.type.) (viewgroup)).);
        ((ew) (view)).ew.setText(((org.xbmc.kore.jsonrpc.type.) (viewgroup)).);
        UIUtils.loadImageWithCharacterAvatar(getContext(), hostManager, ((org.xbmc.kore.jsonrpc.type.r) (viewgroup)).r, ((org.xbmc.kore.jsonrpc.type.r) (viewgroup)).r, ((l) (view)).eView, artWidth, artHeight);
        view.me = ((org.xbmc.kore.jsonrpc.type.r) (viewgroup)).r;
        return view1;
    }

    public (Context context, ArrayList arraylist)
    {
        super(context, 0, arraylist);
        artWidth = -1;
        artHeight = -1;
        hostManager = HostManager.getInstance(context);
    }
}
