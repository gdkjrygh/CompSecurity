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
//            TVShowListFragment

private static class artHeight extends CursorAdapter
{

    private int artHeight;
    private int artWidth;
    private HostManager hostManager;

    public void bindView(View view, Context context, Cursor cursor)
    {
        view = (artHeight)view.getTag();
        view.owId = cursor.getInt(1);
        view.owTitle = cursor.getString(2);
        ((owTitle) (view)).eView.setText(((eView) (view)).owTitle);
        int i = cursor.getInt(5);
        int j = cursor.getInt(6);
        String s = String.format(context.getString(0x7f07006c), new Object[] {
            Integer.valueOf(i), Integer.valueOf(i - j)
        });
        ((owTitle) (view)).ilsView.setText(s);
        s = String.format(context.getString(0x7f070076), new Object[] {
            cursor.getString(4)
        });
        ((ilsView) (view)).ieredView.setText(s);
        UIUtils.loadImageWithCharacterAvatar(context, hostManager, cursor.getString(3), ((hostManager) (view)).owTitle, ((owTitle) (view)).iew, artWidth, artHeight);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = LayoutInflater.from(context).inflate(0x7f030040, viewgroup, false);
        cursor = new t>(null);
        cursor.eView = (TextView)context.findViewById(0x7f0e002d);
        cursor.ilsView = (TextView)context.findViewById(0x7f0e00a5);
        cursor.ieredView = (TextView)context.findViewById(0x7f0e0088);
        cursor.iew = (ImageView)context.findViewById(0x7f0e0070);
        context.setTag(cursor);
        return context;
    }

    public (Context context)
    {
        super(context, null, false);
        hostManager = HostManager.getInstance(context);
        context = context.getResources();
        artWidth = (int)(context.getDimension(0x7f080032) / 1.0F);
        artHeight = (int)(context.getDimension(0x7f080031) / 1.0F);
    }
}
