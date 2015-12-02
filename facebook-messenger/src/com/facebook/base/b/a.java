// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.b;

import android.app.Dialog;
import android.content.ContextWrapper;

// Referenced classes of package com.facebook.base.b:
//            b

public class a
{

    public a()
    {
    }

    public static void a(Dialog dialog)
    {
        android.content.Context context;
        for (context = dialog.getContext(); (context instanceof ContextWrapper) && !(context instanceof b); context = ((ContextWrapper)context).getBaseContext()) { }
        if (context instanceof b)
        {
            ((b)context).a(dialog);
        }
    }
}
