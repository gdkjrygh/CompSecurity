// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.device_capabilities;


// Referenced classes of package org.xwalk.core.internal.extension.api.device_capabilities:
//            XWalkMediaCodec

protected class hwAccel
{

    public String codecName;
    public boolean hwAccel;
    public boolean isEncoder;
    final XWalkMediaCodec this$0;

    public boolean equals(Object obj)
    {
        return codecName.equals(((codecName)obj).codecName) && isEncoder == ((isEncoder)obj).isEncoder && hwAccel == ((hwAccel)obj).hwAccel;
    }

    public int hashCode()
    {
        return codecName.hashCode();
    }

    public a(String s, boolean flag, boolean flag1)
    {
        this$0 = XWalkMediaCodec.this;
        super();
        codecName = s;
        isEncoder = flag;
        hwAccel = flag1;
    }
}
