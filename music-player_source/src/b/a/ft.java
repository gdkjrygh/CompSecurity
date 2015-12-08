// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package b.a:
//            fm, gw, fv, gx, 
//            fx, gn, gv, gu, 
//            gk, fn, fr, gs

public abstract class ft
    implements fm
{

    private static final Map a;
    protected Object b;
    protected fr c;

    protected ft()
    {
        c = null;
        b = null;
    }

    protected abstract fr a(short word0);

    protected abstract gk a(fr fr);

    protected abstract gs a();

    protected abstract Object a(gn gn1, gk gk1);

    protected abstract Object a(gn gn1, short word0);

    public final void a(gn gn1)
    {
        ((gv)a.get(gn1.s())).a().b(gn1, this);
    }

    public final fr b()
    {
        return c;
    }

    public final void b(gn gn1)
    {
        ((gv)a.get(gn1.s())).a().a(gn1, this);
    }

    public final Object c()
    {
        return b;
    }

    protected abstract void c(gn gn1);

    protected abstract void d(gn gn1);

    public final boolean d()
    {
        return c != null;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<");
        stringbuilder.append(getClass().getSimpleName());
        stringbuilder.append(" ");
        if (c != null)
        {
            Object obj = b;
            stringbuilder.append(a(c).a);
            stringbuilder.append(":");
            if (obj instanceof ByteBuffer)
            {
                fn.a((ByteBuffer)obj, stringbuilder);
            } else
            {
                stringbuilder.append(obj.toString());
            }
        }
        stringbuilder.append(">");
        return stringbuilder.toString();
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put(b/a/gw, new fv((byte)0));
        a.put(b/a/gx, new fx((byte)0));
    }
}
