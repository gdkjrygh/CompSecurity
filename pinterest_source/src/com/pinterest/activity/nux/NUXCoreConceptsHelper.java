// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux;

import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.schemas.experiences.Experience;
import com.pinterest.schemas.experiences.Placement;

public class NUXCoreConceptsHelper
{

    public NUXCoreConceptsHelper()
    {
    }

    public static boolean inCoreConceptsExp()
    {
        ExperienceValue experiencevalue = Experiences.a(String.valueOf(Placement.ANDROID_MAIN_USER_ED.getValue()));
        return experiencevalue != null && experiencevalue.b == Experience.ANDROID_NUX_CORE_CONCEPTS_M5.getValue();
    }
}
