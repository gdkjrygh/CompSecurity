// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class lvu
    implements lvs
{

    public lvu()
    {
    }

    public final lvt a(Context context)
    {
        try
        {
            context = new lvv(jnw.a(context));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new lzi(((jya) (context)).a, context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new lzj(((jyb) (context)).a, context.getMessage(), context.a(), context);
        }
        return context;
    }
}
