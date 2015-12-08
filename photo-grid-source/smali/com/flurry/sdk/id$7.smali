.class Lcom/flurry/sdk/id$7;
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
        "Lcom/flurry/sdk/ib;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/sdk/id;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/id;)V
    .locals 0

    .prologue
    .line 200
    iput-object p1, p0, Lcom/flurry/sdk/id$7;->a:Lcom/flurry/sdk/id;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/flurry/sdk/kx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/flurry/sdk/kx",
            "<",
            "Lcom/flurry/sdk/ib;",
            ">;"
        }
    .end annotation

    .prologue
    .line 203
    new-instance v0, Lcom/flurry/sdk/ib$a;

    invoke-direct {v0}, Lcom/flurry/sdk/ib$a;-><init>()V

    return-object v0
.end method
