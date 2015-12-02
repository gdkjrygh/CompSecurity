// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard.entry;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.widget.CustomRelativeLayout;

// Referenced classes of package com.facebook.contacts.contactcard.entry:
//            c, d, e

public class b extends CustomRelativeLayout
{

    private final InputMethodManager a;
    private final EditText b;
    private final ImageButton c;
    private e d;

    public b(Context context)
    {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public b(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a = (InputMethodManager)getInjector().a(android/view/inputmethod/InputMethodManager);
        setContentView(k.contacts_create_phone_entry_view);
        b = (EditText)a(i.contacts_create_number_input);
        b.setOnEditorActionListener(new c(this));
        c = (ImageButton)a(i.contacts_add_hidden_phone_button);
        c.setOnClickListener(new d(this));
    }

    static e a(b b1)
    {
        return b1.d;
    }

    public String getInputValue()
    {
        return b.getText().toString();
    }

    protected void onWindowVisibilityChanged(int j)
    {
        if (j == 8)
        {
            a.hideSoftInputFromWindow(b.getWindowToken(), 0);
            b.setText("");
        }
    }

    public void setListener(e e)
    {
        d = e;
    }

    public void setPlusButtonVisibility(boolean flag)
    {
        ImageButton imagebutton = c;
        int j;
        if (flag)
        {
            j = 0;
        } else
        {
            j = 4;
        }
        imagebutton.setVisibility(j);
    }
}
