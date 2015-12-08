// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.ButterKnife;

// Referenced classes of package com.jcp.fragments:
//            EditAccountFragment

public class a
{

    final EditAccountFragment a;
    protected Button dialogButtonCancel;
    protected Button dialogButtonOk;
    protected TextView mDialogText;
    protected EditText updateEmail;

    protected (EditAccountFragment editaccountfragment, Dialog dialog)
    {
        a = editaccountfragment;
        super();
        ButterKnife.inject(this, dialog);
    }
}
