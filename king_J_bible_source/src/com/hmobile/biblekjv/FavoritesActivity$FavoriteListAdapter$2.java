// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.View;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.model.FavoriteInfo;

// Referenced classes of package com.hmobile.biblekjv:
//            FavoritesActivity

class val.fav_info
    implements android.view.apter._cls2
{

    final this._cls1 this$1;
    private final FavoriteInfo val$fav_info;

    public void onClick(View view)
    {
        try
        {
            val$fav_info.delete();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
        }
        cess._mth0(this._cls1.this).LoadViewForFavorite();
    }

    ()
    {
        this$1 = final_;
        val$fav_info = FavoriteInfo.this;
        super();
    }
}
