// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            ScreenOrientationProvider, ScreenOrientationListener

static final class 
    implements Runnable
{

    public void run()
    {
        ScreenOrientationListener.getInstance().startAccurateListening();
    }

    ()
    {
    }
}
