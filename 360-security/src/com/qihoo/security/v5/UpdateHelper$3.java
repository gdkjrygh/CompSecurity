// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.qihoo.security.dialog.b;
import com.qihoo360.common.utils.Utils;

// Referenced classes of package com.qihoo.security.v5:
//            UpdateHelper

static final class a
    implements android.content..OnKeyListener
{

    final b a;

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            Utils.dismissDialog(a);
            return true;
        } else
        {
            return false;
        }
    }

    Listener(b b)
    {
        a = b;
        super();
    }
}
