.class public Lcom/facebook/orca/sms/bn;
.super Ljava/lang/Object;
.source "SmsContentResolverHandler.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final d:[Ljava/lang/String;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/orca/sms/bk;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 37
    const-class v0, Lcom/facebook/orca/sms/bn;

    sput-object v0, Lcom/facebook/orca/sms/bn;->a:Ljava/lang/Class;

    .line 510
    new-array v0, v2, [Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/sms/bn;->d:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/sms/bk;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/facebook/orca/sms/bn;->b:Landroid/content/Context;

    .line 60
    iput-object p2, p0, Lcom/facebook/orca/sms/bn;->c:Lcom/facebook/orca/sms/bk;

    .line 61
    return-void
.end method

.method static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x1

    const/4 v4, 0x0

    .line 407
    invoke-static {p0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 408
    const-string v0, "SELECT MAX(date) AS normalized_date, thread_id AS thread_id, MAX(_id) AS _id FROM sms WHERE %1$s GROUP BY thread_id"

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "type IN (1, 2, 5)"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 412
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "SELECT MAX(date) AS normalized_date, thread_id AS thread_id, MAX(_id) AS _id FROM sms WHERE %1$s GROUP BY thread_id"

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "type IN (1, 2, 5) AND "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 317
    if-nez p2, :cond_0

    .line 318
    const-string v0, ""

    .line 322
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "_id IN (SELECT sms._id FROM ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/facebook/orca/sms/bn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") sms "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "LEFT JOIN "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/facebook/orca/sms/r;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") mms "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "ON sms.thread_id=mms.thread_id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "WHERE "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(mms.normalized_date<sms.normalized_date OR mms.normalized_date IS NULL) "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ORDER BY sms.normalized_date DESC "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "LIMIT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, p3, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 320
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)Lcom/google/common/a/es;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 128
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v12

    .line 131
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/sms/bn;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid_src/c/l;->a:Landroid/net/Uri;

    sget-object v3, Lcom/facebook/orca/sms/bh;->b:[Ljava/lang/String;

    const/4 v5, 0x0

    const-string v6, "date DESC"

    move-object/from16 v4, p1

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v13

    .line 139
    :try_start_0
    const-string v1, "thread_id"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 140
    const-string v1, "_id"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 141
    const-string v1, "date"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 142
    const-string v1, "subject"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 143
    const-string v1, "body"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v18

    .line 144
    const-string v1, "address"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    .line 145
    const-string v1, "type"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    .line 146
    const-string v1, "read"

    invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    .line 147
    :goto_0
    invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 148
    invoke-interface {v13, v14}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 149
    invoke-interface {v13, v15}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 150
    move/from16 v0, v16

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    .line 151
    move/from16 v0, v17

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 152
    move/from16 v0, v18

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 153
    move/from16 v0, v19

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 154
    move/from16 v0, v20

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    .line 155
    move/from16 v0, v21

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v22

    .line 157
    const/4 v11, 0x2

    if-eq v8, v11, :cond_0

    const/4 v11, 0x6

    if-eq v8, v11, :cond_0

    const/4 v11, 0x4

    if-ne v8, v11, :cond_1

    .line 159
    :cond_0
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/sms/bn;->c:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v1}, Lcom/facebook/orca/sms/bk;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v11

    .line 164
    :goto_1
    new-instance v1, Lcom/facebook/orca/sms/f;

    if-nez v22, :cond_2

    const/4 v8, 0x1

    :goto_2
    invoke-direct/range {v1 .. v11}, Lcom/facebook/orca/sms/f;-><init>(JJJZLjava/lang/String;Ljava/lang/String;Lcom/facebook/messages/model/threads/ParticipantInfo;)V

    .line 174
    invoke-virtual {v12, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 177
    :catchall_0
    move-exception v1

    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    throw v1

    .line 161
    :cond_1
    :try_start_1
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/facebook/orca/sms/bn;->c:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v8, v1}, Lcom/facebook/orca/sms/bk;->a(Ljava/lang/String;)Lcom/facebook/user/User;

    move-result-object v1

    .line 162
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/facebook/orca/sms/bn;->c:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v8, v1}, Lcom/facebook/orca/sms/bk;->a(Lcom/facebook/user/User;)Lcom/facebook/messages/model/threads/ParticipantInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v11

    goto :goto_1

    .line 164
    :cond_2
    const/4 v8, 0x0

    goto :goto_2

    .line 177
    :cond_3
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    .line 179
    invoke-virtual {v12}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    return-object v1
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 385
    if-nez p2, :cond_0

    .line 386
    const-string v0, ""

    .line 390
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "_id IN (SELECT sms._id FROM ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/facebook/orca/sms/bn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") sms "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ORDER BY sms.normalized_date DESC "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "LIMIT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, p3, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 388
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WHERE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private c(Lcom/facebook/orca/sms/c;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    const-string v1, "sms.normalized_date"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->b()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 194
    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    :goto_0
    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->a()I

    move-result v2

    invoke-direct {p0, v1, v0, v2}, Lcom/facebook/orca/sms/bn;->a(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 197
    :cond_0
    const-string v1, "<="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method private d(Lcom/facebook/orca/sms/c;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 215
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    const-string v1, "sms.normalized_date"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->b()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 218
    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    :goto_0
    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->a()I

    move-result v2

    invoke-direct {p0, v1, v0, v2}, Lcom/facebook/orca/sms/bn;->b(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 221
    :cond_0
    const-string v1, "<="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method private d(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 239
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "thread_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 240
    const/4 v1, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/sms/bn;->a(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "thread_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 256
    const/4 v1, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/sms/bn;->b(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(J)J
    .locals 6

    .prologue
    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 604
    new-array v2, v4, [Ljava/lang/String;

    const-string v0, "thread_id"

    aput-object v0, v2, v1

    .line 605
    const-string v3, "_id=?"

    .line 606
    new-array v4, v4, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v1

    .line 607
    iget-object v0, p0, Lcom/facebook/orca/sms/bn;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid_src/c/l;->a:Landroid/net/Uri;

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 610
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 611
    const-string v0, "thread_id"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v2

    .line 615
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-wide v2

    .line 613
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/Exception;

    const-string v2, "Could not find SmsId by MessageId"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 615
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;JJI)J
    .locals 3

    .prologue
    .line 582
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 583
    const-string v0, "address"

    invoke-virtual {v1, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 584
    const-string v0, "date"

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 585
    const-string v0, "date_sent"

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 586
    const-string v0, "body"

    invoke-virtual {v1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 587
    const-string v0, "type"

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 588
    const-string v0, "seen"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 591
    iget-object v0, p0, Lcom/facebook/orca/sms/bn;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v2, Landroid_src/c/l;->a:Landroid/net/Uri;

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v0

    .line 593
    if-nez v0, :cond_0

    .line 596
    const-string v0, "date_sent"

    invoke-virtual {v1, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 597
    iget-object v0, p0, Lcom/facebook/orca/sms/bn;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v2, Landroid_src/c/l;->a:Landroid/net/Uri;

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v0

    .line 600
    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public a()Lcom/facebook/messages/model/threads/Message;
    .locals 6

    .prologue
    .line 520
    iget-object v0, p0, Lcom/facebook/orca/sms/bn;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid_src/c/l;->a:Landroid/net/Uri;

    sget-object v2, Lcom/facebook/orca/sms/bh;->c:[Ljava/lang/String;

    const-string v3, "type=?"

    sget-object v4, Lcom/facebook/orca/sms/bn;->d:[Ljava/lang/String;

    const-string v5, "date DESC LIMIT 1"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 528
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 529
    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/bn;->a(Landroid/database/Cursor;)Lcom/facebook/messages/model/threads/Message;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 532
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 534
    :goto_0
    return-object v0

    .line 532
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 534
    const/4 v0, 0x0

    goto :goto_0

    .line 532
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method a(Landroid/database/Cursor;)Lcom/facebook/messages/model/threads/Message;
    .locals 13

    .prologue
    const/4 v3, 0x0

    .line 471
    const-string v0, "type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    .line 473
    sget-object v1, Lcom/facebook/messages/model/threads/SendError;->a:Lcom/facebook/messages/model/threads/SendError;

    .line 474
    const/4 v0, 0x0

    .line 475
    const/4 v4, 0x2

    if-ne v2, v4, :cond_0

    .line 476
    iget-object v0, p0, Lcom/facebook/orca/sms/bn;->c:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v0}, Lcom/facebook/orca/sms/bk;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    move v2, v3

    .line 486
    :goto_0
    const-string v4, "subject"

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 487
    const-string v5, "body"

    invoke-interface {p1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 488
    const-string v6, "thread_id"

    invoke-interface {p1, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    invoke-interface {p1, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    .line 489
    const-string v8, "_id"

    invoke-interface {p1, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {p1, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    .line 490
    invoke-static {v6, v7}, Lcom/facebook/orca/threads/m;->a(J)Ljava/lang/String;

    move-result-object v6

    .line 491
    invoke-static {v8, v9}, Lcom/facebook/orca/threads/m;->b(J)Ljava/lang/String;

    move-result-object v7

    .line 492
    const-string v8, "date"

    invoke-interface {p1, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {p1, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    .line 493
    const-wide/32 v10, 0xf4240

    mul-long/2addr v10, v8

    .line 494
    new-instance v12, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v12}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v12, v7}, Lcom/facebook/messages/model/threads/e;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/facebook/messages/model/threads/e;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v6

    invoke-virtual {v6, v2}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/SendError;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/facebook/messages/model/threads/e;->c(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/facebook/messages/model/threads/e;->d(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v8, v9}, Lcom/facebook/messages/model/threads/e;->a(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v10, v11}, Lcom/facebook/messages/model/threads/e;->c(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/messages/model/threads/e;->a(Z)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    const-string v1, "sms"

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->f(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/messages/model/threads/c;->SMS:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/c;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    return-object v0

    .line 477
    :cond_0
    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    .line 478
    const-string v0, "address"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 479
    iget-object v2, p0, Lcom/facebook/orca/sms/bn;->c:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/sms/bk;->a(Ljava/lang/String;)Lcom/facebook/user/User;

    move-result-object v0

    .line 480
    iget-object v2, p0, Lcom/facebook/orca/sms/bn;->c:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/sms/bk;->a(Lcom/facebook/user/User;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    move v2, v3

    .line 481
    goto/16 :goto_0

    :cond_1
    const/4 v4, 0x5

    if-ne v2, v4, :cond_2

    .line 482
    iget-object v0, p0, Lcom/facebook/orca/sms/bn;->c:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v0}, Lcom/facebook/orca/sms/bk;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 483
    const/16 v2, 0x385

    .line 484
    sget-object v1, Lcom/facebook/messages/model/threads/SendError;->g:Lcom/facebook/messages/model/threads/SendError;

    goto/16 :goto_0

    :cond_2
    move v2, v3

    goto/16 :goto_0
.end method

.method a(Lcom/facebook/orca/sms/b;)Lcom/google/common/a/es;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/sms/b;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    .line 424
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v6

    .line 427
    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->c()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 428
    const-string v0, "date"

    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/d/d/e;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v0

    .line 435
    :goto_0
    const/4 v1, 0x3

    new-array v1, v1, [Lcom/facebook/d/d/j;

    const/4 v2, 0x0

    const-string v3, "thread_id"

    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "type IN (1, 2, 5)"

    invoke-static {v3}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object v0, v1, v2

    invoke-static {v1}, Lcom/facebook/d/d/e;->a([Lcom/facebook/d/d/j;)Lcom/facebook/d/d/f;

    move-result-object v4

    .line 440
    iget-object v0, p0, Lcom/facebook/orca/sms/bn;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid_src/c/l;->a:Landroid/net/Uri;

    sget-object v2, Lcom/facebook/orca/sms/bh;->a:[Ljava/lang/String;

    invoke-virtual {v4}, Lcom/facebook/d/d/j;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/facebook/d/d/j;->b()[Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "date DESC LIMIT "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->b()I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 448
    :try_start_0
    const-string v0, "_id"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 451
    :goto_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 452
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 453
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 456
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    .line 431
    :cond_0
    const-string v0, "date"

    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->d()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/d/d/e;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v0

    goto/16 :goto_0

    .line 456
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 458
    invoke-virtual {v6}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method a(Lcom/facebook/orca/sms/c;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/sms/c;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 73
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/bn;->c(Lcom/facebook/orca/sms/c;)Ljava/lang/String;

    move-result-object v0

    .line 74
    invoke-direct {p0, v0}, Lcom/facebook/orca/sms/bn;->b(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/util/List;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 100
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/bn;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 101
    invoke-direct {p0, v0}, Lcom/facebook/orca/sms/bn;->b(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/util/Collection;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 630
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 631
    const-string v1, "read"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 632
    iget-object v1, p0, Lcom/facebook/orca/sms/bn;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid_src/c/l;->a:Landroid/net/Uri;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "thread_id IN "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Lcom/facebook/common/w/k;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 638
    return-void
.end method

.method b(Lcom/facebook/orca/sms/c;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/sms/c;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 86
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/bn;->d(Lcom/facebook/orca/sms/c;)Ljava/lang/String;

    move-result-object v0

    .line 87
    invoke-direct {p0, v0}, Lcom/facebook/orca/sms/bn;->b(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method b(Ljava/util/List;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 114
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/bn;->e(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 115
    invoke-direct {p0, v0}, Lcom/facebook/orca/sms/bn;->b(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method b(J)V
    .locals 4

    .prologue
    .line 620
    const-string v0, "_id=?"

    .line 621
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    .line 622
    iget-object v2, p0, Lcom/facebook/orca/sms/bn;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    sget-object v3, Landroid_src/c/l;->a:Landroid/net/Uri;

    invoke-virtual {v2, v3, v0, v1}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 623
    return-void
.end method

.method c(Ljava/util/List;)Lcom/google/common/a/es;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation

    .prologue
    .line 545
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 546
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 564
    :goto_0
    return-object v0

    .line 548
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v6

    .line 549
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 550
    iget-object v0, p0, Lcom/facebook/orca/sms/bn;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid_src/c/l;->a:Landroid/net/Uri;

    sget-object v2, Lcom/facebook/orca/sms/bh;->c:[Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "date DESC"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 558
    :goto_1
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 559
    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/bn;->a(Landroid/database/Cursor;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 562
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 564
    invoke-virtual {v6}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method
