// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.rx;

import android.content.SharedPreferences;
import rx.X;

// Referenced classes of package com.soundcloud.android.rx:
//            PreferenceChangeOnSubscribe

class this._cls0
    implements android.content.erenceChangeListener
{

    final PreferenceChangeOnSubscribe this$0;

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        PreferenceChangeOnSubscribe.access$000(PreferenceChangeOnSubscribe.this).onNext(s);
    }

    geListener()
    {
        this$0 = PreferenceChangeOnSubscribe.this;
        super();
    }
}
