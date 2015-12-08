// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import android.os.Bundle;
import com.cardinalblue.android.piccollage.controller.b.c;
import com.cardinalblue.android.piccollage.model.j;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            KddiActivity

public class KddiShareActivity extends KddiActivity
{

    public KddiShareActivity()
    {
    }

    public void a()
    {
        Object obj = j.a(this);
        if (((j) (obj)).c())
        {
            Bundle bundle = new Bundle();
            bundle.putString("target", "kddi");
            bundle.putString("target_token", ((j) (obj)).a().d());
            bundle.putString("caption", "PIC_COLLAGE");
            obj = new Intent();
            ((Intent) (obj)).putExtras(bundle);
            setResult(-1, ((Intent) (obj)));
        }
        finish();
    }

    protected void onActivityResult(int i, int k, Intent intent)
    {
        super.onActivityResult(i, k, intent);
        if (i == 100)
        {
            setResult(0);
            if (k == -1)
            {
                setResult(-1);
            }
            finish();
        }
    }
}
