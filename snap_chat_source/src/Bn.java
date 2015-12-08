// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

public final class Bn
{

    private static final Bn sInstance = new Bn();
    final Gson mGson;

    public Bn()
    {
        this(It.a());
    }

    private Bn(Gson gson)
    {
        mGson = gson;
    }

    public static Bn a()
    {
        return sInstance;
    }

    public final List a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            java.lang.reflect.Type type = (new TypeToken() {

                final Bn this$0;

            
            {
                this$0 = Bn.this;
                super();
            }
            }).getType();
            return (List)mGson.fromJson(s, type);
        }
    }

}
