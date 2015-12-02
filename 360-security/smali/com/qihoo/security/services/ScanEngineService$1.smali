.class Lcom/qihoo/security/services/ScanEngineService$1;
.super Lcom/qihoo/security/services/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/services/ScanEngineService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/services/ScanEngineService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/services/ScanEngineService;)V
    .locals 0

    iput-object p1, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    invoke-direct {p0}, Lcom/qihoo/security/services/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qihoo/security/services/a;->a(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public a(IILjava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcom/qihoo/security/services/a;->a(IILjava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public a(ILcom/qihoo/security/services/ScanResult;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/qihoo/security/services/a;->a(ILcom/qihoo/security/services/ScanResult;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public a(ILcom/qihoo/security/services/ScanResult;Lcom/qihoo/security/services/b;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcom/qihoo/security/services/a;->a(ILcom/qihoo/security/services/ScanResult;Lcom/qihoo/security/services/b;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcom/qihoo/security/services/a;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public a(ILjava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
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

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/qihoo/security/services/a;->a(ILjava/util/List;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string/jumbo v2, "upload"

    sget-object v3, Lcom/qihoo/security/services/ScanEngineService;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string/jumbo v2, "download"

    sget-object v3, Lcom/qihoo/security/services/ScanEngineService;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string/jumbo v2, "network"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const-string/jumbo v2, "network"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/services/ScanResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/ApkInfo;->closeClassesDex()V

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    sput-boolean p1, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    return-void
.end method

.method public b(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qihoo/security/services/a;->b(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public b(ILcom/qihoo/security/services/ScanResult;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/qihoo/security/services/a;->b(ILcom/qihoo/security/services/ScanResult;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public c(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qihoo/security/services/a;->c(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public d(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qihoo/security/services/a;->d(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public e(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qihoo/security/services/a;->e(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public f(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qihoo/security/services/a;->f(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public g(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qihoo/security/services/a;->g(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public h(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qihoo/security/services/a;->h(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, -0x7fffbfff

    goto :goto_0
.end method

.method public i(I)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    iget-object v0, v0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qihoo/security/services/a;->i(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j(I)Landroid/os/IBinder;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/qihoo/security/services/a;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    :cond_0
    return-object v0

    :pswitch_1
    new-instance v1, Lcom/qihoo/security/engine/a/d;

    iget-object v2, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    invoke-direct {v1, v2}, Lcom/qihoo/security/engine/a/d;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :pswitch_2
    new-instance v1, Lcom/qihoo/security/engine/f/a;

    iget-object v2, p0, Lcom/qihoo/security/services/ScanEngineService$1;->a:Lcom/qihoo/security/services/ScanEngineService;

    invoke-direct {v1, v2}, Lcom/qihoo/security/engine/f/a;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
