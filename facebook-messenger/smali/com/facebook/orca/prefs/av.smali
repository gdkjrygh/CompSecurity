.class public Lcom/facebook/orca/prefs/av;
.super Ljava/lang/Object;
.source "ThreadNotificationPrefsSynchronizer.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/os/Handler;

.field private final c:Lcom/facebook/fbservice/ops/k;

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Lcom/facebook/prefs/shared/f;

.field private final f:Lcom/facebook/orca/f/k;

.field private final g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/facebook/fbservice/ops/n;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/server/ModifyThreadParams;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private j:Lcom/facebook/orca/server/ModifyThreadParams;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private k:J
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private l:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private volatile m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    const-class v0, Lcom/facebook/orca/prefs/av;

    sput-object v0, Lcom/facebook/orca/prefs/av;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/fbservice/ops/k;Lcom/facebook/orca/f/k;Ljavax/inject/a;Landroid/os/Handler;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/fbservice/ops/k;",
            "Lcom/facebook/orca/f/k;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            ">;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Lcom/facebook/orca/prefs/av;->d:Lcom/facebook/prefs/shared/d;

    .line 78
    iput-object p2, p0, Lcom/facebook/orca/prefs/av;->c:Lcom/facebook/fbservice/ops/k;

    .line 79
    iput-object p3, p0, Lcom/facebook/orca/prefs/av;->f:Lcom/facebook/orca/f/k;

    .line 80
    iput-object p4, p0, Lcom/facebook/orca/prefs/av;->g:Ljavax/inject/a;

    .line 81
    iput-object p5, p0, Lcom/facebook/orca/prefs/av;->b:Landroid/os/Handler;

    .line 85
    new-instance v0, Lcom/facebook/orca/prefs/aw;

    invoke-direct {v0, p0}, Lcom/facebook/orca/prefs/aw;-><init>(Lcom/facebook/orca/prefs/av;)V

    iput-object v0, p0, Lcom/facebook/orca/prefs/av;->e:Lcom/facebook/prefs/shared/f;

    .line 92
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->e:Lcom/facebook/prefs/shared/f;

    invoke-interface {p1, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 93
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/prefs/av;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/facebook/orca/prefs/av;->e()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/prefs/av;Lcom/facebook/prefs/shared/ae;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1}, Lcom/facebook/orca/prefs/av;->a(Lcom/facebook/prefs/shared/ae;)V

    return-void
.end method

.method private a(Lcom/facebook/prefs/shared/ae;)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    .line 102
    iget-boolean v0, p0, Lcom/facebook/orca/prefs/av;->m:Z

    if-eqz v0, :cond_1

    .line 134
    :cond_0
    :goto_0
    return-void

    .line 106
    :cond_1
    sget-object v0, Lcom/facebook/orca/prefs/n;->A:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1, v0}, Lcom/facebook/prefs/shared/ae;->a(Lcom/facebook/common/s/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    sget-object v0, Lcom/facebook/orca/prefs/n;->A:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1, v0}, Lcom/facebook/prefs/shared/ae;->b(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v0

    .line 108
    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 109
    array-length v1, v0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 112
    const/4 v1, 0x0

    aget-object v1, v0, v1

    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 113
    aget-object v0, v0, v3

    .line 114
    const-string v2, "muted_until2"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->f:Lcom/facebook/orca/f/k;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 118
    if-eqz v0, :cond_0

    .line 121
    invoke-static {v1}, Lcom/facebook/orca/prefs/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    .line 122
    iget-object v2, p0, Lcom/facebook/orca/prefs/av;->d:Lcom/facebook/prefs/shared/d;

    const-wide/16 v3, 0x0

    invoke-interface {v2, v0, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/facebook/orca/notify/NotificationSetting;->b(J)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 124
    monitor-enter p0

    .line 125
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/prefs/av;->b()Ljava/util/Map;

    move-result-object v2

    .line 126
    new-instance v3, Lcom/facebook/orca/server/an;

    invoke-direct {v3}, Lcom/facebook/orca/server/an;-><init>()V

    invoke-virtual {v3, v1}, Lcom/facebook/orca/server/an;->a(Ljava/lang/String;)Lcom/facebook/orca/server/an;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/facebook/orca/server/an;->c(Z)Lcom/facebook/orca/server/an;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/facebook/orca/server/an;->a(Lcom/facebook/orca/notify/NotificationSetting;)Lcom/facebook/orca/server/an;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/an;->h()Lcom/facebook/orca/server/ModifyThreadParams;

    move-result-object v0

    .line 131
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private b()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/server/ModifyThreadParams;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 139
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;

    .line 142
    const-wide/16 v0, 0xfa0

    iput-wide v0, p0, Lcom/facebook/orca/prefs/av;->k:J

    .line 143
    invoke-direct {p0}, Lcom/facebook/orca/prefs/av;->c()V

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/prefs/av;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/facebook/orca/prefs/av;->f()V

    return-void
.end method

.method private c()V
    .locals 4

    .prologue
    .line 149
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->b:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/prefs/ax;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/ax;-><init>(Lcom/facebook/orca/prefs/av;)V

    iget-wide v2, p0, Lcom/facebook/orca/prefs/av;->k:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 155
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/prefs/av;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/facebook/orca/prefs/av;->g()V

    return-void
.end method

.method private declared-synchronized e()V
    .locals 3

    .prologue
    .line 214
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 251
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 219
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->h:Lcom/facebook/fbservice/ops/n;

    if-nez v0, :cond_0

    .line 224
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 225
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 226
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 214
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 230
    :cond_2
    :try_start_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ModifyThreadParams;

    .line 231
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 233
    iput-object v0, p0, Lcom/facebook/orca/prefs/av;->j:Lcom/facebook/orca/server/ModifyThreadParams;

    .line 236
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 237
    const-string v2, "modifyThreadParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 238
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->c:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->v:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/prefs/av;->h:Lcom/facebook/fbservice/ops/n;

    .line 240
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->h:Lcom/facebook/fbservice/ops/n;

    new-instance v1, Lcom/facebook/orca/prefs/ay;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/ay;-><init>(Lcom/facebook/orca/prefs/av;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method private declared-synchronized f()V
    .locals 2

    .prologue
    .line 254
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/facebook/orca/prefs/av;->h:Lcom/facebook/fbservice/ops/n;

    .line 255
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/prefs/av;->j:Lcom/facebook/orca/server/ModifyThreadParams;

    .line 256
    const-wide/16 v0, 0xfa0

    iput-wide v0, p0, Lcom/facebook/orca/prefs/av;->k:J

    .line 257
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/orca/prefs/av;->l:I

    .line 260
    invoke-direct {p0}, Lcom/facebook/orca/prefs/av;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 261
    monitor-exit p0

    return-void

    .line 254
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized g()V
    .locals 6

    .prologue
    .line 264
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/facebook/orca/prefs/av;->h:Lcom/facebook/fbservice/ops/n;

    .line 265
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 266
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;

    .line 268
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->j:Lcom/facebook/orca/server/ModifyThreadParams;

    invoke-virtual {v0}, Lcom/facebook/orca/server/ModifyThreadParams;->a()Ljava/lang/String;

    move-result-object v0

    .line 269
    iget-object v1, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 270
    iget-object v1, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;

    iget-object v2, p0, Lcom/facebook/orca/prefs/av;->j:Lcom/facebook/orca/server/ModifyThreadParams;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/prefs/av;->j:Lcom/facebook/orca/server/ModifyThreadParams;

    .line 273
    iget v0, p0, Lcom/facebook/orca/prefs/av;->l:I

    int-to-long v0, v0

    const-wide/16 v2, 0x5

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 274
    iget v0, p0, Lcom/facebook/orca/prefs/av;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/orca/prefs/av;->l:I

    .line 275
    const-wide/16 v0, 0x2

    iget-wide v2, p0, Lcom/facebook/orca/prefs/av;->k:J

    mul-long/2addr v0, v2

    const-wide/32 v2, 0x927c0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/prefs/av;->k:J

    .line 276
    sget-object v0, Lcom/facebook/orca/prefs/av;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to update thread notification settings. Retrying in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/facebook/orca/prefs/av;->k:J

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " seconds"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 278
    invoke-direct {p0}, Lcom/facebook/orca/prefs/av;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    :goto_0
    monitor-exit p0

    return-void

    .line 281
    :cond_2
    const/4 v0, 0x0

    :try_start_1
    iput v0, p0, Lcom/facebook/orca/prefs/av;->l:I

    .line 282
    const-wide/16 v0, 0xfa0

    iput-wide v0, p0, Lcom/facebook/orca/prefs/av;->k:J

    .line 283
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;

    .line 284
    sget-object v0, Lcom/facebook/orca/prefs/av;->a:Ljava/lang/Class;

    const-string v1, "Failed to update thread notification settings. Giving up."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 264
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 12

    .prologue
    const/4 v11, 0x0

    .line 162
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->f:Lcom/facebook/orca/f/k;

    invoke-virtual {v0}, Lcom/facebook/orca/f/k;->a()Lcom/facebook/user/User;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    .line 163
    iget-object v1, p0, Lcom/facebook/orca/prefs/av;->f:Lcom/facebook/orca/f/k;

    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->g:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/k;->c(Lcom/facebook/orca/threads/FolderName;)Ljava/util/List;

    move-result-object v0

    .line 165
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/orca/prefs/av;->m:Z

    .line 167
    const/4 v1, 0x0

    .line 168
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 169
    :try_start_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 170
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v4

    .line 171
    invoke-virtual {v0, v2}, Lcom/facebook/orca/threads/ThreadSummary;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    .line 172
    if-eqz v0, :cond_0

    .line 176
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->h()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v5

    .line 178
    if-eqz v5, :cond_0

    .line 184
    invoke-static {v4}, Lcom/facebook/orca/prefs/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v6

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->d:Lcom/facebook/prefs/shared/d;

    const-wide/16 v7, 0x0

    invoke-interface {v0, v6, v7, v8}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/facebook/orca/notify/NotificationSetting;->b(J)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 188
    invoke-virtual {v5}, Lcom/facebook/orca/notify/NotificationSetting;->d()J

    move-result-wide v7

    invoke-virtual {v0}, Lcom/facebook/orca/notify/NotificationSetting;->d()J

    move-result-wide v9

    cmp-long v0, v7, v9

    if-eqz v0, :cond_6

    .line 190
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->j:Lcom/facebook/orca/server/ModifyThreadParams;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->j:Lcom/facebook/orca/server/ModifyThreadParams;

    invoke-virtual {v0}, Lcom/facebook/orca/server/ModifyThreadParams;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v1

    :goto_1
    move-object v1, v0

    .line 203
    goto :goto_0

    .line 193
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->i:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, v1

    goto :goto_1

    .line 197
    :cond_2
    if-nez v1, :cond_5

    .line 198
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 200
    :goto_2
    invoke-virtual {v5}, Lcom/facebook/orca/notify/NotificationSetting;->d()J

    move-result-wide v4

    invoke-interface {v0, v6, v4, v5}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    goto :goto_1

    .line 204
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 209
    :catchall_1
    move-exception v0

    iput-boolean v11, p0, Lcom/facebook/orca/prefs/av;->m:Z

    throw v0

    .line 204
    :cond_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 205
    if-eqz v1, :cond_4

    .line 206
    :try_start_4
    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 209
    :cond_4
    iput-boolean v11, p0, Lcom/facebook/orca/prefs/av;->m:Z

    .line 211
    return-void

    :cond_5
    move-object v0, v1

    goto :goto_2

    :cond_6
    move-object v0, v1

    goto :goto_1
.end method

.method public d()V
    .locals 2

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/orca/prefs/av;->d:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/orca/prefs/av;->e:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->b(Lcom/facebook/prefs/shared/f;)V

    .line 99
    return-void
.end method
