// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;

public final class gwr
{

    final Handler a = new Handler(Looper.getMainLooper());
    final ContentResolver b;
    volatile boolean c;

    gwr(ContentResolver contentresolver)
    {
        b = contentresolver;
    }

    public final gws a(Uri uri, String as[])
    {
        as = new gwv(uri, as) {

            private Uri a;
            private String b[];
            private gwr c;

            public final Cursor a()
            {
                return c.b.query(a, b, null, null, null);
            }

            
            {
                c = gwr.this;
                a = uri;
                b = as;
                super();
            }
        };
        uri = hew.a(new hey(uri, as) {

            final gwv a;
            final gwr b;
            private Uri c;

            public final void a(Object obj)
            {
                obj = (hff)obj;
                ContentObserver contentobserver = new ContentObserver(this, b.a, ((hff) (obj))) {

                    private hff a;
                    private _cls2 b;

                    public final void onChange(boolean flag)
                    {
                        flag = b.b.c;
                        a.onNext(b.a);
                    }

            
            {
                b = _pcls2;
                a = hff1;
                super(handler);
            }
                };
                b.b.registerContentObserver(c, false, contentobserver);
                ((hff) (obj)).add(hkr.a(new hfr(this, contentobserver) {

                    private ContentObserver a;
                    private _cls2 b;

                    public final void call()
                    {
                        b.b.b.unregisterContentObserver(a);
                    }

            
            {
                b = _pcls2;
                a = contentobserver;
                super();
            }
                }));
            }

            
            {
                b = gwr.this;
                c = uri;
                a = gwv;
                super();
            }
        });
        return new gws(hew.a(hew.a(as), uri).a(gwp.a()));
    }
}
