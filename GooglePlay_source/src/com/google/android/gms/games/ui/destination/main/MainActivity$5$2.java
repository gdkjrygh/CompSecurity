// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            MainActivity

final class this._cls1
    implements android.content.nClickListener
{

    final artActivity this$1;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (AttachedToParent())
        {
            dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse((String)G.playGamesHelpWebpageUrl.get()));
            artActivity(dialoginterface);
        }
        dismissInternal(false);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/destination/main/MainActivity$5

/* anonymous class */
    final class MainActivity._cls5 extends GamesDialogFragment
    {

        final MainActivity this$0;

        protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
        {
            return gamesdialogbuilder.setTitle(0x7f10014a).setMessage(0x7f100149).setNeutralButton(0x7f100148, new MainActivity._cls5._cls2()).setPositiveButton(0x7f10014b, new MainActivity._cls5._cls1());
        }



            
            {
                this$0 = MainActivity.this;
                super();
            }

        // Unreferenced inner class com/google/android/gms/games/ui/destination/main/MainActivity$5$1

/* anonymous class */
        final class MainActivity._cls5._cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final MainActivity._cls5 this$1;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (isAttachedToParent())
                {
                    MainActivity.access$100(this$0);
                }
                dismissInternal(false);
            }

                    
                    {
                        this$1 = MainActivity._cls5.this;
                        super();
                    }
        }

    }

}
