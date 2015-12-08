// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;


// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            MenuCallbackTask, OpenCallbackTask, CloseCallbackTask, linkerSetupCallbackTask, 
//            GoBackCallbackTask, RemoveSplashCallbackTask, MinimizeCallbackTask, MoveCallbackTask

public class CallbackTaskLoader
{

    private CallbackTaskLoader()
    {
    }

    public static void LoadAllTasks()
    {
        MenuCallbackTask.load();
        OpenCallbackTask.load();
        CloseCallbackTask.load();
        linkerSetupCallbackTask.load();
        GoBackCallbackTask.load();
        RemoveSplashCallbackTask.load();
        MinimizeCallbackTask.load();
        MoveCallbackTask.load();
    }
}
