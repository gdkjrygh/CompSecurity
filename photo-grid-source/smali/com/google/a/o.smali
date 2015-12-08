.class final Lcom/google/a/o;
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
    .line 255
    iput-object p1, p0, Lcom/google/a/o;->a:Lcom/google/a/k;

    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 255
    .line 1257
    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    sget-object v1, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    if-ne v0, v1, :cond_0

    .line 1258
    invoke-virtual {p1}, Lcom/google/a/d/a;->j()V

    .line 1259
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 1261
    :cond_0
    invoke-virtual {p1}, Lcom/google/a/d/a;->k()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0
.end method

.method public final synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 255
    check-cast p2, Ljava/lang/Number;

    .line 1264
    if-nez p2, :cond_0

    .line 1265
    invoke-virtual {p1}, Lcom/google/a/d/f;->f()Lcom/google/a/d/f;

    .line 1266
    :goto_0
    return-void

    .line 1268
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    .line 1269
    invoke-static {v0, v1}, Lcom/google/a/k;->a(D)V

    .line 1270
    invoke-virtual {p1, p2}, Lcom/google/a/d/f;->a(Ljava/lang/Number;)Lcom/google/a/d/f;

    goto :goto_0
.end method
