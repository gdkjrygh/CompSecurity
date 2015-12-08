// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android;

import com.moodstocks.android.advanced.Synchronizer;

// Referenced classes of package com.moodstocks.android:
//            Scanner

class this._cls0
    implements Runnable
{

    final Scanner this$0;

    public void run()
    {
        Scanner.access$000(Scanner.this).synchronize();
        Scanner.access$002(Scanner.this, null);
    }

    ynchronizer()
    {
        this$0 = Scanner.this;
        super();
    }
}
