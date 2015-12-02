.class Lcom/facebook/cache/g;
.super Lcom/facebook/inject/d;
.source "CacheModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/cache/q;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/cache/c;)V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0}, Lcom/facebook/cache/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/cache/q;
    .locals 5

    .prologue
    .line 73
    new-instance v3, Lcom/facebook/cache/q;

    const-class v0, Lcom/facebook/e/a/e;

    invoke-virtual {p0, v0}, Lcom/facebook/cache/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/e/a/e;

    const-class v1, Lcom/facebook/cache/s;

    invoke-virtual {p0, v1}, Lcom/facebook/cache/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/cache/s;

    const-class v2, Lcom/facebook/common/w/q;

    const-class v4, Lcom/facebook/cache/IsMemoryCacheManagerTrimmingEnabled;

    invoke-virtual {p0, v2, v4}, Lcom/facebook/cache/g;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/cache/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    invoke-direct {v3, v0, v1, v4, v2}, Lcom/facebook/cache/q;-><init>(Lcom/facebook/e/a/e;Lcom/facebook/cache/s;Ljavax/inject/a;Lcom/facebook/common/time/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 69
    invoke-virtual {p0}, Lcom/facebook/cache/g;->a()Lcom/facebook/cache/q;

    move-result-object v0

    return-object v0
.end method
