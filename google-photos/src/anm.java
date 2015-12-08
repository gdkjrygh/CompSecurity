// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import java.io.IOException;

public abstract class anm
    implements ann
{

    private final String a;
    private final AssetManager b;
    private Object c;

    public anm(AssetManager assetmanager, String s)
    {
        b = assetmanager;
        a = s;
    }

    protected abstract Object a(AssetManager assetmanager, String s);

    public final void a()
    {
        if (c == null)
        {
            return;
        }
        try
        {
            a(c);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    public final void a(amb amb, ano ano1)
    {
        try
        {
            c = a(b, a);
        }
        // Misplaced declaration of an exception variable
        catch (amb amb)
        {
            ano1.a(amb);
            return;
        }
        ano1.a(c);
    }

    protected abstract void a(Object obj);

    public final void b()
    {
    }

    public final amz c()
    {
        return amz.a;
    }
}
