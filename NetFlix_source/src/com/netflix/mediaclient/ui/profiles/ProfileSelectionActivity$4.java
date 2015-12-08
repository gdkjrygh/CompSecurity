// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.profiles;

import android.view.View;
import android.widget.AdapterView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.UserProfile;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.profiles:
//            ProfileSelectionActivity

class this._cls0
    implements android.widget.ener
{

    final ProfileSelectionActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (ProfileSelectionActivity.access$400(ProfileSelectionActivity.this) == null || i > ProfileSelectionActivity.access$400(ProfileSelectionActivity.this).size())
        {
            Log.d("ProfileSelectionActivity", "Invalid profiles set");
            return;
        } else
        {
            startChangeProfile((UserProfile)ProfileSelectionActivity.access$400(ProfileSelectionActivity.this).get(i));
            return;
        }
    }

    ()
    {
        this$0 = ProfileSelectionActivity.this;
        super();
    }
}
