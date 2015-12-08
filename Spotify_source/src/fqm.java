// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class fqm
    implements Runnable
{

    private static final gfa b;
    private static final gfa c;
    final gey a;
    private final fqv d;
    private final fqn e;
    private AsyncTask f;
    private Long g;

    public fqm(fqv fqv, fqn fqn)
    {
        d = fqv;
        e = fqn;
        fqv = new gez("gpiab-detectcountry", this);
        fqv.a = b;
        fqv.c = c;
        a = fqv.a();
    }

    static fqv a(fqm fqm1)
    {
        return fqm1.d;
    }

    static Long b(fqm fqm1)
    {
        return fqm1.g;
    }

    static gey c(fqm fqm1)
    {
        return fqm1.a;
    }

    static fqn d(fqm fqm1)
    {
        return fqm1.e;
    }

    static AsyncTask e(fqm fqm1)
    {
        fqm1.f = null;
        return null;
    }

    public final void a()
    {
        a.c();
        if (f != null)
        {
            f.cancel(true);
            f = null;
        }
    }

    public final void b()
    {
        g = Long.valueOf(System.currentTimeMillis());
    }

    public final void run()
    {
        f = new AsyncTask() {

            private fqm a;

            private transient String a()
            {
                char c1;
                Object obj;
                Object obj1;
                int i;
                obj = fqm.a(a);
                obj1 = new ArrayList();
                ((ArrayList) (obj1)).add("spotify.country.detection");
                ArrayList arraylist = new ArrayList();
                if (!((fqv) (obj)).a("inapp", ((ArrayList) (obj1)), arraylist))
                {
                    break MISSING_BLOCK_LABEL_224;
                }
                obj = arraylist.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break MISSING_BLOCK_LABEL_224;
                    }
                    obj1 = (fqy)((Iterator) (obj)).next();
                } while (!"spotify.country.detection".equals(((fqy) (obj1)).a));
                obj = ((fqy) (obj1)).b;
                obj1 = Pattern.compile("^\\D*(\\d{2})\\D+(\\d{1,2})\\D*$").matcher(((CharSequence) (obj)));
                if (!((Matcher) (obj1)).matches())
                {
                    break MISSING_BLOCK_LABEL_208;
                }
                c1 = (char)Integer.parseInt(((Matcher) (obj1)).group(1));
                obj1 = ((Matcher) (obj1)).group(2);
                i = Integer.parseInt(((String) (obj1)));
                char c2;
                Exception exception;
                byte byte0;
                if (((String) (obj1)).length() == 1)
                {
                    byte0 = 10;
                } else
                {
                    byte0 = 1;
                }
                c2 = (char)(byte0 * i);
                if (c1 < 'A' || c1 > 'Z' || c2 < 'A' || c2 > 'Z')
                {
                    break MISSING_BLOCK_LABEL_208;
                }
                return String.format(Locale.US, "%s%s", new Object[] {
                    Character.valueOf(c1), Character.valueOf(c2)
                });
                Logger.b("Could not detect country from price: %s", new Object[] {
                    obj
                });
                return "XX";
                return null;
                exception;
                Assertion.a("Failed to detect country", exception);
                return "";
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            protected final void onPostExecute(Object obj)
            {
                String s = (String)obj;
                obj = s;
                if (s == null)
                {
                    obj = s;
                    if (fqm.b(a) != null)
                    {
                        long l = System.currentTimeMillis() - fqm.b(a).longValue();
                        obj = s;
                        if (l > 2000L)
                        {
                            Logger.a("Give up since it's been %d ms since hurry up", new Object[] {
                                Long.valueOf(l)
                            });
                            obj = "";
                        }
                    }
                }
                if (obj == null)
                {
                    fqm.c(a).e();
                } else
                {
                    Logger.a("Detected country: %s", new Object[] {
                        obj
                    });
                    fqm.c(a).d();
                    fqm.d(a).a(((String) (obj)));
                }
                fqm.e(a);
            }

            
            {
                a = fqm.this;
                super();
            }
        };
        f.execute(new Void[0]);
    }

    static 
    {
        b = new gfd(0L, TimeUnit.MILLISECONDS);
        c = new gfd(200L, TimeUnit.MILLISECONDS);
    }
}
