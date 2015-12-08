// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.people.Images;
import com.google.android.gms.people.People;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            OwnersImageManager

public final class OwnersCoverPhotoManager extends OwnersImageManager
{
    final class OwnerCoverPhotoRequest extends OwnersImageManager.OwnerImageRequest
    {

        public final String pageId;
        final OwnersCoverPhotoManager this$0;
        public final int width;

        public final void load()
        {
            People.ImageApi.loadOwnerCoverPhoto(mClient, accountName, pageId, width).setResultCallback(new ResultCallback() {

                final OwnerCoverPhotoRequest this$1;

                private void onResult(com.google.android.gms.people.Images.LoadImageResult loadimageresult)
                {
                    onImageLoaded(loadimageresult);
                }

                public final volatile void onResult(Result result)
                {
                    onResult((com.google.android.gms.people.Images.LoadImageResult)result);
                }

            
            {
                this$1 = OwnerCoverPhotoRequest.this;
                super();
            }
            });
        }

        public final void onImageLoaded(com.google.android.gms.people.Images.LoadImageResult loadimageresult)
        {
            OwnersCoverPhotoManager.this.onImageLoaded(loadimageresult.getStatus(), loadimageresult.getParcelFileDescriptor(), loadimageresult.getWidth(), loadimageresult.getHeight(), width, this);
        }

        public OwnerCoverPhotoRequest(ImageView imageview, String s, String s1, int i)
        {
            this$0 = OwnersCoverPhotoManager.this;
            super(OwnersCoverPhotoManager.this);
            view = imageview;
            accountName = s;
            pageId = s1;
            width = i;
        }
    }


    public OwnersCoverPhotoManager(Context context, GoogleApiClient googleapiclient)
    {
        super(context, googleapiclient, false);
    }

    public static Bitmap getPlaceholder(Context context)
    {
        return BitmapFactory.decodeResource(context.getResources(), R.drawable.account_switcher_blue);
    }

    public final void loadOwnerCoverPhoto(ImageView imageview, String s, String s1, int i)
    {
        loadImageRequest(new OwnerCoverPhotoRequest(imageview, s, s1, i));
    }

    protected final void setImageBitmap(OwnersImageManager.OwnerImageRequest ownerimagerequest, Bitmap bitmap)
    {
        if (bitmap == null)
        {
            ownerimagerequest.view.setImageBitmap(getPlaceholder(mContext));
            return;
        } else
        {
            super.setImageBitmap(ownerimagerequest, bitmap);
            return;
        }
    }
}
