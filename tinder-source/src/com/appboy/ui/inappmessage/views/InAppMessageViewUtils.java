// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.Constants;
import com.appboy.models.MessageButton;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.ui.support.ViewUtils;
import java.util.List;

public class InAppMessageViewUtils
{

    private static final String TAG;

    public InAppMessageViewUtils()
    {
    }

    public static void closeInAppMessageOnKeycodeBack()
    {
        AppboyLogger.d(TAG, "Back button intercepted by in-app message view, closing in-app message.");
        AppboyInAppMessageManager.getInstance().hideCurrentInAppMessage(true, true);
    }

    public static boolean isValidIcon(String s)
    {
        return s != null;
    }

    public static boolean isValidInAppMessageColor(int i)
    {
        return i != 0;
    }

    protected static void resetButtonSizesIfNecessary(List list, List list1)
    {
        if (list1 != null && list1.size() == 1)
        {
            list1 = new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F);
            ((View)list.get(0)).setLayoutParams(list1);
        }
    }

    protected static void resetMessageMarginsIfNecessary(TextView textview, TextView textview1)
    {
        if (textview1 == null && textview != null)
        {
            textview1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            textview1.setMargins(0, 0, 0, 0);
            textview.setLayoutParams(textview1);
        }
    }

    public static void setButtons(List list, View view, int i, List list1)
    {
        if (list1 == null || list1.size() == 0)
        {
            ViewUtils.removeViewFromParent(view);
        } else
        {
            int j = 0;
            while (j < list.size()) 
            {
                if (list1.size() <= j)
                {
                    ((View)list.get(j)).setVisibility(8);
                } else
                if (list.get(j) instanceof Button)
                {
                    view = (Button)list.get(j);
                    MessageButton messagebutton = (MessageButton)list1.get(j);
                    view.setText(messagebutton.getText());
                    setTextViewColor(view, messagebutton.getTextColor());
                    setDrawableColor(view.getBackground(), messagebutton.getBackgroundColor(), i);
                }
                j++;
            }
        }
    }

    public static void setDrawableColor(Drawable drawable, int i, int j)
    {
        if (drawable instanceof GradientDrawable)
        {
            setDrawableColor((GradientDrawable)drawable, i, j);
            return;
        }
        if (isValidInAppMessageColor(i))
        {
            drawable.setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        } else
        {
            drawable.setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        }
    }

    public static void setDrawableColor(GradientDrawable gradientdrawable, int i, int j)
    {
        if (isValidInAppMessageColor(i))
        {
            gradientdrawable.setColor(i);
            return;
        } else
        {
            gradientdrawable.setColor(j);
            return;
        }
    }

    public static void setIcon(Context context, String s, int i, int j, TextView textview)
    {
label0:
        {
            if (isValidIcon(s))
            {
                try
                {
                    textview.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    AppboyLogger.e(TAG, "Caught exception setting icon typeface. Not rendering icon.", context);
                    return;
                }
                textview.setText(s);
                setTextViewColor(textview, i);
                if (textview.getBackground() == null)
                {
                    break label0;
                }
                setDrawableColor(textview.getBackground(), j, context.getResources().getColor(com.appboy.ui.R.color.com_appboy_inappmessage_icon_background));
            }
            return;
        }
        setViewBackgroundColor(textview, j);
    }

    public static void setImage(Bitmap bitmap, ImageView imageview)
    {
        if (bitmap != null)
        {
            imageview.setImageBitmap(bitmap);
        }
    }

    public static void setTextViewColor(TextView textview, int i)
    {
        if (isValidInAppMessageColor(i))
        {
            textview.setTextColor(i);
        }
    }

    public static void setViewBackgroundColor(View view, int i)
    {
        if (isValidInAppMessageColor(i))
        {
            view.setBackgroundColor(i);
        }
    }

    public static void setViewBackgroundColorFilter(View view, int i, int j)
    {
        if (isValidInAppMessageColor(i))
        {
            view.getBackground().setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        } else
        {
            view.getBackground().setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        }
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/inappmessage/views/InAppMessageViewUtils.getName()
        });
    }
}
