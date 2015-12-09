// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.audience.widgets;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.jh;
import com.google.android.gms.internal.ji;
import com.google.android.gms.internal.kn;
import java.util.Iterator;
import java.util.List;

public final class AudienceView extends FrameLayout
{
    public static interface EditAudienceCallback
    {
    }

    public static interface RemoveAudienceMemberCallback
    {
    }

    static final class a extends com.google.android.gms.internal.jh.a
    {

        private Audience TK;
        private TextView TL;

        public final void a(d d, d d1, ji ji)
        {
            TL = new TextView((Context)e.i(d));
        }

        public final void cT(int i)
        {
        }

        public final d getView()
        {
            return e.q(TL);
        }

        public final void onRestoreInstanceState(Bundle bundle)
        {
            setAudience((Audience)bundle.getParcelable("audience"));
        }

        public final Bundle onSaveInstanceState()
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("audience", TK);
            return bundle;
        }

        public final void setAudience(Audience audience)
        {
            TK = audience;
            if (TK == null)
            {
                TL.setText("");
                return;
            }
            Iterator iterator = audience.getAudienceMemberList().iterator();
            audience = null;
            while (iterator.hasNext()) 
            {
                AudienceMember audiencemember = (AudienceMember)iterator.next();
                StringBuilder stringbuilder = new StringBuilder();
                if (audience == null)
                {
                    audience = "";
                } else
                {
                    audience = (new StringBuilder()).append(audience).append(", ").toString();
                }
                audience = stringbuilder.append(audience).append(audiencemember.getDisplayName()).toString();
            }
            TL.setText(audience);
        }

        public final void setIsUnderageAccount(boolean flag)
        {
        }

        public final void setShowEmptyText(boolean flag)
        {
        }

        private a()
        {
        }

    }


    public static final int EDIT_MODE_CLICK_TO_EDIT = 3;
    public static final int EDIT_MODE_CLICK_TO_REMOVE = 2;
    public static final int EDIT_MODE_READ_ONLY = 1;
    private static Context TE;
    private final Context TF;
    private final jh TG;
    private EditAudienceCallback TH;
    private RemoveAudienceMemberCallback TI;

    public AudienceView(Context context)
    {
        this(context, null, 0);
    }

    public AudienceView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AudienceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = I(context);
        TG = (jh)((Pair) (context)).first;
        TF = (Context)((Pair) (context)).second;
        try
        {
            TG.a(e.q(getContext()), e.q(TF), new com.google.android.gms.internal.ji.a() {

                final AudienceView TJ;

                public final void editAudience()
                {
                    AudienceView.b(TJ);
                }

                public final void removeAudienceMember(AudienceMember audiencemember)
                {
                    AudienceView.a(TJ);
                }

            
            {
                TJ = AudienceView.this;
                super();
            }
            });
            addView((View)e.i(TG.getView()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private static Pair I(Context context)
    {
        if (TE == null)
        {
            TE = GooglePlayServicesUtil.getRemoteContext(context);
        }
        if (TE == null) goto _L2; else goto _L1
_L1:
        Object obj = TE.getClassLoader();
        obj = new Pair(com.google.android.gms.internal.jh.a.aS((IBinder)((ClassLoader) (obj)).loadClass("com.google.android.gms.plus.audience.widgets.AudienceViewImpl$DynamiteHost").newInstance()), TE);
        return ((Pair) (obj));
        Object obj1;
        obj1;
_L4:
        if (Log.isLoggable("AudienceView", 3))
        {
            Log.d("AudienceView", "Can't load com.google.android.gms.plus.audience.widgets.AudienceViewImpl$DynamiteHost", ((Throwable) (obj1)));
        }
_L2:
        return new Pair(new a(), context);
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static RemoveAudienceMemberCallback a(AudienceView audienceview)
    {
        return audienceview.TI;
    }

    private void a(int i, EditAudienceCallback editaudiencecallback, RemoveAudienceMemberCallback removeaudiencemembercallback)
    {
        TH = editaudiencecallback;
        TI = removeaudiencemembercallback;
        try
        {
            TG.cT(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EditAudienceCallback editaudiencecallback)
        {
            return;
        }
    }

    static EditAudienceCallback b(AudienceView audienceview)
    {
        return audienceview.TH;
    }

    protected final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (Bundle)parcelable;
        super.onRestoreInstanceState(parcelable.getParcelable("parent"));
        try
        {
            TG.onRestoreInstanceState(parcelable.getBundle("impl"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcelable parcelable)
        {
            return;
        }
    }

    protected final Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        try
        {
            bundle.putBundle("impl", TG.onSaveInstanceState());
        }
        catch (RemoteException remoteexception)
        {
            return bundle;
        }
        return bundle;
    }

    public final void setAudience(Audience audience)
    {
        try
        {
            TG.setAudience(audience);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Audience audience)
        {
            return;
        }
    }

    public final void setIsUnderageAccount(boolean flag)
    {
        try
        {
            TG.setIsUnderageAccount(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }

    public final void setModeClickToEdit(EditAudienceCallback editaudiencecallback)
    {
        a(3, (EditAudienceCallback)kn.k(editaudiencecallback), null);
    }

    public final void setModeClickToRemove(RemoveAudienceMemberCallback removeaudiencemembercallback)
    {
        a(2, null, (RemoveAudienceMemberCallback)kn.k(removeaudiencemembercallback));
    }

    public final void setModeReadonly()
    {
        a(1, null, null);
    }

    public final void setShowEmptyText(boolean flag)
    {
        try
        {
            TG.setShowEmptyText(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }
}
