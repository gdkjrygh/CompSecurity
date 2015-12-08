// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            p, a

public class Session
    implements SafeParcelable
{
    public static class Builder
    {

        private long LW;
        private long TO;
        private int TZ;
        private String UN;
        private String UO;
        private a Um;
        private String mName;

        static long a(Builder builder)
        {
            return builder.LW;
        }

        static long b(Builder builder)
        {
            return builder.TO;
        }

        static String c(Builder builder)
        {
            return builder.mName;
        }

        static String d(Builder builder)
        {
            return builder.UN;
        }

        static String e(Builder builder)
        {
            return builder.UO;
        }

        static int f(Builder builder)
        {
            return builder.TZ;
        }

        static a g(Builder builder)
        {
            return builder.Um;
        }

        public Session build()
        {
label0:
            {
                boolean flag1 = false;
                StringBuilder stringbuilder;
                boolean flag;
                if (LW > 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.google.android.gms.internal.jx.a(flag, "Start time should be specified.");
                if (TO != 0L)
                {
                    flag = flag1;
                    if (TO <= LW)
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            com.google.android.gms.internal.jx.a(flag, "End time should be later than start time.");
            if (UN == null)
            {
                stringbuilder = new StringBuilder();
                String s;
                if (mName == null)
                {
                    s = "";
                } else
                {
                    s = mName;
                }
                UN = stringbuilder.append(s).append(LW).toString();
            }
            return new Session(this);
        }

        public Builder cV(int i)
        {
            TZ = i;
            return this;
        }

        public Builder setActivity(String s)
        {
            return cV(FitnessActivities.bs(s));
        }

        public Builder setDescription(String s)
        {
            boolean flag;
            if (s.length() <= 1000)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.gms.internal.jx.b(flag, "Session description cannot exceed %d characters", new Object[] {
                Integer.valueOf(1000)
            });
            UO = s;
            return this;
        }

        public Builder setEndTime(long l, TimeUnit timeunit)
        {
            boolean flag;
            if (l >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.gms.internal.jx.a(flag, "End time should be positive.");
            TO = timeunit.toMillis(l);
            return this;
        }

        public Builder setIdentifier(String s)
        {
            boolean flag;
            if (s != null && TextUtils.getTrimmedLength(s) > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.gms.internal.jx.L(flag);
            UN = s;
            return this;
        }

        public Builder setName(String s)
        {
            boolean flag;
            if (s.length() <= 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.gms.internal.jx.b(flag, "Session name cannot exceed %d characters", new Object[] {
                Integer.valueOf(100)
            });
            mName = s;
            return this;
        }

        public Builder setStartTime(long l, TimeUnit timeunit)
        {
            boolean flag;
            if (l > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.gms.internal.jx.a(flag, "Start time should be positive.");
            LW = timeunit.toMillis(l);
            return this;
        }

        public Builder()
        {
            LW = 0L;
            TO = 0L;
            mName = null;
            TZ = 4;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new p();
    public static final String EXTRA_SESSION = "vnd.google.fitness.session";
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";
    private final int CK;
    private final long LW;
    private final long TO;
    private final int TZ;
    private final String UN;
    private final String UO;
    private final a Um;
    private final String mName;

    Session(int i, long l, long l1, String s, String s1, 
            String s2, int j, a a1)
    {
        CK = i;
        LW = l;
        TO = l1;
        mName = s;
        UN = s1;
        UO = s2;
        TZ = j;
        Um = a1;
    }

    private Session(Builder builder)
    {
        CK = 2;
        LW = Builder.a(builder);
        TO = Builder.b(builder);
        mName = com.google.android.gms.fitness.data.Builder.c(builder);
        UN = Builder.d(builder);
        UO = Builder.e(builder);
        TZ = Builder.f(builder);
        Um = Builder.g(builder);
    }


    private boolean a(Session session)
    {
        return LW == session.LW && TO == session.TO && jv.equal(mName, session.mName) && jv.equal(UN, session.UN) && jv.equal(UO, session.UO) && jv.equal(Um, session.Um) && TZ == session.TZ;
    }

    public static Session extract(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return (Session)c.a(intent, "vnd.google.fitness.session", CREATOR);
        }
    }

    public static String getMimeType(String s)
    {
        return (new StringBuilder()).append("vnd.google.fitness.session/").append(s).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof Session) && a((Session)obj);
    }

    public String getActivity()
    {
        return FitnessActivities.getName(TZ);
    }

    public String getAppPackageName()
    {
        if (Um == null)
        {
            return null;
        } else
        {
            return Um.getPackageName();
        }
    }

    public String getDescription()
    {
        return UO;
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(TO, TimeUnit.MILLISECONDS);
    }

    public String getIdentifier()
    {
        return UN;
    }

    public String getName()
    {
        return mName;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(LW, TimeUnit.MILLISECONDS);
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Long.valueOf(LW), Long.valueOf(TO), UN
        });
    }

    public boolean isOngoing()
    {
        return TO == 0L;
    }

    public int jm()
    {
        return TZ;
    }

    public long jo()
    {
        return LW;
    }

    public long jp()
    {
        return TO;
    }

    public a jx()
    {
        return Um;
    }

    public String toString()
    {
        return jv.h(this).a("startTime", Long.valueOf(LW)).a("endTime", Long.valueOf(TO)).a("name", mName).a("identifier", UN).a("description", UO).a("activity", Integer.valueOf(TZ)).a("application", Um).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel, i);
    }

}
