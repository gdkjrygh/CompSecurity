// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


// Referenced classes of package com.facebook.widget:
//            ToolTipPopup

final class a
    implements Runnable
{

    private ToolTipPopup a;

    public final void run()
    {
        a.dismiss();
    }

    (ToolTipPopup tooltippopup)
    {
        a = tooltippopup;
        super();
    }
}
