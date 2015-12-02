.class Lcom/facebook/zero/p;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/b/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 341
    iput-object p1, p0, Lcom/facebook/zero/p;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 341
    invoke-direct {p0, p1}, Lcom/facebook/zero/p;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/b/c;
    .locals 1

    .prologue
    .line 344
    new-instance v0, Lcom/facebook/zero/b/c;

    invoke-direct {v0}, Lcom/facebook/zero/b/c;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 341
    invoke-virtual {p0}, Lcom/facebook/zero/p;->a()Lcom/facebook/zero/b/c;

    move-result-object v0

    return-object v0
.end method
