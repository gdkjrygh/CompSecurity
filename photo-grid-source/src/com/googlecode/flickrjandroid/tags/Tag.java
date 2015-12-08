// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.tags;

import com.googlecode.flickrjandroid.util.StringUtilities;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag
    implements Serializable
{

    private static final long serialVersionUID = 12L;
    private String author;
    private String authorName;
    private int count;
    private String id;
    private String raw;
    private String value;

    public Tag()
    {
    }

    public boolean equals(Object obj)
    {
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Method amethod[];
        int i;
        obj = (Tag)obj;
        amethod = getClass().getMethods();
        i = 0;
_L6:
        if (i >= amethod.length)
        {
            return true;
        }
        if (!StringUtilities.getterPattern.matcher(amethod[i].getName()).find() || amethod[i].getName().equals("getClass"))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        Object obj2;
        String s;
        obj1 = amethod[i].invoke(this, null);
        obj2 = amethod[i].invoke(obj, null);
        s = amethod[i].getReturnType().toString();
        if (s.indexOf("class") != 0) goto _L4; else goto _L3
_L3:
        if (obj1 == null || obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!obj1.equals(obj2)) goto _L1; else goto _L5
_L4:
        if (s.equals("int"))
        {
            if (!((Integer)obj1).equals((Integer)obj2))
            {
                return false;
            }
        } else
        {
            try
            {
                System.out.println((new StringBuilder(String.valueOf(amethod[i].getName()))).append("|").append(amethod[i].getReturnType().toString()).toString());
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                System.out.println((new StringBuilder("Size equals ")).append(amethod[i].getName()).append(" ").append(illegalaccessexception).toString());
            }
            catch (InvocationTargetException invocationtargetexception) { }
            catch (Exception exception)
            {
                System.out.println((new StringBuilder("Size equals ")).append(amethod[i].getName()).append(" ").append(exception).toString());
            }
        }
_L5:
        i++;
          goto _L6
    }

    public String getAuthor()
    {
        return author;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    public int getCount()
    {
        return count;
    }

    public String getId()
    {
        return id;
    }

    public String getRaw()
    {
        return raw;
    }

    public String getValue()
    {
        return value;
    }

    public int hashCode()
    {
        int j = (new Integer(count)).hashCode() + 1;
        int i = j;
        if (value != null)
        {
            i = j + value.hashCode();
        }
        j = i;
        if (raw != null)
        {
            j = i + raw.hashCode();
        }
        i = j;
        if (author != null)
        {
            i = j + author.hashCode();
        }
        j = i;
        if (authorName != null)
        {
            j = i + authorName.hashCode();
        }
        i = j;
        if (id != null)
        {
            i = j + id.hashCode();
        }
        return i;
    }

    public void setAuthor(String s)
    {
        author = s;
    }

    public void setAuthorName(String s)
    {
        authorName = s;
    }

    public void setCount(int i)
    {
        count = i;
    }

    public void setCount(String s)
    {
        setCount(Integer.parseInt(s));
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setRaw(String s)
    {
        raw = s;
    }

    public void setValue(String s)
    {
        value = s;
    }
}
