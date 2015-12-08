.class public final Lcom/kik/m/e$a;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/m/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:[B

.field private d:I

.field private e:I

.field private f:Z

.field private g:[B

.field private h:Z

.field private i:I

.field private j:[B


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1839
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 1840
    and-int/lit8 v0, p2, 0x8

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/kik/m/e$a;->f:Z

    .line 1841
    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_1

    :goto_1
    iput-boolean v1, p0, Lcom/kik/m/e$a;->a:Z

    .line 1842
    iget-boolean v0, p0, Lcom/kik/m/e$a;->a:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    :goto_2
    iput v0, p0, Lcom/kik/m/e$a;->d:I

    .line 1843
    iget v0, p0, Lcom/kik/m/e$a;->d:I

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/kik/m/e$a;->c:[B

    .line 1844
    iput v2, p0, Lcom/kik/m/e$a;->b:I

    .line 1845
    iput v2, p0, Lcom/kik/m/e$a;->e:I

    .line 1846
    iput-boolean v2, p0, Lcom/kik/m/e$a;->h:Z

    .line 1847
    new-array v0, v3, [B

    iput-object v0, p0, Lcom/kik/m/e$a;->g:[B

    .line 1848
    iput p2, p0, Lcom/kik/m/e$a;->i:I

    .line 1849
    invoke-static {p2}, Lcom/kik/m/e;->a(I)[B

    move-result-object v0

    iput-object v0, p0, Lcom/kik/m/e$a;->j:[B

    .line 1850
    return-void

    :cond_0
    move v0, v2

    .line 1840
    goto :goto_0

    :cond_1
    move v1, v2

    .line 1841
    goto :goto_1

    :cond_2
    move v0, v3

    .line 1842
    goto :goto_2
.end method


# virtual methods
.method public final close()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 1960
    iget v0, p0, Lcom/kik/m/e$a;->b:I

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lcom/kik/m/e$a;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kik/m/e$a;->out:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/kik/m/e$a;->g:[B

    iget-object v2, p0, Lcom/kik/m/e$a;->c:[B

    iget v3, p0, Lcom/kik/m/e$a;->b:I

    iget v4, p0, Lcom/kik/m/e$a;->i:I

    invoke-static {v1, v2, v3, v4}, Lcom/kik/m/e;->a([B[BII)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/m/e$a;->b:I

    .line 1964
    :cond_0
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    .line 1966
    iput-object v5, p0, Lcom/kik/m/e$a;->c:[B

    .line 1967
    iput-object v5, p0, Lcom/kik/m/e$a;->out:Ljava/io/OutputStream;

    .line 1968
    return-void

    .line 1960
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Base64 input not properly padded."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final write(I)V
    .locals 6

    .prologue
    const/4 v2, -0x5

    const/4 v5, 0x0

    .line 1868
    iget-boolean v0, p0, Lcom/kik/m/e$a;->h:Z

    if-eqz v0, :cond_1

    .line 1869
    iget-object v0, p0, Lcom/kik/m/e$a;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 1906
    :cond_0
    :goto_0
    return-void

    .line 1874
    :cond_1
    iget-boolean v0, p0, Lcom/kik/m/e$a;->a:Z

    if-eqz v0, :cond_3

    .line 1875
    iget-object v0, p0, Lcom/kik/m/e$a;->c:[B

    iget v1, p0, Lcom/kik/m/e$a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/kik/m/e$a;->b:I

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    .line 1876
    iget v0, p0, Lcom/kik/m/e$a;->b:I

    iget v1, p0, Lcom/kik/m/e$a;->d:I

    if-lt v0, v1, :cond_0

    .line 1878
    iget-object v0, p0, Lcom/kik/m/e$a;->out:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/kik/m/e$a;->g:[B

    iget-object v2, p0, Lcom/kik/m/e$a;->c:[B

    iget v3, p0, Lcom/kik/m/e$a;->d:I

    iget v4, p0, Lcom/kik/m/e$a;->i:I

    invoke-static {v1, v2, v3, v4}, Lcom/kik/m/e;->a([B[BII)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 1880
    iget v0, p0, Lcom/kik/m/e$a;->e:I

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/kik/m/e$a;->e:I

    .line 1881
    iget-boolean v0, p0, Lcom/kik/m/e$a;->f:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/kik/m/e$a;->e:I

    const/16 v1, 0x4c

    if-lt v0, v1, :cond_2

    .line 1882
    iget-object v0, p0, Lcom/kik/m/e$a;->out:Ljava/io/OutputStream;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1883
    iput v5, p0, Lcom/kik/m/e$a;->e:I

    .line 1886
    :cond_2
    iput v5, p0, Lcom/kik/m/e$a;->b:I

    goto :goto_0

    .line 1893
    :cond_3
    iget-object v0, p0, Lcom/kik/m/e$a;->j:[B

    and-int/lit8 v1, p1, 0x7f

    aget-byte v0, v0, v1

    if-le v0, v2, :cond_4

    .line 1894
    iget-object v0, p0, Lcom/kik/m/e$a;->c:[B

    iget v1, p0, Lcom/kik/m/e$a;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/kik/m/e$a;->b:I

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    .line 1895
    iget v0, p0, Lcom/kik/m/e$a;->b:I

    iget v1, p0, Lcom/kik/m/e$a;->d:I

    if-lt v0, v1, :cond_0

    .line 1897
    iget-object v0, p0, Lcom/kik/m/e$a;->c:[B

    iget-object v1, p0, Lcom/kik/m/e$a;->g:[B

    iget v2, p0, Lcom/kik/m/e$a;->i:I

    invoke-static {v0, v1, v2}, Lcom/kik/m/e;->a([B[BI)I

    move-result v0

    .line 1898
    iget-object v1, p0, Lcom/kik/m/e$a;->out:Ljava/io/OutputStream;

    iget-object v2, p0, Lcom/kik/m/e$a;->g:[B

    invoke-virtual {v1, v2, v5, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 1899
    iput v5, p0, Lcom/kik/m/e$a;->b:I

    goto :goto_0

    .line 1902
    :cond_4
    iget-object v0, p0, Lcom/kik/m/e$a;->j:[B

    and-int/lit8 v1, p1, 0x7f

    aget-byte v0, v0, v1

    if-eq v0, v2, :cond_0

    .line 1903
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid character in Base64 data."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final write([BII)V
    .locals 2

    .prologue
    .line 1921
    iget-boolean v0, p0, Lcom/kik/m/e$a;->h:Z

    if-eqz v0, :cond_1

    .line 1922
    iget-object v0, p0, Lcom/kik/m/e$a;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 1930
    :cond_0
    return-void

    .line 1926
    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    .line 1927
    add-int v1, p2, v0

    aget-byte v1, p1, v1

    invoke-virtual {p0, v1}, Lcom/kik/m/e$a;->write(I)V

    .line 1926
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
