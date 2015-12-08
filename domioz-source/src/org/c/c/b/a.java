// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.c.c.f;
import org.c.c.g;
import org.c.c.j;
import org.c.c.n;

// Referenced classes of package org.c.c.b:
//            f

public abstract class a
    implements org.c.c.b.f
{

    private List supportedMediaTypes;

    protected a()
    {
        supportedMediaTypes = Collections.emptyList();
    }

    protected a(n n1)
    {
        supportedMediaTypes = Collections.emptyList();
        setSupportedMediaTypes(Collections.singletonList(n1));
    }

    protected transient a(n an[])
    {
        supportedMediaTypes = Collections.emptyList();
        setSupportedMediaTypes(Arrays.asList(an));
    }

    public boolean canRead(Class class1, n n1)
    {
        return supports(class1) && canRead(n1);
    }

    protected boolean canRead(n n1)
    {
        if (n1 == null)
        {
            return true;
        }
        for (Iterator iterator = getSupportedMediaTypes().iterator(); iterator.hasNext();)
        {
            if (((n)iterator.next()).includes(n1))
            {
                return true;
            }
        }

        return false;
    }

    public boolean canWrite(Class class1, n n1)
    {
        return supports(class1) && canWrite(n1);
    }

    protected boolean canWrite(n n1)
    {
        if (n1 == null || n.ALL.equals(n1))
        {
            return true;
        }
        for (Iterator iterator = getSupportedMediaTypes().iterator(); iterator.hasNext();)
        {
            if (((n)iterator.next()).isCompatibleWith(n1))
            {
                return true;
            }
        }

        return false;
    }

    protected Long getContentLength(Object obj, n n1)
    {
        return null;
    }

    protected n getDefaultContentType(Object obj)
    {
        obj = getSupportedMediaTypes();
        if (!((List) (obj)).isEmpty())
        {
            return (n)((List) (obj)).get(0);
        } else
        {
            return null;
        }
    }

    public List getSupportedMediaTypes()
    {
        return Collections.unmodifiableList(supportedMediaTypes);
    }

    public final Object read(Class class1, g g)
    {
        return readInternal(class1, g);
    }

    protected abstract Object readInternal(Class class1, g g);

    public void setSupportedMediaTypes(List list)
    {
        org.c.d.a.notEmpty(list, "'supportedMediaTypes' must not be empty");
        supportedMediaTypes = new ArrayList(list);
    }

    protected abstract boolean supports(Class class1);

    public final void write(Object obj, n n1, j j1)
    {
        f f1;
label0:
        {
            n n2;
label1:
            {
                f1 = j1.getHeaders();
                if (f1.getContentType() != null)
                {
                    break label0;
                }
                if (n1 != null && !n1.isWildcardType())
                {
                    n2 = n1;
                    if (!n1.isWildcardSubtype())
                    {
                        break label1;
                    }
                }
                n2 = getDefaultContentType(obj);
            }
            if (n2 != null)
            {
                f1.setContentType(n2);
            }
        }
        if (f1.getContentLength() == -1L)
        {
            n1 = getContentLength(obj, f1.getContentType());
            if (n1 != null)
            {
                f1.setContentLength(n1.longValue());
            }
        }
        writeInternal(obj, j1);
        j1.getBody().flush();
    }

    protected abstract void writeInternal(Object obj, j j1);
}
