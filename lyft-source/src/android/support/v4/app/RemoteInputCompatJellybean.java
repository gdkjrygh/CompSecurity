// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Bundle;

class RemoteInputCompatJellybean
{

    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    private static final String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
    private static final String KEY_CHOICES = "choices";
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_LABEL = "label";
    private static final String KEY_RESULT_KEY = "resultKey";
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";

    RemoteInputCompatJellybean()
    {
    }

    static void addResultsToIntent(RemoteInputCompatBase.RemoteInput aremoteinput[], Intent intent, Bundle bundle)
    {
        Bundle bundle1 = new Bundle();
        int j = aremoteinput.length;
        for (int i = 0; i < j; i++)
        {
            RemoteInputCompatBase.RemoteInput remoteinput = aremoteinput[i];
            Object obj = bundle.get(remoteinput.getResultKey());
            if (obj instanceof CharSequence)
            {
                bundle1.putCharSequence(remoteinput.getResultKey(), (CharSequence)obj);
            }
        }

        aremoteinput = new Intent();
        aremoteinput.putExtra("android.remoteinput.resultsData", bundle1);
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", aremoteinput));
    }

    static RemoteInputCompatBase.RemoteInput fromBundle(Bundle bundle, RemoteInputCompatBase.RemoteInput.Factory factory)
    {
        return factory.build(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), bundle.getBundle("extras"));
    }

    static RemoteInputCompatBase.RemoteInput[] fromBundleArray(Bundle abundle[], RemoteInputCompatBase.RemoteInput.Factory factory)
    {
        if (abundle == null)
        {
            return null;
        }
        RemoteInputCompatBase.RemoteInput aremoteinput[] = factory.newArray(abundle.length);
        for (int i = 0; i < abundle.length; i++)
        {
            aremoteinput[i] = fromBundle(abundle[i], factory);
        }

        return aremoteinput;
    }

    static Bundle getResultsFromIntent(Intent intent)
    {
        intent = intent.getClipData();
        ClipDescription clipdescription;
        if (intent != null)
        {
            if ((clipdescription = intent.getDescription()).hasMimeType("text/vnd.android.intent") && clipdescription.getLabel().equals("android.remoteinput.results"))
            {
                return (Bundle)intent.getItemAt(0).getIntent().getExtras().getParcelable("android.remoteinput.resultsData");
            }
        }
        return null;
    }

    static Bundle toBundle(RemoteInputCompatBase.RemoteInput remoteinput)
    {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", remoteinput.getResultKey());
        bundle.putCharSequence("label", remoteinput.getLabel());
        bundle.putCharSequenceArray("choices", remoteinput.getChoices());
        bundle.putBoolean("allowFreeFormInput", remoteinput.getAllowFreeFormInput());
        bundle.putBundle("extras", remoteinput.getExtras());
        return bundle;
    }

    static Bundle[] toBundleArray(RemoteInputCompatBase.RemoteInput aremoteinput[])
    {
        if (aremoteinput == null)
        {
            return null;
        }
        Bundle abundle[] = new Bundle[aremoteinput.length];
        for (int i = 0; i < aremoteinput.length; i++)
        {
            abundle[i] = toBundle(aremoteinput[i]);
        }

        return abundle;
    }
}
