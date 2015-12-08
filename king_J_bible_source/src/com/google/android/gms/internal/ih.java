// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ga, ii, fx, ij, 
//            ik, il, im, in, 
//            io, ip, iq, ir

public final class ih extends ga
    implements SafeParcelable, Person
{
    public static final class a extends ga
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.AgeRange
    {

        public static final ij CREATOR = new ij();
        private static final HashMap UI;
        private final Set UJ;
        private int Wb;
        private int Wc;
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
                return Integer.valueOf(Wb);

            case 3: // '\003'
                return Integer.valueOf(Wc);
            }
        }

        public int describeContents()
        {
            ij ij1 = CREATOR;
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
            return jD();
        }

        public int getMax()
        {
            return Wb;
        }

        public int getMin()
        {
            return Wc;
        }

        int getVersionCode()
        {
            return xH;
        }

        public boolean hasMax()
        {
            return UJ.contains(Integer.valueOf(2));
        }

        public boolean hasMin()
        {
            return UJ.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = UI.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ga.a a1 = (ga.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.ff();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public a jD()
        {
            return this;
        }

        Set ja()
        {
            return UJ;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            ij ij1 = CREATOR;
            ij.a(this, parcel, j);
        }

        static 
        {
            UI = new HashMap();
            UI.put("max", ga.a.g("max", 2));
            UI.put("min", ga.a.g("min", 3));
        }

        public a()
        {
            xH = 1;
            UJ = new HashSet();
        }

        a(Set set, int j, int k, int l)
        {
            UJ = set;
            xH = j;
            Wb = k;
            Wc = l;
        }
    }

    public static final class b extends ga
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Cover
    {

        public static final ik CREATOR = new ik();
        private static final HashMap UI;
        private final Set UJ;
        private a Wd;
        private b We;
        private int Wf;
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
            return jG();
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverInfo getCoverInfo()
        {
            return Wd;
        }

        public com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto getCoverPhoto()
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
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ga.a a1 = (ga.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.ff();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
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

        public b jG()
        {
            return this;
        }

        Set ja()
        {
            return UJ;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            ik ik1 = CREATOR;
            ik.a(this, parcel, j);
        }

        static 
        {
            UI = new HashMap();
            UI.put("coverInfo", ga.a.a("coverInfo", 2, com/google/android/gms/internal/ih$b$a));
            UI.put("coverPhoto", ga.a.a("coverPhoto", 3, com/google/android/gms/internal/ih$b$b));
            UI.put("layout", ga.a.a("layout", 4, (new fx()).f("banner", 0), false));
        }

        public b()
        {
            xH = 1;
            UJ = new HashSet();
        }

        b(Set set, int j, a a1, b b1, int k)
        {
            UJ = set;
            xH = j;
            Wd = a1;
            We = b1;
            Wf = k;
        }
    }

    public static final class b.a extends ga
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
                if (!(obj instanceof b.a))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (b.a)obj;
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
                        if (((b.a) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((b.a) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((b.a) (obj)).a(a1));
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
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ga.a a1 = (ga.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.ff();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b.a jH()
        {
            return this;
        }

        Set ja()
        {
            return UJ;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            il il1 = CREATOR;
            il.a(this, parcel, j);
        }

        static 
        {
            UI = new HashMap();
            UI.put("leftImageOffset", ga.a.g("leftImageOffset", 2));
            UI.put("topImageOffset", ga.a.g("topImageOffset", 3));
        }

        public b.a()
        {
            xH = 1;
            UJ = new HashSet();
        }

        b.a(Set set, int j, int k, int l)
        {
            UJ = set;
            xH = j;
            Wg = k;
            Wh = l;
        }
    }

    public static final class b.b extends ga
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
                if (!(obj instanceof b.b))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (b.b)obj;
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
                        if (((b.b) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((b.b) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((b.b) (obj)).a(a1));
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
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ga.a a1 = (ga.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.ff();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public b.b jI()
        {
            return this;
        }

        Set ja()
        {
            return UJ;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            im im1 = CREATOR;
            im.a(this, parcel, j);
        }

        static 
        {
            UI = new HashMap();
            UI.put("height", ga.a.g("height", 2));
            UI.put("url", ga.a.j("url", 3));
            UI.put("width", ga.a.g("width", 4));
        }

        public b.b()
        {
            xH = 1;
            UJ = new HashSet();
        }

        b.b(Set set, int j, int k, String s, int l)
        {
            UJ = set;
            xH = j;
            ks = k;
            ro = s;
            kr = l;
        }
    }

    public static final class c extends ga
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Image
    {

        public static final in CREATOR = new in();
        private static final HashMap UI;
        private final Set UJ;
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
                return ro;
            }
        }

        public int describeContents()
        {
            in in1 = CREATOR;
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
                if (!(obj instanceof c))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (c)obj;
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
                        if (((c) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((c) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((c) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return jJ();
        }

        public String getUrl()
        {
            return ro;
        }

        int getVersionCode()
        {
            return xH;
        }

        public boolean hasUrl()
        {
            return UJ.contains(Integer.valueOf(2));
        }

        public int hashCode()
        {
            Iterator iterator = UI.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ga.a a1 = (ga.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.ff();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public c jJ()
        {
            return this;
        }

        Set ja()
        {
            return UJ;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            in in1 = CREATOR;
            in.a(this, parcel, j);
        }

        static 
        {
            UI = new HashMap();
            UI.put("url", ga.a.j("url", 2));
        }

        public c()
        {
            xH = 1;
            UJ = new HashSet();
        }

        public c(String s)
        {
            UJ = new HashSet();
            xH = 1;
            ro = s;
            UJ.add(Integer.valueOf(2));
        }

        c(Set set, int j, String s)
        {
            UJ = set;
            xH = j;
            ro = s;
        }
    }

    public static final class d extends ga
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Name
    {

        public static final io CREATOR = new io();
        private static final HashMap UI;
        private final Set UJ;
        private String Vh;
        private String Vk;
        private String Wi;
        private String Wj;
        private String Wk;
        private String Wl;
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
                return Vh;

            case 3: // '\003'
                return Wi;

            case 4: // '\004'
                return Vk;

            case 5: // '\005'
                return Wj;

            case 6: // '\006'
                return Wk;

            case 7: // '\007'
                return Wl;
            }
        }

        public int describeContents()
        {
            io io1 = CREATOR;
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
                if (!(obj instanceof d))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (d)obj;
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
                        if (((d) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((d) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((d) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return jK();
        }

        public String getFamilyName()
        {
            return Vh;
        }

        public String getFormatted()
        {
            return Wi;
        }

        public String getGivenName()
        {
            return Vk;
        }

        public String getHonorificPrefix()
        {
            return Wj;
        }

        public String getHonorificSuffix()
        {
            return Wk;
        }

        public String getMiddleName()
        {
            return Wl;
        }

        int getVersionCode()
        {
            return xH;
        }

        public boolean hasFamilyName()
        {
            return UJ.contains(Integer.valueOf(2));
        }

        public boolean hasFormatted()
        {
            return UJ.contains(Integer.valueOf(3));
        }

        public boolean hasGivenName()
        {
            return UJ.contains(Integer.valueOf(4));
        }

        public boolean hasHonorificPrefix()
        {
            return UJ.contains(Integer.valueOf(5));
        }

        public boolean hasHonorificSuffix()
        {
            return UJ.contains(Integer.valueOf(6));
        }

        public boolean hasMiddleName()
        {
            return UJ.contains(Integer.valueOf(7));
        }

        public int hashCode()
        {
            Iterator iterator = UI.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ga.a a1 = (ga.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.ff();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public d jK()
        {
            return this;
        }

        Set ja()
        {
            return UJ;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            io io1 = CREATOR;
            io.a(this, parcel, j);
        }

        static 
        {
            UI = new HashMap();
            UI.put("familyName", ga.a.j("familyName", 2));
            UI.put("formatted", ga.a.j("formatted", 3));
            UI.put("givenName", ga.a.j("givenName", 4));
            UI.put("honorificPrefix", ga.a.j("honorificPrefix", 5));
            UI.put("honorificSuffix", ga.a.j("honorificSuffix", 6));
            UI.put("middleName", ga.a.j("middleName", 7));
        }

        public d()
        {
            xH = 1;
            UJ = new HashSet();
        }

        d(Set set, int j, String s, String s1, String s2, String s3, String s4, 
                String s5)
        {
            UJ = set;
            xH = j;
            Vh = s;
            Wi = s1;
            Vk = s2;
            Wj = s3;
            Wk = s4;
            Wl = s5;
        }
    }

    public static class e
    {

        public static int bi(String s)
        {
            if (s.equals("person"))
            {
                return 0;
            }
            if (s.equals("page"))
            {
                return 1;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown objectType string: ").append(s).toString());
            }
        }
    }

    public static final class f extends ga
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Organizations
    {

        public static final ip CREATOR = new ip();
        private static final HashMap UI;
        private String EB;
        private String HD;
        private int LF;
        private final Set UJ;
        private String Vg;
        private String Vw;
        private String Wm;
        private String Wn;
        private boolean Wo;
        private String mName;
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
                return Wm;

            case 3: // '\003'
                return HD;

            case 4: // '\004'
                return Vg;

            case 5: // '\005'
                return Wn;

            case 6: // '\006'
                return mName;

            case 7: // '\007'
                return Boolean.valueOf(Wo);

            case 8: // '\b'
                return Vw;

            case 9: // '\t'
                return EB;

            case 10: // '\n'
                return Integer.valueOf(LF);
            }
        }

        public int describeContents()
        {
            ip ip1 = CREATOR;
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
                if (!(obj instanceof f))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (f)obj;
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
                        if (((f) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((f) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((f) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return jL();
        }

        public String getDepartment()
        {
            return Wm;
        }

        public String getDescription()
        {
            return HD;
        }

        public String getEndDate()
        {
            return Vg;
        }

        public String getLocation()
        {
            return Wn;
        }

        public String getName()
        {
            return mName;
        }

        public String getStartDate()
        {
            return Vw;
        }

        public String getTitle()
        {
            return EB;
        }

        public int getType()
        {
            return LF;
        }

        int getVersionCode()
        {
            return xH;
        }

        public boolean hasDepartment()
        {
            return UJ.contains(Integer.valueOf(2));
        }

        public boolean hasDescription()
        {
            return UJ.contains(Integer.valueOf(3));
        }

        public boolean hasEndDate()
        {
            return UJ.contains(Integer.valueOf(4));
        }

        public boolean hasLocation()
        {
            return UJ.contains(Integer.valueOf(5));
        }

        public boolean hasName()
        {
            return UJ.contains(Integer.valueOf(6));
        }

        public boolean hasPrimary()
        {
            return UJ.contains(Integer.valueOf(7));
        }

        public boolean hasStartDate()
        {
            return UJ.contains(Integer.valueOf(8));
        }

        public boolean hasTitle()
        {
            return UJ.contains(Integer.valueOf(9));
        }

        public boolean hasType()
        {
            return UJ.contains(Integer.valueOf(10));
        }

        public int hashCode()
        {
            Iterator iterator = UI.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ga.a a1 = (ga.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.ff();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public boolean isPrimary()
        {
            return Wo;
        }

        public f jL()
        {
            return this;
        }

        Set ja()
        {
            return UJ;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            ip ip1 = CREATOR;
            ip.a(this, parcel, j);
        }

        static 
        {
            UI = new HashMap();
            UI.put("department", ga.a.j("department", 2));
            UI.put("description", ga.a.j("description", 3));
            UI.put("endDate", ga.a.j("endDate", 4));
            UI.put("location", ga.a.j("location", 5));
            UI.put("name", ga.a.j("name", 6));
            UI.put("primary", ga.a.i("primary", 7));
            UI.put("startDate", ga.a.j("startDate", 8));
            UI.put("title", ga.a.j("title", 9));
            UI.put("type", ga.a.a("type", 10, (new fx()).f("work", 0).f("school", 1), false));
        }

        public f()
        {
            xH = 1;
            UJ = new HashSet();
        }

        f(Set set, int j, String s, String s1, String s2, String s3, String s4, 
                boolean flag, String s5, String s6, int k)
        {
            UJ = set;
            xH = j;
            Wm = s;
            HD = s1;
            Vg = s2;
            Wn = s3;
            mName = s4;
            Wo = flag;
            Vw = s5;
            EB = s6;
            LF = k;
        }
    }

    public static final class g extends ga
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.PlacesLived
    {

        public static final iq CREATOR = new iq();
        private static final HashMap UI;
        private final Set UJ;
        private boolean Wo;
        private String mValue;
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
                return Boolean.valueOf(Wo);

            case 3: // '\003'
                return mValue;
            }
        }

        public int describeContents()
        {
            iq iq1 = CREATOR;
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
                if (!(obj instanceof g))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (g)obj;
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
                        if (((g) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((g) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((g) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return jM();
        }

        public String getValue()
        {
            return mValue;
        }

        int getVersionCode()
        {
            return xH;
        }

        public boolean hasPrimary()
        {
            return UJ.contains(Integer.valueOf(2));
        }

        public boolean hasValue()
        {
            return UJ.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = UI.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ga.a a1 = (ga.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.ff();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public boolean isPrimary()
        {
            return Wo;
        }

        public g jM()
        {
            return this;
        }

        Set ja()
        {
            return UJ;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            iq iq1 = CREATOR;
            iq.a(this, parcel, j);
        }

        static 
        {
            UI = new HashMap();
            UI.put("primary", ga.a.i("primary", 2));
            UI.put("value", ga.a.j("value", 3));
        }

        public g()
        {
            xH = 1;
            UJ = new HashSet();
        }

        g(Set set, int j, boolean flag, String s)
        {
            UJ = set;
            xH = j;
            Wo = flag;
            mValue = s;
        }
    }

    public static final class h extends ga
        implements SafeParcelable, com.google.android.gms.plus.model.people.Person.Urls
    {

        public static final ir CREATOR = new ir();
        private static final HashMap UI;
        private int LF;
        private final Set UJ;
        private String Wp;
        private final int Wq;
        private String mValue;
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

            case 5: // '\005'
                return Wp;

            case 6: // '\006'
                return Integer.valueOf(LF);

            case 4: // '\004'
                return mValue;
            }
        }

        public int describeContents()
        {
            ir ir1 = CREATOR;
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
                if (!(obj instanceof h))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (h)obj;
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
                        if (((h) (obj)).a(a1))
                        {
                            if (!b(a1).equals(((h) (obj)).b(a1)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((h) (obj)).a(a1));
                return false;
            }
            return true;
        }

        public Object freeze()
        {
            return jO();
        }

        public String getLabel()
        {
            return Wp;
        }

        public int getType()
        {
            return LF;
        }

        public String getValue()
        {
            return mValue;
        }

        int getVersionCode()
        {
            return xH;
        }

        public boolean hasLabel()
        {
            return UJ.contains(Integer.valueOf(5));
        }

        public boolean hasType()
        {
            return UJ.contains(Integer.valueOf(6));
        }

        public boolean hasValue()
        {
            return UJ.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = UI.values().iterator();
            int j = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ga.a a1 = (ga.a)iterator.next();
                if (a(a1))
                {
                    int k = a1.ff();
                    j = b(a1).hashCode() + (j + k);
                }
            } while (true);
            return j;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public int jN()
        {
            return 4;
        }

        public h jO()
        {
            return this;
        }

        Set ja()
        {
            return UJ;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            ir ir1 = CREATOR;
            ir.a(this, parcel, j);
        }

        static 
        {
            UI = new HashMap();
            UI.put("label", ga.a.j("label", 5));
            UI.put("type", ga.a.a("type", 6, (new fx()).f("home", 0).f("work", 1).f("blog", 2).f("profile", 3).f("other", 4).f("otherProfile", 5).f("contributor", 6).f("website", 7), false));
            UI.put("value", ga.a.j("value", 4));
        }

        public h()
        {
            Wq = 4;
            xH = 2;
            UJ = new HashSet();
        }

        h(Set set, int j, String s, int k, String s1, int l)
        {
            Wq = 4;
            UJ = set;
            xH = j;
            Wp = s;
            LF = k;
            mValue = s1;
        }
    }


    public static final ii CREATOR = new ii();
    private static final HashMap UI;
    private String HA;
    private final Set UJ;
    private String VH;
    private a VI;
    private String VJ;
    private String VK;
    private int VL;
    private b VM;
    private String VN;
    private c VO;
    private boolean VP;
    private String VQ;
    private d VR;
    private String VS;
    private int VT;
    private List VU;
    private List VV;
    private int VW;
    private int VX;
    private String VY;
    private List VZ;
    private boolean Wa;
    private int lZ;
    private String ro;
    private String wp;
    private final int xH;

    public ih()
    {
        xH = 2;
        UJ = new HashSet();
    }

    public ih(String s, String s1, c c1, int j, String s2)
    {
        xH = 2;
        UJ = new HashSet();
        HA = s;
        UJ.add(Integer.valueOf(9));
        wp = s1;
        UJ.add(Integer.valueOf(14));
        VO = c1;
        UJ.add(Integer.valueOf(15));
        VT = j;
        UJ.add(Integer.valueOf(21));
        ro = s2;
        UJ.add(Integer.valueOf(27));
    }

    ih(Set set, int j, String s, a a1, String s1, String s2, int k, 
            b b1, String s3, String s4, int l, String s5, c c1, boolean flag, 
            String s6, d d1, String s7, int i1, List list, List list1, int j1, 
            int k1, String s8, String s9, List list2, boolean flag1)
    {
        UJ = set;
        xH = j;
        VH = s;
        VI = a1;
        VJ = s1;
        VK = s2;
        VL = k;
        VM = b1;
        VN = s3;
        HA = s4;
        lZ = l;
        wp = s5;
        VO = c1;
        VP = flag;
        VQ = s6;
        VR = d1;
        VS = s7;
        VT = i1;
        VU = list;
        VV = list1;
        VW = j1;
        VX = k1;
        VY = s8;
        ro = s9;
        VZ = list2;
        Wa = flag1;
    }

    public static ih i(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR.aN(parcel);
        parcel.recycle();
        return abyte0;
    }

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
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.ff()).toString());

        case 2: // '\002'
            return VH;

        case 3: // '\003'
            return VI;

        case 4: // '\004'
            return VJ;

        case 5: // '\005'
            return VK;

        case 6: // '\006'
            return Integer.valueOf(VL);

        case 7: // '\007'
            return VM;

        case 8: // '\b'
            return VN;

        case 9: // '\t'
            return HA;

        case 12: // '\f'
            return Integer.valueOf(lZ);

        case 14: // '\016'
            return wp;

        case 15: // '\017'
            return VO;

        case 16: // '\020'
            return Boolean.valueOf(VP);

        case 18: // '\022'
            return VQ;

        case 19: // '\023'
            return VR;

        case 20: // '\024'
            return VS;

        case 21: // '\025'
            return Integer.valueOf(VT);

        case 22: // '\026'
            return VU;

        case 23: // '\027'
            return VV;

        case 24: // '\030'
            return Integer.valueOf(VW);

        case 25: // '\031'
            return Integer.valueOf(VX);

        case 26: // '\032'
            return VY;

        case 27: // '\033'
            return ro;

        case 28: // '\034'
            return VZ;

        case 29: // '\035'
            return Boolean.valueOf(Wa);
        }
    }

    public int describeContents()
    {
        ii ii1 = CREATOR;
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
            if (!(obj instanceof ih))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (ih)obj;
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
                    if (((ih) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((ih) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((ih) (obj)).a(a1));
            return false;
        }
        return true;
    }

    public Object freeze()
    {
        return jC();
    }

    public String getAboutMe()
    {
        return VH;
    }

    public com.google.android.gms.plus.model.people.Person.AgeRange getAgeRange()
    {
        return VI;
    }

    public String getBirthday()
    {
        return VJ;
    }

    public String getBraggingRights()
    {
        return VK;
    }

    public int getCircledByCount()
    {
        return VL;
    }

    public com.google.android.gms.plus.model.people.Person.Cover getCover()
    {
        return VM;
    }

    public String getCurrentLocation()
    {
        return VN;
    }

    public String getDisplayName()
    {
        return HA;
    }

    public int getGender()
    {
        return lZ;
    }

    public String getId()
    {
        return wp;
    }

    public com.google.android.gms.plus.model.people.Person.Image getImage()
    {
        return VO;
    }

    public String getLanguage()
    {
        return VQ;
    }

    public com.google.android.gms.plus.model.people.Person.Name getName()
    {
        return VR;
    }

    public String getNickname()
    {
        return VS;
    }

    public int getObjectType()
    {
        return VT;
    }

    public List getOrganizations()
    {
        return (ArrayList)VU;
    }

    public List getPlacesLived()
    {
        return (ArrayList)VV;
    }

    public int getPlusOneCount()
    {
        return VW;
    }

    public int getRelationshipStatus()
    {
        return VX;
    }

    public String getTagline()
    {
        return VY;
    }

    public String getUrl()
    {
        return ro;
    }

    public List getUrls()
    {
        return (ArrayList)VZ;
    }

    int getVersionCode()
    {
        return xH;
    }

    public boolean hasAboutMe()
    {
        return UJ.contains(Integer.valueOf(2));
    }

    public boolean hasAgeRange()
    {
        return UJ.contains(Integer.valueOf(3));
    }

    public boolean hasBirthday()
    {
        return UJ.contains(Integer.valueOf(4));
    }

    public boolean hasBraggingRights()
    {
        return UJ.contains(Integer.valueOf(5));
    }

    public boolean hasCircledByCount()
    {
        return UJ.contains(Integer.valueOf(6));
    }

    public boolean hasCover()
    {
        return UJ.contains(Integer.valueOf(7));
    }

    public boolean hasCurrentLocation()
    {
        return UJ.contains(Integer.valueOf(8));
    }

    public boolean hasDisplayName()
    {
        return UJ.contains(Integer.valueOf(9));
    }

    public boolean hasGender()
    {
        return UJ.contains(Integer.valueOf(12));
    }

    public boolean hasId()
    {
        return UJ.contains(Integer.valueOf(14));
    }

    public boolean hasImage()
    {
        return UJ.contains(Integer.valueOf(15));
    }

    public boolean hasIsPlusUser()
    {
        return UJ.contains(Integer.valueOf(16));
    }

    public boolean hasLanguage()
    {
        return UJ.contains(Integer.valueOf(18));
    }

    public boolean hasName()
    {
        return UJ.contains(Integer.valueOf(19));
    }

    public boolean hasNickname()
    {
        return UJ.contains(Integer.valueOf(20));
    }

    public boolean hasObjectType()
    {
        return UJ.contains(Integer.valueOf(21));
    }

    public boolean hasOrganizations()
    {
        return UJ.contains(Integer.valueOf(22));
    }

    public boolean hasPlacesLived()
    {
        return UJ.contains(Integer.valueOf(23));
    }

    public boolean hasPlusOneCount()
    {
        return UJ.contains(Integer.valueOf(24));
    }

    public boolean hasRelationshipStatus()
    {
        return UJ.contains(Integer.valueOf(25));
    }

    public boolean hasTagline()
    {
        return UJ.contains(Integer.valueOf(26));
    }

    public boolean hasUrl()
    {
        return UJ.contains(Integer.valueOf(27));
    }

    public boolean hasUrls()
    {
        return UJ.contains(Integer.valueOf(28));
    }

    public boolean hasVerified()
    {
        return UJ.contains(Integer.valueOf(29));
    }

    public int hashCode()
    {
        Iterator iterator = UI.values().iterator();
        int j = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ga.a a1 = (ga.a)iterator.next();
            if (a(a1))
            {
                int k = a1.ff();
                j = b(a1).hashCode() + (j + k);
            }
        } while (true);
        return j;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isPlusUser()
    {
        return VP;
    }

    public boolean isVerified()
    {
        return Wa;
    }

    List jA()
    {
        return VV;
    }

    List jB()
    {
        return VZ;
    }

    public ih jC()
    {
        return this;
    }

    Set ja()
    {
        return UJ;
    }

    a jv()
    {
        return VI;
    }

    b jw()
    {
        return VM;
    }

    c jx()
    {
        return VO;
    }

    d jy()
    {
        return VR;
    }

    List jz()
    {
        return VU;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        ii ii1 = CREATOR;
        ii.a(this, parcel, j);
    }

    static 
    {
        UI = new HashMap();
        UI.put("aboutMe", ga.a.j("aboutMe", 2));
        UI.put("ageRange", ga.a.a("ageRange", 3, com/google/android/gms/internal/ih$a));
        UI.put("birthday", ga.a.j("birthday", 4));
        UI.put("braggingRights", ga.a.j("braggingRights", 5));
        UI.put("circledByCount", ga.a.g("circledByCount", 6));
        UI.put("cover", ga.a.a("cover", 7, com/google/android/gms/internal/ih$b));
        UI.put("currentLocation", ga.a.j("currentLocation", 8));
        UI.put("displayName", ga.a.j("displayName", 9));
        UI.put("gender", ga.a.a("gender", 12, (new fx()).f("male", 0).f("female", 1).f("other", 2), false));
        UI.put("id", ga.a.j("id", 14));
        UI.put("image", ga.a.a("image", 15, com/google/android/gms/internal/ih$c));
        UI.put("isPlusUser", ga.a.i("isPlusUser", 16));
        UI.put("language", ga.a.j("language", 18));
        UI.put("name", ga.a.a("name", 19, com/google/android/gms/internal/ih$d));
        UI.put("nickname", ga.a.j("nickname", 20));
        UI.put("objectType", ga.a.a("objectType", 21, (new fx()).f("person", 0).f("page", 1), false));
        UI.put("organizations", ga.a.b("organizations", 22, com/google/android/gms/internal/ih$f));
        UI.put("placesLived", ga.a.b("placesLived", 23, com/google/android/gms/internal/ih$g));
        UI.put("plusOneCount", ga.a.g("plusOneCount", 24));
        UI.put("relationshipStatus", ga.a.a("relationshipStatus", 25, (new fx()).f("single", 0).f("in_a_relationship", 1).f("engaged", 2).f("married", 3).f("its_complicated", 4).f("open_relationship", 5).f("widowed", 6).f("in_domestic_partnership", 7).f("in_civil_union", 8), false));
        UI.put("tagline", ga.a.j("tagline", 26));
        UI.put("url", ga.a.j("url", 27));
        UI.put("urls", ga.a.b("urls", 28, com/google/android/gms/internal/ih$h));
        UI.put("verified", ga.a.i("verified", 29));
    }
}
