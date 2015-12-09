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

final class width extends width
{

    public final String pageId;
    final OwnersCoverPhotoManager this$0;
    public final int width;

    public final void load()
    {
        People.ImageApi.loadOwnerCoverPhoto(mClient, accountName, pageId, width).setResultCallback(new ResultCallback() {

            final OwnersCoverPhotoManager.OwnerCoverPhotoRequest this$1;

            private void onResult(com.google.android.gms.people.Images.LoadImageResult loadimageresult)
            {
                onImageLoaded(loadimageresult);
            }

            public final volatile void onResult(Result result)
            {
                onResult((com.google.android.gms.people.Images.LoadImageResult)result);
            }

            
            {
                this$1 = OwnersCoverPhotoManager.OwnerCoverPhotoRequest.this;
                super();
            }
        });
    }

    public final void onImageLoaded(com.google.android.gms.people.erCoverPhotoRequest ercoverphotorequest)
    {
        OwnersCoverPhotoManager.this.onImageLoaded(ercoverphotorequest.mageLoaded(), ercoverphotorequest.mageLoaded(), ercoverphotorequest.mageLoaded(), ercoverphotorequest.mageLoaded(), width, this);
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
