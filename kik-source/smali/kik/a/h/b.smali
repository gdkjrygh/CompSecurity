.class public final Lkik/a/h/b;
.super Lkik/a/h/k;
.source "SourceFile"


# instance fields
.field private b:I

.field private c:I

.field private d:J

.field private e:F


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    .line 19
    const/4 v0, 0x5

    const-wide/16 v2, 0x3e8

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {p0, v0, v2, v3, v1}, Lkik/a/h/b;-><init>(IJF)V

    .line 20
    return-void
.end method

.method public constructor <init>(IJF)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p2, p3}, Lkik/a/h/k;-><init>(J)V

    .line 25
    iput p1, p0, Lkik/a/h/b;->b:I

    .line 26
    iput p1, p0, Lkik/a/h/b;->c:I

    .line 27
    iput-wide p2, p0, Lkik/a/h/b;->d:J

    .line 28
    iput p4, p0, Lkik/a/h/b;->e:F

    .line 29
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lkik/a/h/b;->c:I

    if-gtz v0, :cond_0

    iget v0, p0, Lkik/a/h/b;->b:I

    if-ltz v0, :cond_0

    .line 35
    const/4 v0, 0x0

    .line 40
    :goto_0
    return v0

    .line 38
    :cond_0
    iget v0, p0, Lkik/a/h/b;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lkik/a/h/b;->c:I

    .line 40
    invoke-super {p0}, Lkik/a/h/k;->a()Z

    move-result v0

    goto :goto_0
.end method

.method protected final b()J
    .locals 4

    .prologue
    .line 46
    iget-wide v0, p0, Lkik/a/h/b;->d:J

    .line 48
    iget-wide v2, p0, Lkik/a/h/b;->d:J

    long-to-float v2, v2

    iget v3, p0, Lkik/a/h/b;->e:F

    mul-float/2addr v2, v3

    float-to-long v2, v2

    iput-wide v2, p0, Lkik/a/h/b;->d:J

    .line 50
    return-wide v0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 56
    iget v0, p0, Lkik/a/h/b;->b:I

    iput v0, p0, Lkik/a/h/b;->c:I

    .line 57
    iget-wide v0, p0, Lkik/a/h/b;->a:J

    iput-wide v0, p0, Lkik/a/h/b;->d:J

    .line 59
    invoke-super {p0}, Lkik/a/h/k;->c()V

    .line 60
    return-void
.end method
