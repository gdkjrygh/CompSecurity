// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class hom
{

    public boolean a;
    private final Intent b;
    private final ekq c;
    private final int d;

    public hom(Context context, ekq ekq1, int i)
    {
        b = new Intent(context, ((hon)olm.a(context, hon)).a());
        c = ekq1;
        d = i;
    }

    public final Intent a()
    {
        c.a(hpe);
        b.putExtra("com.google.android.apps.photos.core.media_collection", c);
        b.putExtra("account_id", d);
        b.putExtra("focus_edit_title", a);
        return b;
    }
}
