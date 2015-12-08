// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import java.util.Stack;

// Referenced classes of package com.pandora.android.view:
//            f

class a
    implements android.view.nClickListener
{

    final a a;

    public void onClick(View view)
    {
        if (!er(a).isEmpty())
        {
            view = (Parcelable)a(a).pop();
            a(a).a(view);
            if (((Bundle)view).getBoolean("isNonAdvertiserStation"))
            {
                a(a);
            }
            if (a(a).isEmpty())
            {
                a.a(false, false);
            }
        }
    }

    er(er er)
    {
        a = er;
        super();
    }
}
