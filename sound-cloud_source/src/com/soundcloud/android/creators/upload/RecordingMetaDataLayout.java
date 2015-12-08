// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import a.a;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.android.utils.images.ImageUtils;
import java.io.File;

public class RecordingMetaDataLayout extends RelativeLayout
{

    private Activity activity;
    ImageView artwork;
    private Drawable placeholder;
    private Recording recording;
    EditText titleText;

    public RecordingMetaDataLayout(Context context)
    {
        super(context);
        init();
    }

    public RecordingMetaDataLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public RecordingMetaDataLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void clearArtwork()
    {
        if (hasImage())
        {
            ImageUtils.recycleImageViewBitmap(artwork);
        }
        if (placeholder != null)
        {
            setImage(placeholder);
        }
    }

    private boolean hasImage()
    {
        return artwork.getDrawable() instanceof BitmapDrawable;
    }

    private void init()
    {
        a.a(this, ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f03007d, this));
        if (!isInEditMode())
        {
            IOUtils.mkdirs(Recording.IMAGE_DIR);
        }
    }

    private void showImagePickerDialog()
    {
        ImageUtils.showImagePickerDialog(activity, recording.getImageFile());
    }

    public boolean hasPlaceholder()
    {
        return placeholder != null;
    }

    public void mapFromRecording(Recording recording1)
    {
        setTitle(recording1.title);
        setImage(recording1.artwork_path);
    }

    public void mapToRecording(Recording recording1)
    {
        recording1.title = titleText.getText().toString();
    }

    void onArtworkButtonClick()
    {
        showImagePickerDialog();
    }

    void onArtworkClick()
    {
        if (!hasImage())
        {
            showImagePickerDialog();
            return;
        } else
        {
            Toast.makeText(getContext(), 0x7f0700dc, 1).show();
            return;
        }
    }

    boolean onArtworkLongClick()
    {
        recording.clearArtwork();
        clearArtwork();
        return true;
    }

    public void onDestroy()
    {
        clearArtwork();
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        titleText.setText(bundle.getString("createTitleValue"));
        recording = (Recording)bundle.getParcelable("recording");
        if (!TextUtils.isEmpty(bundle.getString("createArtworkPath")))
        {
            setImage(new File(bundle.getString("createArtworkPath")));
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("createTitleValue", titleText.getText().toString());
        bundle.putParcelable("recording", recording);
    }

    public void reset()
    {
        titleText.setText(null);
        clearArtwork();
        recording = null;
    }

    public void setActivity(FragmentActivity fragmentactivity)
    {
        activity = fragmentactivity;
    }

    public void setImage(Drawable drawable)
    {
        artwork.setImageDrawable(drawable);
    }

    public void setImage(File file)
    {
        if (file != null)
        {
            int i = (int)getResources().getDimension(0x7f0b0009);
            int j = (int)getResources().getDimension(0x7f0b000a);
            ImageUtils.setImage(file, artwork, i, j);
            return;
        } else
        {
            clearArtwork();
            return;
        }
    }

    public void setPlaceholder(Drawable drawable)
    {
        placeholder = drawable;
        setImage(placeholder);
    }

    public void setRecording(Recording recording1, boolean flag)
    {
        recording = recording1;
        if (flag)
        {
            mapFromRecording(recording1);
        }
        if (recording1 != null)
        {
            titleText.setHint(recording1.sharingNote(getResources()));
            titleText.setText(recording1.title);
            setImage(recording1.artwork_path);
        }
    }

    public void setTitle(String s)
    {
        if (s != null)
        {
            titleText.setTextKeepState(s);
        }
    }
}
