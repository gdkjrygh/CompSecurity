// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.addressbook;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PropertySet
{

    private static final String PROPKEY_EMAIL = "email";
    private static final String PROPKEY_ID = "id";
    private static final String PROPKEY_PHONE = "phone";
    private final ArrayList properties;

    public PropertySet()
    {
        properties = new ArrayList();
    }

    public PropertySet(int i)
    {
        properties = new ArrayList(i);
    }

    private List getListOfValues(String s, int i)
    {
        ArrayList arraylist = new ArrayList(i);
        Iterator iterator = properties.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Pair pair = (Pair)iterator.next();
            if (s.equals(pair.first))
            {
                arraylist.add(pair.second);
            }
        } while (true);
        if (arraylist.size() < i)
        {
            for (int j = arraylist.size(); j < i; j++)
            {
                arraylist.add("");
            }

        }
        return arraylist;
    }

    public void addEmail(String s)
    {
        addProperty("email", s);
    }

    public void addPhone(String s)
    {
        addProperty("phone", s);
    }

    protected void addProperty(String s, String s1)
    {
        s = Pair.create(s, s1);
        if (!properties.contains(s))
        {
            properties.add(s);
        }
    }

    public int countEmails()
    {
        int i = 0;
        Iterator iterator = properties.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((Pair)iterator.next()).first == "email")
            {
                i++;
            }
        } while (true);
        return i;
    }

    public int countPhones()
    {
        int i = 0;
        Iterator iterator = properties.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((Pair)iterator.next()).first == "phone")
            {
                i++;
            }
        } while (true);
        return i;
    }

    public List getEmails(int i)
    {
        return getListOfValues("email", i);
    }

    public String getId()
    {
        for (Iterator iterator = properties.iterator(); iterator.hasNext();)
        {
            Pair pair = (Pair)iterator.next();
            if (pair.first == "id")
            {
                return (String)pair.second;
            }
        }

        return null;
    }

    public List getPhones(int i)
    {
        return getListOfValues("phone", i);
    }

    protected String getPropertyKey(int i)
    {
        String s = null;
        Pair pair = (Pair)properties.get(i);
        if (pair != null)
        {
            s = (String)pair.first;
        }
        return s;
    }

    protected String getPropertyValue(int i)
    {
        String s = null;
        Pair pair = (Pair)properties.get(i);
        if (pair != null)
        {
            s = (String)pair.second;
        }
        return s;
    }

    public boolean hasData()
    {
        for (Iterator iterator = properties.iterator(); iterator.hasNext();)
        {
            if (((Pair)iterator.next()).first != "id")
            {
                return true;
            }
        }

        return false;
    }

    public boolean hasId(String s)
    {
        for (Iterator iterator = properties.iterator(); iterator.hasNext();)
        {
            Pair pair = (Pair)iterator.next();
            if (pair.first == "id" && ((String)pair.second).equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public void setName(String s)
    {
        addProperty("id", s);
    }

    public int size()
    {
        return properties.size();
    }
}
