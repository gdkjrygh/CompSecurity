// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.model;

import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.EducationPosition;

// Referenced classes of package com.pinterest.activity.task.education.model:
//            EducationButton

public class EducationForeground
{

    private EducationButton _exit;
    private EducationButton _forward;
    private String _text;
    private EducationPosition _yPosition;

    public EducationForeground(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject != null)
        {
            _text = pinterestjsonobject.a("text", "");
            _forward = new EducationButton(pinterestjsonobject.c("forward_button"));
            _exit = new EducationButton(pinterestjsonobject.c("exit_button"));
            _yPosition = EducationPosition.findByValue(pinterestjsonobject.a("y-position", 0));
            if (_yPosition == null)
            {
                _yPosition = EducationPosition.BOTTOM;
                return;
            }
        }
    }

    public EducationButton getExit()
    {
        return _exit;
    }

    public EducationButton getForward()
    {
        return _forward;
    }

    public String getText()
    {
        return _text;
    }

    public EducationPosition getYPosition()
    {
        return _yPosition;
    }
}
