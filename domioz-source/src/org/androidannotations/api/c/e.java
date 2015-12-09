// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.c;

import android.content.SharedPreferences;

// Referenced classes of package org.androidannotations.api.c:
//            m, c, f, h, 
//            j, o, q

public abstract class e
{

    private final android.content.SharedPreferences.Editor editor;

    public e(SharedPreferences sharedpreferences)
    {
        editor = sharedpreferences.edit();
    }

    private e cast()
    {
        return this;
    }

    public final void apply()
    {
        m.a(editor);
    }

    protected c booleanField(String s)
    {
        return new c(cast(), s);
    }

    public final e clear()
    {
        editor.clear();
        return cast();
    }

    protected f floatField(String s)
    {
        return new f(cast(), s);
    }

    protected android.content.SharedPreferences.Editor getEditor()
    {
        return editor;
    }

    protected h intField(String s)
    {
        return new h(cast(), s);
    }

    protected j longField(String s)
    {
        return new j(cast(), s);
    }

    protected o stringField(String s)
    {
        return new o(cast(), s);
    }

    protected q stringSetField(String s)
    {
        return new q(cast(), s);
    }
}
