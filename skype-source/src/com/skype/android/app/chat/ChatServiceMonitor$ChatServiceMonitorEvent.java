// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            ChatServiceMonitor

public class show
{

    private show prop;
    private boolean show;
    final ChatServiceMonitor this$0;

    public show getProp()
    {
        return prop;
    }

    public boolean getShow()
    {
        return show;
    }

    public void saveData(show show1, boolean flag)
    {
        prop = show1;
        show = flag;
    }

    public ( , boolean flag)
    {
        this$0 = ChatServiceMonitor.this;
        super();
        prop = ;
        show = flag;
    }
}
