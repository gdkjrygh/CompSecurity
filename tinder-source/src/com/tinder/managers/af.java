// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.a.f;
import org.json.JSONObject;

public final class af
{

    public f a;

    public af(f f)
    {
        a = f;
    }

    // Unreferenced inner class com/tinder/managers/af$1

/* anonymous class */
    public final class _cls1
        implements com.android.volley.i.b
    {

        final af a;

        public final void a(Object obj)
        {
            obj = (JSONObject)obj;
            (new StringBuilder("Feedback success ")).append(((JSONObject) (obj)).toString());
        }

            public 
            {
                a = af.this;
                super();
            }
    }

}
