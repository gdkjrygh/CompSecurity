// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.experience.ExperienceEvent;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import com.google.android.gms.games.ui.util.UiUtils;
import java.text.NumberFormat;

public final class XpEventAdapter extends OnyxCardAdapter
{
    public static interface XpEventEventListener
    {

        public abstract void onXpEventClicked(ExperienceEvent experienceevent);
    }

    private static final class XpEventViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        protected final View createCustomView(int i)
        {
            if (i == 0x7f0d0068)
            {
                View view = 
// JavaClassFileOutputException: get_constant: invalid tag

        public final void onRootViewClicked()
        {
            ((XpEventAdapter)mAdapter).mListener.onXpEventClicked((ExperienceEvent)getData());
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (ExperienceEvent)obj;
            populateViews(gamesrecycleradapter, i, obj);
            gamesrecycleradapter = (XpEventAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, gamesrecycleradapter.getLogflowUiElementType(), 1057, obj);
            Resources resources = mContext.getResources();
            long l;
            boolean flag;
            if (((ExperienceEvent) (obj)).getType() == 1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0 && ((ExperienceEvent) (obj)).getGame() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            setRootViewClickable(flag);
            if (i != 0)
            {
                gamesrecycleradapter = (TextView)setCustomImage(0x7f0d0068);
                int j = ((ExperienceEvent) (obj)).getNewLevel();
                int k = UiUtils.getLevelColor(resources, j);
                gamesrecycleradapter.setText(String.valueOf(j));
                gamesrecycleradapter.setTextColor(k);
                setRootViewBackgroundColor(k);
            } else
            {
                gamesrecycleradapter = ((ExperienceEvent) (obj)).getIconImageUri();
                if (!PlatformVersion.checkVersion(11))
                {
                    gamesrecycleradapter = null;
                }
                setImage(gamesrecycleradapter, 0x7f0200ee);
            }
            setImagePaddingEnabled(true);
            gamesrecycleradapter = getTitleViewBuffer();
            ((ExperienceEvent) (obj)).getDisplayTitle(gamesrecycleradapter);
            setTitle(gamesrecycleradapter);
            if (i != 0)
            {
                setTitleColorResId(0x106000b);
            }
            gamesrecycleradapter = getSubtitleViewBuffer();
            ((ExperienceEvent) (obj)).getDisplayDescription(gamesrecycleradapter);
            setSubtitle(gamesrecycleradapter);
            if (i != 0)
            {
                setSubtitleColorResId(0x106000b);
            }
            gamesrecycleradapter = DateUtils.formatDateTime(mContext, ((ExperienceEvent) (obj)).getCreatedTimestamp(), 0x80000);
            setPrimaryLabel(gamesrecycleradapter);
            if (i != 0)
            {
                setPrimaryLabelColorResId(0x106000b);
            } else
            {
                setPrimaryLabelColorResId(0x7f0b024d);
            }
            l = ((ExperienceEvent) (obj)).getXpEarned();
            if (l > 0L)
            {
                setSecondaryLabel(resources.getString(0x7f100325, new Object[] {
                    NumberFormat.getInstance().format(l)
                }));
            }
            setRootViewContentDescription(resources.getString(0x7f100157, new Object[] {
                ((ExperienceEvent) (obj)).getDisplayTitle(), ((ExperienceEvent) (obj)).getDisplayDescription(), String.valueOf(l), gamesrecycleradapter
            }));
        }

        public XpEventViewHolder(View view)
        {
            super(view);
        }
    }


    private final XpEventEventListener mListener;

    public XpEventAdapter(Context context, XpEventEventListener xpeventeventlistener)
    {
        super(context);
        mListener = (XpEventEventListener)Preconditions.checkNotNull(xpeventeventlistener);
    }

    protected final int getCardType()
    {
        return 3;
    }

    protected final int getDataType()
    {
        return 0x7f0d0043;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new XpEventViewHolder(view);
    }



}
