// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.model;

import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.ExperienceCompleteAction;
import com.pinterest.schemas.experiences.TooltipDisplayType;

public class EducationToolTip
{

    public final int anchorPoint;
    public final int completeAction;
    public final String completeButtonText;
    public final String descriptionText;
    public final String dismissButtonText;
    public final int displayType;
    public final int id;
    public final String titleText;

    public EducationToolTip(PinterestJsonObject pinterestjsonobject)
    {
        id = pinterestjsonobject.a("id", 0);
        titleText = pinterestjsonobject.a("title_text", "");
        descriptionText = pinterestjsonobject.a("description_text", "");
        dismissButtonText = pinterestjsonobject.a("dismiss_button_text", "");
        completeButtonText = pinterestjsonobject.a("complete_button_text", "");
        completeAction = pinterestjsonobject.a("complete_action", ExperienceCompleteAction.COMPLETE.getValue());
        anchorPoint = pinterestjsonobject.a("anchor_to", 0);
        displayType = pinterestjsonobject.a("display_type", TooltipDisplayType.IMMEDIATE.getValue());
    }
}
