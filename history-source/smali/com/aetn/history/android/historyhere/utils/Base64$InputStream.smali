.class public Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;
.super Ljava/io/FilterInputStream;
.source "Base64.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/utils/Base64;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InputStream"
.end annotation


# instance fields
.field private breakLines:Z

.field private buffer:[B

.field private bufferLength:I

.field private decodabet:[B

.field private encode:Z

.field private lineLength:I

.field private numSigBytes:I

.field private options:I

.field private position:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .param p1, "in"    # Ljava/io/InputStream;

    .prologue
    .line 1660
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;-><init>(Ljava/io/InputStream;I)V

    .line 1661
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 3
    .param p1, "in"    # Ljava/io/InputStream;
    .param p2, "options"    # I

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1686
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 1687
    iput p2, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->options:I

    .line 1688
    and-int/lit8 v0, p2, 0x8

    if-lez v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->breakLines:Z

    .line 1689
    and-int/lit8 v0, p2, 0x1

    if-lez v0, :cond_1

    :goto_1
    iput-boolean v1, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->encode:Z

    .line 1690
    iget-boolean v0, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->encode:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    :goto_2
    iput v0, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->bufferLength:I

    .line 1691
    iget v0, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->bufferLength:I

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->buffer:[B

    .line 1692
    const/4 v0, -0x1

    iput v0, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->position:I

    .line 1693
    iput v2, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->lineLength:I

    .line 1694
    # invokes: Lcom/aetn/history/android/historyhere/utils/Base64;->getDecodabet(I)[B
    invoke-static {p2}, Lcom/aetn/history/android/historyhere/utils/Base64;->access$000(I)[B

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->decodabet:[B

    .line 1695
    return-void

    :cond_0
    move v0, v2

    .line 1688
    goto :goto_0

    :cond_1
    move v1, v2

    .line 1689
    goto :goto_1

    .line 1690
    :cond_2
    const/4 v0, 0x3

    goto :goto_2
.end method


# virtual methods
.method public read()I
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x3

    const/4 v10, 0x4

    const/4 v9, -0x1

    const/4 v1, 0x0

    .line 1708
    iget v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->position:I

    if-gez v3, :cond_1

    .line 1709
    iget-boolean v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->encode:Z

    if-eqz v3, :cond_3

    .line 1710
    new-array v0, v4, [B

    .line 1711
    .local v0, "b3":[B
    const/4 v2, 0x0

    .line 1712
    .local v2, "numBinaryBytes":I
    const/4 v8, 0x0

    .local v8, "i":I
    :goto_0
    if-ge v8, v4, :cond_0

    .line 1713
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v3}, Ljava/io/InputStream;->read()I

    move-result v6

    .line 1716
    .local v6, "b":I
    if-ltz v6, :cond_0

    .line 1717
    int-to-byte v3, v6

    aput-byte v3, v0, v8

    .line 1718
    add-int/lit8 v2, v2, 0x1

    .line 1712
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 1725
    .end local v6    # "b":I
    :cond_0
    if-lez v2, :cond_2

    .line 1726
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->buffer:[B

    iget v5, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->options:I

    move v4, v1

    # invokes: Lcom/aetn/history/android/historyhere/utils/Base64;->encode3to4([BII[BII)[B
    invoke-static/range {v0 .. v5}, Lcom/aetn/history/android/historyhere/utils/Base64;->access$100([BII[BII)[B

    .line 1727
    iput v1, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->position:I

    .line 1728
    iput v10, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->numSigBytes:I

    .line 1768
    .end local v0    # "b3":[B
    .end local v2    # "numBinaryBytes":I
    .end local v8    # "i":I
    :cond_1
    :goto_1
    iget v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->position:I

    if-ltz v3, :cond_d

    .line 1770
    iget v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->position:I

    iget v4, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->numSigBytes:I

    if-lt v3, v4, :cond_a

    move v1, v9

    .line 1789
    :goto_2
    return v1

    .restart local v0    # "b3":[B
    .restart local v2    # "numBinaryBytes":I
    .restart local v8    # "i":I
    :cond_2
    move v1, v9

    .line 1731
    goto :goto_2

    .line 1737
    .end local v0    # "b3":[B
    .end local v2    # "numBinaryBytes":I
    .end local v8    # "i":I
    :cond_3
    new-array v7, v10, [B

    .line 1738
    .local v7, "b4":[B
    const/4 v8, 0x0

    .line 1739
    .restart local v8    # "i":I
    const/4 v8, 0x0

    :goto_3
    if-ge v8, v10, :cond_6

    .line 1741
    const/4 v6, 0x0

    .line 1742
    .restart local v6    # "b":I
    :cond_4
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v3}, Ljava/io/InputStream;->read()I

    move-result v6

    .line 1743
    if-ltz v6, :cond_5

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->decodabet:[B

    and-int/lit8 v4, v6, 0x7f

    aget-byte v3, v3, v4

    const/4 v4, -0x5

    if-le v3, v4, :cond_4

    .line 1745
    :cond_5
    if-gez v6, :cond_7

    .line 1752
    .end local v6    # "b":I
    :cond_6
    if-ne v8, v10, :cond_8

    .line 1753
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->buffer:[B

    iget v4, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->options:I

    # invokes: Lcom/aetn/history/android/historyhere/utils/Base64;->decode4to3([BI[BII)I
    invoke-static {v7, v1, v3, v1, v4}, Lcom/aetn/history/android/historyhere/utils/Base64;->access$200([BI[BII)I

    move-result v3

    iput v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->numSigBytes:I

    .line 1754
    iput v1, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->position:I

    goto :goto_1

    .line 1749
    .restart local v6    # "b":I
    :cond_7
    int-to-byte v3, v6

    aput-byte v3, v7, v8

    .line 1739
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 1756
    .end local v6    # "b":I
    :cond_8
    if-nez v8, :cond_9

    move v1, v9

    .line 1757
    goto :goto_2

    .line 1761
    :cond_9
    new-instance v1, Ljava/io/IOException;

    const-string v3, "Improperly padded Base64 input."

    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1774
    .end local v7    # "b4":[B
    .end local v8    # "i":I
    :cond_a
    iget-boolean v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->encode:Z

    if-eqz v3, :cond_b

    iget-boolean v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->breakLines:Z

    if-eqz v3, :cond_b

    iget v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->lineLength:I

    const/16 v4, 0x4c

    if-lt v3, v4, :cond_b

    .line 1775
    iput v1, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->lineLength:I

    .line 1776
    const/16 v1, 0xa

    goto :goto_2

    .line 1779
    :cond_b
    iget v1, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->lineLength:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->lineLength:I

    .line 1783
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->buffer:[B

    iget v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->position:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->position:I

    aget-byte v6, v1, v3

    .line 1785
    .restart local v6    # "b":I
    iget v1, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->position:I

    iget v3, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->bufferLength:I

    if-lt v1, v3, :cond_c

    .line 1786
    iput v9, p0, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->position:I

    .line 1789
    :cond_c
    and-int/lit16 v1, v6, 0xff

    goto :goto_2

    .line 1796
    .end local v6    # "b":I
    :cond_d
    new-instance v1, Ljava/io/IOException;

    const-string v3, "Error in Base64 code reading stream."

    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public read([BII)I
    .locals 4
    .param p1, "dest"    # [B
    .param p2, "off"    # I
    .param p3, "len"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1818
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-ge v1, p3, :cond_1

    .line 1819
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/utils/Base64$InputStream;->read()I

    move-result v0

    .line 1821
    .local v0, "b":I
    if-ltz v0, :cond_0

    .line 1822
    add-int v2, p2, v1

    int-to-byte v3, v0

    aput-byte v3, p1, v2

    .line 1818
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1824
    :cond_0
    if-nez v1, :cond_1

    .line 1825
    const/4 v1, -0x1

    .line 1831
    .end local v0    # "b":I
    .end local v1    # "i":I
    :cond_1
    return v1
.end method
