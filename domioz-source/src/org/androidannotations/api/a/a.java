// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package org.androidannotations.api.a:
//            e, b

public abstract class a extends e
    implements b
{

    protected Bundle lastOptions;

    public a(Context context, Intent intent)
    {
        super(context, intent);
    }

    public a(Context context, Class class1)
    {
        super(context, class1);
    }

    public final void start()
    {
        startForResult(-1);
    }

    public abstract void startForResult(int i);

    public b withOptions(Bundle bundle)
    {
        lastOptions = bundle;
        return this;
    }
}
