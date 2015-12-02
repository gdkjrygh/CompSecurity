.class public Lcom/facebook/auth/d/u;
.super Lcom/facebook/inject/b;
.source "LoginModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 22
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/u;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Ljava/lang/Integer;

    const-class v2, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-static {v1, v2}, Lcom/facebook/inject/at;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/at;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 25
    const-class v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/u;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/AuthTokenString;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Ljava/lang/String;

    const-class v2, Lcom/facebook/auth/annotations/AuthTokenString;

    invoke-static {v1, v2}, Lcom/facebook/inject/at;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/at;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 28
    const-class v0, Lcom/facebook/common/w/q;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/u;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/IsMeUserAnEmployee;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 31
    const-class v0, Lcom/facebook/common/w/q;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/u;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/IsMeUserFb4aDeveloper;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 34
    const-class v0, Lcom/facebook/common/w/q;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/u;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/IsMeUserTrustedTester;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 37
    return-void
.end method
