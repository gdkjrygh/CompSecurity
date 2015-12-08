// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            AddCollaboratorFragment

final class a
    implements TextWatcher
{

    private AddCollaboratorFragment a;

    public final void afterTextChanged(Editable editable)
    {
        editable = a;
        ((AddCollaboratorFragment) (editable)).b.setVisibility(8);
        ((AddCollaboratorFragment) (editable)).c.setText(0x7f080027);
        ((AddCollaboratorFragment) (editable)).d.setVisibility(8);
        ((AddCollaboratorFragment) (editable)).e.setVisibility(8);
        int j = ((AddCollaboratorFragment) (editable)).a.getText().toString().length();
        int i;
        if (j < 3)
        {
            ((AddCollaboratorFragment) (editable)).c.setEnabled(false);
            i = editable.getResources().getColor(0x7f0c005c);
        } else
        {
            ((AddCollaboratorFragment) (editable)).c.setEnabled(true);
            i = editable.getResources().getColor(0x7f0c005d);
        }
        ((AddCollaboratorFragment) (editable)).c.setBackgroundColor(i);
        if (j > 0)
        {
            ((AddCollaboratorFragment) (editable)).c.setVisibility(0);
            return;
        } else
        {
            ((AddCollaboratorFragment) (editable)).c.setVisibility(8);
            return;
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (AddCollaboratorFragment addcollaboratorfragment)
    {
        a = addcollaboratorfragment;
        super();
    }
}
