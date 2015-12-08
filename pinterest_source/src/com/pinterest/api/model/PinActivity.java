// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonObject;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.pinterest.api.model:
//            Pin, User, Board

public class PinActivity
{

    private static SimpleDateFormat _dateFormatterFromApi = new SimpleDateFormat("EEE, d MMM yyyy h:m:s Z");
    private Board _board;
    private Date _createdAt;
    private Pin _pin;
    private User _pinner;
    private Type _type;

    public PinActivity(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        byte byte0;
        s = pinterestjsonobject.a("type", null);
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 56
    //                   -881198461: 122
    //                   -397384815: 108
    //                   -280773715: 136;
           goto _L3 _L4 _L5 _L6
_L3:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Invalid activity type: ")).append(s).toString());

        case 0: // '\0'
            _type = Type.PIN_CREATION_ACTIVITY;
            if (pinterestjsonobject.c("pin") != null)
            {
                _pin = Pin.make(pinterestjsonobject.c("pin"));
                return;
            }
            break;

        case 1: // '\001'
            _type = Type.PIN_CREATION_ACTIVITY;
            if (pinterestjsonobject.c("pin") != null)
            {
                _pin = Pin.make(pinterestjsonobject.c("pin"));
                return;
            }
            break;

        case 2: // '\002'
            _type = Type.LIKE_ACTIVITY;
            _pinner = User.make(pinterestjsonobject.c("user"));
            try
            {
                _createdAt = _dateFormatterFromApi.parse(pinterestjsonobject.a("timestamp", null));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (PinterestJsonObject pinterestjsonobject)
            {
                return;
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
        if (s.equals("repinactivity"))
        {
            byte0 = 0;
        }
          goto _L3
_L4:
        if (s.equals("pincreationactivity"))
        {
            byte0 = 1;
        }
          goto _L3
_L6:
        if (s.equals("likepinactivity"))
        {
            byte0 = 2;
        }
          goto _L3
    }

    public Date getCreatedAt()
    {
        return _createdAt;
    }

    public Pin getPin()
    {
        return _pin;
    }

    public User getPinner()
    {
        return _pinner;
    }

    public Type getType()
    {
        return _type;
    }


    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type LIKE_ACTIVITY;
        public static final Type PIN_CREATION_ACTIVITY;
        public static final Type REPIN_ACTIVITY;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/pinterest/api/model/PinActivity$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            REPIN_ACTIVITY = new Type("REPIN_ACTIVITY", 0);
            LIKE_ACTIVITY = new Type("LIKE_ACTIVITY", 1);
            PIN_CREATION_ACTIVITY = new Type("PIN_CREATION_ACTIVITY", 2);
            $VALUES = (new Type[] {
                REPIN_ACTIVITY, LIKE_ACTIVITY, PIN_CREATION_ACTIVITY
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
