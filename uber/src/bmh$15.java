// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

final class it>
    implements bkr
{

    public final bkq create(bjw bjw1, bmj bmj1)
    {
        if (bmj1.getRawType() != java/sql/Timestamp)
        {
            return null;
        } else
        {
            return new bkq(bjw1.a(java/util/Date)) {

                final bkq a;
                final bmh._cls15 b;

                private void a(JsonWriter jsonwriter, Timestamp timestamp)
                {
                    a.a(jsonwriter, timestamp);
                }

                private Timestamp b(JsonReader jsonreader)
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

                public final Object a(JsonReader jsonreader)
                {
                    return b(jsonreader);
                }

                public final volatile void a(JsonWriter jsonwriter, Object obj)
                {
                    a(jsonwriter, (Timestamp)obj);
                }

            
            {
                b = bmh._cls15.this;
                a = bkq1;
                super();
            }
            };
        }
    }

    it>()
    {
    }
}
