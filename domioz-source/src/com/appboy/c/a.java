// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.c;

import a.a.du;
import com.appboy.d.a.c;
import com.appboy.f;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public final class a
{

    private static final String a;
    private final List b;
    private final String c;
    private final boolean d;
    private final long e;

    public a(List list, String s, boolean flag, long l)
    {
        c = s;
        d = flag;
        b = (List)du.a(list);
        e = l;
    }

    public final List a(EnumSet enumset)
    {
        Object obj;
        obj = new ArrayList();
        if (b == null)
        {
            com.appboy.f.a.b(a, "There are no cards targeted to this user in the Appboy News Feed, you can call Appboy.requestFeedRefresh(),and try to call getFeedCards(categories) again when you receive a new feed updated event, or check your Appboy dashboard and make sure there are cards in the segment.");
            break MISSING_BLOCK_LABEL_138;
        }
        if (enumset != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        com.appboy.f.a.b(a, "The categories passed to getFeedCards are null, FeedUpdatedEvent is going to return all the cards in cache.");
        return b;
        if (!enumset.isEmpty())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        com.appboy.f.a.c(a, "The parameter passed into categories is not valid, Appboy is returning an empty card list.Please pass in a non-empty EnumSet of CardCategory for getFeedCards().");
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
                c c1 = (c)iterator.next();
                if (c1.a(enumset))
                {
                    ((List) (obj)).add(c1);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.appboy.f.a.b(a, String.format("Unable to get cards with categories[%s]. Ignoring.", new Object[] {
                enumset
            }), ((Throwable) (obj)));
            return null;
        }
        return ((List) (obj));
    }

    public final boolean a()
    {
        return d;
    }

    public final int b(EnumSet enumset)
    {
        if (enumset == null)
        {
            com.appboy.f.a.b(a, "The categories passed into getCardCount are null, FeedUpdatedEvent is going to return the count of all the cards in cache.");
            return b.size();
        }
        if (enumset.isEmpty())
        {
            com.appboy.f.a.c(a, "The parameters passed into categories are not valid, Appboy is returning 0 in getCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        } else
        {
            return a(enumset).size();
        }
    }

    public final long b()
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
            f.a, com/appboy/c/a.getName()
        });
    }
}
