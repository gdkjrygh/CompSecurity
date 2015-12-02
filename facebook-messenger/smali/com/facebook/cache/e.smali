.class Lcom/facebook/cache/e;
.super Lcom/facebook/inject/d;
.source "CacheModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/cache/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/cache/b;


# direct methods
.method private constructor <init>(Lcom/facebook/cache/b;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/facebook/cache/e;->a:Lcom/facebook/cache/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/cache/b;Lcom/facebook/cache/c;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lcom/facebook/cache/e;-><init>(Lcom/facebook/cache/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/cache/k;
    .locals 1

    .prologue
    .line 87
    new-instance v0, Lcom/facebook/cache/n;

    invoke-direct {v0}, Lcom/facebook/cache/n;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 82
    invoke-virtual {p0}, Lcom/facebook/cache/e;->a()Lcom/facebook/cache/k;

    move-result-object v0

    return-object v0
.end method
