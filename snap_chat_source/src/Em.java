// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.model.StorySnapLogbook;
import com.snapchat.android.util.save.SaveImageToGalleryTask;
import com.snapchat.android.util.save.SaveMediaNotificationsToShow;

public final class Em
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d();
    }


    final Ew a;
    private final Bf b;
    private final Context c;

    public Em(Context context)
    {
        this(context, Bf.a(), Ew.a());
    }

    private Em(Context context, Bf bf, Ew ew)
    {
        c = context;
        b = bf;
        a = ew;
    }

    public final void a(StorySnapLogbook storysnaplogbook, a a1)
    {
        if (storysnaplogbook.mStorySnap.mFailed)
        {
            String s = storysnaplogbook.mStorySnap.mClientId;
            b.a(storysnaplogbook.mStoryId, s);
            a1.c();
        } else
        {
            (new lZ(storysnaplogbook, storysnaplogbook, a1) {

                private StorySnapLogbook a;
                private a b;

                protected final void a()
                {
                    super.a();
                    a.mActionState = com.snapchat.android.model.StorySnapLogbook.ActionState.DELETED;
                    b.c();
                }

                public final void a(pi pi)
                {
                    super.a(pi);
                    b.b();
                }

                protected final void b()
                {
                    super.b();
                    a.mActionState = com.snapchat.android.model.StorySnapLogbook.ActionState.READY;
                    b.d();
                }

                public final void execute()
                {
                    a.mActionState = com.snapchat.android.model.StorySnapLogbook.ActionState.DELETING;
                    b.a();
                    super.execute();
                }

            
            {
                a = storysnaplogbook1;
                b = a1;
                super(storysnaplogbook);
            }
            }).execute();
        }
        AnalyticsEvents.a(storysnaplogbook.mStorySnap.mClientId);
    }

    public final void b(StorySnapLogbook storysnaplogbook, a a1)
    {
        Bk bk = storysnaplogbook.mStorySnap;
        if (bk.am() == 0)
        {
            (new SaveImageToGalleryTask(c, bk, com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext.STORY, SaveMediaNotificationsToShow.FAIL_ONLY, storysnaplogbook, a1) {

                private StorySnapLogbook a;
                private a b;
                private Em c;

                protected final void a()
                {
                    super.a();
                    a.mActionState = com.snapchat.android.model.StorySnapLogbook.ActionState.READY;
                    b.d();
                }

                protected final void a(String s)
                {
                    super.a(s);
                    a.mActionState = com.snapchat.android.model.StorySnapLogbook.ActionState.SAVED;
                    c.a.a(a.mStorySnap);
                    b.c();
                }

                protected final void b(String s)
                {
                    super.b(s);
                    b.b();
                }

                protected final void onPostExecute(Object obj)
                {
                    b((String)obj);
                }

                protected final void onPreExecute()
                {
                    super.onPreExecute();
                    a.mActionState = com.snapchat.android.model.StorySnapLogbook.ActionState.SAVING;
                    b.a();
                }

            
            {
                c = Em.this;
                a = storysnaplogbook;
                b = a1;
                super(context, bk, savesnapcontext, savemedianotificationstoshow);
            }
            }).executeOnExecutor(IO.MISCELLANEOUS_EXECUTOR, new Void[0]);
        } else
        {
            (new Pv(c, bk, com.snapchat.android.analytics.CameraEventAnalytics.SaveSnapContext.STORY, SaveMediaNotificationsToShow.FAIL_ONLY, storysnaplogbook, a1) {

                private StorySnapLogbook a;
                private a b;
                private Em c;

                protected final void a()
                {
                    super.a();
                    a.mActionState = com.snapchat.android.model.StorySnapLogbook.ActionState.SAVED;
                    c.a.a(a.mStorySnap);
                    b.c();
                }

                protected final void a(Boolean boolean1)
                {
                    super.a(boolean1);
                    b.b();
                }

                protected final void b()
                {
                    super.b();
                    a.mActionState = com.snapchat.android.model.StorySnapLogbook.ActionState.READY;
                    b.d();
                }

                protected final void onPostExecute(Object obj)
                {
                    a((Boolean)obj);
                }

                protected final void onPreExecute()
                {
                    super.onPreExecute();
                    a.mActionState = com.snapchat.android.model.StorySnapLogbook.ActionState.SAVING;
                    b.a();
                }

            
            {
                c = Em.this;
                a = storysnaplogbook;
                b = a1;
                super(context, bk, savesnapcontext, savemedianotificationstoshow);
            }
            }).executeOnExecutor(IO.MISCELLANEOUS_EXECUTOR, new Void[0]);
        }
        AnalyticsEvents.a(bk);
    }
}
