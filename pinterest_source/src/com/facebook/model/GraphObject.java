// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.model;

import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.facebook.model:
//            GraphObjectList

public interface GraphObject
{

    public abstract Map asMap();

    public abstract GraphObject cast(Class class1);

    public abstract JSONObject getInnerJSONObject();

    public abstract Object getProperty(String s);

    public abstract GraphObject getPropertyAs(String s, Class class1);

    public abstract GraphObjectList getPropertyAsList(String s, Class class1);

    public abstract void removeProperty(String s);

    public abstract void setProperty(String s, Object obj);
}
