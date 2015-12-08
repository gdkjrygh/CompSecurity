// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import rx.exceptions.OnErrorThrowable;

final class dul
    implements hez
{

    final hfw a;

    dul(hfw hfw)
    {
        a = hfw;
    }

    public final Object call(Object obj)
    {
        obj = (hff)obj;
        return new hff(((hff) (obj)), ((hff) (obj))) {

            private hff a;
            private dul b;

            public final void onCompleted()
            {
                a.onCompleted();
            }

            public final void onError(Throwable throwable)
            {
                a.onError(throwable);
            }

            public final void onNext(Object obj1)
            {
                gwv gwv1;
                gwv1 = (gwv)obj1;
                obj1 = null;
                Cursor cursor = gwv1.a();
                boolean flag = true;
                boolean flag1 = duc.a(cursor);
                if (flag1) goto _L2; else goto _L1
_L1:
                cursor.close();
_L4:
                return;
_L2:
                if (!cursor.moveToFirst())
                {
                    break MISSING_BLOCK_LABEL_108;
                }
                flag = false;
                Object obj2 = b.a.call(cursor);
                obj1 = obj2;
                if (obj2 != null)
                {
                    break MISSING_BLOCK_LABEL_108;
                }
                throw new NullPointerException("Mapper returned null for row 1");
                obj1;
                try
                {
                    cursor.close();
                    throw obj1;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    hfp.a(((Throwable) (obj1)));
                }
                onError(OnErrorThrowable.a(((Throwable) (obj1)), gwv1.toString()));
                return;
                cursor.close();
                if (a.isUnsubscribed() || flag) goto _L4; else goto _L3
_L3:
                a.onNext(obj1);
                return;
            }

            
            {
                b = dul.this;
                a = hff2;
                super(hff1);
            }
        };
    }
}
