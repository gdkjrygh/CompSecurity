// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed.data;

import android.content.Context;
import android.content.Intent;
import com.google.gson.e;
import com.htc.sphere.intent.GsonUtils;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.htc.blinkfeed.data:
//            Storable, User, Cover

public class Story extends Storable
{

    Intent action;
    String content;
    Cover cover;
    long created;
    ArrayList filterTypes;
    String iconUrl;
    String id;
    boolean isHighlight;
    Context mContext;
    User publisher;
    String title;
    int type;

    public Story()
    {
        publisher = new User();
        cover = new Cover();
    /* block-local class not found */
    class Type {}

        type = Type.access._mth2(Type.TEXT);
        isHighlight = false;
        filterTypes = new ArrayList();
        mContext = null;
    }

    private static String generateActionStr(String s, Intent intent)
    {
        if (intent == null)
        {
            return "";
        } else
        {
            s = new com.htc.sphere.intent.MenuUtils.SimpleMenuItem(0, s, 0, 0, intent);
            return GsonUtils.getGson().b(s);
        }
    }

    public void addFilter(String s)
    {
        filterTypes.add(s);
    }

    String getAction()
    {
        return generateActionStr(mContext.getPackageName(), action);
    }

    public Cover getCover()
    {
        return cover;
    }

    String getFilterTypes()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (isHighlight)
        {
            stringbuilder.append("highlights");
        }
        Iterator iterator = filterTypes.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return stringbuilder.toString();
            }
            String s = (String)iterator.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(s);
        } while (true);
    }

    public String getId()
    {
        return id;
    }

    public User getPublisher()
    {
        return publisher;
    }

    public boolean isHighlight()
    {
        return isHighlight;
    }

    public void setAction(Intent intent)
    {
        action = intent;
    }

    public void setContent(String s)
    {
        content = s;
    }

    public void setCreated(long l)
    {
        created = l;
    }

    public void setHighlight(boolean flag)
    {
        isHighlight = flag;
    }

    public void setIcon(String s)
    {
        iconUrl = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setType(Type type1)
    {
        type = Type.access._mth2(type1);
    }
}
