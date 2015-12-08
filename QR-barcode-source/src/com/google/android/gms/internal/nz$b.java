// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            jj, nz, oc, jf, 
//            od, oe

public static final class anx extends jj
    implements com.google.android.gms.plus.model.people.n.Cover
{
    public static final class a extends jj
        implements com.google.android.gms.plus.model.people.Person.Cover.CoverInfo
    {

        public static final od CREATOR = new od();
        private static final HashMap amb;
        final int BR;
        final Set amc;
        int any;
        int anz;

        protected boolean a(ji.a a1)
        {
            return amc.contains(Integer.valueOf(a1.hm()));
        }

        protected Object b(ji.a a1)
        {
            switch (a1.hm())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

            case 2: // '\002'
                return Integer.valueOf(any);

            case 3: // '\003'
                return Integer.valueOf(anz);
            }
        }

        public int describeContents()
        {
            od od1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if (!(obj instanceof a))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (a)obj;
                ji.a a1;
label1:
                do
                {
                    for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ji.a)iterator.next();
                        if (!a(a1))
                        {
                            continue label1;
                        }
                        if (((a) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((a) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((a) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return nx();
        }

        public int getLeftImageOffset()
        {
            return any;
        }

        public int getTopImageOffset()
        {
            return anz;
        }

        public boolean hasLeftImageOffset()
        {
            return amc.contains(Integer.valueOf(2));
        }

        public boolean hasTopImageOffset()
        {
            return amc.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = amb.values().iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ji.a a1 = (ji.a)iterator.next();
                if (a(a1))
                {
                    int j = a1.hm();
                    i = b(a1).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public HashMap hf()
        {
            return amb;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public a nx()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            od od1 = CREATOR;
            od.a(this, parcel, i);
        }

        static 
        {
            amb = new HashMap();
            amb.put("leftImageOffset", ji.a.i("leftImageOffset", 2));
            amb.put("topImageOffset", ji.a.i("topImageOffset", 3));
        }

        public a()
        {
            BR = 1;
            amc = new HashSet();
        }

        a(Set set, int i, int j, int k)
        {
            amc = set;
            BR = i;
            any = j;
            anz = k;
        }
    }

    public static final class b extends jj
        implements com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto
    {

        public static final oe CREATOR = new oe();
        private static final HashMap amb;
        final int BR;
        final Set amc;
        int lf;
        int lg;
        String uR;

        protected boolean a(ji.a a1)
        {
            return amc.contains(Integer.valueOf(a1.hm()));
        }

        protected Object b(ji.a a1)
        {
            switch (a1.hm())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.hm()).toString());

            case 2: // '\002'
                return Integer.valueOf(lg);

            case 3: // '\003'
                return uR;

            case 4: // '\004'
                return Integer.valueOf(lf);
            }
        }

        public int describeContents()
        {
            oe oe1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if (!(obj instanceof b))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (b)obj;
                ji.a a1;
label1:
                do
                {
                    for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ji.a)iterator.next();
                        if (!a(a1))
                        {
                            continue label1;
                        }
                        if (((b) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((b) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((b) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return ny();
        }

        public int getHeight()
        {
            return lg;
        }

        public String getUrl()
        {
            return uR;
        }

        public int getWidth()
        {
            return lf;
        }

        public boolean hasHeight()
        {
            return amc.contains(Integer.valueOf(2));
        }

        public boolean hasUrl()
        {
            return amc.contains(Integer.valueOf(3));
        }

        public boolean hasWidth()
        {
            return amc.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = amb.values().iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ji.a a1 = (ji.a)iterator.next();
                if (a(a1))
                {
                    int j = a1.hm();
                    i = b(a1).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public HashMap hf()
        {
            return amb;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b ny()
        {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            oe oe1 = CREATOR;
            oe.a(this, parcel, i);
        }

        static 
        {
            amb = new HashMap();
            amb.put("height", ji.a.i("height", 2));
            amb.put("url", ji.a.l("url", 3));
            amb.put("width", ji.a.i("width", 4));
        }

        public b()
        {
            BR = 1;
            amc = new HashSet();
        }

        b(Set set, int i, int j, String s, int k)
        {
            amc = set;
            BR = i;
            lg = j;
            uR = s;
            lf = k;
        }
    }


    public static final oc CREATOR = new oc();
    private static final HashMap amb;
    final int BR;
    final Set amc;
    a anv;
    b anw;
    int anx;

    protected boolean a(nit> nit>)
    {
        return amc.contains(Integer.valueOf(nit>.hm()));
    }

    protected Object b(hm hm)
    {
        switch (hm.hm())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(hm.hm()).toString());

        case 2: // '\002'
            return anv;

        case 3: // '\003'
            return anw;

        case 4: // '\004'
            return Integer.valueOf(anx);
        }
    }

    public int describeContents()
    {
        oc oc1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof CREATOR))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (CREATOR)obj;
            CREATOR creator;
label1:
            do
            {
                for (Iterator iterator = amb.values().iterator(); iterator.hasNext();)
                {
                    creator = (amb)iterator.next();
                    if (!a(creator))
                    {
                        continue label1;
                    }
                    if (((a) (obj)).a(creator))
                    {
                        if (!b(creator).equals(((b) (obj)).b(creator)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((b) (obj)).a(creator));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return nw();
    }

    public com.google.android.gms.plus.model.people.n.Cover.CoverInfo getCoverInfo()
    {
        return anv;
    }

    public com.google.android.gms.plus.model.people.n.Cover.CoverPhoto getCoverPhoto()
    {
        return anw;
    }

    public int getLayout()
    {
        return anx;
    }

    public boolean hasCoverInfo()
    {
        return amc.contains(Integer.valueOf(2));
    }

    public boolean hasCoverPhoto()
    {
        return amc.contains(Integer.valueOf(3));
    }

    public boolean hasLayout()
    {
        return amc.contains(Integer.valueOf(4));
    }

    public int hashCode()
    {
        Iterator iterator = amb.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            amc amc1 = (amb)iterator.next();
            if (a(amc1))
            {
                int j = amc1.hm();
                i = b(amc1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public HashMap hf()
    {
        return amb;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public amb nw()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        oc oc1 = CREATOR;
        oc.a(this, parcel, i);
    }

    static 
    {
        amb = new HashMap();
        amb.put("coverInfo", a("coverInfo", 2, com/google/android/gms/internal/nz$b$a));
        amb.put("coverPhoto", a("coverPhoto", 3, com/google/android/gms/internal/nz$b$b));
        amb.put("layout", a("layout", 4, (new jf()).h("banner", 0), false));
    }

    public b()
    {
        BR = 1;
        amc = new HashSet();
    }

    b(Set set, int i, a a1, b b1, int j)
    {
        amc = set;
        BR = i;
        anv = a1;
        anw = b1;
        anx = j;
    }
}
