// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.f;
import com.ford.syncV4.e.c.a.j;
import com.ford.syncV4.e.c.a.l;
import com.ford.syncV4.e.c.a.p;
import com.ford.syncV4.e.c.a.y;
import com.ford.syncV4.e.g;
import com.ford.syncV4.util.c;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

// Referenced classes of package com.ford.syncV4.e.c:
//            bs, q, f, bm, 
//            au, cb

public final class az extends g
{

    public az()
    {
        super("RegisterAppInterface");
    }

    public az(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final bs i()
    {
        Object obj = b.get("syncMsgVersion");
        if (obj instanceof bs)
        {
            return (bs)obj;
        }
        if (obj instanceof Hashtable)
        {
            return new bs((Hashtable)obj);
        } else
        {
            return null;
        }
    }

    public final j j()
    {
        Object obj = b.get("language");
        if (obj instanceof j)
        {
            return (j)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = com.ford.syncV4.e.c.a.j.a((String)obj);
            }
            catch (Exception exception)
            {
                c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".language").toString(), exception);
                return null;
            }
            return ((j) (obj));
        } else
        {
            return null;
        }
    }

    public final j k()
    {
        Object obj = b.get("hmiDisplayLanguage");
        if (obj instanceof j)
        {
            return (j)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = com.ford.syncV4.e.c.a.j.a((String)obj);
            }
            catch (Exception exception)
            {
                c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".hmiDisplayLanguage").toString(), exception);
                return null;
            }
            return ((j) (obj));
        } else
        {
            return null;
        }
    }

    public final q l()
    {
        Object obj = b.get("displayCapabilities");
        if (obj instanceof q)
        {
            return (q)obj;
        }
        if (obj instanceof Hashtable)
        {
            return new q((Hashtable)obj);
        } else
        {
            return null;
        }
    }

    public final Vector m()
    {
        if (b.get("buttonCapabilities") instanceof Vector)
        {
            Object obj = (Vector)b.get("buttonCapabilities");
            if (obj != null && ((Vector) (obj)).size() > 0)
            {
                Object obj1 = ((Vector) (obj)).get(0);
                if (obj1 instanceof com.ford.syncV4.e.c.f)
                {
                    return ((Vector) (obj));
                }
                if (obj1 instanceof Hashtable)
                {
                    Vector vector = new Vector();
                    for (obj = ((Vector) (obj)).iterator(); ((Iterator) (obj)).hasNext(); vector.add(new com.ford.syncV4.e.c.f((Hashtable)((Iterator) (obj)).next()))) { }
                    return vector;
                }
            }
        }
        return null;
    }

    public final Vector n()
    {
        if (b.get("softButtonCapabilities") instanceof Vector)
        {
            Object obj = (Vector)b.get("softButtonCapabilities");
            if (obj != null && ((Vector) (obj)).size() > 0)
            {
                Object obj1 = ((Vector) (obj)).get(0);
                if (obj1 instanceof bm)
                {
                    return ((Vector) (obj));
                }
                if (obj1 instanceof Hashtable)
                {
                    Vector vector = new Vector();
                    for (obj = ((Vector) (obj)).iterator(); ((Iterator) (obj)).hasNext(); vector.add(new bm((Hashtable)((Iterator) (obj)).next()))) { }
                    return vector;
                }
            }
        }
        return null;
    }

    public final au o()
    {
        Object obj = b.get("presetBankCapabilities");
        if (obj instanceof au)
        {
            return (au)obj;
        }
        if (obj instanceof Hashtable)
        {
            return new au((Hashtable)obj);
        } else
        {
            return null;
        }
    }

    public final Vector p()
    {
        if (!(b.get("hmiZoneCapabilities") instanceof Vector)) goto _L2; else goto _L1
_L1:
        Vector vector = (Vector)b.get("hmiZoneCapabilities");
        if (vector == null || vector.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        obj1 = vector.get(0);
        if (obj1 instanceof f)
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
                obj = f.a(((String) (obj)));
            }
            catch (Exception exception)
            {
                c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".hmiZoneCapabilities").toString(), exception);
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

    public final Vector q()
    {
        if (!(b.get("speechCapabilities") instanceof Vector)) goto _L2; else goto _L1
_L1:
        Vector vector = (Vector)b.get("speechCapabilities");
        if (vector == null || vector.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        obj1 = vector.get(0);
        if (obj1 instanceof p)
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
                obj = com.ford.syncV4.e.c.a.p.a(((String) (obj)));
            }
            catch (Exception exception)
            {
                c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".speechCapabilities").toString(), exception);
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

    public final Vector r()
    {
        if (!(b.get("prerecordedSpeech") instanceof Vector)) goto _L2; else goto _L1
_L1:
        Vector vector = (Vector)b.get("prerecordedSpeech");
        if (vector == null || vector.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        obj1 = vector.get(0);
        if (obj1 instanceof l)
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
                obj = com.ford.syncV4.e.c.a.l.a(((String) (obj)));
            }
            catch (Exception exception)
            {
                c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".prerecordedSpeech").toString(), exception);
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

    public final Vector s()
    {
        if (!(b.get("vrCapabilities") instanceof Vector)) goto _L2; else goto _L1
_L1:
        Vector vector = (Vector)b.get("vrCapabilities");
        if (vector == null || vector.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        obj1 = vector.get(0);
        if (obj1 instanceof y)
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
                obj = y.a(((String) (obj)));
            }
            catch (Exception exception)
            {
                c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".vrCapabilities").toString(), exception);
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

    public final cb t()
    {
        Object obj = b.get("vehicleType");
        if (obj instanceof cb)
        {
            return (cb)obj;
        }
        if (obj instanceof Hashtable)
        {
            return new cb((Hashtable)obj);
        } else
        {
            return null;
        }
    }

    public final Vector u()
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
