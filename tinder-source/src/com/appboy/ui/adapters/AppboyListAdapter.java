// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.appboy.Constants;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.CrossPromotionSmallCard;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.configuration.XmlUIConfigurationProvider;
import com.appboy.ui.widget.BannerImageCardView;
import com.appboy.ui.widget.BaseCardView;
import com.appboy.ui.widget.CaptionedImageCardView;
import com.appboy.ui.widget.CrossPromotionSmallCardView;
import com.appboy.ui.widget.DefaultCardView;
import com.appboy.ui.widget.ShortNewsCardView;
import com.appboy.ui.widget.TextAnnouncementCardView;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppboyListAdapter extends ArrayAdapter
{

    private static final String TAG;
    private final Set mCardIdImpressions = new HashSet();
    private final Context mContext;
    private final XmlUIConfigurationProvider mUiConfigurationProvider;

    public AppboyListAdapter(Context context, int i, List list)
    {
        super(context, i, list);
        mContext = context;
        mUiConfigurationProvider = new XmlUIConfigurationProvider(context);
    }

    private void addAllBatch(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        super.addAll(collection);
        this;
        JVM INSTR monitorexit ;
        return;
        collection;
        throw collection;
    }

    private void logCardImpression(Card card)
    {
        String s = card.getId();
        if (!mCardIdImpressions.contains(s))
        {
            mCardIdImpressions.add(s);
            card.logImpression();
            AppboyLogger.d(TAG, String.format("Logged impression for card %s", new Object[] {
                s
            }));
        } else
        {
            AppboyLogger.d(TAG, String.format("Already counted impression for card %s", new Object[] {
                s
            }));
        }
        if (!card.getViewed())
        {
            card.setViewed(true);
        }
    }

    public void add(Card card)
    {
        this;
        JVM INSTR monitorenter ;
        super.add(card);
        this;
        JVM INSTR monitorexit ;
        return;
        card;
        throw card;
    }

    public volatile void add(Object obj)
    {
        add((Card)obj);
    }

    public void batchSetCardsToRead(int i, int j)
    {
        if (getCount() == 0)
        {
            AppboyLogger.d(TAG, "mAdapter is empty in setting some cards to viewed.");
        } else
        {
            i = Math.max(0, i);
            j = Math.min(getCount(), j);
            while (i < j) 
            {
                Card card = (Card)getItem(i);
                if (card == null)
                {
                    AppboyLogger.d(TAG, "Card was null in setting some cards to viewed.");
                    return;
                }
                if (!card.isRead())
                {
                    card.setIsRead(true);
                }
                i++;
            }
        }
    }

    public int getItemViewType(int i)
    {
        Card card = (Card)getItem(i);
        if (card instanceof BannerImageCard)
        {
            return 1;
        }
        if (card instanceof CaptionedImageCard)
        {
            return 2;
        }
        if (card instanceof CrossPromotionSmallCard)
        {
            return 3;
        }
        if (card instanceof ShortNewsCard)
        {
            return 4;
        }
        return !(card instanceof TextAnnouncementCard) ? 0 : 5;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = (Card)getItem(i);
        if (view == null)
        {
            if (viewgroup instanceof BannerImageCard)
            {
                view = new BannerImageCardView(mContext);
            } else
            if (viewgroup instanceof CaptionedImageCard)
            {
                view = new CaptionedImageCardView(mContext);
            } else
            if (viewgroup instanceof CrossPromotionSmallCard)
            {
                view = new CrossPromotionSmallCardView(mContext);
            } else
            if (viewgroup instanceof ShortNewsCard)
            {
                view = new ShortNewsCardView(mContext);
            } else
            if (viewgroup instanceof TextAnnouncementCard)
            {
                view = new TextAnnouncementCardView(mContext);
            } else
            {
                view = new DefaultCardView(mContext);
            }
        } else
        {
            AppboyLogger.d(TAG, (new StringBuilder("Reusing convertView for rendering of item ")).append(i).toString());
            view = (BaseCardView)view;
        }
        AppboyLogger.d(TAG, String.format("Using view of type: %s for card at position %d: %s", new Object[] {
            view.getClass().getName(), Integer.valueOf(i), viewgroup.toString()
        }));
        view.setCard(viewgroup);
        logCardImpression(viewgroup);
        return view;
    }

    public int getViewTypeCount()
    {
        return 8;
    }

    public void replaceFeed(List list)
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        setNotifyOnChange(false);
        if (list != null) goto _L2; else goto _L1
_L1:
        clear();
        notifyDataSetChanged();
_L7:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int k;
        AppboyLogger.d(TAG, String.format("Replacing existing feed of %d cards with new feed containing %d cards.", new Object[] {
            Integer.valueOf(getCount()), Integer.valueOf(list.size())
        }));
        k = list.size();
        int j = 0;
_L3:
        Card card1;
        if (j >= getCount())
        {
            break MISSING_BLOCK_LABEL_154;
        }
        card1 = (Card)getItem(j);
        Card card;
        card = null;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        card = (Card)list.get(i);
        if (card == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        if (!card.isEqualToCard(card1))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        i++;
        j++;
          goto _L3
        remove(card1);
          goto _L3
        list;
        throw list;
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L5; else goto _L4
_L4:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        add((Card)list.get(i));
        i++;
        if (true) goto _L4; else goto _L6
_L5:
        addAllBatch(list.subList(i, k));
_L6:
        notifyDataSetChanged();
          goto _L7
    }

    public void resetCardImpressionTracker()
    {
        mCardIdImpressions.clear();
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/adapters/AppboyListAdapter.getName()
        });
    }
}
