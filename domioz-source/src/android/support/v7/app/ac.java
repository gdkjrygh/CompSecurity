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
//            m, n

public class ac extends Dialog
    implements m
{

    private n a;

    public ac(Context context, int i)
    {
        int j = i;
        if (i == 0)
        {
            TypedValue typedvalue = new TypedValue();
            context.getTheme().resolveAttribute(b.x, typedvalue, true);
            j = typedvalue.resourceId;
        }
        super(context, j);
        a().a(null);
    }

    public final n a()
    {
        if (a == null)
        {
            a = n.a(this, this);
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
        a().j();
        super.onCreate(bundle);
        a().a(bundle);
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
