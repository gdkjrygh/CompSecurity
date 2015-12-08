// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.Display;

public final class lyr extends jus
    implements lyj
{

    private lyk a;

    public lyr(lyk lyk1, Context context, Display display, int i)
    {
        super(context, display, i);
        a = lyk1;
    }

    public final void a(lyj lyj1)
    {
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a.a(this);
    }

    public final void onStart()
    {
        super.onStart();
        a.onStart();
    }

    public final void onStop()
    {
        super.onStop();
        a.onStop();
    }
}
