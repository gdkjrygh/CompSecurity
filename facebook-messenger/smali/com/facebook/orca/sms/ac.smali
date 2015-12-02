.class public Lcom/facebook/orca/sms/ac;
.super Lcom/facebook/backgroundtasks/a;
.source "MmsSmsLogExternalMessagesBackgroundTask.java"


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
.field private final b:Lcom/facebook/orca/g/aa;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/orca/g/r;

.field private final g:Lcom/facebook/prefs/shared/d;

.field private final h:Lcom/facebook/orca/sms/af;

.field private final i:Lcom/google/common/d/a/u;

.field private final j:Lcom/facebook/common/time/a;

.field private k:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable",
            "<",
            "Lcom/facebook/backgroundtasks/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-class v0, Lcom/facebook/orca/sms/ac;

    sput-object v0, Lcom/facebook/orca/sms/ac;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/g/aa;Lcom/facebook/orca/g/r;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/sms/af;Lcom/google/common/d/a/u;Lcom/facebook/common/time/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/orca/g/aa;",
            "Lcom/facebook/orca/g/r;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/orca/sms/af;",
            "Lcom/google/common/d/a/u;",
            "Lcom/facebook/common/time/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 58
    const-string v0, "MMS_SMS_LOG_EXTERNAL"

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/a;-><init>(Ljava/lang/String;)V

    .line 70
    new-instance v0, Lcom/facebook/orca/sms/ad;

    invoke-direct {v0, p0}, Lcom/facebook/orca/sms/ad;-><init>(Lcom/facebook/orca/sms/ac;)V

    iput-object v0, p0, Lcom/facebook/orca/sms/ac;->k:Ljava/util/concurrent/Callable;

    .line 59
    iput-object p1, p0, Lcom/facebook/orca/sms/ac;->e:Ljavax/inject/a;

    .line 60
    iput-object p2, p0, Lcom/facebook/orca/sms/ac;->c:Ljavax/inject/a;

    .line 61
    iput-object p3, p0, Lcom/facebook/orca/sms/ac;->d:Ljavax/inject/a;

    .line 62
    iput-object p4, p0, Lcom/facebook/orca/sms/ac;->b:Lcom/facebook/orca/g/aa;

    .line 63
    iput-object p5, p0, Lcom/facebook/orca/sms/ac;->f:Lcom/facebook/orca/g/r;

    .line 64
    iput-object p6, p0, Lcom/facebook/orca/sms/ac;->g:Lcom/facebook/prefs/shared/d;

    .line 65
    iput-object p7, p0, Lcom/facebook/orca/sms/ac;->h:Lcom/facebook/orca/sms/af;

    .line 66
    iput-object p8, p0, Lcom/facebook/orca/sms/ac;->i:Lcom/google/common/d/a/u;

    .line 67
    iput-object p9, p0, Lcom/facebook/orca/sms/ac;->j:Lcom/facebook/common/time/a;

    .line 68
    return-void
.end method

.method private a(J)Lcom/facebook/orca/sms/ae;
    .locals 15

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "SELECT msg_id, sender, timestamp_ms FROM messages WHERE handled_internally_time = 0 and timestamp_ms > ?"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 172
    const/4 v4, 0x0

    .line 173
    const/4 v3, 0x0

    .line 174
    const/4 v2, 0x0

    .line 175
    const/4 v1, 0x0

    move-wide/from16 v5, p1

    .line 178
    :goto_0
    :try_start_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 179
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 182
    invoke-static {v8}, Lcom/facebook/orca/threads/m;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v8}, Lcom/facebook/orca/threads/m;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->f:Lcom/facebook/orca/g/r;

    const/4 v9, 0x1

    invoke-interface {v7, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/facebook/orca/g/r;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v9

    .line 186
    const/4 v0, 0x2

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    .line 187
    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 188
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v9}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v12

    invoke-static {v0, v12}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 189
    invoke-static {v8}, Lcom/facebook/orca/threads/m;->i(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 190
    add-int/lit8 v4, v4, 0x1

    move v0, v3

    move v3, v4

    .line 194
    :goto_1
    :try_start_1
    invoke-static {v5, v6, v10, v11}, Ljava/lang/Math;->max(JJ)J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v5

    move v13, v1

    move v1, v2

    move v2, v0

    move v0, v13

    :goto_2
    move v4, v3

    move v3, v2

    move v2, v1

    move v1, v0

    .line 204
    goto :goto_0

    .line 192
    :cond_1
    add-int/lit8 v0, v3, 0x1

    move v3, v4

    goto :goto_1

    .line 195
    :cond_2
    :try_start_2
    invoke-virtual {v9}, Lcom/facebook/messages/model/threads/ParticipantInfo;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 196
    invoke-static {v8}, Lcom/facebook/orca/threads/m;->i(Ljava/lang/String;)Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    .line 197
    add-int/lit8 v2, v2, 0x1

    move v0, v1

    move v1, v2

    .line 201
    :goto_3
    :try_start_3
    invoke-static {v5, v6, v10, v11}, Ljava/lang/Math;->max(JJ)J
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-wide v5

    move v2, v3

    move v3, v4

    goto :goto_2

    .line 199
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v2

    goto :goto_3

    .line 208
    :cond_4
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    move v13, v1

    move v1, v4

    move v4, v13

    move v14, v3

    move v3, v2

    move v2, v14

    .line 211
    :goto_4
    new-instance v0, Lcom/facebook/orca/sms/ae;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/sms/ae;-><init>(IIIIJ)V

    return-object v0

    .line 205
    :catch_0
    move-exception v0

    move v13, v1

    move v1, v4

    move v4, v13

    move v14, v3

    move v3, v2

    move v2, v14

    .line 208
    :goto_5
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_4

    :catchall_0
    move-exception v0

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    throw v0

    .line 205
    :catch_1
    move-exception v4

    move v4, v1

    move v1, v3

    move v3, v2

    move v2, v0

    goto :goto_5

    :catch_2
    move-exception v2

    move v2, v3

    move v3, v1

    move v1, v4

    move v4, v0

    goto :goto_5

    :cond_5
    move v0, v1

    move v1, v2

    move v2, v3

    move v3, v4

    goto :goto_2
.end method

.method static synthetic a(Lcom/facebook/orca/sms/ac;)Lcom/facebook/orca/sms/af;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->h:Lcom/facebook/orca/sms/af;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/sms/ac;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->g:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/sms/ac;)Lcom/facebook/common/time/a;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->j:Lcom/facebook/common/time/a;

    return-object v0
.end method

.method private l()Z
    .locals 4

    .prologue
    const-wide/16 v2, -0x1

    .line 162
    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->j:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 109
    const-class v0, Lcom/facebook/orca/server/module/ThreadsQueue;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 94
    invoke-virtual {p0}, Lcom/facebook/orca/sms/ac;->d()Z

    move-result v1

    if-nez v1, :cond_1

    .line 99
    :cond_0
    :goto_0
    return v0

    .line 97
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/sms/ac;->g:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/n;->k:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v3, 0x0

    invoke-interface {v1, v2, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v1

    .line 99
    iget-object v3, p0, Lcom/facebook/orca/sms/ac;->j:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    sub-long v1, v3, v1

    const-wide/32 v3, 0xa4cb80

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public c()Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/backgroundtasks/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->i:Lcom/google/common/d/a/u;

    iget-object v1, p0, Lcom/facebook/orca/sms/ac;->k:Ljava/util/concurrent/Callable;

    invoke-interface {v0, v1}, Lcom/google/common/d/a/u;->c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method d()Z
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 119
    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 114
    const-class v0, Lcom/facebook/orca/background/MessagesTaskTag;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method k()Lcom/facebook/orca/sms/ae;
    .locals 7
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 137
    invoke-direct {p0}, Lcom/facebook/orca/sms/ac;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->g:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 139
    sget-object v1, Lcom/facebook/orca/prefs/n;->j:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/sms/ac;->j:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 140
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 141
    sget-object v0, Lcom/facebook/orca/sms/ae;->f:Lcom/facebook/orca/sms/ae;

    .line 158
    :goto_0
    return-object v0

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/sms/ac;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->j:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    .line 149
    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/sms/ac;->a(J)Lcom/facebook/orca/sms/ae;

    move-result-object v0

    .line 152
    iget-wide v1, v0, Lcom/facebook/orca/sms/ae;->e:J

    iget-object v3, p0, Lcom/facebook/orca/sms/ac;->j:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    const-wide/32 v5, 0x5265c00

    sub-long/2addr v3, v5

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    .line 155
    iget-object v3, p0, Lcom/facebook/orca/sms/ac;->g:Lcom/facebook/prefs/shared/d;

    invoke-interface {v3}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v3

    .line 156
    sget-object v4, Lcom/facebook/orca/prefs/n;->j:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v3, v4, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 157
    invoke-interface {v3}, Lcom/facebook/prefs/shared/e;->a()V

    goto :goto_0
.end method
