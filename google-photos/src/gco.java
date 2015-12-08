// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;

public final class gco extends mtf
{

    private final get a;
    private final int b;

    public gco(get get, int i)
    {
        super("com.google.android.apps.photos.metasync.async.GetAllPhotosTask");
        a = get;
        b = i;
    }

    protected final mue a(Context context)
    {
        mue mue1 = new mue(true);
        try
        {
            context = ((gcc)olm.a(context, gcc)).a(b, a);
            mue1.a().putParcelable("key_sync_result", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return mue1;
    }
}
