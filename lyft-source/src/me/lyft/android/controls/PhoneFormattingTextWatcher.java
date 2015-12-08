// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.text.Editable;
import android.text.TextWatcher;

public class PhoneFormattingTextWatcher
    implements TextWatcher
{

    boolean deleting;
    boolean formatting;
    PhoneFormattingTextWatcherListener listener;

    public PhoneFormattingTextWatcher(PhoneFormattingTextWatcherListener phoneformattingtextwatcherlistener)
    {
        formatting = false;
        deleting = false;
        listener = phoneformattingtextwatcherlistener;
    }

    public void afterTextChanged(Editable editable)
    {
        if (formatting) goto _L2; else goto _L1
_L1:
        String s;
        StringBuilder stringbuilder;
        s = editable.toString().replaceAll("[^0-9]", "");
        stringbuilder = new StringBuilder(s);
        if (!s.startsWith("1")) goto _L4; else goto _L3
_L3:
        if (s.length() > 11)
        {
            stringbuilder.delete(11, s.length());
        }
        if (!deleting) goto _L6; else goto _L5
_L5:
        if (s.length() > 1)
        {
            stringbuilder.insert(1, '-');
        }
        if (s.length() > 4)
        {
            stringbuilder.insert(5, '-');
        }
        if (s.length() > 7)
        {
            stringbuilder.insert(9, '-');
        }
_L8:
        s = stringbuilder.toString();
        if (listener != null)
        {
            listener.onFormat(s);
        }
        if (!editable.toString().equals(s))
        {
            formatting = true;
            editable.replace(0, editable.length(), s);
            formatting = false;
        }
_L2:
        return;
_L6:
        if (s.length() > 0)
        {
            stringbuilder.insert(1, '-');
        }
        if (s.length() > 3)
        {
            stringbuilder.insert(5, '-');
        }
        if (s.length() > 6)
        {
            stringbuilder.insert(9, '-');
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s.length() > 10)
        {
            stringbuilder.delete(10, s.length());
        }
        if (deleting)
        {
            if (s.length() > 3)
            {
                stringbuilder.insert(3, '-');
            }
            if (s.length() > 6)
            {
                stringbuilder.insert(7, '-');
            }
        } else
        {
            if (s.length() > 2)
            {
                stringbuilder.insert(3, '-');
            }
            if (s.length() > 5)
            {
                stringbuilder.insert(7, '-');
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        boolean flag;
        if (k < j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        deleting = flag;
    }

    private class PhoneFormattingTextWatcherListener
    {

        public abstract void onFormat(String s);
    }

}
