.class Lcom/flurry/sdk/ld$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/jx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/flurry/sdk/jx",
        "<",
        "Lcom/flurry/sdk/lf;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/sdk/ld;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/ld;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/flurry/sdk/ld$1;->a:Lcom/flurry/sdk/ld;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/flurry/sdk/jw;)V
    .locals 0

    .prologue
    .line 60
    check-cast p1, Lcom/flurry/sdk/lf;

    invoke-virtual {p0, p1}, Lcom/flurry/sdk/ld$1;->a(Lcom/flurry/sdk/lf;)V

    return-void
.end method

.method public a(Lcom/flurry/sdk/lf;)V
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/flurry/sdk/ld$1;->a:Lcom/flurry/sdk/ld;

    invoke-static {v0}, Lcom/flurry/sdk/ld;->a(Lcom/flurry/sdk/ld;)V

    .line 64
    return-void
.end method
