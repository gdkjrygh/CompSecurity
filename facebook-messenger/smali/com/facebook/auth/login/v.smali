.class public Lcom/facebook/auth/login/v;
.super Ljava/lang/Object;
.source "AuthStateMachineMonitor.java"


# instance fields
.field protected final a:Landroid/support/v4/a/e;

.field protected final b:Lcom/facebook/auth/c/b;


# direct methods
.method public constructor <init>(Landroid/support/v4/a/e;Lcom/facebook/auth/c/b;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Lcom/facebook/auth/login/v;->a:Landroid/support/v4/a/e;

    .line 68
    iput-object p2, p0, Lcom/facebook/auth/login/v;->b:Lcom/facebook/auth/c/b;

    .line 69
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/auth/login/v;->a:Landroid/support/v4/a/e;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.orca.login.AuthStateMachineMonitor.SHOWING_LOGIN_UI"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 77
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/auth/login/v;->a:Landroid/support/v4/a/e;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 86
    iget-object v0, p0, Lcom/facebook/auth/login/v;->b:Lcom/facebook/auth/c/b;

    new-instance v1, Lcom/facebook/auth/c/d;

    invoke-direct {v1}, Lcom/facebook/auth/c/d;-><init>()V

    invoke-virtual {v0, v1}, Lcom/facebook/auth/c/b;->a(Lcom/facebook/c/a/a;)V

    .line 87
    return-void
.end method

.method public c()V
    .locals 3

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/auth/login/v;->a:Landroid/support/v4/a/e;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 95
    return-void
.end method

.method public d()V
    .locals 3

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/auth/login/v;->a:Landroid/support/v4/a/e;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 103
    iget-object v0, p0, Lcom/facebook/auth/login/v;->b:Lcom/facebook/auth/c/b;

    new-instance v1, Lcom/facebook/auth/c/e;

    invoke-direct {v1}, Lcom/facebook/auth/c/e;-><init>()V

    invoke-virtual {v0, v1}, Lcom/facebook/auth/c/b;->a(Lcom/facebook/c/a/a;)V

    .line 104
    return-void
.end method
