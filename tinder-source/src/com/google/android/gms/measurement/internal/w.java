// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;
import com.google.android.gms.measurement.a;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            af, j, ac, ab, 
//            z, u, c, h

public final class w extends af
{
    public final class a
    {

        final w a;
        private final int b;
        private final boolean c;
        private final boolean d;

        public final void a(String s)
        {
            a.a(b, c, d, s, null, null, null);
        }

        public final void a(String s, Object obj)
        {
            a.a(b, c, d, s, obj, null, null);
        }

        public final void a(String s, Object obj, Object obj1)
        {
            a.a(b, c, d, s, obj, obj1, null);
        }

        public final void a(String s, Object obj, Object obj1, Object obj2)
        {
            a.a(b, c, d, s, obj, obj1, obj2);
        }

        a(int i1, boolean flag, boolean flag1)
        {
            a = w.this;
            super();
            b = i1;
            c = flag;
            d = flag1;
        }
    }


    public final a a = new a(6, false, false);
    public final a b = new a(5, false, false);
    final a c = new a(5, true, false);
    final a d = new a(5, false, true);
    final a e = new a(4, false, false);
    final a f = new a(3, false, false);
    public final a g = new a(2, false, false);
    private final String j = com.google.android.gms.measurement.internal.j.a();
    private final char k;
    private final long l = com.google.android.gms.measurement.internal.j.y();
    private final a m = new a(6, true, false);
    private final a n = new a(6, false, true);

    w(ac ac1)
    {
        super(ac1);
        if (super.n().A())
        {
            char c1;
            if (com.google.android.gms.measurement.internal.j.z())
            {
                c1 = 'P';
            } else
            {
                c1 = 'C';
            }
            k = c1;
        } else
        {
            char c2;
            if (com.google.android.gms.measurement.internal.j.z())
            {
                c2 = 'p';
            } else
            {
                c2 = 'c';
            }
            k = c2;
        }
    }

    private static String a(String s)
    {
        String s1;
        if (TextUtils.isEmpty(s))
        {
            s1 = "";
        } else
        {
            int i1 = s.lastIndexOf('.');
            s1 = s;
            if (i1 != -1)
            {
                return s.substring(0, i1);
            }
        }
        return s1;
    }

    private static String a(boolean flag, Object obj)
    {
        if (obj == null)
        {
            return "";
        }
        if (obj instanceof Integer)
        {
            obj = Long.valueOf(((Integer)obj).intValue());
        }
        if (obj instanceof Long)
        {
            if (!flag)
            {
                return String.valueOf(obj);
            }
            if (Math.abs(((Long)obj).longValue()) < 100L)
            {
                return String.valueOf(obj);
            }
            String s;
            StringBuilder stringbuilder;
            if (String.valueOf(obj).charAt(0) == '-')
            {
                s = "-";
            } else
            {
                s = "";
            }
            obj = String.valueOf(Math.abs(((Long)obj).longValue()));
            stringbuilder = new StringBuilder();
            stringbuilder.append(s);
            stringbuilder.append(Math.round(Math.pow(10D, ((String) (obj)).length() - 1)));
            stringbuilder.append("...");
            stringbuilder.append(s);
            stringbuilder.append(Math.round(Math.pow(10D, ((String) (obj)).length()) - 1.0D));
            return stringbuilder.toString();
        }
        if (obj instanceof Boolean)
        {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable)
        {
            Throwable throwable = (Throwable)obj;
            obj = new StringBuilder(throwable.toString());
            String s1 = a(com/google/android/gms/measurement/a.getCanonicalName());
            String s2 = a(com/google/android/gms/measurement/internal/ac.getCanonicalName());
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int j1 = astacktraceelement.length;
            int i1 = 0;
            do
            {
label0:
                {
                    if (i1 < j1)
                    {
                        StackTraceElement stacktraceelement = astacktraceelement[i1];
                        if (stacktraceelement.isNativeMethod())
                        {
                            break label0;
                        }
                        String s3 = stacktraceelement.getClassName();
                        if (s3 == null)
                        {
                            break label0;
                        }
                        s3 = a(s3);
                        if (!s3.equals(s1) && !s3.equals(s2))
                        {
                            break label0;
                        }
                        ((StringBuilder) (obj)).append(": ");
                        ((StringBuilder) (obj)).append(stacktraceelement);
                    }
                    return ((StringBuilder) (obj)).toString();
                }
                i1++;
            } while (true);
        } else
        if (flag)
        {
            return "-";
        } else
        {
            return String.valueOf(obj);
        }
    }

    private static String a(boolean flag, String s, Object obj, Object obj1, Object obj2)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        String s2 = a(flag, obj);
        obj1 = a(flag, obj1);
        obj2 = a(flag, obj2);
        StringBuilder stringbuilder = new StringBuilder();
        s = "";
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(s1);
            s = ": ";
        }
        obj = s;
        if (!TextUtils.isEmpty(s2))
        {
            stringbuilder.append(s);
            stringbuilder.append(s2);
            obj = ", ";
        }
        s = ((String) (obj));
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            stringbuilder.append(((String) (obj)));
            stringbuilder.append(((String) (obj1)));
            s = ", ";
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            stringbuilder.append(s);
            stringbuilder.append(((String) (obj2)));
        }
        return stringbuilder.toString();
    }

    protected final void a()
    {
    }

    protected final void a(int i1, String s)
    {
        Log.println(i1, j, s);
    }

    protected final void a(int i1, boolean flag, boolean flag1, String s, Object obj, Object obj1, Object obj2)
    {
        ab ab1;
label0:
        {
            if (!flag && Log.isLoggable(j, i1))
            {
                a(i1, a(false, s, obj, obj1, obj2));
            }
            if (!flag1 && i1 >= 5)
            {
                u.a(s);
                ab1 = h.c;
                if (ab1 != null && ab1.s() && !((af) (ab1)).i)
                {
                    break label0;
                }
                a(6, "Scheduler not initialized or shutdown. Not logging error/warn.");
            }
            return;
        }
        if (i1 < 0)
        {
            i1 = 0;
        }
        int j1 = i1;
        if (i1 >= 9)
        {
            j1 = 8;
        }
        obj1 = (new StringBuilder("1")).append("01VDIWEA?".charAt(j1)).append(k).append(l).append(":").append(a(true, s, obj, obj1, obj2)).toString();
        obj = obj1;
        if (((String) (obj1)).length() > 1024)
        {
            obj = s.substring(0, 1024);
        }
        ab1.a(new Runnable(((String) (obj))) {

            final String a;
            final w b;

            public final void run()
            {
                Object obj3 = b.h.d();
                if (!((z) (obj3)).s() || ((af) (obj3)).i)
                {
                    b.a(6, "Persisted config not initialized . Not logging error/warn.");
                    return;
                }
                z.b b1 = ((z) (obj3)).b;
                Object obj4 = a;
                b1.e.e();
                if (b1.b() == 0L)
                {
                    b1.a();
                }
                obj3 = obj4;
                if (obj4 == null)
                {
                    obj3 = "";
                }
                long l1 = com.google.android.gms.measurement.internal.z.a(b1.e).getLong(b1.b, 0L);
                if (l1 <= 0L)
                {
                    obj4 = com.google.android.gms.measurement.internal.z.a(b1.e).edit();
                    ((android.content.SharedPreferences.Editor) (obj4)).putString(b1.c, ((String) (obj3)));
                    ((android.content.SharedPreferences.Editor) (obj4)).putLong(b1.b, 1L);
                    ((android.content.SharedPreferences.Editor) (obj4)).apply();
                    return;
                }
                boolean flag2;
                if ((UUID.randomUUID().getLeastSignificantBits() & 0x7fffffffffffffffL) < 0x7fffffffffffffffL / (l1 + 1L))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                obj4 = com.google.android.gms.measurement.internal.z.a(b1.e).edit();
                if (flag2)
                {
                    ((android.content.SharedPreferences.Editor) (obj4)).putString(b1.c, ((String) (obj3)));
                }
                ((android.content.SharedPreferences.Editor) (obj4)).putLong(b1.b, l1 + 1L);
                ((android.content.SharedPreferences.Editor) (obj4)).apply();
            }

            
            {
                b = w.this;
                a = s;
                super();
            }
        });
    }

    public final String b()
    {
        Object obj = super.m().b;
        ((z.b) (obj)).e.e();
        ((z.b) (obj)).e.e();
        long l1 = ((z.b) (obj)).b();
        if (l1 == 0L)
        {
            ((z.b) (obj)).a();
            l1 = 0L;
        } else
        {
            l1 = Math.abs(l1 - ((z.b) (obj)).e.h().a());
        }
        if (l1 < ((z.b) (obj)).d)
        {
            obj = null;
        } else
        if (l1 > ((z.b) (obj)).d * 2L)
        {
            ((z.b) (obj)).a();
            obj = null;
        } else
        {
            String s = z.b(((z.b) (obj)).e).getString(((z.b) (obj)).c, null);
            long l2 = z.b(((z.b) (obj)).e).getLong(((z.b) (obj)).b, 0L);
            ((z.b) (obj)).a();
            if (s == null || l2 <= 0L)
            {
                obj = com.google.android.gms.measurement.internal.z.a;
            } else
            {
                obj = new Pair(s, Long.valueOf(l2));
            }
        }
        if (obj == null)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(String.valueOf(((Pair) (obj)).second)).append(":").append((String)((Pair) (obj)).first).toString();
        }
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }

    public final volatile com.google.android.gms.measurement.internal.u f()
    {
        return super.f();
    }

    public final volatile c g()
    {
        return super.g();
    }

    public final volatile ef h()
    {
        return super.h();
    }

    public final volatile Context i()
    {
        return super.i();
    }

    public final volatile h j()
    {
        return super.j();
    }

    public final volatile ab k()
    {
        return super.k();
    }

    public final volatile w l()
    {
        return super.l();
    }

    public final volatile z m()
    {
        return super.m();
    }

    public final volatile j n()
    {
        return super.n();
    }
}
