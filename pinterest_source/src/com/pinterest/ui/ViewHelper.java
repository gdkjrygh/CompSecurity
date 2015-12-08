// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Application;
import com.pinterest.base.Colors;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

public class ViewHelper
{

    private static final int MAX_TEXT_LENGTH = 6;

    public ViewHelper()
    {
    }

    public static void changeViewLeftTo(View view, int i)
    {
        if (view == null)
        {
            return;
        } else
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
            layoutparams.addRule(0, i);
            view.setLayoutParams(layoutparams);
            return;
        }
    }

    public static Spanned getBoldText(int i, String s)
    {
        return Html.fromHtml(String.format(Resources.string(i), new Object[] {
            (new StringBuilder("<b>")).append(s).append("</b>").toString()
        }));
    }

    public static String getCapitalize(int i)
    {
        return WordUtils.capitalize(Resources.string(i));
    }

    public static Context getContext(View view, View view1)
    {
        if (view != null)
        {
            return view.getContext();
        }
        if (view1 != null)
        {
            return view1.getContext();
        } else
        {
            return Application.context();
        }
    }

    public static ShapeDrawable getRoundDrawable(int i, int j)
    {
        ShapeDrawable shapedrawable = new ShapeDrawable(new RoundRectShape(new float[] {
            (float)i, (float)i, (float)i, (float)i, (float)i, (float)i, (float)i, (float)i
        }, null, null));
        shapedrawable.getPaint().setColor(j);
        return shapedrawable;
    }

    public static int getViewMaxWidthPadding(int i)
    {
        int j = 0;
        int k = (int)Device.getScreenWidth();
        if (i < k)
        {
            j = (k - i) / 2;
        }
        return j;
    }

    public static boolean isEmpty(TextView textview)
    {
        return textview != null && StringUtils.isEmpty(textview.getText().toString());
    }

    public static boolean isKeyboardAction(int i, int j, KeyEvent keyevent)
    {
        return j == i || j == 0 || keyevent != null && keyevent.getKeyCode() == 66;
    }

    public static View listviewFooter(Activity activity)
    {
        return viewById(activity, 0x7f030174);
    }

    public static void safeSetText(TextView textview, String s)
    {
        if (textview != null && !TextUtils.isEmpty(s))
        {
            textview.setText(s);
        }
    }

    public static void setHardwareAccelerated(View view, boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            view.setLayerType(byte0, null);
        }
    }

    public static void setLeftDrawable(TextView textview, int i)
    {
        if (textview == null)
        {
            return;
        } else
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            return;
        }
    }

    public static void setRightDrawable(TextView textview, int i)
    {
        if (textview == null)
        {
            return;
        } else
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
            return;
        }
    }

    public static void setTextAndCursor(EditText edittext, String s)
    {
        if (edittext != null && ModelHelper.isValid(s))
        {
            edittext.setText(s);
            setTextCursorToEnd(edittext);
        }
    }

    public static void setTextCursorToEnd(EditText edittext)
    {
        if (edittext == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        edittext.setSelection(edittext.getText().toString().length());
        return;
        edittext;
    }

    public static void setViewMaxWidth(View view, int i)
    {
        android.view.ViewGroup.LayoutParams layoutparams;
label0:
        {
            if (view != null)
            {
                layoutparams = view.getLayoutParams();
                if (layoutparams != null)
                {
                    break label0;
                }
            }
            return;
        }
        int j = (int)Device.getScreenWidth();
        if (i > j)
        {
            layoutparams.width = j;
        } else
        {
            layoutparams.width = i;
        }
        view.setLayoutParams(layoutparams);
    }

    public static void setViewPadding(View view, int i)
    {
        if (view == null)
        {
            return;
        } else
        {
            view.setPadding(i, i, i, i);
            return;
        }
    }

    public static void setViewPaddingTopBottom(View view, int i)
    {
        if (view == null)
        {
            return;
        } else
        {
            view.setPadding(0, i, 0, i);
            return;
        }
    }

    public static void setVisibility(View view, int i)
    {
        if (view != null)
        {
            view.setVisibility(i);
        }
    }

    public static void setVisibility(View view, boolean flag)
    {
        if (view != null)
        {
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public static void showFollowMark(TextView textview, boolean flag)
    {
    }

    public static void showIconForLongText(TextView textview, int i)
    {
        if (textview != null && textview.getText().length() > 6)
        {
            textview.setText(0x7f070232);
            setLeftDrawable(textview, i);
        }
    }

    public static void showPassword(EditText edittext, boolean flag)
    {
        if (flag)
        {
            edittext.setTransformationMethod(null);
        } else
        {
            edittext.setTransformationMethod(new PasswordTransformationMethod());
        }
        setTextCursorToEnd(edittext);
    }

    public static android.widget.TabHost.TabSpec tabSpec(final TabHost host, String s)
    {
        return host.newTabSpec(s.toLowerCase()).setIndicator(s).setContent(new _cls1());
    }

    public static void updateFollow(TextView textview, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f0705b2;
        } else
        {
            i = 0x7f0702ab;
        }
        textview.setText(i);
        if (flag)
        {
            i = Colors.TEXT_DARK;
        } else
        {
            i = Colors.RED;
        }
        textview.setTextColor(i);
    }

    public static void updateViewWidth(View view, int i)
    {
        if (view != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
            int j = (int)Device.getScreenWidth();
            if (i > j)
            {
                layoutparams.width = j;
            } else
            {
                layoutparams.width = i;
            }
            view.setLayoutParams(layoutparams);
        }
    }

    public static View viewById(Activity activity, int i)
    {
        return activity.getLayoutInflater().inflate(i, null);
    }

    public static View viewById(Context context, int i)
    {
        return LayoutInflater.from(context).inflate(i, null);
    }

    private class _cls1
        implements android.widget.TabHost.TabContentFactory
    {

        final TabHost val$host;

        public final View createTabContent(String s)
        {
            return new View(host.getContext());
        }

        _cls1()
        {
            host = tabhost;
            super();
        }
    }

}
