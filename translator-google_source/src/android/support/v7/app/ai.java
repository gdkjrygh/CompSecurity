// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.a.b;
import android.util.TypedValue;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            o, p

public class ai extends Dialog
    implements o
{

    private p a;

    public ai(Context context, int i)
    {
        int j = i;
        if (i == 0)
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(b.dialogTheme, typedvalue, true);
            j = typedvalue.resourceId;
        }
        super(context, j);
        a().c();
    }

    public final p a()
    {
        if (a == null)
        {
            a = p.a(getContext(), getWindow(), this);
        }
        return a;
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a().b(view, layoutparams);
    }

    public void invalidateOptionsMenu()
    {
        a().g();
    }

    protected void onCreate(Bundle bundle)
    {
        a().i();
        super.onCreate(bundle);
        a().c();
    }

    protected void onStop()
    {
        super.onStop();
        a().e();
    }

    public void setContentView(int i)
    {
        a().a(i);
    }

    public void setContentView(View view)
    {
        a().a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a().a(view, layoutparams);
    }

    public void setTitle(int i)
    {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    public void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        a().a(charsequence);
    }
}
