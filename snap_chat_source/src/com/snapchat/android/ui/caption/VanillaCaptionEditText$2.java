// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;


// Referenced classes of package com.snapchat.android.ui.caption:
//            VanillaCaptionEditText, CaptionEditText

final class a
    implements Runnable
{

    private VanillaCaptionEditText a;

    public final void run()
    {
        if (!((CaptionEditText) (a)).a && a.n)
        {
            a.e = -1;
            a.a(true);
        }
    }

    (VanillaCaptionEditText vanillacaptionedittext)
    {
        a = vanillacaptionedittext;
        super();
    }
}
