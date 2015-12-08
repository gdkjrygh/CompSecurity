// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.tinder.adapters.i;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a
    implements android.content.Interface.OnKeyListener
{

    final bd a;

    public final boolean onKey(DialogInterface dialoginterface, int j, KeyEvent keyevent)
    {
        if (j == 4)
        {
            bd.e(a).a();
            return false;
        } else
        {
            return true;
        }
    }

    face(bd bd1)
    {
        a = bd1;
        super();
    }
}
