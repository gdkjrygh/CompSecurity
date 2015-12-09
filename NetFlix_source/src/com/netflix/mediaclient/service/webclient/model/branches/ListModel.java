// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.branches;

import java.util.List;

public abstract class ListModel
    implements List
{

    private Object summary;

    public ListModel()
    {
    }

    public Object getSummary()
    {
        return summary;
    }
}
