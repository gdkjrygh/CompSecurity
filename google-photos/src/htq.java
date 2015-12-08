// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

public final class htq
    implements opl, opv
{

    List a;
    List b;
    String c;
    boolean d;
    private final Activity e;

    htq()
    {
        a = Collections.emptyList();
        b = Collections.emptyList();
        d = false;
        e = null;
    }

    public htq(Activity activity, opd opd1)
    {
        a = Collections.emptyList();
        b = Collections.emptyList();
        d = false;
        e = activity;
        opd1.a(this);
    }

    public final void a(Bundle bundle)
    {
        a(((List) (e.getIntent().getParcelableArrayListExtra("com.google.android.apps.photos.search.core.suggestions.preloadedlabels"))));
    }

    public final void a(List list)
    {
        if (list != null)
        {
            a = list;
        }
    }
}
