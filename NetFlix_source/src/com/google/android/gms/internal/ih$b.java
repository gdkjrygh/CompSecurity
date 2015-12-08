// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ga, ih, ik, fx, 
//            il, im

public static final class Wf extends ga
    implements SafeParcelable, com.google.android.gms.plus.model.people.n.Cover
{
    public static final class a extends ga
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Cover.CoverInfo
    {

        public static final il CREATOR = new il();
        private static final HashMap UI;
        private final Set UJ;
        private int Wg;
        private int Wh;
        private final int xH;

        protected boolean a(ga.a a1)
        {
            return UJ.contains(Integer.valueOf(a1.ff()));
        }

        protected Object aq(String s)
        {
            return null;
        }

        protected boolean ar(String s)
        {
            return false;
        }

        protected Object b(ga.a a1)
        {
            switch (a1.ff())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.ff()).toString());

            case 2: // '\002'
                return Integer.valueOf(Wg);

            case 3: // '\003'
                return Integer.valueOf(Wh);
            }
        }

        public int describeContents()
        {
            il il1 = CREATOR;
            return 0;
        }

        public HashMap eY()
        {
            return UI;
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
                ga.a a1;
label1:
                do
                {
                    for (Iterator iterator = UI.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ga.a)iterator.next();
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
            return jH();
        }

        public int getLeftImageOffset()
        {
            return Wg;
        }

        public int getTopImageOffset()
        {
            return Wh;
        }

        int getVersionCode()
        {
            return xH;
        }

        public boolean hasLeftImageOffset()
        {
            return UJ.contains(Integer.valueOf(2));
        }

        public boolean hasTopImageOffset()
        {
            return UJ.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = UI.values().iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ga.a a1 = (ga.a)iterator.next();
                if (a(a1))
                {
                    int j = a1.ff();
                    i = b(a1).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public a jH()
        {
            return this;
        }

        Set ja()
        {
            return UJ;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            il il1 = CREATOR;
            il.a(this, parcel, i);
        }

        static 
        {
            UI = new HashMap();
            UI.put("leftImageOffset", ga.a.g("leftImageOffset", 2));
            UI.put("topImageOffset", ga.a.g("topImageOffset", 3));
        }

        public a()
        {
            xH = 1;
            UJ = new HashSet();
        }

        a(Set set, int i, int j, int k)
        {
            UJ = set;
            xH = i;
            Wg = j;
            Wh = k;
        }
    }

    public static final class b extends ga
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto
    {

        public static final im CREATOR = new im();
        private static final HashMap UI;
        private final Set UJ;
        private int kr;
        private int ks;
        private String ro;
        private final int xH;

        protected boolean a(ga.a a1)
        {
            return UJ.contains(Integer.valueOf(a1.ff()));
        }

        protected Object aq(String s)
        {
            return null;
        }

        protected boolean ar(String s)
        {
            return false;
        }

        protected Object b(ga.a a1)
        {
            switch (a1.ff())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.ff()).toString());

            case 2: // '\002'
                return Integer.valueOf(ks);

            case 3: // '\003'
                return ro;

            case 4: // '\004'
                return Integer.valueOf(kr);
            }
        }

        public int describeContents()
        {
            im im1 = CREATOR;
            return 0;
        }

        public HashMap eY()
        {
            return UI;
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
                ga.a a1;
label1:
                do
                {
                    for (Iterator iterator = UI.values().iterator(); iterator.hasNext();)
                    {
                        a1 = (ga.a)iterator.next();
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
            return jI();
        }

        public int getHeight()
        {
            return ks;
        }

        public String getUrl()
        {
            return ro;
        }

        int getVersionCode()
        {
            return xH;
        }

        public int getWidth()
        {
            return kr;
        }

        public boolean hasHeight()
        {
            return UJ.contains(Integer.valueOf(2));
        }

        public boolean hasUrl()
        {
            return UJ.contains(Integer.valueOf(3));
        }

        public boolean hasWidth()
        {
            return UJ.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = UI.values().iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ga.a a1 = (ga.a)iterator.next();
                if (a(a1))
                {
                    int j = a1.ff();
                    i = b(a1).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b jI()
        {
            return this;
        }

        Set ja()
        {
            return UJ;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            im im1 = CREATOR;
            im.a(this, parcel, i);
        }

        static 
        {
            UI = new HashMap();
            UI.put("height", ga.a.g("height", 2));
            UI.put("url", ga.a.j("url", 3));
            UI.put("width", ga.a.g("width", 4));
        }

        public b()
        {
            xH = 1;
            UJ = new HashSet();
        }

        b(Set set, int i, int j, String s, int k)
        {
            UJ = set;
            xH = i;
            ks = j;
            ro = s;
            kr = k;
        }
    }


    public static final ik CREATOR = new ik();
    private static final HashMap UI;
    private final Set UJ;
    private a Wd;
    private b We;
    private int Wf;
    private final int xH;

    protected boolean a(nit> nit>)
    {
        return UJ.contains(Integer.valueOf(nit>.ff()));
    }

    protected Object aq(String s)
    {
        return null;
    }

    protected boolean ar(String s)
    {
        return false;
    }

    protected Object b(ff ff)
    {
        switch (ff.ff())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(ff.ff()).toString());

        case 2: // '\002'
            return Wd;

        case 3: // '\003'
            return We;

        case 4: // '\004'
            return Integer.valueOf(Wf);
        }
    }

    public int describeContents()
    {
        ik ik1 = CREATOR;
        return 0;
    }

    public HashMap eY()
    {
        return UI;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof UI))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (UI)obj;
            UI ui;
label1:
            do
            {
                for (Iterator iterator = UI.values().iterator(); iterator.hasNext();)
                {
                    ui = (UI)iterator.next();
                    if (!a(ui))
                    {
                        continue label1;
                    }
                    if (((a) (obj)).a(ui))
                    {
                        if (!b(ui).equals(((b) (obj)).b(ui)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((b) (obj)).a(ui));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return jG();
    }

    public com.google.android.gms.plus.model.people.n.Cover.CoverInfo getCoverInfo()
    {
        return Wd;
    }

    public com.google.android.gms.plus.model.people.n.Cover.CoverPhoto getCoverPhoto()
    {
        return We;
    }

    public int getLayout()
    {
        return Wf;
    }

    int getVersionCode()
    {
        return xH;
    }

    public boolean hasCoverInfo()
    {
        return UJ.contains(Integer.valueOf(2));
    }

    public boolean hasCoverPhoto()
    {
        return UJ.contains(Integer.valueOf(3));
    }

    public boolean hasLayout()
    {
        return UJ.contains(Integer.valueOf(4));
    }

    public int hashCode()
    {
        Iterator iterator = UI.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            UJ uj = (UI)iterator.next();
            if (a(uj))
            {
                int j = uj.ff();
                i = b(uj).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    a jE()
    {
        return Wd;
    }

    b jF()
    {
        return We;
    }

    public We jG()
    {
        return this;
    }

    Set ja()
    {
        return UJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ik ik1 = CREATOR;
        ik.a(this, parcel, i);
    }

    static 
    {
        UI = new HashMap();
        UI.put("coverInfo", a("coverInfo", 2, com/google/android/gms/internal/ih$b$a));
        UI.put("coverPhoto", a("coverPhoto", 3, com/google/android/gms/internal/ih$b$b));
        UI.put("layout", a("layout", 4, (new fx()).f("banner", 0), false));
    }

    public b()
    {
        xH = 1;
        UJ = new HashSet();
    }

    b(Set set, int i, a a1, b b1, int j)
    {
        UJ = set;
        xH = i;
        Wd = a1;
        We = b1;
        Wf = j;
    }
}
