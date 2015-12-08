// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import me.lyft.android.infrastructure.lyft.AppStateDTO;

// Referenced classes of package me.lyft.android:
//            IAppStateHandler, UserSession, IUserSession

public class AppStateHandler
    implements IAppStateHandler
{

    private final UserSession userSession;

    AppStateHandler(IUserSession iusersession)
    {
        userSession = (UserSession)iusersession;
    }

    public void setAppState(AppStateDTO appstatedto)
    {
        userSession.setAppState(appstatedto);
    }
}
