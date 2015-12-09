// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.internal.zzhr;
import com.google.android.gms.internal.zzhz;
import com.google.android.gms.internal.zzia;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            zza, SafeParcelResponse, FieldMappingDictionary

public abstract class FastJsonResponse
{
    public static class Field
        implements SafeParcelable
    {

        public static final com.google.android.gms.common.server.response.zza CREATOR = new com.google.android.gms.common.server.response.zza();
        protected final int zzUA;
        protected final boolean zzUB;
        protected final String zzUC;
        protected final int zzUD;
        protected final Class zzUE;
        protected final String zzUF;
        private FieldMappingDictionary zzUG;
        private zza zzUH;
        protected final int zzUy;
        protected final boolean zzUz;
        private final int zzzH;

        public static Field zza(String s, int i, zza zza1, boolean flag)
        {
            return new Field(zza1.zzmw(), flag, zza1.zzmx(), false, s, i, null, zza1);
        }

        public static Field zza(String s, int i, Class class1)
        {
            return new Field(11, false, 11, false, s, i, class1, null);
        }

        public static Field zzb(String s, int i, Class class1)
        {
            return new Field(11, true, 11, true, s, i, class1, null);
        }

        static zza zzc(Field field)
        {
            return field.zzUH;
        }

        public static Field zzh(String s, int i)
        {
            return new Field(0, false, 0, false, s, i, null, null);
        }

        public static Field zzi(String s, int i)
        {
            return new Field(4, false, 4, false, s, i, null, null);
        }

        public static Field zzj(String s, int i)
        {
            return new Field(6, false, 6, false, s, i, null, null);
        }

        public static Field zzk(String s, int i)
        {
            return new Field(7, false, 7, false, s, i, null, null);
        }

        public static Field zzl(String s, int i)
        {
            return new Field(7, true, 7, true, s, i, null, null);
        }

        public Object convertBack(Object obj)
        {
            return zzUH.convertBack(obj);
        }

        public int describeContents()
        {
            com.google.android.gms.common.server.response.zza zza1 = CREATOR;
            return 0;
        }

        public int getVersionCode()
        {
            return zzzH;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(zzzH).append('\n');
            stringbuilder.append("                 typeIn=").append(zzUy).append('\n');
            stringbuilder.append("            typeInArray=").append(zzUz).append('\n');
            stringbuilder.append("                typeOut=").append(zzUA).append('\n');
            stringbuilder.append("           typeOutArray=").append(zzUB).append('\n');
            stringbuilder.append("        outputFieldName=").append(zzUC).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(zzUD).append('\n');
            stringbuilder.append("       concreteTypeName=").append(zzmH()).append('\n');
            if (zzmG() != null)
            {
                stringbuilder.append("     concreteType.class=").append(zzmG().getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (zzUH == null)
            {
                s = "null";
            } else
            {
                s = zzUH.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            com.google.android.gms.common.server.response.zza zza1 = CREATOR;
            com.google.android.gms.common.server.response.zza.zza(this, parcel, i);
        }

        public void zza(FieldMappingDictionary fieldmappingdictionary)
        {
            zzUG = fieldmappingdictionary;
        }

        public Field zzmB()
        {
            return new Field(zzzH, zzUy, zzUz, zzUA, zzUB, zzUC, zzUD, zzUF, zzmJ());
        }

        public boolean zzmC()
        {
            return zzUz;
        }

        public boolean zzmD()
        {
            return zzUB;
        }

        public String zzmE()
        {
            return zzUC;
        }

        public int zzmF()
        {
            return zzUD;
        }

        public Class zzmG()
        {
            return zzUE;
        }

        String zzmH()
        {
            if (zzUF == null)
            {
                return null;
            } else
            {
                return zzUF;
            }
        }

        public boolean zzmI()
        {
            return zzUH != null;
        }

        ConverterWrapper zzmJ()
        {
            if (zzUH == null)
            {
                return null;
            } else
            {
                return ConverterWrapper.zza(zzUH);
            }
        }

        public Map zzmK()
        {
            zzv.zzr(zzUF);
            zzv.zzr(zzUG);
            return zzUG.zzbX(zzUF);
        }

        public int zzmw()
        {
            return zzUy;
        }

        public int zzmx()
        {
            return zzUA;
        }


        Field(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
                String s1, ConverterWrapper converterwrapper)
        {
            zzzH = i;
            zzUy = j;
            zzUz = flag;
            zzUA = k;
            zzUB = flag1;
            zzUC = s;
            zzUD = l;
            if (s1 == null)
            {
                zzUE = null;
                zzUF = null;
            } else
            {
                zzUE = com/google/android/gms/common/server/response/SafeParcelResponse;
                zzUF = s1;
            }
            if (converterwrapper == null)
            {
                zzUH = null;
                return;
            } else
            {
                zzUH = converterwrapper.zzmu();
                return;
            }
        }

        protected Field(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
                zza zza1)
        {
            zzzH = 1;
            zzUy = i;
            zzUz = flag;
            zzUA = j;
            zzUB = flag1;
            zzUC = s;
            zzUD = k;
            zzUE = class1;
            if (class1 == null)
            {
                zzUF = null;
            } else
            {
                zzUF = class1.getCanonicalName();
            }
            zzUH = zza1;
        }
    }

    public static interface zza
    {

        public abstract Object convertBack(Object obj);

        public abstract int zzmw();

        public abstract int zzmx();
    }


    public FastJsonResponse()
    {
    }

    private void zza(StringBuilder stringbuilder, Field field, Object obj)
    {
        if (field.zzmw() == 11)
        {
            stringbuilder.append(((FastJsonResponse)field.zzmG().cast(obj)).toString());
            return;
        }
        if (field.zzmw() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(zzhz.zzbY((String)obj));
            stringbuilder.append("\"");
            return;
        } else
        {
            stringbuilder.append(obj);
            return;
        }
    }

    private void zza(StringBuilder stringbuilder, Field field, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            Object obj = arraylist.get(i);
            if (obj != null)
            {
                zza(stringbuilder, field, obj);
            }
        }

        stringbuilder.append("]");
    }

    public String toString()
    {
        Map map = zzmy();
        StringBuilder stringbuilder = new StringBuilder(100);
        Iterator iterator = map.keySet().iterator();
label0:
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                Field field = (Field)map.get(s);
                if (zza(field))
                {
                    Object obj = zza(field, zzb(field));
                    if (stringbuilder.length() == 0)
                    {
                        stringbuilder.append("{");
                    } else
                    {
                        stringbuilder.append(",");
                    }
                    stringbuilder.append("\"").append(s).append("\":");
                    if (obj == null)
                    {
                        stringbuilder.append("null");
                    } else
                    {
                        switch (field.zzmx())
                        {
                        default:
                            if (field.zzmC())
                            {
                                zza(stringbuilder, field, (ArrayList)obj);
                            } else
                            {
                                zza(stringbuilder, field, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(zzhr.zzg((byte[])(byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(zzhr.zzh((byte[])(byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            zzia.zza(stringbuilder, (HashMap)obj);
                            break;
                        }
                        continue label0;
                    }
                }
            } while (true);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("}");
            } else
            {
                stringbuilder.append("{}");
            }
            return stringbuilder.toString();
        } while (true);
    }

    protected Object zza(Field field, Object obj)
    {
        Object obj1 = obj;
        if (Field.zzc(field) != null)
        {
            obj1 = field.convertBack(obj);
        }
        return obj1;
    }

    protected boolean zza(Field field)
    {
        if (field.zzmx() == 11)
        {
            if (field.zzmD())
            {
                return zzbW(field.zzmE());
            } else
            {
                return zzbV(field.zzmE());
            }
        } else
        {
            return zzbU(field.zzmE());
        }
    }

    protected Object zzb(Field field)
    {
        String s = field.zzmE();
        if (field.zzmG() != null)
        {
            boolean flag;
            if (zzbT(field.zzmE()) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzv.zza(flag, "Concrete field shouldn't be value object: %s", new Object[] {
                field.zzmE()
            });
            if (field.zzmD())
            {
                field = zzmA();
            } else
            {
                field = zzmz();
            }
            if (field != null)
            {
                return field.get(s);
            }
            try
            {
                field = (new StringBuilder()).append("get").append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
                field = ((Field) (getClass().getMethod(field, new Class[0]).invoke(this, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Field field)
            {
                throw new RuntimeException(field);
            }
            return field;
        } else
        {
            return zzbT(field.zzmE());
        }
    }

    protected abstract Object zzbT(String s);

    protected abstract boolean zzbU(String s);

    protected boolean zzbV(String s)
    {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected boolean zzbW(String s)
    {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public HashMap zzmA()
    {
        return null;
    }

    public abstract Map zzmy();

    public HashMap zzmz()
    {
        return null;
    }
}
