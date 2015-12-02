.class Lcom/facebook/http/b/y;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/http/protocol/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/http/b/w;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/w;)V
    .locals 0

    .prologue
    .line 346
    iput-object p1, p0, Lcom/facebook/http/b/y;->a:Lcom/facebook/http/b/w;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 346
    invoke-direct {p0, p1}, Lcom/facebook/http/b/y;-><init>(Lcom/facebook/http/b/w;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/protocol/i;
    .locals 3

    .prologue
    .line 350
    new-instance v2, Lcom/facebook/http/protocol/k;

    const-class v0, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    const-class v1, Lcom/facebook/http/protocol/am;

    invoke-virtual {p0, v1}, Lcom/facebook/http/b/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/am;

    invoke-direct {v2, v0, v1}, Lcom/facebook/http/protocol/k;-><init>(Lcom/facebook/http/protocol/aq;Lcom/facebook/http/protocol/am;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 346
    invoke-virtual {p0}, Lcom/facebook/http/b/y;->a()Lcom/facebook/http/protocol/i;

    move-result-object v0

    return-object v0
.end method
