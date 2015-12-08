// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.thrift;

import java.io.Serializable;
import org.apache.thrift.protocol.TProtocol;

// Referenced classes of package org.apache.thrift:
//            TFieldIdEnum

public interface TBase
    extends Serializable, Comparable
{

    public abstract void clear();

    public abstract TBase deepCopy();

    public abstract TFieldIdEnum fieldForId(int i);

    public abstract Object getFieldValue(TFieldIdEnum tfieldidenum);

    public abstract boolean isSet(TFieldIdEnum tfieldidenum);

    public abstract void read(TProtocol tprotocol);

    public abstract void setFieldValue(TFieldIdEnum tfieldidenum, Object obj);

    public abstract void write(TProtocol tprotocol);
}
