.class Lcom/facebook/auth/login/az;
.super Lcom/facebook/inject/d;
.source "LoginModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/login/bc;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/ap;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/login/ap;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lcom/facebook/auth/login/az;->a:Lcom/facebook/auth/login/ap;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V
    .locals 0

    .prologue
    .line 150
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/az;-><init>(Lcom/facebook/auth/login/ap;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/login/bc;
    .locals 5

    .prologue
    .line 154
    new-instance v3, Lcom/facebook/auth/login/bc;

    const-class v0, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/az;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/b;

    const-class v1, Lcom/facebook/http/protocol/w;

    invoke-virtual {p0, v1}, Lcom/facebook/auth/login/az;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/w;

    const-class v2, Lcom/facebook/auth/protocol/h;

    invoke-virtual {p0, v2}, Lcom/facebook/auth/login/az;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/auth/protocol/h;

    const-class v4, Lcom/facebook/auth/a/c;

    invoke-virtual {p0, v4}, Lcom/facebook/auth/login/az;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v3, v0, v1, v2, v4}, Lcom/facebook/auth/login/bc;-><init>(Lcom/facebook/auth/b/b;Lcom/facebook/http/protocol/w;Lcom/facebook/auth/protocol/h;Ljava/util/Set;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 150
    invoke-virtual {p0}, Lcom/facebook/auth/login/az;->a()Lcom/facebook/auth/login/bc;

    move-result-object v0

    return-object v0
.end method
