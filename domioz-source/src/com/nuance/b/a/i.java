// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.a:
//            a, x, y, ad, 
//            al, k, j, r, 
//            s, q

public class i extends a
{

    private x b;
    private y c;
    public final r concept;
    private ad d;
    private al e;
    private k f;
    public final j type;

    public i(String s1, j j1, r r1)
    {
        super(s1);
        b = x.d;
        c = y.b;
        d = ad.a;
        e = al.b;
        f = null;
        if (j1 == null)
        {
            throw new NullPointerException("type cannot be null.");
        }
        if (r1 == null)
        {
            throw new NullPointerException("concept cannot be null");
        } else
        {
            type = j1;
            concept = r1;
            return;
        }
    }

    void a()
    {
        if (f == null)
        {
            f = new k(this, getPredictionMode(), getCollectionMode(), getCorrectionMode(), getConfirmationMode(), getConfirmationType());
        }
    }

    void b()
    {
        if (f != null)
        {
            setPredictionMode(f.a);
            setCollectionMode(f.b);
            setCorrectionMode(f.c);
            setConfirmationMode(f.d);
            setConfirmationType(f.e);
        }
    }

    public q getCollectionMode()
    {
        return super.getCollectionMode();
    }

    public x getConfirmationMode()
    {
        return b;
    }

    public y getConfirmationType()
    {
        return c;
    }

    public ad getCorrectionMode()
    {
        return d;
    }

    public al getPredictionMode()
    {
        return e;
    }

    public void setCollectionMode(q q)
    {
        super.setCollectionMode(q);
    }

    public void setConfirmationMode(x x1)
    {
        if (x1 == null)
        {
            throw new NullPointerException("confirmationMode cannot be null");
        } else
        {
            b = x1;
            return;
        }
    }

    public void setConfirmationType(y y1)
    {
        if (y1 == null)
        {
            throw new NullPointerException("confirmationType cannot be null");
        } else
        {
            c = y1;
            return;
        }
    }

    public void setCorrectionMode(ad ad1)
    {
        if (ad1 == null)
        {
            throw new NullPointerException("correctionMode cannot be null");
        } else
        {
            d = ad1;
            return;
        }
    }

    public void setPredictionMode(al al1)
    {
        if (al1 == null)
        {
            throw new NullPointerException("predictionMode cannot be null");
        } else
        {
            e = al1;
            return;
        }
    }

    public final JSONObject toJSONObject()
    {
        JSONObject jsonobject = super.toJSONObject();
        try
        {
            jsonobject.put("component", "AGENT");
            jsonobject.put("type", type.toString());
            JSONObject jsonobject1 = jsonobject.optJSONObject("properties");
            jsonobject1.put("predictionMode", getPredictionMode().toString());
            jsonobject1.put("correctionMode", getCorrectionMode().toString());
            jsonobject1.put("confirmationMode", getConfirmationMode().toString());
            jsonobject1.put("confirmationType", getConfirmationType().toString());
            jsonobject.put("properties", jsonobject1);
            jsonobject1 = new JSONObject();
            jsonobject1.put("name", concept.name);
            jsonobject1.put("type", concept.type.toString());
            if (concept.defaultValue != null)
            {
                jsonobject1.put("defaultValue", concept.defaultValue);
            }
            jsonobject.put("concept", jsonobject1);
        }
        catch (JSONException jsonexception)
        {
            throw new RuntimeException((new StringBuilder("Should be impossible. ")).append(jsonexception.toString()).toString());
        }
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder("[Agent ")).append(name).append(": , type=").append(type).append(", collectionMode=").append(getCollectionMode()).append(", confirmationMode=").append(getConfirmationMode()).append(", confirmationType=").append(getConfirmationType()).append(", correctionMode=").append(getCorrectionMode()).append(", predictionMode=").append(getPredictionMode()).append("]").toString();
    }
}
