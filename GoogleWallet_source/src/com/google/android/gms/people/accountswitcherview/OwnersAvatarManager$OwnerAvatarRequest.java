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
//            OwnersAvatarManager

final class avatarSize extends avatarSize
{

    public final int avatarSize;
    public final String pageId;
    final OwnersAvatarManager this$0;

    public final void load()
    {
        People.ImageApi.loadOwnerAvatar(mClient, accountName, pageId, avatarSize, 1).setResultCallback(new ResultCallback() {

            final OwnersAvatarManager.OwnerAvatarRequest this$1;

            private void onResult(com.google.android.gms.people.Images.LoadImageResult loadimageresult)
            {
                onImageLoaded(loadimageresult);
            }

            public final volatile void onResult(Result result)
            {
                onResult((com.google.android.gms.people.Images.LoadImageResult)result);
            }

            
            {
                this$1 = OwnersAvatarManager.OwnerAvatarRequest.this;
                super();
            }
        });
    }

    public final void onImageLoaded(com.google.android.gms.people..OwnerAvatarRequest owneravatarrequest)
    {
        OwnersAvatarManager.access$001(OwnersAvatarManager.this, owneravatarrequest.(), owneravatarrequest.criptor(), this, 0);
    }

    public _cls1.this._cls1(ImageView imageview, String s, String s1, int i)
    {
        this$0 = OwnersAvatarManager.this;
        super(OwnersAvatarManager.this);
        view = imageview;
        accountName = s;
        pageId = s1;
        avatarSize = i;
    }
}
