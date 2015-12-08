// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import android.content.Context;
import com.fitbit.savedstate.ServerSavedState;
import com.fitbit.util.bh;
import com.fitbit.util.bv;
import com.fitbit.util.c.c;

// Referenced classes of package com.fitbit.serverinteraction:
//            o

public class p
{

    public static final String a = "https://android-api.fitbit.com";
    public static final String b = "https://android-client.fitbit.com";
    private static final byte d[][];
    private static final byte e[][];
    private static final c f;
    protected o c;

    public p(Context context)
    {
        context = bv.a(f.d(), d[0], new com.fitbit.util.d.a() {

            final p a;

            public byte a(byte byte0, byte byte1)
            {
                return p.b().a(byte0, byte1);
            }

            
            {
                a = p.this;
                super();
            }
        });
        String s = bv.a(f.d(), e[0], new com.fitbit.util.d.a() {

            final p a;

            public byte a(byte byte0, byte byte1)
            {
                return p.b().a(byte0, byte1);
            }

            
            {
                a = p.this;
                super();
            }
        });
        c = new o(ServerSavedState.h(), ServerSavedState.i(), context, s);
    }

    static c b()
    {
        return f;
    }

    public o a()
    {
        return c;
    }

    static 
    {
        d = new byte[1][];
        e = new byte[1][];
        f = new c();
        d[0] = bh.a(f.d(), bv.a("You must have a network connection to access Food Plan.", f.b(), new com.fitbit.util.d.a() {

            public byte a(byte byte0, byte byte1)
            {
                return p.b().a(byte0, byte1);
            }

        }), new com.fitbit.util.d.a() {

            public byte a(byte byte0, byte byte1)
            {
                return p.b().a(byte0, byte1);
            }

        });
        e[0] = bh.a(f.d(), bv.a("No network connection. Please check your settings.", f.c(), new com.fitbit.util.d.a() {

            public byte a(byte byte0, byte byte1)
            {
                return p.b().a(byte0, byte1);
            }

        }), new com.fitbit.util.d.a() {

            public byte a(byte byte0, byte byte1)
            {
                return p.b().a(byte0, byte1);
            }

        });
    }
}
