// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.model;

import java.util.List;
import org.json.JSONArray;

public interface CmObjectList
    extends List
{

    public abstract CmObjectList castToListOf(Class class1);

    public abstract JSONArray getInnerJSONArray();
}
