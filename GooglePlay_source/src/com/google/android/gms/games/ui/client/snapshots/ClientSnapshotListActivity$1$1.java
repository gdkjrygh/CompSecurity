// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.snapshots;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.client.snapshots:
//            ClientSnapshotListActivity

final class this._cls1
    implements android.content.
{

    final oogleApiClient this$1;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (snapshotMetadata != null)
        {
            dialoginterface = (ClientSnapshotListActivity)mActivity;
            if (dialoginterface != null)
            {
                SnapshotMetadata snapshotmetadata = snapshotMetadata;
                com.google.android.gms.common.api.GoogleApiClient googleapiclient = dialoginterface.getGoogleApiClient();
                if (UiUtils.checkClientDisconnected(googleapiclient, dialoginterface))
                {
                    GamesLog.w("SnapshotActivity", "deleteSnapshot: not connected; ignoring...");
                    return;
                } else
                {
                    Games.Snapshots.delete(googleapiclient, snapshotmetadata).setResultCallback(dialoginterface);
                    return;
                }
            } else
            {
                GamesLog.w("SnapshotActivity", "delete button: no parent; ignoring...");
                return;
            }
        } else
        {
            GamesLog.e("SnapshotActivity", "delete button: snapshot is null!");
            return;
        }
    }

    l.snapshotMetadata()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/client/snapshots/ClientSnapshotListActivity$1

/* anonymous class */
    final class ClientSnapshotListActivity._cls1 extends GamesDialogFragment
    {

        final ClientSnapshotListActivity this$0;
        final SnapshotMetadata val$snapshotMetadata;

        protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
        {
            return gamesdialogbuilder.setTitle(0x7f1000be).setMessage(0x7f1000bd).setNegativeButton(0x1040000, null).setPositiveButton(0x104000a, new ClientSnapshotListActivity._cls1._cls1()).setCancelable(false);
        }

            
            {
                this$0 = final_clientsnapshotlistactivity;
                snapshotMetadata = SnapshotMetadata.this;
                super();
            }
    }

}
