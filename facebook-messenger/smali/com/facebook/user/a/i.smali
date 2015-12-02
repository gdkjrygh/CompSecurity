.class public abstract Lcom/facebook/user/a/i;
.super Ljava/lang/Object;
.source "NameLookupBuilder.java"


# static fields
.field private static f:[I

.field private static g:I


# instance fields
.field private final a:Lcom/facebook/user/a/l;

.field private final b:Lcom/facebook/user/a/n;

.field private c:[[Ljava/lang/String;

.field private d:Ljava/lang/StringBuilder;

.field private e:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/16 v1, 0x1e

    .line 26
    new-array v0, v1, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/facebook/user/a/i;->f:[I

    .line 60
    sput v1, Lcom/facebook/user/a/i;->g:I

    return-void

    .line 26
    :array_0
    .array-data 4
        0x1100
        0x1101
        0x0
        0x1102
        0x0
        0x0
        0x1103
        0x1104
        0x1105
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x1106
        0x1107
        0x1108
        0x0
        0x1109
        0x110a
        0x110b
        0x110c
        0x110d
        0x110e
        0x110f
        0x1110
        0x1111
        0x1112
    .end array-data
.end method

.method public constructor <init>(Lcom/facebook/user/a/l;Lcom/facebook/user/a/n;)V
    .locals 1

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, 0x4

    new-array v0, v0, [[Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/user/a/i;->c:[[Ljava/lang/String;

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/facebook/user/a/i;->d:Ljava/lang/StringBuilder;

    .line 24
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    .line 65
    iput-object p1, p0, Lcom/facebook/user/a/i;->a:Lcom/facebook/user/a/l;

    .line 66
    iput-object p2, p0, Lcom/facebook/user/a/i;->b:Lcom/facebook/user/a/n;

    .line 67
    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 267
    iget-object v1, p0, Lcom/facebook/user/a/i;->d:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 269
    :goto_0
    if-ge v0, p2, :cond_0

    .line 270
    iget-object v1, p0, Lcom/facebook/user/a/i;->d:Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 273
    :cond_0
    const/4 v0, 0x2

    iget-object v1, p0, Lcom/facebook/user/a/i;->d:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 274
    return-void
.end method

.method private a(Ljava/lang/String;II)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 281
    :goto_0
    if-ge p2, p3, :cond_2

    .line 282
    iget-object v0, p0, Lcom/facebook/user/a/i;->c:[[Ljava/lang/String;

    aget-object v7, v0, p2

    .line 283
    if-eqz v7, :cond_1

    .line 284
    iget-object v0, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aget-object v8, v0, p2

    move v6, v2

    .line 285
    :goto_1
    array-length v0, v7

    if-ge v6, v0, :cond_0

    .line 286
    iget-object v0, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aget-object v1, v7, v6

    aput-object v1, v0, p2

    move-object v0, p0

    move-object v1, p1

    move v3, p3

    move v4, v2

    move v5, v2

    .line 289
    invoke-direct/range {v0 .. v5}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;IIZZ)V

    .line 292
    add-int/lit8 v0, p2, 0x1

    invoke-direct {p0, p1, v0, p3}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;II)V

    .line 285
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_1

    .line 294
    :cond_0
    iget-object v0, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aput-object v8, v0, p2

    .line 281
    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 297
    :cond_2
    return-void
.end method

.method private a(Ljava/lang/String;IIZ)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 247
    iget-object v1, p0, Lcom/facebook/user/a/i;->d:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 249
    :goto_0
    if-ge v0, p2, :cond_1

    .line 250
    if-eqz v0, :cond_0

    .line 251
    iget-object v1, p0, Lcom/facebook/user/a/i;->d:Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 253
    :cond_0
    iget-object v1, p0, Lcom/facebook/user/a/i;->d:Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 256
    :cond_1
    iget-object v0, p0, Lcom/facebook/user/a/i;->d:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p3, v0}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 258
    if-eqz p4, :cond_2

    .line 259
    invoke-direct {p0, p1, p2}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;I)V

    .line 261
    :cond_2
    return-void
.end method

.method private a(Ljava/lang/String;IIZZ)V
    .locals 10

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 220
    if-ne p2, p3, :cond_2

    .line 221
    if-eqz p4, :cond_1

    move v0, v6

    :goto_0
    invoke-direct {p0, p1, p3, v0, p5}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;IIZ)V

    .line 240
    :cond_0
    return-void

    :cond_1
    move v0, v7

    .line 221
    goto :goto_0

    .line 229
    :cond_2
    iget-object v0, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aget-object v9, v0, p2

    move v8, p2

    .line 230
    :goto_1
    if-ge v8, p3, :cond_0

    .line 231
    iget-object v0, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aget-object v1, v1, v8

    aput-object v1, v0, p2

    .line 232
    iget-object v0, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aput-object v9, v0, v8

    .line 234
    add-int/lit8 v2, p2, 0x1

    if-eqz p4, :cond_3

    if-ne v8, p2, :cond_3

    move v4, v7

    :goto_2
    move-object v0, p0

    move-object v1, p1

    move v3, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;IIZZ)V

    .line 237
    iget-object v0, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aget-object v1, v1, p2

    aput-object v1, v0, v8

    .line 238
    iget-object v0, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aput-object v9, v0, p2

    .line 230
    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :cond_3
    move v4, v6

    .line 234
    goto :goto_2
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .prologue
    const/16 v7, 0x3131

    const v6, 0xac00

    const/4 v0, 0x0

    .line 154
    .line 158
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    .line 159
    iget-object v1, p0, Lcom/facebook/user/a/i;->d:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    move v1, v0

    .line 161
    :goto_0
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p2, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v1

    .line 162
    const/16 v4, 0x20

    if-ne v1, v4, :cond_2

    .line 194
    :goto_1
    if-lt v2, v3, :cond_7

    .line 198
    :cond_0
    :goto_2
    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 199
    const/4 v0, 0x7

    iget-object v1, p0, Lcom/facebook/user/a/i;->d:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/user/a/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 202
    :cond_1
    return-void

    .line 168
    :cond_2
    const/16 v4, 0x1100

    if-lt v1, v4, :cond_0

    const/16 v4, 0x1112

    if-le v1, v4, :cond_3

    if-lt v1, v7, :cond_0

    :cond_3
    const/16 v4, 0x314e

    if-le v1, v4, :cond_4

    if-lt v1, v6, :cond_0

    :cond_4
    const v4, 0xd7a3

    if-gt v1, v4, :cond_0

    .line 174
    if-lt v1, v6, :cond_6

    .line 178
    sub-int/2addr v1, v6

    div-int/lit16 v1, v1, 0x24c

    add-int/lit16 v1, v1, 0x1100

    .line 192
    :cond_5
    iget-object v4, p0, Lcom/facebook/user/a/i;->d:Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 193
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 179
    :cond_6
    if-lt v1, v7, :cond_5

    .line 182
    add-int/lit16 v4, v1, -0x3131

    sget v5, Lcom/facebook/user/a/i;->g:I

    if-ge v4, v5, :cond_0

    .line 186
    sget-object v4, Lcom/facebook/user/a/i;->f:[I

    add-int/lit16 v1, v1, -0x3131

    aget v1, v4, v1

    .line 187
    if-nez v1, :cond_5

    goto :goto_2

    :cond_7
    move v1, v2

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 145
    const/4 v0, 0x5

    if-ne p3, v0, :cond_0

    .line 146
    invoke-direct {p0, p1, p2}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .prologue
    .line 300
    invoke-static {}, Lcom/facebook/user/a/a;->a()Lcom/facebook/user/a/a;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lcom/facebook/user/a/a;->a(Ljava/lang/String;I)Ljava/util/Iterator;

    move-result-object v1

    .line 302
    if-eqz v1, :cond_0

    .line 303
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 304
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 305
    const/4 v2, 0x6

    invoke-virtual {p0, v0}, Lcom/facebook/user/a/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v2, v0}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;ILjava/lang/String;)V

    goto :goto_0

    .line 308
    :cond_0
    return-void
.end method


# virtual methods
.method protected abstract a(Ljava/lang/String;ILjava/lang/String;)V
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II)V
    .locals 8

    .prologue
    const/4 v3, 0x4

    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 103
    iput-object p3, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    move v0, v2

    .line 105
    :goto_0
    if-ge v0, p4, :cond_0

    .line 106
    iget-object v1, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aget-object v4, v4, v0

    invoke-virtual {p0, v4}, Lcom/facebook/user/a/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v0

    .line 105
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 109
    :cond_0
    if-le p4, v3, :cond_1

    move v1, v5

    .line 110
    :goto_1
    if-eqz v1, :cond_5

    .line 111
    invoke-direct {p0, p1, p4, v2, v5}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;IIZ)V

    .line 114
    iget-object v0, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    new-instance v4, Lcom/facebook/user/a/j;

    invoke-direct {v4, p0}, Lcom/facebook/user/a/j;-><init>(Lcom/facebook/user/a/i;)V

    invoke-static {v0, v2, p4, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 123
    iget-object v0, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aget-object v4, v0, v2

    move v0, v3

    .line 124
    :goto_2
    if-ge v0, p4, :cond_2

    .line 125
    iget-object v6, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    iget-object v7, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aget-object v7, v7, v0

    aput-object v7, v6, v2

    .line 126
    invoke-direct {p0, p1, v3}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;I)V

    .line 124
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_1
    move v1, v2

    .line 109
    goto :goto_1

    .line 128
    :cond_2
    iget-object v0, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aput-object v4, v0, v2

    :goto_3
    move v0, v2

    .line 134
    :goto_4
    if-ge v0, v3, :cond_3

    .line 135
    iget-object v4, p0, Lcom/facebook/user/a/i;->c:[[Ljava/lang/String;

    iget-object v6, p0, Lcom/facebook/user/a/i;->e:[Ljava/lang/String;

    aget-object v6, v6, v0

    invoke-virtual {p0, v6}, Lcom/facebook/user/a/i;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v0

    .line 134
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 138
    :cond_3
    if-nez v1, :cond_4

    move v4, v5

    :goto_5
    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;IIZZ)V

    .line 139
    invoke-direct {p0, p1, v2, v3}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;II)V

    .line 140
    invoke-direct {p0, p1, p2, p5}, Lcom/facebook/user/a/i;->b(Ljava/lang/String;Ljava/lang/String;I)V

    .line 141
    invoke-direct {p0, p1, p2, p5}, Lcom/facebook/user/a/i;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 142
    return-void

    :cond_4
    move v4, v2

    .line 138
    goto :goto_5

    :cond_5
    move v3, p4

    goto :goto_3
.end method

.method protected abstract b(Ljava/lang/String;)[Ljava/lang/String;
.end method

.method protected c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/facebook/user/a/i;->b:Lcom/facebook/user/a/n;

    invoke-interface {v0, p1}, Lcom/facebook/user/a/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
