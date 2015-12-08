// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.model;

import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.AndroidEducationAnchor;

// Referenced classes of package com.pinterest.activity.task.education.model:
//            EducationPulse

public class EducationBackground
{

    private AndroidEducationAnchor _anchor;
    private EducationPulse _pulse;
    private int _transition;
    private int _type;
    private String _url;

    public EducationBackground(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            _type = pinterestjsonobject.a("type", 0);
            _transition = pinterestjsonobject.a("transition", 0);
            _url = pinterestjsonobject.a("url", "");
            _anchor = AndroidEducationAnchor.findByValue(pinterestjsonobject.a("anchor_to", 0));
            _pulse = new EducationPulse(pinterestjsonobject.c("pulse"));
            return;
        }
    }

    public AndroidEducationAnchor getAnchor()
    {
        return _anchor;
    }

    public EducationPulse getPulse()
    {
        return _pulse;
    }

    public int getTransition()
    {
        return _transition;
    }

    public int getType()
    {
        return _type;
    }

    public String getUrl()
    {
        return _url;
    }
}
