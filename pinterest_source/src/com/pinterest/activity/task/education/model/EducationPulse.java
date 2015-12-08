// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.model;

import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.AndroidEducationAnchor;
import com.pinterest.schemas.experiences.EducationAction;

public class EducationPulse
{

    public static final int SCROLL_DISABLE = 1;
    public static final int SCROLL_NONE = 0;
    public static final int SCROLL_SUSPEND = 2;
    public static final int TOUCH_PULSE = 2;
    public static final int TOUCH_TARGET = 1;
    private EducationAction _action;
    private AndroidEducationAnchor _anchor;
    private int _scrollAction;
    private int _touchTarget;

    public EducationPulse(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            _action = EducationAction.findByValue(pinterestjsonobject.a("desired_action", 0));
            _anchor = AndroidEducationAnchor.findByValue(pinterestjsonobject.a("anchor_to", 0));
            _touchTarget = pinterestjsonobject.a("touch_target", 1);
            _scrollAction = pinterestjsonobject.a("scroll_action", 0);
            return;
        }
    }

    public EducationAction getAction()
    {
        return _action;
    }

    public AndroidEducationAnchor getAnchor()
    {
        return _anchor;
    }

    public int getScrollAction()
    {
        return _scrollAction;
    }

    public int getTouchTarget()
    {
        return _touchTarget;
    }
}
