.class Lcom/qihoo360/mobilesafe/core/c$1;
.super Lcom/qihoo360/mobilesafe/core/c/c$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/core/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/core/c;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/core/c;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    .line 84
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c/c$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 238
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 239
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->g(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/b/e;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/qihoo360/mobilesafe/core/c/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 199
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 201
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo360/mobilesafe/core/c$1$5;

    invoke-direct {v1, p0, p1}, Lcom/qihoo360/mobilesafe/core/c$1$5;-><init>(Lcom/qihoo360/mobilesafe/core/c$1;Lcom/qihoo360/mobilesafe/core/c/a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 215
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 250
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 251
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo360/mobilesafe/core/c$1$7;

    invoke-direct {v1, p0, p2, p1}, Lcom/qihoo360/mobilesafe/core/c$1$7;-><init>(Lcom/qihoo360/mobilesafe/core/c$1;ZLjava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 269
    :cond_0
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 182
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 184
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo360/mobilesafe/core/c$1$4;

    invoke-direct {v1, p0, p1}, Lcom/qihoo360/mobilesafe/core/c$1$4;-><init>(Lcom/qihoo360/mobilesafe/core/c$1;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 195
    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 96
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 98
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo360/mobilesafe/core/c$1$1;

    invoke-direct {v1, p0, p1}, Lcom/qihoo360/mobilesafe/core/c$1$1;-><init>(Lcom/qihoo360/mobilesafe/core/c$1;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 132
    :cond_0
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 244
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 245
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->g(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/b/e;->e()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/qihoo360/mobilesafe/core/c/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 219
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 221
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo360/mobilesafe/core/c$1$6;

    invoke-direct {v1, p0, p1}, Lcom/qihoo360/mobilesafe/core/c$1$6;-><init>(Lcom/qihoo360/mobilesafe/core/c$1;Lcom/qihoo360/mobilesafe/core/c/a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 234
    :cond_0
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 316
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 318
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 319
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo360/mobilesafe/core/c$1$2;

    invoke-direct {v1, p0, p1}, Lcom/qihoo360/mobilesafe/core/c$1$2;-><init>(Lcom/qihoo360/mobilesafe/core/c$1;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 326
    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 136
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 138
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo360/mobilesafe/core/c$1$3;

    invoke-direct {v1, p0, p1}, Lcom/qihoo360/mobilesafe/core/c$1$3;-><init>(Lcom/qihoo360/mobilesafe/core/c$1;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 172
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 273
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 274
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo360/mobilesafe/core/c$1$8;

    invoke-direct {v1, p0}, Lcom/qihoo360/mobilesafe/core/c$1$8;-><init>(Lcom/qihoo360/mobilesafe/core/c$1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 282
    :cond_0
    return-void
.end method

.method public d()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 286
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 287
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 288
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo360/mobilesafe/core/c$1$9;

    invoke-direct {v1, p0}, Lcom/qihoo360/mobilesafe/core/c$1$9;-><init>(Lcom/qihoo360/mobilesafe/core/c$1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 295
    :cond_0
    return-void
.end method

.method public e()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 302
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 304
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 305
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo360/mobilesafe/core/c$1$10;

    invoke-direct {v1, p0}, Lcom/qihoo360/mobilesafe/core/c$1$10;-><init>(Lcom/qihoo360/mobilesafe/core/c$1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 312
    :cond_0
    return-void
.end method

.method public f()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 330
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 332
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->i(Lcom/qihoo360/mobilesafe/core/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->j(Lcom/qihoo360/mobilesafe/core/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 336
    :goto_0
    return v0

    .line 332
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 344
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 345
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->j(Lcom/qihoo360/mobilesafe/core/c;)Z

    move-result v0

    return v0
.end method

.method public h()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 350
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 351
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->k(Lcom/qihoo360/mobilesafe/core/c;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 359
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/c;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 360
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->g(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/d/h;->b(Landroid/content/Context;)J

    move-result-wide v0

    return-wide v0
.end method
