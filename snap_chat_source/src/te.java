// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.snapchat.android.Timber;
import com.snapchat.android.controller.stories.StoryLoadingContext;
import com.snapchat.android.model.StoryCollection;
import com.snapchat.android.util.debug.FeatureFlagManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class te
{
    public static final class a
    {

        final List a = new ArrayList();
        final StoryLoadingContext b;
        public sZ c;
        public StoryCollection d;
        public boolean e;
        public long f;
        public int g;

        public final a a(Bk bk)
        {
            a.add(dv.a(bk));
            return this;
        }

        public final te a()
        {
            return new te(this, '\0');
        }

        public a(StoryLoadingContext storyloadingcontext)
        {
            g = 0;
            b = (StoryLoadingContext)dv.a(storyloadingcontext);
        }
    }

    public static interface b
    {

        public abstract void a(te te1, int l, long l1);
    }

