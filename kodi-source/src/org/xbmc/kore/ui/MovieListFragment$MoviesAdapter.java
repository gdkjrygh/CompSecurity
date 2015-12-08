// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            MovieListFragment

private static class artHeight extends CursorAdapter
{

    private int artHeight;
    private int artWidth;
    private HostManager hostManager;

    public void bindView(View view, Context context, Cursor cursor)
    {
        artHeight artheight = (artHeight)view.getTag();
        artheight.ieId = cursor.getInt(1);
        artheight.ieTitle = cursor.getString(2);
        artheight.leView.setText(artheight.ieTitle);
        int i;
        if (TextUtils.isEmpty(cursor.getString(8)))
        {
            view = cursor.getString(5);
        } else
        {
            view = cursor.getString(8);
        }
        artheight.ailsView.setText(view);
        i = cursor.getInt(6) / 60;
        if (i > 0)
        {
            view = (new StringBuilder()).append(String.format(context.getString(0x7f070055), new Object[] {
                String.valueOf(i)
            })).append("  |  ").append(String.valueOf(cursor.getInt(4))).toString();
        } else
        {
            view = String.valueOf(cursor.getInt(4));
        }
        artheight.ationView.setText(view);
        UIUtils.loadImageWithCharacterAvatar(context, hostManager, cursor.getString(3), artheight.ieTitle, artheight.View, artWidth, artHeight);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = LayoutInflater.from(context).inflate(0x7f03003d, viewgroup, false);
        cursor = new it>(null);
        cursor.leView = (TextView)context.findViewById(0x7f0e002d);
        cursor.ailsView = (TextView)context.findViewById(0x7f0e00a5);
        cursor.ationView = (TextView)context.findViewById(0x7f0e00c1);
        cursor.View = (ImageView)context.findViewById(0x7f0e0070);
        context.setTag(cursor);
        return context;
    }

    public (Context context)
    {
        super(context, null, false);
        hostManager = HostManager.getInstance(context);
        context = context.getResources();
        artWidth = (int)(context.getDimension(0x7f080020) / 1.0F);
        artHeight = (int)(context.getDimension(0x7f08001f) / 1.0F);
    }
}
