// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            AlbumListFragment

private static class artHeight extends CursorAdapter
{

    private int artHeight;
    private int artWidth;
    private HostManager hostManager;

    public void bindView(View view, Context context, Cursor cursor)
    {
        artHeight artheight = (artHeight)view.getTag();
        artheight.umId = cursor.getInt(1);
        artheight.umTitle = cursor.getString(2);
        artheight.leView.setText(artheight.umTitle);
        artheight.istView.setText(cursor.getString(3));
        int i = cursor.getInt(6);
        view = cursor.getString(4);
        if (view != null)
        {
            if (i > 0)
            {
                view = (new StringBuilder()).append(view).append("  |  ").append(i).toString();
            }
        } else
        {
            view = String.valueOf(i);
        }
        artheight.resView.setText(view);
        view = cursor.getString(5);
        UIUtils.loadImageWithCharacterAvatar(context, hostManager, view, artheight.umTitle, artheight.View, artWidth, artHeight);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = LayoutInflater.from(context).inflate(0x7f030037, viewgroup, false);
        cursor = new it>(null);
        cursor.leView = (TextView)context.findViewById(0x7f0e002d);
        cursor.istView = (TextView)context.findViewById(0x7f0e00b6);
        cursor.resView = (TextView)context.findViewById(0x7f0e008f);
        cursor.View = (ImageView)context.findViewById(0x7f0e0070);
        context.setTag(cursor);
        return context;
    }

    public (Context context)
    {
        super(context, null, false);
        hostManager = HostManager.getInstance(context);
        context = context.getResources();
        artWidth = (int)(context.getDimension(0x7f080016) / 1.0F);
        artHeight = (int)(context.getDimension(0x7f080015) / 1.0F);
    }
}
