.class public Lcom/facebook/orca/prefs/b;
.super Ljava/lang/Object;
.source "GlobalNotificationPrefsSynchronizer.java"


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

.field private static b:J

.field private static c:J

.field private static d:J


# instance fields
.field private final e:Landroid/os/Handler;

.field private final f:Lcom/facebook/auth/b/b;

.field private final g:Lcom/facebook/fbservice/ops/k;

.field private final h:Lcom/facebook/prefs/shared/d;

.field private final i:Lcom/facebook/prefs/shared/f;

.field private j:Lcom/facebook/fbservice/ops/n;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private k:Lcom/facebook/orca/server/ay;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private l:Lcom/facebook/orca/server/SetSettingsParams;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private m:J
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private n:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private volatile o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 33
    const-class v0, Lcom/facebook/orca/prefs/b;

    sput-object v0, Lcom/facebook/orca/prefs/b;->a:Ljava/lang/Class;

    .line 35
    const-wide/16 v0, 0xfa0

    sput-wide v0, Lcom/facebook/orca/prefs/b;->b:J

    .line 36
    const-wide/32 v0, 0x927c0

    sput-wide v0, Lcom/facebook/orca/prefs/b;->c:J

    .line 37
    const-wide/16 v0, 0x5

    sput-wide v0, Lcom/facebook/orca/prefs/b;->d:J

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/b;Lcom/facebook/prefs/shared/d;Lcom/facebook/fbservice/ops/k;)V
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/facebook/orca/prefs/b;->f:Lcom/facebook/auth/b/b;

    .line 63
    iput-object p2, p0, Lcom/facebook/orca/prefs/b;->h:Lcom/facebook/prefs/shared/d;

    .line 64
    iput-object p3, p0, Lcom/facebook/orca/prefs/b;->g:Lcom/facebook/fbservice/ops/k;

    .line 65
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/prefs/b;->e:Landroid/os/Handler;

    .line 69
    new-instance v0, Lcom/facebook/orca/prefs/c;

    invoke-direct {v0, p0}, Lcom/facebook/orca/prefs/c;-><init>(Lcom/facebook/orca/prefs/b;)V

    iput-object v0, p0, Lcom/facebook/orca/prefs/b;->i:Lcom/facebook/prefs/shared/f;

    .line 75
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->i:Lcom/facebook/prefs/shared/f;

    invoke-interface {p2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 76
    return-void
.end method

.method private a()Lcom/facebook/orca/server/ay;
    .locals 2
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->k:Lcom/facebook/orca/server/ay;

    if-nez v0, :cond_0

    .line 103
    new-instance v0, Lcom/facebook/orca/server/ay;

    invoke-direct {v0}, Lcom/facebook/orca/server/ay;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/prefs/b;->k:Lcom/facebook/orca/server/ay;

    .line 106
    sget-wide v0, Lcom/facebook/orca/prefs/b;->b:J

    iput-wide v0, p0, Lcom/facebook/orca/prefs/b;->m:J

    .line 107
    invoke-direct {p0}, Lcom/facebook/orca/prefs/b;->b()V

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->k:Lcom/facebook/orca/server/ay;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/prefs/b;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/orca/prefs/b;->c()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/prefs/b;Lcom/facebook/prefs/shared/ae;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1}, Lcom/facebook/orca/prefs/b;->a(Lcom/facebook/prefs/shared/ae;)V

    return-void
.end method

.method private a(Lcom/facebook/prefs/shared/ae;)V
    .locals 4

    .prologue
    .line 79
    iget-boolean v0, p0, Lcom/facebook/orca/prefs/b;->o:Z

    if-eqz v0, :cond_1

    .line 98
    :cond_0
    :goto_0
    return-void

    .line 82
    :cond_1
    sget-object v0, Lcom/facebook/orca/prefs/n;->o:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p1}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->f:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->h:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->o:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/NotificationSetting;->b(J)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 93
    monitor-enter p0

    .line 94
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/prefs/b;->a()Lcom/facebook/orca/server/ay;

    move-result-object v1

    .line 95
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ay;->a(Z)Lcom/facebook/orca/server/ay;

    .line 96
    invoke-virtual {v1, v0}, Lcom/facebook/orca/server/ay;->a(Lcom/facebook/orca/notify/NotificationSetting;)Lcom/facebook/orca/server/ay;

    .line 97
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private b()V
    .locals 4

    .prologue
    .line 113
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->e:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/prefs/d;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/d;-><init>(Lcom/facebook/orca/prefs/b;)V

    iget-wide v2, p0, Lcom/facebook/orca/prefs/b;->m:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 119
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/prefs/b;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/orca/prefs/b;->d()V

    return-void
.end method

.method private declared-synchronized c()V
    .locals 3

    .prologue
    .line 122
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->k:Lcom/facebook/orca/server/ay;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 157
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 127
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->f:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->j:Lcom/facebook/fbservice/ops/n;

    if-nez v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->k:Lcom/facebook/orca/server/ay;

    invoke-virtual {v0}, Lcom/facebook/orca/server/ay;->c()Lcom/facebook/orca/server/SetSettingsParams;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/prefs/b;->l:Lcom/facebook/orca/server/SetSettingsParams;

    .line 138
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/prefs/b;->k:Lcom/facebook/orca/server/ay;

    .line 141
    sget-object v0, Lcom/facebook/orca/prefs/b;->a:Ljava/lang/Class;

    const-string v1, "Starting update"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 142
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 143
    const-string v1, "setSettingsParams"

    iget-object v2, p0, Lcom/facebook/orca/prefs/b;->l:Lcom/facebook/orca/server/SetSettingsParams;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 144
    iget-object v1, p0, Lcom/facebook/orca/prefs/b;->g:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->E:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/prefs/b;->j:Lcom/facebook/fbservice/ops/n;

    .line 146
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->j:Lcom/facebook/fbservice/ops/n;

    new-instance v1, Lcom/facebook/orca/prefs/e;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/e;-><init>(Lcom/facebook/orca/prefs/b;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 122
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic c(Lcom/facebook/orca/prefs/b;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/orca/prefs/b;->e()V

    return-void
.end method

.method private declared-synchronized d()V
    .locals 2

    .prologue
    .line 160
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/facebook/orca/prefs/b;->j:Lcom/facebook/fbservice/ops/n;

    .line 161
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/prefs/b;->l:Lcom/facebook/orca/server/SetSettingsParams;

    .line 162
    sget-wide v0, Lcom/facebook/orca/prefs/b;->b:J

    iput-wide v0, p0, Lcom/facebook/orca/prefs/b;->m:J

    .line 163
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/orca/prefs/b;->n:I

    .line 166
    invoke-direct {p0}, Lcom/facebook/orca/prefs/b;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    monitor-exit p0

    return-void

    .line 160
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized e()V
    .locals 6

    .prologue
    .line 170
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/facebook/orca/prefs/b;->j:Lcom/facebook/fbservice/ops/n;

    .line 171
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->k:Lcom/facebook/orca/server/ay;

    if-nez v0, :cond_0

    .line 172
    new-instance v0, Lcom/facebook/orca/server/ay;

    invoke-direct {v0}, Lcom/facebook/orca/server/ay;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/prefs/b;->k:Lcom/facebook/orca/server/ay;

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->k:Lcom/facebook/orca/server/ay;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ay;->a(Z)Lcom/facebook/orca/server/ay;

    .line 175
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->k:Lcom/facebook/orca/server/ay;

    iget-object v1, p0, Lcom/facebook/orca/prefs/b;->l:Lcom/facebook/orca/server/SetSettingsParams;

    invoke-virtual {v1}, Lcom/facebook/orca/server/SetSettingsParams;->b()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ay;->a(Lcom/facebook/orca/notify/NotificationSetting;)Lcom/facebook/orca/server/ay;

    .line 177
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/prefs/b;->l:Lcom/facebook/orca/server/SetSettingsParams;

    .line 178
    iget v0, p0, Lcom/facebook/orca/prefs/b;->n:I

    int-to-long v0, v0

    sget-wide v2, Lcom/facebook/orca/prefs/b;->d:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 179
    iget v0, p0, Lcom/facebook/orca/prefs/b;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/orca/prefs/b;->n:I

    .line 180
    const-wide/16 v0, 0x2

    iget-wide v2, p0, Lcom/facebook/orca/prefs/b;->m:J

    mul-long/2addr v0, v2

    sget-wide v2, Lcom/facebook/orca/prefs/b;->c:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/prefs/b;->m:J

    .line 181
    sget-object v0, Lcom/facebook/orca/prefs/b;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to update thread notification settings. Retrying in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/facebook/orca/prefs/b;->m:J

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

    .line 183
    invoke-direct {p0}, Lcom/facebook/orca/prefs/b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    :goto_0
    monitor-exit p0

    return-void

    .line 186
    :cond_1
    const/4 v0, 0x0

    :try_start_1
    iput v0, p0, Lcom/facebook/orca/prefs/b;->n:I

    .line 187
    sget-wide v0, Lcom/facebook/orca/prefs/b;->b:J

    iput-wide v0, p0, Lcom/facebook/orca/prefs/b;->m:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 170
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/notify/NotificationSetting;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 196
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/prefs/b;->o:Z

    .line 198
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 199
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->l:Lcom/facebook/orca/server/SetSettingsParams;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->k:Lcom/facebook/orca/server/ay;

    if-eqz v0, :cond_1

    .line 201
    :cond_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    iput-boolean v5, p0, Lcom/facebook/orca/prefs/b;->o:Z

    .line 215
    :goto_0
    return-void

    .line 204
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->h:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->o:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/NotificationSetting;->b(J)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 206
    invoke-virtual {p1}, Lcom/facebook/orca/notify/NotificationSetting;->d()J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/facebook/orca/notify/NotificationSetting;->d()J

    move-result-wide v3

    cmp-long v0, v1, v3

    if-eqz v0, :cond_2

    .line 207
    iget-object v0, p0, Lcom/facebook/orca/prefs/b;->h:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 208
    sget-object v1, Lcom/facebook/orca/prefs/n;->o:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/orca/notify/NotificationSetting;->d()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 209
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 211
    :cond_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 213
    iput-boolean v5, p0, Lcom/facebook/orca/prefs/b;->o:Z

    goto :goto_0

    .line 211
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 213
    :catchall_1
    move-exception v0

    iput-boolean v5, p0, Lcom/facebook/orca/prefs/b;->o:Z

    throw v0
.end method
