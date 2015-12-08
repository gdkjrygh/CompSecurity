// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class f
{
    public static final class a
    {

        private ArrayList a;

        public a a(f f1)
        {
            if (f1 == null)
            {
                throw new IllegalArgumentException("selector must not be null");
            } else
            {
                a(((Collection) (f1.a())));
                return this;
            }
        }

        public a a(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("category must not be null");
            }
            if (a == null)
            {
                a = new ArrayList();
            }
            if (!a.contains(s))
            {
                a.add(s);
            }
            return this;
        }

        public a a(Collection collection)
        {
            if (collection == null)
            {
                throw new IllegalArgumentException("categories must not be null");
            }
            if (!collection.isEmpty())
            {
                for (collection = collection.iterator(); collection.hasNext(); a((String)collection.next())) { }
            }
            return this;
        }

        public f a()
        {
            if (a == null)
            {
                return f.a;
            } else
            {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", a);
                return new f(bundle, a);
            }
        }

        public a()
        {
        }

        public a(f f1)
        {
            if (f1 == null)
            {
                throw new IllegalArgumentException("selector must not be null");
            }
            f.b(f1);
            if (!f.c(f1).isEmpty())
            {
                a = new ArrayList(f.c(f1));
            }
        }
    }


    public static final f a = new f(new Bundle(), null);
    private final Bundle b;
    private List c;

    private f(Bundle bundle, List list)
    {
        b = bundle;
        c = list;
    }


    public static f a(Bundle bundle)
    {
        if (bundle != null)
        {
            return new f(bundle, null);
        } else
        {
            return null;
        }
    }

    static void b(f f1)
    {
        f1.e();
    }

    static List c(f f1)
    {
        return f1.c;
    }

    private void e()
    {
        if (c == null)
        {
            c = b.getStringArrayList("controlCategories");
            if (c == null || c.isEmpty())
            {
                c = Collections.emptyList();
            }
        }
    }

    public List a()
    {
        e();
        return c;
    }

    public boolean a(f f1)
    {
        if (f1 != null)
        {
            e();
            f1.e();
            return c.containsAll(f1.c);
        } else
        {
            return false;
        }
    }

    public boolean a(List list)
    {
        if (list != null)
        {
            e();
            int k = c.size();
            if (k != 0)
            {
                int l = list.size();
label0:
                for (int i = 0; i < l; i++)
                {
                    IntentFilter intentfilter = (IntentFilter)list.get(i);
                    if (intentfilter == null)
                    {
                        continue;
                    }
                    int j = 0;
                    do
                    {
                        if (j >= k)
                        {
                            continue label0;
                        }
                        if (intentfilter.hasCategory((String)c.get(j)))
                        {
                            return true;
                        }
                        j++;
                    } while (true);
                }

            }
        }
        return false;
    }

    public boolean b()
    {
        e();
        return c.isEmpty();
    }

    public boolean c()
    {
        e();
        return !c.contains(null);
    }

    public Bundle d()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof f)
        {
            obj = (f)obj;
            e();
            ((f) (obj)).e();
            return c.equals(((f) (obj)).c);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        e();
        return c.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MediaRouteSelector{ ");
        stringbuilder.append("controlCategories=").append(Arrays.toString(a().toArray()));
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }

}
