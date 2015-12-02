.class public Landroid_src/mms/e/e;
.super Ljava/lang/Object;
.source "EncodedStringValue.java"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:I

.field private b:[B


# direct methods
.method public constructor <init>(I[B)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    if-nez p2, :cond_0

    .line 55
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "EncodedStringValue: Text-string is null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :cond_0
    iput p1, p0, Landroid_src/mms/e/e;->a:I

    .line 59
    array-length v0, p2

    new-array v0, v0, [B

    iput-object v0, p0, Landroid_src/mms/e/e;->b:[B

    .line 60
    iget-object v0, p0, Landroid_src/mms/e/e;->b:[B

    array-length v1, p2

    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 61
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    :try_start_0
    const-string v0, "utf-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/e/e;->b:[B

    .line 76
    const/16 v0, 0x6a

    iput v0, p0, Landroid_src/mms/e/e;->a:I
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    :goto_0
    return-void

    .line 77
    :catch_0
    move-exception v0

    .line 78
    const-string v1, "EncodedStringValue"

    const-string v2, "Default encoding must be supported."

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public constructor <init>([B)V
    .locals 1

    .prologue
    .line 70
    const/16 v0, 0x6a

    invoke-direct {p0, v0, p1}, Landroid_src/mms/e/e;-><init>(I[B)V

    .line 71
    return-void
.end method

.method public static a(Landroid_src/mms/e/e;)Landroid_src/mms/e/e;
    .locals 3

    .prologue
    .line 265
    if-nez p0, :cond_0

    .line 266
    const/4 v0, 0x0

    .line 269
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Landroid_src/mms/e/e;

    iget v1, p0, Landroid_src/mms/e/e;->a:I

    iget-object v2, p0, Landroid_src/mms/e/e;->b:[B

    invoke-direct {v0, v1, v2}, Landroid_src/mms/e/e;-><init>(I[B)V

    goto :goto_0
.end method

.method public static a([Ljava/lang/String;)[Landroid_src/mms/e/e;
    .locals 5

    .prologue
    .line 273
    array-length v2, p0

    .line 274
    if-lez v2, :cond_0

    .line 275
    new-array v0, v2, [Landroid_src/mms/e/e;

    .line 276
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 277
    new-instance v3, Landroid_src/mms/e/e;

    aget-object v4, p0, v1

    invoke-direct {v3, v4}, Landroid_src/mms/e/e;-><init>(Ljava/lang/String;)V

    aput-object v3, v0, v1

    .line 276
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 281
    :cond_0
    const/4 v0, 0x0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 88
    iget v0, p0, Landroid_src/mms/e/e;->a:I

    return v0
.end method

.method public a([B)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 120
    if-nez p1, :cond_0

    .line 121
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "EncodedStringValue: Text-string is null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 124
    :cond_0
    array-length v0, p1

    new-array v0, v0, [B

    iput-object v0, p0, Landroid_src/mms/e/e;->b:[B

    .line 125
    iget-object v0, p0, Landroid_src/mms/e/e;->b:[B

    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 126
    return-void
.end method

.method public b([B)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 163
    if-nez p1, :cond_0

    .line 164
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Text-string is null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 167
    :cond_0
    iget-object v0, p0, Landroid_src/mms/e/e;->b:[B

    if-nez v0, :cond_1

    .line 168
    array-length v0, p1

    new-array v0, v0, [B

    iput-object v0, p0, Landroid_src/mms/e/e;->b:[B

    .line 169
    iget-object v0, p0, Landroid_src/mms/e/e;->b:[B

    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 183
    :goto_0
    return-void

    .line 171
    :cond_1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 173
    :try_start_0
    iget-object v1, p0, Landroid_src/mms/e/e;->b:[B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 174
    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/e/e;->b:[B

    goto :goto_0

    .line 175
    :catch_0
    move-exception v0

    .line 176
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 177
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "appendTextString: failed when write a new Text-string"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()[B
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 107
    iget-object v0, p0, Landroid_src/mms/e/e;->b:[B

    array-length v0, v0

    new-array v0, v0, [B

    .line 109
    iget-object v1, p0, Landroid_src/mms/e/e;->b:[B

    iget-object v2, p0, Landroid_src/mms/e/e;->b:[B

    array-length v2, v2

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 110
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 3

    .prologue
    .line 136
    iget v0, p0, Landroid_src/mms/e/e;->a:I

    if-nez v0, :cond_0

    .line 137
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Landroid_src/mms/e/e;->b:[B

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    .line 149
    :goto_0
    return-object v0

    .line 140
    :cond_0
    :try_start_0
    iget v0, p0, Landroid_src/mms/e/e;->a:I

    invoke-static {v0}, Landroid_src/mms/e/c;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 141
    new-instance v0, Ljava/lang/String;

    iget-object v2, p0, Landroid_src/mms/e/e;->b:[B

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 142
    :catch_0
    move-exception v0

    .line 147
    :try_start_1
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Landroid_src/mms/e/e;->b:[B

    const-string v2, "iso-8859-1"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 148
    :catch_1
    move-exception v0

    .line 149
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Landroid_src/mms/e/e;->b:[B

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    goto :goto_0
.end method

.method public clone()Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 191
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 192
    iget-object v0, p0, Landroid_src/mms/e/e;->b:[B

    array-length v0, v0

    .line 193
    new-array v1, v0, [B

    .line 194
    iget-object v2, p0, Landroid_src/mms/e/e;->b:[B

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 197
    :try_start_0
    new-instance v0, Landroid_src/mms/e/e;

    iget v2, p0, Landroid_src/mms/e/e;->a:I

    invoke-direct {v0, v2, v1}, Landroid_src/mms/e/e;-><init>(I[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 198
    :catch_0
    move-exception v0

    .line 199
    const-string v1, "EncodedStringValue"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "failed to clone an EncodedStringValue: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 201
    new-instance v1, Ljava/lang/CloneNotSupportedException;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/CloneNotSupportedException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
