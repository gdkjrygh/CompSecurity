.class Lcom/facebook/http/b/ah;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/http/b/ap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/http/b/w;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/w;)V
    .locals 0

    .prologue
    .line 201
    iput-object p1, p0, Lcom/facebook/http/b/ah;->a:Lcom/facebook/http/b/w;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 201
    invoke-direct {p0, p1}, Lcom/facebook/http/b/ah;-><init>(Lcom/facebook/http/b/w;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/b/ap;
    .locals 3

    .prologue
    .line 205
    new-instance v2, Lcom/facebook/http/b/ap;

    const-class v0, Lcom/facebook/http/b/m;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/ah;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/b/m;

    const-class v1, Lcom/facebook/http/b/v;

    invoke-virtual {p0, v1}, Lcom/facebook/http/b/ah;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/b/v;

    invoke-direct {v2, v0, v1}, Lcom/facebook/http/b/ap;-><init>(Lcom/facebook/http/b/m;Lcom/facebook/http/b/v;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 201
    invoke-virtual {p0}, Lcom/facebook/http/b/ah;->a()Lcom/facebook/http/b/ap;

    move-result-object v0

    return-object v0
.end method
