.class Lcom/facebook/http/b/ag;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/http/b/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/http/b/w;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/w;)V
    .locals 0

    .prologue
    .line 212
    iput-object p1, p0, Lcom/facebook/http/b/ag;->a:Lcom/facebook/http/b/w;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 212
    invoke-direct {p0, p1}, Lcom/facebook/http/b/ag;-><init>(Lcom/facebook/http/b/w;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/b/v;
    .locals 2

    .prologue
    .line 217
    new-instance v1, Lcom/facebook/http/b/v;

    const-class v0, Lcom/facebook/common/c/j;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/c/j;

    invoke-direct {v1, v0}, Lcom/facebook/http/b/v;-><init>(Lcom/facebook/common/c/j;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 212
    invoke-virtual {p0}, Lcom/facebook/http/b/ag;->a()Lcom/facebook/http/b/v;

    move-result-object v0

    return-object v0
.end method
