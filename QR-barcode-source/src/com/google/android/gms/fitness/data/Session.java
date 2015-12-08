// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            p, a

public class Session
    implements SafeParcelable
{
    public static class Builder
    {

        private long KS;
        private int SC;
        private a SP;
        private long Sr;
        private String Tq;
        private String Tr;
        private String mName;

        static long a(Builder builder)
        {
            return builder.KS;
        }

        static long b(Builder builder)
        {
            return builder.Sr;
        }

        static String c(Builder builder)
        {
            return builder.mName;
        }

        static String d(Builder builder)
        {
            return builder.Tq;
        }

        static String e(Builder builder)
        {
            return builder.Tr;
        }

        static int f(Builder builder)
        {
            return builder.SC;
        }

        static a g(Builder builder)
        {
            return builder.SP;
        }

        public Session build()
        {
label0:
            {
                boolean flag1 = false;
                StringBuilder stringbuilder;
                boolean flag;
                if (KS > 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                o.a(flag, "Start time should be specified.");
                if (Sr != 0L)
                {
                    flag = flag1;
                    if (Sr <= KS)
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            o.a(flag, "End time should be later than start time.");
            if (Tq == null)
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
                Tq = stringbuilder.append(s).append(KS).toString();
            }
            return new Session(this);
        }

        public Builder cK(int i)
        {
            SC = i;
            return this;
        }

        public Builder setActivity(String s)
        {
            return cK(FitnessActivities.bp(s));
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
            o.b(flag, "Session description cannot exceed %d characters", new Object[] {
                Integer.valueOf(1000)
            });
            Tr = s;
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
            o.a(flag, "End time should be positive.");
            Sr = timeunit.toMillis(l);
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
            o.K(flag);
            Tq = s;
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
            o.b(flag, "Session name cannot exceed %d characters", new Object[] {
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
            o.a(flag, "Start time should be positive.");
            KS = timeunit.toMillis(l);
            return this;
        }

        public Builder()
        {
            KS = 0L;
            Sr = 0L;
            mName = null;
            SC = 4;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new p();
    public static final String EXTRA_SESSION = "vnd.google.fitness.session";
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";
    private final int BR;
    private final long KS;
    private final int SC;
    private final a SP;
    private final long Sr;
    private final String Tq;
    private final String Tr;
    private final String mName;

    Session(int i, long l, long l1, String s, String s1, 
            String s2, int j, a a1)
    {
        BR = i;
        KS = l;
        Sr = l1;
        mName = s;
        Tq = s1;
        Tr = s2;
        SC = j;
        SP = a1;
    }

    private Session(Builder builder)
    {
        BR = 2;
        KS = Builder.a(builder);
        Sr = Builder.b(builder);
        mName = com.google.android.gms.fitness.data.Builder.c(builder);
        Tq = Builder.d(builder);
        Tr = Builder.e(builder);
        SC = Builder.f(builder);
        SP = Builder.g(builder);
    }


    private boolean a(Session session)
    {
        return KS == session.KS && Sr == session.Sr && n.equal(mName, session.mName) && n.equal(Tq, session.Tq) && n.equal(Tr, session.Tr) && n.equal(SP, session.SP) && SC == session.SC;
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
        return FitnessActivities.getName(SC);
    }

    public String getAppPackageName()
    {
        if (SP == null)
        {
            return null;
        } else
        {
            return SP.getPackageName();
        }
    }

    public String getDescription()
    {
        return Tr;
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(Sr, TimeUnit.MILLISECONDS);
    }

    public String getIdentifier()
    {
        return Tq;
    }

    public String getName()
    {
        return mName;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(KS, TimeUnit.MILLISECONDS);
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Long.valueOf(KS), Long.valueOf(Sr), Tq
        });
    }

    public int iB()
    {
        return SC;
    }

    public long iD()
    {
        return KS;
    }

    public long iE()
    {
        return Sr;
    }

    public a iM()
    {
        return SP;
    }

    public boolean isOngoing()
    {
        return Sr == 0L;
    }

    public String toString()
    {
        return n.h(this).a("startTime", Long.valueOf(KS)).a("endTime", Long.valueOf(Sr)).a("name", mName).a("identifier", Tq).a("description", Tr).a("activity", Integer.valueOf(SC)).a("application", SP).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel, i);
    }

}
