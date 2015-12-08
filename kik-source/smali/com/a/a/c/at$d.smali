.class final Lcom/a/a/c/at$d;
.super Lcom/a/a/c/at$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final a:F

.field private final b:I

.field private final c:Z

.field private final d:I

.field private final e:J

.field private final f:J


# direct methods
.method public constructor <init>(FIZIJJ)V
    .locals 3

    .prologue
    .line 200
    const/4 v0, 0x5

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/a/a/c/at$h;

    invoke-direct {p0, v0, v1}, Lcom/a/a/c/at$h;-><init>(I[Lcom/a/a/c/at$h;)V

    .line 202
    iput p1, p0, Lcom/a/a/c/at$d;->a:F

    .line 203
    iput p2, p0, Lcom/a/a/c/at$d;->b:I

    .line 204
    iput-boolean p3, p0, Lcom/a/a/c/at$d;->c:Z

    .line 205
    iput p4, p0, Lcom/a/a/c/at$d;->d:I

    .line 206
    iput-wide p5, p0, Lcom/a/a/c/at$d;->e:J

    .line 207
    iput-wide p7, p0, Lcom/a/a/c/at$d;->f:J

    .line 208
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    .line 212
    invoke-static {}, Lcom/a/a/c/f;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 214
    iget v1, p0, Lcom/a/a/c/at$d;->b:I

    invoke-static {v1}, Lcom/a/a/c/f;->c(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 215
    const/4 v1, 0x3

    invoke-static {v1}, Lcom/a/a/c/f;->b(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 216
    const/4 v1, 0x4

    iget v2, p0, Lcom/a/a/c/at$d;->d:I

    invoke-static {v1, v2}, Lcom/a/a/c/f;->c(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 217
    const/4 v1, 0x5

    iget-wide v2, p0, Lcom/a/a/c/at$d;->e:J

    invoke-static {v1, v2, v3}, Lcom/a/a/c/f;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 218
    const/4 v1, 0x6

    iget-wide v2, p0, Lcom/a/a/c/at$d;->f:J

    invoke-static {v1, v2, v3}, Lcom/a/a/c/f;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 219
    return v0
.end method

.method public final a(Lcom/a/a/c/f;)V
    .locals 4

    .prologue
    .line 224
    iget v0, p0, Lcom/a/a/c/at$d;->a:F

    invoke-virtual {p1, v0}, Lcom/a/a/c/f;->a(F)V

    .line 225
    iget v0, p0, Lcom/a/a/c/at$d;->b:I

    invoke-virtual {p1, v0}, Lcom/a/a/c/f;->a(I)V

    .line 226
    const/4 v0, 0x3

    iget-boolean v1, p0, Lcom/a/a/c/at$d;->c:Z

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(IZ)V

    .line 227
    const/4 v0, 0x4

    iget v1, p0, Lcom/a/a/c/at$d;->d:I

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(II)V

    .line 228
    const/4 v0, 0x5

    iget-wide v2, p0, Lcom/a/a/c/at$d;->e:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/a/a/c/f;->a(IJ)V

    .line 229
    const/4 v0, 0x6

    iget-wide v2, p0, Lcom/a/a/c/at$d;->f:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/a/a/c/f;->a(IJ)V

    .line 230
    return-void
.end method
