.class Lcom/facebook/http/b/am;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/http/c/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/http/b/w;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/w;)V
    .locals 0

    .prologue
    .line 293
    iput-object p1, p0, Lcom/facebook/http/b/am;->a:Lcom/facebook/http/b/w;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 293
    invoke-direct {p0, p1}, Lcom/facebook/http/b/am;-><init>(Lcom/facebook/http/b/w;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/c/g;
    .locals 4

    .prologue
    .line 297
    new-instance v2, Lcom/facebook/http/c/g;

    const-class v0, Lcom/facebook/http/b/m;

    invoke-virtual {p0, v0}, Lcom/facebook/http/b/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/b/m;

    const-class v1, Lorg/apache/http/conn/scheme/SocketFactory;

    const-class v3, Lcom/facebook/http/annotations/SslSocketFactory;

    invoke-virtual {p0, v1, v3}, Lcom/facebook/http/b/am;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v1, Lcom/facebook/http/c/e;

    invoke-virtual {p0, v1}, Lcom/facebook/http/b/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/c/e;

    invoke-direct {v2, v0, v3, v1}, Lcom/facebook/http/c/g;-><init>(Lcom/facebook/http/b/m;Ljavax/inject/a;Lcom/facebook/http/c/e;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 293
    invoke-virtual {p0}, Lcom/facebook/http/b/am;->a()Lcom/facebook/http/c/g;

    move-result-object v0

    return-object v0
.end method
