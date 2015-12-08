.class Lcom/flurry/sdk/kr$7;
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
        "Lcom/flurry/sdk/ks;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/sdk/kr;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/kr;)V
    .locals 0

    .prologue
    .line 346
    iput-object p1, p0, Lcom/flurry/sdk/kr$7;->a:Lcom/flurry/sdk/kr;

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
            "Lcom/flurry/sdk/ks;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 349
    new-instance v0, Lcom/flurry/sdk/kw;

    new-instance v1, Lcom/flurry/sdk/ks$a;

    invoke-direct {v1}, Lcom/flurry/sdk/ks$a;-><init>()V

    invoke-direct {v0, v1}, Lcom/flurry/sdk/kw;-><init>(Lcom/flurry/sdk/kx;)V

    return-object v0
.end method
