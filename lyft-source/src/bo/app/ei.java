// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.Constants;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.models.cards.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            fa, ej, cr, bx

public class ei
{

    public static final String a;
    private static final fa f = fa.a(";").b();
    public final SharedPreferences b;
    public final Set c;
    public final Set d;
    public bx e;

    public ei(Context context, String s)
    {
        String s1;
        if (s == null)
        {
            s1 = "";
        } else
        {
            s1 = (new StringBuilder(".")).append(s).toString();
        }
        b = context.getSharedPreferences((new StringBuilder("com.appboy.storage.feedstorageprovider")).append(s1).toString(), 0);
        c = a(ej.b);
        d = a(ej.a);
        context = b.edit();
        context.putString("uid", s);
        context.apply();
    }

    private Set a(ej ej1)
    {
        Object obj = ej1.c;
        String s = ej1.d;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            return b(b.getString(s, null));
        }
        if (b.contains(s))
        {
            obj = b(b.getString(s, null));
            android.content.SharedPreferences.Editor editor = b.edit();
            editor.remove(s);
            editor.apply();
            a(((Set) (obj)), ej1);
            return ((Set) (obj));
        } else
        {
            return b.getStringSet(((String) (obj)), new HashSet());
        }
    }

    public static Set a(JSONArray jsonarray)
    {
        HashSet hashset = new HashSet();
        if (jsonarray != null)
        {
            for (int i = 0; i < jsonarray.length(); i++)
            {
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                if (jsonobject.has("id"))
                {
                    hashset.add(jsonobject.getString("id"));
                }
            }

        }
        return hashset;
    }

    private static Set b(String s)
    {
        HashSet hashset = new HashSet();
        if (s != null)
        {
            Collections.addAll(hashset, s.split(";"));
        }
        return hashset;
    }

    public final FeedUpdatedEvent a(JSONArray jsonarray, String s, boolean flag, long l)
    {
        Iterator iterator;
        if (jsonarray == null || jsonarray.length() == 0)
        {
            jsonarray = new ArrayList();
        } else
        {
            jsonarray = cr.a(jsonarray, com/appboy/models/cards/Card, e, this);
        }
        iterator = jsonarray.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Card card = (Card)iterator.next();
            if (c.contains(card.getId()))
            {
                card.setViewed(true);
                card.setIsRead(true);
            }
            if (d.contains(card.getId()))
            {
                card.setIsRead(true);
            }
        } while (true);
        return new FeedUpdatedEvent(jsonarray, s, flag, l);
    }

    public final void a(String s)
    {
        if (c.contains(s))
        {
            return;
        } else
        {
            c.add(s);
            a(c, ej.b);
            return;
        }
    }

    public final void a(Set set, ej ej1)
    {
        String s = ej1.c;
        ej1 = ej1.d;
        android.content.SharedPreferences.Editor editor = b.edit();
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            if (set == null || set.isEmpty())
            {
                editor.remove(ej1);
            } else
            {
                editor.putString(ej1, f.a(set));
            }
        } else
        if (set == null || set.isEmpty())
        {
            editor.remove(s);
        } else
        {
            editor.putStringSet(s, set);
        }
        editor.apply();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/ei.getName()
        });
    }
}
