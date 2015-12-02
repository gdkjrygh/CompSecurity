.class Lcom/facebook/cache/h;
.super Lcom/facebook/inject/d;
.source "CacheModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/cache/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/cache/b;


# direct methods
.method private constructor <init>(Lcom/facebook/cache/b;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/cache/h;->a:Lcom/facebook/cache/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/cache/b;Lcom/facebook/cache/c;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/facebook/cache/h;-><init>(Lcom/facebook/cache/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/cache/v;
    .locals 3

    .prologue
    .line 62
    new-instance v2, Lcom/facebook/cache/v;

    const-class v0, Lcom/facebook/analytics/cache/h;

    invoke-virtual {p0, v0}, Lcom/facebook/cache/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/cache/h;

    const-class v1, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v1}, Lcom/facebook/cache/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/e/h;

    invoke-direct {v2, v0, v1}, Lcom/facebook/cache/v;-><init>(Lcom/facebook/analytics/cache/h;Lcom/facebook/common/e/h;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 58
    invoke-virtual {p0}, Lcom/facebook/cache/h;->a()Lcom/facebook/cache/v;

    move-result-object v0

    return-object v0
.end method
