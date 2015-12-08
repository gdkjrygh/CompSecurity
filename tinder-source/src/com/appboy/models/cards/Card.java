// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models.cards;

import bo.app.bx;
import bo.app.ct;
import bo.app.ec;
import bo.app.ed;
import bo.app.el;
import bo.app.eo;
import bo.app.ep;
import com.appboy.enums.CardCategory;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class Card extends Observable
    implements IPutIntoJson
{

    public static final String CATEGORIES = "categories";
    public static final String CREATED = "created";
    public static final long DEFAULT_EXPIRES_AT = -1L;
    public static final String EXPIRES_AT = "expires_at";
    public static final String ID = "id";
    public static final String UPDATED = "updated";
    public static final String VIEWED = "viewed";
    private static final String j = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/models/cards/Card.getName()
    });
    protected final JSONObject a;
    protected final Map b;
    protected final String c;
    protected boolean d;
    protected boolean e;
    protected final long f;
    protected final long g;
    protected final long h;
    protected final EnumSet i;
    private final bx k;
    private final ec l;

    public Card(JSONObject jsonobject)
    {
        this(jsonobject, null, null);
    }

    public Card(JSONObject jsonobject, bx bx1, ec ec1)
    {
        a = jsonobject;
        b = eo.a(jsonobject.optJSONObject("extras"), new HashMap());
        k = bx1;
        l = ec1;
        c = jsonobject.getString("id");
        d = jsonobject.getBoolean("viewed");
        e = d;
        f = jsonobject.getLong("created");
        g = jsonobject.getLong("updated");
        h = jsonobject.optLong("expires_at", -1L);
        jsonobject = jsonobject.optJSONArray("categories");
        if (jsonobject == null || jsonobject.length() == 0)
        {
            i = EnumSet.of(CardCategory.NO_CATEGORY);
        } else
        {
            i = EnumSet.noneOf(com/appboy/enums/CardCategory);
            int i1 = 0;
            while (i1 < jsonobject.length()) 
            {
                bx1 = CardCategory.get(jsonobject.getString(i1));
                if (bx1 != null)
                {
                    i.add(bx1);
                }
                i1++;
            }
        }
    }

    private boolean a()
    {
        if (ep.c(c))
        {
            AppboyLogger.e(j, "Card ID cannot be null");
            return false;
        } else
        {
            return true;
        }
    }

    public volatile Object forJsonPut()
    {
        return forJsonPut();
    }

    public JSONObject forJsonPut()
    {
        return a;
    }

    public EnumSet getCategories()
    {
        return i;
    }

    public long getCreated()
    {
        return f;
    }

    public long getExpiresAt()
    {
        return h;
    }

    public Map getExtras()
    {
        return b;
    }

    public String getId()
    {
        return c;
    }

    public long getUpdated()
    {
        return g;
    }

    public boolean getViewed()
    {
        return d;
    }

    public boolean isEqualToCard(Card card)
    {
        return c.equals(card.getId()) && g == card.getUpdated() && k == card.k;
    }

    public boolean isExpired()
    {
        return getExpiresAt() != -1L && getExpiresAt() <= el.a();
    }

    public boolean isInCategorySet(EnumSet enumset)
    {
        for (enumset = enumset.iterator(); enumset.hasNext();)
        {
            CardCategory cardcategory = (CardCategory)enumset.next();
            if (i.contains(cardcategory))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isRead()
    {
        return e;
    }

    public boolean logClick()
    {
        if (k == null || !a())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        k.a(ct.d(c));
        return true;
        Exception exception;
        exception;
        AppboyLogger.w(j, "Failed to log feed card clicked.", exception);
        return false;
    }

    public boolean logImpression()
    {
        if (k == null || l == null || !a())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        k.a(ct.c(c));
        l.a(c);
        return true;
        Exception exception;
        exception;
        AppboyLogger.w(j, "Failed to log feed card impression.", exception);
        return false;
    }

    public void setIsRead(boolean flag)
    {
        e = flag;
        setChanged();
        notifyObservers();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        ec ec1 = l;
        String s = c;
        if (!ec1.d.contains(s))
        {
            ec1.d.add(s);
            ec1.a(ec1.d, ed.a);
        }
        return;
        Exception exception;
        exception;
    }

    public void setViewed(boolean flag)
    {
        d = flag;
    }

}
