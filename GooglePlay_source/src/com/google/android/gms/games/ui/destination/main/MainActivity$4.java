// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            MainActivity

final class > extends GamesDialogFragment
{

    final MainActivity this$0;

    protected final android.support.v7.app.lder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        return gamesdialogbuilder.setTitle(0x7f1000c4).setMessage(0x7f1000c3).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

            final MainActivity._cls4 this$1;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (isAttachedToParent())
                {
                    mActivity.finish();
                }
            }

            
            {
                this$1 = MainActivity._cls4.this;
                super();
            }
        }).setPositiveButton(0x7f10014b, new android.content.DialogInterface.OnClickListener() {

            final MainActivity._cls4 this$1;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (isAttachedToParent())
                {
                    MainActivity.access$100((MainActivity)mActivity);
                }
                dismissInternal(false);
            }

            
            {
                this$1 = MainActivity._cls4.this;
                super();
            }
        }).setCancelable(false);
    }



    _cls2.this._cls1()
    {
        this$0 = MainActivity.this;
        super();
    }
}
