.class final Lcom/c/a/a/o;
.super Lcom/c/a/a/c$a;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 253
    invoke-direct {p0, p1}, Lcom/c/a/a/c$a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;I)I
    .locals 1

    .prologue
    .line 263
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 264
    invoke-static {p2, v0}, Lcom/c/a/a/u;->b(II)I

    .line 265
    if-ne p2, v0, :cond_0

    const/4 p2, -0x1

    :cond_0
    return p2
.end method

.method public final a()Lcom/c/a/a/c;
    .locals 1

    .prologue
    .line 323
    sget-object v0, Lcom/c/a/a/o;->m:Lcom/c/a/a/c;

    return-object v0
.end method

.method public final a(Lcom/c/a/a/c;)Lcom/c/a/a/c;
    .locals 0

    .prologue
    .line 318
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    return-object p0
.end method

.method public final b(Ljava/lang/CharSequence;)Z
    .locals 1

    .prologue
    .line 273
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    const/4 v0, 0x1

    return v0
.end method

.method public final c(C)Z
    .locals 1

    .prologue
    .line 255
    const/4 v0, 0x1

    return v0
.end method

.method public final c(Ljava/lang/CharSequence;)Z
    .locals 1

    .prologue
    .line 278
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d(Ljava/lang/CharSequence;)I
    .locals 1

    .prologue
    .line 259
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 282
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    const-string v0, ""

    return-object v0
.end method

.method public final f(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 287
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    new-array v0, v0, [C

    .line 288
    const/16 v1, 0x2e

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([CC)V

    .line 289
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    return-object v1
.end method
