// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import com.google.b.k;
import java.util.ArrayList;
import java.util.List;
import org.c.c.b.b.a;
import org.c.c.n;

public class MediaTypeHackForAkamai extends a
{

    public MediaTypeHackForAkamai()
    {
        this(new k());
    }

    public MediaTypeHackForAkamai(k k1)
    {
        super(k1);
        k1 = new ArrayList(getSupportedMediaTypes());
        k1.add(new n("text", "plain", DEFAULT_CHARSET));
        setSupportedMediaTypes(k1);
    }
}
