.class final Lcom/a/a/c/at$b;
.super Lcom/a/a/c/at$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field private final b:J

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/a/a/c/a/a/a;)V
    .locals 2

    .prologue
    .line 385
    const/4 v0, 0x4

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/a/a/c/at$h;

    invoke-direct {p0, v0, v1}, Lcom/a/a/c/at$h;-><init>(I[Lcom/a/a/c/at$h;)V

    .line 386
    iget-wide v0, p1, Lcom/a/a/c/a/a/a;->a:J

    iput-wide v0, p0, Lcom/a/a/c/at$b;->a:J

    .line 387
    iget-wide v0, p1, Lcom/a/a/c/a/a/a;->b:J

    iput-wide v0, p0, Lcom/a/a/c/at$b;->b:J

    .line 388
    iget-object v0, p1, Lcom/a/a/c/a/a/a;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/c/at$b;->c:Ljava/lang/String;

    .line 389
    iget-object v0, p1, Lcom/a/a/c/a/a/a;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/c/at$b;->d:Ljava/lang/String;

    .line 390
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 5

    .prologue
    .line 394
    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/a/a/c/at$b;->a:J

    invoke-static {v0, v2, v3}, Lcom/a/a/c/f;->b(IJ)I

    move-result v0

    .line 395
    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/a/a/c/at$b;->b:J

    invoke-static {v1, v2, v3}, Lcom/a/a/c/f;->b(IJ)I

    move-result v1

    .line 396
    const/4 v2, 0x3

    iget-object v3, p0, Lcom/a/a/c/at$b;->c:Ljava/lang/String;

    invoke-static {v3}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/a/a/c/f;->b(ILcom/a/a/c/b;)I

    move-result v2

    .line 398
    const/4 v3, 0x4

    iget-object v4, p0, Lcom/a/a/c/at$b;->d:Ljava/lang/String;

    invoke-static {v4}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/a/a/c/f;->b(ILcom/a/a/c/b;)I

    move-result v3

    .line 401
    add-int/2addr v0, v2

    add-int/2addr v0, v1

    add-int/2addr v0, v3

    return v0
.end method

.method public final a(Lcom/a/a/c/f;)V
    .locals 4

    .prologue
    .line 406
    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/a/a/c/at$b;->a:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/a/a/c/f;->a(IJ)V

    .line 407
    const/4 v0, 0x2

    iget-wide v2, p0, Lcom/a/a/c/at$b;->b:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/a/a/c/f;->a(IJ)V

    .line 408
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/a/a/c/at$b;->c:Ljava/lang/String;

    invoke-static {v1}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(ILcom/a/a/c/b;)V

    .line 409
    const/4 v0, 0x4

    iget-object v1, p0, Lcom/a/a/c/at$b;->d:Ljava/lang/String;

    invoke-static {v1}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(ILcom/a/a/c/b;)V

    .line 410
    return-void
.end method
