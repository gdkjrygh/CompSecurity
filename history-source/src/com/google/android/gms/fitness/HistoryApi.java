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
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.internal.jx;
import java.util.concurrent.TimeUnit;

public interface HistoryApi
{
    public static class ViewIntentBuilder
    {

        private long LW;
        private final DataType TM;
        private DataSource TN;
        private long TO;
        private String TP;
        private final Context mContext;

        private Intent i(Intent intent)
        {
            if (TP != null)
            {
                Intent intent1 = (new Intent(intent)).setPackage(TP);
                ResolveInfo resolveinfo = mContext.getPackageManager().resolveActivity(intent1, 0);
                if (resolveinfo != null)
                {
                    intent = resolveinfo.activityInfo.name;
                    intent1.setComponent(new ComponentName(TP, intent));
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
            if (LW > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Start time must be set");
            if (TO > LW)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            jx.a(flag, "End time must be set and after start time");
            intent = new Intent("vnd.google.fitness.VIEW");
            intent.setType(DataType.getMimeType(TN.getDataType()));
            intent.putExtra("vnd.google.fitness.start_time", LW);
            intent.putExtra("vnd.google.fitness.end_time", TO);
            c.a(TN, intent, "vnd.google.fitness.data_source");
            return i(intent);
        }

        public ViewIntentBuilder setDataSource(DataSource datasource)
        {
            jx.b(datasource.getDataType().equals(TM), "Data source %s is not for the data type %s", new Object[] {
                datasource, TM
            });
            TN = datasource;
            return this;
        }

        public ViewIntentBuilder setPreferredApplication(String s)
        {
            TP = s;
            return this;
        }

        public ViewIntentBuilder setTimeInterval(long l, long l1, TimeUnit timeunit)
        {
            LW = timeunit.toMillis(l);
            TO = timeunit.toMillis(l1);
            return this;
        }

        public ViewIntentBuilder(Context context, DataType datatype)
        {
            mContext = context;
            TM = datatype;
        }
    }


    public abstract PendingResult deleteData(GoogleApiClient googleapiclient, DataDeleteRequest datadeleterequest);

    public abstract PendingResult insertData(GoogleApiClient googleapiclient, DataSet dataset);

    public abstract PendingResult readData(GoogleApiClient googleapiclient, DataReadRequest datareadrequest);
}
