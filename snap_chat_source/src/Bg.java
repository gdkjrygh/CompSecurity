// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public final class Bg
{

    public static final String EMPTY_STYLE = "{}";
    private static final Bg sInstance = new Bg();
    public final Gson mGson;

    public Bg()
    {
        this(It.a());
    }

    private Bg(Gson gson)
    {
        mGson = gson;
    }

    public static Bg a()
    {
        return sInstance;
    }


    // Unreferenced inner class Bg$1

/* anonymous class */
    final class _cls1 extends TypeToken
    {

        final Bg this$0;

            
            {
                this$0 = Bg.this;
                super();
            }
    }


    // Unreferenced inner class Bg$2

/* anonymous class */
    public final class _cls2 extends TypeToken
    {

        final Bg this$0;

            public 
            {
                this$0 = Bg.this;
                super();
            }
    }

}
