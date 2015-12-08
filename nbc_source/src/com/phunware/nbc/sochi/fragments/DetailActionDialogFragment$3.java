// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.api.models.Asset;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            DetailActionDialogFragment

class val.isFavorite
    implements android.view.ionDialogFragment._cls3
{

    final DetailActionDialogFragment this$0;
    final boolean val$isFavorite;

    public void onClick(View view)
    {
label0:
        {
            dismiss();
            if (DetailActionDialogFragment.access$700(DetailActionDialogFragment.this) != null)
            {
                DetailActionDialogFragment.access$700(DetailActionDialogFragment.this).setSelected(val$isFavorite);
                if (!val$isFavorite)
                {
                    break label0;
                }
                favorites.deleteFavorite(DetailActionDialogFragment.access$500(DetailActionDialogFragment.this));
                view = getActivity();
                DetailActionDialogFragment detailactiondialogfragment = DetailActionDialogFragment.this;
                int i;
                if (DetailActionDialogFragment.access$200(DetailActionDialogFragment.this).isLive() || DetailActionDialogFragment.access$200(DetailActionDialogFragment.this).isFuture())
                {
                    i = 0x7f070172;
                } else
                {
                    i = 0x7f070110;
                }
                Toast.makeText(view, detailactiondialogfragment.getString(i), 1).show();
            }
            return;
        }
        favorites.addFavorite(DetailActionDialogFragment.access$200(DetailActionDialogFragment.this));
        DetailActionDialogFragment.access$400(DetailActionDialogFragment.this, (new StringBuilder()).append(DetailActionDialogFragment.access$200(DetailActionDialogFragment.this).getTitle()).append("\r\n").append(DetailActionDialogFragment.access$200(DetailActionDialogFragment.this).getInfo()).toString(), DetailActionDialogFragment.access$300(DetailActionDialogFragment.this));
    }

    ()
    {
        this$0 = final_detailactiondialogfragment;
        val$isFavorite = Z.this;
        super();
    }
}
