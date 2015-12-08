// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import afM;
import android.app.Activity;
import android.os.Bundle;
import net.hockeyapp.android.views.ExpiryInfoView;

public class ExpiryInfoActivity extends Activity
{

    public ExpiryInfoActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(afM.b(768));
        setContentView(new ExpiryInfoView(this, afM.b(769)));
    }
}
