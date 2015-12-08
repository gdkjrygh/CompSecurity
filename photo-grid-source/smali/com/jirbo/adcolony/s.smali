.class Lcom/jirbo/adcolony/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:[C

.field b:I

.field c:I


# direct methods
.method constructor <init>(Ljava/io/InputStream;)V
    .locals 6

    .prologue
    const/16 v5, 0x20

    const/4 v4, 0x0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 73
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_5

    .line 75
    if-lt v0, v5, :cond_0

    const/16 v2, 0x7e

    if-le v0, v2, :cond_1

    :cond_0
    const/16 v2, 0xa

    if-ne v0, v2, :cond_2

    .line 77
    :cond_1
    int-to-char v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    :goto_1
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    goto :goto_0

    .line 79
    :cond_2
    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_4

    .line 82
    and-int/lit16 v2, v0, 0xe0

    const/16 v3, 0xc0

    if-ne v2, v3, :cond_3

    .line 85
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v2

    .line 86
    and-int/lit8 v0, v0, 0x1f

    shl-int/lit8 v0, v0, 0x6

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v0, v2

    int-to-char v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v2

    .line 92
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v3

    .line 93
    and-int/lit8 v0, v0, 0xf

    shl-int/lit8 v0, v0, 0xc

    and-int/lit8 v2, v2, 0x3f

    shl-int/lit8 v2, v2, 0x6

    or-int/2addr v0, v2

    and-int/lit8 v2, v3, 0x3f

    or-int/2addr v0, v2

    int-to-char v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 98
    :cond_4
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 102
    :cond_5
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/s;->c:I

    .line 104
    iget v0, p0, Lcom/jirbo/adcolony/s;->c:I

    new-array v0, v0, [C

    iput-object v0, p0, Lcom/jirbo/adcolony/s;->a:[C

    .line 105
    iget v0, p0, Lcom/jirbo/adcolony/s;->c:I

    iget-object v2, p0, Lcom/jirbo/adcolony/s;->a:[C

    invoke-virtual {v1, v4, v0, v2, v4}, Ljava/lang/StringBuilder;->getChars(II[CI)V

    .line 106
    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/16 v6, 0x20

    const/4 v1, 0x0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/s;->c:I

    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/jirbo/adcolony/s;->c:I

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    move v0, v1

    .line 25
    :goto_0
    iget v3, p0, Lcom/jirbo/adcolony/s;->c:I

    if-ge v0, v3, :cond_6

    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 28
    if-lt v3, v6, :cond_0

    const/16 v4, 0x7e

    if-le v3, v4, :cond_1

    :cond_0
    const/16 v4, 0xa

    if-ne v3, v4, :cond_2

    .line 30
    :cond_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 32
    :cond_2
    and-int/lit16 v4, v3, 0x80

    if-eqz v4, :cond_5

    .line 35
    and-int/lit16 v4, v3, 0xe0

    const/16 v5, 0xc0

    if-ne v4, v5, :cond_3

    add-int/lit8 v4, v0, 0x1

    iget v5, p0, Lcom/jirbo/adcolony/s;->c:I

    if-ge v4, v5, :cond_3

    .line 38
    add-int/lit8 v4, v0, 0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 39
    and-int/lit8 v3, v3, 0x1f

    shl-int/lit8 v3, v3, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v3, v4

    int-to-char v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    add-int/lit8 v4, v0, 0x2

    iget v5, p0, Lcom/jirbo/adcolony/s;->c:I

    if-ge v4, v5, :cond_4

    .line 45
    add-int/lit8 v4, v0, 0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 46
    add-int/lit8 v5, v0, 0x2

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 47
    and-int/lit8 v3, v3, 0xf

    shl-int/lit8 v3, v3, 0xc

    and-int/lit8 v4, v4, 0x3f

    shl-int/lit8 v4, v4, 0x6

    or-int/2addr v3, v4

    and-int/lit8 v4, v5, 0x3f

    or-int/2addr v3, v4

    int-to-char v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    add-int/lit8 v0, v0, 0x2

    .line 49
    goto :goto_1

    .line 53
    :cond_4
    const/16 v3, 0x3f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 58
    :cond_5
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 62
    :cond_6
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/s;->c:I

    .line 63
    iget v0, p0, Lcom/jirbo/adcolony/s;->c:I

    new-array v0, v0, [C

    iput-object v0, p0, Lcom/jirbo/adcolony/s;->a:[C

    .line 64
    iget v0, p0, Lcom/jirbo/adcolony/s;->c:I

    iget-object v3, p0, Lcom/jirbo/adcolony/s;->a:[C

    invoke-virtual {v2, v1, v0, v3, v1}, Ljava/lang/StringBuilder;->getChars(II[CI)V

    .line 65
    return-void
.end method

.method public static a([Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 166
    return-void
.end method


# virtual methods
.method a()Z
    .locals 2

    .prologue
    .line 110
    iget v0, p0, Lcom/jirbo/adcolony/s;->b:I

    iget v1, p0, Lcom/jirbo/adcolony/s;->c:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(C)Z
    .locals 2

    .prologue
    .line 126
    iget v0, p0, Lcom/jirbo/adcolony/s;->b:I

    iget v1, p0, Lcom/jirbo/adcolony/s;->c:I

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/s;->a:[C

    iget v1, p0, Lcom/jirbo/adcolony/s;->b:I

    aget-char v0, v0, v1

    if-eq v0, p1, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 128
    :goto_0
    return v0

    .line 127
    :cond_1
    iget v0, p0, Lcom/jirbo/adcolony/s;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/jirbo/adcolony/s;->b:I

    .line 128
    const/4 v0, 0x1

    goto :goto_0
.end method

.method a(Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 138
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    .line 139
    iget v1, p0, Lcom/jirbo/adcolony/s;->b:I

    add-int/2addr v1, v2

    iget v3, p0, Lcom/jirbo/adcolony/s;->c:I

    if-le v1, v3, :cond_1

    .line 145
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v1, v0

    .line 140
    :goto_1
    if-ge v1, v2, :cond_2

    .line 142
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    iget-object v4, p0, Lcom/jirbo/adcolony/s;->a:[C

    iget v5, p0, Lcom/jirbo/adcolony/s;->b:I

    add-int/2addr v5, v1

    aget-char v4, v4, v5

    if-ne v3, v4, :cond_0

    .line 140
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 144
    :cond_2
    iget v0, p0, Lcom/jirbo/adcolony/s;->b:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/jirbo/adcolony/s;->b:I

    .line 145
    const/4 v0, 0x1

    goto :goto_0
.end method

.method b()C
    .locals 2

    .prologue
    .line 115
    iget v0, p0, Lcom/jirbo/adcolony/s;->b:I

    iget v1, p0, Lcom/jirbo/adcolony/s;->c:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 116
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/s;->a:[C

    iget v1, p0, Lcom/jirbo/adcolony/s;->b:I

    aget-char v0, v0, v1

    goto :goto_0
.end method

.method b(C)V
    .locals 3

    .prologue
    .line 133
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/jirbo/adcolony/AdColonyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' expected."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/AdColonyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 134
    :cond_0
    return-void
.end method

.method b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 150
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/s;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/jirbo/adcolony/AdColonyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" expected."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/AdColonyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 151
    :cond_0
    return-void
.end method

.method c()C
    .locals 3

    .prologue
    .line 121
    iget-object v0, p0, Lcom/jirbo/adcolony/s;->a:[C

    iget v1, p0, Lcom/jirbo/adcolony/s;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/jirbo/adcolony/s;->b:I

    aget-char v0, v0, v1

    return v0
.end method

.method d()V
    .locals 2

    .prologue
    .line 157
    :goto_0
    iget v0, p0, Lcom/jirbo/adcolony/s;->b:I

    iget v1, p0, Lcom/jirbo/adcolony/s;->c:I

    if-ne v0, v1, :cond_1

    .line 160
    :cond_0
    return-void

    .line 158
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/s;->a:[C

    iget v1, p0, Lcom/jirbo/adcolony/s;->b:I

    aget-char v0, v0, v1

    .line 159
    const/16 v1, 0x20

    if-eq v0, v1, :cond_2

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    :cond_2
    iget v0, p0, Lcom/jirbo/adcolony/s;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/jirbo/adcolony/s;->b:I

    goto :goto_0
.end method
