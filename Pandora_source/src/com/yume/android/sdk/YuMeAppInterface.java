// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import android.content.Context;

// Referenced classes of package com.yume.android.sdk:
//            YuMeAdBlockType, YuMeAdEvent

public interface YuMeAppInterface
{

    public abstract void YuMeApp_EventListener(YuMeAdBlockType yumeadblocktype, YuMeAdEvent yumeadevent, String s);

    public abstract Context YuMeApp_GetActivityContext();

    public abstract Context YuMeApp_GetApplicationContext();
}
