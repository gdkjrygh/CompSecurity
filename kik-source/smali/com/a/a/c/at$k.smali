.class final Lcom/a/a/c/at$k;
.super Lcom/a/a/c/at$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "k"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/a/a/c/a/a/f;Lcom/a/a/c/at$i;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 271
    new-array v0, v2, [Lcom/a/a/c/at$h;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-direct {p0, v2, v0}, Lcom/a/a/c/at$h;-><init>(I[Lcom/a/a/c/at$h;)V

    .line 272
    iget-object v0, p1, Lcom/a/a/c/a/a/f;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/c/at$k;->a:Ljava/lang/String;

    .line 273
    iget v0, p1, Lcom/a/a/c/a/a/f;->b:I

    iput v0, p0, Lcom/a/a/c/at$k;->b:I

    .line 274
    return-void
.end method

.method private c()Z
    .locals 1

    .prologue
    .line 292
    iget-object v0, p0, Lcom/a/a/c/at$k;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/c/at$k;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 3

    .prologue
    .line 278
    invoke-direct {p0}, Lcom/a/a/c/at$k;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/a/a/c/at$k;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/a/a/c/f;->b(ILcom/a/a/c/b;)I

    move-result v0

    .line 280
    :goto_0
    const/4 v1, 0x2

    iget v2, p0, Lcom/a/a/c/at$k;->b:I

    invoke-static {v1, v2}, Lcom/a/a/c/f;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    return v0

    .line 278
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Lcom/a/a/c/f;)V
    .locals 2

    .prologue
    .line 285
    invoke-direct {p0}, Lcom/a/a/c/at$k;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 286
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/a/a/c/at$k;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(ILcom/a/a/c/b;)V

    .line 288
    :cond_0
    const/4 v0, 0x2

    iget v1, p0, Lcom/a/a/c/at$k;->b:I

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(II)V

    .line 289
    return-void
.end method
