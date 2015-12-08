// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model.metadata;

import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Person
{

    private static final String SEPARATOR_DEFAULT = (new StringBuilder()).append(Resources.string(0x7f070517)).append(" ").toString();
    private String _id;
    private String _name;
    private String _type;

    public Person()
    {
    }

    public Person(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            _id = pinterestjsonobject.a("id", "");
            _name = pinterestjsonobject.a("name", "");
            _type = pinterestjsonobject.a("type", "");
            return;
        }
    }

    public static List getPersons(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (pinterestjsonarray != null)
        {
            int i = 0;
            int j = pinterestjsonarray.a();
            while (i < j) 
            {
                arraylist.add(new Person(pinterestjsonarray.c(i)));
                i++;
            }
        }
        return arraylist;
    }

    public static String makePeopleDataDisplay(List list)
    {
        return makePeopleDataDisplay(list, SEPARATOR_DEFAULT);
    }

    public static String makePeopleDataDisplay(List list, String s)
    {
        if (list == null || list.size() == 0)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < Math.min(6, list.size()); i++)
        {
            stringbuilder.append(((Person)list.get(i)).getName()).append(s);
        }

        return StringUtils.removeEnd(stringbuilder.toString(), s);
    }

    public String getId()
    {
        return _id;
    }

    public String getName()
    {
        return _name;
    }

    public String getType()
    {
        return _type;
    }

    public void setId(String s)
    {
        _id = s;
    }

    public void setName(String s)
    {
        _name = s;
    }

    public void setType(String s)
    {
        _type = s;
    }

}
