// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

public final class mqy extends mtf
{

    private final mqm a;
    private final mqw b;

    public mqy(Context context, mqm mqm)
    {
        super(context, "GetUploadMediaStatusesTask");
        a = mqm;
        b = (mqw)olm.a(context, mqw);
    }

    protected final mue a()
    {
        ArrayList arraylist = new ArrayList(b.b(a));
        mue mue1 = new mue(true);
        mue1.a().putParcelableArrayList("statuses", arraylist);
        return mue1;
    }
}
