// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import com.googlecode.flickrjandroid.util.StringUtilities;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Permissions
    implements Serializable
{

    public static final long serialVersionUID = 12L;
    private int addmeta;
    private int comment;
    private boolean familyFlag;
    private boolean friendFlag;
    private String id;
    private boolean publicFlag;

    public Permissions()
    {
        comment = 0;
        addmeta = 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Method amethod[];
        int i;
        obj = (Permissions)obj;
        amethod = getClass().getMethods();
        i = 0;
_L8:
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
        if (!s.equals("int")) goto _L7; else goto _L6
_L6:
        if (!((Integer)obj1).equals((Integer)obj2))
        {
            return false;
        }
          goto _L5
_L7:
        if (s.equals("boolean"))
        {
            if (!((Boolean)obj1).equals((Boolean)obj2))
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
                System.out.println((new StringBuilder("equals ")).append(amethod[i].getName()).append(" ").append(illegalaccessexception).toString());
            }
            catch (InvocationTargetException invocationtargetexception) { }
            catch (Exception exception)
            {
                System.out.println((new StringBuilder("equals ")).append(amethod[i].getName()).append(" ").append(exception).toString());
            }
        }
_L5:
        i++;
          goto _L8
    }

    public int getAddmeta()
    {
        return addmeta;
    }

    public int getComment()
    {
        return comment;
    }

    public String getId()
    {
        return id;
    }

    public int hashCode()
    {
        return id.hashCode() + 87 + (new Integer(comment)).hashCode() + (new Integer(addmeta)).hashCode() + (new Boolean(publicFlag)).hashCode() + (new Boolean(friendFlag)).hashCode() + (new Boolean(familyFlag)).hashCode();
    }

    public boolean isFamilyFlag()
    {
        return familyFlag;
    }

    public boolean isFriendFlag()
    {
        return friendFlag;
    }

    public boolean isPublicFlag()
    {
        return publicFlag;
    }

    public void setAddmeta(int i)
    {
        addmeta = i;
    }

    public void setAddmeta(String s)
    {
        if (s != null)
        {
            setAddmeta(Integer.parseInt(s));
        }
    }

    public void setComment(int i)
    {
        comment = i;
    }

    public void setComment(String s)
    {
        if (s != null)
        {
            setComment(Integer.parseInt(s));
        }
    }

    public void setFamilyFlag(boolean flag)
    {
        familyFlag = flag;
    }

    public void setFriendFlag(boolean flag)
    {
        friendFlag = flag;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setPublicFlag(boolean flag)
    {
        publicFlag = flag;
    }
}
