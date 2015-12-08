// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b.b;

import java.io.IOException;
import java.nio.charset.Charset;
import org.c.c.b.a;
import org.c.c.b.h;
import org.c.c.f;
import org.c.c.g;
import org.c.c.j;
import org.c.c.n;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.type.JavaType;

public final class c extends a
{

    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private ObjectMapper a;
    private boolean b;

    public c()
    {
        super(new n("application", "json", DEFAULT_CHARSET));
        a = new ObjectMapper();
        b = false;
    }

    private JavaType a(Class class1)
    {
        return a.getTypeFactory().constructType(class1);
    }

    public final boolean canRead(Class class1, n n1)
    {
        class1 = a(class1);
        return a.canDeserialize(class1) && canRead(n1);
    }

    public final boolean canWrite(Class class1, n n1)
    {
        return a.canSerialize(class1) && canWrite(n1);
    }

    public final ObjectMapper getObjectMapper()
    {
        return a;
    }

    protected final Object readInternal(Class class1, g g1)
    {
        class1 = a(class1);
        try
        {
            class1 = ((Class) (a.readValue(g1.getBody(), class1)));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new org.c.c.b.g((new StringBuilder("Could not read JSON: ")).append(class1.getMessage()).toString(), class1);
        }
        return class1;
    }

    public final void setObjectMapper(ObjectMapper objectmapper)
    {
        org.c.d.a.notNull(objectmapper, "ObjectMapper must not be null");
        a = objectmapper;
    }

    public final void setPrefixJson(boolean flag)
    {
        b = flag;
    }

    protected final boolean supports(Class class1)
    {
        throw new UnsupportedOperationException();
    }

    protected final void writeInternal(Object obj, j j1)
    {
        Charset charset;
        JsonEncoding ajsonencoding[];
        int i;
        int k;
        n n1 = j1.getHeaders().getContentType();
        if (n1 == null || n1.getCharSet() == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        charset = n1.getCharSet();
        ajsonencoding = JsonEncoding.values();
        k = ajsonencoding.length;
        i = 0;
_L3:
        JsonEncoding jsonencoding;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        jsonencoding = ajsonencoding[i];
        if (!charset.name().equals(jsonencoding.getJavaName())) goto _L2; else goto _L1
_L1:
        j1 = a.getJsonFactory().createJsonGenerator(j1.getBody(), jsonencoding);
        try
        {
            if (b)
            {
                j1.writeRaw("{} && ");
            }
            a.writeValue(j1, obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new h((new StringBuilder("Could not write JSON: ")).append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
_L2:
        i++;
          goto _L3
        jsonencoding = JsonEncoding.UTF8;
          goto _L1
    }

}
