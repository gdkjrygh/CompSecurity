// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import java.util.List;
import rx.b.f;

// Referenced classes of package rx:
//            b

final class E
    implements f
{

    E()
    {
    }

    public final Object call(Object obj)
    {
        obj = (List)obj;
        return (b[])((List) (obj)).toArray(new b[((List) (obj)).size()]);
    }
}
