// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.HmiZoneCapabilities;
import com.ford.syncV4.proxy.rpc.enums.Language;
import com.ford.syncV4.proxy.rpc.enums.PrerecordedSpeech;
import com.ford.syncV4.proxy.rpc.enums.SpeechCapabilities;
import com.ford.syncV4.proxy.rpc.enums.VrCapabilities;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public final class avv extends atm
{

    public avv()
    {
        super("RegisterAppInterface");
    }

    public avv(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final awq h()
    {
        Object obj = b.get("syncMsgVersion");
        if (obj instanceof awq)
        {
            return (awq)obj;
        }
        if (obj instanceof Hashtable)
        {
            return new awq((Hashtable)obj);
        } else
        {
            return null;
        }
    }

    public final Language i()
    {
        Object obj = b.get("language");
        if (obj instanceof Language)
        {
            return (Language)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = Language.a((String)obj);
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".language").toString(), exception);
                return null;
            }
            return ((Language) (obj));
        } else
        {
            return null;
        }
    }

    public final Language j()
    {
        Object obj = b.get("hmiDisplayLanguage");
        if (obj instanceof Language)
        {
            return (Language)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = Language.a((String)obj);
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".hmiDisplayLanguage").toString(), exception);
                return null;
            }
            return ((Language) (obj));
        } else
        {
            return null;
        }
    }

    public final auo k()
    {
        Object obj = b.get("displayCapabilities");
        if (obj instanceof auo)
        {
            return (auo)obj;
        }
        if (obj instanceof Hashtable)
        {
            return new auo((Hashtable)obj);
        } else
        {
            return null;
        }
    }

    public final Vector l()
    {
        if (b.get("buttonCapabilities") instanceof Vector)
        {
            Object obj = (Vector)b.get("buttonCapabilities");
            if (obj != null && ((Vector) (obj)).size() > 0)
            {
                Object obj1 = ((Vector) (obj)).get(0);
                if (obj1 instanceof aub)
                {
                    return ((Vector) (obj));
                }
                if (obj1 instanceof Hashtable)
                {
                    Vector vector = new Vector();
                    for (obj = ((Vector) (obj)).iterator(); ((Iterator) (obj)).hasNext(); vector.add(new aub((Hashtable)((Iterator) (obj)).next()))) { }
                    return vector;
                }
            }
        }
        return null;
    }

    public final Vector m()
    {
        if (b.get("softButtonCapabilities") instanceof Vector)
        {
            Object obj = (Vector)b.get("softButtonCapabilities");
            if (obj != null && ((Vector) (obj)).size() > 0)
            {
                Object obj1 = ((Vector) (obj)).get(0);
                if (obj1 instanceof awj)
                {
                    return ((Vector) (obj));
                }
                if (obj1 instanceof Hashtable)
                {
                    Vector vector = new Vector();
                    for (obj = ((Vector) (obj)).iterator(); ((Iterator) (obj)).hasNext(); vector.add(new awj((Hashtable)((Iterator) (obj)).next()))) { }
                    return vector;
                }
            }
        }
        return null;
    }

    public final avq n()
    {
        Object obj = b.get("presetBankCapabilities");
        if (obj instanceof avq)
        {
            return (avq)obj;
        }
        if (obj instanceof Hashtable)
        {
            return new avq((Hashtable)obj);
        } else
        {
            return null;
        }
    }

    public final Vector o()
    {
        if (!(b.get("hmiZoneCapabilities") instanceof Vector)) goto _L2; else goto _L1
_L1:
        Vector vector = (Vector)b.get("hmiZoneCapabilities");
        if (vector == null || vector.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        obj1 = vector.get(0);
        if (obj1 instanceof HmiZoneCapabilities)
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
                obj = HmiZoneCapabilities.a(((String) (obj)));
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".hmiZoneCapabilities").toString(), exception);
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

    public final Vector p()
    {
        if (!(b.get("speechCapabilities") instanceof Vector)) goto _L2; else goto _L1
_L1:
        Vector vector = (Vector)b.get("speechCapabilities");
        if (vector == null || vector.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        obj1 = vector.get(0);
        if (obj1 instanceof SpeechCapabilities)
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
                obj = SpeechCapabilities.a(((String) (obj)));
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".speechCapabilities").toString(), exception);
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
        if (!(b.get("prerecordedSpeech") instanceof Vector)) goto _L2; else goto _L1
_L1:
        Vector vector = (Vector)b.get("prerecordedSpeech");
        if (vector == null || vector.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        obj1 = vector.get(0);
        if (obj1 instanceof PrerecordedSpeech)
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
                obj = PrerecordedSpeech.a(((String) (obj)));
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".prerecordedSpeech").toString(), exception);
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
        if (!(b.get("vrCapabilities") instanceof Vector)) goto _L2; else goto _L1
_L1:
        Vector vector = (Vector)b.get("vrCapabilities");
        if (vector == null || vector.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        obj1 = vector.get(0);
        if (obj1 instanceof VrCapabilities)
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
                obj = VrCapabilities.a(((String) (obj)));
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".vrCapabilities").toString(), exception);
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

    public final awy s()
    {
        Object obj = b.get("vehicleType");
        if (obj instanceof awy)
        {
            return (awy)obj;
        }
        if (obj instanceof Hashtable)
        {
            return new awy((Hashtable)obj);
        } else
        {
            return null;
        }
    }

    public final Vector t()
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
