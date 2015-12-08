// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class mRequest
    implements lang.Object
{

    private final int mIndex;
    private final ph mRequest;
    final pg this$0;

    public final ph a()
    {
        return mRequest;
    }

    public final pi a(ph ph)
    {
        if (mIndex < pg.a().size())
        {
            ph = new <init>(mIndex + 1, ph);
            return ((oX)pg.a().get(mIndex)).a(ph);
        } else
        {
            return pg.this.a(ph);
        }
    }

    >(int i, ph ph)
    {
        this$0 = pg.this;
        super();
        mIndex = i;
        mRequest = ph;
    }
}
