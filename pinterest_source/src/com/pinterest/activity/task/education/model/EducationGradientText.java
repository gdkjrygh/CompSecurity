// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.model;

import com.pinterest.network.json.PinterestJsonObject;

public class EducationGradientText
{

    public final String descriptionText;
    public final String titleText;

    public EducationGradientText(PinterestJsonObject pinterestjsonobject)
    {
        titleText = pinterestjsonobject.a("title_text", "");
        descriptionText = pinterestjsonobject.a("description_text", "");
    }
}
