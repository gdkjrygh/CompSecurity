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

final class val.snapshotMetadata extends GamesDialogFragment
{

    final ClientSnapshotListActivity this$0;
    final SnapshotMetadata val$snapshotMetadata;

    protected final android.support.v7.app.ilder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        return gamesdialogbuilder.setTitle(0x7f1000be).setMessage(0x7f1000bd).veButton(0x1040000, null).veButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final ClientSnapshotListActivity._cls1 this$1;

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

            
            {
                this$1 = ClientSnapshotListActivity._cls1.this;
                super();
            }
        }).able(false);
    }

    _cls1.this._cls1()
    {
        this$0 = final_clientsnapshotlistactivity;
        val$snapshotMetadata = SnapshotMetadata.this;
        super();
    }
}
