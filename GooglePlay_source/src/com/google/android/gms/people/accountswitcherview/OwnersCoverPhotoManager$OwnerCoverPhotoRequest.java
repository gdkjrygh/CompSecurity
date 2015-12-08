// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.widget.ImageView;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.people.Images;
import com.google.android.gms.people.People;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            OwnersCoverPhotoManager

private final class width extends width
{

    public final String pageId;
    final OwnersCoverPhotoManager this$0;
    public final int width;

    public final void load()
    {
        People.ImageApi.loadOwnerCoverPhoto$52832eb4(mClient, accountName, pageId).setResultCallback(new ResultCallback() {

            final OwnersCoverPhotoManager.OwnerCoverPhotoRequest this$1;

            public final volatile void onResult(Result result)
            {
                result = (com.google.android.gms.people.Images.LoadImageResult)result;
                OwnersCoverPhotoManager.OwnerCoverPhotoRequest ownercoverphotorequest = OwnersCoverPhotoManager.OwnerCoverPhotoRequest.this;
                ownercoverphotorequest.this$0.onImageLoaded(result.getStatus(), result.getParcelFileDescriptor(), result.getWidth(), result.getHeight(), ownercoverphotorequest.width, ownercoverphotorequest);
            }

            
            {
                this$1 = OwnersCoverPhotoManager.OwnerCoverPhotoRequest.this;
                super();
            }
        });
    }

    public _cls1.this._cls1(ImageView imageview, String s, String s1, int i)
    {
        this$0 = OwnersCoverPhotoManager.this;
        super(OwnersCoverPhotoManager.this);
        view = imageview;
        accountName = s;
        pageId = s1;
        width = i;
    }
}
