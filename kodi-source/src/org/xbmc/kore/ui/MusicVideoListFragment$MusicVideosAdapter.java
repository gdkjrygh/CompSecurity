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
//            MusicVideoListFragment

private static class artHeight extends CursorAdapter
{

    private int artHeight;
    private int artWidth;
    private HostManager hostManager;

    public void bindView(View view, Context context, Cursor cursor)
    {
        artHeight artheight = (artHeight)view.getTag();
        artheight.eoId = cursor.getInt(1);
        artheight.eoTitle = cursor.getString(2);
        artheight.w.setText(artheight.eoTitle);
        view = (new StringBuilder()).append(cursor.getString(3)).append("  |  ").append(cursor.getString(4)).toString();
        artheight.bumView.setText(view);
        int i = cursor.getInt(6);
        if (i > 0)
        {
            view = (new StringBuilder()).append(UIUtils.formatTime(i)).append("  |  ").append(cursor.getString(7)).toString();
        } else
        {
            view = cursor.getString(7);
        }
        artheight.GenresView.setText(view);
        UIUtils.loadImageWithCharacterAvatar(context, hostManager, cursor.getString(5), artheight.eoTitle, artheight.eoTitle, artWidth, artHeight);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = LayoutInflater.from(context).inflate(0x7f03003e, viewgroup, false);
        cursor = new artHeight(null);
        cursor.w = (TextView)context.findViewById(0x7f0e002d);
        cursor.bumView = (TextView)context.findViewById(0x7f0e00a5);
        cursor.GenresView = (TextView)context.findViewById(0x7f0e00c1);
        cursor.GenresView = (ImageView)context.findViewById(0x7f0e0070);
        context.setTag(cursor);
        return context;
    }

    public (Context context)
    {
        super(context, null, false);
        hostManager = HostManager.getInstance(context);
        context = context.getResources();
        artWidth = (int)(context.getDimension(0x7f080024) / 1.0F);
        artHeight = (int)(context.getDimension(0x7f080023) / 1.0F);
    }
}
