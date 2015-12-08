// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

public final class nan extends mtf
{

    private final int a;

    public nan(int i)
    {
        super("com.google.android.apps.photos.httpauth.LoadAuthHeadersTask");
        a = i;
    }

    protected final mue a(Context context)
    {
        context = ((nal)olm.a(context, nal)).a(a);
        mue mue1 = new mue(true);
        mue1.a().putSerializable("extra_headers", new HashMap(context));
        return mue1;
    }
}
