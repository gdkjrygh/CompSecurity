.class final Lcom/a/a/c/at$c;
.super Lcom/a/a/c/at$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/a/a/c/a/a/b;)V
    .locals 2

    .prologue
    .line 424
    const/4 v0, 0x2

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/a/a/c/at$h;

    invoke-direct {p0, v0, v1}, Lcom/a/a/c/at$h;-><init>(I[Lcom/a/a/c/at$h;)V

    .line 425
    iget-object v0, p1, Lcom/a/a/c/a/a/b;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/c/at$c;->a:Ljava/lang/String;

    .line 426
    iget-object v0, p1, Lcom/a/a/c/a/a/b;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/c/at$c;->b:Ljava/lang/String;

    .line 427
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 3

    .prologue
    .line 431
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/a/a/c/at$c;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/a/a/c/f;->b(ILcom/a/a/c/b;)I

    move-result v1

    .line 432
    const/4 v2, 0x2

    iget-object v0, p0, Lcom/a/a/c/at$c;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    invoke-static {v0}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/a/a/c/f;->b(ILcom/a/a/c/b;)I

    move-result v0

    add-int/2addr v0, v1

    .line 434
    return v0

    .line 432
    :cond_0
    iget-object v0, p0, Lcom/a/a/c/at$c;->b:Ljava/lang/String;

    goto :goto_0
.end method

.method public final a(Lcom/a/a/c/f;)V
    .locals 2

    .prologue
    .line 439
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/a/a/c/at$c;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(ILcom/a/a/c/b;)V

    .line 440
    const/4 v1, 0x2

    iget-object v0, p0, Lcom/a/a/c/at$c;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    invoke-static {v0}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/a/a/c/f;->a(ILcom/a/a/c/b;)V

    .line 441
    return-void

    .line 440
    :cond_0
    iget-object v0, p0, Lcom/a/a/c/at$c;->b:Ljava/lang/String;

    goto :goto_0
.end method
