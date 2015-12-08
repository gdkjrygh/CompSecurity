// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.SharedPreferences;
import com.soundcloud.android.crypto.Obfuscator;

// Referenced classes of package com.soundcloud.android.utils:
//            ObfuscatedPreferences

public class wrappedListener
    implements android.content.angeListener
{

    final ObfuscatedPreferences this$0;
    private final android.content.angeListener.this._cls0 wrappedListener;

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        wrappedListener.enceChanged(ObfuscatedPreferences.this, ObfuscatedPreferences.access$100(ObfuscatedPreferences.this).deobfuscateString(s));
    }

    public (android.content.angeListener angelistener)
    {
        this$0 = ObfuscatedPreferences.this;
        super();
        wrappedListener = angelistener;
    }
}
