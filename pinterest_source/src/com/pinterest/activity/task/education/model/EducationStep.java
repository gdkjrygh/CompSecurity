// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.model;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.ExperienceCompleteAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.pinterest.activity.task.education.model:
//            EducationBackground, EducationForeground

public class EducationStep
{

    private EducationBackground _background;
    private int _completeAction;
    private EducationForeground _foreground;
    private int _id;

    public EducationStep(PinterestJsonObject pinterestjsonobject)
    {
        _background = new EducationBackground(pinterestjsonobject.c("background_view"));
        _foreground = new EducationForeground(pinterestjsonobject.c("foreground_card"));
        _completeAction = pinterestjsonobject.a("complete_action", 0);
        _id = pinterestjsonobject.a("id", 0);
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        if (pinterestjsonarray != null && pinterestjsonarray.a() != 0) goto _L2; else goto _L1
_L1:
        Object obj = Collections.EMPTY_LIST;
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        int i = 0;
        int j = pinterestjsonarray.a();
        do
        {
            obj = arraylist;
            if (i >= j)
            {
                continue;
            }
            arraylist.add(new EducationStep(pinterestjsonarray.d(i)));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public EducationBackground getBackground()
    {
        return _background;
    }

    public int getCompleteAction()
    {
        return _completeAction;
    }

    public EducationForeground getForeground()
    {
        return _foreground;
    }

    public int getId()
    {
        return _id;
    }

    public boolean shouldComplete()
    {
        return ExperienceCompleteAction.COMPLETE.getValue() == _completeAction || ExperienceCompleteAction.COMPLETE_AND_SHOW.getValue() == _completeAction;
    }
}
