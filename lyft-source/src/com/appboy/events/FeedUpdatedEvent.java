// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.events;

import bo.app.ff;
import com.appboy.Constants;
import com.appboy.enums.CardCategory;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public final class FeedUpdatedEvent
{

    private static final String a;
    private final List b;
    private final String c;
    private final boolean d;
    private final long e;

    public FeedUpdatedEvent(List list, String s, boolean flag, long l)
    {
        c = s;
        d = flag;
        b = (List)ff.a(list);
        e = l;
    }

    public final int getCardCount()
    {
        return getCardCount(CardCategory.ALL_CATEGORIES);
    }

    public final int getCardCount(CardCategory cardcategory)
    {
        return getCardCount(EnumSet.of(cardcategory));
    }

    public final int getCardCount(EnumSet enumset)
    {
        if (enumset == null)
        {
            AppboyLogger.i(a, "The categories passed into getCardCount are null, FeedUpdatedEvent is going to return the count of all the cards in cache.");
            return b.size();
        }
        if (enumset.isEmpty())
        {
            AppboyLogger.w(a, "The parameters passed into categories are not valid, Appboy is returning 0 in getCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        } else
        {
            return getFeedCards(enumset).size();
        }
    }

    public final List getFeedCards()
    {
        return b;
    }

    public final List getFeedCards(CardCategory cardcategory)
    {
        return getFeedCards(EnumSet.of(cardcategory));
    }

    public final List getFeedCards(EnumSet enumset)
    {
        Object obj;
        obj = new ArrayList();
        if (b == null)
        {
            AppboyLogger.i(a, "There are no cards targeted to this user in the Appboy News Feed, you can call Appboy.requestFeedRefresh(),and try to call getFeedCards(categories) again when you receive a new feed updated event, or check your Appboy dashboard and make sure there are cards in the segment.");
            break MISSING_BLOCK_LABEL_138;
        }
        if (enumset != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        AppboyLogger.i(a, "The categories passed to getFeedCards are null, FeedUpdatedEvent is going to return all the cards in cache.");
        return b;
        if (!enumset.isEmpty())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        AppboyLogger.w(a, "The parameter passed into categories is not valid, Appboy is returning an empty card list.Please pass in a non-empty EnumSet of CardCategory for getFeedCards().");
        return ((List) (obj));
        try
        {
            Iterator iterator = b.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Card card = (Card)iterator.next();
                if (card.isInCategorySet(enumset))
                {
                    ((List) (obj)).add(card);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            AppboyLogger.w(a, String.format("Unable to get cards with categories[%s]. Ignoring.", new Object[] {
                enumset
            }), ((Throwable) (obj)));
            return null;
        }
        return ((List) (obj));
    }

    public final int getUnreadCardCount()
    {
        return getUnreadCardCount(CardCategory.ALL_CATEGORIES);
    }

    public final int getUnreadCardCount(CardCategory cardcategory)
    {
        return getUnreadCardCount(EnumSet.of(cardcategory));
    }

    public final int getUnreadCardCount(EnumSet enumset)
    {
        for (; enumset == null; enumset = CardCategory.ALL_CATEGORIES)
        {
            AppboyLogger.w(a, "The categories passed to getUnreadCardCount are null, FeedUpdatedEvent is going to return the count of all the unread cards in cache.");
        }

        if (enumset.isEmpty())
        {
            AppboyLogger.w(a, "The parameters passed into categories are Empty, Appboy is returning 0 in getUnreadCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        }
        Iterator iterator = b.iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Card card = (Card)iterator.next();
            if (card.isInCategorySet(enumset) && !card.getViewed())
            {
                i++;
            }
        } while (true);
        return i;
    }

    public final String getUserId()
    {
        return c;
    }

    public final boolean isFromOfflineStorage()
    {
        return d;
    }

    public final long lastUpdatedInSecondsFromEpoch()
    {
        return e;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("FeedUpdatedEvent{");
        stringbuilder.append("mFeedCards=").append(b);
        stringbuilder.append(", mUserId='").append(c).append('\'');
        stringbuilder.append(", mFromOfflineStorage=").append(d);
        stringbuilder.append(", mTimestamp=").append(e);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/events/FeedUpdatedEvent.getName()
        });
    }
}
