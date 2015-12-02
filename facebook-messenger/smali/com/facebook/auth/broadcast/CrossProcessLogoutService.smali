.class public Lcom/facebook/auth/broadcast/CrossProcessLogoutService;
.super Lcom/facebook/base/d/a;
.source "CrossProcessLogoutService.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/facebook/auth/broadcast/CrossProcessLogoutService;

    sput-object v0, Lcom/facebook/auth/broadcast/CrossProcessLogoutService;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    const-string v0, "CrossProcessLogout"

    invoke-direct {p0, v0}, Lcom/facebook/base/d/a;-><init>(Ljava/lang/String;)V

    .line 30
    return-void
.end method


# virtual methods
.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 5

    .prologue
    .line 34
    invoke-virtual {p0}, Lcom/facebook/auth/broadcast/CrossProcessLogoutService;->a()Lcom/facebook/inject/t;

    move-result-object v2

    .line 35
    const-class v0, Lcom/facebook/base/a/d;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/a/d;

    .line 36
    invoke-virtual {v0}, Lcom/facebook/base/a/d;->b()V

    .line 38
    invoke-static {p1}, Lcom/facebook/auth/broadcast/a;->a(Landroid/content/Intent;)Lcom/facebook/config/a/d;

    move-result-object v3

    .line 39
    const-class v0, Lcom/facebook/config/a/d;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/d;

    .line 40
    const-class v1, Lcom/facebook/auth/broadcast/m;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/broadcast/m;

    .line 42
    if-ne v3, v0, :cond_2

    .line 45
    const-class v0, Lcom/facebook/auth/broadcast/b;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/broadcast/b;

    .line 48
    invoke-interface {v0}, Lcom/facebook/auth/broadcast/b;->a()V

    goto :goto_0

    .line 51
    :cond_0
    const-class v0, Lcom/facebook/auth/login/v;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/v;

    .line 53
    invoke-virtual {v0}, Lcom/facebook/auth/login/v;->d()V

    .line 76
    :cond_1
    :goto_1
    return-void

    .line 56
    :cond_2
    sget-object v4, Lcom/facebook/config/a/d;->FB4A:Lcom/facebook/config/a/d;

    if-ne v3, v4, :cond_1

    sget-object v3, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v0, v3, :cond_1

    .line 59
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    .line 61
    sget-object v3, Lcom/facebook/auth/e/a;->n:Lcom/facebook/prefs/shared/ae;

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    .line 63
    if-eqz v0, :cond_1

    .line 65
    const-class v0, Lcom/facebook/auth/login/o;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/o;

    .line 67
    :try_start_0
    invoke-virtual {v0}, Lcom/facebook/auth/login/o;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :goto_2
    invoke-virtual {p0}, Lcom/facebook/auth/broadcast/CrossProcessLogoutService;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/facebook/o;->auto_logout_messenger:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 73
    invoke-virtual {v1, v0}, Lcom/facebook/auth/broadcast/m;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 68
    :catch_0
    move-exception v0

    .line 69
    sget-object v0, Lcom/facebook/auth/broadcast/CrossProcessLogoutService;->a:Ljava/lang/Class;

    const-string v2, "Error in auto logout."

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_2
.end method
