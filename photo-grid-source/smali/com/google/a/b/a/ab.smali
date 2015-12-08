.class final Lcom/google/a/b/a/ab;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/am",
        "<",
        "Ljava/lang/Number;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 293
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 293
    .line 1296
    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    .line 1297
    sget-object v1, Lcom/google/a/b/a/az;->a:[I

    invoke-virtual {v0}, Lcom/google/a/d/e;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 1304
    :pswitch_0
    new-instance v1, Lcom/google/a/ag;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expecting number, got: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/a/ag;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1299
    :pswitch_1
    invoke-virtual {p1}, Lcom/google/a/d/a;->j()V

    .line 1300
    const/4 v0, 0x0

    .line 1302
    :goto_0
    return-object v0

    :pswitch_2
    new-instance v0, Lcom/google/a/b/r;

    invoke-virtual {p1}, Lcom/google/a/d/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/a/b/r;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 1297
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final bridge synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 293
    check-cast p2, Ljava/lang/Number;

    .line 1309
    invoke-virtual {p1, p2}, Lcom/google/a/d/f;->a(Ljava/lang/Number;)Lcom/google/a/d/f;

    .line 293
    return-void
.end method
