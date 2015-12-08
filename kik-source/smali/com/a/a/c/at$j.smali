.class final Lcom/a/a/c/at$j;
.super Lcom/a/a/c/at$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "j"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:J


# direct methods
.method public constructor <init>(Lcom/a/a/c/a/a/e;)V
    .locals 2

    .prologue
    .line 350
    const/4 v0, 0x3

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/a/a/c/at$h;

    invoke-direct {p0, v0, v1}, Lcom/a/a/c/at$h;-><init>(I[Lcom/a/a/c/at$h;)V

    .line 351
    iget-object v0, p1, Lcom/a/a/c/a/a/e;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/c/at$j;->a:Ljava/lang/String;

    .line 352
    iget-object v0, p1, Lcom/a/a/c/a/a/e;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/a/a/c/at$j;->b:Ljava/lang/String;

    .line 353
    iget-wide v0, p1, Lcom/a/a/c/a/a/e;->c:J

    iput-wide v0, p0, Lcom/a/a/c/at$j;->c:J

    .line 354
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    .line 358
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/a/a/c/at$j;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/a/a/c/f;->b(ILcom/a/a/c/b;)I

    move-result v0

    .line 359
    const/4 v1, 0x2

    iget-object v2, p0, Lcom/a/a/c/at$j;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/a/a/c/f;->b(ILcom/a/a/c/b;)I

    move-result v1

    add-int/2addr v0, v1

    .line 360
    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/a/a/c/at$j;->c:J

    invoke-static {v1, v2, v3}, Lcom/a/a/c/f;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 361
    return v0
.end method

.method public final a(Lcom/a/a/c/f;)V
    .locals 4

    .prologue
    .line 366
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/a/a/c/at$j;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(ILcom/a/a/c/b;)V

    .line 367
    const/4 v0, 0x2

    iget-object v1, p0, Lcom/a/a/c/at$j;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(ILcom/a/a/c/b;)V

    .line 368
    const/4 v0, 0x3

    iget-wide v2, p0, Lcom/a/a/c/at$j;->c:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/a/a/c/f;->a(IJ)V

    .line 369
    return-void
.end method
