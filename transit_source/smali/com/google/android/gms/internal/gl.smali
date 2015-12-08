.class public final Lcom/google/android/gms/internal/gl;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/gl$a;
    }
.end annotation


# instance fields
.field private final buffer:[B

.field private position:I

.field private final ux:I


# direct methods
.method private constructor <init>([BII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gl;->buffer:[B

    iput p2, p0, Lcom/google/android/gms/internal/gl;->position:I

    add-int v0, p2, p3

    iput v0, p0, Lcom/google/android/gms/internal/gl;->ux:I

    return-void
.end method

.method public static a([BII)Lcom/google/android/gms/internal/gl;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/gl;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/gl;-><init>([BII)V

    return-object v0
.end method

.method public static g([B)Lcom/google/android/gms/internal/gl;
    .locals 2

    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/gl;->a([BII)Lcom/google/android/gms/internal/gl;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public aD(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    int-to-byte v0, p1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gl;->b(B)V

    return-void
.end method

.method public aE(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/gl;->aD(I)V

    return-void

    :cond_0
    and-int/lit8 v0, p1, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gl;->aD(I)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0
.end method

.method public ab(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    array-length v1, v0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/gl;->aE(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gl;->h([B)V

    return-void
.end method

.method public b(B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/gl;->position:I

    iget v1, p0, Lcom/google/android/gms/internal/gl;->ux:I

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/gl$a;

    iget v1, p0, Lcom/google/android/gms/internal/gl;->position:I

    iget v2, p0, Lcom/google/android/gms/internal/gl;->ux:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/gl$a;-><init>(II)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gl;->buffer:[B

    iget v1, p0, Lcom/google/android/gms/internal/gl;->position:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/gl;->position:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public b(IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/gl;->d(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/gl;->i(J)V

    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/gl;->d(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/gl;->ab(Ljava/lang/String;)V

    return-void
.end method

.method public b([BII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/gl;->ux:I

    iget v1, p0, Lcom/google/android/gms/internal/gl;->position:I

    sub-int/2addr v0, v1

    if-lt v0, p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gl;->buffer:[B

    iget v1, p0, Lcom/google/android/gms/internal/gl;->position:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lcom/google/android/gms/internal/gl;->position:I

    add-int/2addr v0, p3

    iput v0, p0, Lcom/google/android/gms/internal/gl;->position:I

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/gl$a;

    iget v1, p0, Lcom/google/android/gms/internal/gl;->position:I

    iget v2, p0, Lcom/google/android/gms/internal/gl;->ux:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/gl$a;-><init>(II)V

    throw v0
.end method

.method public d(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/gm;->e(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gl;->aE(I)V

    return-void
.end method

.method public ec()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/gl;->ux:I

    iget v1, p0, Lcom/google/android/gms/internal/gl;->position:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public h([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/internal/gl;->b([BII)V

    return-void
.end method

.method public i(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/gl;->j(J)V

    return-void
.end method

.method public j(J)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    long-to-int v0, p1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gl;->aD(I)V

    return-void

    :cond_0
    long-to-int v0, p1

    and-int/lit8 v0, v0, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gl;->aD(I)V

    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0
.end method
