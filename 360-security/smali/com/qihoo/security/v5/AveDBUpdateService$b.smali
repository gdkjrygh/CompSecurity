.class Lcom/qihoo/security/v5/AveDBUpdateService$b;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v5/AveDBUpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/AveDBUpdateService;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/v5/AveDBUpdateService;)V
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lcom/qihoo/security/v5/AveDBUpdateService$b;->a:Lcom/qihoo/security/v5/AveDBUpdateService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/v5/AveDBUpdateService;Lcom/qihoo/security/v5/AveDBUpdateService$1;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/qihoo/security/v5/AveDBUpdateService$b;-><init>(Lcom/qihoo/security/v5/AveDBUpdateService;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 23
    const/4 v0, 0x0

    .line 24
    if-eqz p2, :cond_6

    .line 25
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    move-object v1, v0

    .line 27
    :goto_0
    invoke-static {}, Lcom/qihoo/security/v5/AveDBUpdateService;->b()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/v5/AveDBUpdateService$a;

    .line 28
    const-string/jumbo v2, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_INI"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 29
    if-eqz v0, :cond_0

    .line 30
    invoke-interface {v0, v1}, Lcom/qihoo/security/v5/AveDBUpdateService$a;->b(Landroid/os/Bundle;)V

    .line 53
    :cond_0
    :goto_1
    return-void

    .line 32
    :cond_1
    const-string/jumbo v2, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_BEGIN"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 33
    if-eqz v0, :cond_0

    .line 34
    invoke-interface {v0, v1}, Lcom/qihoo/security/v5/AveDBUpdateService$a;->e(Landroid/os/Bundle;)V

    goto :goto_1

    .line 36
    :cond_2
    const-string/jumbo v2, "com.qihoo.antivirus.update.action.DATA_FILE_PROGRESS"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 37
    if-eqz v0, :cond_0

    .line 38
    invoke-interface {v0, v1}, Lcom/qihoo/security/v5/AveDBUpdateService$a;->a(Landroid/os/Bundle;)V

    goto :goto_1

    .line 40
    :cond_3
    const-string/jumbo v2, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_END"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 41
    if-eqz v0, :cond_0

    .line 42
    invoke-interface {v0, v1}, Lcom/qihoo/security/v5/AveDBUpdateService$a;->d(Landroid/os/Bundle;)V

    goto :goto_1

    .line 44
    :cond_4
    const-string/jumbo v2, "com.qihoo.antivirus.update.action.ERROR"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 45
    if-eqz v0, :cond_0

    .line 46
    invoke-interface {v0, v1}, Lcom/qihoo/security/v5/AveDBUpdateService$a;->c(Landroid/os/Bundle;)V

    goto :goto_1

    .line 48
    :cond_5
    const-string/jumbo v2, "com.qihoo.antivirus.update.action.UPDATE_CHECK_OVER"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    invoke-interface {v0, v1}, Lcom/qihoo/security/v5/AveDBUpdateService$a;->f(Landroid/os/Bundle;)V

    goto :goto_1

    :cond_6
    move-object v1, v0

    goto :goto_0
.end method
