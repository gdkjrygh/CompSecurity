// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;


// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class m
    implements Runnable
{

    final String a;
    final Camera2InputPopup b;

    m(Camera2InputPopup camera2inputpopup, String s)
    {
        b = camera2inputpopup;
        a = s;
        super();
    }

    public final void run()
    {
        String s = a;
        (new StringBuilder(String.valueOf(s).length() + 21)).append("zzz onTextSelected [").append(s).append("]");
        b.d(a);
    }
}
