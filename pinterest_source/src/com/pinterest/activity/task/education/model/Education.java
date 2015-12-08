// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.model;

import android.os.Handler;
import android.os.Looper;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.EducationTriggerType;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.pinterest.activity.task.education.model:
//            EducationStep, EducationFlyout, EducationToolTip, EducationGradientText

public class Education
{

    public static final int DELAY = 2000;
    public static final int DELAY_SHORT = 1000;
    private static Handler sHandler;
    private String _detailTitle;
    private String _eid;
    private EducationFlyout _flyout;
    private EducationGradientText _gradientText;
    private String _id;
    private boolean _isAutomatic;
    private boolean _isEmpty;
    private boolean _isFlyout;
    private boolean _isTriggered;
    private String _pid;
    private String _promptTitle;
    private List _steps;
    private EducationToolTip _toolTip;
    private PinterestJsonArray _triggerable;

    public Education(PinterestJsonObject pinterestjsonobject)
    {
        _steps = Collections.EMPTY_LIST;
        parse(pinterestjsonobject);
    }

    public Education(PinterestJsonObject pinterestjsonobject, String s)
    {
        _steps = Collections.EMPTY_LIST;
        parse(pinterestjsonobject.c(s));
    }

    public static Handler getHandler()
    {
        if (sHandler == null)
        {
            sHandler = new Handler(Looper.getMainLooper());
        }
        return sHandler;
    }

    private void parse(PinterestJsonObject pinterestjsonobject)
    {
        boolean flag1 = true;
        if (pinterestjsonobject != null)
        {
            _id = pinterestjsonobject.a("id", "");
            if (_id != null)
            {
                _pid = _id.split(":")[0];
            }
            _eid = pinterestjsonobject.a("experience_id", "");
            pinterestjsonobject = pinterestjsonobject.c("display_data");
            if (pinterestjsonobject == null || pinterestjsonobject.c() == 0)
            {
                _isEmpty = true;
                return;
            }
            _isEmpty = false;
            int i = pinterestjsonobject.a("trigger", 0);
            boolean flag;
            if (i == EducationTriggerType.AUTOMATIC.getValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _isAutomatic = flag;
            if (i == EducationTriggerType.FLYOUT.getValue())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            _isFlyout = flag;
            _isTriggered = _isAutomatic;
            _steps = EducationStep.makeAll(pinterestjsonobject.e("steps"));
            if (_isFlyout)
            {
                _flyout = new EducationFlyout(pinterestjsonobject.a("flyout_text", ""));
            }
            if (pinterestjsonobject.f("tooltip"))
            {
                _toolTip = new EducationToolTip(pinterestjsonobject.c("tooltip"));
            }
            if (pinterestjsonobject.f("title_text"))
            {
                _promptTitle = pinterestjsonobject.a("title_text", "");
            }
            if (pinterestjsonobject.f("detail_text"))
            {
                _detailTitle = pinterestjsonobject.a("detail_text", "");
            }
            if (pinterestjsonobject.c("gradient") != null)
            {
                _gradientText = new EducationGradientText(pinterestjsonobject.c("gradient"));
                return;
            }
        }
    }

    public static void removeCallbacks(Runnable runnable)
    {
        getHandler().removeCallbacks(runnable);
    }

    public static void showDelayed(Runnable runnable)
    {
        showDelayed(runnable, 2000);
    }

    public static void showDelayed(Runnable runnable, int i)
    {
        getHandler().postDelayed(runnable, i);
    }

    public String getDetailTitle()
    {
        return _detailTitle;
    }

    public String getEid()
    {
        return _eid;
    }

    public ExperienceValue getExperienceValue()
    {
        return Experiences.a(_pid);
    }

    public EducationFlyout getFlyout()
    {
        return _flyout;
    }

    public EducationGradientText getGradientText()
    {
        return _gradientText;
    }

    public String getId()
    {
        return _id;
    }

    public String getPid()
    {
        return _pid;
    }

    public String getPromptTitle()
    {
        return _promptTitle;
    }

    public List getSteps()
    {
        return _steps;
    }

    public EducationToolTip getToolTip()
    {
        return _toolTip;
    }

    public boolean isAutomatic()
    {
        return _isAutomatic;
    }

    public boolean isEmpty()
    {
        return _isEmpty;
    }

    public boolean isFlyout()
    {
        return _isFlyout;
    }

    public boolean isTriggered()
    {
        return _isTriggered;
    }

    public void setIsFlyout(boolean flag)
    {
        _isFlyout = flag;
    }

    public void setTriggered(boolean flag)
    {
        _isTriggered = flag;
    }
}
