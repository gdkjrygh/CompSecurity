.class Lcom/flurry/sdk/jc$1;
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
        "Lcom/flurry/sdk/lc;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/flurry/sdk/jc;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/jc;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/flurry/sdk/jc$1;->a:Lcom/flurry/sdk/jc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/flurry/sdk/jw;)V
    .locals 0

    .prologue
    .line 76
    check-cast p1, Lcom/flurry/sdk/lc;

    invoke-virtual {p0, p1}, Lcom/flurry/sdk/jc$1;->a(Lcom/flurry/sdk/lc;)V

    return-void
.end method

.method public a(Lcom/flurry/sdk/lc;)V
    .locals 2

    .prologue
    .line 79
    sget-object v0, Lcom/flurry/sdk/jc$4;->a:[I

    iget-object v1, p1, Lcom/flurry/sdk/lc;->c:Lcom/flurry/sdk/lc$a;

    invoke-virtual {v1}, Lcom/flurry/sdk/lc$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 92
    :cond_0
    :goto_0
    return-void

    .line 82
    :pswitch_0
    iget-object v0, p0, Lcom/flurry/sdk/jc$1;->a:Lcom/flurry/sdk/jc;

    invoke-virtual {v0}, Lcom/flurry/sdk/jc;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/jc$1$1;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/jc$1$1;-><init>(Lcom/flurry/sdk/jc$1;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 79
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
