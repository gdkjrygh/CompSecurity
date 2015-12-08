.class public final Lb/a/gz;
.super Lb/a/ha;


# instance fields
.field private a:[B

.field private b:I

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/ha;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([BII)I
    .locals 2

    invoke-virtual {p0}, Lb/a/gz;->d()I

    move-result v0

    if-le p3, v0, :cond_0

    move p3, v0

    :cond_0
    if-lez p3, :cond_1

    iget-object v0, p0, Lb/a/gz;->a:[B

    iget v1, p0, Lb/a/gz;->b:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0, p3}, Lb/a/gz;->a(I)V

    :cond_1
    return p3
.end method

.method public final a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lb/a/gz;->a:[B

    return-void
.end method

.method public final a(I)V
    .locals 1

    iget v0, p0, Lb/a/gz;->b:I

    add-int/2addr v0, p1

    iput v0, p0, Lb/a/gz;->b:I

    return-void
.end method

.method public final a([BI)V
    .locals 1

    iput-object p1, p0, Lb/a/gz;->a:[B

    const/4 v0, 0x0

    iput v0, p0, Lb/a/gz;->b:I

    add-int/lit8 v0, p2, 0x0

    iput v0, p0, Lb/a/gz;->c:I

    return-void
.end method

.method public final b([BII)V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "No writing allowed!"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()[B
    .locals 1

    iget-object v0, p0, Lb/a/gz;->a:[B

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lb/a/gz;->b:I

    return v0
.end method

.method public final d()I
    .locals 2

    iget v0, p0, Lb/a/gz;->c:I

    iget v1, p0, Lb/a/gz;->b:I

    sub-int/2addr v0, v1

    return v0
.end method
