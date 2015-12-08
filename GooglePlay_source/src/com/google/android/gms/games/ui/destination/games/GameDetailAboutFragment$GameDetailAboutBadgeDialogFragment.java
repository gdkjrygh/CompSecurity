// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertController;
import android.support.v7.app.AlertDialog;
import android.widget.ListView;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailAboutFragment

public static final class  extends GamesDialogFragment
{

    public static  newInstance(String s, ArrayList arraylist)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putParcelableArrayList("badgeList", arraylist);
        s = new <init>();
        s.setArguments(bundle);
        return s;
    }

    protected final android.support.v7.app.ilAboutBadgeDialogFragment createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        bundle = super.mArguments;
        setArguments setarguments = new setArguments(super.mActivity);
        ArrayList arraylist = bundle.getParcelableArrayList("badgeList");
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            setarguments.setArguments(arraylist.get(i));
        }

        return gamesdialogbuilder.setTitle(bundle.getString("title")).setAdapter(setarguments, null).add(true);
    }

    protected final void onPostCreateDialog(AlertDialog alertdialog)
    {
        super.onPostCreateDialog(alertdialog);
        alertdialog = alertdialog.mAlert.mListView;
        alertdialog.setDivider(null);
        alertdialog.setSelector(0x106000d);
        int i = getResources().getDimensionPixelSize(0x7f0c00b8);
        alertdialog.setPadding(0, i, 0, i);
    }

    public ()
    {
    }
}
