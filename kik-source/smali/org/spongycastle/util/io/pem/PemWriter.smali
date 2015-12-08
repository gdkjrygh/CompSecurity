.class public Lorg/spongycastle/util/io/pem/PemWriter;
.super Ljava/io/BufferedWriter;
.source "SourceFile"


# instance fields
.field private final a:I

.field private b:[C


# direct methods
.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0, p1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 19
    const/16 v0, 0x40

    new-array v0, v0, [C

    iput-object v0, p0, Lorg/spongycastle/util/io/pem/PemWriter;->b:[C

    .line 30
    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/util/io/pem/PemWriter;->a:I

    .line 39
    :goto_0
    return-void

    .line 37
    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lorg/spongycastle/util/io/pem/PemWriter;->a:I

    goto :goto_0
.end method

.method private a([B)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 102
    invoke-static {p1}, Lorg/spongycastle/util/encoders/Base64;->a([B)[B

    move-result-object v3

    move v0, v1

    .line 104
    :goto_0
    array-length v2, v3

    if-ge v0, v2, :cond_1

    move v2, v1

    .line 108
    :goto_1
    iget-object v4, p0, Lorg/spongycastle/util/io/pem/PemWriter;->b:[C

    array-length v4, v4

    if-eq v2, v4, :cond_0

    .line 110
    add-int v4, v0, v2

    array-length v5, v3

    if-ge v4, v5, :cond_0

    .line 112
    iget-object v4, p0, Lorg/spongycastle/util/io/pem/PemWriter;->b:[C

    add-int v5, v0, v2

    aget-byte v5, v3, v5

    int-to-char v5, v5

    aput-char v5, v4, v2

    .line 115
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 117
    :cond_0
    iget-object v4, p0, Lorg/spongycastle/util/io/pem/PemWriter;->b:[C

    invoke-virtual {p0, v4, v1, v2}, Lorg/spongycastle/util/io/pem/PemWriter;->write([CII)V

    .line 118
    invoke-virtual {p0}, Lorg/spongycastle/util/io/pem/PemWriter;->newLine()V

    .line 104
    iget-object v2, p0, Lorg/spongycastle/util/io/pem/PemWriter;->b:[C

    array-length v2, v2

    add-int/2addr v0, v2

    goto :goto_0

    .line 120
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lorg/spongycastle/util/io/pem/PemObjectGenerator;)V
    .locals 4

    .prologue
    .line 76
    invoke-interface {p1}, Lorg/spongycastle/util/io/pem/PemObjectGenerator;->d()Lorg/spongycastle/util/io/pem/PemObject;

    move-result-object v1

    .line 78
    invoke-virtual {v1}, Lorg/spongycastle/util/io/pem/PemObject;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "-----BEGIN "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "-----"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/spongycastle/util/io/pem/PemWriter;->write(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/spongycastle/util/io/pem/PemWriter;->newLine()V

    .line 80
    invoke-virtual {v1}, Lorg/spongycastle/util/io/pem/PemObject;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 82
    invoke-virtual {v1}, Lorg/spongycastle/util/io/pem/PemObject;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/util/io/pem/PemHeader;

    .line 86
    invoke-virtual {v0}, Lorg/spongycastle/util/io/pem/PemHeader;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lorg/spongycastle/util/io/pem/PemWriter;->write(Ljava/lang/String;)V

    .line 87
    const-string v3, ": "

    invoke-virtual {p0, v3}, Lorg/spongycastle/util/io/pem/PemWriter;->write(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v0}, Lorg/spongycastle/util/io/pem/PemHeader;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/spongycastle/util/io/pem/PemWriter;->write(Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0}, Lorg/spongycastle/util/io/pem/PemWriter;->newLine()V

    goto :goto_0

    .line 92
    :cond_0
    invoke-virtual {p0}, Lorg/spongycastle/util/io/pem/PemWriter;->newLine()V

    .line 95
    :cond_1
    invoke-virtual {v1}, Lorg/spongycastle/util/io/pem/PemObject;->c()[B

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/spongycastle/util/io/pem/PemWriter;->a([B)V

    .line 96
    invoke-virtual {v1}, Lorg/spongycastle/util/io/pem/PemObject;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "-----END "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-----"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/spongycastle/util/io/pem/PemWriter;->write(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/spongycastle/util/io/pem/PemWriter;->newLine()V

    .line 97
    return-void
.end method
