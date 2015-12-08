// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aim
    implements ain
{

    private String a;
    private String b;

    public aim(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final void a(aio aio1)
    {
        Object obj;
        String s;
        ajr ajr;
        Object obj1;
        obj1 = aio1.c;
        obj = a;
        s = b;
        ajr = aio1.d;
        if (ahp.b)
        {
            String s1 = String.valueOf(obj);
            if (s1.length() == 0)
            {
                break MISSING_BLOCK_LABEL_154;
            }
            "Looking up class ".concat(s1);
        }
_L1:
        obj1 = ((ahp) (obj1)).b(((String) (obj)));
        if (obj1 == null)
        {
            try
            {
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 24)).append("Unknown filter class '").append(((String) (obj))).append("'!").toString());
            }
            // Misplaced declaration of an exception variable
            catch (aio aio1)
            {
                obj = b;
            }
            throw new RuntimeException((new StringBuilder(String.valueOf(obj).length() + 23)).append("Error creating filter ").append(((String) (obj))).append("!").toString(), aio1);
        }
        break MISSING_BLOCK_LABEL_167;
        new String("Looking up class ");
          goto _L1
        obj = ahp.a(((Class) (obj1)), s, ajr);
        aio1.b.a(((ahn) (obj)));
        return;
    }
}
