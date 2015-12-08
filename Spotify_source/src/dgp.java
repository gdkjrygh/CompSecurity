// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.android.paste.widget.SpotifyIconView;

public final class dgp
{

    public static EditText a(Context context)
    {
        EditText edittext = new EditText(context);
        android.view.ViewGroup.LayoutParams layoutparams = h(context, null);
        if (layoutparams != null)
        {
            edittext.setLayoutParams(layoutparams);
        }
        edittext.setTypeface(dgd.a(context, null, 0x101006e));
        dfk.a(context, edittext, null, 0x101006e);
        return edittext;
    }

    public static TextView a(Context context, ViewGroup viewgroup)
    {
        return a(context, viewgroup, 0);
    }

    public static TextView a(Context context, ViewGroup viewgroup, int i)
    {
        TextView textview;
        if (i != 0)
        {
            textview = new TextView(context, null, i);
        } else
        {
            textview = new TextView(context);
            i = 0x1010084;
        }
        viewgroup = h(context, viewgroup);
        if (viewgroup != null)
        {
            textview.setLayoutParams(viewgroup);
        }
        textview.setTypeface(dgd.a(context, null, i));
        dfk.a(context, textview, null, i);
        return textview;
    }

    public static ToggleButton a(Context context, CharSequence charsequence, CharSequence charsequence1)
    {
        ToggleButton togglebutton = new ToggleButton(context, null, 0x7f0101fc);
        togglebutton.setTextOn(charsequence);
        togglebutton.setTextOff(charsequence1);
        charsequence = h(context, null);
        if (charsequence != null)
        {
            togglebutton.setLayoutParams(charsequence);
        }
        togglebutton.setTypeface(dgd.a(context, null, 0x7f0101fc));
        dfk.a(context, togglebutton, null, 0x7f0101fc);
        togglebutton.setEllipsize(null);
        return togglebutton;
    }

    public static AutoCompleteTextView b(Context context)
    {
        AutoCompleteTextView autocompletetextview = new AutoCompleteTextView(context);
        android.view.ViewGroup.LayoutParams layoutparams = h(context, null);
        if (layoutparams != null)
        {
            autocompletetextview.setLayoutParams(layoutparams);
        }
        autocompletetextview.setTypeface(dgd.a(context, null, 0x101006b));
        dfk.a(context, autocompletetextview, null, 0x101006b);
        return autocompletetextview;
    }

    public static Button b(Context context, ViewGroup viewgroup)
    {
        return b(context, viewgroup, 0);
    }

    private static Button b(Context context, ViewGroup viewgroup, int i)
    {
        Button button;
        if (i != 0)
        {
            button = new Button(context, null, i);
        } else
        {
            button = new Button(context);
            i = 0x1010048;
        }
        viewgroup = h(context, viewgroup);
        if (viewgroup != null)
        {
            button.setLayoutParams(viewgroup);
        }
        button.setTypeface(dgd.a(context, null, i));
        dfk.a(context, button, null, i);
        return button;
    }

    public static Button c(Context context, ViewGroup viewgroup)
    {
        return b(context, viewgroup, 0x7f0101fd);
    }

    public static CheckBox c(Context context)
    {
        CheckBox checkbox = new CheckBox(context);
        android.view.ViewGroup.LayoutParams layoutparams = h(context, null);
        if (layoutparams != null)
        {
            checkbox.setLayoutParams(layoutparams);
        }
        checkbox.setTypeface(dgd.a(context, null, 0x101006c));
        dfk.a(context, checkbox, null, 0x101006c);
        return checkbox;
    }

    private static SpotifyIconView c(Context context, ViewGroup viewgroup, int i)
    {
        SpotifyIconView spotifyiconview;
        if (i != 0)
        {
            spotifyiconview = new SpotifyIconView(context, null, i);
        } else
        {
            spotifyiconview = new SpotifyIconView(context);
        }
        context = h(context, viewgroup);
        if (context != null)
        {
            spotifyiconview.setLayoutParams(context);
        }
        return spotifyiconview;
    }

    public static Button d(Context context, ViewGroup viewgroup)
    {
        return b(context, viewgroup, 0x7f0101fe);
    }

    public static TextView d(Context context)
    {
        context = a(context, ((ViewGroup) (null)), 0x7f0101fb);
        context.setText("EXPLICIT");
        return context;
    }

    public static Button e(Context context)
    {
        return b(context, null, 0x7f0101fc);
    }

    public static Button e(Context context, ViewGroup viewgroup)
    {
        return b(context, viewgroup, 0x7f010200);
    }

    public static SectionHeaderView f(Context context)
    {
        return new SectionHeaderView(context);
    }

    public static SpotifyIconView f(Context context, ViewGroup viewgroup)
    {
        return c(context, viewgroup, 0);
    }

    public static SectionHeaderView g(Context context)
    {
        return new SectionHeaderView(context, null, 0x7f01020a);
    }

    public static SpotifyIconView g(Context context, ViewGroup viewgroup)
    {
        return c(context, viewgroup, 0x7f010206);
    }

    private static android.view.ViewGroup.LayoutParams h(Context context, ViewGroup viewgroup)
    {
        if (viewgroup == null)
        {
            return null;
        }
        context = context.getResources().getLayout(0x7f03010a);
        try
        {
            while (context.nextToken() != 2) ;
            context = viewgroup.generateLayoutParams(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
        return context;
    }
}
