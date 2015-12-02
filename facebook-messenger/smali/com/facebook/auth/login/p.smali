.class Lcom/facebook/auth/login/p;
.super Ljava/lang/Object;
.source "AuthOperations.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/facebook/auth/protocol/AuthenticationResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/auth/login/o;


# direct methods
.method constructor <init>(Lcom/facebook/auth/login/o;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/facebook/auth/login/p;->b:Lcom/facebook/auth/login/o;

    iput-object p2, p0, Lcom/facebook/auth/login/p;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/protocol/AuthenticationResult;
    .locals 4

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/auth/login/p;->b:Lcom/facebook/auth/login/o;

    invoke-static {v0}, Lcom/facebook/auth/login/o;->a(Lcom/facebook/auth/login/o;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->i:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 80
    new-instance v2, Lcom/facebook/auth/protocol/f;

    iget-object v3, p0, Lcom/facebook/auth/login/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/facebook/auth/login/p;->b:Lcom/facebook/auth/login/o;

    invoke-static {v0}, Lcom/facebook/auth/login/o;->b(Lcom/facebook/auth/login/o;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-direct {v2, v3, v1, v0}, Lcom/facebook/auth/protocol/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 87
    new-instance v1, Lcom/facebook/http/protocol/l;

    invoke-direct {v1}, Lcom/facebook/http/protocol/l;-><init>()V

    .line 88
    sget-object v0, Lcom/facebook/http/protocol/m;->BOOTSTRAP:Lcom/facebook/http/protocol/m;

    invoke-virtual {v1, v0}, Lcom/facebook/http/protocol/l;->a(Lcom/facebook/http/protocol/m;)V

    .line 90
    iget-object v0, p0, Lcom/facebook/auth/login/p;->b:Lcom/facebook/auth/login/o;

    invoke-static {v0}, Lcom/facebook/auth/login/o;->c(Lcom/facebook/auth/login/o;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 91
    iget-object v3, p0, Lcom/facebook/auth/login/p;->b:Lcom/facebook/auth/login/o;

    invoke-static {v3}, Lcom/facebook/auth/login/o;->d(Lcom/facebook/auth/login/o;)Lcom/facebook/auth/protocol/e;

    move-result-object v3

    invoke-interface {v0, v3, v2, v1}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;Lcom/facebook/http/protocol/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/protocol/AuthenticationResult;

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p0}, Lcom/facebook/auth/login/p;->a()Lcom/facebook/auth/protocol/AuthenticationResult;

    move-result-object v0

    return-object v0
.end method
