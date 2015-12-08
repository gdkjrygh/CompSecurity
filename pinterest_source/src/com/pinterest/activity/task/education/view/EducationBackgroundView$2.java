// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import com.pinterest.schemas.experiences.EducationTransition;

class 
{

    static final int $SwitchMap$com$pinterest$schemas$experiences$EducationTransition[];

    static 
    {
        $SwitchMap$com$pinterest$schemas$experiences$EducationTransition = new int[EducationTransition.values().length];
        try
        {
            $SwitchMap$com$pinterest$schemas$experiences$EducationTransition[EducationTransition.CAROUSEL_SCALE_FORWARD.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$pinterest$schemas$experiences$EducationTransition[EducationTransition.CAROUSEL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$pinterest$schemas$experiences$EducationTransition[EducationTransition.SCALE_FORWARD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$pinterest$schemas$experiences$EducationTransition[EducationTransition.SCALE_BACK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
