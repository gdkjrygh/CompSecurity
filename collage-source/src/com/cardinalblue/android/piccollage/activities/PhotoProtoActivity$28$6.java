// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.text.ClipboardManager;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.UndoManager;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.undo.ChangeZIndexOp;
import com.cardinalblue.android.piccollage.controller.CollageController;
import com.cardinalblue.android.piccollage.model.AbstractCollage;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.n;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import net.a.a.c;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements Callable
{

    final g a;
    final a b;

    public Void a()
        throws Exception
    {
        if (!a.h())
        {
            PhotoProtoActivity.e(b.b).h(a);
        }
        return null;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    b(b b1, g g1)
    {
        b = b1;
        a = g1;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PhotoProtoActivity$28

/* anonymous class */
    class PhotoProtoActivity._cls28
        implements net.a.a.c.a
    {

        final PhotoProtoActivity a;

        private void a(String s)
        {
            com.cardinalblue.android.piccollage.a.b.z(s);
        }

        public void a(c c, int i, int l, ImageView imageview, TextView textview)
        {
            if (PhotoProtoActivity.v(a) == null)
            {
                return;
            }
            if (!(PhotoProtoActivity.v(a) instanceof n)) goto _L2; else goto _L1
_L1:
            l;
            JVM INSTR tableswitch 6 6: default 44
        //                       6 186;
               goto _L2 _L3
_L2:
            if (!(PhotoProtoActivity.v(a) instanceof g)) goto _L5; else goto _L4
_L4:
            g g1 = (g)PhotoProtoActivity.v(a);
            l;
            JVM INSTR tableswitch 0 4: default 104
        //                       0 206
        //                       1 227
        //                       2 297
        //                       3 384
        //                       4 403;
               goto _L6 _L7 _L8 _L9 _L10 _L11
_L6:
            break; /* Loop/switch isn't completed */
_L11:
            break MISSING_BLOCK_LABEL_403;
_L5:
            switch (l)
            {
            default:
                return;

            case 5: // '\005'
                break;
            }
            String s;
            if (PhotoProtoActivity.e(a).g(PhotoProtoActivity.v(a)))
            {
                a("bring to front");
                com.cardinalblue.android.piccollage.a.b.bY();
                PhotoProtoActivity.a(a, PhotoProtoActivity.v(a), false).c(new PhotoProtoActivity._cls28._cls7(textview, imageview));
                return;
            } else
            {
                a("push to button");
                com.cardinalblue.android.piccollage.a.b.bX();
                PhotoProtoActivity.q(a).c(PhotoProtoActivity.v(a)).c(new PhotoProtoActivity._cls28._cls8(textview, imageview), j.b);
                return;
            }
_L3:
            a.a((n)PhotoProtoActivity.v(a));
              goto _L2
_L7:
            com.cardinalblue.android.piccollage.a.b.ae();
            a("edit");
            PhotoProtoActivity.a(a, g1);
              goto _L5
_L8:
            s = g1.i();
            com.cardinalblue.android.piccollage.a.b.ag();
            c = s;
            if (TextUtils.isEmpty(s))
            {
                c = "unknown";
            }
            com.cardinalblue.android.piccollage.a.b.v(c);
            a("set background");
            g1.c(false);
            PhotoProtoActivity.e(a).a(g1, com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(a));
            PhotoProtoActivity.l(a);
              goto _L5
_L9:
            com.cardinalblue.android.piccollage.a.b.af();
            a("clip");
            if (g1.h())
            {
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(a, g1);
            } else
            {
                k.a(a, new PhotoProtoActivity._cls28._cls3(g1), a.getString(0x7f0701fa)).c(new PhotoProtoActivity._cls28._cls2(), k.a).a(new PhotoProtoActivity._cls28._cls1(), k.a);
            }
              goto _L5
_L10:
            com.cardinalblue.android.piccollage.a.b.ad();
            a("border");
            PhotoProtoActivity.w(a);
              goto _L5
            com.cardinalblue.android.piccollage.a.b.ah();
            a("copy");
            k.a(a, new PhotoProtoActivity._cls28._cls6(this, g1), a.getString(0x7f0701fa)).c(new PhotoProtoActivity._cls28._cls5(g1), k.a).a(new PhotoProtoActivity._cls28._cls4(), k.a);
              goto _L5
        }

            
            {
                a = photoprotoactivity;
                super();
            }

        // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PhotoProtoActivity$28$1

/* anonymous class */
        class PhotoProtoActivity._cls28._cls1
            implements i
        {

            final PhotoProtoActivity._cls28 a;

            public Void a(j j1)
                throws Exception
            {
                if (j1.d())
                {
                    f.a(j1.f());
                    k.a(a.a, 0x7f0700d4, 0);
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

                    
                    {
                        a = PhotoProtoActivity._cls28.this;
                        super();
                    }
        }


        // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PhotoProtoActivity$28$2

/* anonymous class */
        class PhotoProtoActivity._cls28._cls2
            implements i
        {

            final PhotoProtoActivity._cls28 a;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(a.a, (g)j1.e());
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

                    
                    {
                        a = PhotoProtoActivity._cls28.this;
                        super();
                    }
        }


        // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PhotoProtoActivity$28$3

/* anonymous class */
        class PhotoProtoActivity._cls28._cls3
            implements Callable
        {

            final g a;
            final PhotoProtoActivity._cls28 b;

            public g a()
                throws Exception
            {
                PhotoProtoActivity.e(b.a).h(a);
                return a;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

                    
                    {
                        b = PhotoProtoActivity._cls28.this;
                        a = g1;
                        super();
                    }
        }


        // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PhotoProtoActivity$28$4

/* anonymous class */
        class PhotoProtoActivity._cls28._cls4
            implements i
        {

            final PhotoProtoActivity._cls28 a;

            public Void a(j j1)
                throws Exception
            {
                if (j1.d())
                {
                    f.a(j1.f());
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

                    
                    {
                        a = PhotoProtoActivity._cls28.this;
                        super();
                    }
        }


        // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PhotoProtoActivity$28$5

/* anonymous class */
        class PhotoProtoActivity._cls28._cls5
            implements i
        {

            final g a;
            final PhotoProtoActivity._cls28 b;

            public Void a(j j1)
                throws Exception
            {
                boolean flag = PhotoProtoActivity.r(b.a).hasText();
                j1 = a.ab();
                PhotoProtoActivity.r(b.a).setText(j1);
                boolean flag1 = PhotoProtoActivity.r(b.a).hasText();
                if (flag ^ flag1)
                {
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(b.a, true);
                }
                if (flag1)
                {
                    com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.b(b.a, String.valueOf(PhotoProtoActivity.r(b.a).getText()));
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

                    
                    {
                        b = PhotoProtoActivity._cls28.this;
                        a = g1;
                        super();
                    }
        }


        // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PhotoProtoActivity$28$7

/* anonymous class */
        class PhotoProtoActivity._cls28._cls7
            implements i
        {

            final TextView a;
            final ImageView b;
            final PhotoProtoActivity._cls28 c;

            public Void a(j j1)
                throws Exception
            {
                a.setText(PhotoProtoActivity.x(c.a));
                b.setImageDrawable(PhotoProtoActivity.y(c.a));
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

                    
                    {
                        c = PhotoProtoActivity._cls28.this;
                        a = textview;
                        b = imageview;
                        super();
                    }
        }


        // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PhotoProtoActivity$28$8

/* anonymous class */
        class PhotoProtoActivity._cls28._cls8
            implements i
        {

            final TextView a;
            final ImageView b;
            final PhotoProtoActivity._cls28 c;

            public Void a(j j1)
                throws Exception
            {
                Hashtable hashtable = new Hashtable();
                com.cardinalblue.android.piccollage.view.k k2;
                for (Iterator iterator = PhotoProtoActivity.d(c.a).t().iterator(); iterator.hasNext(); hashtable.put(Long.valueOf(k2.U()), Integer.valueOf(k2.W())))
                {
                    k2 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
                }

                if (!PhotoProtoActivity.e(c.a).c((com.cardinalblue.android.piccollage.view.k)j1.e()))
                {
                    return null;
                }
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(c.a).a("push scrap to bottom");
                j1 = PhotoProtoActivity.d(c.a).t().iterator();
                do
                {
                    if (!j1.hasNext())
                    {
                        break;
                    }
                    com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)j1.next();
                    int l = ((Integer)hashtable.get(Long.valueOf(k1.U()))).intValue();
                    int i1 = k1.W();
                    if (l != i1)
                    {
                        com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(c.a).a(new ChangeZIndexOp(k1.U(), l, i1));
                    }
                } while (true);
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.k(c.a).d();
                PhotoProtoActivity.l(c.a);
                a.setText(PhotoProtoActivity.x(c.a));
                b.setImageDrawable(PhotoProtoActivity.y(c.a));
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

                    
                    {
                        c = PhotoProtoActivity._cls28.this;
                        a = textview;
                        b = imageview;
                        super();
                    }
        }

    }

}
