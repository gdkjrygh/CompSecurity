// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class ecv extends mtf
{

    private static final ekk a = (new ekm()).a(hpe).a();
    private final ekq b;
    private final int c;
    private final int j;
    private final dui k;
    private final noz l;

    public ecv(ekq ekq1, int i, int i1, dui dui, noz noz1)
    {
        super("StoriesCardLoadFeaturesTask");
        b = ekq1;
        c = i;
        j = i1;
        k = dui;
        l = noz1;
    }

    protected final mue a(Context context)
    {
        context = b.b(context, b);
        mue mue1;
        Bundle bundle;
        try
        {
            context = (ekq)context.a(b, a).a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (l.a())
            {
                b.a(b);
            }
            return new mue(false);
        }
        mue1 = new mue(true);
        bundle = mue1.a();
        bundle.putParcelable("mediaCollection", context);
        bundle.putInt("accountId", c);
        bundle.putParcelable("cardId", k);
        bundle.putInt("storyCardType", j);
        return mue1;
    }

}
