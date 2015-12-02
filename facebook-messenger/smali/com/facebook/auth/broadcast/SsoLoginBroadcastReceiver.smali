.class public Lcom/facebook/auth/broadcast/SsoLoginBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SsoLoginBroadcastReceiver.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/facebook/c/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/auth/broadcast/SsoLoginBroadcastReceiver;

    sput-object v0, Lcom/facebook/auth/broadcast/SsoLoginBroadcastReceiver;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/auth/broadcast/SsoLoginBroadcastReceiver;->b:Lcom/facebook/c/l;

    if-nez v0, :cond_0

    .line 40
    invoke-static {p1}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 41
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 42
    const-class v1, Lcom/facebook/c/l;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/l;

    iput-object v0, p0, Lcom/facebook/auth/broadcast/SsoLoginBroadcastReceiver;->b:Lcom/facebook/c/l;

    .line 45
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .prologue
    .line 48
    const-string v0, "extra_product"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 50
    const/4 v0, 0x0

    .line 52
    :try_start_0
    invoke-static {v1}, Lcom/facebook/config/a/d;->valueOf(Ljava/lang/String;)Lcom/facebook/config/a/d;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 61
    :goto_0
    sget-object v2, Lcom/facebook/config/a/d;->FB4A:Lcom/facebook/config/a/d;

    if-ne v0, v2, :cond_0

    .line 62
    sget-object v0, Lcom/facebook/auth/broadcast/SsoLoginBroadcastReceiver;->a:Ljava/lang/Class;

    const-string v1, "Received SSO login intent from FB4A. Starting AutoSsoLoginService."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 63
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 64
    const-class v1, Lcom/facebook/auth/broadcast/AutoSsoLoginService;

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 65
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 69
    :goto_1
    return-void

    .line 53
    :catch_0
    move-exception v2

    .line 54
    sget-object v3, Lcom/facebook/auth/broadcast/SsoLoginBroadcastReceiver;->a:Ljava/lang/Class;

    const-string v4, "NullPointerException getting login action product."

    invoke-static {v3, v4, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 55
    :catch_1
    move-exception v2

    .line 56
    sget-object v3, Lcom/facebook/auth/broadcast/SsoLoginBroadcastReceiver;->a:Ljava/lang/Class;

    const-string v4, "IllegalArgumentException getting login action product. This is caused by receiving a broadcast from an app this version hasn\'t heard of."

    invoke-static {v3, v4, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 67
    :cond_0
    sget-object v0, Lcom/facebook/auth/broadcast/SsoLoginBroadcastReceiver;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Received SSO login intent from product "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/facebook/auth/broadcast/SsoLoginBroadcastReceiver;->a(Landroid/content/Context;)V

    .line 30
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 31
    iget-object v1, p0, Lcom/facebook/auth/broadcast/SsoLoginBroadcastReceiver;->b:Lcom/facebook/c/l;

    const-string v2, "SSO_LOGIN"

    invoke-virtual {v1, v2}, Lcom/facebook/c/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 33
    invoke-static {v1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 34
    invoke-direct {p0, p1, p2}, Lcom/facebook/auth/broadcast/SsoLoginBroadcastReceiver;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 36
    :cond_0
    return-void
.end method
