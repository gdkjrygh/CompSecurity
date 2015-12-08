// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.skype.android.util.accessibility.AccessibilityUtil;
import java.util.List;

// Referenced classes of package com.skype.android.app.settings:
//            ManageAliasesAdapter

final class val.holder
    implements android.widget.dChangeListener
{

    final ManageAliasesAdapter this$0;
    final aliasName val$holder;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        Object obj = (Integer)val$holder.aliasName.getTag();
        obj = (com.skype.android.app.shortcircuit.lient.AliasInfo)ManageAliasesAdapter.access$100(ManageAliasesAdapter.this).get(((Integer) (obj)).intValue());
        if (flag != ((com.skype.android.app.shortcircuit.lient.AliasInfo) (obj)).isSearchable())
        {
            updateAliasState(((com.skype.android.app.shortcircuit.lient.AliasInfo) (obj)), flag);
            if (ManageAliasesAdapter.access$200(ManageAliasesAdapter.this).a())
            {
                ManageAliasesAdapter.access$300(ManageAliasesAdapter.this, (View)compoundbutton.getParent(), val$holder.aliasName.getText().toString(), flag);
            }
        }
    }

    ()
    {
        this$0 = final_managealiasesadapter;
        val$holder = val.holder.this;
        super();
    }
}
