.class public Lcom/fasterxml/jackson/core/format/InputAccessor$Std;
.super Ljava/lang/Object;
.source "InputAccessor.java"

# interfaces
.implements Lcom/fasterxml/jackson/core/format/InputAccessor;


# instance fields
.field protected final _buffer:[B

.field protected _bufferedAmount:I

.field protected final _in:Ljava/io/InputStream;

.field protected _ptr:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;[B)V
    .locals 1

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_in:Ljava/io/InputStream;

    .line 66
    iput-object p2, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_buffer:[B

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_bufferedAmount:I

    .line 68
    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_in:Ljava/io/InputStream;

    .line 77
    iput-object p1, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_buffer:[B

    .line 79
    array-length v0, p1

    iput v0, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_bufferedAmount:I

    .line 80
    return-void
.end method


# virtual methods
.method public createMatcher(Lcom/fasterxml/jackson/core/JsonFactory;Lcom/fasterxml/jackson/core/format/MatchStrength;)Lcom/fasterxml/jackson/core/format/DataFormatMatcher;
    .locals 6

    .prologue
    .line 125
    new-instance v0, Lcom/fasterxml/jackson/core/format/DataFormatMatcher;

    iget-object v1, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_in:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_buffer:[B

    iget v3, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_bufferedAmount:I

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/core/format/DataFormatMatcher;-><init>(Ljava/io/InputStream;[BILcom/fasterxml/jackson/core/JsonFactory;Lcom/fasterxml/jackson/core/format/MatchStrength;)V

    return-object v0
.end method

.method public hasMoreBytes()Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 85
    iget v2, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_ptr:I

    iget v3, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_bufferedAmount:I

    if-ge v2, v3, :cond_0

    .line 97
    :goto_0
    return v0

    .line 88
    :cond_0
    iget-object v2, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_buffer:[B

    array-length v2, v2

    iget v3, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_ptr:I

    sub-int/2addr v2, v3

    .line 89
    if-ge v2, v0, :cond_1

    move v0, v1

    .line 90
    goto :goto_0

    .line 92
    :cond_1
    iget-object v3, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_in:Ljava/io/InputStream;

    iget-object v4, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_buffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_ptr:I

    invoke-virtual {v3, v4, v5, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    .line 93
    if-gtz v2, :cond_2

    move v0, v1

    .line 94
    goto :goto_0

    .line 96
    :cond_2
    iget v1, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_bufferedAmount:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_bufferedAmount:I

    goto :goto_0
.end method

.method public nextByte()B
    .locals 3

    .prologue
    .line 104
    iget v0, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_ptr:I

    iget v1, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_bufferedAmount:I

    neg-int v1, v1

    if-le v0, v1, :cond_0

    .line 105
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->hasMoreBytes()Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not read more than "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_ptr:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " bytes (max buffer size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_buffer:[B

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_buffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_ptr:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_ptr:I

    aget-byte v0, v0, v1

    return v0
.end method

.method public reset()V
    .locals 1

    .prologue
    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lcom/fasterxml/jackson/core/format/InputAccessor$Std;->_ptr:I

    .line 115
    return-void
.end method
