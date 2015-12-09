// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.ByteBuffer;

public interface cwi
    extends Framedata
{

    public abstract void a(com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode);

    public abstract void a(ByteBuffer bytebuffer);

    public abstract void a(boolean flag);
}
