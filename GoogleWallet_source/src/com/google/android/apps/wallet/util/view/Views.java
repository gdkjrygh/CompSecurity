// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.common.base.Strings;

// Referenced classes of package com.google.android.apps.wallet.util.view:
//            WalletUrlSpan, ClickableSpanWithoutUnderline

public final class Views
{

    public static void disableHardwareAccelerationAtView(View view)
    {
        view.setLayerType(1, null);
    }

    public static View findViewById(Activity activity, int i)
    {
        return activity.findViewById(i);
    }

    public static View findViewById(View view, int i)
    {
        return view.findViewById(i);
    }

    public static Object getFromTag(View view)
    {
        return view.getTag();
    }

    public static void hideDrawableIndicators(TextView textview)
    {
        textview.setCompoundDrawables(null, null, null, null);
    }

    public static void hideSoftKeyboard(Context context, View view)
    {
        if (view == null)
        {
            return;
        } else
        {
            ((InputMethodManager)context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            return;
        }
    }

    private static Spannable makeNativeLinkToStartIntent(final Context context, int i, final Intent intent)
    {
        String s1 = context.getString(i);
        i = s1.indexOf("<native-link>");
        String s = s1.substring(0, i);
        String s2 = s1.replace("<native-link>", "");
        int j = s2.indexOf("</native-link>");
        s1 = s2.substring(i, j);
        s2 = s2.replace("</native-link>", "").substring(j);
        context = new ClickableSpanWithoutUnderline() {

            final Context val$context;
            final Intent val$intent;

            public final void onClick(View view)
            {
                context.startActivity(intent);
            }

            
            {
                context = context1;
                intent = intent1;
                super();
            }
        };
        intent = new StringBuilder();
        if (s.length() > 0)
        {
            intent.append(s);
        }
        intent.append(s1);
        if (s2.length() > 0)
        {
            intent.append(s2);
        }
        intent = SpannableString.valueOf(intent.toString());
        intent.setSpan(context, i, s1.length() + i, 33);
        return intent;
    }

    public static void setHtml(TextView textview, String s)
    {
        s = android.text.Spannable.Factory.getInstance().newSpannable(Html.fromHtml(s));
        URLSpan aurlspan[] = (URLSpan[])s.getSpans(0, s.length(), android/text/style/URLSpan);
        int j = aurlspan.length;
        for (int i = 0; i < j; i++)
        {
            URLSpan urlspan = aurlspan[i];
            int k = s.getSpanStart(urlspan);
            int l = s.getSpanEnd(urlspan);
            s.removeSpan(urlspan);
            s.setSpan(new WalletUrlSpan(urlspan.getURL(), textview.getContext()), k, l, 0);
        }

        textview.setText(s);
    }

    public static void setLink(TextView textview, String s)
    {
        setHtml(textview, s);
        textview.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private static void setLinkContentDescription(View view, String s)
    {
        view.setContentDescription(view.getContext().getString(com.google.android.apps.walletnfcrel.R.string.link_content_description_template, new Object[] {
            s
        }));
    }

    public static void setLinkContentDescription(TextView textview)
    {
        setLinkContentDescription(((View) (textview)), textview.getText().toString());
    }

    public static void setLinkOnClickListener(View view, android.view.View.OnClickListener onclicklistener, int i)
    {
        setLinkOnClickListener(view, onclicklistener, view.getContext().getString(i));
    }

    public static void setLinkOnClickListener(View view, android.view.View.OnClickListener onclicklistener, String s)
    {
        view.setOnClickListener(onclicklistener);
        setLinkContentDescription(view, s);
    }

    public static void setLinkOnClickListener(TextView textview, android.view.View.OnClickListener onclicklistener)
    {
        setLinkOnClickListener(((View) (textview)), onclicklistener, textview.getText().toString());
        textview.setTextColor(textview.getResources().getColor(com.google.android.apps.walletnfcrel.R.color.action));
    }

    public static void setNativeLink(TextView textview, int i, Intent intent)
    {
        textview.setText(makeNativeLinkToStartIntent(textview.getContext(), i, intent));
        textview.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void setTag(View view, Object obj)
    {
        view.setTag(obj);
    }

    public static void setTextOrHide(TextView textview, String s)
    {
        setTextOrHide(textview, s, false);
    }

    private static void setTextOrHide(TextView textview, String s, boolean flag)
    {
        if (!Strings.isNullOrEmpty(s))
        {
            textview.setVisibility(0);
            if (flag)
            {
                setHtml(textview, s);
                return;
            } else
            {
                textview.setText(s);
                return;
            }
        } else
        {
            textview.setVisibility(8);
            return;
        }
    }

    public static void showAlertIndicator(TextView textview)
    {
        textview.setCompoundDrawablePadding(textview.getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.narrow_spacing));
        int i = Math.round(textview.getTextSize());
        Drawable drawable = textview.getResources().getDrawable(com.google.android.apps.walletnfcrel.R.drawable.ic_warning);
        drawable.setBounds(0, 0, i, i);
        textview.setCompoundDrawables(drawable, null, null, null);
    }

    public static void showSoftKeyboard(Context context, View view)
    {
        ((InputMethodManager)context.getSystemService("input_method")).showSoftInput(view, 0);
    }
}
