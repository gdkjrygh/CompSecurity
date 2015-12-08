.class final Lcom/a/a/c/at$g;
.super Lcom/a/a/c/at$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation


# instance fields
.field private final a:J

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:J

.field private final e:I


# direct methods
.method public constructor <init>(Lcom/a/a/c/a/a/f$a;)V
    .locals 2

    .prologue
    .line 310
    const/4 v0, 0x3

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/a/a/c/at$h;

    invoke-direct {p0, v0, v1}, Lcom/a/a/c/at$h;-><init>(I[Lcom/a/a/c/at$h;)V

    .line 311
    iget-wide v0, p1, Lcom/a/a/c/a/a/f$a;->a:J

    iput-wide v0, p0, Lcom/a/a/c/at$g;->a:J

    .line 312
    iget-object v0, p1, Lcom/a/a/c/a/a/f$a;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/c/at$g;->b:Ljava/lang/String;

    .line 313
    iget-object v0, p1, Lcom/a/a/c/a/a/f$a;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/c/at$g;->c:Ljava/lang/String;

    .line 314
    iget-wide v0, p1, Lcom/a/a/c/a/a/f$a;->d:J

    iput-wide v0, p0, Lcom/a/a/c/at$g;->d:J

    .line 315
    iget v0, p1, Lcom/a/a/c/a/a/f$a;->e:I

    iput v0, p0, Lcom/a/a/c/at$g;->e:I

    .line 316
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    .line 320
    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/a/a/c/at$g;->a:J

    invoke-static {v0, v2, v3}, Lcom/a/a/c/f;->b(IJ)I

    move-result v0

    .line 321
    const/4 v1, 0x2

    iget-object v2, p0, Lcom/a/a/c/at$g;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/a/a/c/f;->b(ILcom/a/a/c/b;)I

    move-result v1

    add-int/2addr v0, v1

    .line 322
    const/4 v1, 0x3

    iget-object v2, p0, Lcom/a/a/c/at$g;->c:Ljava/lang/String;

    invoke-static {v2}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/a/a/c/f;->b(ILcom/a/a/c/b;)I

    move-result v1

    add-int/2addr v0, v1

    .line 323
    const/4 v1, 0x4

    iget-wide v2, p0, Lcom/a/a/c/at$g;->d:J

    invoke-static {v1, v2, v3}, Lcom/a/a/c/f;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 324
    const/4 v1, 0x5

    iget v2, p0, Lcom/a/a/c/at$g;->e:I

    invoke-static {v1, v2}, Lcom/a/a/c/f;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 325
    return v0
.end method

.method public final a(Lcom/a/a/c/f;)V
    .locals 4

    .prologue
    .line 330
    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/a/a/c/at$g;->a:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/a/a/c/f;->a(IJ)V

    .line 331
    const/4 v0, 0x2

    iget-object v1, p0, Lcom/a/a/c/at$g;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(ILcom/a/a/c/b;)V

    .line 332
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/a/a/c/at$g;->c:Ljava/lang/String;

    invoke-static {v1}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(ILcom/a/a/c/b;)V

    .line 333
    const/4 v0, 0x4

    iget-wide v2, p0, Lcom/a/a/c/at$g;->d:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/a/a/c/f;->a(IJ)V

    .line 334
    const/4 v0, 0x5

    iget v1, p0, Lcom/a/a/c/at$g;->e:I

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(II)V

    .line 335
    return-void
.end method
