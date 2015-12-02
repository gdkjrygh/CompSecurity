.class Lcom/facebook/http/b/ab;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/http/protocol/w;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 380
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 380
    invoke-direct {p0}, Lcom/facebook/http/b/ab;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/protocol/w;
    .locals 2

    .prologue
    .line 384
    new-instance v1, Lcom/facebook/http/protocol/w;

    const-class v0, Lcom/facebook/http/protocol/am;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/am;

    invoke-direct {v1, v0}, Lcom/facebook/http/protocol/w;-><init>(Lcom/facebook/http/protocol/am;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 380
    invoke-virtual {p0}, Lcom/facebook/http/b/ab;->a()Lcom/facebook/http/protocol/w;

    move-result-object v0

    return-object v0
.end method
