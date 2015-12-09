// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.Window;

public class rx extends rf
{

    private boolean d;

    public rx()
    {
    }

    public final void a(Toolbar toolbar)
    {
        if (gcl.b)
        {
            CharSequence charsequence = toolbar.d();
            if (charsequence != null)
            {
                toolbar.a(charsequence.toString());
            }
            super.a(toolbar);
            if (charsequence != null)
            {
                toolbar.a(charsequence);
            }
            return;
        } else
        {
            super.a(toolbar);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        d = false;
        super.onCreate(bundle);
        if (gcl.b)
        {
            getWindow().setCallback(new ry(getWindow().getCallback()));
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (d)
        {
            return false;
        } else
        {
            return super.onCreatePanelMenu(i, menu);
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        d = true;
    }
}
