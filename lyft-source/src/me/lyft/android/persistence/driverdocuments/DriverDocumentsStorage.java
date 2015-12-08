// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence.driverdocuments;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import me.lyft.android.LyftApplication;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.lyft.driverdocuments.DriverDocumentsDTO;
import me.lyft.android.infrastructure.lyft.driverdocuments.InspectionDTO;
import me.lyft.android.infrastructure.lyft.driverdocuments.InsuranceDTO;
import me.lyft.android.infrastructure.lyft.driverdocuments.RegistrationDTO;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.persistence.driverdocuments:
//            IDriverDocumentsStorage

public class DriverDocumentsStorage
    implements IDriverDocumentsStorage
{

    private static final String DRIVER_DOCUMENTS = "driver_documents";
    private static final String LAST_CACHED_DRIVER_DOCUMENTS = "driver_docs_cache_timestamp";
    private final Gson gson;
    private final SharedPreferences preferences;

    public DriverDocumentsStorage(LyftApplication lyftapplication, Gson gson1)
    {
        gson = gson1;
        preferences = lyftapplication.getSharedPreferences("driver_documents", 0);
    }

    private DriverDocumentsDTO getDriverDocuments()
    {
        return (DriverDocumentsDTO)getSerializable("driver_documents", me/lyft/android/infrastructure/lyft/driverdocuments/DriverDocumentsDTO);
    }

    private Object getSerializable(String s, Class class1)
    {
        String s1 = preferences.getString(s, null);
        if (Strings.isNullOrEmpty(s1))
        {
            return null;
        }
        try
        {
            class1 = ((Class) (gson.a(s1, class1)));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1 = preferences.edit();
            class1.remove(s);
            class1.apply();
            return null;
        }
        return class1;
    }

    private void putSerializable(String s, Object obj)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        if (obj == null)
        {
            editor.remove(s);
        } else
        {
            try
            {
                editor.putString(s, gson.a(obj));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                L.e(s, "putSerializable", new Object[0]);
            }
        }
        editor.apply();
    }

    public InspectionDTO getInspection()
    {
        DriverDocumentsDTO driverdocumentsdto = getDriverDocuments();
        if (driverdocumentsdto != null)
        {
            return driverdocumentsdto.inspection;
        } else
        {
            return null;
        }
    }

    public InsuranceDTO getInsurance()
    {
        DriverDocumentsDTO driverdocumentsdto = getDriverDocuments();
        if (driverdocumentsdto != null)
        {
            return driverdocumentsdto.insurance;
        } else
        {
            return null;
        }
    }

    public long getLastCachedDriverDocuments()
    {
        return preferences.getLong("driver_docs_cache_timestamp", 0L);
    }

    public RegistrationDTO getRegistration()
    {
        DriverDocumentsDTO driverdocumentsdto = getDriverDocuments();
        if (driverdocumentsdto != null)
        {
            return driverdocumentsdto.registration;
        } else
        {
            return null;
        }
    }

    public void reset()
    {
        putSerializable("driver_documents", null);
    }

    public void setDriverDocuments(DriverDocumentsDTO driverdocumentsdto)
    {
        putSerializable("driver_documents", driverdocumentsdto);
        preferences.edit().putLong("driver_docs_cache_timestamp", System.currentTimeMillis()).apply();
    }
}
