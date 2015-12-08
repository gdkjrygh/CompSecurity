// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.app;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import dfk;
import dgd;
import java.util.HashMap;
import java.util.Map;

public final class FontSupport
    implements android.view.LayoutInflater.Factory
{

    private static Map a;

    private FontSupport()
    {
    }

    public static void a(Activity activity)
    {
        if (activity.getLayoutInflater().getFactory() == null)
        {
            activity.getLayoutInflater().setFactory(new FontSupport());
        }
    }

    public final View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        ViewFactory viewfactory = (ViewFactory)a.get(s);
        if (viewfactory == null)
        {
            if ("fragment".equals(s))
            {
                throw new IllegalArgumentException("<fragment> tags are not supported when FontSupport is in use.");
            } else
            {
                return null;
            }
        }
        s = viewfactory.a(context, attributeset);
        int i = viewfactory.a();
        if (!s.isInEditMode())
        {
            android.graphics.Typeface typeface = dgd.a(context, attributeset, i);
            if (typeface != null)
            {
                s.setTypeface(typeface);
            }
        }
        if (!s.isInEditMode())
        {
            dfk.a(context, s, attributeset, i);
        }
        context = s.getPaint();
        context.setFlags(context.getFlags() | 0x80 | 1);
        context.setHinting(0);
        return s;
    }

    static 
    {
        a = new HashMap();
        ViewFactory aviewfactory[] = ViewFactory.values();
        int j = aviewfactory.length;
        for (int i = 0; i < j; i++)
        {
            ViewFactory viewfactory = aviewfactory[i];
            a.put(viewfactory.mName, viewfactory);
        }

    }

    private class ViewFactory extends Enum
    {

        private static ViewFactory a;
        private static ViewFactory b;
        private static ViewFactory c;
        private static ViewFactory d;
        private static ViewFactory e;
        private static ViewFactory f;
        private static ViewFactory g;
        private static ViewFactory h;
        private static final ViewFactory i[];
        String mName;

        public static ViewFactory valueOf(String s)
        {
            return (ViewFactory)Enum.valueOf(com/spotify/android/paste/app/FontSupport$ViewFactory, s);
        }

        public static ViewFactory[] values()
        {
            return (ViewFactory[])i.clone();
        }

        public abstract int a();

        public abstract TextView a(Context context, AttributeSet attributeset);

        static 
        {
            a = new ViewFactory("AUTOCOMPLETETEXTVIEW", "AutoCompleteTextView") {

                public final int a()
                {
                    return 0x7f0101e6;
                }

                public final TextView a(Context context, AttributeSet attributeset)
                {
                    return new AutoCompleteTextView(context, attributeset);
                }

            };
            b = new ViewFactory("BUTTON", "Button") {

                public final int a()
                {
                    return 0x7f0101e7;
                }

                public final TextView a(Context context, AttributeSet attributeset)
                {
                    return new Button(context, attributeset);
                }

            };
            c = new ViewFactory("TOGGLEBUTTON", "ToggleButton") {

                public final int a()
                {
                    return 0x101004b;
                }

                public final TextView a(Context context, AttributeSet attributeset)
                {
                    return new ToggleButton(context, attributeset);
                }

            };
            d = new ViewFactory("CHECKBOX", "CheckBox") {

                public final int a()
                {
                    return 0x7f0101e8;
                }

                public final TextView a(Context context, AttributeSet attributeset)
                {
                    return new CheckBox(context, attributeset);
                }

            };
            e = new ViewFactory("CHECKEDTEXTVIEW", "CheckedTextView") {

                public final int a()
                {
                    return 0x7f0101e9;
                }

                public final TextView a(Context context, AttributeSet attributeset)
                {
                    return new CheckedTextView(context, attributeset);
                }

            };
            f = new ViewFactory("EDITTEXT", "EditText") {

                public final int a()
                {
                    return 0x7f0101ea;
                }

                public final TextView a(Context context, AttributeSet attributeset)
                {
                    return new EditText(context, attributeset);
                }

            };
            g = new ViewFactory("RADIOBUTTON", "RadioButton") {

                public final int a()
                {
                    return 0x7f0101eb;
                }

                public final TextView a(Context context, AttributeSet attributeset)
                {
                    return new RadioButton(context, attributeset);
                }

            };
            h = new ViewFactory("TEXTVIEW", "TextView") {

                public final int a()
                {
                    return 0x7f0101ec;
                }

                public final TextView a(Context context, AttributeSet attributeset)
                {
                    return new TextView(context, attributeset);
                }

            };
            i = (new ViewFactory[] {
                a, b, c, d, e, f, g, h
            });
        }

        private ViewFactory(String s, int j, String s1)
        {
            super(s, j);
            mName = s1;
        }

        ViewFactory(String s, int j, String s1, byte byte0)
        {
            this(s, j, s1);
        }
    }

}
