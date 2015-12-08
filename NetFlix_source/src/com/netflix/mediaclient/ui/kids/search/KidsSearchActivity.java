// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.search;

import android.app.ActionBar;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import com.netflix.mediaclient.android.widget.LoadingAndErrorWrapper;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.ui.search.SearchActivity;
import com.netflix.mediaclient.util.ViewUtils;

// Referenced classes of package com.netflix.mediaclient.ui.kids.search:
//            KidsSearchActionBar

public class KidsSearchActivity extends SearchActivity
{

    public KidsSearchActivity()
    {
    }

    protected NetflixActionBar createActionBar(ActionBar actionbar)
    {
        return new KidsSearchActionBar(this);
    }

    protected int getInitMessageStringId()
    {
        return 0x7f0c0058;
    }

    public boolean isForKids()
    {
        return true;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(0x7f0200e1);
        leWrapper.getErrorMessageTextView().setTextColor(getResources().getColor(0x7f090032));
        ViewUtils.clearShadow(leWrapper.getErrorMessageTextView());
    }
}
