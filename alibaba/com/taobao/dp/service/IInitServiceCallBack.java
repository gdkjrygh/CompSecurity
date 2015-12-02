// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.dp.service;


// Referenced classes of package com.taobao.dp.service:
//            c

public interface IInitServiceCallBack
{

    public abstract void notifyDidChanged(c c, String s);

    public abstract void onInitFinished(c c, int i);
}
