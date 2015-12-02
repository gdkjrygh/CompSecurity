.class public Lcom/facebook/orca/protocol/methods/p;
.super Ljava/lang/Object;
.source "FetchThreadsFqlHelper.java"


# instance fields
.field private final a:Lcom/facebook/orca/protocol/methods/bc;

.field private final b:Lcom/facebook/auth/protocol/j;

.field private final c:Lcom/facebook/user/ac;

.field private final d:Lcom/facebook/orca/protocol/methods/x;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/orca/protocol/methods/bc;Lcom/facebook/auth/protocol/j;Lcom/facebook/user/ac;Lcom/facebook/orca/protocol/methods/x;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/protocol/methods/bc;",
            "Lcom/facebook/auth/protocol/j;",
            "Lcom/facebook/user/ac;",
            "Lcom/facebook/orca/protocol/methods/x;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/p;->a:Lcom/facebook/orca/protocol/methods/bc;

    .line 51
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/p;->b:Lcom/facebook/auth/protocol/j;

    .line 52
    iput-object p3, p0, Lcom/facebook/orca/protocol/methods/p;->c:Lcom/facebook/user/ac;

    .line 53
    iput-object p4, p0, Lcom/facebook/orca/protocol/methods/p;->d:Lcom/facebook/orca/protocol/methods/x;

    .line 54
    iput-object p5, p0, Lcom/facebook/orca/protocol/methods/p;->e:Ljavax/inject/a;

    .line 55
    return-void
.end method


# virtual methods
.method a(Lcom/facebook/http/e/b;I)Lcom/facebook/orca/protocol/methods/q;
    .locals 4

    .prologue
    .line 305
    if-nez p2, :cond_0

    .line 306
    new-instance v0, Lcom/facebook/orca/protocol/methods/q;

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/protocol/methods/q;-><init>(Lcom/google/common/a/es;I)V

    .line 318
    :goto_0
    return-object v0

    .line 308
    :cond_0
    const-string v0, "messages"

    invoke-virtual {p1, v0}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 309
    if-nez v1, :cond_1

    .line 310
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing messages"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 312
    :cond_1
    const-string v0, "actions"

    invoke-virtual {p1, v0}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 313
    if-nez v2, :cond_2

    .line 314
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing actions"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 316
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/p;->d:Lcom/facebook/orca/protocol/methods/x;

    invoke-virtual {v0, v1, v2, p2}, Lcom/facebook/orca/protocol/methods/x;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;I)Lcom/google/common/a/es;

    move-result-object v3

    .line 318
    new-instance v0, Lcom/facebook/orca/protocol/methods/q;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v1

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v3, v1}, Lcom/facebook/orca/protocol/methods/q;-><init>(Lcom/google/common/a/es;I)V

    goto :goto_0
.end method

.method a(Lcom/facebook/http/e/b;ZI)Lcom/facebook/orca/protocol/methods/r;
    .locals 15

    .prologue
    .line 223
    const-string v1, "threads"

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v6

    .line 224
    if-nez v6, :cond_0

    .line 225
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Invalid api response - missing threads"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 227
    :cond_0
    const-string v1, "users"

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    .line 228
    const-string v1, "participant_profiles"

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v9

    .line 229
    const-string v1, "object_participant_profiles"

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v10

    .line 230
    if-nez v5, :cond_1

    .line 231
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Invalid api response - missing users"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 233
    :cond_1
    if-nez v9, :cond_2

    .line 234
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Invalid api response - missing participant_profiles"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 236
    :cond_2
    if-nez v10, :cond_3

    .line 237
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Invalid api response - missing object_participant_profiles"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 240
    :cond_3
    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v1

    invoke-static {v1}, Lcom/google/common/a/hq;->b(I)Ljava/util/ArrayList;

    move-result-object v4

    .line 242
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v11

    .line 243
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v12

    .line 244
    const-wide/16 v7, -0x1

    .line 245
    const/4 v1, 0x0

    move v3, v1

    :goto_0
    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v1

    if-ge v3, v1, :cond_7

    move/from16 v0, p3

    if-ge v3, v0, :cond_7

    .line 246
    invoke-virtual {v6, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 247
    iget-object v13, p0, Lcom/facebook/orca/protocol/methods/p;->a:Lcom/facebook/orca/protocol/methods/bc;

    move-object v1, v2

    check-cast v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {v13, v1, v10}, Lcom/facebook/orca/protocol/methods/bc;->a(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 249
    const-string v1, "action_id"

    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v13

    invoke-static {v13, v14, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    .line 250
    if-eqz p2, :cond_6

    .line 251
    const-string v1, "sync_change_type"

    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v1

    .line 252
    const-string v13, "deleted"

    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 253
    const-string v1, "archived"

    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->booleanValue()Z

    move-result v1

    .line 254
    const-string v13, "thread_id"

    invoke-virtual {v2, v13}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v2

    .line 255
    if-eqz v1, :cond_4

    .line 256
    invoke-virtual {v12, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 245
    :goto_1
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_0

    .line 258
    :cond_4
    invoke-virtual {v11, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 261
    :cond_5
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/p;->a:Lcom/facebook/orca/protocol/methods/bc;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/protocol/methods/bc;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 262
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 265
    :cond_6
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/p;->a:Lcom/facebook/orca/protocol/methods/bc;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/protocol/methods/bc;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 266
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 269
    :cond_7
    new-instance v1, Lcom/facebook/orca/threads/w;

    invoke-direct {v1}, Lcom/facebook/orca/threads/w;-><init>()V

    invoke-static {v4, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 270
    invoke-static {v4}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v2

    .line 271
    invoke-virtual {v11}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v3

    .line 272
    invoke-virtual {v12}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v4

    .line 275
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/p;->b:Lcom/facebook/auth/protocol/j;

    const/4 v11, 0x2

    new-array v11, v11, [Lcom/fasterxml/jackson/databind/JsonNode;

    const/4 v12, 0x0

    aput-object v9, v11, v12

    const/4 v9, 0x1

    aput-object v10, v11, v9

    invoke-virtual {v1, v11}, Lcom/facebook/auth/protocol/j;->a([Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 277
    iget-object v9, p0, Lcom/facebook/orca/protocol/methods/p;->b:Lcom/facebook/auth/protocol/j;

    invoke-virtual {v9, v5, v1}, Lcom/facebook/auth/protocol/j;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 278
    iget-object v5, p0, Lcom/facebook/orca/protocol/methods/p;->c:Lcom/facebook/user/ac;

    sget-object v9, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v5, v9, v1}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/n;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v5

    .line 280
    new-instance v1, Lcom/facebook/orca/protocol/methods/r;

    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v6

    invoke-direct/range {v1 .. v8}, Lcom/facebook/orca/protocol/methods/r;-><init>(Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;IJ)V

    return-object v1
.end method

.method a(Lcom/facebook/http/e/b;)Lcom/facebook/user/User;
    .locals 3

    .prologue
    .line 335
    const-string v0, "canonical_thread_user"

    invoke-virtual {p1, v0}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 336
    const-string v1, "canonical_thread_profile"

    invoke-virtual {p1, v1}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 337
    if-nez v0, :cond_0

    .line 338
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing users"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 340
    :cond_0
    if-nez v1, :cond_1

    .line 341
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing participant_profiles"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 344
    :cond_1
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/p;->b:Lcom/facebook/auth/protocol/j;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/auth/protocol/j;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 345
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/p;->c:Lcom/facebook/user/ac;

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/n;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v0

    .line 346
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_2

    .line 347
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response -- multiple users"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 348
    :cond_2
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-nez v1, :cond_3

    .line 349
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Failed to find user"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 351
    :cond_3
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    return-object v0
.end method

.method a(Lcom/facebook/http/e/a;)V
    .locals 2

    .prologue
    .line 188
    const-string v0, "user_settings"

    const-string v1, "SELECT setting, value FROM user_settings WHERE project=\'messaging\'"

    invoke-virtual {p1, v0, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    return-void
.end method

.method a(Lcom/facebook/http/e/a;Lcom/facebook/orca/threads/FolderName;)V
    .locals 4

    .prologue
    .line 179
    const-string v0, "folder_counts"

    const-string v1, "SELECT folder, unread_count, unseen_count, last_seen_time, total_threads, last_action_id FROM unified_message_count WHERE folder=\'%1$s\'"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    return-void
.end method

.method a(Lcom/facebook/http/e/a;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 141
    const-string v0, "canonical_thread_id"

    const-string v1, "SELECT thread_id FROM unified_thread WHERE single_recipient = %1$s LIMIT 1"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    return-void
.end method

.method a(Lcom/facebook/http/e/a;Ljava/lang/String;IZ)V
    .locals 6

    .prologue
    .line 62
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/protocol/methods/p;->a(Lcom/facebook/http/e/a;Ljava/lang/String;IZZ)V

    .line 63
    return-void
.end method

.method a(Lcom/facebook/http/e/a;Ljava/lang/String;IZZ)V
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 71
    if-eqz p4, :cond_0

    const-string v0, "unified_thread_sync"

    move-object v3, v0

    .line 72
    :goto_0
    if-eqz p5, :cond_1

    if-nez p4, :cond_1

    move v0, v1

    .line 73
    :goto_1
    const-string v4, "threads"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SELECT thread_id, thread_fbid, senders, participants, former_participants, object_participants, single_recipient, snippet, unread, action_id, last_visible_add_action_id, timestamp, name, pic_hash, mute, can_reply, snippet_sender, is_subscribed, admin_snippet, archived, folder"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    if-eqz v0, :cond_2

    const-string v0, ", read_receipts"

    :goto_2
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    if-eqz p4, :cond_3

    const-string v0, ", sync_change_type "

    :goto_3
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, " FROM %1$s WHERE %2$s ORDER BY timestamp DESC LIMIT %3$d"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v3, v5, v2

    aput-object p2, v5, v1

    const/4 v1, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v5, v1

    invoke-static {v0, v5}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    const-string v0, "participant_profiles"

    const-string v1, "SELECT id, name, type, pic_big, pic_square, pic_crop FROM profile WHERE id in (SELECT participants.user_id FROM #threads)"

    invoke-virtual {p1, v0, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, "object_participant_profiles"

    const-string v1, "SELECT id, name, type, pic_big, pic_square, pic_crop FROM profile WHERE id in (SELECT object_participants.id FROM #threads)"

    invoke-virtual {p1, v0, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    const-string v0, "users"

    const-string v1, "SELECT uid, first_name, last_name, last_active FROM user WHERE uid IN (SELECT participants.user_id FROM #threads)"

    invoke-virtual {p1, v0, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    return-void

    .line 71
    :cond_0
    const-string v0, "unified_thread"

    move-object v3, v0

    goto :goto_0

    :cond_1
    move v0, v2

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const-string v0, ""

    goto :goto_2

    :cond_3
    const-string v0, ""

    goto :goto_3
.end method

.method a(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 104
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/facebook/orca/protocol/methods/p;->b(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V

    .line 105
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/facebook/orca/protocol/methods/p;->c(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V

    .line 106
    return-void
.end method

.method b(Lcom/facebook/http/e/b;I)Lcom/facebook/orca/protocol/methods/q;
    .locals 3

    .prologue
    .line 324
    const-string v0, "messages"

    invoke-virtual {p1, v0}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 325
    if-nez v0, :cond_0

    .line 326
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing messages"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 328
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/p;->d:Lcom/facebook/orca/protocol/methods/x;

    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p2}, Lcom/facebook/orca/protocol/methods/x;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;I)Lcom/google/common/a/es;

    move-result-object v1

    .line 330
    new-instance v2, Lcom/facebook/orca/protocol/methods/q;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v0

    invoke-direct {v2, v1, v0}, Lcom/facebook/orca/protocol/methods/q;-><init>(Lcom/google/common/a/es;I)V

    return-object v2
.end method

.method b(Lcom/facebook/http/e/b;)Lcom/google/common/a/es;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/http/e/b;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 355
    const-string v0, "canonical_thread_user"

    invoke-virtual {p1, v0}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 356
    const-string v1, "canonical_thread_profile"

    invoke-virtual {p1, v1}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 357
    if-nez v0, :cond_0

    .line 358
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing users"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 360
    :cond_0
    if-nez v1, :cond_1

    .line 361
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing participant_profiles"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 364
    :cond_1
    iget-object v2, p0, Lcom/facebook/orca/protocol/methods/p;->b:Lcom/facebook/auth/protocol/j;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/auth/protocol/j;->a(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 365
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/p;->c:Lcom/facebook/user/ac;

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/n;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/google/common/a/es;

    move-result-object v0

    .line 367
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-nez v1, :cond_2

    .line 368
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Failed to find user"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 370
    :cond_2
    return-object v0
.end method

.method b(Lcom/facebook/http/e/a;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 151
    const-string v0, "canonical_thread_profile"

    const-string v1, "SELECT id, name, type, pic_big, pic_square, pic_crop FROM profile WHERE id = %1$s"

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p2, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string v0, "canonical_thread_user"

    const-string v1, "SELECT uid, first_name, last_name FROM user WHERE uid = %1$s"

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p2, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    return-void
.end method

.method b(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5

    .prologue
    .line 113
    const-string v0, "messages"

    const-string v1, "SELECT thread_id, message_id, action_id, body, sender, unread, recipients, timestamp, attachment_map, share_map, coordinates, log_message, offline_threading_id, tags FROM unified_message WHERE %1$s ORDER BY %2$s LIMIT %3$d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 v3, 0x1

    aput-object p3, v2, v3

    const/4 v3, 0x2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    return-void
.end method

.method c(Lcom/facebook/http/e/b;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 374
    const-string v0, "canonical_thread_id"

    invoke-virtual {p1, v0}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 375
    if-nez v0, :cond_0

    .line 376
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing canonical thread id"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 378
    :cond_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    .line 379
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing canonical thread id"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 381
    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 382
    const-string v1, "thread_id"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method c(Lcom/facebook/http/e/a;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 166
    const-string v0, "canonical_thread_profile"

    const-string v1, "SELECT id, name, type, pic_big, pic_square, pic_crop FROM profile WHERE id in (%1$s)"

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p2, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    const-string v0, "canonical_thread_user"

    const-string v1, "SELECT uid, first_name, last_name FROM user WHERE uid in (%1$s)"

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p2, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    return-void
.end method

.method c(Lcom/facebook/http/e/a;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5

    .prologue
    .line 129
    const-string v0, "actions"

    const-string v1, "SELECT thread_id, action_id, type, actor, users, timestamp, body FROM unified_thread_action WHERE %1$s ORDER BY %2$s LIMIT %3$d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 v3, 0x1

    aput-object p3, v2, v3

    const/4 v3, 0x2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/http/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    return-void
.end method

.method d(Lcom/facebook/http/e/b;)Lcom/facebook/orca/threads/FolderName;
    .locals 3

    .prologue
    .line 386
    const-string v0, "folder_counts"

    invoke-virtual {p1, v0}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 387
    if-nez v0, :cond_0

    .line 388
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing folder"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 390
    :cond_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    .line 391
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing folder"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 393
    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 395
    const-string v1, "folder"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threads/FolderType;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderType;

    move-result-object v1

    .line 396
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/p;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-static {v1, v0}, Lcom/facebook/orca/threads/FolderName;->a(Lcom/facebook/orca/threads/FolderType;Lcom/facebook/auth/viewercontext/ViewerContext;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    return-object v0
.end method

.method e(Lcom/facebook/http/e/b;)Lcom/facebook/orca/threads/FolderCounts;
    .locals 7

    .prologue
    .line 400
    const-string v0, "folder_counts"

    invoke-virtual {p1, v0}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 401
    if-nez v0, :cond_0

    .line 402
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing folder counts"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 404
    :cond_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    .line 405
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing folder counts"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 407
    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    .line 408
    new-instance v0, Lcom/facebook/orca/threads/FolderCounts;

    const-string v1, "unread_count"

    invoke-virtual {v5, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v1

    const-string v2, "unseen_count"

    invoke-virtual {v5, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->d(Lcom/fasterxml/jackson/databind/JsonNode;)I

    move-result v2

    const-string v3, "last_seen_time"

    invoke-virtual {v5, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v3

    const-string v6, "last_action_id"

    invoke-virtual {v5, v6}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v5

    invoke-static {v5}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/threads/FolderCounts;-><init>(IIJJ)V

    return-object v0
.end method

.method f(Lcom/facebook/http/e/b;)Lcom/facebook/orca/notify/NotificationSetting;
    .locals 5

    .prologue
    .line 416
    const-string v0, "user_settings"

    invoke-virtual {p1, v0}, Lcom/facebook/http/e/b;->a(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 417
    if-nez v1, :cond_0

    .line 418
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Invalid api response - missing user settings"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 420
    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 421
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    .line 422
    const-string v3, "mute_until"

    const-string v4, "setting"

    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 423
    const-string v0, "value"

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/NotificationSetting;->b(J)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 426
    :goto_1
    return-object v0

    .line 420
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 426
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method
