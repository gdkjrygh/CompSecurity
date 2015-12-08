// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            GraphResponse

final class val.callback
    implements llback
{

    final aphJSONObjectCallback val$callback;

    public final void onCompleted(GraphResponse graphresponse)
    {
        if (val$callback != null)
        {
            val$callback.onCompleted(graphresponse.getJSONObject(), graphresponse);
        }
    }

    aphJSONObjectCallback()
    {
        val$callback = aphjsonobjectcallback;
        super();
    }
}
