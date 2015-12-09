// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.model;


// Referenced classes of package com.facebook.model:
//            GraphObject, GraphLocation

public interface GraphUser
    extends GraphObject
{

    public abstract String getBirthday();

    public abstract String getFirstName();

    public abstract String getId();

    public abstract String getLastName();

    public abstract String getLink();

    public abstract GraphLocation getLocation();

    public abstract String getMiddleName();

    public abstract String getName();

    public abstract String getUsername();

    public abstract void setBirthday(String s);

    public abstract void setFirstName(String s);

    public abstract void setId(String s);

    public abstract void setLastName(String s);

    public abstract void setLink(String s);

    public abstract void setLocation(GraphLocation graphlocation);

    public abstract void setMiddleName(String s);

    public abstract void setName(String s);

    public abstract void setUsername(String s);
}
