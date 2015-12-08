// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateJBMR2, ActionBarActivity

class ActionBarActivityDelegateApi20 extends ActionBarActivityDelegateJBMR2
{
    class WindowCallbackWrapperApi20 extends ActionBarActivityDelegateICS.WindowCallbackWrapper
    {

        final ActionBarActivityDelegateApi20 this$0;

        WindowCallbackWrapperApi20(android.view.Window.Callback callback)
        {
            this$0 = ActionBarActivityDelegateApi20.this;
            super(ActionBarActivityDelegateApi20.this, callback);
        }
    }


    ActionBarActivityDelegateApi20(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    android.view.Window.Callback createWindowCallbackWrapper(android.view.Window.Callback callback)
    {
        return new WindowCallbackWrapperApi20(callback);
    }
}
