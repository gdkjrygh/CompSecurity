// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment, GamesSettingsActivity

final class t extends GamesDialogFragment
{

    final GamesSettingsFragment this$0;
    final GameFirstParty val$game;

    protected final android.support.v7.app.ogBuilder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        return gamesdialogbuilder.setTitle(0x7f100289).setMessage(GamesSettingsFragment.access$200(GamesSettingsFragment.this).getString(0x7f100287, new Object[] {
            val$game.getGame().getDisplayName()
        })).sitiveButton(0x7f100288, new android.content.DialogInterface.OnClickListener() {

            final GamesSettingsFragment._cls10 this$1;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                Object obj = GamesSettingsFragment.access$200(this$0);
                GameFirstParty gamefirstparty = game;
                obj = ((FragmentActivity) (obj)).mFragments.findFragmentById(0x7f0d0287);
                if (obj instanceof GamesSettingsFragment)
                {
                    obj = (GamesSettingsFragment)obj;
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    com.google.android.gms.common.api.GoogleApiClient googleapiclient = ((GamesSettingsFragment) (obj)).mParent.getGoogleApiClient();
                    if (!UiUtils.checkClientDisconnected(googleapiclient, ((GamesSettingsFragment) (obj)).mParent))
                    {
                        ((GamesSettingsFragment) (obj)).mUnmutedGamesMap.put(gamefirstparty.getGame().getApplicationId(), gamefirstparty.getGame().getDisplayName());
                        Games.Notifications.unmuteGameInternal(googleapiclient, gamefirstparty.getGame().getApplicationId()).setResultCallback(new GamesSettingsFragment._cls7(((GamesSettingsFragment) (obj))));
                    }
                }
                dialoginterface.dismiss();
            }

            
            {
                this$1 = GamesSettingsFragment._cls10.this;
                super();
            }
        }).gativeButton(0x1040000, null);
    }

    _cls1.this._cls1()
    {
        this$0 = final_gamessettingsfragment;
        val$game = GameFirstParty.this;
        super();
    }
}
