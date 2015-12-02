.class Lcom/qihoo/security/locale/LocaleManagerService$3$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/locale/LocaleManagerService$3;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/locale/LocaleManagerService$3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/locale/LocaleManagerService$3;)V
    .locals 0

    .prologue
    .line 557
    iput-object p1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3$1;->a:Lcom/qihoo/security/locale/LocaleManagerService$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 566
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3$1;->a:Lcom/qihoo/security/locale/LocaleManagerService$3;

    iget-object v0, v0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->b(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v0

    .line 568
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3$1;->a:Lcom/qihoo/security/locale/LocaleManagerService$3;

    iget-object v1, v1, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1, v0}, Lcom/qihoo/security/locale/LocaleManagerService;->b(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/util/List;)V

    .line 569
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3$1;->a:Lcom/qihoo/security/locale/LocaleManagerService$3;

    iget-object v1, v1, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 570
    :try_start_1
    iget-object v2, p0, Lcom/qihoo/security/locale/LocaleManagerService$3$1;->a:Lcom/qihoo/security/locale/LocaleManagerService$3;

    iget-object v2, v2, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v2}, Lcom/qihoo/security/locale/LocaleManagerService;->c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 571
    iget-object v2, p0, Lcom/qihoo/security/locale/LocaleManagerService$3$1;->a:Lcom/qihoo/security/locale/LocaleManagerService$3;

    iget-object v2, v2, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v2}, Lcom/qihoo/security/locale/LocaleManagerService;->c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 572
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3$1;->a:Lcom/qihoo/security/locale/LocaleManagerService$3;

    iget-object v0, v0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    iget-object v2, p0, Lcom/qihoo/security/locale/LocaleManagerService$3$1;->a:Lcom/qihoo/security/locale/LocaleManagerService$3;

    iget-object v2, v2, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v2}, Lcom/qihoo/security/locale/LocaleManagerService;->d(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo/security/locale/a$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/lang/String;)V

    .line 573
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 580
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3$1;->a:Lcom/qihoo/security/locale/LocaleManagerService$3;

    iget-object v0, v0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendEmptyMessage(I)Z

    .line 581
    return-void

    .line 573
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    .line 574
    :catch_0
    move-exception v0

    goto :goto_0
.end method
