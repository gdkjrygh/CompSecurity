// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.social.notifications.service.GunsService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class nse
{

    private static final String b = ntn.a("SystemNotManager");
    private static final onh c = new onh("debug.nots.new_image_processor", false);
    final nte a = new nte();

    nse()
    {
    }

    static int a(Context context, int i, nqs nqs1)
    {
        int j = nrd.b;
        int k;
        if (i != -1)
        {
            context = olm.c(context, nrc).iterator();
            do
            {
                k = j;
                if (!context.hasNext())
                {
                    break;
                }
                if (((nrc)context.next()).a(i, nqs1) != nrd.b)
                {
                    j = nrd.a;
                }
            } while (true);
        } else
        {
            k = j;
        }
        return k;
    }

    private static Notification a(Context context, int i, nra nra1, oyn oyn1, int j)
    {
        String s1 = ((mmv)olm.a(context, mmv)).a(i).b("account_name");
        String s;
        cn cn1;
        if (oyn1 != null && !TextUtils.isEmpty(oyn1.a))
        {
            s = oyn1.a;
        } else
        {
            s = context.getString(nra1.b().intValue());
        }
        if (oyn1 != null && !TextUtils.isEmpty(oyn1.b))
        {
            oyn1 = oyn1.b;
        } else
        if (j == 1)
        {
            oyn1 = context.getString(b.GR, new Object[] {
                Integer.valueOf(j)
            });
        } else
        {
            oyn1 = context.getString(b.GP, new Object[] {
                Integer.valueOf(j)
            });
        }
        cn1 = new cn(context);
        cn1.a(s);
        cn1.b(oyn1);
        cn1.c(s1);
        cn1.a(nra1.a().intValue());
        if (nra1.c() != null)
        {
            cn1.s = context.getResources().getColor(nra1.c().intValue());
        }
        return cn1.a();
    }

    private static transient PendingIntent a(Context context, int i, boolean flag, String as[])
    {
        String s;
        Intent intent;
        String s1;
        if (flag)
        {
            s = "summary";
        } else
        {
            s = as[0];
        }
        intent = new Intent(context, com/google/android/libraries/social/notifications/service/GunsService);
        s1 = String.valueOf("http://notifications.google.com/");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        intent.setData(Uri.parse(s));
        intent.setAction("com.google.android.libraries.social.notifications.impl.NOTIFICATION_SELECTED");
        intent.putExtra("notification_event_type", nqq.b);
        intent.putExtra("notification_keys", as);
        intent.putExtra("account_id", i);
        intent.putExtra("from_system_tray", true);
        return PendingIntent.getService(context, i, intent, 0x10000000);
    }

    private static Bitmap a(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        Resources resources = context.getResources();
        context = (Bitmap)(new njo((njn)olm.a(context, njn), null, njr.a(context, s, njx.a), 0, (int)resources.getDimension(b.GM), (int)resources.getDimension(b.GL), 0)).a();
        return context;
        context;
        ntn.b(b, "Bitmap Download Failed", context);
        return null;
        context;
        ntn.b(b, "Bitmap Download Canceled", context);
        return null;
        context;
        ntn.b(b, "Bitmap Download OutOfMemoryError", context);
        return null;
    }

    private static Bitmap a(Context context, String s, int i)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        String s1 = s;
        if (s.startsWith("//"))
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "https:".concat(s);
            } else
            {
                s = new String("https:");
            }
            s1 = s;
        }
        context = (Bitmap)((mug)olm.a(context, mug)).a(s1, 2, i);
        return context;
        context;
        ntn.b(b, "Avatar Download Failed", context);
_L2:
        return null;
        context;
        ntn.b(b, "Avatar Download Canceled", context);
        continue; /* Loop/switch isn't completed */
        context;
        ntn.b(b, "Avatar Download OutOfMemoryError", context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private Bitmap a(Context context, ozd ozd1, boolean flag)
    {
        if (ozd1 == null)
        {
            return null;
        }
        if (ozd1.b.length <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new ArrayList();
        ozb aozb[] = ozd1.b;
        int k = aozb.length;
        for (int i = 0; i < k; i++)
        {
            Bitmap bitmap1 = a(context, aozb[i].a, 0);
            if (bitmap1 != null)
            {
                ((ArrayList) (obj)).add(bitmap1);
            }
        }

        if (((ArrayList) (obj)).isEmpty()) goto _L2; else goto _L3
_L3:
        Bitmap bitmap;
        int j;
        j = b.l(context);
        if (flag)
        {
            bitmap = Bitmap.createBitmap(j, j, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            b.a(canvas, ((List) (obj)), j, null, null);
            oiq.a(canvas);
        } else
        if (((List) (obj)).isEmpty())
        {
            bitmap = null;
        } else
        if (((List) (obj)).size() == 1)
        {
            bitmap = (Bitmap)((List) (obj)).get(0);
        } else
        {
            bitmap = Bitmap.createBitmap(j, j, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas1 = new Canvas(bitmap);
            Paint paint = new Paint();
            paint.setColor(0xff000000);
            paint.setStrokeWidth(2.0F);
            b.a(canvas1, ((List) (obj)), j, paint, paint);
        }
_L5:
        obj = bitmap;
        if (bitmap == null)
        {
            obj = bitmap;
            if (ozd1.a != null)
            {
                ozd1 = ozd1.a.a;
                if (flag)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                obj = a(context, ((String) (ozd1)), j);
            }
        }
        return ((Bitmap) (obj));
_L2:
        bitmap = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static nqs a(nsx nsx1)
    {
        nqt nqt1 = new nqt();
        nqt1.a = nsx1.a();
        nqt1.b = nsx1.k();
        nqt1.c = nsx1.i();
        nqt1.d = nsx1.j();
        return nqt1.a();
    }

    static transient void a(Context context, int i, cn cn1, int j, nqs anqs[])
    {
        if (i != -1)
        {
            for (context = olm.c(context, nrc).iterator(); context.hasNext(); ((nrc)context.next()).a(i, cn1)) { }
        }
    }

    private void a(Context context, String s, cn cn1, Collection collection)
    {
        boolean flag;
        if (context.getPackageManager().checkPermission("android.permission.READ_CONTACTS", context.getPackageName()) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            context = (mfm)olm.b(context, mfm);
            if (context != null)
            {
                collection = collection.iterator();
                do
                {
                    if (!collection.hasNext())
                    {
                        break;
                    }
                    Object obj = (ozb)collection.next();
                    if (!TextUtils.isEmpty(((ozb) (obj)).b))
                    {
                        obj = context.a(s, ((ozb) (obj)).b);
                        if (obj != null)
                        {
                            obj = ((Uri) (obj)).toString();
                            cn1.w.add(obj);
                        }
                    }
                } while (true);
            }
        }
    }

    private static void a(cn cn1, String s)
    {
        if (s != null)
        {
            cn1.r = s;
        }
    }

    private static void a(cn cn1, nra nra1, boolean flag)
    {
        boolean flag1 = true;
        int i;
        if (flag)
        {
            int j;
            int k;
            if (nra1.e())
            {
                if (nra1.d() != null)
                {
                    cn1.a(nra1.d());
                    j = 0;
                } else
                {
                    j = 1;
                }
            } else
            {
                j = 0;
            }
            i = j;
            if (nra1.f())
            {
                i = j | 2;
            }
        } else
        {
            i = 0;
        }
        if (nra1.g() != null)
        {
            j = nra1.g().intValue();
            cn1.v.ledARGB = j;
            cn1.v.ledOnMS = 1000;
            cn1.v.ledOffMS = 9000;
            if (cn1.v.ledOnMS != 0 && cn1.v.ledOffMS != 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            nra1 = cn1.v;
            k = cn1.v.flags;
            if (j != 0)
            {
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = 0;
            }
            nra1.flags = k & -2 | j;
        } else
        {
            i |= 4;
        }
        cn1.b(i);
    }

    private static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    private static boolean a(Context context, ozd ozd1, cp cp1)
    {
        if (ozd1 != null)
        {
            boolean flag;
            boolean flag1;
            if (!TextUtils.isEmpty(ozd1.c))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!TextUtils.isEmpty(ozd1.d))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag || flag1)
            {
                if (flag && flag1)
                {
                    cp1.a(context.getString(b.GN, new Object[] {
                        ozd1.c, ozd1.d
                    }));
                } else
                {
                    if (flag)
                    {
                        context = ozd1.c;
                    } else
                    {
                        context = ozd1.d;
                    }
                    cp1.a(context);
                }
                return true;
            }
        }
        return false;
    }

    static boolean a(nqu nqu1)
    {
        switch (nsf.a[nqu1.ordinal()])
        {
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return true;
        }
    }

    private static transient PendingIntent b(Context context, int i, boolean flag, String as[])
    {
        String s;
        Intent intent;
        String s1;
        if (flag)
        {
            s = "summary";
        } else
        {
            s = as[0];
        }
        intent = new Intent(context, com/google/android/libraries/social/notifications/service/GunsService);
        s1 = String.valueOf("http://notifications.google.com/");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        intent.setData(Uri.parse(s));
        intent.setAction("com.google.android.libraries.social.notifications.impl.SYSTEM_NOTIFICATION_DISMISSED");
        intent.putExtra("notification_event_type", nqq.c);
        intent.putExtra("view_id", "AST");
        intent.putExtra("notification_keys", as);
        intent.putExtra("account_id", i);
        return PendingIntent.getService(context, i, intent, 0x10000000);
    }

    cn a(Context context, int i, nsx nsx1, nra nra1, cy cy, boolean flag, Bitmap bitmap)
    {
        String s = ((mmv)olm.a(context, mmv)).a(i).b("account_name");
        ozd ozd1 = nsx1.d();
        if (ozd1 == null || TextUtils.isEmpty(ozd1.c) && TextUtils.isEmpty(ozd1.d))
        {
            return null;
        }
        cn cn1 = new cn(context);
        cn1.a(ozd1.c);
        cn1.b(ozd1.d);
        cn1.c(s);
        cn1.a(nra1.a().intValue());
        cn1.e(ozd1.c);
        cn1.g = nsx1.g();
        if (nra1.c() != null)
        {
            cn1.s = context.getResources().getColor(nra1.c().intValue());
        }
        if (nsx1.h().longValue() > 0L)
        {
            cn1.a(nsx1.h().longValue());
        }
        if (bitmap != null)
        {
            cn1.e = bitmap;
        }
        if (cy != null)
        {
            cn1.a(cy);
        }
        if (a())
        {
            a(cn1, nsx1.l());
            a(context, s, cn1, ((Collection) (Arrays.asList(ozd1.b))));
        }
        if (flag)
        {
            if (nsx1.c() == 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(cn1, nra1, flag);
        }
        return cn1;
    }

    cy a(Context context, String s, oyv oyv1)
    {
        if (oyv1 != null && oyv1.a != null)
        {
            oyv1 = oyv1.a.b;
            if (oyv1.length > 0 && ((oza) (oyv1[0])).a != null)
            {
                context = a(context, ((oza) (oyv1[0])).a.a);
                if (context != null)
                {
                    oyv1 = new cl();
                    oyv1.a = context;
                    return oyv1.a(s);
                }
            }
        }
        return null;
    }

    Set a(Context context, int i, nsx nsx1, nsx nsx2, HashMap hashmap, nra nra1)
    {
        dh dh1 = dh.a(context);
        if (hashmap.isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj5;
        obj5 = hashmap.keySet();
        nsx1.moveToFirst();
        if (((Set) (obj5)).size() != 1) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj3;
        Object obj4;
        if (!((Set) (obj5)).contains(nsx1.a()))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj3 = nsx1.d();
        obj4 = nsx1.e();
        obj = null;
        if (obj4 == null) goto _L6; else goto _L5
_L5:
        if (((oyv) (obj4)).b.length > 1) goto _L8; else goto _L7
_L7:
        Object obj2;
        obj2 = a(context, ((ozd) (obj3)).c, ((oyv) (obj4)));
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_1574;
        }
        if (obj4 == null || ((oyv) (obj4)).b.length != 1) goto _L10; else goto _L9
_L9:
        obj = ((oyv) (obj4)).b[0].a;
        if (obj == null) goto _L10; else goto _L11
_L11:
        Object obj1;
        int l;
        int j;
        if (!TextUtils.isEmpty(((ozd) (obj)).c))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!TextUtils.isEmpty(((ozd) (obj)).d))
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (j == 0 && l == 0) goto _L10; else goto _L12
_L12:
        if (j != 0 && l != 0)
        {
            obj = context.getString(b.GN, new Object[] {
                ((ozd) (obj)).c, ((ozd) (obj)).d
            });
        } else
        if (l != 0)
        {
            obj = ((ozd) (obj)).d;
        } else
        {
            obj = ((ozd) (obj)).c;
        }
        obj1 = obj;
        if (((oyv) (obj4)).a != null)
        {
            obj1 = obj;
            if (!TextUtils.isEmpty(((oyv) (obj4)).a.a))
            {
                obj1 = String.valueOf(((oyv) (obj4)).a.a);
                obj1 = (new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(obj1).length())).append(((String) (obj))).append("\n\n").append(((String) (obj1))).toString();
            }
        }
_L13:
        int i1;
        int j1;
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            obj = (new cm()).a(((CharSequence) (obj1)));
        } else
        {
            obj = obj2;
        }
_L6:
        obj1 = a(context, i, nsx1, nra1, ((cy) (obj)), true, a(context, ((ozd) (obj3)), a()));
        if (nsx1.m())
        {
            obj1.t = 1;
        } else
        {
            obj = nsx1.n();
            if (obj != null)
            {
                obj = ((oym) (obj)).d;
            } else
            {
                obj = null;
            }
            obj1.u = a(context, i, nra1, ((oyn) (obj)), 1);
        }
        a(context, i, ((cn) (obj1)), nre.a, new nqs[] {
            a(nsx1)
        });
        nsx1 = ((nsx) (obj1));
_L15:
        if (nsx1 != null)
        {
            nra1 = (String[])hashmap.keySet().toArray(new String[hashmap.size()]);
            nsx1.d = a(context, i, true, ((String []) (nra1)));
            nsx1.a(b(context, i, true, nra1));
            nsx1.n = "gns_notifications_group";
            nsx1.o = true;
            dh1.a("summary", i, nsx1.a());
            l = nra1.length;
            ozb aozb[];
            HashMap hashmap1;
            ozb ozb1;
            int k;
            int k1;
            int l1;
            long l2;
            long l3;
            long l4;
            boolean flag;
            for (j = 0; j < l; j++)
            {
                nsx1 = nra1[j];
                obj = (cn)hashmap.get(nsx1);
                if (obj != null)
                {
                    obj.d = a(context, i, false, new String[] {
                        nsx1
                    });
                    ((cn) (obj)).a(b(context, i, false, new String[] {
                        nsx1
                    }));
                    obj.n = "gns_notifications_group";
                    obj.o = false;
                    dh1.a(nsx1, i, ((cn) (obj)).a());
                }
            }

            if (nsx2.moveToFirst())
            {
                do
                {
                    context = nsx2.a();
                    if (!hashmap.containsKey(context))
                    {
                        dh1.a(context, i);
                    }
                } while (nsx2.moveToNext());
            }
            return hashmap.keySet();
        }
          goto _L2
_L10:
        if (!TextUtils.isEmpty(((ozd) (obj3)).d))
        {
            obj1 = ((ozd) (obj3)).d;
        } else
        {
            obj1 = null;
        }
          goto _L13
_L8:
        obj = new cp();
        if (!TextUtils.isEmpty(((ozd) (obj3)).d))
        {
            ((cp) (obj)).a(((ozd) (obj3)).d);
            ((cp) (obj)).a(" ");
        }
        obj1 = ((oyv) (obj4)).b;
        j1 = obj1.length;
        l = 0;
        for (k = 0; k < j1;)
        {
            i1 = l;
            if (a(context, ((oyp) (obj1[k])).a, ((cp) (obj))))
            {
                i1 = l + 1;
            }
            k++;
            l = i1;
        }

        if (l <= 1)
        {
            obj = (new cm()).a(((ozd) (obj3)).d);
        }
          goto _L6
        if (nsx1.moveToNext()) goto _L3; else goto _L14
_L14:
        nsx1 = null;
          goto _L15
_L4:
        obj2 = new HashMap();
        hashmap1 = new HashMap();
        obj3 = new ArrayList();
        obj = null;
        k = -2;
        flag = false;
        obj4 = new cp();
        l2 = System.currentTimeMillis();
        l = 0;
        j1 = 1;
_L18:
        if (((Set) (obj5)).contains(nsx1.a()))
        {
            obj1 = nsx1.d();
            i1 = l;
            if (obj1 != null)
            {
                k1 = l;
                if (a(context, ((ozd) (obj1)), ((cp) (obj4))))
                {
                    k1 = l + 1;
                }
                aozb = ((ozd) (obj1)).b;
                l1 = aozb.length;
                l = 0;
                do
                {
                    i1 = k1;
                    if (l >= l1)
                    {
                        break;
                    }
                    ozb1 = aozb[l];
                    ((HashMap) (obj2)).put(ozb1.b, ozb1);
                    l++;
                } while (true);
            }
            l4 = nsx1.h().longValue();
            l3 = l2;
            if (l4 != 0L)
            {
                l3 = l2;
                if (l4 < l2)
                {
                    l3 = l4;
                }
            }
            if (nsx1.c() == 0L)
            {
                flag = true;
            }
            k1 = nsx1.g();
            l = k;
            if (k1 > k)
            {
                l = k1;
            }
            if (j1 != 0 && nsx1.m())
            {
                k = 1;
            } else
            {
                k = 0;
            }
            aozb = nsx1.l();
            if (aozb != null)
            {
                if (hashmap1.containsKey(aozb))
                {
                    j1 = ((Integer)hashmap1.get(aozb)).intValue() + 1;
                } else
                {
                    j1 = 1;
                }
                hashmap1.put(aozb, Integer.valueOf(j1));
                if (obj == null || j1 > ((Integer)hashmap1.get(obj)).intValue())
                {
                    obj = aozb;
                }
            }
            ((ArrayList) (obj3)).add(a(nsx1));
            j1 = k;
            l2 = l3;
            k = l;
            l = i1;
            i1 = j1;
        } else
        {
            i1 = j1;
        }
        if (nsx1.moveToNext()) goto _L17; else goto _L16
_L16:
        if (l == 0)
        {
            nsx1 = null;
        } else
        {
            aozb = ((mmv)olm.a(context, mmv)).a(i).b("account_name");
            nsx1 = new cn(context);
            obj5 = context.getString(nra1.b().intValue());
            nsx1.a(((CharSequence) (obj5)));
            nsx1.b(context.getString(b.GP, new Object[] {
                Integer.valueOf(l)
            }));
            nsx1.c(aozb);
            nsx1.d(context.getString(b.GQ, new Object[] {
                Integer.valueOf(l)
            }));
            nsx1.a(nra1.a().intValue());
            nsx1.a(((cy) (obj4)));
            nsx1.e(context.getString(b.GO, new Object[] {
                Integer.valueOf(l), obj5
            }));
            nsx1.a(l2);
            nsx1.g = k;
            if (i1 != 0)
            {
                nsx1.t = 1;
            } else
            {
                nsx1.u = a(context, i, nra1, ((oyn) (null)), l);
            }
            if (nra1.c() != null)
            {
                nsx1.s = context.getResources().getColor(nra1.c().intValue());
            }
            if (a())
            {
                a(((cn) (nsx1)), ((String) (obj)));
                a(context, ((String) (aozb)), ((cn) (nsx1)), ((HashMap) (obj2)).values());
            }
            a(((cn) (nsx1)), nra1, flag);
            nra1 = (nqs[])((ArrayList) (obj3)).toArray(new nqs[((ArrayList) (obj3)).size()]);
            a(context, i, ((cn) (nsx1)), nre.a, ((nqs []) (nra1)));
        }
          goto _L15
_L2:
        dh1.a("summary", i);
        return Collections.emptySet();
_L17:
        j1 = i1;
          goto _L18
        obj = obj2;
          goto _L6
    }

    public final void a(Context context, int i)
    {
        dh dh1;
        dh1 = dh.a(context);
        dh1.a("summary", i);
        context = b.a(context, i, "system_tray_version > 0", null);
        boolean flag;
        if (context.moveToFirst())
        {
            do
            {
                dh1.a(context.a(), i);
                flag = context.moveToNext();
            } while (flag);
        }
        context.close();
        return;
        Exception exception;
        exception;
        context.close();
        throw exception;
    }

}
