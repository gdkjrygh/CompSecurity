// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.i;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fitbit.ui.DecimalEditText;
import com.fitbit.util.fonts.FitbitFont;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.fitbit.util.i:
//            d, e

public class com.fitbit.util.i.a
    implements com.fitbit.util.i.d
{
    public static class a extends android.text.Spannable.Factory
    {

        public Spannable newSpannable(CharSequence charsequence)
        {
            return super.newSpannable(com.fitbit.util.i.a.a(charsequence));
        }

        public a()
        {
        }
    }

    public static class b extends android.text.Editable.Factory
    {

        public Editable newEditable(CharSequence charsequence)
        {
            return super.newEditable(com.fitbit.util.i.a.a(charsequence));
        }

        public b()
        {
        }
    }

    public static class c
        implements TextWatcher
    {

        private final List a;
        private boolean b;

        public boolean a()
        {
            return a.isEmpty();
        }

        public void afterTextChanged(Editable editable)
        {
            if (!b)
            {
                b = true;
                for (Iterator iterator = a.iterator(); iterator.hasNext(); ((TextWatcher)iterator.next()).afterTextChanged(editable)) { }
                b = false;
            }
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (!b)
            {
                b = true;
                for (Iterator iterator = a.iterator(); iterator.hasNext(); ((TextWatcher)iterator.next()).beforeTextChanged(charsequence, i, j, k)) { }
                b = false;
            }
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (!b)
            {
                b = true;
                for (Iterator iterator = a.iterator(); iterator.hasNext(); ((TextWatcher)iterator.next()).onTextChanged(charsequence, i, j, k)) { }
                b = false;
            }
        }

        public c(List list)
        {
            a = list;
            b = false;
        }
    }

    public static class d
        implements TextWatcher
    {

        private static final String a[] = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        };
        private static final String b[] = {
            "\uF639", "\uF6DC", "\uF63A", "\uF63B", "\uF63C", "\uF63D", "\uF63E", "\uF63F", "\uF640", "\uF641"
        };

        public static CharSequence a(CharSequence charsequence)
        {
            return TextUtils.replace(charsequence, a, b);
        }

        public void afterTextChanged(Editable editable)
        {
            CharSequence charsequence = a(editable);
            if (!TextUtils.equals(editable, charsequence))
            {
                editable.clear();
                editable.append(charsequence);
            }
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }


        public d()
        {
        }
    }

    public static class e
        implements TextWatcher
    {

        private final TextView a;
        private boolean b;

        public void afterTextChanged(Editable editable)
        {
            if (!b)
            {
                b = true;
                a.setText(com.fitbit.util.i.a.a(editable));
            }
            b = false;
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public e(TextView textview)
        {
            a = textview;
            b = false;
        }
    }


    private static final String a = com/fitbit/util/i/a.getSimpleName();
    private static final String b = android/widget/TextView.getPackage().getName();
    private static final Set c;

    public com.fitbit.util.i.a()
    {
    }

    private static TextView a(String s, Context context, AttributeSet attributeset)
    {
        TypedArray typedarray1 = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.TextView, 0x1010084, 0);
        TypedArray typedarray = typedarray1;
        s = (TextView)com.fitbit.util.i.e.a(s, context, attributeset);
        typedarray = typedarray1;
        a(context, typedarray1, ((TextView) (s)));
        if (typedarray1 != null)
        {
            typedarray1.recycle();
        }
        return s;
        s;
        typedarray1 = null;
_L4:
        typedarray = typedarray1;
        com.fitbit.e.a.e(a, String.format("There was an error reading a textview, %s", new Object[] {
            s.getMessage()
        }), s, new Object[0]);
        if (typedarray1 != null)
        {
            typedarray1.recycle();
        }
        return null;
        s;
        typedarray = null;
_L2:
        if (typedarray != null)
        {
            typedarray.recycle();
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static CharSequence a(CharSequence charsequence)
    {
        SpannedString spannedstring = SpannedString.valueOf(charsequence);
        charsequence = SpannableString.valueOf(String.valueOf(charsequence).toUpperCase());
        TextUtils.copySpansFrom(spannedstring, 0, spannedstring.length(), java/lang/Object, charsequence, 0);
        return charsequence;
    }

    private static void a(Context context, TypedArray typedarray, TextView textview)
    {
        ArrayList arraylist = new ArrayList();
        FitbitFont fitbitfont = FitbitFont.a(typedarray);
        if (fitbitfont != null)
        {
            com.fitbit.util.fonts.a.a(context, textview, fitbitfont);
        }
        if (typedarray.getBoolean(1, false))
        {
            if (com.fitbit.util.b.a.a(14))
            {
                a(textview);
            } else
            {
                arraylist.add(b(textview));
            }
        }
        if (typedarray.getBoolean(2, false))
        {
            textview.setText(d.a(textview.getText()));
            arraylist.add(new d());
        }
        if (!arraylist.isEmpty())
        {
            if (arraylist.size() > 1)
            {
                context = new c(arraylist);
            } else
            {
                context = (TextWatcher)arraylist.get(0);
            }
            textview.addTextChangedListener(context);
        }
    }

    private static void a(TextView textview)
    {
        textview.setAllCaps(true);
    }

    public static boolean a(String s)
    {
        if (c.contains(s))
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = android/widget/TextView.isAssignableFrom(b(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    private static TextWatcher b(TextView textview)
    {
        textview.setSpannableFactory(new a());
        textview.setEditableFactory(new b());
        textview.setText(a(textview.getText()));
        return new e(textview);
    }

    public static Class b(String s)
        throws ClassNotFoundException
    {
        if (s.contains("."))
        {
            return Class.forName(s);
        } else
        {
            return Class.forName(String.format("%s.%s", new Object[] {
                b, s
            }));
        }
    }

    public View a(View view, String s, Context context, AttributeSet attributeset)
    {
        if (view == null && a(s))
        {
            return a(s, context, attributeset);
        }
        if (view == null || !(view instanceof TextView))
        {
            break MISSING_BLOCK_LABEL_65;
        }
        s = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.TextView, 0x1010084, 0);
        a(context, ((TypedArray) (s)), (TextView)view);
        s.recycle();
        return view;
        view;
        s.recycle();
        throw view;
        return null;
    }

    static 
    {
        c = new HashSet(3);
        c.add(android/widget/TextView.getSimpleName());
        c.add(android/widget/EditText.getSimpleName());
        c.add(com/fitbit/ui/EditText.getName());
        c.add(com/fitbit/ui/DecimalEditText.getName());
        c.add(android/widget/Button.getSimpleName());
    }
}
