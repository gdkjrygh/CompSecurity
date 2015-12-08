// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;


// Referenced classes of package com.snapchat.android.ui.caption:
//            CaptionEditText

final class a
    implements Runnable
{

    private CaptionEditText a;

    public final void run()
    {
        a.h();
        int i = Math.min((int)a.l, a.q);
        if (i != a.getTop())
        {
            a.b(i);
        }
        a.setVisibility(0);
    }

    (CaptionEditText captionedittext)
    {
        a = captionedittext;
        super();
    }
}
