// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.wire.Message;
import com.squareup.wire.WireType;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import okio.ByteString;

public abstract class gxc
{

    public gxn unknownFieldMap;

    public gxc()
    {
    }

    public gxc(Message message)
    {
        if (message != null && Message.a(message) != null)
        {
            unknownFieldMap = new gxn(Message.a(message));
        }
    }

    public static List checkForNulls(List list)
    {
label0:
        {
            if (list == null || list.isEmpty())
            {
                break label0;
            }
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (iterator.next() != null);
            throw new NullPointerException();
        }
        return list;
    }

    private gxn ensureUnknownFieldMap()
    {
        if (unknownFieldMap == null)
        {
            unknownFieldMap = new gxn();
        }
        return unknownFieldMap;
    }

    public void addFixed32(int i, int j)
    {
        gxn.a(ensureUnknownFieldMap().a(), i, Integer.valueOf(j), WireType.f);
    }

    public void addFixed64(int i, long l)
    {
        gxn.a(ensureUnknownFieldMap().a(), i, Long.valueOf(l), WireType.b);
    }

    public void addLengthDelimited(int i, ByteString bytestring)
    {
        gxn.a(ensureUnknownFieldMap().a(), i, bytestring, WireType.c);
    }

    public void addVarint(int i, long l)
    {
        gxn.a(ensureUnknownFieldMap().a(), i, Long.valueOf(l), WireType.a);
    }

    public abstract Message build();

    public void checkRequiredFields()
    {
        Object obj;
        StringBuilder stringbuilder;
        Object obj1;
        StringBuilder stringbuilder1;
        int i;
        gww gww1 = Message.c().b(getClass());
        stringbuilder = null;
        obj = "";
        Field field;
        int j;
        try
        {
            j = gww1.a.size();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError("Unable to access required fields");
        }
        i = 0;
_L5:
        if (i >= j) goto _L2; else goto _L1
_L1:
        field = (Field)gww1.a.get(i);
        obj1 = obj;
        stringbuilder1 = stringbuilder;
        if (field.get(this) != null) goto _L4; else goto _L3
_L3:
        if (stringbuilder != null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        stringbuilder = new StringBuilder();
_L6:
        stringbuilder.append("\n  ");
        stringbuilder.append(field.getName());
        obj1 = obj;
        stringbuilder1 = stringbuilder;
          goto _L4
_L2:
        if (stringbuilder == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        throw new IllegalStateException((new StringBuilder("Required field")).append(((String) (obj))).append(" not set:").append(stringbuilder).toString());
        return;
_L4:
        i++;
        stringbuilder = stringbuilder1;
        obj = obj1;
          goto _L5
        obj = "s";
          goto _L6
    }
}
