.class public Lcom/facebook/auth/d/q;
.super Lcom/facebook/inject/c;
.source "LoggedInUserSessionManagerModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 47
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 24
    new-instance v0, Lcom/facebook/auth/d/b;

    invoke-direct {v0}, Lcom/facebook/auth/d/b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/q;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 26
    const-class v0, Lcom/facebook/auth/b/d;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/q;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/t;

    invoke-direct {v1, v2}, Lcom/facebook/auth/d/t;-><init>(Lcom/facebook/auth/d/r;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 29
    const-class v0, Lcom/facebook/auth/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/q;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/b/d;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 31
    const-class v0, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/q;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/b/d;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 34
    const-class v0, Lcom/facebook/user/User;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/q;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/LoggedInUser;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/s;

    invoke-direct {v1, v2}, Lcom/facebook/auth/d/s;-><init>(Lcom/facebook/auth/d/r;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 37
    return-void
.end method
