// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;

public final class hln extends mtf
{

    private final hkt a;
    private final hlo b;

    public hln(Context context, int i, long l, String s, String s1)
    {
        super("ChangeAlbumTitleTask");
        p.a(s1);
        b = new hlo(context.getApplicationContext(), i, s, s1);
        a = new hkt(context.getApplicationContext(), i, l, s1);
    }

    protected final mue a(Context context)
    {
        ((nxv)olm.a(context, nxv)).a(a);
        if (!a.a)
        {
            if (Log.isLoggable("ChangeAlbumTitleTask", 6))
            {
                context = String.valueOf("onBackgroundTaskFinished {tag: ChangeAlbumTitleTask, Error: ");
                String s = String.valueOf(((nxx) (a)).m);
                if (s.length() != 0)
                {
                    context = context.concat(s);
                } else
                {
                    context = new String(context);
                }
                Log.e("ChangeAlbumTitleTask", context, ((nxx) (a)).n);
            }
            return new mue(((nxx) (a)).l, ((nxx) (a)).n, null);
        }
        if (b != null)
        {
            context = b;
            mtj.b(((hlo) (context)).a, new hlw(((hlo) (context)).b, ((hlo) (context)).d, ((hlo) (context)).c));
        }
        return new mue(true);
    }
}
