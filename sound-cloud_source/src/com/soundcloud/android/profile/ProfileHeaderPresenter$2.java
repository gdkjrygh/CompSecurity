// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.app.Activity;
import android.view.View;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.view.FullImageDialog;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileHeaderPresenter

class val.imageOperations
    implements android.view.HeaderPresenter._cls2
{

    final ProfileHeaderPresenter this$0;
    final ImageOperations val$imageOperations;
    final Activity val$profileActivity;
    final Urn val$user;

    public void onClick(View view)
    {
        (new FullImageDialog(val$profileActivity, val$user, val$imageOperations)).show();
    }

    ()
    {
        this$0 = final_profileheaderpresenter;
        val$profileActivity = activity;
        val$user = urn;
        val$imageOperations = ImageOperations.this;
        super();
    }
}
