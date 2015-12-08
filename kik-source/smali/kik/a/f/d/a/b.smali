.class public Lkik/a/f/d/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/d/a/c;


# instance fields
.field private a:Ljava/io/Writer;

.field private b:Z

.field private c:I

.field private d:I

.field private e:[Ljava/lang/String;

.field private f:[I

.field private g:[Ljava/lang/String;

.field private h:[Z

.field private i:Z

.field private j:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    .line 45
    new-array v0, v1, [I

    iput-object v0, p0, Lkik/a/f/d/a/b;->f:[I

    .line 46
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    .line 48
    new-array v0, v1, [Z

    iput-object v0, p0, Lkik/a/f/d/a/b;->h:[Z

    return-void
.end method

.method private a()I
    .locals 1

    .prologue
    .line 578
    iget-boolean v0, p0, Lkik/a/f/d/a/b;->b:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v0, v0, 0x1

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lkik/a/f/d/a/b;->d:I

    goto :goto_0
.end method

.method private final a(Ljava/lang/String;ZZ)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 242
    iget-object v0, p0, Lkik/a/f/d/a/b;->f:[I

    iget v2, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v2, v2, 0x1

    aget v0, v0, v2

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, -0x2

    move v3, v0

    :goto_0
    if-ltz v3, :cond_3

    .line 243
    iget-object v0, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    add-int/lit8 v2, v3, 0x1

    aget-object v0, v0, v2

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p2, :cond_0

    iget-object v0, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    aget-object v0, v0, v3

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 244
    :cond_0
    iget-object v0, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    aget-object v2, v0, v3

    .line 245
    add-int/lit8 v0, v3, 0x2

    :goto_1
    iget-object v4, p0, Lkik/a/f/d/a/b;->f:[I

    iget v5, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v5, v5, 0x1

    aget v4, v4, v5

    mul-int/lit8 v4, v4, 0x2

    if-ge v0, v4, :cond_8

    .line 246
    iget-object v4, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    aget-object v4, v4, v0

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v0, v1

    .line 251
    :goto_2
    if-eqz v0, :cond_2

    .line 282
    :goto_3
    return-object v0

    .line 245
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 242
    :cond_2
    add-int/lit8 v0, v3, -0x2

    move v3, v0

    goto :goto_0

    .line 257
    :cond_3
    if-nez p3, :cond_4

    move-object v0, v1

    .line 258
    goto :goto_3

    .line 263
    :cond_4
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 264
    const-string v0, ""

    .line 278
    :goto_4
    iget-boolean v1, p0, Lkik/a/f/d/a/b;->b:Z

    .line 279
    const/4 v2, 0x0

    iput-boolean v2, p0, Lkik/a/f/d/a/b;->b:Z

    .line 280
    invoke-virtual {p0, v0, p1}, Lkik/a/f/d/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    iput-boolean v1, p0, Lkik/a/f/d/a/b;->b:Z

    goto :goto_3

    .line 268
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "n"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lkik/a/f/d/a/b;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lkik/a/f/d/a/b;->c:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 269
    iget-object v2, p0, Lkik/a/f/d/a/b;->f:[I

    iget v3, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v3, v3, 0x1

    aget v2, v2, v3

    mul-int/lit8 v2, v2, 0x2

    add-int/lit8 v2, v2, -0x2

    :goto_5
    if-ltz v2, :cond_6

    .line 270
    iget-object v3, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    aget-object v3, v3, v2

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    move-object v0, v1

    .line 275
    :cond_6
    if-eqz v0, :cond_5

    goto :goto_4

    .line 269
    :cond_7
    add-int/lit8 v2, v2, -0x2

    goto :goto_5

    :cond_8
    move-object v0, v2

    goto :goto_2
.end method

.method private final a(Ljava/lang/String;I)V
    .locals 9

    .prologue
    const/16 v8, 0x3f

    const/4 v7, 0x1

    const/4 v1, 0x0

    .line 103
    const/4 v0, 0x2

    new-array v3, v0, [C

    fill-array-data v3, :array_0

    move v0, v1

    .line 105
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_8

    .line 106
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 109
    aget-char v4, v3, v1

    if-eqz v4, :cond_1

    .line 110
    aget-char v4, v3, v1

    invoke-static {v4, v2}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 111
    aput-char v2, v3, v7

    .line 112
    iget-object v2, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v2, v3}, Ljava/io/Writer;->write([C)V

    .line 113
    aput-char v1, v3, v1

    .line 114
    aput-char v1, v3, v7

    .line 105
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 118
    :cond_0
    aput-char v1, v3, v1

    .line 119
    aput-char v1, v3, v7

    .line 120
    iget-object v4, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v4, v8}, Ljava/io/Writer;->write(I)V

    .line 124
    :cond_1
    sparse-switch v2, :sswitch_data_0

    .line 156
    :cond_2
    const/16 v4, 0x20

    if-lt v2, v4, :cond_7

    const/16 v4, 0x7f

    if-lt v2, v4, :cond_3

    iget-boolean v4, p0, Lkik/a/f/d/a/b;->i:Z

    if-eqz v4, :cond_7

    .line 157
    :cond_3
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 158
    aput-char v2, v3, v1

    goto :goto_1

    .line 128
    :sswitch_0
    const/4 v4, -0x1

    if-ne p2, v4, :cond_4

    .line 129
    iget-object v4, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v4, v2}, Ljava/io/Writer;->write(I)V

    goto :goto_1

    .line 132
    :cond_4
    iget-object v4, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "&#"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v5, 0x3b

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 136
    :sswitch_1
    iget-object v2, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const-string v4, "&amp;"

    invoke-virtual {v2, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 139
    :sswitch_2
    iget-object v2, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const-string v4, "&gt;"

    invoke-virtual {v2, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 142
    :sswitch_3
    iget-object v2, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const-string v4, "&lt;"

    invoke-virtual {v2, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 146
    :sswitch_4
    if-ne v2, p2, :cond_2

    .line 147
    iget-object v4, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const/16 v5, 0x22

    if-ne v2, v5, :cond_5

    const-string v2, "&quot;"

    :goto_2
    invoke-virtual {v4, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    const-string v2, "&apos;"

    goto :goto_2

    .line 160
    :cond_6
    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v4

    if-nez v4, :cond_7

    .line 161
    iget-object v4, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v4, v2}, Ljava/io/Writer;->write(I)V

    goto :goto_1

    .line 168
    :cond_7
    iget-object v2, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v2, v8}, Ljava/io/Writer;->write(I)V

    goto/16 :goto_1

    .line 185
    :cond_8
    return-void

    .line 103
    nop

    :array_0
    .array-data 2
        0x0s
        0x0s
    .end array-data

    .line 124
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_0
        0xa -> :sswitch_0
        0xd -> :sswitch_0
        0x22 -> :sswitch_4
        0x26 -> :sswitch_1
        0x27 -> :sswitch_4
        0x3c -> :sswitch_3
        0x3e -> :sswitch_2
    .end sparse-switch
.end method

.method private final a(Z)V
    .locals 6

    .prologue
    const/16 v5, 0x22

    const/4 v4, 0x0

    .line 54
    iget-boolean v0, p0, Lkik/a/f/d/a/b;->b:Z

    if-nez v0, :cond_0

    .line 93
    :goto_0
    return-void

    .line 58
    :cond_0
    iget v0, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/a/f/d/a/b;->d:I

    .line 59
    iput-boolean v4, p0, Lkik/a/f/d/a/b;->b:Z

    .line 61
    iget-object v0, p0, Lkik/a/f/d/a/b;->h:[Z

    array-length v0, v0

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    if-gt v0, v1, :cond_1

    .line 62
    iget v0, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v0, v0, 0x4

    new-array v0, v0, [Z

    .line 63
    iget-object v1, p0, Lkik/a/f/d/a/b;->h:[Z

    iget v2, p0, Lkik/a/f/d/a/b;->d:I

    invoke-static {v1, v4, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 64
    iput-object v0, p0, Lkik/a/f/d/a/b;->h:[Z

    .line 66
    :cond_1
    iget-object v0, p0, Lkik/a/f/d/a/b;->h:[Z

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    iget-object v2, p0, Lkik/a/f/d/a/b;->h:[Z

    iget v3, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v3, v3, -0x1

    aget-boolean v2, v2, v3

    aput-boolean v2, v0, v1

    .line 68
    iget-object v0, p0, Lkik/a/f/d/a/b;->f:[I

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    :goto_1
    iget-object v1, p0, Lkik/a/f/d/a/b;->f:[I

    iget v2, p0, Lkik/a/f/d/a/b;->d:I

    aget v1, v1, v2

    if-ge v0, v1, :cond_5

    .line 69
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 70
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const-string v2, "xmlns"

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 71
    const-string v1, ""

    iget-object v2, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    mul-int/lit8 v3, v0, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 72
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 73
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    iget-object v2, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    mul-int/lit8 v3, v0, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 78
    :cond_2
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const-string v2, "=\""

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 79
    iget-object v1, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    mul-int/lit8 v2, v0, 0x2

    add-int/lit8 v2, v2, 0x1

    aget-object v1, v1, v2

    invoke-direct {p0, v1, v5}, Lkik/a/f/d/a/b;->a(Ljava/lang/String;I)V

    .line 80
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v1, v5}, Ljava/io/Writer;->write(I)V

    .line 68
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 75
    :cond_3
    const-string v2, ""

    invoke-direct {p0}, Lkik/a/f/d/a/b;->a()I

    move-result v1

    if-nez v1, :cond_4

    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, ""

    iget-object v2, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    mul-int/lit8 v3, v0, 0x2

    add-int/lit8 v3, v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 76
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot set default namespace for elements in no namespace"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_4
    iget-object v1, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    invoke-direct {p0}, Lkik/a/f/d/a/b;->a()I

    move-result v3

    mul-int/lit8 v3, v3, 0x3

    add-int/lit8 v3, v3, -0x3

    aget-object v1, v1, v3

    goto :goto_2

    .line 83
    :cond_5
    iget-object v0, p0, Lkik/a/f/d/a/b;->f:[I

    array-length v0, v0

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v1, v1, 0x1

    if-gt v0, v1, :cond_6

    .line 84
    iget v0, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v0, v0, 0x8

    new-array v0, v0, [I

    .line 85
    iget-object v1, p0, Lkik/a/f/d/a/b;->f:[I

    iget v2, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1, v4, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 86
    iput-object v0, p0, Lkik/a/f/d/a/b;->f:[I

    .line 89
    :cond_6
    iget-object v0, p0, Lkik/a/f/d/a/b;->f:[I

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lkik/a/f/d/a/b;->f:[I

    iget v3, p0, Lkik/a/f/d/a/b;->d:I

    aget v2, v2, v3

    aput v2, v0, v1

    .line 92
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    if-eqz p1, :cond_7

    const-string v0, " />"

    :goto_3
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_7
    const-string v0, ">"

    goto :goto_3
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/d/a/c;
    .locals 4

    .prologue
    const/16 v3, 0x22

    .line 461
    iget-boolean v0, p0, Lkik/a/f/d/a/b;->b:Z

    if-nez v0, :cond_0

    .line 462
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "illegal position for attribute"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 467
    :cond_0
    if-nez p1, :cond_1

    .line 468
    const-string p1, ""

    .line 474
    :cond_1
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, ""

    .line 493
    :goto_0
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 494
    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 495
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 496
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 498
    :cond_2
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 499
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 502
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(I)V

    .line 504
    invoke-direct {p0, p3, v3}, Lkik/a/f/d/a/b;->a(Ljava/lang/String;I)V

    .line 505
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(I)V

    .line 507
    return-object p0

    .line 474
    :cond_3
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lkik/a/f/d/a/b;->a(Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 372
    if-nez p1, :cond_0

    .line 373
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 375
    :cond_0
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/a/f/d/a/b;->a(Ljava/io/Writer;)V

    .line 376
    iput-object p2, p0, Lkik/a/f/d/a/b;->j:Ljava/lang/String;

    .line 377
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 378
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/f/d/a/b;->i:Z

    .line 380
    :cond_1
    return-void
.end method

.method public final a(Ljava/io/Writer;)V
    .locals 5

    .prologue
    const/4 v2, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 349
    iput-object p1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    .line 356
    iget-object v0, p0, Lkik/a/f/d/a/b;->f:[I

    aput v2, v0, v3

    .line 357
    iget-object v0, p0, Lkik/a/f/d/a/b;->f:[I

    aput v2, v0, v4

    .line 358
    iget-object v0, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    const-string v1, ""

    aput-object v1, v0, v3

    .line 359
    iget-object v0, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    const-string v1, ""

    aput-object v1, v0, v4

    .line 360
    iget-object v0, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    const-string v1, "xml"

    aput-object v1, v0, v2

    .line 361
    iget-object v0, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    const/4 v1, 0x3

    const-string v2, "http://www.w3.org/XML/1998/namespace"

    aput-object v2, v0, v1

    .line 362
    iput-boolean v3, p0, Lkik/a/f/d/a/b;->b:Z

    .line 363
    iput v3, p0, Lkik/a/f/d/a/b;->c:I

    .line 364
    iput v3, p0, Lkik/a/f/d/a/b;->d:I

    .line 366
    iput-boolean v4, p0, Lkik/a/f/d/a/b;->i:Z

    .line 367
    return-void
.end method

.method public c(Ljava/lang/String;)Lorg/d/a/c;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 584
    invoke-direct {p0, v2}, Lkik/a/f/d/a/b;->a(Z)V

    .line 585
    iget-object v0, p0, Lkik/a/f/d/a/b;->h:[Z

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    aput-boolean v2, v0, v1

    .line 586
    const/4 v0, -0x1

    invoke-direct {p0, p1, v0}, Lkik/a/f/d/a/b;->a(Ljava/lang/String;I)V

    .line 587
    return-object p0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Lorg/d/a/c;
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 411
    invoke-direct {p0, v1}, Lkik/a/f/d/a/b;->a(Z)V

    .line 416
    iget-object v0, p0, Lkik/a/f/d/a/b;->h:[Z

    iget v2, p0, Lkik/a/f/d/a/b;->d:I

    aget-boolean v0, v0, v2

    if-eqz v0, :cond_0

    .line 417
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const-string v2, "\r\n"

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    move v0, v1

    .line 418
    :goto_0
    iget v2, p0, Lkik/a/f/d/a/b;->d:I

    if-ge v0, v2, :cond_0

    .line 419
    iget-object v2, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const-string v3, "  "

    invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 418
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 423
    :cond_0
    iget v0, p0, Lkik/a/f/d/a/b;->d:I

    mul-int/lit8 v2, v0, 0x3

    .line 425
    iget-object v0, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v3, v2, 0x3

    if-ge v0, v3, :cond_1

    .line 426
    iget-object v0, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v0, v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    .line 427
    iget-object v3, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 428
    iput-object v0, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    .line 431
    :cond_1
    if-nez p1, :cond_2

    const-string v0, ""

    .line 433
    :goto_1
    const-string v1, ""

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 434
    iget-object v1, p0, Lkik/a/f/d/a/b;->f:[I

    iget v3, p0, Lkik/a/f/d/a/b;->d:I

    aget v1, v1, v3

    :goto_2
    iget-object v3, p0, Lkik/a/f/d/a/b;->f:[I

    iget v4, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v4, v4, 0x1

    aget v3, v3, v4

    if-ge v1, v3, :cond_4

    .line 435
    const-string v3, ""

    iget-object v4, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    mul-int/lit8 v5, v1, 0x2

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, ""

    iget-object v4, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    mul-int/lit8 v5, v1, 0x2

    add-int/lit8 v5, v5, 0x1

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 436
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot set default namespace for elements in no namespace"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 431
    :cond_2
    invoke-direct {p0, p1, v6, v6}, Lkik/a/f/d/a/b;->a(Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 434
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 441
    :cond_4
    iget-object v1, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    add-int/lit8 v3, v2, 0x1

    aput-object p1, v1, v2

    .line 442
    iget-object v1, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    add-int/lit8 v2, v3, 0x1

    aput-object v0, v1, v3

    .line 443
    iget-object v1, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    aput-object p2, v1, v2

    .line 445
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const/16 v2, 0x3c

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 446
    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 447
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 448
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 451
    :cond_5
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 453
    iput-boolean v6, p0, Lkik/a/f/d/a/b;->b:Z

    .line 455
    return-object p0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 513
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/a/f/d/a/b;->a(Z)V

    .line 514
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 515
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Lorg/d/a/c;
    .locals 4

    .prologue
    .line 527
    iget-boolean v0, p0, Lkik/a/f/d/a/b;->b:Z

    if-nez v0, :cond_0

    .line 528
    iget v0, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lkik/a/f/d/a/b;->d:I

    .line 533
    :cond_0
    if-nez p1, :cond_1

    iget-object v0, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    mul-int/lit8 v1, v1, 0x3

    aget-object v0, v0, v1

    if-nez v0, :cond_3

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    mul-int/lit8 v1, v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 534
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "</{"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "> does not match start"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 537
    :cond_4
    iget-boolean v0, p0, Lkik/a/f/d/a/b;->b:Z

    if-eqz v0, :cond_5

    .line 538
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkik/a/f/d/a/b;->a(Z)V

    .line 539
    iget v0, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lkik/a/f/d/a/b;->d:I

    .line 559
    :goto_0
    iget-object v0, p0, Lkik/a/f/d/a/b;->f:[I

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lkik/a/f/d/a/b;->f:[I

    iget v3, p0, Lkik/a/f/d/a/b;->d:I

    aget v2, v2, v3

    aput v2, v0, v1

    .line 560
    return-object p0

    .line 542
    :cond_5
    iget-object v0, p0, Lkik/a/f/d/a/b;->h:[Z

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v1, v1, 0x1

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_6

    .line 543
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 544
    const/4 v0, 0x0

    :goto_1
    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    if-ge v0, v1, :cond_6

    .line 545
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 544
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 549
    :cond_6
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const-string v1, "</"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 550
    iget-object v0, p0, Lkik/a/f/d/a/b;->e:[Ljava/lang/String;

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    .line 551
    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 552
    iget-object v1, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 553
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 555
    :cond_7
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    invoke-virtual {v0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 556
    iget-object v0, p0, Lkik/a/f/d/a/b;->a:Ljava/io/Writer;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    goto :goto_0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 318
    invoke-direct {p0, v4}, Lkik/a/f/d/a/b;->a(Z)V

    .line 319
    if-nez p1, :cond_0

    .line 320
    const-string p1, ""

    .line 322
    :cond_0
    if-nez p2, :cond_1

    .line 323
    const-string p2, ""

    .line 326
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, p2, v0, v4}, Lkik/a/f/d/a/b;->a(Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    .line 330
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 344
    :goto_0
    return-void

    .line 334
    :cond_2
    iget-object v0, p0, Lkik/a/f/d/a/b;->f:[I

    iget v1, p0, Lkik/a/f/d/a/b;->d:I

    add-int/lit8 v1, v1, 0x1

    aget v2, v0, v1

    add-int/lit8 v3, v2, 0x1

    aput v3, v0, v1

    shl-int/lit8 v0, v2, 0x1

    .line 336
    iget-object v1, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v2, v0, 0x1

    if-ge v1, v2, :cond_3

    .line 337
    iget-object v1, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, 0x10

    new-array v1, v1, [Ljava/lang/String;

    .line 338
    iget-object v2, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    invoke-static {v2, v4, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 339
    iput-object v1, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    .line 342
    :cond_3
    iget-object v1, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    add-int/lit8 v2, v0, 0x1

    aput-object p1, v1, v0

    .line 343
    iget-object v0, p0, Lkik/a/f/d/a/b;->g:[Ljava/lang/String;

    aput-object p2, v0, v2

    goto :goto_0
.end method
