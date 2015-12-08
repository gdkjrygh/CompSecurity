// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

final class onv
    implements onl
{

    onv()
    {
    }

    static File b(Context context)
    {
        return c(context);
    }

    private static File c(Context context)
    {
        return new File(context.getFilesDir(), "paddingStart");
    }

    public final File a(Context context)
    {
        return c(context);
    }

    public final Object a()
    {
        return "paddingStart";
    }

    public final boolean a(Throwable throwable)
    {
        return (throwable instanceof NumberFormatException) && Pattern.matches("Invalid int: \"[0-9]+(.[0-9]*)?(dip|dp|sp|mm|in|px)\"", throwable.getMessage());
    }

    public final al b()
    {
        return new onw();
    }
}
