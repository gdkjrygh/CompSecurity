.class final Lcom/google/a/b/a/bb;
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
    .line 177
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method

.method private static b(Lcom/google/a/d/a;)Ljava/lang/Number;
    .locals 2

    .prologue
    .line 180
    invoke-virtual {p0}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    sget-object v1, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    if-ne v0, v1, :cond_0

    .line 181
    invoke-virtual {p0}, Lcom/google/a/d/a;->j()V

    .line 182
    const/4 v0, 0x0

    .line 186
    :goto_0
    return-object v0

    .line 185
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/a/d/a;->m()I

    move-result v0

    .line 186
    int-to-byte v0, v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 187
    :catch_0
    move-exception v0

    .line 188
    new-instance v1, Lcom/google/a/ag;

    invoke-direct {v1, v0}, Lcom/google/a/ag;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 177
    invoke-static {p1}, Lcom/google/a/b/a/bb;->b(Lcom/google/a/d/a;)Ljava/lang/Number;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 177
    check-cast p2, Ljava/lang/Number;

    .line 1193
    invoke-virtual {p1, p2}, Lcom/google/a/d/f;->a(Ljava/lang/Number;)Lcom/google/a/d/f;

    .line 177
    return-void
.end method
