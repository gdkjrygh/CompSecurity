// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.pinterest.activity.create.helper.CreateImageHelper;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.remote.UserApi;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.utils.ImageUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class UserSetImageActivity extends BaseActivity
{

    private static final int MAX_USER_IMAGE_HEIGHT = 480;
    private static final int MAX_USER_IMAGE_WIDTH = 640;
    public ApiResponseHandler onImageUpload;

    public UserSetImageActivity()
    {
        onImageUpload = new _cls1();
    }

    public static byte[] bmpToByteArray(Bitmap bitmap)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, bytearrayoutputstream);
        Exception exception;
        byte abyte0[];
        try
        {
            bytearrayoutputstream.flush();
            abyte0 = bytearrayoutputstream.toByteArray();
            bytearrayoutputstream.close();
        }
        catch (IOException ioexception)
        {
            bitmap.recycle();
            return null;
        }
        finally { }
        bitmap.recycle();
        return abyte0;
        throw exception;
        exception;
        bitmap.recycle();
        throw exception;
    }

    public static Uri handleResult(Activity activity, int i, int j, Intent intent)
    {
        Object obj = null;
        activity = obj;
        if (j == -1)
        {
            if (i == 801)
            {
                intent = intent.getData();
                activity = intent;
                if (intent == null)
                {
                    activity = intent;
                    if (CreateImageHelper.cameraFile != null)
                    {
                        activity = Uri.fromFile(CreateImageHelper.cameraFile);
                    }
                }
            } else
            {
                activity = obj;
                if (i == 800)
                {
                    activity = obj;
                    if (CreateImageHelper.cameraFile != null)
                    {
                        return Uri.fromFile(CreateImageHelper.cameraFile);
                    }
                }
            }
        }
        return activity;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        intent = handleResult(this, i, j, intent);
        if (intent == null)
        {
            finish();
            return;
        }
        try
        {
            intent = ImageUtils.imageFromUri(this, intent, 0, 0, 640, 480, false, null);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent = null;
        }
        if (intent == null)
        {
            finish();
            return;
        } else
        {
            UserApi.a(bmpToByteArray(intent), onImageUpload, getApiTag());
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030029);
    }

    public void onResume()
    {
        super.onResume();
        String s = null;
        Object obj = getIntent().getExtras();
        if (obj != null)
        {
            s = ((Bundle) (obj)).getString("com.pinterest.EXTRA_SOURCE");
        }
        if (s != null)
        {
            getIntent().removeExtra("com.pinterest.EXTRA_SOURCE");
            obj = ((Bundle) (obj)).getString("com.pinterest.EXTRA_SOURCE_PACKAGE");
            if (s.equalsIgnoreCase("com.pinterest.EXTRA_SOURCE_GALLERY"))
            {
                CreateImageHelper.showGallery(this, ((String) (obj)));
            } else
            if (s.equalsIgnoreCase("com.pinterest.EXTRA_SOURCE_CAMERA"))
            {
                CreateImageHelper.showCamera(this, ((String) (obj)));
                return;
            }
        }
    }


    private class _cls1 extends ApiResponseHandler
    {

        final UserSetImageActivity this$0;

        public void onFailure(Throwable throwable, PinterestJsonObject pinterestjsonobject)
        {
            Application.showToast(0x7f0705d5);
            finish();
        }

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            super.onSuccess(pinterestjsonobject);
            Application.showToastShort(0x7f0705d6);
            class _cls1 extends com.pinterest.api.remote.UserApi.UserApiResponse
            {

                final _cls1 this$1;

                public void onSuccess(User user)
                {
                    super.onSuccess(user);
                    Pinalytics.a(EventType.USER_EDIT, null);
                    finish();
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            UserApi.a(String.valueOf(MyUser.getUid()), new _cls1(), getApiTag());
        }

        _cls1()
        {
            this$0 = UserSetImageActivity.this;
            super();
        }
    }

}
