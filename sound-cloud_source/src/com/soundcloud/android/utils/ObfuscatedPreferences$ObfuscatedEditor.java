// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.SharedPreferences;
import com.soundcloud.android.crypto.Obfuscator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.utils:
//            ObfuscatedPreferences

public class wrappedEditor
    implements android.content.scatedEditor
{

    final ObfuscatedPreferences this$0;
    private final android.content.scatedEditor.this._cls0 wrappedEditor;

    public void apply()
    {
        wrappedEditor.wrappedEditor();
    }

    public android.content.scatedEditor clear()
    {
        return wrappedEditor.wrappedEditor();
    }

    public boolean commit()
    {
        return wrappedEditor.wrappedEditor();
    }

    public android.content.scatedEditor putBoolean(String s, boolean flag)
    {
        wrappedEditor.wrappedEditor(ObfuscatedPreferences.access$100(ObfuscatedPreferences.this).obfuscate(s), ObfuscatedPreferences.access$100(ObfuscatedPreferences.this).obfuscate(flag));
        return this;
    }

    public android.content.scatedEditor putFloat(String s, float f)
    {
        throw ObfuscatedPreferences.access$200(ObfuscatedPreferences.this);
    }

    public android.content.scatedEditor putInt(String s, int i)
    {
        throw ObfuscatedPreferences.access$200(ObfuscatedPreferences.this);
    }

    public android.content.scatedEditor putLong(String s, long l)
    {
        throw ObfuscatedPreferences.access$200(ObfuscatedPreferences.this);
    }

    public android.content.scatedEditor putString(String s, String s1)
    {
        wrappedEditor.wrappedEditor(ObfuscatedPreferences.access$100(ObfuscatedPreferences.this).obfuscate(s), ObfuscatedPreferences.access$100(ObfuscatedPreferences.this).obfuscate(s1));
        return this;
    }

    public android.content.scatedEditor putStringSet(String s, Set set)
    {
        HashSet hashset = new HashSet();
        String s1;
        for (set = set.iterator(); set.hasNext(); hashset.add(ObfuscatedPreferences.access$100(ObfuscatedPreferences.this).obfuscate(s1)))
        {
            s1 = (String)set.next();
        }

        wrappedEditor.wrappedEditor(ObfuscatedPreferences.access$100(ObfuscatedPreferences.this).obfuscate(s), hashset);
        return this;
    }

    public android.content.scatedEditor remove(String s)
    {
        return wrappedEditor.wrappedEditor(ObfuscatedPreferences.access$100(ObfuscatedPreferences.this).obfuscate(s));
    }

    public I()
    {
        this$0 = ObfuscatedPreferences.this;
        super();
        wrappedEditor = ObfuscatedPreferences.access$000(ObfuscatedPreferences.this).edit();
    }
}
