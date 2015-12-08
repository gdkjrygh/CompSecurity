// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.NbcDate;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.squareup.picasso.Picasso;
import java.util.Locale;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            AssetViewModel

public class HeaderViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
{

    ImageView dividerLine;
    TextView header;
    private boolean isFavoriteDisplay;
    Picasso picasso;
    private final boolean showRelativeDateHeader;

    public HeaderViewHolder(View view, boolean flag)
    {
        super(view);
        showRelativeDateHeader = flag;
        MainNavigationContentActivity.component().inject(this);
    }

    public void bind(AssetViewModel assetviewmodel, Locale locale)
    {
        ButterKnife.bind(this, itemView);
        if (assetviewmodel.isLive() && showRelativeDateHeader)
        {
            header.setBackgroundResource(0x7f0200cf);
            header.setTextColor(-1);
            setDividerLine(0x7f0200da);
        } else
        {
            header.setBackgroundResource(0x7f0200cd);
            header.setTextColor(0xff000000);
            setDividerLine(0x7f0200db);
        }
        if (assetviewmodel.isLive() && showRelativeDateHeader)
        {
            header.setText(0x7f07011e);
        } else
        if (assetviewmodel.asset().isToday() && assetviewmodel.asset().isFuture() && showRelativeDateHeader)
        {
            header.setText(0x7f0701b4);
        } else
        {
            header.setText(assetviewmodel.asset().getStart().getListHeaderDate(locale));
        }
        if (isFavoriteDisplay())
        {
            hideHeader();
        }
    }

    public void hideHeader()
    {
        if (header != null)
        {
            header.setVisibility(8);
            dividerLine.setVisibility(8);
        }
    }

    public boolean isFavoriteDisplay()
    {
        return isFavoriteDisplay;
    }

    public void setDividerLine(int i)
    {
        dividerLine.setImageDrawable(itemView.getContext().getResources().getDrawable(i));
    }

    public void setIsFavoriteDisplay(boolean flag)
    {
        isFavoriteDisplay = flag;
    }
}
