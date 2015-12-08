.class public final Lkik/android/scan/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[B

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I


# direct methods
.method public constructor <init>([BIIII)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput p4, p0, Lkik/android/scan/c;->f:I

    .line 50
    iput p5, p0, Lkik/android/scan/c;->g:I

    .line 52
    add-int/lit8 v0, p4, 0x0

    if-gt v0, p2, :cond_0

    add-int/lit8 v0, p5, 0x0

    if-le v0, p3, :cond_1

    .line 53
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Crop rectangle does not fit within image data."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->d(Ljava/lang/Throwable;)V

    .line 56
    :cond_1
    iput-object p1, p0, Lkik/android/scan/c;->a:[B

    .line 57
    iput p2, p0, Lkik/android/scan/c;->b:I

    .line 58
    iput p3, p0, Lkik/android/scan/c;->c:I

    .line 59
    iput v2, p0, Lkik/android/scan/c;->d:I

    .line 60
    iput v2, p0, Lkik/android/scan/c;->e:I

    .line 61
    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 82
    iget v3, p0, Lkik/android/scan/c;->f:I

    .line 83
    iget v4, p0, Lkik/android/scan/c;->g:I

    .line 87
    iget v0, p0, Lkik/android/scan/c;->b:I

    if-ne v3, v0, :cond_1

    iget v0, p0, Lkik/android/scan/c;->c:I

    if-ne v4, v0, :cond_1

    .line 88
    iget-object v0, p0, Lkik/android/scan/c;->a:[B

    .line 108
    :cond_0
    :goto_0
    return-object v0

    .line 91
    :cond_1
    mul-int v5, v3, v4

    .line 92
    new-array v0, v5, [B

    .line 93
    iget v2, p0, Lkik/android/scan/c;->e:I

    iget v6, p0, Lkik/android/scan/c;->b:I

    mul-int/2addr v2, v6

    iget v6, p0, Lkik/android/scan/c;->d:I

    add-int/2addr v2, v6

    .line 96
    iget v6, p0, Lkik/android/scan/c;->b:I

    if-ne v3, v6, :cond_2

    .line 97
    iget-object v3, p0, Lkik/android/scan/c;->a:[B

    invoke-static {v3, v2, v0, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 102
    :cond_2
    iget-object v5, p0, Lkik/android/scan/c;->a:[B

    .line 103
    :goto_1
    if-ge v1, v4, :cond_0

    .line 104
    mul-int v6, v1, v3

    .line 105
    invoke-static {v5, v2, v0, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 106
    iget v6, p0, Lkik/android/scan/c;->b:I

    add-int/2addr v2, v6

    .line 103
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method
