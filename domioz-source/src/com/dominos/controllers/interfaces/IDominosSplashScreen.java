// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers.interfaces;


// Referenced classes of package com.dominos.controllers.interfaces:
//            IDominosView

public interface IDominosSplashScreen
    extends IDominosView
{

    public abstract void onLoadingComplete();

    public abstract void showAlertDialog(int i, String s);

    public abstract void showGooglePlayServicesDialog(int i, android.content.DialogInterface.OnCancelListener oncancellistener);
}
