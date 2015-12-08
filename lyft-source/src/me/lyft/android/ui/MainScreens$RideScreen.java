// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import me.lyft.android.common.Objects;

// Referenced classes of package me.lyft.android.ui:
//            MainScreens

public class  extends MainScreens
{

    private boolean switchToDriverMode;
    private String webDialogUrl;

    public  enableSwitchToDriverMode()
    {
        switchToDriverMode = true;
        return this;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (switchToDriverMode)obj;
            if (switchToDriverMode != ((switchToDriverMode) (obj)).switchToDriverMode || !Objects.equals(webDialogUrl, ((webDialogUrl) (obj)).webDialogUrl))
            {
                return false;
            }
        }
        return true;
    }

    public String getWebDialogParams()
    {
        return webDialogUrl;
    }

    public boolean isSwitchToDriverMode()
    {
        return switchToDriverMode;
    }

    public void resetSwitchToDriverMode()
    {
        switchToDriverMode = false;
    }

    public void resetWebDialogUrl()
    {
        webDialogUrl = null;
    }

    public webDialogUrl setWebDialogUrl(String s)
    {
        webDialogUrl = s;
        return this;
    }

    public ()
    {
    }
}
