// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class agF
{

    private Object a;
    private Object b;
    private ahT c;
    private ahT d;
    private agC e;

    public agF(agC agc, Object obj, Object obj1, ahT aht, ahT aht1)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        e = agc;
        a = obj;
        b = obj1;
        c = aht;
        d = aht1;
    }

    public final String a(boolean flag)
    {
        Object obj5 = null;
        if (!(a instanceof agF)) goto _L2; else goto _L1
_L1:
        Object obj2 = ((agF)a).a(flag);
        Object obj1 = new Double(((String) (obj2)));
        obj2 = null;
_L5:
        if (!(b instanceof agF)) goto _L4; else goto _L3
_L3:
        Object obj = ((agF)b).a(flag);
        Object obj3 = new Double(((String) (obj)));
        obj = null;
        break MISSING_BLOCK_LABEL_77;
        obj;
        obj1 = null;
          goto _L5
_L2:
        if (!(a instanceof agD)) goto _L7; else goto _L6
_L6:
label0:
        {
            obj2 = (agD)a;
            obj = ((agD) (obj2)).a;
            obj = e.b(((String) (obj)));
            if (e.a(((String) (obj))))
            {
                break label0;
            }
            try
            {
                obj1 = new Double(((String) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new agA("Expression is invalid.", ((Exception) (obj)));
            }
            if (((agD) (obj2)).b == null)
            {
                break MISSING_BLOCK_LABEL_1190;
            }
            obj1 = new Double(((agD) (obj2)).b.a(((Double) (obj1)).doubleValue()));
            obj2 = null;
        }
          goto _L5
        if (((agD) (obj2)).b != null)
        {
            throw new agA("Invalid operand for unary operator.");
        }
        obj1 = null;
_L19:
        obj2 = obj;
          goto _L5
_L7:
        if (!(a instanceof agH))
        {
            break MISSING_BLOCK_LABEL_585;
        }
        obj2 = (agH)a;
        obj3 = ((agH) (obj2)).a;
        obj = ((agH) (obj2)).b;
        obj1 = e.b(((String) (obj)));
        obj = obj1;
        if (e.b)
        {
            obj = e.c(((String) (obj1)));
        }
        obj3 = ((agJ) (obj3)).a(e, ((String) (obj)));
        obj1 = ((agN) (obj3)).a;
        if (((agN) (obj3)).b != 0) goto _L9; else goto _L8
_L8:
        obj = new Double(((String) (obj1)));
        if (((agH) (obj2)).c != null)
        {
            obj = new Double(((agH) (obj2)).c.a(((Double) (obj)).doubleValue()));
        }
        obj = ((Double) (obj)).toString();
_L11:
        if (!e.a(((String) (obj))))
        {
            try
            {
                obj1 = new Double(((String) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new agA("Expression is invalid.", ((Exception) (obj)));
            }
            obj2 = null;
        } else
        {
            obj1 = null;
            obj2 = obj;
        }
          goto _L5
_L9:
        obj = obj1;
        if (((agN) (obj3)).b != 1) goto _L11; else goto _L10
_L10:
        obj = obj1;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (new StringBuilder()).append(e.a).append(((String) (obj1))).append(e.a).toString();
        if (((agH) (obj2)).c == null) goto _L11; else goto _L12
_L12:
        throw new agA("Invalid operand for unary operator.");
        obj;
        throw new agA(((agK) (obj)).getMessage(), ((Exception) (obj)));
        obj3;
        obj3 = obj5;
          goto _L13
_L4:
        if (!(b instanceof agD))
        {
            break MISSING_BLOCK_LABEL_746;
        }
label1:
        {
            Object obj4 = (agD)b;
            obj = ((agD)b).a;
            obj = e.b(((String) (obj)));
            if (e.a(((String) (obj))))
            {
                break label1;
            }
            try
            {
                obj3 = new Double(((String) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new agA("Expression is invalid.", ((Exception) (obj)));
            }
            Object obj6;
            if (((agD) (obj4)).b != null)
            {
                obj3 = new Double(((agD) (obj4)).b.a(((Double) (obj3)).doubleValue()));
                obj = null;
            } else
            {
                obj = null;
            }
        }
          goto _L13
        if (!(b instanceof agH)) goto _L15; else goto _L14
_L14:
        obj4 = (agH)b;
        obj6 = ((agH) (obj4)).a;
        obj = ((agH) (obj4)).b;
        obj3 = e.b(((String) (obj)));
        obj = obj3;
        if (e.b)
        {
            obj = e.c(((String) (obj3)));
        }
        obj6 = ((agJ) (obj6)).a(e, ((String) (obj)));
        obj3 = ((agN) (obj6)).a;
        if (((agN) (obj6)).b != 0) goto _L17; else goto _L16
_L16:
        obj = new Double(((String) (obj3)));
        if (((agH) (obj4)).c != null)
        {
            obj = new Double(((agH) (obj4)).c.a(((Double) (obj)).doubleValue()));
        }
        obj4 = ((Double) (obj)).toString();
_L18:
        obj = obj4;
        obj3 = obj5;
        if (!e.a(((String) (obj4))))
        {
            try
            {
                obj3 = new Double(((String) (obj4)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new agA("Expression is invalid.", ((Exception) (obj)));
            }
            obj = null;
        }
          goto _L13
_L17:
        obj = obj3;
        try
        {
            if (((agN) (obj6)).b != 1)
            {
                break MISSING_BLOCK_LABEL_1152;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new agA(((agK) (obj)).getMessage(), ((Exception) (obj)));
        }
        obj = obj3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_990;
        }
        obj = (new StringBuilder()).append(e.a).append(((String) (obj3))).append(e.a).toString();
        if (((agH) (obj4)).c != null)
        {
            throw new agA("Invalid operand for unary operator.");
        }
        break MISSING_BLOCK_LABEL_1152;
_L13:
        if (obj1 != null && obj3 != null)
        {
            double d2 = c.a(((Double) (obj1)).doubleValue(), ((Double) (obj3)).doubleValue());
            double d1 = d2;
            if (d != null)
            {
                d1 = d.a(d2);
            }
            return (new Double(d1)).toString();
        }
        if (obj2 != null && obj != null)
        {
            return c.a(((String) (obj2)), ((String) (obj)));
        }
        if (obj1 != null && obj3 == null)
        {
            if (d != null)
            {
                return (new Double(d.a(((Double) (obj1)).doubleValue()))).toString();
            } else
            {
                throw new agA("Expression is invalid.");
            }
        } else
        {
            throw new agA("Expression is invalid.");
        }
_L15:
        if (b != null)
        {
            throw new agA("Expression is invalid.");
        }
        obj = null;
        obj3 = obj5;
          goto _L13
        obj4 = obj;
          goto _L18
        if (((agD) (obj4)).b != null)
        {
            throw new agA("Invalid operand for unary operator.");
        }
        obj3 = obj5;
          goto _L13
        if (a != null)
        {
            throw new agA("Expression is invalid.");
        }
        obj1 = null;
        obj2 = null;
          goto _L5
        obj = null;
          goto _L19
    }
}
