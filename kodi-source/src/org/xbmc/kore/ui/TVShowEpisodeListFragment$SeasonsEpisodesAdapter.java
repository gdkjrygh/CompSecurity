// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorTreeAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            TVShowEpisodeListFragment

private class separatorPadding extends CursorTreeAdapter
{

    private int artHeight;
    private int artWidth;
    private HostManager hostManager;
    private int iconCollapseResId;
    private int iconExpandResId;
    private int separatorPadding;
    private int themeAccentColor;
    final TVShowEpisodeListFragment this$0;

    public void bindChildView(View view, Context context, Cursor cursor, boolean flag)
    {
        separatorPadding separatorpadding = (separatorPadding)view.getTag();
        separatorpadding.deId = cursor.getInt(1);
        separatorpadding.denumberView.setText(String.format(context.getString(0x7f07003c), new Object[] {
            Integer.valueOf(cursor.getInt(2))
        }));
        int i = cursor.getInt(6) / 60;
        if (i > 0)
        {
            view = (new StringBuilder()).append(String.format(context.getString(0x7f070055), new Object[] {
                String.valueOf(i)
            })).append("  |  ").append(cursor.getString(7)).toString();
        } else
        {
            view = cursor.getString(7);
        }
        separatorpadding.View.setText(cursor.getString(5));
        separatorpadding.lsView.setText(view);
        if (cursor.getInt(4) > 0)
        {
            separatorpadding.markView.setVisibility(0);
            separatorpadding.markView.setColorFilter(themeAccentColor);
            return;
        } else
        {
            separatorpadding.markView.setVisibility(8);
            return;
        }
    }

    public void bindGroupView(View view, Context context, Cursor cursor, boolean flag)
    {
        TextView textview = (TextView)view.findViewById(0x7f0e0089);
        TextView textview1 = (TextView)view.findViewById(0x7f0e00c7);
        ImageView imageview = (ImageView)view.findViewById(0x7f0e0070);
        textview.setText(String.format(context.getString(0x7f070083), new Object[] {
            Integer.valueOf(cursor.getInt(1))
        }));
        int i = cursor.getInt(3);
        int j = cursor.getInt(4);
        textview1.setText(String.format(context.getString(0x7f07006c), new Object[] {
            Integer.valueOf(i), Integer.valueOf(i - j)
        }));
        UIUtils.loadImageWithCharacterAvatar(context, hostManager, cursor.getString(2), String.valueOf(cursor.getInt(1)), imageview, artWidth, artHeight);
        view = (ImageView)view.findViewById(0x7f0e00be);
        if (flag)
        {
            view.setImageResource(iconCollapseResId);
            return;
        } else
        {
            view.setImageResource(iconExpandResId);
            return;
        }
    }

    public Cursor getChildrenCursor(Cursor cursor)
    {
        if (!isAdded())
        {
            return null;
        }
        int i = cursor.getInt(1);
        Bundle bundle = new Bundle();
        bundle.putInt("season", i);
        i = cursor.getPosition();
        cursor = getLoaderManager();
        if (cursor.getLoader(i) == null || cursor.getLoader(i).isReset())
        {
            cursor.initLoader(i, bundle, TVShowEpisodeListFragment.this);
            return null;
        } else
        {
            cursor.restartLoader(i, bundle, TVShowEpisodeListFragment.this);
            return null;
        }
    }

    public View newChildView(Context context, Cursor cursor, boolean flag, ViewGroup viewgroup)
    {
        context = LayoutInflater.from(context).inflate(0x7f030041, viewgroup, false);
        cursor = new >(null);
        cursor.iner = (RelativeLayout)context.findViewById(0x7f0e0055);
        cursor.View = (TextView)context.findViewById(0x7f0e002d);
        cursor.lsView = (TextView)context.findViewById(0x7f0e00a5);
        cursor.denumberView = (TextView)context.findViewById(0x7f0e00c4);
        cursor.markView = (ImageView)context.findViewById(0x7f0e00c3);
        context.setTag(cursor);
        return context;
    }

    public View newGroupView(Context context, Cursor cursor, boolean flag, ViewGroup viewgroup)
    {
        return LayoutInflater.from(context).inflate(0x7f030045, viewgroup, false);
    }

    public (Context context)
    {
        this$0 = TVShowEpisodeListFragment.this;
        super(null, context);
        tvshowepisodelistfragment = context.getTheme()._mth0(new int[] {
            0x7f010106, 0x7f010012, 0x7f010016
        });
        themeAccentColor = getColor(0, 0x7f0d0004);
        iconCollapseResId = getResourceId(1, 0x7f020050);
        iconExpandResId = getResourceId(2, 0x7f020052);
        recycle();
        hostManager = HostManager.getInstance(context);
        tvshowepisodelistfragment = context.getResources();
        artWidth = (int)(getDimension(0x7f080030) / 1.0F);
        artHeight = (int)(getDimension(0x7f08002f) / 1.0F);
        separatorPadding = getDimensionPixelSize(0x7f080096);
    }
}
