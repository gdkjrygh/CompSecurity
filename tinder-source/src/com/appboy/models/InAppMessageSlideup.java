// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models;

import bo.app.bx;
import bo.app.eo;
import com.appboy.enums.inappmessage.SlideFrom;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//            InAppMessageBase

public class InAppMessageSlideup extends InAppMessageBase
{

    private SlideFrom e;
    private int f;

    public InAppMessageSlideup()
    {
        e = SlideFrom.BOTTOM;
    }

    public InAppMessageSlideup(JSONObject jsonobject, bx bx)
    {
        this(jsonobject, bx, (SlideFrom)eo.a(jsonobject, "slide_from", com/appboy/enums/inappmessage/SlideFrom, SlideFrom.BOTTOM), jsonobject.optInt("close_btn_color"));
    }

    private InAppMessageSlideup(JSONObject jsonobject, bx bx, SlideFrom slidefrom, int i)
    {
        super(jsonobject, bx);
        e = SlideFrom.BOTTOM;
        e = slidefrom;
        if (e == null)
        {
            e = SlideFrom.BOTTOM;
        }
        f = i;
    }

    public int getChevronColor()
    {
        return f;
    }

    public SlideFrom getSlideFrom()
    {
        return e;
    }

    public void setChevronColor(int i)
    {
        f = i;
    }

    public void setSlideFrom(SlideFrom slidefrom)
    {
        e = slidefrom;
    }
}
