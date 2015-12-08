// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.model;

import java.util.List;
import org.json.JSONArray;

public interface GraphObjectList
    extends List
{

    public abstract GraphObjectList castToListOf(Class class1);

    public abstract JSONArray getInnerJSONArray();
}
