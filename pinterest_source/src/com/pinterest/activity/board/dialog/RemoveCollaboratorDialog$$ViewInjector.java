// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.widget.CheckBox;
import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            RemoveCollaboratorDialog

public class 
{

    public static void inject(butterknife.torDialog tordialog, RemoveCollaboratorDialog removecollaboratordialog, Object obj)
    {
        removecollaboratordialog._blockCb = (CheckBox)tordialog._blockCb(obj, 0x7f0f013b, "field '_blockCb'");
        removecollaboratordialog._blockDesc = (TextView)tordialog._blockDesc(obj, 0x7f0f013c, "field '_blockDesc'");
    }

    public static void reset(RemoveCollaboratorDialog removecollaboratordialog)
    {
        removecollaboratordialog._blockCb = null;
        removecollaboratordialog._blockDesc = null;
    }

    public ()
    {
    }
}
