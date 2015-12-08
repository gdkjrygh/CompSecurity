// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.concurrent.TimeUnit;

public interface HistoryApi
{
    public static class ViewIntentBuilder
    {

        private long KS;
        private final DataType Sp;
        private DataSource Sq;
        private long Sr;
        private String Ss;
        private final Context mContext;

        private Intent i(Intent intent)
        {
            if (Ss != null)
            {
                Intent intent1 = (new Intent(intent)).setPackage(Ss);
                ResolveInfo resolveinfo = mContext.getPackageManager().resolveActivity(intent1, 0);
                if (resolveinfo != null)
                {
                    intent = resolveinfo.activityInfo.name;
                    intent1.setComponent(new ComponentName(Ss, intent));
                    return intent1;
                }
            }
            return intent;
        }

        public Intent build()
        {
            boolean flag1 = true;
            Intent intent;
            boolean flag;
            if (KS > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Start time must be set");
            if (Sr > KS)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            o.a(flag, "End time must be set and after start time");
            intent = new Intent("vnd.google.fitness.VIEW");
            intent.setType(DataType.getMimeType(Sq.getDataType()));
            intent.putExtra("vnd.google.fitness.start_time", KS);
            intent.putExtra("vnd.google.fitness.end_time", Sr);
            c.a(Sq, intent, "vnd.google.fitness.data_source");
            return i(intent);
        }

        public ViewIntentBuilder setDataSource(DataSource datasource)
        {
            o.b(datasource.getDataType().equals(Sp), "Data source %s is not for the data type %s", new Object[] {
                datasource, Sp
            });
            Sq = datasource;
            return this;
        }

        public ViewIntentBuilder setPreferredApplication(String s)
        {
            Ss = s;
            return this;
        }

        public ViewIntentBuilder setTimeInterval(long l, long l1, TimeUnit timeunit)
        {
            KS = timeunit.toMillis(l);
            Sr = timeunit.toMillis(l1);
            return this;
        }

        public ViewIntentBuilder(Context context, DataType datatype)
        {
            mContext = context;
            Sp = datatype;
        }
    }


    public abstract PendingResult deleteData(GoogleApiClient googleapiclient, DataDeleteRequest datadeleterequest);

    public abstract PendingResult insertData(GoogleApiClient googleapiclient, DataSet dataset);

    public abstract PendingResult readData(GoogleApiClient googleapiclient, DataReadRequest datareadrequest);
}
