// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class ite
{

    private static final Typeface a = Typeface.create("sans-serif", 0);
    private static final Typeface b = Typeface.create("sans-serif-medium", 0);
    private static final Typeface c = Typeface.create("sans-serif", 1);
    private static final Typeface d = Typeface.create("sans-serif-light", 0);
    private static final String e[] = {
        "data", "refresh_timestamp"
    };

    public static float a(pfp pfp1)
    {
        float f2 = 0.0F;
        float f1 = f2;
        if (pfp1.b != null)
        {
            f1 = f2;
            if (pfp1.b.a != null)
            {
                f1 = b.a(pfp1.b.a.a, 0.0F);
            }
        }
        return f1;
    }

    public static int a(pev pev1)
    {
        pev1 = pev1.e;
        int j1 = pev1.length;
        int i = 0;
        int k = 0;
        for (; i < j1; i++)
        {
            peu apeu[] = ((pef) (pev1[i])).a;
            int k1 = apeu.length;
            for (int j = 0; j < k1; j++)
            {
                peq apeq[] = apeu[j].a;
                int l1 = apeq.length;
                for (int l = 0; l < l1;)
                {
                    peq peq1 = apeq[l];
                    int i1 = k;
                    if (b(peq1))
                    {
                        i1 = k;
                        if (peq1.b == 1)
                        {
                            i1 = k;
                            if (!b.a(peq1.f, false))
                            {
                                i1 = k + 1;
                            }
                        }
                    }
                    l++;
                    k = i1;
                }

            }

        }

        return k;
    }

    public static Point a(Context context)
    {
        float f1 = context.getResources().getDisplayMetrics().density;
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            context.getRealSize(point);
        } else
        {
            context.getSize(point);
        }
        if (f1 == 0.0F)
        {
            f1 = 1.0F;
        }
        return new Point((int)((float)point.x / f1 + 0.5F), (int)((float)point.y / f1 + 0.5F));
    }

    public static RectF a(pgb pgb1)
    {
        Object obj = null;
        Float float1;
        RectF rectf;
        boolean flag;
        if (pgb1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        rectf = new RectF();
        if (flag)
        {
            float1 = pgb1.a;
        } else
        {
            float1 = null;
        }
        rectf.left = b.a(float1, 0.0F);
        if (flag)
        {
            float1 = pgb1.c;
        } else
        {
            float1 = null;
        }
        rectf.top = b.a(float1, 0.0F);
        if (flag)
        {
            float1 = pgb1.b;
        } else
        {
            float1 = null;
        }
        rectf.right = b.a(float1, 1.0F);
        float1 = obj;
        if (flag)
        {
            float1 = pgb1.d;
        }
        rectf.bottom = b.a(float1, 1.0F);
        return rectf;
    }

    public static gap a(qgg qgg1, iui iui1, int i)
    {
        if (qgg1 == null)
        {
            return null;
        }
        if (iui1 != null && iui1.a(qgg1.b.a) != null)
        {
            return ((elt)iui1.a(qgg1.b.a).a(elt)).e();
        } else
        {
            return new gat(b(qgg1).a, i);
        }
    }

    public static String a(peq peq1)
    {
        if (peq1.d != null && peq1.d.c != null)
        {
            return peq1.d.c.c;
        } else
        {
            return null;
        }
    }

    public static String a(qgg qgg1, iui iui1)
    {
        if (qgg1 == null)
        {
            return null;
        }
        if (iui1 != null && iui1.a(qgg1.b.a) != null)
        {
            iui1 = iui1.a(qgg1.b.a);
            if (iui1.a(elt) != null)
            {
                iui1 = ((elt)iui1.a(elt)).e().b();
                if (iui1 != null)
                {
                    return iui1.toString();
                }
            }
        }
        return b(qgg1).a;
    }

    public static njx a(qgg qgg1)
    {
        if (qgg1.d != null && qgg1.d.a == 2)
        {
            return njx.b;
        }
        int i;
        if (qgg1.e != null)
        {
            i = qgg1.e.a;
        } else
        {
            i = -1;
        }
        if (qgg1.d != null && qgg1.d.b != null && qgg1.d.b.a != null && qgg1.d.b.a.d != null && qgg1.d.b.a.d.c != null || i == 1 || i == 8 || i == 9 || i == 12)
        {
            return njx.d;
        }
        if (i == 5)
        {
            return njx.c;
        } else
        {
            return njx.a;
        }
    }

    public static pev a(Context context, int i, iuj iuj1)
    {
        Object obj;
        obj = null;
        context = mvj.b(context, i);
        if (context == null)
        {
            Log.w("StoryUtils", "Cannot get story; cannot get database");
            return null;
        }
        iuj1 = context.query("stories", e, "story_key=?", new String[] {
            iuj1.a()
        }, null, null, null);
        context = obj;
        if (!iuj1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        context = obj;
        if (!iuj1.isNull(0))
        {
            context = (pev)qlw.a(new pev(), iuj1.getBlob(0));
        }
        iuj1.close();
        return context;
        context;
        Log.e("StoryUtils", "Unable to deserialize story", context);
        iuj1.close();
        return null;
        context;
        iuj1.close();
        throw context;
    }

    public static qlw a(pev pev1, pex pex1, Class class1)
    {
        pef pef1;
        peu peu1;
        if (pev1 == null || pex1 == null)
        {
            return null;
        }
        if (pex1.b != null && pex1.b.intValue() < pev1.e.length)
        {
            pef1 = pev1.e[pex1.b.intValue()];
        } else
        {
            pef1 = null;
        }
        if (pef1 != null && pex1.c != null && pex1.c.intValue() < pef1.a.length)
        {
            peu1 = pef1.a[pex1.c.intValue()];
        } else
        {
            peu1 = null;
        }
        pex1.a;
        JVM INSTR tableswitch 1 6: default 128
    //                   1 185
    //                   2 205
    //                   3 393
    //                   4 226
    //                   5 161
    //                   6 141;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return null;
_L7:
        if (pev.equals(class1))
        {
            return (qlw)class1.cast(pev1);
        } else
        {
            return null;
        }
_L6:
        if (pgt.equals(class1))
        {
            return (qlw)class1.cast(pev1.c);
        } else
        {
            return null;
        }
_L2:
        if (pef.equals(class1))
        {
            return (qlw)class1.cast(pef1);
        } else
        {
            return null;
        }
_L3:
        if (peu.equals(class1))
        {
            return (qlw)class1.cast(peu1);
        } else
        {
            return null;
        }
_L5:
        if (peu1 == null)
        {
            return null;
        }
        pev1 = peu1.b;
        int k = pev1.length;
        int i = 0;
        while (i < k) 
        {
            Object obj = pev1[i];
            pei pei1 = ((peh) (obj)).b;
            pei pei2 = pex1.e;
            boolean flag;
            if (pei1 == null || pei2 == null)
            {
                if (pei1 == pei2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            if (pei1.a == null || pei2.a == null)
            {
                if (pei1.a == null && pei2.a == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = pei1.a.equals(pei2.a);
            }
            if (flag)
            {
                if (peh.equals(class1))
                {
                    return (qlw)class1.cast(obj);
                } else
                {
                    return null;
                }
            }
            i++;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        pev1 = pev1.e;
        int j1 = pev1.length;
        int j = 0;
        while (j < j1) 
        {
            peu apeu[] = ((pef) (pev1[j])).a;
            int k1 = apeu.length;
            for (int l = 0; l < k1; l++)
            {
                peq apeq[] = apeu[l].a;
                int l1 = apeq.length;
                for (int i1 = 0; i1 < l1; i1++)
                {
                    peq peq1 = apeq[i1];
                    if (a(peq1.a, pex1.d))
                    {
                        if (peq.equals(class1))
                        {
                            return (qlw)class1.cast(peq1);
                        } else
                        {
                            return null;
                        }
                    }
                }

            }

            j++;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public static void a(pev pev1, String s)
    {
        pev1.a.b = s;
    }

    private static void a(qlw qlw1, qlw qlw2)
    {
        Field afield[];
        int j;
        afield = qlw2.getClass().getFields();
        j = afield.length;
        int i = 0;
_L2:
        Field field;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        field = afield[i];
        Field field1 = qlw1.getClass().getField(field.getName());
        if (field.getType() == Integer.TYPE)
        {
            if (field.getInt(qlw2) != 0x80000000)
            {
                field1.setInt(qlw1, field.getInt(qlw2));
            }
            break MISSING_BLOCK_LABEL_223;
        }
        try
        {
            if (field.getType().isArray() && ((Object[])field.get(qlw2)).length > 0 || !field.getType().isArray() && field.get(qlw2) != null)
            {
                field1.set(qlw1, field.get(qlw2));
            }
            break MISSING_BLOCK_LABEL_223;
        }
        // Misplaced declaration of an exception variable
        catch (qlw qlw1)
        {
            qlw1 = String.valueOf(qlw1.getMessage());
            if (qlw1.length() != 0)
            {
                qlw1 = "IllegalAccessException while merging protos in StoryUtils: ".concat(qlw1);
            } else
            {
                qlw1 = new String("IllegalAccessException while merging protos in StoryUtils: ");
            }
            Log.e("StoryUtils", qlw1);
        }
        // Misplaced declaration of an exception variable
        catch (qlw qlw1)
        {
            qlw1 = String.valueOf(qlw1.getMessage());
            if (qlw1.length() != 0)
            {
                qlw1 = "NoSuchFieldException while merging protos in StoryUtils: ".concat(qlw1);
            } else
            {
                qlw1 = new String("NoSuchFieldException while merging protos in StoryUtils: ");
            }
            Log.e("StoryUtils", qlw1);
            return;
        }
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a(Context context, int i, pev pev1, pew apew[])
    {
        Object obj;
        int j;
        obj = iun.a(context, i, iuj.a(pev1.a));
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((iuh) (obj)).a;
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        Log.w("StoryUtils", "Couldn't apply edits; story is null");
        j = 0;
_L25:
        int k;
        if (j != 0)
        {
            pet apet[];
            HashMap hashmap;
            pes pes1;
            pef apef[];
            Object obj1;
            peu apeu[];
            peu peu1;
            peh apeh[];
            peq apeq[];
            Object obj2;
            Object obj3;
            int l;
            int i1;
            int j1;
            int k1;
            try
            {
                iun.a(context, i, ((pev) (obj)), false);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("StoryUtils", "Failed to insertStory", context);
            }
            return true;
        } else
        {
            return false;
        }
_L2:
        obj.f = pev1.f;
        ((pev) (obj)).a.c = pev1.a.c;
        i1 = apew.length;
        j = 0;
_L9:
        if (j >= i1) goto _L4; else goto _L3
_L3:
        obj1 = apew[j];
        ((pew) (obj1)).a;
        JVM INSTR lookupswitch 5: default 164
    //                   1: 213
    //                   2: 213
    //                   5: 200
    //                   9: 222
    //                   14: 213;
           goto _L5 _L6 _L6 _L7 _L8 _L6
_L6:
        break MISSING_BLOCK_LABEL_213;
_L5:
        i = ((pew) (obj1)).a;
        throw new RuntimeException((new StringBuilder(51)).append("Unable to apply unrecognised edit type: ").append(i).toString());
_L7:
        ((pev) (obj)).c.a = ((pew) (obj1)).b;
_L16:
        j++;
          goto _L9
_L8:
        pes1 = ((peq)a(((pev) (obj)), ((pew) (obj1)).d, peq)).e;
        apet = (peq)a(pev1, ((pew) (obj1)).d, peq);
        if (apet == null)
        {
            apet = null;
        } else
        {
            apet = ((peq) (apet)).e;
        }
        if (apet != null && ((pes) (apet)).a != null)
        {
            apet = ((pes) (apet)).a;
        } else
        {
            apet = ((pew) (obj1)).c;
        }
        obj1 = pes1.b;
        k = 0;
_L15:
        if (k >= obj1.length) goto _L11; else goto _L10
_L10:
        if (!b.a(obj1[k], apet)) goto _L13; else goto _L12
_L12:
        k = 0;
          goto _L14
_L13:
        k++;
          goto _L15
_L14:
        if (k != 0)
        {
            pes1.b = new pet[obj1.length + 1];
            pes1.b[0] = pes1.a;
            for (k = 0; k < obj1.length; k++)
            {
                pes1.b[k + 1] = obj1[k];
            }

            pes1.a = apet;
        } else
        {
            pes1.b = new pet[obj1.length];
            pes1.b[0] = pes1.a;
            k = 0;
            l = 1;
            while (k < obj1.length) 
            {
                if (b.a(obj1[k], apet))
                {
                    pes1.a = obj1[k];
                } else
                if (l < obj1.length)
                {
                    pes1.b[l] = obj1[k];
                    l++;
                } else
                {
                    Log.e("StoryUtils", "Server side logic error when rearranging the place locations");
                }
                k++;
            }
        }
        if (pes1.b != null && pes1.b.length > 9)
        {
            apet = new pet[9];
            for (k = 0; k < 9; k++)
            {
                apet[k] = pes1.b[k];
            }

            pes1.b = apet;
        }
          goto _L16
_L4:
        obj.c = pev1.c;
        apew = new HashMap();
        hashmap = new HashMap();
        apef = ((pev) (obj)).e;
        i1 = apef.length;
        for (j = 0; j < i1; j++)
        {
            apeu = apef[j].a;
            j1 = apeu.length;
            for (k = 0; k < j1; k++)
            {
                peu1 = apeu[k];
                apeq = peu1.a;
                k1 = apeq.length;
                for (l = 0; l < k1; l++)
                {
                    obj3 = apeq[l];
                    if (((peq) (obj3)).a != null)
                    {
                        hashmap.put(((peq) (obj3)).a.a, obj3);
                    }
                }

                apeh = peu1.b;
                k1 = apeh.length;
                for (l = 0; l < k1; l++)
                {
                    obj2 = apeh[l];
                    if (((peh) (obj2)).b != null)
                    {
                        apew.put(((peh) (obj2)).b.a, obj2);
                    }
                }

            }

        }

        obj.e = pev1.e;
        apef = ((pev) (obj)).e;
        i1 = apef.length;
        j = 0;
_L37:
        if (j >= i1) goto _L18; else goto _L17
_L17:
        apeu = apef[j].a;
        j1 = apeu.length;
        k = 0;
_L36:
        if (k >= j1) goto _L20; else goto _L19
_L19:
        apeh = apeu[k];
        l = 0;
_L28:
        if (l >= ((peu) (apeh)).a.length) goto _L22; else goto _L21
_L21:
        obj2 = ((peu) (apeh)).a[l];
        if (((peq) (obj2)).a != null) goto _L24; else goto _L23
_L23:
        Log.w("StoryUtils", "Couldn't apply edits; momentref is null");
        j = 0;
          goto _L25
_L24:
        obj3 = (peq)hashmap.get(((peq) (obj2)).a.a);
        if (obj3 != null) goto _L27; else goto _L26
_L26:
        Log.w("StoryUtils", "Couldn't apply edits; couldn't find old moment");
        j = 0;
          goto _L25
_L27:
        if (((peq) (obj3)).b != 2)
        {
            a(((qlw) (obj3)), ((qlw) (obj2)));
        }
        ((peu) (apeh)).a[l] = ((peq) (obj3));
        l++;
          goto _L28
_L22:
        l = 0;
_L35:
        if (l >= ((peu) (apeh)).b.length) goto _L30; else goto _L29
_L29:
        obj2 = ((peu) (apeh)).b[l];
        if (((peh) (obj2)).b != null) goto _L32; else goto _L31
_L31:
        Log.w("StoryUtils", "Couldn't apply edits; enrichmentref is null");
        j = 0;
          goto _L25
_L32:
        obj3 = (peh)apew.get(((peh) (obj2)).b.a);
        if (obj3 != null) goto _L34; else goto _L33
_L33:
        Log.w("StoryUtils", "Couldn't apply edits; couldn't find old enrichment");
        j = 0;
          goto _L25
_L34:
        a(((qlw) (obj3)), ((qlw) (obj2)));
        ((peu) (apeh)).b[l] = ((peh) (obj3));
        l++;
          goto _L35
_L30:
        k++;
          goto _L36
_L20:
        j++;
          goto _L37
_L18:
        if (pev1.h.length > 0)
        {
            obj.h = pev1.h;
        }
        if (((pev) (obj)).g != null)
        {
            if (pev1.g == null || ((pev) (obj)).g.a != null && !((pev) (obj)).g.a.equals(pev1.g.a))
            {
                ((pev) (obj)).g.b = null;
            }
            if (pev1.g == null || pev1.g.c == null || pev1.g != null && pev1.g.a != null)
            {
                ((pev) (obj)).g.c = null;
            }
            if (pev1.g != null && pev1.g.c != null)
            {
                ((pev) (obj)).g.c = pev1.g.c;
                ((pev) (obj)).g.b = null;
            }
        }
        j = 1;
          goto _L25
_L11:
        k = 1;
          goto _L14
    }

    public static boolean a(peh peh1)
    {
        boolean flag1 = true;
        if (peh1 != null && peh1.b != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        if (peh1.a != 2 || peh1.c == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (peh1.c.b != null) goto _L4; else goto _L3
_L3:
        if (peh1.a != 3 || peh1.d == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (peh1.d.a != null) goto _L4; else goto _L5
_L5:
        return false;
    }

    public static boolean a(per per1, per per2)
    {
        if (per1 != null && per2 != null) goto _L2; else goto _L1
_L1:
        if (per1 != per2) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (per1.a == null || per2.a == null)
        {
            if (per1.a != null || per2.a != null)
            {
                return false;
            }
        } else
        {
            return per1.a.equals(per2.a);
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static Point[] a(Point point)
    {
        if (point == null)
        {
            return new Point[0];
        } else
        {
            return (new Point[] {
                point, new Point(point.y, point.x)
            });
        }
    }

    public static msx[] a(pfk apfk[])
    {
        if (apfk == null)
        {
            return new msx[0];
        }
        msx amsx[] = new msx[apfk.length];
        int i = 0;
        while (i < apfk.length) 
        {
            pfk pfk1 = apfk[i];
            Object obj;
            if (pfk1 == null)
            {
                obj = new msx();
            } else
            {
                msx msx1;
                boolean flag;
                boolean flag1;
                boolean flag2;
                boolean flag3;
                if (pfk1.a != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (pfk1.b != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (pfk1.c != null)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (pfk1.d != null)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                msx1 = new msx();
                if (flag)
                {
                    obj = pfk1.a.a;
                } else
                {
                    obj = null;
                }
                msx1.a = b.a(((Float) (obj)), 0.0F);
                if (flag)
                {
                    obj = pfk1.a.b;
                } else
                {
                    obj = null;
                }
                msx1.b = b.a(((Float) (obj)), 0.0F);
                if (flag1)
                {
                    obj = pfk1.b.a;
                } else
                {
                    obj = null;
                }
                msx1.c = b.a(((Float) (obj)), 0.0F);
                if (flag1)
                {
                    obj = pfk1.b.b;
                } else
                {
                    obj = null;
                }
                msx1.d = b.a(((Float) (obj)), 0.0F);
                if (flag2)
                {
                    obj = pfk1.c.a;
                } else
                {
                    obj = null;
                }
                msx1.e = b.a(((Float) (obj)), 0.0F);
                if (flag2)
                {
                    obj = pfk1.c.b;
                } else
                {
                    obj = null;
                }
                msx1.f = b.a(((Float) (obj)), 0.0F);
                if (flag3)
                {
                    obj = pfk1.d.a;
                } else
                {
                    obj = null;
                }
                msx1.g = b.a(((Float) (obj)), 0.0F);
                if (flag3)
                {
                    obj = pfk1.d.b;
                } else
                {
                    obj = null;
                }
                msx1.h = b.a(((Float) (obj)), 0.0F);
                obj = msx1;
            }
            amsx[i] = ((msx) (obj));
            i++;
        }
        return amsx;
    }

    public static float b(pfp pfp1)
    {
        float f2 = 0.0F;
        float f1 = f2;
        if (pfp1.b != null)
        {
            f1 = f2;
            if (pfp1.b.a != null)
            {
                f1 = b.a(pfp1.b.a.b, 0.0F);
            }
        }
        return f1;
    }

    public static Object b(pev pev1, pex pex1, Class class1)
    {
        if (pev1 != null && pex1 != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        switch (pex1.f)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        default:
            int i = pex1.f;
            Log.w("StoryUtils", (new StringBuilder(35)).append("Unrecognized attribute: ").append(i).toString());
            return null;

        case 14: // '\016'
            continue; /* Loop/switch isn't completed */

        case 7: // '\007'
            pev1 = (peh)a(pev1, pex1, peh);
            if (pev1 != null && ((peh) (pev1)).c != null && java/lang/String.equals(class1))
            {
                return class1.cast(((peh) (pev1)).c.b);
            }
            break;

        case 12: // '\f'
            pev1 = (peh)a(pev1, pex1, peh);
            if (pev1 != null && ((peh) (pev1)).d != null && ((peh) (pev1)).d.b != null && java/lang/String.equals(class1))
            {
                return class1.cast(((peh) (pev1)).d.b.b);
            }
            break;

        case 16: // '\020'
            pev1 = (peh)a(pev1, pex1, peh);
            if (pev1 != null && ((peh) (pev1)).d != null && ((peh) (pev1)).d.c != null && java/lang/String.equals(class1))
            {
                return class1.cast(((peh) (pev1)).d.c.b);
            }
            break;

        case 1: // '\001'
            pev1 = (peq)a(pev1, pex1, peq);
            if (pev1 != null && ppq.equals(class1))
            {
                return class1.cast(((peq) (pev1)).c);
            }
            break;

        case 2: // '\002'
            pev1 = (pgt)a(pev1, pex1, pgt);
            if (pev1 != null && java/lang/String.equals(class1))
            {
                return class1.cast(((pgt) (pev1)).a);
            }
            break;

        case 8: // '\b'
            pev1 = (peh)a(pev1, pex1, peh);
            if (pev1 != null && ((peh) (pev1)).c != null && java/lang/String.equals(class1))
            {
                return class1.cast(((peh) (pev1)).c.a);
            }
            break;

        case 13: // '\r'
            pev1 = (peh)a(pev1, pex1, peh);
            if (pev1 != null && ((peh) (pev1)).d != null && ((peh) (pev1)).d.b != null && java/lang/String.equals(class1))
            {
                return class1.cast(((peh) (pev1)).d.b.a);
            }
            break;

        case 17: // '\021'
            pev1 = (peh)a(pev1, pex1, peh);
            if (pev1 != null && ((peh) (pev1)).d != null && ((peh) (pev1)).d.c != null && java/lang/String.equals(class1))
            {
                return class1.cast(((peh) (pev1)).d.c.a);
            }
            break;

        case 5: // '\005'
            pev1 = (peq)a(pev1, pex1, peq);
            if (pev1 != null && ((peq) (pev1)).e != null)
            {
                pev1 = ((peq) (pev1)).e.a;
            } else
            {
                pev1 = null;
            }
            if (java/lang/String.equals(class1) && pev1 != null)
            {
                if (((pet) (pev1)).c != null)
                {
                    return class1.cast(((pet) (pev1)).c);
                }
                if (((pet) (pev1)).a != null)
                {
                    return class1.cast(((pet) (pev1)).a.c);
                }
            }
            break;

        case 6: // '\006'
            pev1 = (peq)a(pev1, pex1, peq);
            if (pev1 != null && ((peq) (pev1)).e != null && ((peq) (pev1)).e.a != null && ((peq) (pev1)).e.a.a != null && java/lang/String.equals(class1))
            {
                return class1.cast(((peq) (pev1)).e.a.a.d);
            }
            break;

        case 15: // '\017'
            pev1 = (peq)a(pev1, pex1, peq);
            if (pev1 != null && ((peq) (pev1)).e != null && ((peq) (pev1)).e.a != null && pqb.equals(class1))
            {
                return class1.cast(((peq) (pev1)).e.a.d);
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
        if (!pqb.equals(class1)) goto _L1; else goto _L3
_L3:
        return class1.cast(pev1.b);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static qdz b(qgg qgg1)
    {
        if (qgg1.d.a == 1)
        {
            return qgg1.d.b.a;
        } else
        {
            return qgg1.d.c.b;
        }
    }

    public static boolean b(peq peq1)
    {
        boolean flag1 = true;
        if (peq1 != null && peq1.a != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        if (peq1.b != 1)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (peq1.d == null || peq1.d.d == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (peq1.d.d.b == null || peq1.d.d.b.a == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (peq1.d.d.b.a.a != null) goto _L4; else goto _L3
_L3:
        if (peq1.d.d.c == null || peq1.d.d.c.b == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (peq1.d.d.c.b.a != null) goto _L4; else goto _L5
_L5:
        return false;
        if (peq1.b != 2 || peq1.e == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (peq1.e.a != null) goto _L4; else goto _L6
_L6:
        return false;
    }

    public static float c(pfp pfp1)
    {
        float f2 = 0.0F;
        float f1 = f2;
        if (pfp1.b != null)
        {
            f1 = f2;
            if (pfp1.b.b != null)
            {
                f1 = b.a(pfp1.b.b.a, 0.0F);
            }
        }
        return f1;
    }

    public static float d(pfp pfp1)
    {
        float f2 = 0.0F;
        float f1 = f2;
        if (pfp1.b != null)
        {
            f1 = f2;
            if (pfp1.b.b != null)
            {
                f1 = b.a(pfp1.b.b.b, 0.0F);
            }
        }
        return f1;
    }

    public static int e(pfp pfp1)
    {
        if (pfp1.b != null && pfp1.b.g != null && pfp1.b.g.a != null)
        {
            return pfp1.b.g.a.intValue();
        } else
        {
            return 0;
        }
    }

    public static int f(pfp pfp1)
    {
        if (pfp1.b != null && pfp1.b.h != null && pfp1.b.h.a != null)
        {
            return pfp1.b.h.a.intValue();
        } else
        {
            return 0;
        }
    }

    public static Typeface g(pfp pfp1)
    {
        int j = 0;
        String s;
        int i;
        if (pfp1.b != null)
        {
            s = pfp1.b.j;
        } else
        {
            s = null;
        }
        if (pfp1.b != null && pfp1.b.k != 0x80000000)
        {
            i = pfp1.b.k;
        } else
        {
            i = 0;
        }
        if ("Roboto".equals(s))
        {
            if (i == 1)
            {
                return c;
            } else
            {
                return a;
            }
        }
        if ("Roboto Light".equals(s))
        {
            return d;
        }
        if ("Roboto Medium".equals(s))
        {
            return b;
        }
        if (i == 1)
        {
            j = 1;
        }
        return Typeface.defaultFromStyle(j);
    }

    public static int h(pfp pfp1)
    {
        switch (pfp1.b.m)
        {
        default:
            int i = pfp1.b.m;
            Log.w("StoryUtils", (new StringBuilder(40)).append("Unrecognised text alignment: ").append(i).toString());
            // fall through

        case -2147483648: 
            return 0;

        case 1: // '\001'
            return 3;

        case 2: // '\002'
            return 17;

        case 3: // '\003'
            return 5;
        }
    }

}
