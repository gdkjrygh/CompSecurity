// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.f;

// Referenced classes of package android.support.v7.app:
//            n

public class o extends f
{

    private final String a = "selector";
    private android.support.v7.media.f b;

    public o()
    {
        setCancelable(true);
    }

    private void b()
    {
        if (b == null)
        {
            Bundle bundle = getArguments();
            if (bundle != null)
            {
                b = android.support.v7.media.f.a(bundle.getBundle("selector"));
            }
            if (b == null)
            {
                b = android.support.v7.media.f.a;
            }
        }
    }

    public n a(Context context, Bundle bundle)
    {
        return new n(context);
    }

    public android.support.v7.media.f a()
    {
        b();
        return b;
    }

    public void a(android.support.v7.media.f f1)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        b();
        if (!b.equals(f1))
        {
            b = f1;
            Bundle bundle = getArguments();
            Object obj = bundle;
            if (bundle == null)
            {
                obj = new Bundle();
            }
            ((Bundle) (obj)).putBundle("selector", f1.d());
            setArguments(((Bundle) (obj)));
            obj = (n)getDialog();
            if (obj != null)
            {
                ((n) (obj)).a(f1);
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = a(getActivity(), bundle);
        bundle.a(a());
        return bundle;
    }
}
