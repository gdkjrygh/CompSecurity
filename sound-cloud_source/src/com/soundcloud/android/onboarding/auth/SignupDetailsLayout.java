// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.crop.Crop;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.images.ImageUtils;
import java.io.File;

public class SignupDetailsLayout extends RelativeLayout
{
    public static interface UserDetailsHandler
    {

        public abstract FragmentActivity getFragmentActivity();

        public abstract void onSkipUserDetails();

        public abstract void onSubmitUserDetails(String s, File file);
    }


    private static final String BUNDLE_FILE = "BUNDLE_FILE";
    private static final String BUNDLE_USERNAME = "BUNDLE_USERNAME";
    private File avatarFile;
    private UserDetailsHandler userDetailsHandler;

    public SignupDetailsLayout(Context context)
    {
        super(context);
    }

    public SignupDetailsLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SignupDetailsLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void resetAvatarFile()
    {
        avatarFile = null;
    }

    public File generateTempAvatarFile()
    {
        avatarFile = ImageUtils.createTempAvatarFile();
        avatarFile.setWritable(true, false);
        return avatarFile;
    }

    public Bundle getStateBundle()
    {
        EditText edittext = (EditText)findViewById(0x7f0f0240);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("BUNDLE_USERNAME", edittext.getText());
        bundle.putSerializable("BUNDLE_FILE", avatarFile);
        return bundle;
    }

    public UserDetailsHandler getUserDetailsHandler()
    {
        return userDetailsHandler;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        final EditText username = (EditText)findViewById(0x7f0f0240);
        final TextView avatarText = (TextView)findViewById(0x7f0f023e);
        final ImageView avatarView = (ImageView)findViewById(0x7f0f00ce);
        Button button = (Button)findViewById(0x7f0f0241);
        Button button1 = (Button)findViewById(0x7f0f0242);
        username.setHint(0x7f070081);
        username.setOnEditorActionListener(new _cls1());
        button.setOnClickListener(new _cls2());
        button1.setOnClickListener(new _cls3());
        avatarText.setOnClickListener(new _cls4());
        avatarView.setOnClickListener(new _cls5());
        avatarView.setOnLongClickListener(new _cls6());
    }

    public void onImageCrop(int i, Intent intent)
    {
        if (i == -1)
        {
            setImage(avatarFile);
        } else
        if (i == 404)
        {
            ErrorUtils.handleSilentException("error cropping image", Crop.getError(intent));
            Toast.makeText(getContext(), 0x7f0700fc, 0).show();
            return;
        }
    }

    public void onImagePick(int i, Intent intent)
    {
        if (i == -1)
        {
            File file = ImageUtils.createTempAvatarFile();
            if (file != null)
            {
                avatarFile = file;
                ImageUtils.sendCropIntent((Activity)getContext(), intent.getData(), Uri.fromFile(avatarFile));
            }
        }
    }

    public void onImageTake(int i)
    {
label0:
        {
            if (avatarFile != null)
            {
                if (i != -1)
                {
                    break label0;
                }
                ImageUtils.sendCropIntent((Activity)getContext(), Uri.fromFile(avatarFile));
            }
            return;
        }
        resetAvatarFile();
    }

    void setAvatarTemporaryFile(File file)
    {
        avatarFile = file;
    }

    public void setImage(File file)
    {
        if (file != null)
        {
            if (Log.isLoggable(SoundCloudApplication.TAG, 3))
            {
                String s = SoundCloudApplication.TAG;
                (new StringBuilder("setImage(")).append(file).append(")");
            }
            TextView textview = (TextView)findViewById(0x7f0f023e);
            ImageView imageview = (ImageView)findViewById(0x7f0f00ce);
            avatarFile = file;
            ImageUtils.setImage(file, imageview, (int)(getResources().getDisplayMetrics().density * 100F), (int)(getResources().getDisplayMetrics().density * 100F));
            textview.setVisibility(8);
            imageview.setVisibility(0);
        }
    }

    public void setState(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            ((EditText)findViewById(0x7f0f0240)).setText(bundle.getCharSequence("BUNDLE_USERNAME"));
            setImage((File)bundle.getSerializable("BUNDLE_FILE"));
            return;
        }
    }

    public void setUserDetailsHandler(UserDetailsHandler userdetailshandler)
    {
        userDetailsHandler = userdetailshandler;
    }




    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final SignupDetailsLayout this$0;
        final TextView val$avatarText;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
label0:
            {
                boolean flag3 = false;
                boolean flag;
                boolean flag1;
                boolean flag2;
                if (i == 6)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (keyevent != null && keyevent.getKeyCode() == 66)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (keyevent != null && keyevent.getAction() == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (i == 0)
                {
                    flag2 = flag3;
                    if (!flag)
                    {
                        break label0;
                    }
                    flag2 = flag3;
                    if (!flag1)
                    {
                        break label0;
                    }
                }
                flag2 = flag3;
                if (avatarFile == null)
                {
                    flag2 = flag3;
                    if (avatarText.performClick())
                    {
                        flag2 = true;
                    }
                }
            }
            return flag2;
        }

        _cls1()
        {
            this$0 = SignupDetailsLayout.this;
            avatarText = textview;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final SignupDetailsLayout this$0;

        public void onClick(View view)
        {
            if (getUserDetailsHandler() != null)
            {
                getUserDetailsHandler().onSkipUserDetails();
            }
        }

        _cls2()
        {
            this$0 = SignupDetailsLayout.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final SignupDetailsLayout this$0;
        final EditText val$username;

        public void onClick(View view)
        {
            if (getUserDetailsHandler() != null)
            {
                getUserDetailsHandler().onSubmitUserDetails(username.getText().toString(), avatarFile);
            }
        }

        _cls3()
        {
            this$0 = SignupDetailsLayout.this;
            username = edittext;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final SignupDetailsLayout this$0;

        public void onClick(View view)
        {
            ImageUtils.showImagePickerDialog(userDetailsHandler.getFragmentActivity(), generateTempAvatarFile());
        }

        _cls4()
        {
            this$0 = SignupDetailsLayout.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final SignupDetailsLayout this$0;

        public void onClick(View view)
        {
            Toast.makeText(getContext(), 0x7f070086, 1).show();
        }

        _cls5()
        {
            this$0 = SignupDetailsLayout.this;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnLongClickListener
    {

        final SignupDetailsLayout this$0;
        final TextView val$avatarText;
        final ImageView val$avatarView;

        public boolean onLongClick(View view)
        {
            resetAvatarFile();
            avatarView.setVisibility(8);
            avatarText.setVisibility(0);
            return true;
        }

        _cls6()
        {
            this$0 = SignupDetailsLayout.this;
            avatarView = imageview;
            avatarText = textview;
            super();
        }
    }

}
