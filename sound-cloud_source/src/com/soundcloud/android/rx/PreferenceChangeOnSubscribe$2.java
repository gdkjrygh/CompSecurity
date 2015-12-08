// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.rx;

import android.content.SharedPreferences;
import rx.b.a;

// Referenced classes of package com.soundcloud.android.rx:
//            PreferenceChangeOnSubscribe

class this._cls0
    implements a
{

    final PreferenceChangeOnSubscribe this$0;

    public void call()
    {
        PreferenceChangeOnSubscribe.access$200(PreferenceChangeOnSubscribe.this).unregisterOnSharedPreferenceChangeListener(PreferenceChangeOnSubscribe.access$100(PreferenceChangeOnSubscribe.this));
    }

    ()
    {
        this$0 = PreferenceChangeOnSubscribe.this;
        super();
    }
}
