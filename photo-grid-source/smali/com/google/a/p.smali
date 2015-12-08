.class final Lcom/google/a/p;
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


# instance fields
.field final synthetic a:Lcom/google/a/k;


# direct methods
.method constructor <init>(Lcom/google/a/k;)V
    .locals 0

    .prologue
    .line 279
    iput-object p1, p0, Lcom/google/a/p;->a:Lcom/google/a/k;

    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 279
    .line 1281
    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    sget-object v1, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    if-ne v0, v1, :cond_0

    .line 1282
    invoke-virtual {p1}, Lcom/google/a/d/a;->j()V

    .line 1283
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 1285
    :cond_0
    invoke-virtual {p1}, Lcom/google/a/d/a;->k()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0
.end method

.method public final synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 279
    check-cast p2, Ljava/lang/Number;

    .line 1288
    if-nez p2, :cond_0

    .line 1289
    invoke-virtual {p1}, Lcom/google/a/d/f;->f()Lcom/google/a/d/f;

    .line 1290
    :goto_0
    return-void

    .line 1292
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v0

    .line 1293
    float-to-double v0, v0

    invoke-static {v0, v1}, Lcom/google/a/k;->a(D)V

    .line 1294
    invoke-virtual {p1, p2}, Lcom/google/a/d/f;->a(Ljava/lang/Number;)Lcom/google/a/d/f;

    goto :goto_0
.end method
