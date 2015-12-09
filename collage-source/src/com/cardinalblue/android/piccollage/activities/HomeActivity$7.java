// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.cardinalblue.android.b.e;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.a.a;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            HomeActivity

class a
    implements Callable
{

    final HomeActivity a;

    public Collage a()
        throws Exception
    {
        if (ContextCompat.checkSelfPermission(a, "android.permission.WRITE_EXTERNAL_STORAGE") == -1)
        {
            throw new IllegalStateException("user denied the storage permission");
        }
        long l = com.cardinalblue.android.piccollage.model.a.a.a(a).b();
        if (l >= 1L)
        {
            throw new IllegalStateException((new StringBuilder()).append("it's already include the sample collage, collage num : ").append(l).toString());
        }
        String s;
        Object obj;
        String s1;
        if (e.b())
        {
            s1 = "amazon/assets/builtin/builtin.json";
            s = "amazon/assets/builtin/builtin.jpg";
            obj = com.cardinalblue.android.piccollage.model.gson.sionEnum.A3;
        } else
        {
            s1 = "builtin/sample_collage.json";
            s = "builtin/sample_collage.jpg";
            obj = com.cardinalblue.android.piccollage.model.gson.sionEnum.V5;
        }
        obj = Collage.a(new String(com.androidquery.util.a.a(a.getAssets().open(s1))), ((com.cardinalblue.android.piccollage.model.gson.sionEnum) (obj)));
        if (TextUtils.isEmpty(((Collage) (obj)).r()))
        {
            ((Collage) (obj)).b("hello world! piccollage");
        }
        ((Collage) (obj)).a(BitmapFactory.decodeStream(a.getAssets().open(s)));
        ((Collage) (obj)).c(a);
        return ((Collage) (obj));
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    sionEnum(HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }
}
