// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.spotify.mobile.android.cosmos.parser.JsonObjectParser;

// Referenced classes of package com.spotify.mobile.android.cosmos:
//            DelegableParsingCallbackReceiver

public abstract class JsonObjectCallbackReceiver extends DelegableParsingCallbackReceiver
{

    public JsonObjectCallbackReceiver(Handler handler)
    {
        super(handler, new JsonObjectParser());
    }
}
