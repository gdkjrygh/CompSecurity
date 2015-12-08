// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.CollageController;
import com.cardinalblue.android.piccollage.model.gson.FrameModel;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements Callable
{

    final Intent a;
    final PhotoProtoActivity b;

    public Void a()
        throws Exception
    {
        com.cardinalblue.android.piccollage.view.k k1 = PhotoProtoActivity.a(b, a);
        if (PhotoProtoActivity.o(b) != null)
        {
            try
            {
                k1.a((FrameModel)k.b(PhotoProtoActivity.o(b).getJSONObject("frame").toString(), com/cardinalblue/android/piccollage/model/gson/FrameModel));
                k1.h(PhotoProtoActivity.o(b).getInt("z_index"));
            }
            catch (JSONException jsonexception)
            {
                f.a(jsonexception);
                PhotoProtoActivity.e(b).i(k1);
            }
        } else
        {
            PhotoProtoActivity.e(b).i(k1);
        }
        PhotoProtoActivity.a(b, k1);
        return null;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (PhotoProtoActivity photoprotoactivity, Intent intent)
    {
        b = photoprotoactivity;
        a = intent;
        super();
    }
}
