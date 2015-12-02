.class Lcom/facebook/auth/login/ax;
.super Lcom/facebook/inject/d;
.source "LoginModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/login/z;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/ap;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/login/ap;)V
    .locals 0

    .prologue
    .line 231
    iput-object p1, p0, Lcom/facebook/auth/login/ax;->a:Lcom/facebook/auth/login/ap;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V
    .locals 0

    .prologue
    .line 231
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/ax;-><init>(Lcom/facebook/auth/login/ap;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/login/z;
    .locals 4

    .prologue
    .line 235
    new-instance v1, Lcom/facebook/auth/login/z;

    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ax;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    const-class v2, Lcom/facebook/auth/f/b;

    invoke-virtual {p0, v2}, Lcom/facebook/auth/login/ax;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v2

    const-class v3, Lcom/facebook/auth/f/a;

    invoke-virtual {p0, v3}, Lcom/facebook/auth/login/ax;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Lcom/facebook/auth/login/z;-><init>(Lcom/facebook/common/executors/a;Ljava/util/Set;Ljava/util/Set;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 231
    invoke-virtual {p0}, Lcom/facebook/auth/login/ax;->a()Lcom/facebook/auth/login/z;

    move-result-object v0

    return-object v0
.end method
