// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.fq;
import com.google.android.gms.internal.fs;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            ItemScope

public interface Moment
    extends Freezable
{
    public static class Builder
    {

        private final Set rI = new HashSet();
        private String sD;
        private fq sG;
        private fq sH;
        private String sm;
        private String sx;

        public Moment build()
        {
            return new fs(rI, sm, sG, sx, sH, sD);
        }

        public Builder setId(String s)
        {
            sm = s;
            rI.add(Integer.valueOf(2));
            return this;
        }

        public Builder setResult(ItemScope itemscope)
        {
            sG = (fq)itemscope;
            rI.add(Integer.valueOf(4));
            return this;
        }

        public Builder setStartDate(String s)
        {
            sx = s;
            rI.add(Integer.valueOf(5));
            return this;
        }

        public Builder setTarget(ItemScope itemscope)
        {
            sH = (fq)itemscope;
            rI.add(Integer.valueOf(6));
            return this;
        }

        public Builder setType(String s)
        {
            sD = s;
            rI.add(Integer.valueOf(7));
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
