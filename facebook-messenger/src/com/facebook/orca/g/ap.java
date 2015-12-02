// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.d.d.d;
import com.facebook.debug.log.b;
import com.facebook.orca.threads.FolderName;

// Referenced classes of package com.facebook.orca.g:
//            s, x

public class ap extends d
{

    private static final Class a = com/facebook/d/d/d;

    public ap()
    {
        super("threads", 29);
    }

    public void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE properties (key TEXT PRIMARY KEY, value TEXT)");
        sqlitedatabase.execSQL("CREATE TABLE folder_counts (folder TEXT PRIMARY KEY, unread_count INTEGER, unseen_count INTEGER, last_seen_time INTEGER,last_action_id INTEGER)");
        sqlitedatabase.execSQL("CREATE TABLE threads (thread_id TEXT PRIMARY KEY, thread_fbid TEXT, action_id INTEGER, refetch_action_id INTEGER, last_visible_action_id INTEGER, name TEXT, participants TEXT, former_participants TEXT, object_participants TEXT, senders TEXT, single_recipient_thread INTEGER, single_recipient_user_key TEXT, snippet TEXT, snippet_sender TEXT, admin_snippet TEXT, timestamp_ms INTEGER, last_fetch_time_ms INTEGER, unread INTEGER, pic_hash TEXT, pic TEXT, can_reply_to INTEGER, mute_until INTEGER, is_subscribed INTEGER, folder TEXT, draft TEXT )");
        sqlitedatabase.execSQL("CREATE TABLE folders (folder TEXT, thread_id TEXT PRIMARY KEY, timestamp_ms INTEGER)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS archived_sms_mms_threads (thread_id TEXT PRIMARY KEY )");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS unread_mms_sms_threads (thread_id TEXT PRIMARY KEY )");
        sqlitedatabase.execSQL("CREATE INDEX folders_timestamp_index ON folders ( folder, timestamp_ms DESC )");
        sqlitedatabase.execSQL("CREATE INDEX threads_single_recipient_user_key_index ON threads ( single_recipient_user_key )");
        sqlitedatabase.execSQL("CREATE TABLE messages (msg_id TEXT PRIMARY KEY, thread_id TEXT, action_id INTEGER, subject TEXT, text TEXT, sender TEXT, timestamp_ms INTEGER, timestamp_sent_ms INTEGER, mms_attachments TEXT, attachments TEXT, shares TEXT, msg_type INTEGER, affected_users TEXT, coordinates TEXT, offline_threading_id TEXT, source TEXT, is_non_authoritative INTEGER, pending_send_media_attachment STRING, handled_internally_time INTEGER, pending_shares STRING, pending_attachment_fbid STRING, client_tags TEXT, send_error STRING )");
        sqlitedatabase.execSQL("CREATE INDEX messages_timestamp_index ON messages ( thread_id, timestamp_ms DESC )");
        sqlitedatabase.execSQL("CREATE INDEX messages_offline_threading_id_index ON messages ( offline_threading_id )");
        sqlitedatabase.execSQL("CREATE INDEX messages_type_index ON messages ( thread_id, msg_type, timestamp_ms )");
        sqlitedatabase.execSQL("CREATE TABLE thread_users (user_key TEXT PRIMARY KEY, first_name TEXT, last_name TEXT, name TEXT, pic_big TEXT, pic_square TEXT, pic_crop TEXT, last_active TEXT)");
        sqlitedatabase.execSQL("CREATE TABLE group_conversations (thread_id TEXT PRIMARY KEY, rank FLOAT)");
    }

    public void a(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        com.facebook.debug.log.b.d(a, (new StringBuilder()).append("Upgrading database from version ").append(i).append(" to ").append(j).append(", which will destroy all old data").toString());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS folder_counts");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS folders_timestamp_index");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS folders");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS threads_timestamp_index");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS threads_single_recipient_id_index");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS threads_single_recipient_user_key_index");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS threads");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS properties");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS messages_timestamp_index");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS messages_offline_threading_id_index");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS messages_type_index");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS messages_hashed_msg_id_index");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS messages");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS users");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS thread_users");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS friends");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS group_conversations");
        a(sqlitedatabase);
    }

    public void b(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete("properties", null, null);
        sqlitedatabase.delete("folder_counts", null, null);
        sqlitedatabase.delete("folders", null, null);
        sqlitedatabase.delete("threads", null, null);
        sqlitedatabase.delete("messages", null, null);
        sqlitedatabase.delete("thread_users", null, null);
        sqlitedatabase.delete("archived_sms_mms_threads", null, null);
        sqlitedatabase.delete("group_conversations", null, null);
    }

    public void c(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete("properties", "key LIKE ?", new String[] {
            ((x)s.a.c((new StringBuilder()).append(FolderName.d.b()).append("%").toString())).a()
        });
        sqlitedatabase.delete("folder_counts", "folder=?", new String[] {
            FolderName.d.b()
        });
        sqlitedatabase.delete("folders", "folder=?", new String[] {
            FolderName.d.b()
        });
        sqlitedatabase.delete("messages", "thread_id LIKE ?", new String[] {
            "mms-sms.%"
        });
        sqlitedatabase.delete("threads", "thread_id LIKE ?", new String[] {
            "mms-sms.%"
        });
        sqlitedatabase.delete("archived_sms_mms_threads", null, null);
    }

}
