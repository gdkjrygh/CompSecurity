.class public Lcom/qihoo/security/leak/LeakTipsService;
.super Lcom/qihoo/security/app/UiProcessService;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/leak/f$a;


# instance fields
.field private c:Lcom/qihoo/security/leak/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Lcom/qihoo/security/app/UiProcessService;-><init>()V

    .line 12
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/leak/LeakTipsService;->c:Lcom/qihoo/security/leak/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 45
    invoke-virtual {p0}, Lcom/qihoo/security/leak/LeakTipsService;->stopSelf()V

    .line 46
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 16
    const/4 v0, 0x0

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1}, Lcom/qihoo/security/app/UiProcessService;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 40
    iget-object v0, p0, Lcom/qihoo/security/leak/LeakTipsService;->c:Lcom/qihoo/security/leak/f;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/leak/f;->a(Landroid/content/res/Configuration;)V

    .line 41
    return-void
.end method

.method public onCreate()V
    .locals 1

    .prologue
    .line 21
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onCreate()V

    .line 22
    new-instance v0, Lcom/qihoo/security/leak/f;

    invoke-direct {v0, p0, p0}, Lcom/qihoo/security/leak/f;-><init>(Landroid/content/Context;Lcom/qihoo/security/leak/f$a;)V

    iput-object v0, p0, Lcom/qihoo/security/leak/LeakTipsService;->c:Lcom/qihoo/security/leak/f;

    .line 23
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 50
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onDestroy()V

    .line 51
    iget-object v0, p0, Lcom/qihoo/security/leak/LeakTipsService;->c:Lcom/qihoo/security/leak/f;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/f;->b()V

    .line 52
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 4

    .prologue
    .line 27
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/app/UiProcessService;->onStart(Landroid/content/Intent;I)V

    .line 28
    iget-object v0, p0, Lcom/qihoo/security/leak/LeakTipsService;->c:Lcom/qihoo/security/leak/f;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/f;->a()Z

    .line 29
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/qihoo/security/leak/LeakTipsService$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/leak/LeakTipsService$1;-><init>(Lcom/qihoo/security/leak/LeakTipsService;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 35
    return-void
.end method
