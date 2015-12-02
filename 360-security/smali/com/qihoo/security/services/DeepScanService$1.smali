.class Lcom/qihoo/security/services/DeepScanService$1;
.super Lcom/qihoo/security/services/IDeepScan$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/services/DeepScanService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/services/DeepScanService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/services/DeepScanService;)V
    .locals 0

    iput-object p1, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    invoke-direct {p0}, Lcom/qihoo/security/services/IDeepScan$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const v0, 0x13351f2

    return v0
.end method

.method public a(Ljava/lang/String;Z)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    sput-boolean p2, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    sget-boolean v1, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/b/c;->a(Z)V

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/engine/b/c;->c(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const v0, -0x7fffbfff

    return v0
.end method

.method public a(Ljava/util/List;Z)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/DeepScanItem;",
            ">;Z)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    sput-boolean p2, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    sget-boolean v1, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/b/c;->a(Z)V

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/engine/b/c;->a(Ljava/util/List;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/engine/b/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0, p1, p2}, Lcom/qihoo/security/engine/b/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/services/c;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/engine/b/c;->a(Lcom/qihoo/security/services/c;)Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->a()I

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0, p1, p2}, Lcom/qihoo/security/engine/b/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    return v0
.end method

.method public b(Ljava/lang/String;Z)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    sput-boolean p2, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    sget-boolean v1, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/b/c;->a(Z)V

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/engine/b/c;->d(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b(Lcom/qihoo/security/services/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/engine/b/c;->b(Lcom/qihoo/security/services/c;)V

    return-void
.end method

.method public c()I
    .locals 2

    const/4 v1, 0x3

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->c:Lcom/qihoo/security/services/DeepScanService$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/services/DeepScanService$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->c:Lcom/qihoo/security/services/DeepScanService$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/services/DeepScanService$a;->removeMessages(I)V

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->b()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->d()I

    move-result v0

    return v0
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->e()I

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->f()I

    move-result v0

    return v0
.end method

.method public g()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService$1;->a:Lcom/qihoo/security/services/DeepScanService;

    iget-object v0, v0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->g()V

    const/4 v0, 0x0

    return v0
.end method
