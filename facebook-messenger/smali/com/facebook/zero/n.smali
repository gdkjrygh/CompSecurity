.class Lcom/facebook/zero/n;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/rewrite/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 314
    iput-object p1, p0, Lcom/facebook/zero/n;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 314
    invoke-direct {p0, p1}, Lcom/facebook/zero/n;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/rewrite/c;
    .locals 2

    .prologue
    .line 317
    new-instance v1, Lcom/facebook/zero/rewrite/c;

    const-class v0, Lcom/facebook/zero/rewrite/f;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/n;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/rewrite/f;

    invoke-direct {v1, v0}, Lcom/facebook/zero/rewrite/c;-><init>(Lcom/facebook/zero/rewrite/f;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 314
    invoke-virtual {p0}, Lcom/facebook/zero/n;->a()Lcom/facebook/zero/rewrite/c;

    move-result-object v0

    return-object v0
.end method
