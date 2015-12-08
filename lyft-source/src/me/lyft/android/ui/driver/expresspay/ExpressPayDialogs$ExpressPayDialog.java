// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import com.lyft.scoop.Screen;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            ExpressPayDialogs

public class message extends ExpressPayDialogs
{

    private String buttonText;
    private Integer icon;
    private String message;
    private boolean showCloseButton;
    private Screen targetScreen;
    private String textUrl;
    private String textUrlLabel;
    private String title;
    private Integer titleIcon;

    public String getButtonText()
    {
        return buttonText;
    }

    public Integer getIcon()
    {
        return icon;
    }

    public String getMessage()
    {
        return message;
    }

    public Screen getTargetScreen()
    {
        return targetScreen;
    }

    public String getTextUrl()
    {
        return textUrl;
    }

    public String getTextUrlLabel()
    {
        return textUrlLabel;
    }

    public String getTitle()
    {
        return title;
    }

    public Integer getTitleIcon()
    {
        return titleIcon;
    }

    public titleIcon setButtonText(String s)
    {
        buttonText = s;
        return this;
    }

    public buttonText setIcon(Integer integer)
    {
        icon = integer;
        return this;
    }

    public icon setMessage(String s)
    {
        message = s;
        return this;
    }

    public message setShowCloseButton(boolean flag)
    {
        showCloseButton = flag;
        return this;
    }

    public showCloseButton setTargetScreen(Screen screen)
    {
        targetScreen = screen;
        return this;
    }

    public targetScreen setTextUrl(String s)
    {
        textUrl = s;
        return this;
    }

    public textUrl setTextUrlLabel(String s)
    {
        textUrlLabel = s;
        return this;
    }

    public textUrlLabel setTitle(String s)
    {
        title = s;
        return this;
    }

    public title setTitleIcon(Integer integer)
    {
        titleIcon = integer;
        return this;
    }

    public boolean showCloseButton()
    {
        return showCloseButton;
    }

    public ()
    {
        showCloseButton = true;
    }

    public showCloseButton(String s)
    {
        showCloseButton = true;
        message = s;
    }
}
