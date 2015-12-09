// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import android.widget.EditText;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseShareActivity

class b
    implements android.content.smissListener
{

    final EditText a;
    final int b;
    final BaseShareActivity c;

    public void onDismiss(DialogInterface dialoginterface)
    {
        c.h = a.getText().toString();
        if (!BaseShareActivity.a(c)) goto _L2; else goto _L1
_L1:
        b;
        JVM INSTR lookupswitch 4: default 72
    //                   1: 89
    //                   6: 81
    //                   9: 73
    //                   12: 97;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        return;
_L5:
        BaseShareActivity.b(c);
        return;
_L4:
        BaseShareActivity.c(c);
        return;
_L3:
        BaseShareActivity.d(c);
        return;
_L6:
        BaseShareActivity.e(c);
        return;
    }

    (BaseShareActivity baseshareactivity, EditText edittext, int i)
    {
        c = baseshareactivity;
        a = edittext;
        b = i;
        super();
    }
}
