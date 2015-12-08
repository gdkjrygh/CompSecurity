// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.experiments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.b;

// Referenced classes of package com.soundcloud.android.configuration.experiments:
//            Assignment, ActiveExperiments, Layer, ExperimentStorage

public class ExperimentOperations
{

    private static final String EXPERIMENT_PREFIX = "exp_";
    private static final String TAG = "Configuration";
    private final ActiveExperiments activeExperiments;
    private Assignment assignment;
    private final rx.b.b cacheCurrentAssignments = new _cls1();
    private final ExperimentStorage experimentStorage;

    public ExperimentOperations(ExperimentStorage experimentstorage, ActiveExperiments activeexperiments)
    {
        assignment = Assignment.empty();
        experimentStorage = experimentstorage;
        activeExperiments = activeexperiments;
    }

    public String[] getActiveLayers()
    {
        return activeExperiments.getRequestLayers();
    }

    public Assignment getAssignment()
    {
        return assignment;
    }

    public String getExperimentVariant(String s)
    {
        for (Iterator iterator = assignment.getLayers().iterator(); iterator.hasNext();)
        {
            Layer layer = (Layer)iterator.next();
            if (s.equals(layer.getExperimentName()))
            {
                return layer.getVariantName();
            }
        }

        return "";
    }

    public Map getTrackingParams()
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = assignment.getLayers().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Layer layer = (Layer)iterator.next();
            if (activeExperiments.isActive(layer.getExperimentName()))
            {
                hashmap.put((new StringBuilder("exp_")).append(layer.getLayerName()).toString(), Integer.valueOf(layer.getVariantId()));
            }
        } while (true);
        return hashmap;
    }

    public b loadAssignment()
    {
        return experimentStorage.readAssignment().doOnNext(cacheCurrentAssignments);
    }

    public void update(Assignment assignment1)
    {
        (new StringBuilder("Store next experiment config\n")).append(assignment1.toString());
        experimentStorage.storeAssignment(assignment1);
    }


/*
    static Assignment access$002(ExperimentOperations experimentoperations, Assignment assignment1)
    {
        experimentoperations.assignment = assignment1;
        return assignment1;
    }

*/

    private class _cls1
        implements rx.b.b
    {

        final ExperimentOperations this$0;

        public void call(Assignment assignment1)
        {
            (new StringBuilder("Loaded current experiment config\n")).append(assignment1.toString());
            assignment = assignment1;
        }

        public volatile void call(Object obj)
        {
            call((Assignment)obj);
        }

        _cls1()
        {
            this$0 = ExperimentOperations.this;
            super();
        }
    }

}
