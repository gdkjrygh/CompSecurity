// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models.cards;

import bo.app.cd;
import bo.app.cz;
import bo.app.ei;
import bo.app.ej;
import bo.app.eu;
import bo.app.ev;
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
    public static final String ID = "id";
    public static final String UPDATED = "updated";
    public static final String VIEWED = "viewed";
    private static final String i = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/models/cards/Card.getName()
    });
    protected final JSONObject a;
    protected final Map b;
    protected final String c;
    protected boolean d;
    protected boolean e;
    protected final long f;
    protected final long g;
    protected final EnumSet h;
    private final cd j;
    private final ei k;

    public Card(JSONObject jsonobject)
    {
        this(jsonobject, null, null);
    }

    public Card(JSONObject jsonobject, cd cd1, ei ei1)
    {
        a = jsonobject;
        b = eu.a(jsonobject.optJSONObject("extras"), new HashMap());
        j = cd1;
        k = ei1;
        c = jsonobject.getString("id");
        d = jsonobject.getBoolean("viewed");
        e = d;
        f = jsonobject.getLong("created");
        g = jsonobject.getLong("updated");
        jsonobject = jsonobject.optJSONArray("categories");
        if (jsonobject == null || jsonobject.length() == 0)
        {
            h = EnumSet.of(CardCategory.NO_CATEGORY);
        } else
        {
            h = EnumSet.noneOf(com/appboy/enums/CardCategory);
            int l = 0;
            while (l < jsonobject.length()) 
            {
                cd1 = CardCategory.get(jsonobject.getString(l));
                if (cd1 != null)
                {
                    h.add(cd1);
                }
                l++;
            }
        }
    }

    private boolean a()
    {
        if (ev.c(c))
        {
            AppboyLogger.e(i, "Card ID cannot be null");
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
        return h;
    }

    public long getCreated()
    {
        return f;
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
        return c.equals(card.getId()) && g == card.getUpdated() && j == card.j;
    }

    public boolean isInCategorySet(EnumSet enumset)
    {
        for (enumset = enumset.iterator(); enumset.hasNext();)
        {
            CardCategory cardcategory = (CardCategory)enumset.next();
            if (h.contains(cardcategory))
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
        if (j == null || !a())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        j.a(cz.d(c));
        return true;
        Exception exception;
        exception;
        AppboyLogger.w(i, "Failed to log feed card clicked.", exception);
        return false;
    }

    public boolean logImpression()
    {
        if (j == null || k == null || !a())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        j.a(cz.c(c));
        k.a(c);
        return true;
        Exception exception;
        exception;
        AppboyLogger.w(i, "Failed to log feed card impression.", exception);
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
        ei ei1 = k;
        String s1 = c;
        if (!ei1.d.contains(s1))
        {
            ei1.d.add(s1);
            ei1.a(ei1.d, ej.a);
        }
        return;
        Exception exception;
        exception;
        String s = i;
        return;
    }

    public void setViewed(boolean flag)
    {
        d = flag;
    }

}
