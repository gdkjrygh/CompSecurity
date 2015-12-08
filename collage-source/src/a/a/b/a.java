// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.b;


// Referenced classes of package a.a.b:
//            b

public class a extends b
{

    public a(Exception exception)
    {
        super((new StringBuilder()).append("Communication with the service provider failed: ").append(exception.getLocalizedMessage()).toString(), exception);
    }
}
