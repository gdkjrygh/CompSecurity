// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.a.b;
import android.util.TypedValue;
import android.view.KeyEvent;

// Referenced classes of package android.support.v7.app:
//            ac, b

public final class k extends ac
    implements DialogInterface
{

    private android.support.v7.app.b a;

    k(Context context, int i)
    {
        super(context, a(context, i));
        a = new android.support.v7.app.b(getContext(), this, getWindow());
    }

    static int a(Context context, int i)
    {
        if (i >= 0x1000000)
        {
            return i;
        } else
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(b.o, typedvalue, true);
            return typedvalue.resourceId;
        }
    }

    static android.support.v7.app.b a(k k1)
    {
        return k1.a;
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a.a();
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (a.a(keyevent))
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public final boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (a.b(keyevent))
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public final void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        a.a(charsequence);
    }
}
