// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.parser.JsonParser;

// Referenced classes of package com.spotify.mobile.android.cosmos:
//            DelegableParsingCallbackReceiver

public abstract class JsonCallbackReceiver extends DelegableParsingCallbackReceiver
{

    public JsonCallbackReceiver(Handler handler, Class class1)
    {
        this(handler, class1, null);
    }

    public JsonCallbackReceiver(Handler handler, Class class1, ObjectMapper objectmapper)
    {
        super(handler, new JsonParser(class1, objectmapper));
    }
}
