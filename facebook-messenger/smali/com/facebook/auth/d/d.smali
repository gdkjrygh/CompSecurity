.class Lcom/facebook/auth/d/d;
.super Lcom/facebook/inject/d;
.source "LoggedInUserAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/login/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/d/b;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/d/b;)V
    .locals 0

    .prologue
    .line 190
    iput-object p1, p0, Lcom/facebook/auth/d/d;->a:Lcom/facebook/auth/d/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V
    .locals 0

    .prologue
    .line 190
    invoke-direct {p0, p1}, Lcom/facebook/auth/d/d;-><init>(Lcom/facebook/auth/d/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/login/a;
    .locals 6

    .prologue
    .line 195
    new-instance v0, Lcom/facebook/auth/login/a;

    const-class v1, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v1}, Lcom/facebook/auth/d/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/executors/a;

    const-class v2, Lcom/facebook/fbservice/service/o;

    invoke-virtual {p0, v2}, Lcom/facebook/auth/d/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/fbservice/service/o;

    const-class v3, Lcom/facebook/http/b/ap;

    invoke-virtual {p0, v3}, Lcom/facebook/auth/d/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/http/b/ap;

    const-class v4, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v4}, Lcom/facebook/auth/d/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/auth/b/b;

    const-class v5, Lcom/facebook/auth/userscope/b;

    invoke-virtual {p0, v5}, Lcom/facebook/auth/d/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/auth/userscope/b;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/auth/login/a;-><init>(Lcom/facebook/common/executors/a;Lcom/facebook/fbservice/service/o;Lcom/facebook/http/b/ap;Lcom/facebook/auth/b/b;Lcom/facebook/auth/userscope/b;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 190
    invoke-virtual {p0}, Lcom/facebook/auth/d/d;->a()Lcom/facebook/auth/login/a;

    move-result-object v0

    return-object v0
.end method
