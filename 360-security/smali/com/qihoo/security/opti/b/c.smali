.class public Lcom/qihoo/security/opti/b/c;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:[B

.field private static b:Lcom/qihoo/security/opti/b/c;


# instance fields
.field private c:Landroid/content/Context;

.field private d:Lcom/qihoo360/mobilesafe/core/c/c;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/qihoo/security/opti/b/c;->a:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/opti/b/c;->d:Lcom/qihoo360/mobilesafe/core/c/c;

    .line 37
    new-instance v0, Lcom/qihoo/security/opti/b/c$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/b/c$1;-><init>(Lcom/qihoo/security/opti/b/c;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/b/c;->g:Landroid/content/ServiceConnection;

    .line 52
    iput-object p1, p0, Lcom/qihoo/security/opti/b/c;->c:Landroid/content/Context;

    .line 53
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/qihoo/security/opti/b/c;
    .locals 2

    .prologue
    .line 56
    sget-object v0, Lcom/qihoo/security/opti/b/c;->b:Lcom/qihoo/security/opti/b/c;

    if-nez v0, :cond_1

    .line 57
    sget-object v1, Lcom/qihoo/security/opti/b/c;->a:[B

    monitor-enter v1

    .line 58
    :try_start_0
    sget-object v0, Lcom/qihoo/security/opti/b/c;->b:Lcom/qihoo/security/opti/b/c;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Lcom/qihoo/security/opti/b/c;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/b/c;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/opti/b/c;->b:Lcom/qihoo/security/opti/b/c;

    .line 61
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :cond_1
    sget-object v0, Lcom/qihoo/security/opti/b/c;->b:Lcom/qihoo/security/opti/b/c;

    return-object v0

    .line 61
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/b/c;Lcom/qihoo360/mobilesafe/core/c/c;)Lcom/qihoo360/mobilesafe/core/c/c;
    .locals 0

    .prologue
    .line 18
    iput-object p1, p0, Lcom/qihoo/security/opti/b/c;->d:Lcom/qihoo360/mobilesafe/core/c/c;

    return-object p1
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    .line 68
    iget-object v0, p0, Lcom/qihoo/security/opti/b/c;->c:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    sget-object v2, Lcom/qihoo/security/env/a;->f:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/opti/b/c;->g:Landroid/content/ServiceConnection;

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 70
    return-void
.end method

.method public declared-synchronized a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 78
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/qihoo/security/opti/b/c;->f:Ljava/util/List;

    .line 80
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 83
    :cond_1
    :try_start_1
    iput-object p1, p0, Lcom/qihoo/security/opti/b/c;->e:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b()V
    .locals 3

    .prologue
    .line 73
    sget-object v0, Lcom/qihoo/security/env/a;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/opti/b/c;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/opti/b/c;->g:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/s;->a(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/opti/b/c;->d:Lcom/qihoo360/mobilesafe/core/c/c;

    .line 75
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;"
        }
    .end annotation

    .prologue
    .line 87
    iget-object v0, p0, Lcom/qihoo/security/opti/b/c;->f:Ljava/util/List;

    return-object v0
.end method

.method public declared-synchronized d()J
    .locals 10

    .prologue
    const-wide/32 v4, 0x5700000

    .line 91
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/b/c;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/b/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-wide v0, v4

    .line 98
    :goto_0
    monitor-exit p0

    return-wide v0

    .line 94
    :cond_1
    const-wide/16 v2, 0x0

    .line 95
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/opti/b/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/KillBean;

    .line 96
    iget v0, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    int-to-long v6, v0

    const-wide/16 v8, 0x400

    mul-long/2addr v6, v8

    add-long/2addr v2, v6

    .line 97
    goto :goto_1

    .line 98
    :cond_2
    cmp-long v0, v2, v4

    if-lez v0, :cond_3

    move-wide v0, v2

    goto :goto_0

    :cond_3
    move-wide v0, v4

    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e()V
    .locals 3

    .prologue
    .line 102
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/b/c;->c:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_has_clear_memory"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 103
    iget-object v0, p0, Lcom/qihoo/security/opti/b/c;->d:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/b/c;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/b/c;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 107
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/opti/b/c;->d:Lcom/qihoo360/mobilesafe/core/c/c;

    iget-object v1, p0, Lcom/qihoo/security/opti/b/c;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Ljava/util/List;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    :goto_1
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lcom/qihoo/security/opti/b/c;->f:Ljava/util/List;

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/opti/b/c;->e:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 102
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 108
    :catch_0
    move-exception v0

    .line 109
    :try_start_3
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method
