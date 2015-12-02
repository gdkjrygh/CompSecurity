.class Lcom/qihoo/security/locale/LocaleManagerService$3;
.super Lcom/qihoo/security/locale/a$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/locale/LocaleManagerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/locale/LocaleManagerService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/locale/LocaleManagerService;)V
    .locals 0

    .prologue
    .line 514
    iput-object p1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-direct {p0}, Lcom/qihoo/security/locale/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 531
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->e(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "language"

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/qihoo/security/locale/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 694
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1}, Lcom/qihoo/security/locale/LocaleManagerService$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendMessage(Landroid/os/Message;)Z

    .line 695
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 517
    if-nez p1, :cond_0

    .line 518
    const-string/jumbo p1, ""

    .line 520
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->e(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "language"

    invoke-static {v0, v1, p1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0, p1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/lang/String;)V

    .line 527
    return-void
.end method

.method public b()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 557
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/locale/LocaleManagerService$3$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/locale/LocaleManagerService$3$1;-><init>(Lcom/qihoo/security/locale/LocaleManagerService$3;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 583
    return-void
.end method

.method public b(Lcom/qihoo/security/locale/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 699
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2, p1}, Lcom/qihoo/security/locale/LocaleManagerService$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendMessage(Landroid/os/Message;)Z

    .line 700
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 587
    .line 591
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->e(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/qihoo/security/locale/d;->a(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 592
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->e(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 593
    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 597
    if-eqz v4, :cond_0

    array-length v0, v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 610
    :cond_0
    :goto_0
    return-void

    .line 608
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v1

    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/util/List;ILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 609
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v1

    const/4 v2, 0x3

    aget-object v3, v4, v6

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/LocaleManagerService$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 601
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/locale/LocaleInfo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 704
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 659
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/LocaleInfo;

    .line 660
    iget-boolean v2, v0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    if-nez v2, :cond_0

    .line 664
    iget-object v2, v0, Lcom/qihoo/security/locale/LocaleInfo;->pkg:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 665
    const/4 v1, 0x2

    iput v1, v0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    .line 666
    iget-object v1, v0, Lcom/qihoo/security/locale/LocaleInfo;->url:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 668
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 672
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/locale/LocaleManagerService$3;->a()Ljava/lang/String;

    move-result-object v1

    .line 673
    iget-object v0, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/qihoo/security/locale/d;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 676
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    const-string/jumbo v5, ""

    aput-object v5, v3, v4

    const/4 v4, 0x3

    const-string/jumbo v5, ""

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/LocaleManagerService$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendMessage(Landroid/os/Message;)Z

    .line 680
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 690
    :cond_3
    :goto_0
    return-void

    .line 685
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public d(Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 614
    .line 617
    new-instance v0, Lcom/qihoo/security/lib/resl/ExtResources;

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->e(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/lib/resl/ExtResources;-><init>(Landroid/content/Context;)V

    .line 624
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/qihoo/security/lib/resl/ExtResources;->initResources(Ljava/lang/String;)V

    .line 625
    invoke-virtual {v0}, Lcom/qihoo/security/lib/resl/ExtResources;->loadInfo()V

    .line 626
    invoke-virtual {v0}, Lcom/qihoo/security/lib/resl/ExtResources;->getVersionCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 627
    invoke-virtual {v0}, Lcom/qihoo/security/lib/resl/ExtResources;->getPkgInfo()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v3, ";"

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 628
    invoke-virtual {v0}, Lcom/qihoo/security/lib/resl/ExtResources;->getPkgName()Ljava/lang/String;

    move-result-object v3

    .line 633
    if-eqz v4, :cond_0

    array-length v0, v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 650
    :cond_0
    :goto_0
    return-void

    .line 644
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v1

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/util/List;ILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 646
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->d(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/a$a;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v4, v1

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/d;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 648
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->d(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/locale/a$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/lang/String;)V

    goto :goto_0

    .line 637
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public d()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 552
    const/4 v0, 0x0

    return v0
.end method

.method public e()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 536
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-virtual {p0}, Lcom/qihoo/security/locale/LocaleManagerService$3;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/lang/String;)V

    .line 548
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 735
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0, p1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/lang/String;)V

    .line 736
    return-void
.end method

.method public f()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 709
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendEmptyMessage(I)Z

    .line 710
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 714
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->g(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 715
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->g(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 727
    :goto_0
    return-object v0

    .line 718
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->e(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    .line 719
    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    new-instance v2, Ljava/io/File;

    const-string/jumbo v3, "lang"

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/io/File;)Ljava/io/File;

    .line 720
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->g(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 721
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->g(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 727
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$3;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->g(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
