.class Lcom/facebook/auth/login/be;
.super Ljava/lang/Object;
.source "LoginOperations.java"

# interfaces
.implements Lcom/facebook/http/protocol/v;


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/bc;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/login/bc;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/facebook/auth/login/be;->a:Lcom/facebook/auth/login/bc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/login/bc;Lcom/facebook/auth/login/bd;)V
    .locals 0

    .prologue
    .line 80
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/be;-><init>(Lcom/facebook/auth/login/bc;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/http/protocol/y;",
            ">;"
        }
    .end annotation

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/auth/login/be;->a:Lcom/facebook/auth/login/bc;

    invoke-static {v0}, Lcom/facebook/auth/login/bc;->a(Lcom/facebook/auth/login/bc;)Lcom/facebook/auth/protocol/h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v1, "user"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/auth/login/be;->a:Lcom/facebook/auth/login/bc;

    invoke-static {v0}, Lcom/facebook/auth/login/bc;->b(Lcom/facebook/auth/login/bc;)Lcom/facebook/auth/b/b;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/d;

    .line 96
    const-string v1, "user"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/protocol/GetLoggedInUserResult;

    .line 97
    new-instance v2, Lcom/facebook/user/o;

    invoke-direct {v2}, Lcom/facebook/user/o;-><init>()V

    .line 98
    invoke-virtual {v1}, Lcom/facebook/auth/protocol/GetLoggedInUserResult;->a()Lcom/facebook/user/User;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/facebook/user/o;->a(Lcom/facebook/user/User;)Lcom/facebook/user/o;

    .line 99
    iget-object v1, p0, Lcom/facebook/auth/login/be;->a:Lcom/facebook/auth/login/bc;

    invoke-static {v1}, Lcom/facebook/auth/login/bc;->b(Lcom/facebook/auth/login/bc;)Lcom/facebook/auth/b/b;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/auth/b/b;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/auth/viewercontext/ViewerContext;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/facebook/user/o;->g(Ljava/lang/String;)V

    .line 100
    invoke-virtual {v2}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/auth/b/d;->b(Lcom/facebook/user/User;)V

    .line 101
    return-void
.end method
