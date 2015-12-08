.class public final Lkik/a/f/n;
.super Lkik/a/f/d/a/a;
.source "SourceFile"


# instance fields
.field private b:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lkik/a/f/d/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 130
    invoke-virtual {p0}, Lkik/a/f/n;->next()I

    .line 131
    invoke-virtual {p0}, Lkik/a/f/n;->getDepth()I

    move-result v0

    return v0
.end method

.method public final a(Z)I
    .locals 9

    .prologue
    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v1, 0x0

    .line 148
    invoke-virtual {p0}, Lkik/a/f/n;->getEventType()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 149
    new-instance v0, Lorg/d/a/b;

    const-string v1, "At end of document"

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 152
    :cond_0
    invoke-virtual {p0}, Lkik/a/f/n;->getLineNumber()I

    move-result v4

    .line 153
    invoke-virtual {p0}, Lkik/a/f/n;->getColumnNumber()I

    move-result v5

    .line 154
    invoke-super {p0}, Lkik/a/f/d/a/a;->next()I

    move-result v0

    .line 156
    if-nez p1, :cond_b

    const/4 v2, 0x2

    if-ne v0, v2, :cond_b

    .line 157
    const-string v2, "enc"

    invoke-virtual {p0}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 159
    const-string v0, "iv"

    invoke-virtual {p0, v6, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 160
    const-string v2, "mac"

    invoke-virtual {p0, v6, v2}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 162
    if-nez v0, :cond_1

    .line 163
    new-instance v0, Lkik/a/f/g;

    const-string v1, "Missing initialization vector"

    invoke-direct {v0, v1}, Lkik/a/f/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 166
    :cond_1
    if-nez v2, :cond_2

    .line 167
    new-instance v0, Lkik/a/f/g;

    const-string v1, "Missing block mac"

    invoke-direct {v0, v1}, Lkik/a/f/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 170
    :cond_2
    invoke-super {p0}, Lkik/a/f/d/a/a;->next()I

    move-result v3

    const/4 v6, 0x4

    if-eq v3, v6, :cond_3

    .line 171
    new-instance v0, Lkik/a/f/g;

    const-string v1, "Missing text for encrypted block"

    invoke-direct {v0, v1}, Lkik/a/f/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 174
    :cond_3
    invoke-static {v0, v7}, Lcom/kik/m/e;->a(Ljava/lang/String;I)[B

    move-result-object v0

    .line 176
    invoke-virtual {p0}, Lkik/a/f/n;->getText()Ljava/lang/String;

    move-result-object v3

    .line 177
    invoke-static {v3, v7}, Lcom/kik/m/e;->a(Ljava/lang/String;I)[B

    move-result-object v3

    .line 179
    iget-object v6, p0, Lkik/a/f/n;->b:[B

    if-nez v6, :cond_4

    .line 180
    new-instance v0, Lkik/a/f/g;

    const-string v1, "No key specified"

    invoke-direct {v0, v1}, Lkik/a/f/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 183
    :cond_4
    iget-object v6, p0, Lkik/a/f/n;->b:[B

    invoke-static {v3, v6, v0}, Lkik/a/h/h;->b([B[B[B)[B

    move-result-object v0

    .line 185
    if-nez v0, :cond_5

    .line 186
    new-instance v0, Lkik/a/f/g;

    const-string v1, "Failed to decrypt"

    invoke-direct {v0, v1}, Lkik/a/f/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 189
    :cond_5
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v0}, Ljava/lang/String;-><init>([B)V

    .line 191
    invoke-static {v2, v7}, Lcom/kik/m/e;->a(Ljava/lang/String;I)[B

    move-result-object v2

    .line 195
    :try_start_0
    iget-object v3, p0, Lkik/a/f/n;->b:[B

    invoke-static {v0, v3}, Lkik/a/h/h;->b([B[B)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 204
    if-eqz v0, :cond_6

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_7

    .line 206
    :cond_6
    new-instance v0, Lkik/a/f/g;

    const-string v1, "MAC mismatch"

    invoke-direct {v0, v1}, Lkik/a/f/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 197
    :catch_0
    move-exception v0

    .line 198
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 200
    :catch_1
    move-exception v0

    .line 201
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 210
    :cond_7
    invoke-super {p0}, Lkik/a/f/d/a/a;->next()I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_8

    const-string v0, "enc"

    invoke-virtual {p0}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 211
    :cond_8
    new-instance v0, Lkik/a/f/g;

    const-string v1, "Missing end tag for encrypted block"

    invoke-direct {v0, v1}, Lkik/a/f/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 215
    :cond_9
    iget-object v0, p0, Lkik/a/f/n;->srcBuf:[C

    array-length v0, v0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v2

    iget v3, p0, Lkik/a/f/n;->srcCount:I

    add-int/2addr v2, v3

    iget v3, p0, Lkik/a/f/n;->peekCount:I

    add-int/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 216
    new-array v7, v0, [C

    .line 220
    invoke-virtual {v6}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v0, v1, v7, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v1

    move v2, v1

    .line 223
    :goto_0
    iget v3, p0, Lkik/a/f/n;->peekCount:I

    if-ge v0, v3, :cond_a

    .line 224
    add-int/lit8 v3, v2, 0x1

    iget-object v8, p0, Lkik/a/f/n;->peek:[I

    aget v8, v8, v0

    int-to-char v8, v8

    aput-char v8, v7, v2

    .line 223
    add-int/lit8 v0, v0, 0x1

    move v2, v3

    goto :goto_0

    .line 227
    :cond_a
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v2

    .line 229
    iget-object v2, p0, Lkik/a/f/n;->srcBuf:[C

    iget v3, p0, Lkik/a/f/n;->srcPos:I

    iget v6, p0, Lkik/a/f/n;->srcCount:I

    iget v8, p0, Lkik/a/f/n;->srcPos:I

    sub-int/2addr v6, v8

    invoke-static {v2, v3, v7, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 231
    iget v2, p0, Lkik/a/f/n;->srcCount:I

    iget v3, p0, Lkik/a/f/n;->srcPos:I

    sub-int/2addr v2, v3

    add-int/2addr v0, v2

    .line 234
    iput v0, p0, Lkik/a/f/n;->srcCount:I

    .line 235
    iput v1, p0, Lkik/a/f/n;->srcPos:I

    .line 236
    iput-object v7, p0, Lkik/a/f/n;->srcBuf:[C

    .line 237
    iput v1, p0, Lkik/a/f/n;->peekCount:I

    .line 238
    iput-boolean v1, p0, Lkik/a/f/n;->wasCR:Z

    .line 241
    iput v4, p0, Lkik/a/f/n;->line:I

    .line 242
    iput v5, p0, Lkik/a/f/n;->column:I

    .line 245
    invoke-super {p0}, Lkik/a/f/d/a/a;->next()I

    move-result v0

    .line 249
    :cond_b
    return v0
.end method

.method public final a(ILjava/lang/String;)V
    .locals 1

    .prologue
    .line 100
    :goto_0
    invoke-virtual {p0}, Lkik/a/f/n;->getEventType()I

    move-result v0

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 101
    :cond_0
    invoke-virtual {p0}, Lkik/a/f/n;->next()I

    goto :goto_0

    .line 103
    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 80
    invoke-virtual {p0}, Lkik/a/f/n;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 81
    new-instance v0, Lorg/d/a/b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required start of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " but was not at the start of a tag."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 83
    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 84
    new-instance v0, Lorg/d/a/b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required start of \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' tag but got start of \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_1
    if-eqz p1, :cond_2

    const-string v0, "xmlns"

    invoke-virtual {p0, v3, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 87
    new-instance v0, Lorg/d/a/b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Required namespace: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " got: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "xmlns"

    invoke-virtual {p0, v3, v2}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_2
    return-void
.end method

.method public final a([B)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lkik/a/f/n;->b:[B

    .line 137
    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 57
    invoke-virtual {p0}, Lkik/a/f/n;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 113
    invoke-virtual {p0}, Lkik/a/f/n;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 114
    new-instance v0, Lorg/d/a/b;

    const-string v1, "Required attribute but was not at the start of a tag."

    invoke-direct {v0, v1}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 116
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 117
    if-eqz v0, :cond_1

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 118
    :cond_1
    new-instance v1, Lorg/d/a/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected value \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\'  but got \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/d/a/b;-><init>(Ljava/lang/String;)V

    throw v1

    .line 120
    :cond_2
    return-void
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 68
    invoke-virtual {p0}, Lkik/a/f/n;->getEventType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final next()I
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/a/f/n;->a(Z)I

    move-result v0

    return v0
.end method

.method public final skipSubTree()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v4, 0x2

    const/4 v1, 0x1

    .line 256
    invoke-virtual {p0, v4, v0, v0}, Lkik/a/f/n;->require(ILjava/lang/String;Ljava/lang/String;)V

    move v0, v1

    .line 260
    :cond_0
    :goto_0
    if-lez v0, :cond_2

    .line 261
    invoke-virtual {p0, v1}, Lkik/a/f/n;->a(Z)I

    move-result v2

    .line 262
    const/4 v3, 0x3

    if-ne v2, v3, :cond_1

    .line 263
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 265
    :cond_1
    if-ne v2, v4, :cond_0

    .line 266
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 269
    :cond_2
    return-void
.end method
