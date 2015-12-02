.class public Lcom/facebook/orca/g/ap;
.super Lcom/facebook/d/d/d;
.source "ThreadsDbSchemaPart.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-class v0, Lcom/facebook/d/d/d;

    sput-object v0, Lcom/facebook/orca/g/ap;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 144
    const-string v0, "threads"

    const/16 v1, 0x1d

    invoke-direct {p0, v0, v1}, Lcom/facebook/d/d/d;-><init>(Ljava/lang/String;I)V

    .line 145
    return-void
.end method


# virtual methods
.method public a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .prologue
    .line 149
    const-string v0, "CREATE TABLE properties (key TEXT PRIMARY KEY, value TEXT)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 150
    const-string v0, "CREATE TABLE folder_counts (folder TEXT PRIMARY KEY, unread_count INTEGER, unseen_count INTEGER, last_seen_time INTEGER,last_action_id INTEGER)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 151
    const-string v0, "CREATE TABLE threads (thread_id TEXT PRIMARY KEY, thread_fbid TEXT, action_id INTEGER, refetch_action_id INTEGER, last_visible_action_id INTEGER, name TEXT, participants TEXT, former_participants TEXT, object_participants TEXT, senders TEXT, single_recipient_thread INTEGER, single_recipient_user_key TEXT, snippet TEXT, snippet_sender TEXT, admin_snippet TEXT, timestamp_ms INTEGER, last_fetch_time_ms INTEGER, unread INTEGER, pic_hash TEXT, pic TEXT, can_reply_to INTEGER, mute_until INTEGER, is_subscribed INTEGER, folder TEXT, draft TEXT )"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 152
    const-string v0, "CREATE TABLE folders (folder TEXT, thread_id TEXT PRIMARY KEY, timestamp_ms INTEGER)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 153
    const-string v0, "CREATE TABLE IF NOT EXISTS archived_sms_mms_threads (thread_id TEXT PRIMARY KEY )"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 154
    const-string v0, "CREATE TABLE IF NOT EXISTS unread_mms_sms_threads (thread_id TEXT PRIMARY KEY )"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 155
    const-string v0, "CREATE INDEX folders_timestamp_index ON folders ( folder, timestamp_ms DESC )"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 156
    const-string v0, "CREATE INDEX threads_single_recipient_user_key_index ON threads ( single_recipient_user_key )"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 157
    const-string v0, "CREATE TABLE messages (msg_id TEXT PRIMARY KEY, thread_id TEXT, action_id INTEGER, subject TEXT, text TEXT, sender TEXT, timestamp_ms INTEGER, timestamp_sent_ms INTEGER, mms_attachments TEXT, attachments TEXT, shares TEXT, msg_type INTEGER, affected_users TEXT, coordinates TEXT, offline_threading_id TEXT, source TEXT, is_non_authoritative INTEGER, pending_send_media_attachment STRING, handled_internally_time INTEGER, pending_shares STRING, pending_attachment_fbid STRING, client_tags TEXT, send_error STRING )"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 158
    const-string v0, "CREATE INDEX messages_timestamp_index ON messages ( thread_id, timestamp_ms DESC )"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 159
    const-string v0, "CREATE INDEX messages_offline_threading_id_index ON messages ( offline_threading_id )"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 160
    const-string v0, "CREATE INDEX messages_type_index ON messages ( thread_id, msg_type, timestamp_ms )"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 161
    const-string v0, "CREATE TABLE thread_users (user_key TEXT PRIMARY KEY, first_name TEXT, last_name TEXT, name TEXT, pic_big TEXT, pic_square TEXT, pic_crop TEXT, last_active TEXT)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 162
    const-string v0, "CREATE TABLE group_conversations (thread_id TEXT PRIMARY KEY, rank FLOAT)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 163
    return-void
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 3

    .prologue
    .line 167
    sget-object v0, Lcom/facebook/orca/g/ap;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Upgrading database from version "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", which will destroy all old data"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 170
    const-string v0, "DROP TABLE IF EXISTS folder_counts"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 171
    const-string v0, "DROP INDEX IF EXISTS folders_timestamp_index"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 172
    const-string v0, "DROP TABLE IF EXISTS folders"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 173
    const-string v0, "DROP INDEX IF EXISTS threads_timestamp_index"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 174
    const-string v0, "DROP INDEX IF EXISTS threads_single_recipient_id_index"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 175
    const-string v0, "DROP INDEX IF EXISTS threads_single_recipient_user_key_index"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 176
    const-string v0, "DROP TABLE IF EXISTS threads"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 177
    const-string v0, "DROP TABLE IF EXISTS properties"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 178
    const-string v0, "DROP INDEX IF EXISTS messages_timestamp_index"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 179
    const-string v0, "DROP INDEX IF EXISTS messages_offline_threading_id_index"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 180
    const-string v0, "DROP INDEX IF EXISTS messages_type_index"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 181
    const-string v0, "DROP INDEX IF EXISTS messages_hashed_msg_id_index"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 182
    const-string v0, "DROP TABLE IF EXISTS messages"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 183
    const-string v0, "DROP TABLE IF EXISTS users"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 184
    const-string v0, "DROP TABLE IF EXISTS thread_users"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 185
    const-string v0, "DROP TABLE IF EXISTS friends"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 186
    const-string v0, "DROP TABLE IF EXISTS group_conversations"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 188
    invoke-virtual {p0, p1}, Lcom/facebook/orca/g/ap;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 189
    return-void
.end method

.method public b(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 192
    const-string v0, "properties"

    invoke-virtual {p1, v0, v1, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 193
    const-string v0, "folder_counts"

    invoke-virtual {p1, v0, v1, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 194
    const-string v0, "folders"

    invoke-virtual {p1, v0, v1, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 195
    const-string v0, "threads"

    invoke-virtual {p1, v0, v1, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 196
    const-string v0, "messages"

    invoke-virtual {p1, v0, v1, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 197
    const-string v0, "thread_users"

    invoke-virtual {p1, v0, v1, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 198
    const-string v0, "archived_sms_mms_threads"

    invoke-virtual {p1, v0, v1, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 199
    const-string v0, "group_conversations"

    invoke-virtual {p1, v0, v1, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 200
    return-void
.end method

.method public c(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 203
    const-string v1, "properties"

    const-string v2, "key LIKE ?"

    new-array v3, v7, [Ljava/lang/String;

    sget-object v0, Lcom/facebook/orca/g/s;->a:Lcom/facebook/orca/g/x;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v5}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "%"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/facebook/orca/g/x;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/x;

    invoke-virtual {v0}, Lcom/facebook/orca/g/x;->a()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v6

    invoke-virtual {p1, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 210
    const-string v0, "folder_counts"

    const-string v1, "folder=?"

    new-array v2, v7, [Ljava/lang/String;

    sget-object v3, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v3}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 215
    const-string v0, "folders"

    const-string v1, "folder=?"

    new-array v2, v7, [Ljava/lang/String;

    sget-object v3, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v3}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 220
    const-string v0, "messages"

    const-string v1, "thread_id LIKE ?"

    new-array v2, v7, [Ljava/lang/String;

    const-string v3, "mms-sms.%"

    aput-object v3, v2, v6

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 226
    const-string v0, "threads"

    const-string v1, "thread_id LIKE ?"

    new-array v2, v7, [Ljava/lang/String;

    const-string v3, "mms-sms.%"

    aput-object v3, v2, v6

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 231
    const-string v0, "archived_sms_mms_threads"

    invoke-virtual {p1, v0, v8, v8}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 232
    return-void
.end method
