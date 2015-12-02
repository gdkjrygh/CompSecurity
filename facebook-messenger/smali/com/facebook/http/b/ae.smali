.class Lcom/facebook/http/b/ae;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/http/b/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/http/b/w;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/w;)V
    .locals 0

    .prologue
    .line 231
    iput-object p1, p0, Lcom/facebook/http/b/ae;->a:Lcom/facebook/http/b/w;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 231
    invoke-direct {p0, p1}, Lcom/facebook/http/b/ae;-><init>(Lcom/facebook/http/b/w;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/b/l;
    .locals 1

    .prologue
    .line 235
    new-instance v0, Lcom/facebook/http/b/l;

    invoke-direct {v0}, Lcom/facebook/http/b/l;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 231
    invoke-virtual {p0}, Lcom/facebook/http/b/ae;->a()Lcom/facebook/http/b/l;

    move-result-object v0

    return-object v0
.end method
