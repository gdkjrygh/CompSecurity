// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import com.netflix.mediaclient.servicemgr.LoLoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.util.StringUtils;

public class LoLoMoSummary
    implements LoLoMo
{

    private String displayName;
    private String id;
    private int length;
    private String lolomosId;

    public LoLoMoSummary()
    {
    }

    public String getId()
    {
        return id;
    }

    public String getLolomosId()
    {
        return lolomosId;
    }

    public int getNumLoMos()
    {
        return length;
    }

    public String getTitle()
    {
        return StringUtils.decodeHtmlEntities(displayName);
    }

    public LoMoType getType()
    {
        return LoMoType.STANDARD;
    }

    public void setId(String s)
    {
        id = s;
    }
}
