// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.skype.android.SkypeDialogFragment;
import java.io.File;
import java.io.IOException;

public abstract class ChangePictureDialogFragment extends SkypeDialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    protected static final int DIALOG_ITEM_CHOOSE_FROM_GALLERY = 0;
    protected static final int DIALOG_ITEM_CLEAR_PICTURE = 2;
    protected static final int DIALOG_ITEM_TAKE_PICTURE = 1;
    protected static final String GALLERY_FILTER = "image/*";
    protected static final int RESULT_CAPTURE = 11;
    protected static final int RESULT_GALLERY_PICK = 10;
    protected boolean dismissOnResume;
    protected Uri imageUri;

    public ChangePictureDialogFragment()
    {
        dismissOnResume = false;
    }

    protected abstract void clearPicture();

    protected abstract CharSequence getTitle();

    protected abstract void handleImageIntent(Intent intent)
        throws IOException;

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j == -1)
        {
            switch (i)
            {
            default:
                return;

            case 10: // '\n'
            case 11: // '\013'
                break;
            }
            try
            {
                handleImageIntent(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                intent.printStackTrace();
            }
            dismiss();
            return;
        } else
        {
            dismissOnResume = true;
            return;
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            dialoginterface = new Intent("android.intent.action.GET_CONTENT", null);
            dialoginterface.setType("image/*");
            String s = Environment.getExternalStorageState();
            if (!"mounted".equals(s) || "mounted_ro".equals(s))
            {
                dialoginterface.putExtra("return-data", true);
            } else
            {
                imageUri = Uri.fromFile(new File(getActivity().getExternalCacheDir(), (new StringBuilder()).append(System.currentTimeMillis()).append(".jpg").toString()));
                dialoginterface.putExtra("output", imageUri);
            }
            startActivityForResult(dialoginterface, 10);
            return;

        case 1: // '\001'
            startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE", null), 11);
            return;

        case 2: // '\002'
            clearPicture();
            dismiss();
            return;
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(getTitle());
        ArrayAdapter arrayadapter = new ArrayAdapter(getActivity(), 0x7f0300fd) {

            final ChangePictureDialogFragment this$0;

            public final View getView(int j, View view, ViewGroup viewgroup)
            {
                return (TextView)super.getView(j, view, viewgroup);
            }

            
            {
                this$0 = ChangePictureDialogFragment.this;
                super(context, i);
            }
        };
        for (int i = 0; i < 3; i++)
        {
            arrayadapter.add(getString((new int[] {
                0x7f080126, 0x7f080199, 0x7f080127
            })[i]));
        }

        bundle.a(arrayadapter, 0, this);
        return bundle.c();
    }

    public void onResume()
    {
        super.onResume();
        if (dismissOnResume)
        {
            dismiss();
        }
    }

    protected abstract void setPicture(Bitmap bitmap);
}
