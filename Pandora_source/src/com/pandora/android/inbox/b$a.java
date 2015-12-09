// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.net.Uri;
import com.tjeannin.provigen.ProviGenBaseContract;

// Referenced classes of package com.pandora.android.inbox:
//            b

public static interface BaseContract
    extends ProviGenBaseContract
{

    public static final Uri a = Uri.parse("content://com.pandora.android.provider/inbox_seen_messages");

}
