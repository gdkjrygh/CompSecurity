// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.parser;

import com.spotify.cosmos.router.Response;
import cuf;
import dmz;
import dup;
import hew;
import hfa;
import hfw;

// Referenced classes of package com.spotify.mobile.android.cosmos.parser:
//            JsonParser

public class JacksonResponseParser
    implements hfa
{

    private JsonParser mParser;

    public JacksonResponseParser(Class class1)
    {
        mParser = JsonParser.forClass(class1);
    }

    public static JacksonResponseParser forClass(Class class1)
    {
        return new JacksonResponseParser(class1);
    }

    public hew call(hew hew1)
    {
        return hew1.a(((dup)dmz.a(dup)).b()).c(new hfw() {

            final JacksonResponseParser this$0;

            public Object call(Response response)
            {
                try
                {
                    response = ((Response) (mParser.parseResponse(response)));
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    throw cuf.a(response);
                }
                return response;
            }

            public volatile Object call(Object obj)
            {
                return call((Response)obj);
            }

            
            {
                this$0 = JacksonResponseParser.this;
                super();
            }
        });
    }

    public volatile Object call(Object obj)
    {
        return call((hew)obj);
    }

}
