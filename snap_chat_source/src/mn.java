// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import com.snapchat.android.Timber;
import com.snapchat.android.model.FriendManager;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

public final class mn extends oD
    implements oS.a
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(Bx bx);

        public abstract void a(String s);

        public abstract void a(List list);

        public abstract void b(List list);

        public abstract void c(List list);

        public abstract void d(List list);
    }


    private static final String TAG = "GetLocationDataTask";
    final a mCallback;
    final LB mExceptionReporter;
    final FriendManager mFriendManager;
    private final Location mLocation;
    private final String mPreviousRequestChecksum;
    private final mB mScreenParameterProvider;

    public mn(a a1, Location location, String s)
    {
        this(a1, location, s, new LB(), mB.a(), FriendManager.e());
    }

    private mn(a a1, Location location, String s, LB lb, mB mb, FriendManager friendmanager)
    {
        mCallback = a1;
        mLocation = location;
        mPreviousRequestChecksum = s;
        mExceptionReporter = lb;
        mScreenParameterProvider = mb;
        mFriendManager = friendmanager;
        registerCallback(RF, this);
    }

    static void a(mn mn1, List list)
    {
        PG.a();
        Timber.c("GetLocationDataTask", "Updating Shared stories", new Object[0]);
        mn1.mCallback.b(list);
    }

    public final String getPath()
    {
        return "/loq/loc_data";
    }

    public final pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new RE()).a(Double.valueOf(mLocation.getLatitude())).b(Double.valueOf(mLocation.getLongitude())).c(Double.valueOf(mLocation.getAccuracy())).a(mPreviousRequestChecksum).a(Float.valueOf(mScreenParameterProvider.mScreenFullWidthIn)).b(Float.valueOf(mScreenParameterProvider.mScreenFullHeightIn)).a(Integer.valueOf(mScreenParameterProvider.mScreenFullWidthPx)).b(Integer.valueOf(mScreenParameterProvider.mScreenFullHeightPx)).b(TimeZone.getDefault().getID())));
    }

    public final void onJsonResult(final Object result, pi pi1)
    {
        result = (RF)result;
        if (result != null && pi1.c())
        {
            PG.b(new Runnable() {

                final mn this$0;
                final RF val$result;

                public final void run()
                {
                    mn mn1;
                    final Object locationResponse;
                    mn1 = mn.this;
                    Object obj = result;
                    Object obj1 = ((RF) (obj)).a();
                    String s;
                    if (obj1 == null)
                    {
                        s = null;
                    } else
                    {
                        s = ((Sr) (obj1)).b();
                    }
                    if (s == null) goto _L2; else goto _L1
_L1:
                    locationResponse = ((RF) (obj)).b();
                    obj1 = ((Sr) (obj1)).f();
                    PG.b();
                    if (obj1 == null) goto _L4; else goto _L3
_L3:
                    obj1 = (RI)mn1.mGsonWrapper.a(((String) (obj1)), RI);
                    if (obj1 == null || RI.a.EQUAL != ((RI) (obj1)).a()) goto _L4; else goto _L5
_L5:
                    Timber.c("GetLocationDataTask", "LocationResponse was same, nothing changed.", new Object[0]);
                    mn1.mCallback.a();
_L7:
                    locationResponse = ((RF) (obj)).c();
                    obj = ((RF) (obj)).d();
                    if (locationResponse != null && !((List) (locationResponse)).isEmpty() || obj != null && !((List) (obj)).isEmpty())
                    {
                        if (mn1.mFriendManager.f())
                        {
                            mn1.mFriendManager.d(((List) (locationResponse)));
                        }
                        Bj.a().a(((List) (obj)), true);
                        Mf.a().a(new MS());
                    }
                    mn1.mCallback.a(s);
_L2:
                    return;
_L4:
                    if (locationResponse == null)
                    {
                        Timber.c("GetLocationDataTask", "LocationResponsePayload was null.", new Object[0]);
                    } else
                    {
                        if (((RH) (locationResponse)).b())
                        {
                            Timber.c("GetLocationDataTask", "Updating Weather", new Object[0]);
                            mn1.mCallback.a(new Bx(((RH) (locationResponse)).a()));
                        }
                        if (((RH) (locationResponse)).d())
                        {
                            ArrayList arraylist = new ArrayList();
                            Timber.c("GetLocationDataTask", (new StringBuilder("num geofilters from server")).append(((RH) (locationResponse)).c().size()).toString(), new Object[0]);
                            for (Iterator iterator = ((RH) (locationResponse)).c().iterator(); iterator.hasNext();)
                            {
                                Rg rg = (Rg)iterator.next();
                                try
                                {
                                    arraylist.add(new AJ(rg));
                                }
                                catch (Exception exception)
                                {
                                    lA la = new lA(exception.toString());
                                    mn1.mExceptionReporter.a(la);
                                }
                            }

                            Timber.c("GetLocationDataTask", (new StringBuilder("Updating geofilters with ")).append(arraylist.size()).append(" geofilters").toString(), new Object[0]);
                            mn1.mCallback.a(arraylist);
                        }
                        if (((RH) (locationResponse)).f())
                        {
                            Object obj2 = ((RH) (locationResponse)).e();
                            ArrayList arraylist1 = new ArrayList(((List) (obj2)).size());
                            for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext();)
                            {
                                Rg rg1 = (Rg)((Iterator) (obj2)).next();
                                try
                                {
                                    arraylist1.add(new AJ(rg1));
                                }
                                catch (Exception exception1)
                                {
                                    lA la1 = new lA(exception1.toString());
                                    mn1.mExceptionReporter.a(la1);
                                }
                            }

                            mn1.mCallback.c(arraylist1);
                        }
                        if (((RH) (locationResponse)).h())
                        {
                            PG.a(mn1. new Runnable() {

                                final mn this$0;
                                final RH val$locationResponse;

                                public final void run()
                                {
                                    ArrayList arraylist = new ArrayList();
                                    for (Iterator iterator = locationResponse.g().iterator(); iterator.hasNext(); arraylist.add(new AQ((RV)iterator.next()))) { }
                                    mn.a(mn.this, arraylist);
                                }

            
            {
                this$0 = mn.this;
                locationResponse = rh;
                super();
            }
                            });
                        }
                        if (((RH) (locationResponse)).j())
                        {
                            locationResponse = ((RH) (locationResponse)).i();
                            ArrayList arraylist2 = new ArrayList(((List) (locationResponse)).size());
                            Timber.c("GetLocationDataTask", (new StringBuilder("num geolenses from server")).append(((List) (locationResponse)).size()).toString(), new Object[0]);
                            for (int i = 0; i < ((List) (locationResponse)).size(); i++)
                            {
                                BS bs = new BS((Rg)((List) (locationResponse)).get(i));
                                bs.mOrder = i + 1;
                                arraylist2.add(bs);
                            }

                            Timber.c("GetLocationDataTask", (new StringBuilder("Updating geolenses with ")).append(arraylist2.size()).append(" geolensess").toString(), new Object[0]);
                            mn1.mCallback.d(arraylist2);
                        }
                    }
                    if (true) goto _L7; else goto _L6
_L6:
                }

            
            {
                this$0 = mn.this;
                result = rf;
                super();
            }
            });
        }
    }
}
