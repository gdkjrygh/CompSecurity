// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b.b;

import com.google.b.aa;
import com.google.b.af;
import com.google.b.k;
import com.google.b.r;
import com.google.b.x;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import org.c.c.b.h;
import org.c.c.f;
import org.c.c.g;
import org.c.c.j;
import org.c.c.n;

public class a extends org.c.c.b.a
{

    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private k gson;
    private boolean prefixJson;
    private Type type;

    public a()
    {
        this(new k());
    }

    public a(k k1)
    {
        super(new n("application", "json", DEFAULT_CHARSET));
        type = null;
        prefixJson = false;
        setGson(k1);
    }

    public a(boolean flag)
    {
        k k1;
        if (flag)
        {
            k1 = (new r()).b().f();
        } else
        {
            k1 = new k();
        }
        this(k1);
    }

    private Charset getCharset(f f1)
    {
        if (f1 != null && f1.getContentType() != null && f1.getContentType().getCharSet() != null)
        {
            return f1.getContentType().getCharSet();
        } else
        {
            return DEFAULT_CHARSET;
        }
    }

    public boolean canRead(Class class1, n n1)
    {
        return canRead(n1);
    }

    public boolean canWrite(Class class1, n n1)
    {
        return canWrite(n1);
    }

    public Type getType()
    {
        return type;
    }

    protected Object readInternal(Class class1, g g1)
    {
        g1 = new InputStreamReader(g1.getBody(), getCharset(g1.getHeaders()));
        Type type1;
        try
        {
            type1 = getType();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new org.c.c.b.g((new StringBuilder("Could not read JSON: ")).append(class1.getMessage()).toString(), class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new org.c.c.b.g((new StringBuilder("Could not read JSON: ")).append(class1.getMessage()).toString(), class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new org.c.c.b.g((new StringBuilder("Could not read JSON: ")).append(class1.getMessage()).toString(), class1);
        }
        if (type1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        return gson.a(g1, type1);
        class1 = ((Class) (gson.a(g1, class1)));
        return class1;
    }

    public void setGson(k k1)
    {
        org.c.d.a.notNull(k1, "'gson' must not be null");
        gson = k1;
    }

    public void setPrefixJson(boolean flag)
    {
        prefixJson = flag;
    }

    public void setType(Type type1)
    {
        type = type1;
    }

    protected boolean supports(Class class1)
    {
        throw new UnsupportedOperationException();
    }

    protected void writeInternal(Object obj, j j1)
    {
        j1 = new OutputStreamWriter(j1.getBody(), getCharset(j1.getHeaders()));
        Type type1;
        try
        {
            if (prefixJson)
            {
                j1.append("{} && ");
            }
            type1 = getType();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new h((new StringBuilder("Could not write JSON: ")).append(((x) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        if (type1 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        gson.a(obj, type1, j1);
_L2:
        j1.close();
        return;
        gson.a(obj, j1);
        if (true) goto _L2; else goto _L1
_L1:
    }

}
