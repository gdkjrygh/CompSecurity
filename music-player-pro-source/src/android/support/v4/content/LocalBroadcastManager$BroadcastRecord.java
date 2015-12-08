// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Intent;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.content:
//            LocalBroadcastManager

private static class receivers
{

    final Intent intent;
    final ArrayList receivers;

    (Intent intent1, ArrayList arraylist)
    {
        intent = intent1;
        receivers = arraylist;
    }
}
