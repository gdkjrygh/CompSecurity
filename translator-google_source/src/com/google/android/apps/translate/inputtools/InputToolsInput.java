// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.translate.widget.WordWrapInput;

// Referenced classes of package com.google.android.apps.translate.inputtools:
//            a, b, e

public class InputToolsInput extends WordWrapInput
{

    public e a;
    e b;
    private final SharedPreferences c;
    private String d;

    public InputToolsInput(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = context.getSharedPreferences("input_tools", 0);
    }

    static e a(InputToolsInput inputtoolsinput)
    {
        return inputtoolsinput.a;
    }

    static boolean a(KeyEvent keyevent)
    {
        return keyevent.getKeyCharacterMap() != null && keyevent.getKeyCharacterMap().isPrintingKey(keyevent.getKeyCode());
    }

    private String getInputMethodId()
    {
        String s1 = android.provider.Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        String s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return s;
    }

    public final boolean a(String s)
    {
        SharedPreferences sharedpreferences = c;
        Object obj = String.valueOf("active_");
        String s2 = String.valueOf(s);
        if (s2.length() != 0)
        {
            obj = ((String) (obj)).concat(s2);
        } else
        {
            obj = new String(((String) (obj)));
        }
        if (sharedpreferences.getBoolean(((String) (obj)), false))
        {
            obj = c;
            String s1 = String.valueOf("keyboard_");
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = s1.concat(s);
            } else
            {
                s = new String(s1);
            }
            if (TextUtils.equals(((SharedPreferences) (obj)).getString(s, ""), getInputMethodId()))
            {
                return true;
            }
        }
        return false;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        return new a(this, super.onCreateInputConnection(editorinfo));
    }

    public void setInputToolsEnabled(boolean flag)
    {
        Object obj;
        android.content.SharedPreferences.Editor editor;
        String s;
        if (flag)
        {
            obj = b;
        } else
        {
            obj = null;
        }
        a = ((e) (obj));
        editor = c.edit();
        obj = String.valueOf("active_");
        s = String.valueOf(d);
        if (s.length() != 0)
        {
            obj = ((String) (obj)).concat(s);
        } else
        {
            obj = new String(((String) (obj)));
        }
        editor = editor.putBoolean(((String) (obj)), flag);
        obj = String.valueOf("keyboard_");
        s = String.valueOf(d);
        if (s.length() != 0)
        {
            obj = ((String) (obj)).concat(s);
        } else
        {
            obj = new String(((String) (obj)));
        }
        editor.putString(((String) (obj)), getInputMethodId()).commit();
    }

    public void setLanguageCode(String s, Runnable runnable)
    {
        d = s;
        com.google.android.apps.translate.inputtools.b.a(s, this, runnable);
    }
}
