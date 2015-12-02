.class Lcom/facebook/cache/f;
.super Lcom/facebook/inject/d;
.source "CacheModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/cache/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/cache/b;


# direct methods
.method private constructor <init>(Lcom/facebook/cache/b;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/cache/f;->a:Lcom/facebook/cache/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/cache/b;Lcom/facebook/cache/c;)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1}, Lcom/facebook/cache/f;-><init>(Lcom/facebook/cache/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/cache/s;
    .locals 1

    .prologue
    .line 96
    new-instance v0, Lcom/facebook/cache/o;

    invoke-direct {v0}, Lcom/facebook/cache/o;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 91
    invoke-virtual {p0}, Lcom/facebook/cache/f;->a()Lcom/facebook/cache/s;

    move-result-object v0

    return-object v0
.end method
