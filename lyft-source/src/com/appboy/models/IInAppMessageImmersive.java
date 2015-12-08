// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models;

import java.util.List;

// Referenced classes of package com.appboy.models:
//            IInAppMessage, MessageButton

public interface IInAppMessageImmersive
    extends IInAppMessage
{

    public abstract int getCloseButtonColor();

    public abstract String getHeader();

    public abstract int getHeaderTextColor();

    public abstract List getMessageButtons();

    public abstract boolean logButtonClick(MessageButton messagebutton);

    public abstract void setCloseButtonColor(int i);

    public abstract void setHeader(String s);

    public abstract void setHeaderTextColor(int i);

    public abstract void setMessageButtons(List list);
}
