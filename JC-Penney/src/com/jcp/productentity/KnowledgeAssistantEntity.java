// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;

public class KnowledgeAssistantEntity
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String assetReferenceURL;
    private String dhtml;
    private String editor;
    private String endDate;
    private String kaId;
    private Boolean pdfAssetReference;
    private String startDate;
    private String title;
    private String type;

    public KnowledgeAssistantEntity()
    {
    }

    public String getAssetReferenceURL()
    {
        if (assetReferenceURL == null)
        {
            assetReferenceURL = "";
        }
        return assetReferenceURL;
    }

    public String getDhtml()
    {
        return dhtml;
    }

    public String getEditor()
    {
        if (editor == null)
        {
            editor = "";
        }
        return editor;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public String getKaId()
    {
        if (kaId == null)
        {
            kaId = "";
        }
        return kaId;
    }

    public Boolean getPdfAssetReference()
    {
        return pdfAssetReference;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public String getTitle()
    {
        if (title == null)
        {
            title = "";
        }
        return title;
    }

    public String getType()
    {
        return type;
    }

    public void setAssetReferenceURL(String s)
    {
        assetReferenceURL = s;
    }

    public void setDhtml(String s)
    {
        dhtml = s;
    }

    public void setEditor(String s)
    {
        editor = s;
    }

    public void setEndDate(String s)
    {
        endDate = s;
    }

    public void setKaId(String s)
    {
        kaId = s;
    }

    public void setPdfAssetReference(Boolean boolean1)
    {
        pdfAssetReference = boolean1;
    }

    public void setStartDate(String s)
    {
        startDate = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
