.class public Lcom/facebook/auth/broadcast/AutoSsoLoginService;
.super Lcom/facebook/base/d/a;
.source "AutoSsoLoginService.java"


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
.field private b:Lcom/facebook/auth/b/d;

.field private c:Lcom/facebook/prefs/shared/d;

.field private d:Lcom/facebook/auth/login/bm;

.field private e:Lcom/facebook/auth/login/o;

.field private f:Lcom/facebook/auth/login/bc;

.field private g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/auth/broadcast/c;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/facebook/auth/broadcast/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;

    sput-object v0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 38
    const-string v0, "auto_sso_login"

    invoke-direct {p0, v0}, Lcom/facebook/base/d/a;-><init>(Ljava/lang/String;)V

    .line 39
    return-void
.end method

.method private a(Lcom/facebook/auth/credentials/b;)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    .line 87
    iget-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->b:Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 90
    :try_start_0
    iget-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->e:Lcom/facebook/auth/login/o;

    invoke-virtual {v0}, Lcom/facebook/auth/login/o;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    :cond_0
    sget-object v0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->a:Ljava/lang/Class;

    const-string v1, "Starting auto-login"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->b:Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->h()V

    .line 104
    :try_start_1
    iget-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->e:Lcom/facebook/auth/login/o;

    invoke-virtual {p1}, Lcom/facebook/auth/credentials/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/auth/login/o;->a(Ljava/lang/String;)Lcom/facebook/auth/protocol/AuthenticationResult;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 110
    sget-object v0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->a:Ljava/lang/Class;

    const-string v1, "SSO login succeeded, starting login operation."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 112
    :try_start_2
    iget-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->f:Lcom/facebook/auth/login/bc;

    invoke-virtual {v0}, Lcom/facebook/auth/login/bc;->a()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 118
    iget-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 119
    sget-object v1, Lcom/facebook/auth/e/a;->n:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 120
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 122
    sget-object v0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->a:Ljava/lang/Class;

    const-string v1, "Login succeeded, calling background login hooks."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 123
    iget-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/broadcast/c;

    .line 124
    invoke-interface {v0}, Lcom/facebook/auth/broadcast/c;->a()V

    goto :goto_0

    .line 91
    :catch_0
    move-exception v0

    .line 92
    sget-object v0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->a:Ljava/lang/Class;

    const-string v1, "Error logging out."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 130
    :goto_1
    return-void

    .line 105
    :catch_1
    move-exception v0

    .line 106
    sget-object v0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->a:Ljava/lang/Class;

    const-string v1, "SSO login failed."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1

    .line 113
    :catch_2
    move-exception v0

    .line 114
    sget-object v0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->a:Ljava/lang/Class;

    const-string v1, "Login operation failed."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1

    .line 127
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/o;->auto_login_messenger:I

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/facebook/auth/credentials/b;->b()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 129
    iget-object v1, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->h:Lcom/facebook/auth/broadcast/m;

    invoke-virtual {v1, v0}, Lcom/facebook/auth/broadcast/m;->a(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->b:Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    .line 83
    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 76
    iget-object v1, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->b:Lcom/facebook/auth/b/d;

    invoke-virtual {v1}, Lcom/facebook/auth/b/d;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/auth/e/a;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .prologue
    .line 43
    invoke-super {p0}, Lcom/facebook/base/d/a;->onCreate()V

    .line 45
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 46
    const-class v0, Lcom/facebook/auth/b/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/d;

    iput-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->b:Lcom/facebook/auth/b/d;

    .line 47
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->c:Lcom/facebook/prefs/shared/d;

    .line 48
    const-class v0, Lcom/facebook/auth/login/bm;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/bm;

    iput-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->d:Lcom/facebook/auth/login/bm;

    .line 49
    const-class v0, Lcom/facebook/auth/login/o;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/o;

    iput-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->e:Lcom/facebook/auth/login/o;

    .line 50
    const-class v0, Lcom/facebook/auth/login/bc;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/bc;

    iput-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->f:Lcom/facebook/auth/login/bc;

    .line 51
    const-class v0, Lcom/facebook/auth/broadcast/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->g:Ljava/util/Set;

    .line 52
    const-class v0, Lcom/facebook/auth/broadcast/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/broadcast/m;

    iput-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->h:Lcom/facebook/auth/broadcast/m;

    .line 53
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 60
    sget-object v0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->a:Ljava/lang/Class;

    const-string v1, "AutoSsoLoginService, in onHandleIntent"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 62
    invoke-direct {p0}, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    :cond_0
    :goto_0
    return-void

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->d:Lcom/facebook/auth/login/bm;

    invoke-virtual {v0, p0}, Lcom/facebook/auth/login/bm;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p0, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->d:Lcom/facebook/auth/login/bm;

    invoke-virtual {v0}, Lcom/facebook/auth/login/bm;->a()Lcom/facebook/auth/credentials/b;

    move-result-object v0

    .line 69
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/auth/credentials/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 70
    invoke-direct {p0, v0}, Lcom/facebook/auth/broadcast/AutoSsoLoginService;->a(Lcom/facebook/auth/credentials/b;)V

    goto :goto_0
.end method
