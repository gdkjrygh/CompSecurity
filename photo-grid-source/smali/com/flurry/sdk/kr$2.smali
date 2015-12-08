.class Lcom/flurry/sdk/kr$2;
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
        "Lcom/flurry/sdk/kq;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/sdk/kr;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/kr;)V
    .locals 0

    .prologue
    .line 197
    iput-object p1, p0, Lcom/flurry/sdk/kr$2;->a:Lcom/flurry/sdk/kr;

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
            "Lcom/flurry/sdk/kq;",
            ">;"
        }
    .end annotation

    .prologue
    .line 200
    new-instance v0, Lcom/flurry/sdk/kq$a;

    invoke-direct {v0}, Lcom/flurry/sdk/kq$a;-><init>()V

    return-object v0
.end method
