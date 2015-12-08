// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageImmersiveBase;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package me.lyft.android.ui:
//            Dialogs

public class appboyMessage extends Dialogs
{

    private static final String EMPTY_STRING = "";
    private IInAppMessage appboyMessage;

    public IInAppMessage getAppboyMessage()
    {
        return appboyMessage;
    }

    public int getBackgroundColor()
    {
        return appboyMessage.getBackgroundColor();
    }

    public List getButtons()
    {
        ArrayList arraylist = new ArrayList();
        if (appboyMessage instanceof InAppMessageImmersiveBase)
        {
            List list = ((InAppMessageImmersiveBase)appboyMessage).getMessageButtons();
            if (list != null)
            {
                return list;
            }
        }
        return arraylist;
    }

    public String getHeader()
    {
        if (appboyMessage instanceof InAppMessageImmersiveBase)
        {
            return ((InAppMessageImmersiveBase)appboyMessage).getHeader();
        } else
        {
            return "";
        }
    }

    public int getTitleColor()
    {
        if (appboyMessage instanceof InAppMessageImmersiveBase)
        {
            return ((InAppMessageImmersiveBase)appboyMessage).getHeaderTextColor();
        } else
        {
            return 0x7f0c00a4;
        }
    }

    public (IInAppMessage iinappmessage)
    {
        appboyMessage = iinappmessage;
    }
}
