// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.android;

import android.content.SharedPreferences;
import retrofit.MockRestAdapter;

public final class AndroidMockValuePersistence
    implements retrofit.MockRestAdapter.ValueChangeListener
{

    private static final String KEY_DELAY = "retrofit-mock-delay";
    private static final String KEY_ERROR = "retrofit-mock-error";
    private static final String KEY_VARIANCE = "retrofit-mock-variance";
    private final SharedPreferences preferences;

    private AndroidMockValuePersistence(SharedPreferences sharedpreferences)
    {
        preferences = sharedpreferences;
    }

    public static void install(MockRestAdapter mockrestadapter, SharedPreferences sharedpreferences)
    {
        long l = sharedpreferences.getLong("retrofit-mock-delay", -1L);
        if (l != -1L)
        {
            mockrestadapter.setDelay(l);
        }
        int i = sharedpreferences.getInt("retrofit-mock-variance", -1);
        if (i != -1)
        {
            mockrestadapter.setVariancePercentage(i);
        }
        i = sharedpreferences.getInt("retrofit-mock-error", -1);
        if (i != -1)
        {
            mockrestadapter.setErrorPercentage(i);
        }
        mockrestadapter.setValueChangeListener(new AndroidMockValuePersistence(sharedpreferences));
    }

    public final void onMockValuesChanged(long l, int i, int j)
    {
        preferences.edit().putLong("retrofit-mock-delay", l).putInt("retrofit-mock-variance", i).putInt("retrofit-mock-error", j).apply();
    }
}
