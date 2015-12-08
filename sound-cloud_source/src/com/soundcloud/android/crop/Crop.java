// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

// Referenced classes of package com.soundcloud.android.crop:
//            CropImageActivity

public class Crop
{
    static interface Extra
    {

        public static final String ASPECT_X = "aspect_x";
        public static final String ASPECT_Y = "aspect_y";
        public static final String ERROR = "error";
        public static final String MAX_X = "max_x";
        public static final String MAX_Y = "max_y";
    }


    public static final int REQUEST_CROP = 6709;
    public static final int REQUEST_PICK = 9162;
    public static final int RESULT_ERROR = 404;
    private Intent cropIntent;

    private Crop(Uri uri, Uri uri1)
    {
        cropIntent = new Intent();
        cropIntent.setData(uri);
        cropIntent.putExtra("output", uri1);
    }

    public static Throwable getError(Intent intent)
    {
        return (Throwable)intent.getSerializableExtra("error");
    }

    private static Intent getImagePicker()
    {
        return (new Intent("android.intent.action.GET_CONTENT")).setType("image/*");
    }

    public static Uri getOutput(Intent intent)
    {
        return (Uri)intent.getParcelableExtra("output");
    }

    public static Crop of(Uri uri, Uri uri1)
    {
        return new Crop(uri, uri1);
    }

    public static void pickImage(Activity activity)
    {
        pickImage(activity, 9162);
    }

    public static void pickImage(Activity activity, int i)
    {
        try
        {
            activity.startActivityForResult(getImagePicker(), i);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            showImagePickerError(activity);
        }
    }

    public static void pickImage(Context context, Fragment fragment)
    {
        pickImage(context, fragment, 9162);
    }

    public static void pickImage(Context context, Fragment fragment, int i)
    {
        try
        {
            fragment.startActivityForResult(getImagePicker(), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            showImagePickerError(context);
        }
    }

    public static void pickImage(Context context, android.support.v4.app.Fragment fragment)
    {
        pickImage(context, fragment, 9162);
    }

    public static void pickImage(Context context, android.support.v4.app.Fragment fragment, int i)
    {
        try
        {
            fragment.startActivityForResult(getImagePicker(), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v4.app.Fragment fragment)
        {
            showImagePickerError(context);
        }
    }

    private static void showImagePickerError(Context context)
    {
        Toast.makeText(context, R.string.crop__pick_error, 0).show();
    }

    public Crop asSquare()
    {
        cropIntent.putExtra("aspect_x", 1);
        cropIntent.putExtra("aspect_y", 1);
        return this;
    }

    public Intent getIntent(Context context)
    {
        cropIntent.setClass(context, com/soundcloud/android/crop/CropImageActivity);
        return cropIntent;
    }

    public void start(Activity activity)
    {
        start(activity, 6709);
    }

    public void start(Activity activity, int i)
    {
        activity.startActivityForResult(getIntent(activity), i);
    }

    public void start(Context context, Fragment fragment)
    {
        start(context, fragment, 6709);
    }

    public void start(Context context, Fragment fragment, int i)
    {
        fragment.startActivityForResult(getIntent(context), i);
    }

    public void start(Context context, android.support.v4.app.Fragment fragment)
    {
        start(context, fragment, 6709);
    }

    public void start(Context context, android.support.v4.app.Fragment fragment, int i)
    {
        fragment.startActivityForResult(getIntent(context), i);
    }

    public Crop withAspect(int i, int j)
    {
        cropIntent.putExtra("aspect_x", i);
        cropIntent.putExtra("aspect_y", j);
        return this;
    }

    public Crop withMaxSize(int i, int j)
    {
        cropIntent.putExtra("max_x", i);
        cropIntent.putExtra("max_y", j);
        return this;
    }
}
