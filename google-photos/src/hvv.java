// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

final class hvv extends mtf
{

    private final int a;

    public hvv(int i)
    {
        super("preloadlabels");
        a = i;
    }

    protected final mue a(Context context)
    {
        context = ((hsx)olm.a(context, hsx)).a(a, "", 30, 4);
        mue mue1 = new mue(true);
        mue1.a().putParcelableArrayList("com.google.android.apps.photos.search.core.suggestions.preloadedlabels", new ArrayList(context));
        return mue1;
    }
}
