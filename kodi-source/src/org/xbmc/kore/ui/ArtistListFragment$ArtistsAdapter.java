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
//            ArtistListFragment

private static class artHeight extends CursorAdapter
{

    private int artHeight;
    private int artWidth;
    private HostManager hostManager;

    public void bindView(View view, Context context, Cursor cursor)
    {
        view = (artHeight)view.getTag();
        view.stId = cursor.getInt(1);
        view.stName = cursor.getString(2);
        ((stName) (view)).View.setText(((View) (view)).stName);
        ((stName) (view)).esView.setText(cursor.getString(3));
        cursor = cursor.getString(4);
        UIUtils.loadImageWithCharacterAvatar(context, hostManager, cursor, ((hostManager) (view)).stName, ((stName) (view)).iew, artWidth, artHeight);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = LayoutInflater.from(context).inflate(0x7f030038, viewgroup, false);
        cursor = new t>(null);
        cursor.View = (TextView)context.findViewById(0x7f0e00b6);
        cursor.esView = (TextView)context.findViewById(0x7f0e008f);
        cursor.iew = (ImageView)context.findViewById(0x7f0e0070);
        context.setTag(cursor);
        return context;
    }

    public (Context context)
    {
        super(context, null, false);
        hostManager = HostManager.getInstance(context);
        context = context.getResources();
        artWidth = (int)(context.getDimension(0x7f080018) / 1.0F);
        artHeight = (int)(context.getDimension(0x7f080017) / 1.0F);
    }
}
