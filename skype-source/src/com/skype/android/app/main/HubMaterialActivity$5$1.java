// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.skype.SkyLib;
import com.skype.android.app.ListItemMenuDialog;

// Referenced classes of package com.skype.android.app.main:
//            HubMaterialActivity

final class this._cls1
    implements com.skype.android.app.allback
{

    final is._cls0 this$1;

    public final boolean onContextItemSelected(MenuItem menuitem, int i)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756536: 
            lib.consumeAllConversations();
            break;
        }
        return true;
    }

    public final void onCreateContextMenu(Menu menu, int i)
    {
        getMenuInflater().inflate(0x7f11001f, menu);
        menu = menu.findItem(0x7f1005f8);
        boolean flag;
        if (HubMaterialActivity.access$100(_fld0) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menu.setEnabled(flag);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/skype/android/app/main/HubMaterialActivity$5

/* anonymous class */
    final class HubMaterialActivity._cls5
        implements android.view.View.OnLongClickListener
    {

        final HubMaterialActivity this$0;

        public final boolean onLongClick(View view)
        {
            ListItemMenuDialog.create(new HubMaterialActivity._cls5._cls1(), getResources().getQuantityString(0x7f0b0003, HubMaterialActivity.access$100(HubMaterialActivity.this), new Object[] {
                Integer.valueOf(HubMaterialActivity.access$100(HubMaterialActivity.this))
            }), 0).show(getSupportFragmentManager());
            return false;
        }

            
            {
                this$0 = HubMaterialActivity.this;
                super();
            }
    }

}
