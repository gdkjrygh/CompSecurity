// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.Images;
import com.google.android.gms.people.People;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            OwnersImageManager, ImageUtils

public final class OwnersAvatarManager extends OwnersImageManager
{
    final class OwnerAvatarRequest extends OwnersImageManager.OwnerImageRequest
    {

        public final int avatarSize;
        public final String pageId;
        final OwnersAvatarManager this$0;

        public final void load()
        {
            People.ImageApi.loadOwnerAvatar(mClient, accountName, pageId, avatarSize, 1).setResultCallback(new ResultCallback() {

                final OwnerAvatarRequest this$1;

                private void onResult(com.google.android.gms.people.Images.LoadImageResult loadimageresult)
                {
                    onImageLoaded(loadimageresult);
                }

                public final volatile void onResult(Result result)
                {
                    onResult((com.google.android.gms.people.Images.LoadImageResult)result);
                }

            
            {
                this$1 = OwnerAvatarRequest.this;
                super();
            }
            });
        }

        public final void onImageLoaded(com.google.android.gms.people.Images.LoadImageResult loadimageresult)
        {
            OwnersImageManager.this.onImageLoaded(loadimageresult.getStatus(), loadimageresult.getParcelFileDescriptor(), this, 0);
        }

        public OwnerAvatarRequest(ImageView imageview, String s, String s1, int i)
        {
            this$0 = OwnersAvatarManager.this;
            super(OwnersAvatarManager.this);
            view = imageview;
            accountName = s;
            pageId = s1;
            avatarSize = i;
        }
    }


    public OwnersAvatarManager(Context context, GoogleApiClient googleapiclient)
    {
        super(context, googleapiclient, true);
    }

    public static Bitmap getPlaceholder(Context context, String s, String s1, int i)
    {
        return ImageUtils.frameBitmapInCircle(BitmapFactory.decodeResource(context.getResources(), R.drawable.avatar_placeholder));
    }

    public final void loadOwnerAvatar(ImageView imageview, String s, String s1, int i)
    {
        loadImageRequest(new OwnerAvatarRequest(imageview, s, s1, i));
    }

    protected final void setImageBitmap(OwnersImageManager.OwnerImageRequest ownerimagerequest, Bitmap bitmap)
    {
        if (bitmap == null)
        {
            bitmap = ownerimagerequest.view;
            OwnerAvatarRequest owneravatarrequest = (OwnerAvatarRequest)ownerimagerequest;
            bitmap.setImageBitmap(getPlaceholder(mContext, ownerimagerequest.accountName, owneravatarrequest.pageId, owneravatarrequest.avatarSize));
            return;
        } else
        {
            super.setImageBitmap(ownerimagerequest, bitmap);
            return;
        }
    }

}
