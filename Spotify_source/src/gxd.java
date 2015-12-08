// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.wire.MessageAdapter;
import java.lang.reflect.Field;

public final class gxd
{

    public final int a;
    public final String b;
    public final com.squareup.wire.Message.Datatype c;
    public final com.squareup.wire.Message.Label d;
    public final Class e;
    public final Class f;
    public final boolean g;
    public MessageAdapter h;
    public gwx i;
    public final Field j;
    public final Field k;

    private gxd(int l, String s, com.squareup.wire.Message.Datatype datatype, com.squareup.wire.Message.Label label, boolean flag, Class class1, Field field, 
            Field field1)
    {
        a = l;
        b = s;
        c = datatype;
        d = label;
        g = flag;
        if (datatype == com.squareup.wire.Message.Datatype.ENUM)
        {
            e = class1;
            f = null;
        } else
        if (datatype == com.squareup.wire.Message.Datatype.MESSAGE)
        {
            f = class1;
            e = null;
        } else
        {
            e = null;
            f = null;
        }
        j = field;
        k = field1;
    }

    public gxd(int l, String s, com.squareup.wire.Message.Datatype datatype, com.squareup.wire.Message.Label label, boolean flag, Class class1, Field field, 
            Field field1, byte byte0)
    {
        this(l, s, datatype, label, flag, class1, field, field1);
    }
}
