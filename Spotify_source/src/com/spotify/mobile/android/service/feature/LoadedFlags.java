// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.feature;

import android.os.Parcel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import dxa;
import fym;
import fyq;
import fyu;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class LoadedFlags
    implements Flags
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new LoadedFlags(parcel.readHashMap(getClass().getClassLoader()), parcel.readHashMap(getClass().getClassLoader()), new WeakReference(null), (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new LoadedFlags[i];
        }

    };
    private final HashMap a;
    private final Map b;
    private final WeakReference c;

    private LoadedFlags(HashMap hashmap, HashMap hashmap1, WeakReference weakreference)
    {
        a = hashmap;
        b = hashmap1;
        c = weakreference;
    }

    LoadedFlags(HashMap hashmap, HashMap hashmap1, WeakReference weakreference, byte byte0)
    {
        this(hashmap, hashmap1, weakreference);
    }

    private Serializable c(fyu fyu1)
    {
        if (b.containsKey(fyu1.b))
        {
            return (Serializable)b.get(fyu1.b);
        } else
        {
            return (Serializable)a.get(fyu1.b);
        }
    }

    public final Serializable a(fyu fyu1)
    {
        Serializable serializable;
        dxa dxa1;
label0:
        {
            if (b.containsKey(fyu1.b))
            {
                serializable = (Serializable)b.get(fyu1.b);
            } else
            {
                serializable = (Serializable)a.get(fyu1.b);
            }
            if (serializable == null)
            {
                throw new IllegalStateException((new StringBuilder("Value for ")).append(fyu1.b).append(" has not been set").toString());
            }
            if (fyu1.c instanceof fym)
            {
                dxa1 = (dxa)c.get();
                if (dxa1 != null)
                {
                    if (!(fyu1 instanceof fyq))
                    {
                        break label0;
                    }
                    Object obj = (fyq)fyu1;
                    if (((fyq) (obj)).a.containsKey(serializable))
                    {
                        obj = (String)((fyq) (obj)).a.get(serializable);
                    } else
                    {
                        obj = "";
                    }
                    dxa1.a(fyu1, ((Serializable) (obj)));
                }
            }
            return serializable;
        }
        dxa1.a(fyu1, serializable);
        return serializable;
    }

    public final boolean a(Flags flags, fyu fyu1)
    {
        if (flags instanceof LoadedFlags)
        {
            flags = (LoadedFlags)flags;
            return c(fyu1).equals(flags.c(fyu1));
        } else
        {
            return c(fyu1).equals(flags.a(fyu1));
        }
    }

    public final Serializable b(fyu fyu1)
    {
        return (Serializable)a.get(fyu1.b);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeMap(a);
        parcel.writeMap(b);
    }

}
