// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.pd;
import com.google.android.gms.internal.pf;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            ItemScope

public interface Moment
    extends Freezable
{
    public static class Builder
    {

        private String CE;
        private final Set aon = new HashSet();
        private String apa;
        private pd api;
        private pd apj;
        private String vc;

        public Moment build()
        {
            return new pf(aon, CE, api, apa, apj, vc);
        }

        public Builder setId(String s)
        {
            CE = s;
            aon.add(Integer.valueOf(2));
            return this;
        }

        public Builder setResult(ItemScope itemscope)
        {
            api = (pd)itemscope;
            aon.add(Integer.valueOf(4));
            return this;
        }

        public Builder setStartDate(String s)
        {
            apa = s;
            aon.add(Integer.valueOf(5));
            return this;
        }

        public Builder setTarget(ItemScope itemscope)
        {
            apj = (pd)itemscope;
            aon.add(Integer.valueOf(6));
            return this;
        }

        public Builder setType(String s)
        {
            vc = s;
            aon.add(Integer.valueOf(7));
            return this;
        }

        public Builder()
        {
        }
    }


    public abstract String getId();

    public abstract ItemScope getResult();

    public abstract String getStartDate();

    public abstract ItemScope getTarget();

    public abstract String getType();

    public abstract boolean hasId();

    public abstract boolean hasResult();

    public abstract boolean hasStartDate();

    public abstract boolean hasTarget();

    public abstract boolean hasType();
}
