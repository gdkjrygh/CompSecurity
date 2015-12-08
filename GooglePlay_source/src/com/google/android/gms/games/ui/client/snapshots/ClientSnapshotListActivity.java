// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.snapshots;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.ExclusionFilterable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.common.snapshots.SnapshotEventListener;
import com.google.android.gms.games.ui.common.snapshots.SnapshotListMetadataProvider;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.client.snapshots:
//            SnapshotFragment

public final class ClientSnapshotListActivity extends ClientFragmentActivity
    implements ResultCallback, SnapshotEventListener, SnapshotListMetadataProvider
{

    private boolean mAllowCreateSnapshot;
    private boolean mAllowDeleteSnapshot;
    private int mMaxSnapshots;
    private SnapshotFragment mSnapshotFragment;
    private String mTitle;

    public ClientSnapshotListActivity()
    {
        super(0, 0, true, true);
        mAllowCreateSnapshot = false;
        mAllowDeleteSnapshot = false;
        mMaxSnapshots = -1;
    }

    protected final void addApisToGoogleApiClient(com.google.android.gms.common.api.GoogleApiClient.Builder builder)
    {
        super.addApisToGoogleApiClient(builder);
        builder.addScope(Drive.SCOPE_APPFOLDER);
    }

    protected final int getLogEventType()
    {
        return 15;
    }

    public final int getMaxSnapshotsAllowed()
    {
        return mMaxSnapshots;
    }

    protected final int getWrappableContentResId()
    {
        return 0x7f0400dc;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final boolean isCreateAllowed()
    {
        return mAllowCreateSnapshot;
    }

    public final boolean isDeleteAllowed()
    {
        return mAllowDeleteSnapshot;
    }

    public final void onAttachFragment(Fragment fragment)
    {
        if (fragment.mFragmentId == 0x7f0d029b)
        {
            mSnapshotFragment = (SnapshotFragment)fragment;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        mTitle = bundle.getStringExtra("com.google.android.gms.games.TITLE");
        mMaxSnapshots = bundle.getIntExtra("com.google.android.gms.games.MAX_SNAPSHOTS", 0);
        mAllowCreateSnapshot = bundle.getBooleanExtra("com.google.android.gms.games.ALLOW_CREATE_SNAPSHOT", false);
        mAllowDeleteSnapshot = bundle.getBooleanExtra("com.google.android.gms.games.ALLOW_DELETE_SNAPSHOT", false);
        boolean flag;
        if (TextUtils.isEmpty(mTitle))
        {
            GamesLog.e("SnapshotActivity", "com.google.android.gms.games.TITLE must be set");
            flag = false;
        } else
        if (mMaxSnapshots != -1 && mMaxSnapshots <= 0)
        {
            GamesLog.e("SnapshotActivity", "com.google.android.gms.games.MAX_SNAPSHOTS must be specified as either Snapshots.DISPLAY_LIMIT_NONE or > 0");
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            GamesLog.e("SnapshotActivity", "Error parsing intent; bailing out...");
            finish();
        }
        mShowGameNameAsTitle = false;
        setTitle(mTitle);
    }

    public final void onNewSnapshotClicked()
    {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.games.SNAPSHOT_NEW", true);
        setResult(-1, intent);
        finish();
    }

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult)result;
        if (result.getStatus().mStatusCode == 0)
        {
            result = result.getSnapshotId();
            SnapshotFragment snapshotfragment = mSnapshotFragment;
            snapshotfragment.mExclusionFilterable.filterOut(result);
            ((android.support.v7.widget.RecyclerView.Adapter) (snapshotfragment.mSnapshotAdapter)).mObservable.notifyChanged();
            snapshotfragment.setNewSnapshotVisibility();
            snapshotfragment.updateViewState(0);
            return;
        } else
        {
            Toast.makeText(this, getString(0x7f100180), 0).show();
            return;
        }
    }

    public final void onSnapshotClicked(SnapshotMetadata snapshotmetadata)
    {
        GamesLog.i("SnapshotActivity", "onSnapshotClicked:");
        Asserts.checkNotNull(snapshotmetadata);
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.games.SNAPSHOT_METADATA", (Parcelable)snapshotmetadata.freeze());
        setResult(-1, intent);
        finish();
    }

    public final void onSnapshotDeleted(final SnapshotMetadata snapshotMetadata)
    {
        DialogFragmentUtil.show(this, new GamesDialogFragment() {

            final ClientSnapshotListActivity this$0;
            final SnapshotMetadata val$snapshotMetadata;

            protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
            {
                return gamesdialogbuilder.setTitle(0x7f1000be).setMessage(0x7f1000bd).setNegativeButton(0x1040000, null).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                    final _cls1 this$1;

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
                this$1 = _cls1.this;
                super();
            }
                }).setCancelable(false);
            }

            
            {
                this$0 = ClientSnapshotListActivity.this;
                snapshotMetadata = snapshotmetadata;
                super();
            }
        }, "confirm_delete_dialog");
    }
}
