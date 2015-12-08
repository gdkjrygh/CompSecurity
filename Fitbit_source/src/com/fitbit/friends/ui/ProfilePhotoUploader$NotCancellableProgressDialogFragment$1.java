// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.fitbit.friends.ui:
//            ProfilePhotoUploader

class a
    implements android.content.ent._cls1
{

    final a a;

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        while (i == 84 || i == 4) 
        {
            return true;
        }
        return false;
    }

    ( )
    {
        a = ;
        super();
    }
}
