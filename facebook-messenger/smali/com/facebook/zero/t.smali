.class Lcom/facebook/zero/t;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/protocol/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 186
    iput-object p1, p0, Lcom/facebook/zero/t;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 186
    invoke-direct {p0, p1}, Lcom/facebook/zero/t;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/protocol/c;
    .locals 8

    .prologue
    .line 189
    new-instance v0, Lcom/facebook/zero/protocol/c;

    const-class v1, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v1}, Lcom/facebook/zero/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/aq;

    const-class v2, Lcom/facebook/zero/b/d;

    invoke-virtual {p0, v2}, Lcom/facebook/zero/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/zero/b/d;

    const-class v3, Lcom/facebook/zero/ui/h;

    invoke-virtual {p0, v3}, Lcom/facebook/zero/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/zero/ui/h;

    const-class v4, Lcom/facebook/zero/ui/p;

    invoke-virtual {p0, v4}, Lcom/facebook/zero/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/zero/ui/p;

    const-class v5, Lcom/facebook/zero/rewrite/e;

    invoke-virtual {p0, v5}, Lcom/facebook/zero/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/zero/rewrite/e;

    const-class v6, Lcom/facebook/zero/protocol/a/b;

    invoke-virtual {p0, v6}, Lcom/facebook/zero/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/zero/protocol/a/b;

    const-class v7, Lcom/facebook/zero/protocol/a/a;

    invoke-virtual {p0, v7}, Lcom/facebook/zero/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/zero/protocol/a/a;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/zero/protocol/c;-><init>(Lcom/facebook/http/protocol/aq;Lcom/facebook/zero/b/d;Lcom/facebook/zero/ui/h;Lcom/facebook/zero/ui/p;Lcom/facebook/zero/rewrite/e;Lcom/facebook/zero/protocol/a/b;Lcom/facebook/zero/protocol/a/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 186
    invoke-virtual {p0}, Lcom/facebook/zero/t;->a()Lcom/facebook/zero/protocol/c;

    move-result-object v0

    return-object v0
.end method
