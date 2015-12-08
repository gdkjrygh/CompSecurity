// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import androidx.media.filterpacks.base.VariableSource;

final class ail
    implements ain
{

    private String a;
    private Object b;

    public ail(String s, Object obj)
    {
        a = s;
        b = obj;
    }

    public final void a(aio aio1)
    {
        aio1 = aio1.b;
        Object obj1 = a;
        Object obj = b;
        if (aio1.a(((String) (obj1))) != null)
        {
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj1).length() + 31)).append("Filter named '").append(((String) (obj1))).append("' exists already!").toString());
        }
        obj1 = new VariableSource(((ahr) (aio1)).a, ((String) (obj1)));
        aio1.a(((ahn) (obj1)));
        if (obj != null)
        {
            ((VariableSource) (obj1)).a(obj);
        }
    }
}
