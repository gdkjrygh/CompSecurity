.class public Lcom/facebook/contacts/b/a;
.super Ljava/lang/Object;
.source "ContactInteractionEventsFetcher.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/ContentResolver;

.field private final c:Lcom/facebook/analytics/av;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/contacts/b/a;

    sput-object v0, Lcom/facebook/contacts/b/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/ContentResolver;Lcom/facebook/analytics/av;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/facebook/contacts/b/a;->b:Landroid/content/ContentResolver;

    .line 52
    iput-object p2, p0, Lcom/facebook/contacts/b/a;->c:Lcom/facebook/analytics/av;

    .line 53
    return-void
.end method

.method private a(J)J
    .locals 2

    .prologue
    .line 276
    const-wide v0, 0x75a956030L

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 277
    const-wide/16 v0, 0x3e8

    mul-long/2addr p1, v0

    .line 279
    :cond_0
    return-wide p1
.end method

.method private a(Lcom/facebook/user/UserPhoneNumber;ILcom/google/common/a/et;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/user/UserPhoneNumber;",
            "I",
            "Lcom/google/common/a/et",
            "<",
            "Lcom/facebook/contacts/server/ContactInteractionEvent;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 100
    invoke-virtual {p1}, Lcom/facebook/user/UserPhoneNumber;->b()Ljava/lang/String;

    move-result-object v6

    .line 101
    sget-object v0, Lcom/facebook/contacts/b/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fetching call events for phone: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 103
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v7

    .line 104
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v8

    .line 106
    sget-object v0, Landroid/provider/CallLog$Calls;->CONTENT_FILTER_URI:Landroid/net/Uri;

    invoke-static {v0, v6}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 108
    iget-object v0, p0, Lcom/facebook/contacts/b/a;->b:Landroid/content/ContentResolver;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "type"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string v4, "date"

    aput-object v4, v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 115
    const/4 v1, 0x0

    .line 116
    const/4 v0, 0x0

    .line 119
    :try_start_0
    const-string v3, "type"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    .line 120
    const-string v4, "date"

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 122
    sget-object v5, Lcom/facebook/contacts/b/a;->a:Ljava/lang/Class;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Got "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " calls for phone: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 124
    :cond_0
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_3

    if-ge v1, p2, :cond_3

    if-ge v0, p2, :cond_3

    .line 127
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    .line 128
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    .line 129
    const/4 v6, 0x2

    if-ne v5, v6, :cond_1

    if-ge v1, p2, :cond_1

    .line 130
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v7, v5}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 131
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 132
    :cond_1
    const/4 v6, 0x1

    if-eq v5, v6, :cond_2

    const/4 v6, 0x3

    if-ne v5, v6, :cond_0

    :cond_2
    if-ge v0, p2, :cond_0

    .line 134
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v8, v5}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 135
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 139
    :cond_3
    invoke-virtual {v7}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/server/c;->CALL_SENT:Lcom/facebook/contacts/server/c;

    invoke-direct {p0, v0, v1, p3}, Lcom/facebook/contacts/b/a;->a(Lcom/google/common/a/es;Lcom/facebook/contacts/server/c;Lcom/google/common/a/et;)V

    .line 144
    invoke-virtual {v8}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/server/c;->CALL_RECEIVED:Lcom/facebook/contacts/server/c;

    invoke-direct {p0, v0, v1, p3}, Lcom/facebook/contacts/b/a;->a(Lcom/google/common/a/es;Lcom/facebook/contacts/server/c;Lcom/google/common/a/et;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 152
    return-void

    .line 150
    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method private a(Lcom/facebook/user/UserPhoneNumber;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 5

    .prologue
    .line 285
    invoke-virtual {p1}, Lcom/facebook/user/UserPhoneNumber;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/i;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 287
    iget-object v1, p0, Lcom/facebook/contacts/b/a;->c:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "contact_importer_get_interaction_events_failed"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v3, "phone_number"

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "type"

    invoke-virtual {v2, v3, p2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "error"

    invoke-virtual {p3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 292
    sget-object v1, Lcom/facebook/contacts/b/a;->a:Ljava/lang/Class;

    const-string v2, "Fetching %s events failed for phone [%s] with exception: %s: "

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const/4 v0, 0x2

    aput-object p3, v3, v0

    invoke-static {v2, v3}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 297
    return-void
.end method

.method private a(Lcom/google/common/a/es;Lcom/facebook/contacts/server/c;Lcom/google/common/a/et;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/facebook/contacts/server/c;",
            "Lcom/google/common/a/et",
            "<",
            "Lcom/facebook/contacts/server/ContactInteractionEvent;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 259
    invoke-virtual {p1}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 268
    :goto_0
    return-void

    .line 263
    :cond_0
    new-instance v0, Lcom/facebook/contacts/server/ContactInteractionEvent;

    invoke-virtual {p1}, Lcom/google/common/a/es;->size()I

    move-result v1

    invoke-direct {v0, p2, v1, p1}, Lcom/facebook/contacts/server/ContactInteractionEvent;-><init>(Lcom/facebook/contacts/server/c;ILjava/util/List;)V

    invoke-virtual {p3, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0
.end method

.method private b(Lcom/facebook/user/UserPhoneNumber;ILcom/google/common/a/et;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/user/UserPhoneNumber;",
            "I",
            "Lcom/google/common/a/et",
            "<",
            "Lcom/facebook/contacts/server/ContactInteractionEvent;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 158
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/user/UserPhoneNumber;->b()Ljava/lang/String;

    move-result-object v8

    .line 159
    sget-object v2, Lcom/facebook/contacts/b/a;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Fetching SMS/MMS events for phone: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 161
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v9

    .line 162
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v10

    .line 163
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v11

    .line 164
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v12

    .line 166
    sget-object v2, Landroid_src/c/j;->c:Landroid/net/Uri;

    invoke-static {v2, v8}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 168
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/contacts/b/a;->b:Landroid/content/ContentResolver;

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    const-string v6, "transport_type"

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const-string v6, "type"

    aput-object v6, v4, v5

    const/4 v5, 0x2

    const-string v6, "date"

    aput-object v6, v4, v5

    const/4 v5, 0x3

    const-string v6, "msg_box"

    aput-object v6, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v13

    .line 180
    const/4 v3, 0x0

    .line 181
    const/4 v2, 0x0

    .line 182
    const/4 v5, 0x0

    .line 183
    const/4 v4, 0x0

    .line 186
    :try_start_0
    const-string v6, "transport_type"

    invoke-interface {v13, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 188
    const-string v6, "type"

    invoke-interface {v13, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 189
    const-string v6, "date"

    invoke-interface {v13, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 190
    const-string v6, "msg_box"

    invoke-interface {v13, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 192
    sget-object v6, Lcom/facebook/contacts/b/a;->a:Ljava/lang/Class;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v18, "Got "

    move-object/from16 v0, v18

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-interface {v13}, Landroid/database/Cursor;->getCount()I

    move-result v18

    move/from16 v0, v18

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v18, " messages for phone: "

    move-object/from16 v0, v18

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 194
    :cond_0
    :goto_0
    invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6

    if-eqz v6, :cond_9

    move/from16 v0, p2

    if-ge v3, v0, :cond_9

    move/from16 v0, p2

    if-ge v2, v0, :cond_9

    move/from16 v0, p2

    if-ge v5, v0, :cond_9

    move/from16 v0, p2

    if-ge v4, v0, :cond_9

    .line 199
    invoke-interface {v13, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 200
    const-string v7, "sms"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 201
    invoke-interface {v13, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    .line 202
    move/from16 v0, v16

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    .line 203
    invoke-static {v6}, Landroid_src/c/l;->a(I)Z

    move-result v18

    .line 204
    const/16 v19, 0x1

    move/from16 v0, v19

    if-ne v6, v0, :cond_1

    const/4 v6, 0x1

    .line 206
    :goto_1
    if-eqz v18, :cond_2

    move/from16 v0, p2

    if-ge v3, v0, :cond_2

    .line 207
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v9, v6}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 208
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 204
    :cond_1
    const/4 v6, 0x0

    goto :goto_1

    .line 209
    :cond_2
    if-eqz v6, :cond_0

    move/from16 v0, p2

    if-ge v2, v0, :cond_0

    .line 210
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v10, v6}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 211
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 213
    :cond_3
    const-string v7, "mms"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 214
    move/from16 v0, v17

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    .line 215
    move/from16 v0, v16

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    move-object/from16 v0, p0

    invoke-direct {v0, v6, v7}, Lcom/facebook/contacts/b/a;->a(J)J

    move-result-wide v18

    .line 216
    const/4 v6, 0x2

    if-eq v8, v6, :cond_4

    const/4 v6, 0x4

    if-ne v8, v6, :cond_5

    :cond_4
    const/4 v6, 0x1

    move v7, v6

    .line 219
    :goto_2
    const/4 v6, 0x1

    if-ne v8, v6, :cond_6

    const/4 v6, 0x1

    .line 221
    :goto_3
    if-eqz v7, :cond_7

    move/from16 v0, p2

    if-ge v5, v0, :cond_7

    .line 222
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v11, v6}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 223
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 216
    :cond_5
    const/4 v6, 0x0

    move v7, v6

    goto :goto_2

    .line 219
    :cond_6
    const/4 v6, 0x0

    goto :goto_3

    .line 224
    :cond_7
    if-eqz v6, :cond_0

    move/from16 v0, p2

    if-ge v4, v0, :cond_0

    .line 225
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v12, v6}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 226
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 229
    :cond_8
    sget-object v6, Lcom/facebook/contacts/b/a;->a:Ljava/lang/Class;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Ignoring unrecognized type discriminator: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 251
    :catchall_0
    move-exception v2

    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    throw v2

    .line 233
    :cond_9
    :try_start_1
    invoke-virtual {v9}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v2

    sget-object v3, Lcom/facebook/contacts/server/c;->SMS_SENT:Lcom/facebook/contacts/server/c;

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v2, v3, v1}, Lcom/facebook/contacts/b/a;->a(Lcom/google/common/a/es;Lcom/facebook/contacts/server/c;Lcom/google/common/a/et;)V

    .line 237
    invoke-virtual {v10}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v2

    sget-object v3, Lcom/facebook/contacts/server/c;->SMS_RECEIVED:Lcom/facebook/contacts/server/c;

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v2, v3, v1}, Lcom/facebook/contacts/b/a;->a(Lcom/google/common/a/es;Lcom/facebook/contacts/server/c;Lcom/google/common/a/et;)V

    .line 241
    invoke-virtual {v11}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v2

    sget-object v3, Lcom/facebook/contacts/server/c;->MMS_SENT:Lcom/facebook/contacts/server/c;

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v2, v3, v1}, Lcom/facebook/contacts/b/a;->a(Lcom/google/common/a/es;Lcom/facebook/contacts/server/c;Lcom/google/common/a/et;)V

    .line 245
    invoke-virtual {v12}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v2

    sget-object v3, Lcom/facebook/contacts/server/c;->MMS_RECEIVED:Lcom/facebook/contacts/server/c;

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v2, v3, v1}, Lcom/facebook/contacts/b/a;->a(Lcom/google/common/a/es;Lcom/facebook/contacts/server/c;Lcom/google/common/a/et;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 251
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    .line 253
    return-void
.end method


# virtual methods
.method public a(Lcom/google/common/a/es;I)Lcom/google/common/a/es;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserPhoneNumber;",
            ">;I)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/server/ContactInteractionEvent;",
            ">;"
        }
    .end annotation

    .prologue
    .line 62
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 64
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserPhoneNumber;

    .line 66
    :try_start_0
    invoke-direct {p0, v0, p2, v1}, Lcom/facebook/contacts/b/a;->a(Lcom/facebook/user/UserPhoneNumber;ILcom/google/common/a/et;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 79
    :goto_1
    :try_start_1
    invoke-direct {p0, v0, p2, v1}, Lcom/facebook/contacts/b/a;->b(Lcom/facebook/user/UserPhoneNumber;ILcom/google/common/a/et;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 83
    :catch_0
    move-exception v3

    .line 85
    const-string v4, "message_events"

    invoke-direct {p0, v0, v4, v3}, Lcom/facebook/contacts/b/a;->a(Lcom/facebook/user/UserPhoneNumber;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0

    .line 70
    :catch_1
    move-exception v3

    .line 72
    const-string v4, "call_events"

    invoke-direct {p0, v0, v4, v3}, Lcom/facebook/contacts/b/a;->a(Lcom/facebook/user/UserPhoneNumber;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_1

    .line 92
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
