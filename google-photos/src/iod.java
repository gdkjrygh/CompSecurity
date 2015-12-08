// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

public final class iod extends mtf
{

    private final String a;
    private final int b;

    public iod(int i, String s)
    {
        super("LoadMediaCollectionTask");
        b = i;
        a = s;
    }

    protected final mue a(Context context)
    {
        ekq ekq1 = b.a(b, a);
        ekr ekr1 = b.b(context, ekq1);
        context = new mue(true);
        Bundle bundle = context.a();
        bundle.putString("mediaKey", a);
        try
        {
            bundle.putParcelable("story_media_collection", (ekq)ekr1.a(ekq1, ioe.a).a());
        }
        catch (ekd ekd1)
        {
            bundle.putBoolean("collectionNotFound", true);
            return context;
        }
        catch (eke eke1)
        {
            context = String.valueOf(a);
            if (context.length() != 0)
            {
                context = "Error loading MediaCollection features. mediaKey=".concat(context);
            } else
            {
                context = new String("Error loading MediaCollection features. mediaKey=");
            }
            Log.e("LoadMediaCollectionTask", context, eke1);
            return new mue(false);
        }
        return context;
    }
}
