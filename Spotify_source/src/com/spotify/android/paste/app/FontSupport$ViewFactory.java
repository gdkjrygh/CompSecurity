// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.app;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

abstract class <init> extends Enum
{

    private static h a;
    private static h b;
    private static h c;
    private static h d;
    private static h e;
    private static h f;
    private static h g;
    private static h h;
    private static final h i[];
    String mName;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/spotify/android/paste/app/FontSupport$ViewFactory, s);
    }

    public static <init>[] values()
    {
        return (<init>[])i.clone();
    }

    public abstract int a();

    public abstract TextView a(Context context, AttributeSet attributeset);

    static 
    {
        a = new FontSupport.ViewFactory("AUTOCOMPLETETEXTVIEW", "AutoCompleteTextView") {

            public final int a()
            {
                return 0x7f0101e6;
            }

            public final TextView a(Context context, AttributeSet attributeset)
            {
                return new AutoCompleteTextView(context, attributeset);
            }

        };
        b = new FontSupport.ViewFactory("BUTTON", "Button") {

            public final int a()
            {
                return 0x7f0101e7;
            }

            public final TextView a(Context context, AttributeSet attributeset)
            {
                return new Button(context, attributeset);
            }

        };
        c = new FontSupport.ViewFactory("TOGGLEBUTTON", "ToggleButton") {

            public final int a()
            {
                return 0x101004b;
            }

            public final TextView a(Context context, AttributeSet attributeset)
            {
                return new ToggleButton(context, attributeset);
            }

        };
        d = new FontSupport.ViewFactory("CHECKBOX", "CheckBox") {

            public final int a()
            {
                return 0x7f0101e8;
            }

            public final TextView a(Context context, AttributeSet attributeset)
            {
                return new CheckBox(context, attributeset);
            }

        };
        e = new FontSupport.ViewFactory("CHECKEDTEXTVIEW", "CheckedTextView") {

            public final int a()
            {
                return 0x7f0101e9;
            }

            public final TextView a(Context context, AttributeSet attributeset)
            {
                return new CheckedTextView(context, attributeset);
            }

        };
        f = new FontSupport.ViewFactory("EDITTEXT", "EditText") {

            public final int a()
            {
                return 0x7f0101ea;
            }

            public final TextView a(Context context, AttributeSet attributeset)
            {
                return new EditText(context, attributeset);
            }

        };
        g = new FontSupport.ViewFactory("RADIOBUTTON", "RadioButton") {

            public final int a()
            {
                return 0x7f0101eb;
            }

            public final TextView a(Context context, AttributeSet attributeset)
            {
                return new RadioButton(context, attributeset);
            }

        };
        h = new FontSupport.ViewFactory("TEXTVIEW", "TextView") {

            public final int a()
            {
                return 0x7f0101ec;
            }

            public final TextView a(Context context, AttributeSet attributeset)
            {
                return new TextView(context, attributeset);
            }

        };
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private _cls8(String s, int j, String s1)
    {
        super(s, j);
        mName = s1;
    }

    mName(String s, int j, String s1, byte byte0)
    {
        this(s, j, s1);
    }
}
