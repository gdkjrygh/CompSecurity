.class Lcom/facebook/zero/k;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/protocol/a/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 140
    iput-object p1, p0, Lcom/facebook/zero/k;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 140
    invoke-direct {p0, p1}, Lcom/facebook/zero/k;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/protocol/a/b;
    .locals 3

    .prologue
    .line 143
    new-instance v2, Lcom/facebook/zero/protocol/a/b;

    const-class v0, Lcom/facebook/zero/ui/p;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/p;

    const-class v1, Lcom/facebook/zero/rewrite/e;

    invoke-virtual {p0, v1}, Lcom/facebook/zero/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/zero/rewrite/e;

    invoke-direct {v2, v0, v1}, Lcom/facebook/zero/protocol/a/b;-><init>(Lcom/facebook/zero/ui/p;Lcom/facebook/zero/rewrite/e;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 140
    invoke-virtual {p0}, Lcom/facebook/zero/k;->a()Lcom/facebook/zero/protocol/a/b;

    move-result-object v0

    return-object v0
.end method
