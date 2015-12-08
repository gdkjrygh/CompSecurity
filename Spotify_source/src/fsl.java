// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import java.util.concurrent.TimeUnit;

public interface fsl
{

    public static final long a = TimeUnit.MINUTES.toMillis(15L);

    public abstract void a();

    public abstract void a(Offer offer);

    public abstract void a(fsm fsm);

    public abstract boolean b();

}
