.class public Lcom/qihoo/security/clearengine/service/ClearEngineService;
.super Landroid/app/Service;
.source "360Security"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/qihoo/security/clearengine/service/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/clearengine/service/ClearEngineService;->b:Lcom/qihoo/security/clearengine/service/a;

    .line 15
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4

    .prologue
    .line 28
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 32
    const-string/jumbo v1, "ACTION_TRASH_CLEAR"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 36
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/ClearEngineService;->b:Lcom/qihoo/security/clearengine/service/a;

    if-nez v0, :cond_0

    .line 37
    new-instance v0, Lcom/qihoo/security/clearengine/service/a;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/service/ClearEngineService;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/a/a/a/c;->b(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;

    move-result-object v1

    .line 38
    iget-object v2, p0, Lcom/qihoo/security/clearengine/service/ClearEngineService;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo/a/a/a/c;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/IClearModule;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/clearengine/service/ClearEngineService;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/qihoo/a/a/a/c;->d(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/clearengine/service/a;-><init>(Lcom/qihoo360/mobilesafe/opti/i/trashclear/ITrashClear;Lcom/qihoo360/mobilesafe/opti/i/IClearModule;Lcom/qihoo360/mobilesafe/opti/i/whitelist/IBlackAndWhiteList;)V

    .line 37
    iput-object v0, p0, Lcom/qihoo/security/clearengine/service/ClearEngineService;->b:Lcom/qihoo/security/clearengine/service/a;

    .line 39
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/ClearEngineService;->b:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {p0}, Lcom/qihoo/security/e/a;->a(Landroid/content/Context;)Lcom/qihoo/security/e/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/clearengine/service/a;->a(Lcom/qihoo/security/e/a;)V

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/ClearEngineService;->b:Lcom/qihoo/security/clearengine/service/a;

    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/service/a;->d()Landroid/os/IBinder;

    move-result-object v0

    .line 44
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onCreate()V
    .locals 0

    .prologue
    .line 22
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 23
    iput-object p0, p0, Lcom/qihoo/security/clearengine/service/ClearEngineService;->a:Landroid/content/Context;

    .line 24
    return-void
.end method
