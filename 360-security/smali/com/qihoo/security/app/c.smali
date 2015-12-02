.class public Lcom/qihoo/security/app/c;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field static a:Lcom/qihoo/security/app/c;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/qihoo/security/floatview/a/b;

.field private d:Lcom/qihoo/security/service/a;

.field private final e:Landroid/content/ServiceConnection;

.field private final f:Landroid/content/ServiceConnection;


# direct methods
.method private constructor <init>()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/app/c;->d:Lcom/qihoo/security/service/a;

    .line 46
    new-instance v0, Lcom/qihoo/security/app/c$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/app/c$1;-><init>(Lcom/qihoo/security/app/c;)V

    iput-object v0, p0, Lcom/qihoo/security/app/c;->e:Landroid/content/ServiceConnection;

    .line 65
    new-instance v0, Lcom/qihoo/security/app/c$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/app/c$2;-><init>(Lcom/qihoo/security/app/c;)V

    iput-object v0, p0, Lcom/qihoo/security/app/c;->f:Landroid/content/ServiceConnection;

    .line 39
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/app/c;->b:Landroid/content/Context;

    .line 40
    iget-object v0, p0, Lcom/qihoo/security/app/c;->b:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    const-string/jumbo v2, "com.qihoo.security.service.INTERNAL_CONTROL"

    iget-object v3, p0, Lcom/qihoo/security/app/c;->e:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/common/utils/Utils;->bindService(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 42
    iget-object v0, p0, Lcom/qihoo/security/app/c;->b:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    const-string/jumbo v2, "com.qihoo.security.floatview.SERVICER"

    iget-object v3, p0, Lcom/qihoo/security/app/c;->f:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/common/utils/Utils;->bindService(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 44
    return-void
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/app/c;
    .locals 2

    .prologue
    .line 29
    const-class v1, Lcom/qihoo/security/app/c;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/app/c;->a:Lcom/qihoo/security/app/c;

    if-nez v0, :cond_0

    .line 30
    new-instance v0, Lcom/qihoo/security/app/c;

    invoke-direct {v0}, Lcom/qihoo/security/app/c;-><init>()V

    sput-object v0, Lcom/qihoo/security/app/c;->a:Lcom/qihoo/security/app/c;

    .line 32
    :cond_0
    sget-object v0, Lcom/qihoo/security/app/c;->a:Lcom/qihoo/security/app/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 29
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/app/c;Lcom/qihoo/security/floatview/a/b;)Lcom/qihoo/security/floatview/a/b;
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lcom/qihoo/security/app/c;->c:Lcom/qihoo/security/floatview/a/b;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/app/c;Lcom/qihoo/security/service/a;)Lcom/qihoo/security/service/a;
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lcom/qihoo/security/app/c;->d:Lcom/qihoo/security/service/a;

    return-object p1
.end method


# virtual methods
.method public b()V
    .locals 3

    .prologue
    .line 87
    iget-object v0, p0, Lcom/qihoo/security/app/c;->c:Lcom/qihoo/security/floatview/a/b;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/app/c;->b:Landroid/content/Context;

    const-string/jumbo v1, "fv_enabled"

    invoke-static {}, Lcom/qihoo/security/floatview/a/a;->e()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    .line 94
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/app/c;->c:Lcom/qihoo/security/floatview/a/b;

    invoke-interface {v1, v0}, Lcom/qihoo/security/floatview/a/b;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    :cond_0
    :goto_0
    return-void

    .line 95
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public c()V
    .locals 3

    .prologue
    .line 105
    iget-object v0, p0, Lcom/qihoo/security/app/c;->b:Landroid/content/Context;

    const-string/jumbo v1, "notification"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    .line 106
    iget-object v1, p0, Lcom/qihoo/security/app/c;->d:Lcom/qihoo/security/service/a;

    if-eqz v1, :cond_0

    .line 108
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/app/c;->d:Lcom/qihoo/security/service/a;

    invoke-interface {v1, v0}, Lcom/qihoo/security/service/a;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    :cond_0
    :goto_0
    return-void

    .line 109
    :catch_0
    move-exception v0

    goto :goto_0
.end method
