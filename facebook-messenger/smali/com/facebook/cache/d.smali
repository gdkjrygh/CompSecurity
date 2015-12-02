.class Lcom/facebook/cache/d;
.super Lcom/facebook/inject/d;
.source "CacheModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/cache/j;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/cache/b;


# direct methods
.method private constructor <init>(Lcom/facebook/cache/b;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/facebook/cache/d;->a:Lcom/facebook/cache/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/cache/b;Lcom/facebook/cache/c;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lcom/facebook/cache/d;-><init>(Lcom/facebook/cache/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/cache/j;
    .locals 5

    .prologue
    .line 49
    new-instance v4, Lcom/facebook/cache/j;

    const-class v0, Lcom/facebook/e/a/e;

    invoke-virtual {p0, v0}, Lcom/facebook/cache/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/e/a/e;

    const-class v1, Lcom/facebook/cache/q;

    invoke-virtual {p0, v1}, Lcom/facebook/cache/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/cache/q;

    const-class v2, Lcom/facebook/cache/k;

    invoke-virtual {p0, v2}, Lcom/facebook/cache/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/cache/k;

    const-class v3, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v3}, Lcom/facebook/cache/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/time/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/cache/j;-><init>(Lcom/facebook/e/a/e;Lcom/facebook/cache/q;Lcom/facebook/cache/k;Lcom/facebook/common/time/a;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    invoke-virtual {p0}, Lcom/facebook/cache/d;->a()Lcom/facebook/cache/j;

    move-result-object v0

    return-object v0
.end method
