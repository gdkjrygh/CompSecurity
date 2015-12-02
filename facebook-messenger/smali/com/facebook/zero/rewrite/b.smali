.class public Lcom/facebook/zero/rewrite/b;
.super Ljava/lang/Object;
.source "ZeroAwareFbHttpClientWrapperFactory.java"

# interfaces
.implements Lcom/facebook/http/b/u;


# instance fields
.field private final a:Lcom/facebook/zero/rewrite/f;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/zero/rewrite/f;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/zero/rewrite/f;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/zero/rewrite/b;->a:Lcom/facebook/zero/rewrite/f;

    .line 21
    iput-object p2, p0, Lcom/facebook/zero/rewrite/b;->b:Ljavax/inject/a;

    .line 22
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/http/b/m;)Lcom/facebook/http/b/m;
    .locals 3

    .prologue
    .line 26
    new-instance v0, Lcom/facebook/zero/rewrite/a;

    iget-object v1, p0, Lcom/facebook/zero/rewrite/b;->b:Ljavax/inject/a;

    iget-object v2, p0, Lcom/facebook/zero/rewrite/b;->a:Lcom/facebook/zero/rewrite/f;

    invoke-direct {v0, p1, v1, v2}, Lcom/facebook/zero/rewrite/a;-><init>(Lcom/facebook/http/b/m;Ljavax/inject/a;Lcom/facebook/zero/rewrite/f;)V

    return-object v0
.end method
