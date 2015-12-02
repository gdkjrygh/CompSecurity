// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.QwertyKeyListener;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.facebook.inject.t;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.facebook.user.UserWithIdentifier;
import com.facebook.widget.a.f;
import com.facebook.widget.a.h;
import com.facebook.widget.a.j;
import com.facebook.widget.a.k;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            p, ce, r

public class ContactAutoCompleteTextView extends AutoCompleteTextView
    implements h
{

    private static final Class a = com/facebook/orca/contacts/picker/ContactAutoCompleteTextView;
    private p b;
    private UserWithIdentifier c;

    public ContactAutoCompleteTextView(Context context)
    {
        super(context);
        a(context);
    }

    public ContactAutoCompleteTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public ContactAutoCompleteTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context);
    }

    private void a(Context context)
    {
        b = (p)t.a(context).a(com/facebook/orca/contacts/picker/p);
        c = null;
        setInputType(getInputType() | 0x80000);
    }

    private CharSequence c(UserWithIdentifier userwithidentifier)
    {
        String s = (new StringBuilder()).append(userwithidentifier.a().h()).append(" ").toString();
        Object obj = new TextPaint(getPaint());
        ((TextPaint) (obj)).setColor(getCurrentTextColor());
        userwithidentifier = new ce(userwithidentifier, getMeasuredWidth(), ((TextPaint) (obj)), getResources());
        obj = new SpannableString(s);
        ((SpannableString) (obj)).setSpan(userwithidentifier, 0, s.length(), 33);
        return ((CharSequence) (obj));
    }

    public void a()
    {
        int i = 0;
        Editable editable = getEditableText();
        ce ace[] = (ce[])editable.getSpans(0, editable.length(), com/facebook/orca/contacts/picker/ce);
        int j = Selection.getSelectionStart(editable);
        int l = Selection.getSelectionEnd(editable);
        for (int i1 = ace.length; i < i1; i++)
        {
            ce ce1 = ace[i];
            CharSequence charsequence = c(ce1.a());
            int j1 = editable.getSpanStart(ce1);
            int k1 = editable.getSpanEnd(ce1);
            if (j1 == -1 || k1 == -1)
            {
                throw new IllegalStateException("PickedUser not found in editable");
            }
            editable.removeSpan(ce1);
            editable.replace(j1, k1, charsequence);
        }

        if (l <= editable.length())
        {
            Selection.setSelection(editable, j, l);
        }
    }

    public void a(int i)
    {
        super.onFilterComplete(i);
    }

    void a(UserWithIdentifier userwithidentifier)
    {
        if (getMeasuredWidth() == 0)
        {
            c = userwithidentifier;
            return;
        }
        userwithidentifier = c(userwithidentifier);
        Editable editable = getEditableText();
        r r1 = b.a(editable);
        if (r1 != null)
        {
            QwertyKeyListener.markAsReplaced(editable, r1.a, r1.b, "");
            editable.replace(r1.a, r1.b, userwithidentifier);
        }
        Selection.setSelection(editable, editable.length());
    }

    public void a(j j)
    {
    }

    public void b(UserWithIdentifier userwithidentifier)
    {
        int i = 0;
        Editable editable = getEditableText();
        ce ace[] = (ce[])editable.getSpans(0, editable.length(), com/facebook/orca/contacts/picker/ce);
        for (int j = ace.length; i < j; i++)
        {
            ce ce1 = ace[i];
            if (ce1.a().b().equals(userwithidentifier.b()))
            {
                int l = editable.getSpanStart(ce1);
                int i1 = editable.getSpanEnd(ce1);
                editable.removeSpan(ce1);
                editable.replace(l, i1, "");
            }
        }

    }

    public boolean enoughToFilter()
    {
        Editable editable = getText();
        return b.b(editable).length() >= getThreshold();
    }

    public void onSizeChanged(int i, int j, int l, int i1)
    {
        super.onSizeChanged(i, j, l, i1);
        a();
        if (c != null)
        {
            UserWithIdentifier userwithidentifier = c;
            c = null;
            a(userwithidentifier);
        }
    }

    protected void performFiltering(CharSequence charsequence, int i)
    {
        charsequence = getText();
        charsequence = b.b(charsequence);
        ((k)getAdapter()).c().a(charsequence, this);
    }

    protected void replaceText(CharSequence charsequence)
    {
        clearComposingText();
    }

}
