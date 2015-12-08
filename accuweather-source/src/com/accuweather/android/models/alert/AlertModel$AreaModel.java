// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.alert;

import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models.alert:
//            AlertModel

public class alertText
    implements Serializable
{

    private static final long serialVersionUID = 0xb385e02a4cb00c76L;
    private String alertText;
    private String endTime;
    private String name;
    final AlertModel this$0;

    public String getAlertText()
    {
        return alertText;
    }

    public String getEndTime()
    {
        return endTime;
    }

    public String getName()
    {
        return name;
    }

    public void setAlertText(String s)
    {
        alertText = s;
    }

    public void setEndTime(String s)
    {
        endTime = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public ()
    {
        this$0 = AlertModel.this;
        super();
        name = "";
        endTime = "";
        alertText = "";
    }
}
