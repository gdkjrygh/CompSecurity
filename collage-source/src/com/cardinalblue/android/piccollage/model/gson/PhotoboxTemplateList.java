// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import java.util.ArrayList;
import java.util.List;

public class PhotoboxTemplateList
{
    public static class PhotoboxTemplate
    {

        private String backgroundUrl;
        private String categoryName;
        private String name;
        private float printingSizeRatio;
        private String templateId;
        private String thumbnailUrl;

        public String getBackgroundUrl()
        {
            return backgroundUrl;
        }

        public String getCategoryName()
        {
            return categoryName;
        }

        public String getName()
        {
            return name;
        }

        public float getPrintingSizeRatio()
        {
            return printingSizeRatio;
        }

        public String getTemplateId()
        {
            return templateId;
        }

        public String getThumbnailUrl()
        {
            return thumbnailUrl;
        }

        public PhotoboxTemplate()
        {
        }
    }


    private List templates;

    public PhotoboxTemplateList()
    {
        templates = new ArrayList();
    }

    public List getTemplates()
    {
        return templates;
    }
}
