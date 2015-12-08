// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.b.a;
import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.google.gson.internal.a:
//            m

final class a extends r
{

    final r a;
    final a b;

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        jsonreader = (Date)a.a(jsonreader);
        if (jsonreader != null)
        {
            return new Timestamp(jsonreader.getTime());
        } else
        {
            return null;
        }
    }

    public final volatile void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        obj = (Timestamp)obj;
        a.a(jsonwriter, obj);
    }

    ( , r r1)
    {
        b = ;
        a = r1;
        super();
    }

    // Unreferenced inner class com/google/gson/internal/a/m$15

/* anonymous class */
    static final class m._cls15
        implements s
    {

        public final r a(e e1, a a1)
        {
            if (a1.a != java/sql/Timestamp)
            {
                return null;
            } else
            {
                return new m._cls15._cls1(this, e1.a(java/util/Date));
            }
        }

    }

}
