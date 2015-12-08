// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityManagerCompat

class erCompat
    implements tenerBridge
{

    final erCompat.onAccessibilityStateChanged this$0;
    final erCompat val$listener;

    public void onAccessibilityStateChanged(boolean flag)
    {
        val$listener.onAccessibilityStateChanged(flag);
    }

    erCompat()
    {
        this$0 = final_ercompat;
        val$listener = erCompat.this;
        super();
    }
}
