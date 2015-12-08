// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;
import org.json.JSONArray;

public abstract class aay extends aaf
{

    public aay()
    {
    }

    public abstract JSONArray a();

    public final void a(OutputStream outputstream)
    {
        outputstream.write(a().toString().getBytes());
    }
}
