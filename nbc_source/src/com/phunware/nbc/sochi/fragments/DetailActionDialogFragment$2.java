// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.app.Dialog;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.tve.PlaybackDelegate;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            DetailActionDialogFragment

class val.isFavorite
    implements android.view.ionDialogFragment._cls2
{

    final DetailActionDialogFragment this$0;
    final boolean val$isFavorite;

    public void onClick(View view)
    {
        if (DetailActionDialogFragment.access$100(DetailActionDialogFragment.this) != null)
        {
            if (DetailActionDialogFragment.access$100(DetailActionDialogFragment.this).getText().toString().equals(getString(0x7f070046)))
            {
                DetailActionDialogFragment detailactiondialogfragment;
                if (val$isFavorite)
                {
                    DetailActionDialogFragment.access$100(DetailActionDialogFragment.this).setText(getString(0x7f070173));
                } else
                {
                    DetailActionDialogFragment.access$400(DetailActionDialogFragment.this, (new StringBuilder()).append(DetailActionDialogFragment.access$200(DetailActionDialogFragment.this).getTitle()).append("\r\n").append(DetailActionDialogFragment.access$200(DetailActionDialogFragment.this).getInfo()).toString(), DetailActionDialogFragment.access$300(DetailActionDialogFragment.this));
                    favorites.addFavorite(DetailActionDialogFragment.access$200(DetailActionDialogFragment.this));
                }
                DetailActionDialogFragment.access$000(DetailActionDialogFragment.this).dismiss();
            }
            if (DetailActionDialogFragment.access$100(DetailActionDialogFragment.this).getText().toString().equals(getString(0x7f070173)))
            {
                favorites.deleteFavorite(DetailActionDialogFragment.access$500(DetailActionDialogFragment.this));
                view = getActivity();
                detailactiondialogfragment = DetailActionDialogFragment.this;
                int i;
                if (DetailActionDialogFragment.access$200(DetailActionDialogFragment.this).isLive() || DetailActionDialogFragment.access$200(DetailActionDialogFragment.this).isFuture())
                {
                    i = 0x7f070172;
                } else
                {
                    i = 0x7f070110;
                }
                Toast.makeText(view, detailactiondialogfragment.getString(i), 1).show();
                DetailActionDialogFragment.access$000(DetailActionDialogFragment.this).dismiss();
            }
            if (DetailActionDialogFragment.access$100(DetailActionDialogFragment.this).getText().toString().equals("Close"))
            {
                DetailActionDialogFragment.access$000(DetailActionDialogFragment.this).dismiss();
                return;
            }
            if (DetailActionDialogFragment.access$100(DetailActionDialogFragment.this).getText().toString().contains("Play") || DetailActionDialogFragment.access$100(DetailActionDialogFragment.this).getText().toString().contains("Ver"))
            {
                DetailActionDialogFragment.access$600(DetailActionDialogFragment.this).authorize();
                return;
            }
        }
    }

    ()
    {
        this$0 = final_detailactiondialogfragment;
        val$isFavorite = Z.this;
        super();
    }
}
