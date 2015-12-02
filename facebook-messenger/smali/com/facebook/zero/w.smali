.class Lcom/facebook/zero/w;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/rewrite/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 305
    iput-object p1, p0, Lcom/facebook/zero/w;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 305
    invoke-direct {p0, p1}, Lcom/facebook/zero/w;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/rewrite/f;
    .locals 4

    .prologue
    .line 308
    new-instance v1, Lcom/facebook/zero/rewrite/f;

    const-class v0, Lcom/facebook/zero/d/a;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/w;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/d/a;

    const-class v2, Lcom/facebook/common/w/q;

    const-class v3, Lcom/facebook/zero/annotations/IsUserCurrentlyZeroRated;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/zero/w;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/facebook/zero/rewrite/f;-><init>(Lcom/facebook/zero/d/a;Ljavax/inject/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 305
    invoke-virtual {p0}, Lcom/facebook/zero/w;->a()Lcom/facebook/zero/rewrite/f;

    move-result-object v0

    return-object v0
.end method
