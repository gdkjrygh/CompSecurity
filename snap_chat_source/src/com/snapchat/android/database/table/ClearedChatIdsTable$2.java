// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import android.content.Context;

// Referenced classes of package com.snapchat.android.database.table:
//            ClearedChatIdsTable

static final class b
    implements Runnable
{

    private Context a;
    private String b;

    public final void run()
    {
        ClearedChatIdsTable.b(a, b);
    }

    (Context context, String s)
    {
        a = context;
        b = s;
        super();
    }
}
