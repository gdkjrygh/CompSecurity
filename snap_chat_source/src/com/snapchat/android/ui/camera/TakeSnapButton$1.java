// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.camera;


// Referenced classes of package com.snapchat.android.ui.camera:
//            TakeSnapButton

final class a
    implements Runnable
{

    private TakeSnapButton a;

    public final void run()
    {
        a.invalidate();
    }

    (TakeSnapButton takesnapbutton)
    {
        a = takesnapbutton;
        super();
    }
}
