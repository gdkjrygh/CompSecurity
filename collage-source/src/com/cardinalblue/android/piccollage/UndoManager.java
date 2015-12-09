// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

// Referenced classes of package com.cardinalblue.android.piccollage:
//            ParcelableParcel

public class UndoManager
{
    public static abstract class UndoOperation
        implements Parcelable
    {

        public boolean a()
        {
            return true;
        }

        public abstract void b();

        public abstract void c();

        public abstract void d();

        public int describeContents()
        {
            return 0;
        }

        protected UndoOperation()
        {
        }
    }

    static final class a
    {

        private final UndoManager a;
        private final int b;
        private final ArrayList c;
        private ArrayList d;
        private CharSequence e;
        private boolean f;
        private boolean g;

        void a()
        {
            g = true;
        }

        void a(Parcel parcel)
        {
            int l = 1;
            if (d != null)
            {
                throw new IllegalStateException("Can't save state before committing");
            }
            parcel.writeInt(b);
            int k;
            if (f)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            parcel.writeInt(k);
            if (g)
            {
                k = l;
            } else
            {
                k = 0;
            }
            parcel.writeInt(k);
            TextUtils.writeToParcel(e, parcel, 0);
            l = c.size();
            parcel.writeInt(l);
            for (k = 0; k < l; k++)
            {
                parcel.writeParcelable((UndoOperation)c.get(k), 0);
            }

        }

        void a(UndoOperation undooperation)
        {
            if (c.contains(undooperation))
            {
                throw new IllegalStateException((new StringBuilder()).append("Already holds ").append(undooperation).toString());
            }
            c.add(undooperation);
            if (d == null)
            {
                d = new ArrayList();
                d.add(undooperation);
            }
        }

        void a(CharSequence charsequence)
        {
            if (e != null)
            {
                e = charsequence;
            }
        }

        boolean b()
        {
            return f && !g;
        }

        boolean c()
        {
            return c.size() != 0;
        }

        boolean d()
        {
            for (int k = c.size() - 1; k >= 0; k--)
            {
                if (((UndoOperation)c.get(k)).a())
                {
                    return true;
                }
            }

            return false;
        }

        void e()
        {
            int l = 0;
            int k;
            if (d != null)
            {
                k = d.size();
            } else
            {
                k = 0;
            }
            for (; l < k; l++)
            {
                ((UndoOperation)d.get(l)).b();
            }

            d = null;
        }

        void f()
        {
            for (int k = c.size() - 1; k >= 0; k--)
            {
                ((UndoOperation)c.get(k)).c();
            }

        }

        void g()
        {
            int l = c.size();
            for (int k = 0; k < l; k++)
            {
                ((UndoOperation)c.get(k)).d();
            }

        }

        void h()
        {
        }

        a(UndoManager undomanager, int k)
        {
            c = new ArrayList();
            f = true;
            a = undomanager;
            b = k;
        }

        a(UndoManager undomanager, Parcel parcel, ClassLoader classloader)
        {
            boolean flag1 = true;
            int k = 0;
            super();
            c = new ArrayList();
            f = true;
            a = undomanager;
            b = parcel.readInt();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = flag;
            if (parcel.readInt() != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            g = flag;
            e = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            for (int l = parcel.readInt(); k < l; k++)
            {
                undomanager = (UndoOperation)parcel.readParcelable(classloader);
                c.add(undomanager);
            }

        }
    }


    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();
    private int c;
    private int d;
    private a e;
    private int f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;

    public UndoManager()
    {
        d = 20;
        f = 1;
    }

    private void a(UndoOperation undooperation, int k)
    {
        if (e == null)
        {
            throw new IllegalStateException("Must be called during an update");
        }
        if (k != 0 && !h && !e.d())
        {
            a a1 = g();
            if (a1 != null && k == 2 && a1.b() && a1.c())
            {
                e.h();
                e = a1;
                a.remove(a1);
                h = true;
            }
        }
        e.a(undooperation);
    }

    private void h()
    {
        int k = f;
        f = k + 1;
        e = new a(this, k);
        if (f < 0)
        {
            f = 1;
        }
    }

    private void i()
    {
        int k = a.size() + 1;
        if (e.d())
        {
            a.add(e);
            d(-1);
            e.e();
            if (k >= 2)
            {
                ((a)a.get(k - 2)).a();
            }
        } else
        {
            e.h();
        }
        e = null;
        if (d >= 0 && k > d)
        {
            c(k - d);
        }
    }

    public int a(int k)
    {
        if (e != null)
        {
            throw new IllegalStateException("Can't be called during an update");
        }
        int i1 = -1;
        g = true;
        a a1 = g();
        if (a1 != null)
        {
            a1.a();
        }
        boolean flag = false;
        int l = k;
        k = ((flag) ? 1 : 0);
        do
        {
            if (l <= 0)
            {
                break;
            }
            i1 = a(a, i1);
            if (i1 < 0)
            {
                break;
            }
            a a2 = (a)a.remove(i1);
            a2.f();
            b.add(a2);
            l--;
            k++;
        } while (true);
        g = false;
        return k;
    }

    int a(ArrayList arraylist, int k)
    {
        int l = arraylist.size();
        if (k == -1)
        {
            k = l - 1;
        }
        if (k >= l)
        {
            return -1;
        } else
        {
            return k;
        }
    }

    public Parcelable a()
    {
        if (c > 0)
        {
            throw new IllegalStateException("Can't save state while updating");
        }
        ParcelableParcel parcelableparcel = new ParcelableParcel(getClass().getClassLoader());
        Parcel parcel = parcelableparcel.a();
        i = i + 1;
        if (i <= 0)
        {
            i = 0;
        }
        j = 0;
        parcel.writeInt(d);
        for (int k = a.size(); k > 0;)
        {
            parcel.writeInt(1);
            k--;
            ((a)a.get(k)).a(parcel);
        }

        int l = b.size();
        parcel.writeInt(l);
        while (l > 0) 
        {
            parcel.writeInt(2);
            l--;
            ((a)b.get(l)).a(parcel);
        }
        parcel.writeInt(0);
        return parcelableparcel;
    }

    public void a(Parcelable parcelable)
    {
        if (c > 0)
        {
            throw new IllegalStateException("Can't save state while updating");
        }
        c(-1);
        d(-1);
        parcelable = (ParcelableParcel)parcelable;
        Parcel parcel = parcelable.a();
        d = parcel.readInt();
        do
        {
            int k = parcel.readInt();
            if (k != 0)
            {
                a a1 = new a(this, parcel, parcelable.b());
                if (k == 1)
                {
                    a.add(0, a1);
                } else
                {
                    b.add(0, a1);
                }
            } else
            {
                return;
            }
        } while (true);
    }

    public void a(UndoOperation undooperation)
    {
        a(undooperation, 0);
    }

    public void a(CharSequence charsequence)
    {
        if (g)
        {
            throw new IllegalStateException("Can't being update while performing undo/redo");
        }
        if (c <= 0)
        {
            h();
            h = false;
            c = 0;
        }
        e.a(charsequence);
        c = c + 1;
    }

    public int b(int k)
    {
        if (e != null)
        {
            throw new IllegalStateException("Can't be called during an update");
        }
        int i1 = -1;
        g = true;
        boolean flag = false;
        int l = k;
        k = ((flag) ? 1 : 0);
        do
        {
            if (l <= 0)
            {
                break;
            }
            i1 = a(b, i1);
            if (i1 < 0)
            {
                break;
            }
            a a1 = (a)b.remove(i1);
            a1.g();
            a.add(a1);
            l--;
            k++;
        } while (true);
        g = false;
        return k;
    }

    public boolean b()
    {
        return g;
    }

    public int c(int k)
    {
        int l = k;
        if (k < 0)
        {
            l = a.size();
        }
        k = 0;
        int i1;
        int j1;
        for (i1 = 0; k < a.size() && i1 < l; i1 = j1)
        {
            a a1 = (a)a.get(k);
            j1 = i1;
            if (l > 0)
            {
                a1.h();
                a.remove(k);
                j1 = i1 + 1;
            }
            k++;
        }

        return i1;
    }

    public boolean c()
    {
        return c > 0;
    }

    public int d(int k)
    {
        int l = k;
        if (k < 0)
        {
            l = b.size();
        }
        k = 0;
        int i1;
        int j1;
        for (i1 = 0; k < b.size() && i1 < l; i1 = j1)
        {
            a a1 = (a)b.get(k);
            j1 = i1;
            if (l > 0)
            {
                a1.h();
                b.remove(k);
                j1 = i1 + 1;
            }
            k++;
        }

        return i1;
    }

    public void d()
    {
        if (e == null)
        {
            throw new IllegalStateException("Must be called during an update");
        }
        c = c - 1;
        if (c == 0)
        {
            i();
        }
    }

    public boolean e()
    {
        return !a.isEmpty();
    }

    public boolean f()
    {
        return !b.isEmpty();
    }

    a g()
    {
        int k;
        if (a.size() > 0)
        {
            if ((k = a(a, -1)) >= 0)
            {
                return (a)a.get(k);
            }
        }
        return null;
    }
}
