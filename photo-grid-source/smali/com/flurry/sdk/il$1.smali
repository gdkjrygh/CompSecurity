.class Lcom/flurry/sdk/il$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/la;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/flurry/sdk/la",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/flurry/sdk/im;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/sdk/il;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/il;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/flurry/sdk/il$1;->a:Lcom/flurry/sdk/il;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/flurry/sdk/kx;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/flurry/sdk/kx",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/flurry/sdk/im;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 75
    new-instance v0, Lcom/flurry/sdk/kw;

    new-instance v1, Lcom/flurry/sdk/im$a;

    invoke-direct {v1}, Lcom/flurry/sdk/im$a;-><init>()V

    invoke-direct {v0, v1}, Lcom/flurry/sdk/kw;-><init>(Lcom/flurry/sdk/kx;)V

    return-object v0
.end method
