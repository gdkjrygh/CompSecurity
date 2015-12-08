// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.co;


// Referenced classes of package p.co:
//            b, a

static final class .Object
    implements .Object
{

    final .String a;

    public int a(String s)
    {
        switch (a[a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Type ").append(a).append(" does not match any of the current Validators").toString());

        case 1: // '\001'
            return p.co.a.a(s);

        case 2: // '\002'
            return p.co.a.b(s);

        case 3: // '\003'
            return p.co.a.c(s);

        case 4: // '\004'
            return p.co.a.d(s);

        case 5: // '\005'
            return p.co.a.f(s);

        case 6: // '\006'
            return p.co.a.e(s);
        }
    }

    .String(.String s)
    {
        a = s;
        super();
    }
}
