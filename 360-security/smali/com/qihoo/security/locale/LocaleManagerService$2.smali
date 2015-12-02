.class Lcom/qihoo/security/locale/LocaleManagerService$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/locale/LocaleManagerService;->onCreate()V
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
    .line 95
    iput-object p1, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->b(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/util/List;)Ljava/util/List;

    .line 102
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v2

    monitor-enter v2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService;->b(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/util/List;)V

    .line 105
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->d(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/a$a;->a()Ljava/lang/String;

    move-result-object v3

    .line 106
    const/4 v1, 0x0

    .line 107
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->c(Lcom/qihoo/security/locale/LocaleManagerService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/LocaleInfo;

    .line 109
    if-eqz v3, :cond_3

    iget-object v0, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 110
    const/4 v0, 0x1

    :goto_1
    move v1, v0

    .line 112
    goto :goto_0

    .line 114
    :cond_0
    if-nez v1, :cond_1

    .line 115
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->e(Lcom/qihoo/security/locale/LocaleManagerService;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "language"

    const-string/jumbo v3, ""

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    iget-object v1, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v1}, Lcom/qihoo/security/locale/LocaleManagerService;->d(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/locale/a$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;Ljava/lang/String;)V

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->f(Lcom/qihoo/security/locale/LocaleManagerService;)V

    .line 119
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 131
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$2;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendEmptyMessage(I)Z

    .line 133
    :cond_2
    return-void

    .line 119
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    .line 120
    :catch_0
    move-exception v0

    goto :goto_2

    :cond_3
    move v0, v1

    goto :goto_1
.end method
