.class public final Lcom/android/volley/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/t;


# instance fields
.field private a:I

.field private b:I

.field private final c:I

.field private final d:F


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 50
    const/16 v0, 0x9c4

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, v1, v2}, Lcom/android/volley/e;-><init>(IIF)V

    .line 51
    return-void
.end method

.method public constructor <init>(IIF)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput p1, p0, Lcom/android/volley/e;->a:I

    .line 62
    iput p2, p0, Lcom/android/volley/e;->c:I

    .line 63
    iput p3, p0, Lcom/android/volley/e;->d:F

    .line 64
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 72
    iget v0, p0, Lcom/android/volley/e;->a:I

    return v0
.end method

.method public final a(Lcom/android/volley/w;)V
    .locals 3

    .prologue
    .line 91
    iget v0, p0, Lcom/android/volley/e;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/android/volley/e;->b:I

    .line 92
    iget v0, p0, Lcom/android/volley/e;->a:I

    int-to-float v0, v0

    iget v1, p0, Lcom/android/volley/e;->a:I

    int-to-float v1, v1

    iget v2, p0, Lcom/android/volley/e;->d:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/android/volley/e;->a:I

    .line 93
    iget v0, p0, Lcom/android/volley/e;->b:I

    iget v1, p0, Lcom/android/volley/e;->c:I

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    if-nez v0, :cond_1

    .line 94
    throw p1

    .line 93
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 96
    :cond_1
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 81
    iget v0, p0, Lcom/android/volley/e;->b:I

    return v0
.end method
