// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import p.bd.g;
import p.bh.ab;
import p.bh.j;
import p.bh.n;
import p.bh.q;
import p.bh.u;
import p.bn.d;

// Referenced classes of package p.bg:
//            bv, t, h, bo, 
//            av, cd, g

public class ba extends g
{

    public ba()
    {
        super("RegisterAppInterface");
    }

    public ba(Hashtable hashtable)
    {
        super(hashtable);
    }

    public bv i()
    {
        Object obj = b.get("syncMsgVersion");
        if (obj instanceof bv)
        {
            return (bv)obj;
        }
        if (obj instanceof Hashtable)
        {
            return new bv((Hashtable)obj);
        } else
        {
            return null;
        }
    }

    public n j()
    {
        Object obj = b.get("language");
        if (obj instanceof n)
        {
            return (n)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = p.bh.n.a((String)obj);
            }
            catch (Exception exception)
            {
                d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("language").toString(), exception);
                return null;
            }
            return ((n) (obj));
        } else
        {
            return null;
        }
    }

    public n k()
    {
        Object obj = b.get("hmiDisplayLanguage");
        if (obj instanceof n)
        {
            return (n)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = p.bh.n.a((String)obj);
            }
            catch (Exception exception)
            {
                d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("hmiDisplayLanguage").toString(), exception);
                return null;
            }
            return ((n) (obj));
        } else
        {
            return null;
        }
    }

    public t l()
    {
        Object obj = b.get("displayCapabilities");
        if (obj instanceof t)
        {
            return (t)obj;
        }
        if (obj instanceof Hashtable)
        {
            return new t((Hashtable)obj);
        } else
        {
            return null;
        }
    }

    public Vector m()
    {
        if (b.get("buttonCapabilities") instanceof Vector)
        {
            Object obj = (Vector)b.get("buttonCapabilities");
            if (obj != null && ((Vector) (obj)).size() > 0)
            {
                Object obj1 = ((Vector) (obj)).get(0);
                if (obj1 instanceof h)
                {
                    return ((Vector) (obj));
                }
                if (obj1 instanceof Hashtable)
                {
                    Vector vector = new Vector();
                    for (obj = ((Vector) (obj)).iterator(); ((Iterator) (obj)).hasNext(); vector.add(new h((Hashtable)((Iterator) (obj)).next()))) { }
                    return vector;
                }
            }
        }
        return null;
    }

    public Vector n()
    {
        if (b.get("softButtonCapabilities") instanceof Vector)
        {
            Object obj = (Vector)b.get("softButtonCapabilities");
            if (obj != null && ((Vector) (obj)).size() > 0)
            {
                Object obj1 = ((Vector) (obj)).get(0);
                if (obj1 instanceof bo)
                {
                    return ((Vector) (obj));
                }
                if (obj1 instanceof Hashtable)
                {
                    Vector vector = new Vector();
                    for (obj = ((Vector) (obj)).iterator(); ((Iterator) (obj)).hasNext(); vector.add(new bo((Hashtable)((Iterator) (obj)).next()))) { }
                    return vector;
                }
            }
        }
        return null;
    }

    public av o()
    {
        Object obj = b.get("presetBankCapabilities");
        if (obj instanceof av)
        {
            return (av)obj;
        }
        if (obj instanceof Hashtable)
        {
            return new av((Hashtable)obj);
        } else
        {
            return null;
        }
    }

    public Vector p()
    {
        if (!(b.get("hmiZoneCapabilities") instanceof Vector)) goto _L2; else goto _L1
_L1:
        Vector vector = (Vector)b.get("hmiZoneCapabilities");
        if (vector == null || vector.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        obj1 = vector.get(0);
        if (obj1 instanceof j)
        {
            return vector;
        }
        if (!(obj1 instanceof String)) goto _L2; else goto _L4
_L4:
        Iterator iterator;
        obj1 = new Vector();
        iterator = vector.iterator();
_L6:
        if (iterator.hasNext())
        {
            Object obj = (String)iterator.next();
            try
            {
                obj = p.bh.j.a(((String) (obj)));
            }
            catch (Exception exception)
            {
                d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("hmiZoneCapabilities").toString(), exception);
                exception = null;
            }
            if (obj != null)
            {
                ((Vector) (obj1)).add(obj);
            }
        } else
        {
            return ((Vector) (obj1));
        }
        continue; /* Loop/switch isn't completed */
_L2:
        return null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Vector q()
    {
        if (!(b.get("speechCapabilities") instanceof Vector)) goto _L2; else goto _L1
_L1:
        Vector vector = (Vector)b.get("speechCapabilities");
        if (vector == null || vector.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        obj1 = vector.get(0);
        if (obj1 instanceof u)
        {
            return vector;
        }
        if (!(obj1 instanceof String)) goto _L2; else goto _L4
_L4:
        Iterator iterator;
        obj1 = new Vector();
        iterator = vector.iterator();
_L6:
        if (iterator.hasNext())
        {
            Object obj = (String)iterator.next();
            try
            {
                obj = p.bh.u.a(((String) (obj)));
            }
            catch (Exception exception)
            {
                d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("speechCapabilities").toString(), exception);
                exception = null;
            }
            if (obj != null)
            {
                ((Vector) (obj1)).add(obj);
            }
        } else
        {
            return ((Vector) (obj1));
        }
        continue; /* Loop/switch isn't completed */
_L2:
        return null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Vector r()
    {
        if (!(b.get("prerecordedSpeech") instanceof Vector)) goto _L2; else goto _L1
_L1:
        Vector vector = (Vector)b.get("prerecordedSpeech");
        if (vector == null || vector.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        obj1 = vector.get(0);
        if (obj1 instanceof q)
        {
            return vector;
        }
        if (!(obj1 instanceof String)) goto _L2; else goto _L4
_L4:
        Iterator iterator;
        obj1 = new Vector();
        iterator = vector.iterator();
_L6:
        if (iterator.hasNext())
        {
            Object obj = (String)iterator.next();
            try
            {
                obj = p.bh.q.a(((String) (obj)));
            }
            catch (Exception exception)
            {
                d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("prerecordedSpeech").toString(), exception);
                exception = null;
            }
            if (obj != null)
            {
                ((Vector) (obj1)).add(obj);
            }
        } else
        {
            return ((Vector) (obj1));
        }
        continue; /* Loop/switch isn't completed */
_L2:
        return null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Vector s()
    {
        if (!(b.get("vrCapabilities") instanceof Vector)) goto _L2; else goto _L1
_L1:
        Vector vector = (Vector)b.get("vrCapabilities");
        if (vector == null || vector.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        obj1 = vector.get(0);
        if (obj1 instanceof ab)
        {
            return vector;
        }
        if (!(obj1 instanceof String)) goto _L2; else goto _L4
_L4:
        Iterator iterator;
        obj1 = new Vector();
        iterator = vector.iterator();
_L6:
        if (iterator.hasNext())
        {
            Object obj = (String)iterator.next();
            try
            {
                obj = ab.a(((String) (obj)));
            }
            catch (Exception exception)
            {
                d.a((new StringBuilder()).append("Failed to parse ").append(getClass().getSimpleName()).append(".").append("vrCapabilities").toString(), exception);
                exception = null;
            }
            if (obj != null)
            {
                ((Vector) (obj1)).add(obj);
            }
        } else
        {
            return ((Vector) (obj1));
        }
        continue; /* Loop/switch isn't completed */
_L2:
        return null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public cd t()
    {
        Object obj = b.get("vehicleType");
        if (obj instanceof cd)
        {
            return (cd)obj;
        }
        if (obj instanceof Hashtable)
        {
            return new cd((Hashtable)obj);
        } else
        {
            return null;
        }
    }

    public Vector u()
    {
        if (b.get("audioPassThruCapabilities") instanceof Vector)
        {
            Object obj = (Vector)b.get("audioPassThruCapabilities");
            if (obj != null && ((Vector) (obj)).size() > 0)
            {
                Object obj1 = ((Vector) (obj)).get(0);
                if (obj1 instanceof p.bg.g)
                {
                    return ((Vector) (obj));
                }
                if (obj1 instanceof Hashtable)
                {
                    Vector vector = new Vector();
                    for (obj = ((Vector) (obj)).iterator(); ((Iterator) (obj)).hasNext(); vector.add(new p.bg.g((Hashtable)((Iterator) (obj)).next()))) { }
                    return vector;
                }
            }
        }
        return null;
    }

    public String v()
    {
        if ("2.3.2" != null)
        {
            return "2.3.2";
        } else
        {
            return null;
        }
    }

    public Vector w()
    {
        if (b.get("supportedDiagModes") instanceof Vector)
        {
            Vector vector = (Vector)b.get("supportedDiagModes");
            if (vector != null && vector.size() > 0 && (vector.get(0) instanceof Integer))
            {
                return vector;
            }
        }
        return null;
    }
}
