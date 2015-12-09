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

final class this._cls1
    implements android.content.ener
{

    final it> this$1;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        Object obj = GamesSettingsFragment.access$200(_fld0);
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
                Games.Notifications.unmuteGameInternal(googleapiclient, gamefirstparty.getGame().getApplicationId()).setResultCallback(new it>(((GamesSettingsFragment) (obj))));
            }
        }
        dialoginterface.dismiss();
    }

    <init>()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/GamesSettingsFragment$10

/* anonymous class */
    final class GamesSettingsFragment._cls10 extends GamesDialogFragment
    {

        final GamesSettingsFragment this$0;
        final GameFirstParty val$game;

        protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
        {
            return gamesdialogbuilder.setTitle(0x7f100289).setMessage(GamesSettingsFragment.access$200(GamesSettingsFragment.this).getString(0x7f100287, new Object[] {
                game.getGame().getDisplayName()
            })).setPositiveButton(0x7f100288, new GamesSettingsFragment._cls10._cls1()).setNegativeButton(0x1040000, null);
        }

            
            {
                this$0 = final_gamessettingsfragment;
                game = GameFirstParty.this;
                super();
            }
    }

}
