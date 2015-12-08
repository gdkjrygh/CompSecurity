// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.components.web_contents_delegate_android;

import android.content.Context;
import org.chromium.content.browser.ContentViewCore;
import org.chromium.ui.ColorPickerDialog;
import org.chromium.ui.ColorSuggestion;
import org.chromium.ui.OnColorChangedListener;

public class ColorChooserAndroid
{

    private final ColorPickerDialog mDialog;
    private final long mNativeColorChooserAndroid;

    private ColorChooserAndroid(long l, Context context, int i, ColorSuggestion acolorsuggestion[])
    {
        OnColorChangedListener oncolorchangedlistener = new OnColorChangedListener() {

            final ColorChooserAndroid this$0;

            public void onColorChanged(int j)
            {
                mDialog.dismiss();
                nativeOnColorChosen(mNativeColorChooserAndroid, j);
            }

            
            {
                this$0 = ColorChooserAndroid.this;
                super();
            }
        };
        mNativeColorChooserAndroid = l;
        mDialog = new ColorPickerDialog(context, oncolorchangedlistener, i, acolorsuggestion);
    }

    private static void addToColorSuggestionArray(ColorSuggestion acolorsuggestion[], int i, int j, String s)
    {
        acolorsuggestion[i] = new ColorSuggestion(j, s);
    }

    public static ColorChooserAndroid createColorChooserAndroid(long l, ContentViewCore contentviewcore, int i, ColorSuggestion acolorsuggestion[])
    {
        contentviewcore = new ColorChooserAndroid(l, contentviewcore.getContext(), i, acolorsuggestion);
        contentviewcore.openColorChooser();
        return contentviewcore;
    }

    private static ColorSuggestion[] createColorSuggestionArray(int i)
    {
        return new ColorSuggestion[i];
    }

    private native void nativeOnColorChosen(long l, int i);

    private void openColorChooser()
    {
        mDialog.show();
    }

    public void closeColorChooser()
    {
        mDialog.dismiss();
    }



}
