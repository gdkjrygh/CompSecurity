.class Lcom/flurry/sdk/id$8;
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
        "Lcom/flurry/sdk/ik;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/sdk/id;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/id;)V
    .locals 0

    .prologue
    .line 207
    iput-object p1, p0, Lcom/flurry/sdk/id$8;->a:Lcom/flurry/sdk/id;

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
            "Lcom/flurry/sdk/ik;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 210
    new-instance v0, Lcom/flurry/sdk/kw;

    new-instance v1, Lcom/flurry/sdk/ik$a;

    invoke-direct {v1}, Lcom/flurry/sdk/ik$a;-><init>()V

    invoke-direct {v0, v1}, Lcom/flurry/sdk/kw;-><init>(Lcom/flurry/sdk/kx;)V

    return-object v0
.end method
