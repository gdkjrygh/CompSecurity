// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

final class jcv
    implements Runnable
{

    private mqp a;
    private jcu b;

    jcv(jcu jcu1, mqp mqp1)
    {
        b = jcu1;
        a = mqp1;
        super();
    }

    public final void run()
    {
        Object obj;
        Object obj1;
label0:
        {
label1:
            {
                obj = b.a;
                obj1 = a;
                if (((jcr) (obj)).j.a())
                {
                    noy.a("groupStatus", obj1);
                    noy.a("this", obj);
                }
                if (((jcr) (obj)).h && ((mqp) (obj1)).a.c == ((jcr) (obj)).i)
                {
                    switch (jcw.a[((mqp) (obj1)).b.ordinal()])
                    {
                    default:
                        obj = String.valueOf(((mqp) (obj1)).b);
                        throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 25)).append("Unexpected upload state: ").append(((String) (obj))).toString());

                    case 2: // '\002'
                    case 3: // '\003'
                        break label1;

                    case 4: // '\004'
                        break label0;

                    case 5: // '\005'
                    case 6: // '\006'
                        break;

                    case 1: // '\001'
                        if (((jcr) (obj)).i != -1L)
                        {
                            long l = ((jcr) (obj)).i;
                            ((jcr) (obj)).d();
                            obj.i = -1L;
                            if (((jcr) (obj)).j.a())
                            {
                                noy.a("this", obj);
                            }
                            obj1 = new mqy(((jcr) (obj)).c, ((jcr) (obj)).a(l));
                            ((jcr) (obj)).d.a(((mtf) (obj1)));
                        }
                        break;
                    }
                }
                return;
            }
            ((jcr) (obj)).c();
            ((jcr) (obj)).a.a();
            return;
        }
        int i = ((jcr) (obj)).g.size();
        int j = ((mqp) (obj1)).c;
        ((jcr) (obj)).a.a(i - j, i);
    }
}
