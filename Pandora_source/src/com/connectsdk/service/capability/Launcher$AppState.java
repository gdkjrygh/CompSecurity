// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service.capability;


// Referenced classes of package com.connectsdk.service.capability:
//            Launcher

public static class visible
{

    public String castChatMessageUrl;
    public boolean running;
    public String state;
    public boolean visible;

    public void setState(String s)
    {
        state = s;
        running = "running".equals(s);
        visible = running;
    }

    public _cls9()
    {
        this(false, false);
    }

    public <init>(boolean flag, boolean flag1)
    {
        castChatMessageUrl = null;
        state = null;
        running = flag;
        visible = flag1;
    }
}
