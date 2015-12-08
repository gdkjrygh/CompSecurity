// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.vungle.log.Logger;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.bv;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.file.CacheManager;
import javax.inject.Provider;

public class DatabaseHelper extends SQLiteOpenHelper
{

    private static final String e[] = {
        "ad", "viewable", "archive_entry", "event_tracking", "ad_report", "ad_play", "ad_report_event", "ad_report_extra", "event_tracking_http_log", "logged_exceptions"
    };
    CacheManager a;
    EventBus b;
    bv c;
    public ScheduledPriorityExecutor d;

    public DatabaseHelper(Context context)
    {
        super(context, "vungle", null, 8);
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        String as[] = e;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            Logger.d("VungleDatabase", (new StringBuilder("dropping table: ")).append(s).toString());
            s = (new StringBuilder("DROP TABLE  IF EXISTS ")).append(s).toString();
            Logger.v("VungleDatabase", s);
            sqlitedatabase.execSQL(s);
        }

        CacheManager cachemanager = a;
        Logger.d("VungleFile", "deleting ad temp directory");
        CacheManager.a((String)cachemanager.a.get());
        onCreate(sqlitedatabase);
    }

    final transient void a(String as[])
    {
        String as1[];
        String s;
label0:
        {
            s = c.b();
            Logger.d("VungleDumpDatabase", (new StringBuilder()).append(s).append(" sdk version VungleDroid/3.3.3, database version 8").toString());
            if (as != null)
            {
                as1 = as;
                if (as.length > 0)
                {
                    break label0;
                }
            }
            Logger.d("VungleDumpDatabase", (new StringBuilder()).append(s).append(" dumping all tables").toString());
            as1 = e;
        }
        as = getReadableDatabase();
        int j = as1.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = as1[i];
            Logger.i("VungleDumpDatabase", (new StringBuilder()).append(s).append(" dumping table ").append(((String) (obj))).toString());
            obj = as.query(((String) (obj)), null, null, new String[0], null, null, null);
            StringBuilder stringbuilder = new StringBuilder();
            DatabaseUtils.dumpCursor(((android.database.Cursor) (obj)), stringbuilder);
            Logger.d("VungleDumpDatabase", stringbuilder.toString());
        }

    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        Logger.d("VungleDatabase", "creating database: vungle");
        Logger.d("VungleDatabase", "creating table: ad");
        Logger.v("VungleDatabase", "CREATE TABLE ad (id STRING PRIMARY KEY, advertising_app_vungle_id INTEGER, call_to_action_final_url STRING, call_to_action_url STRING, delivery_id STRING NOT NULL, status STRING NOT NULL, type STRING NOT NULL, delete_local_content_attempts INTEGER, expiration_timestamp_seconds INTEGER, parent_path STRING, prepare_retry_count INTEGER, received_timestamp_millis INTEGER, insert_timestamp_millis INTEGER NOT NULL, update_timestamp_millis INTEGER NOT NULL, failed_timestamp_millis INTEGER NOT NULL);");
        sqlitedatabase.execSQL("CREATE TABLE ad (id STRING PRIMARY KEY, advertising_app_vungle_id INTEGER, call_to_action_final_url STRING, call_to_action_url STRING, delivery_id STRING NOT NULL, status STRING NOT NULL, type STRING NOT NULL, delete_local_content_attempts INTEGER, expiration_timestamp_seconds INTEGER, parent_path STRING, prepare_retry_count INTEGER, received_timestamp_millis INTEGER, insert_timestamp_millis INTEGER NOT NULL, update_timestamp_millis INTEGER NOT NULL, failed_timestamp_millis INTEGER NOT NULL);");
        Logger.d("VungleDatabase", "creating table: viewable");
        Logger.v("VungleDatabase", "CREATE TABLE viewable (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL REFERENCES ad(id) ON DELETE CASCADE ON UPDATE CASCADE, type STRING NOT NULL, url STRING NOT NULL, status STRING NOT NULL, size INTEGER, width INTEGER, height INTEGER, show_close_delay_incentivized_seconds INTEGER, show_close_delay_interstitial_seconds INTEGER, show_countdown_delay_seconds INTEGER, cta_clickable_percent REAL, enable_cta_delay_seconds INTEGER, is_cta_enabled INTEGER, is_cta_shown_on_touch INTEGER, show_cta_delay_seconds INTEGER, checksum STRING, CONSTRAINT viewable_ad_type_uk UNIQUE (ad_id, type));");
        sqlitedatabase.execSQL("CREATE TABLE viewable (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL REFERENCES ad(id) ON DELETE CASCADE ON UPDATE CASCADE, type STRING NOT NULL, url STRING NOT NULL, status STRING NOT NULL, size INTEGER, width INTEGER, height INTEGER, show_close_delay_incentivized_seconds INTEGER, show_close_delay_interstitial_seconds INTEGER, show_countdown_delay_seconds INTEGER, cta_clickable_percent REAL, enable_cta_delay_seconds INTEGER, is_cta_enabled INTEGER, is_cta_shown_on_touch INTEGER, show_cta_delay_seconds INTEGER, checksum STRING, CONSTRAINT viewable_ad_type_uk UNIQUE (ad_id, type));");
        Logger.d("VungleDatabase", "creating table: archive_entry");
        Logger.v("VungleDatabase", "CREATE TABLE archive_entry (id INTEGER PRIMARY KEY AUTOINCREMENT, viewable_id INTEGER NOT NULL REFERENCES viewable(id) ON DELETE CASCADE ON UPDATE CASCADE, relative_path STRING NOT NULL, size INTEGER, CONSTRAINT archive_entry_viewable_id_path_uk UNIQUE (id, relative_path));");
        sqlitedatabase.execSQL("CREATE TABLE archive_entry (id INTEGER PRIMARY KEY AUTOINCREMENT, viewable_id INTEGER NOT NULL REFERENCES viewable(id) ON DELETE CASCADE ON UPDATE CASCADE, relative_path STRING NOT NULL, size INTEGER, CONSTRAINT archive_entry_viewable_id_path_uk UNIQUE (id, relative_path));");
        Logger.d("VungleDatabase", "creating table: event_tracking");
        Logger.v("VungleDatabase", "CREATE TABLE event_tracking (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL REFERENCES ad(id) ON DELETE CASCADE ON UPDATE CASCADE, event INTEGER NOT NULL, url STRING NOT NULL);");
        sqlitedatabase.execSQL("CREATE TABLE event_tracking (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL REFERENCES ad(id) ON DELETE CASCADE ON UPDATE CASCADE, event INTEGER NOT NULL, url STRING NOT NULL);");
        Logger.d("VungleDatabase", "creating table: ad_report");
        Logger.v("VungleDatabase", "CREATE TABLE ad_report (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL REFERENCES ad(id) ON DELETE CASCADE ON UPDATE CASCADE, incentivized_publisher_app_user_id STRING, is_incentivized INTEGER NOT NULL, placement STRING, status STRING NOT NULL, video_duration_millis INTEGER, view_end_millis INTEGER, view_start_millis INTEGER, download_end_millis INTEGER, insert_timestamp_millis INTEGER NOT NULL, update_timestamp_millis INTEGER NOT NULL);");
        sqlitedatabase.execSQL("CREATE TABLE ad_report (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL REFERENCES ad(id) ON DELETE CASCADE ON UPDATE CASCADE, incentivized_publisher_app_user_id STRING, is_incentivized INTEGER NOT NULL, placement STRING, status STRING NOT NULL, video_duration_millis INTEGER, view_end_millis INTEGER, view_start_millis INTEGER, download_end_millis INTEGER, insert_timestamp_millis INTEGER NOT NULL, update_timestamp_millis INTEGER NOT NULL);");
        Logger.d("VungleDatabase", "creating table: ad_play");
        Logger.v("VungleDatabase", "CREATE TABLE ad_play (id INTEGER PRIMARY KEY AUTOINCREMENT, report_id INTEGER NOT NULL REFERENCES ad_report(id) ON DELETE CASCADE ON UPDATE CASCADE, start_millis INTEGER, watched_millis INTEGER);");
        sqlitedatabase.execSQL("CREATE TABLE ad_play (id INTEGER PRIMARY KEY AUTOINCREMENT, report_id INTEGER NOT NULL REFERENCES ad_report(id) ON DELETE CASCADE ON UPDATE CASCADE, start_millis INTEGER, watched_millis INTEGER);");
        Logger.d("VungleDatabase", "creating table: ad_report_event");
        Logger.v("VungleDatabase", "CREATE TABLE ad_report_event (id INTEGER PRIMARY KEY AUTOINCREMENT, play_id INTEGER NOT NULL REFERENCES ad_play(id) ON DELETE CASCADE ON UPDATE CASCADE, event STRING NOT NULL, insert_timestamp_millis INTEGER NOT NULL, value STRING);");
        sqlitedatabase.execSQL("CREATE TABLE ad_report_event (id INTEGER PRIMARY KEY AUTOINCREMENT, play_id INTEGER NOT NULL REFERENCES ad_play(id) ON DELETE CASCADE ON UPDATE CASCADE, event STRING NOT NULL, insert_timestamp_millis INTEGER NOT NULL, value STRING);");
        Logger.d("VungleDatabase", "creating table: ad_report_extra");
        Logger.v("VungleDatabase", "CREATE TABLE ad_report_extra (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_report_id INTEGER NOT NULL REFERENCES ad_report(id) ON DELETE CASCADE ON UPDATE CASCADE, name STRING, value STRING, CONSTRAINT ad_report_extra_id_name_uk UNIQUE (id, name));");
        sqlitedatabase.execSQL("CREATE TABLE ad_report_extra (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_report_id INTEGER NOT NULL REFERENCES ad_report(id) ON DELETE CASCADE ON UPDATE CASCADE, name STRING, value STRING, CONSTRAINT ad_report_extra_id_name_uk UNIQUE (id, name));");
        Logger.d("VungleDatabase", "creating table: event_tracking_http_log");
        Logger.v("VungleDatabase", "CREATE TABLE event_tracking_http_log (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL, delivery_id STRING NOT NULL, event STRING NOT NULL, response_code INTEGER NOT NULL, response_timestamp_millis INTEGER, url STRING NOT NULL, insert_timestamp_millis INTEGER NOT NULL);");
        sqlitedatabase.execSQL("CREATE TABLE event_tracking_http_log (id INTEGER PRIMARY KEY AUTOINCREMENT, ad_id STRING NOT NULL, delivery_id STRING NOT NULL, event STRING NOT NULL, response_code INTEGER NOT NULL, response_timestamp_millis INTEGER, url STRING NOT NULL, insert_timestamp_millis INTEGER NOT NULL);");
        Logger.d("VungleDatabase", "creating table: logged_exceptions");
        Logger.v("VungleDatabase", "CREATE TABLE logged_exceptions (id INTEGER PRIMARY KEY AUTOINCREMENT, stack_trace STRING, tag STRING, log_message STRING, class STRING, type INTEGER NOT NULL, android_version STRING, sdk_version STRING NOT NULL, play_services_version STRING, insert_timestamp_millis INTEGER NOT NULL);");
        sqlitedatabase.execSQL("CREATE TABLE logged_exceptions (id INTEGER PRIMARY KEY AUTOINCREMENT, stack_trace STRING, tag STRING, log_message STRING, class STRING, type INTEGER NOT NULL, android_version STRING, sdk_version STRING NOT NULL, play_services_version STRING, insert_timestamp_millis INTEGER NOT NULL);");
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Logger.d("VungleDatabase", (new StringBuilder("downgrading databse version ")).append(i).append(" --> ").append(j).toString());
        a(sqlitedatabase);
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        super.onOpen(sqlitedatabase);
        Logger.d("VungleDatabase", "enabling foreign keys");
        sqlitedatabase.execSQL("PRAGMA foreign_keys = true");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Logger.d("VungleDatabase", (new StringBuilder("upgrading database version ")).append(i).append(" --> ").append(j).toString());
        a(sqlitedatabase);
    }

}
