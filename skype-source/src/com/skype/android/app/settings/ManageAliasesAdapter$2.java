// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.view.View;
import com.skype.android.SkypeDialogFragment;
import java.util.List;

// Referenced classes of package com.skype.android.app.settings:
//            ManageAliasesAdapter, DeletePhoneDialogFragment, ManageAliasesActivity

final class val.position
    implements android.view.r
{

    final ManageAliasesAdapter this$0;
    final int val$position;

    public final boolean onLongClick(View view)
    {
        DeletePhoneDialogFragment deletephonedialogfragment = DeletePhoneDialogFragment.create((com.skype.android.app.shortcircuit.lient.AliasInfo)ManageAliasesAdapter.access$100(ManageAliasesAdapter.this).get(val$position));
        ((DeletePhoneDialogFragment)deletephonedialogfragment).setDeletePhoneCallback(ManageAliasesAdapter.access$400(ManageAliasesAdapter.this));
        deletephonedialogfragment.show(((ManageAliasesActivity)view.getContext()).getSupportFragmentManager());
        return true;
    }

    nt()
    {
        this$0 = final_managealiasesadapter;
        val$position = I.this;
        super();
    }
}
