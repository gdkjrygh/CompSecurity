// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import com.ibm.eo.util.LogInternal;
import java.io.Serializable;
import org.json.JSONObject;

// Referenced classes of package com.ibm.eo.model:
//            EOMessage, KeyboardType

public class AndroidArray extends EOMessage
    implements Serializable
{

    private static final long serialVersionUID = 0x5058995dd647841eL;
    private String brand;
    private String fingerPrint;
    private KeyboardType keyboardType;

    public AndroidArray()
    {
    }

    public final Boolean clean()
    {
        brand = null;
        fingerPrint = null;
        keyboardType = null;
        return Boolean.valueOf(true);
    }

    public final String getBrand()
    {
        return brand;
    }

    public final String getFingerPrint()
    {
        return fingerPrint;
    }

    public final JSONObject getJSON()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("brand", getBrand());
            jsonobject.put("fingerPrint", getFingerPrint());
            jsonobject.put("keyboardType", getKeyboardType());
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception);
            return jsonobject;
        }
        return jsonobject;
    }

    public final KeyboardType getKeyboardType()
    {
        return keyboardType;
    }

    public final void setBrand(String s)
    {
        brand = s;
    }

    public final void setFingerPrint(String s)
    {
        fingerPrint = s;
    }

    public final void setKeyboardType(KeyboardType keyboardtype)
    {
        keyboardType = keyboardtype;
    }
}
