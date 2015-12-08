// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.photos.pager.HostPhotoPagerActivity;

public final class gnd
    implements ojz
{

    private HostPhotoPagerActivity a;

    public gnd(HostPhotoPagerActivity hostphotopageractivity)
    {
        a = hostphotopageractivity;
        super();
    }

    public final boolean a()
    {
        Intent intent = (Intent)a.getIntent().getParcelableExtra("custom_up_intent");
        if (intent != null)
        {
            a.startActivity(intent);
            a.finish();
            return true;
        }
        if (a.getIntent().getBooleanExtra("up_as_back", false))
        {
            a.onBackPressed();
            return true;
        } else
        {
            return false;
        }
    }
}
