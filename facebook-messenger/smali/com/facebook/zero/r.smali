.class Lcom/facebook/zero/r;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 259
    iput-object p1, p0, Lcom/facebook/zero/r;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 259
    invoke-direct {p0, p1}, Lcom/facebook/zero/r;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/a;
    .locals 9

    .prologue
    .line 263
    new-instance v0, Lcom/facebook/zero/a;

    const-class v1, Lcom/facebook/zero/b/d;

    invoke-virtual {p0, v1}, Lcom/facebook/zero/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/zero/b/d;

    const-class v2, Lcom/facebook/zero/d/a;

    invoke-virtual {p0, v2}, Lcom/facebook/zero/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/zero/d/a;

    const-class v3, Lcom/facebook/zero/server/d;

    invoke-virtual {p0, v3}, Lcom/facebook/zero/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/zero/server/d;

    const-class v4, Lcom/facebook/zero/protocol/a/b;

    invoke-virtual {p0, v4}, Lcom/facebook/zero/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/zero/protocol/a/b;

    const-class v5, Lcom/facebook/zero/ui/p;

    invoke-virtual {p0, v5}, Lcom/facebook/zero/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/zero/ui/p;

    const-class v6, Lcom/facebook/zero/rewrite/e;

    invoke-virtual {p0, v6}, Lcom/facebook/zero/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/zero/rewrite/e;

    const-class v7, Ljava/lang/Boolean;

    const-class v8, Lcom/facebook/zero/annotations/IsZeroRatingFeatureEnabled;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/zero/r;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lcom/facebook/zero/a;-><init>(Lcom/facebook/zero/b/d;Lcom/facebook/zero/d/a;Lcom/facebook/zero/server/d;Lcom/facebook/zero/protocol/a/b;Lcom/facebook/zero/ui/p;Lcom/facebook/zero/rewrite/e;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 259
    invoke-virtual {p0}, Lcom/facebook/zero/r;->a()Lcom/facebook/zero/a;

    move-result-object v0

    return-object v0
.end method
