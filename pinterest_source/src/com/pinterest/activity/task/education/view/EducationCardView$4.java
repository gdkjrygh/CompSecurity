// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import com.pinterest.schemas.experiences.EducationPosition;

class 
{

    static final int $SwitchMap$com$pinterest$schemas$experiences$EducationPosition[];

    static 
    {
        $SwitchMap$com$pinterest$schemas$experiences$EducationPosition = new int[EducationPosition.values().length];
        try
        {
            $SwitchMap$com$pinterest$schemas$experiences$EducationPosition[EducationPosition.TOP.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$pinterest$schemas$experiences$EducationPosition[EducationPosition.BOTTOM_ABOVE_NAVIGATION.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$pinterest$schemas$experiences$EducationPosition[EducationPosition.BOTTOM.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
