.class public final Lcom/a/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static i:Ljava/lang/String;

.field private static j:Lcom/a/c/b;


# instance fields
.field a:I

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:Z

.field h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const-string v0, "CPUInfo"

    sput-object v0, Lcom/a/c/b;->i:Ljava/lang/String;

    .line 17
    const/4 v0, 0x0

    sput-object v0, Lcom/a/c/b;->j:Lcom/a/c/b;

    .line 59
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    return-void
.end method

.method private static a(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 134
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_1

    .line 135
    :cond_0
    const/4 v0, -0x1

    .line 139
    :goto_0
    return v0

    .line 136
    :cond_1
    const-string v0, "0x"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 137
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_0

    .line 139
    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method private static a(C)Z
    .locals 1

    .prologue
    .line 143
    const/16 v0, 0x20

    if-eq p0, v0, :cond_0

    const/16 v0, 0xd

    if-eq p0, v0, :cond_0

    const/16 v0, 0xa

    if-eq p0, v0, :cond_0

    const/16 v0, 0x9

    if-ne p0, v0, :cond_1

    .line 144
    :cond_0
    const/4 v0, 0x1

    .line 146
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a()[I
    .locals 6

    .prologue
    const/16 v5, 0x1e0

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 74
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 75
    invoke-static {}, Lcom/a/c/b;->b()Lcom/a/c/b;

    move-result-object v1

    iget v1, v1, Lcom/a/c/b;->f:I

    const/16 v2, 0x2003

    if-eq v1, v2, :cond_0

    .line 76
    invoke-static {}, Lcom/a/c/b;->b()Lcom/a/c/b;

    move-result-object v1

    iget v1, v1, Lcom/a/c/b;->f:I

    const/16 v2, 0x2004

    if-ne v1, v2, :cond_1

    .line 77
    :cond_0
    const/16 v1, 0x320

    aput v1, v0, v3

    .line 78
    aput v5, v0, v4

    .line 95
    :goto_0
    return-object v0

    .line 80
    :cond_1
    invoke-static {}, Lcom/a/c/b;->b()Lcom/a/c/b;

    move-result-object v1

    iget v1, v1, Lcom/a/c/b;->f:I

    const v2, 0x20005

    if-eq v1, v2, :cond_2

    .line 81
    invoke-static {}, Lcom/a/c/b;->b()Lcom/a/c/b;

    move-result-object v1

    iget v1, v1, Lcom/a/c/b;->f:I

    const v2, 0x20006

    if-ne v1, v2, :cond_3

    .line 82
    :cond_2
    const/16 v1, 0x356

    aput v1, v0, v3

    .line 83
    aput v5, v0, v4

    goto :goto_0

    .line 85
    :cond_3
    invoke-static {}, Lcom/a/c/b;->b()Lcom/a/c/b;

    move-result-object v1

    iget v1, v1, Lcom/a/c/b;->f:I

    const/16 v2, 0x2007

    if-eq v1, v2, :cond_4

    .line 86
    invoke-static {}, Lcom/a/c/b;->b()Lcom/a/c/b;

    move-result-object v1

    iget v1, v1, Lcom/a/c/b;->f:I

    const/16 v2, 0x2008

    if-eq v1, v2, :cond_4

    .line 87
    invoke-static {}, Lcom/a/c/b;->b()Lcom/a/c/b;

    move-result-object v1

    iget v1, v1, Lcom/a/c/b;->f:I

    const/16 v2, 0x200a

    if-eq v1, v2, :cond_4

    .line 88
    invoke-static {}, Lcom/a/c/b;->b()Lcom/a/c/b;

    move-result-object v1

    iget v1, v1, Lcom/a/c/b;->f:I

    const/16 v2, 0x2009

    if-ne v1, v2, :cond_5

    .line 89
    :cond_4
    const/16 v1, 0x280

    aput v1, v0, v3

    .line 90
    aput v5, v0, v4

    goto :goto_0

    .line 95
    :cond_5
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static b()Lcom/a/c/b;
    .locals 10

    .prologue
    const/4 v2, -0x1

    const/4 v9, 0x4

    const/4 v3, 0x0

    const/16 v0, 0x2000

    .line 66
    sget-object v1, Lcom/a/c/b;->j:Lcom/a/c/b;

    if-nez v1, :cond_0

    .line 67
    new-instance v4, Lcom/a/c/b;

    invoke-direct {v4}, Lcom/a/c/b;-><init>()V

    .line 68
    sput-object v4, Lcom/a/c/b;->j:Lcom/a/c/b;

    .line 1100
    :try_start_0
    invoke-static {}, Lcom/a/c/b;->c()Ljava/lang/String;

    move-result-object v1

    .line 1254
    if-nez v1, :cond_1

    .line 1255
    sget-object v0, Lcom/a/c/b;->i:Ljava/lang/String;

    const-string v1, "Invalid param for parse cpu info"

    invoke-static {v0, v1}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    :cond_0
    :goto_0
    sget-object v0, Lcom/a/c/b;->j:Lcom/a/c/b;

    return-object v0

    .line 1258
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v5, "\\n"

    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 1259
    if-eqz v5, :cond_2

    array-length v1, v5

    if-nez v1, :cond_3

    .line 1260
    :cond_2
    sget-object v0, Lcom/a/c/b;->i:Ljava/lang/String;

    const-string v1, "Invalid param for parse cpu info"

    invoke-static {v0, v1}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 1102
    :catch_0
    move-exception v0

    sget-object v0, Lcom/a/c/b;->i:Ljava/lang/String;

    const-string v1, "CPU Info Parse failed"

    invoke-static {v0, v1}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move v1, v3

    .line 1269
    :goto_1
    :try_start_2
    array-length v6, v5

    if-lt v1, v6, :cond_5

    .line 2234
    const/16 v1, 0x51

    iget v5, v4, Lcom/a/c/b;->a:I

    if-ne v1, v5, :cond_f

    move v1, v0

    .line 2247
    :goto_2
    if-ne v1, v0, :cond_1d

    .line 3177
    const/4 v1, 0x0

    .line 3180
    iget-object v5, v4, Lcom/a/c/b;->h:Ljava/lang/String;

    if-nez v5, :cond_13

    .line 1308
    :cond_4
    :goto_3
    iput v0, v4, Lcom/a/c/b;->f:I

    goto :goto_0

    .line 1270
    :cond_5
    aget-object v6, v5, v1

    if-eqz v6, :cond_6

    aget-object v6, v5, v1

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_6

    .line 1273
    aget-object v6, v5, v1

    const-string v7, "features"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 1274
    aget-object v6, v5, v1

    const-string v7, "neon"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 1275
    const/4 v6, 0x1

    iput-boolean v6, v4, Lcom/a/c/b;->g:Z

    .line 1269
    :cond_6
    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1277
    :cond_7
    const/4 v6, 0x0

    iput-boolean v6, v4, Lcom/a/c/b;->g:Z

    goto :goto_4

    .line 1278
    :cond_8
    aget-object v6, v5, v1

    const-string v7, "cpu implementer"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 1279
    aget-object v6, v5, v1

    aget-object v7, v5, v1

    .line 1280
    const/16 v8, 0x3a

    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    .line 1279
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/a/c/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1281
    invoke-static {v6}, Lcom/a/c/b;->a(Ljava/lang/String;)I

    move-result v6

    iput v6, v4, Lcom/a/c/b;->a:I

    goto :goto_4

    .line 1282
    :cond_9
    aget-object v6, v5, v1

    const-string v7, "cpu architecture"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 1283
    aget-object v6, v5, v1

    aget-object v7, v5, v1

    .line 1284
    const/16 v8, 0x3a

    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    .line 1283
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/a/c/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1285
    invoke-static {v6}, Lcom/a/c/b;->a(Ljava/lang/String;)I

    move-result v6

    iput v6, v4, Lcom/a/c/b;->b:I

    goto :goto_4

    .line 1286
    :cond_a
    aget-object v6, v5, v1

    const-string v7, "cpu variant"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 1287
    aget-object v6, v5, v1

    aget-object v7, v5, v1

    .line 1288
    const/16 v8, 0x3a

    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    .line 1287
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/a/c/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1289
    invoke-static {v6}, Lcom/a/c/b;->a(Ljava/lang/String;)I

    move-result v6

    iput v6, v4, Lcom/a/c/b;->c:I

    goto :goto_4

    .line 1290
    :cond_b
    aget-object v6, v5, v1

    const-string v7, "cpu part"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 1291
    aget-object v6, v5, v1

    aget-object v7, v5, v1

    .line 1292
    const/16 v8, 0x3a

    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    .line 1291
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/a/c/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1293
    invoke-static {v6}, Lcom/a/c/b;->a(Ljava/lang/String;)I

    move-result v6

    iput v6, v4, Lcom/a/c/b;->d:I

    goto/16 :goto_4

    .line 1294
    :cond_c
    aget-object v6, v5, v1

    const-string v7, "cpu revision"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 1295
    aget-object v6, v5, v1

    aget-object v7, v5, v1

    .line 1296
    const/16 v8, 0x3a

    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    .line 1295
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/a/c/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1297
    invoke-static {v6}, Lcom/a/c/b;->a(Ljava/lang/String;)I

    move-result v6

    iput v6, v4, Lcom/a/c/b;->e:I

    goto/16 :goto_4

    .line 1298
    :cond_d
    aget-object v6, v5, v1

    const-string v7, "hardware"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_e

    .line 1299
    aget-object v6, v5, v1

    aget-object v7, v5, v1

    .line 1300
    const/16 v8, 0x3a

    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    .line 1299
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/a/c/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/a/c/b;->h:Ljava/lang/String;

    goto/16 :goto_4

    .line 1301
    :cond_e
    aget-object v6, v5, v1

    const-string v7, "revision"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_6

    .line 1304
    aget-object v6, v5, v1

    const-string v7, "serial"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    goto/16 :goto_4

    .line 2236
    :cond_f
    const/16 v1, 0x41

    iget v5, v4, Lcom/a/c/b;->a:I

    if-ne v1, v5, :cond_12

    .line 2237
    iget-object v1, v4, Lcom/a/c/b;->h:Ljava/lang/String;

    if-eqz v1, :cond_11

    .line 2238
    iget-object v1, v4, Lcom/a/c/b;->h:Ljava/lang/String;

    const-string v5, "msm"

    invoke-virtual {v1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_10

    iget-object v1, v4, Lcom/a/c/b;->h:Ljava/lang/String;

    const-string v5, "qualcomm"

    invoke-virtual {v1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_10

    iget-object v1, v4, Lcom/a/c/b;->h:Ljava/lang/String;

    .line 2239
    const-string v5, "qual"

    invoke-virtual {v1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_11

    :cond_10
    move v1, v0

    .line 2240
    goto/16 :goto_2

    .line 2242
    :cond_11
    const/16 v1, 0x1000

    .line 2243
    goto/16 :goto_2

    :cond_12
    const/16 v1, 0x69

    iget v5, v4, Lcom/a/c/b;->a:I

    if-ne v1, v5, :cond_1e

    .line 2244
    const/16 v1, 0x3000

    goto/16 :goto_2

    .line 3183
    :cond_13
    iget-object v5, v4, Lcom/a/c/b;->h:Ljava/lang/String;

    const-string v6, "msm"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_16

    .line 3184
    const-string v1, "msm"

    .line 3190
    :cond_14
    :goto_5
    if-eqz v1, :cond_4

    .line 3191
    iget-object v5, v4, Lcom/a/c/b;->h:Ljava/lang/String;

    iget-object v6, v4, Lcom/a/c/b;->h:Ljava/lang/String;

    .line 3192
    invoke-virtual {v6, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 3191
    invoke-virtual {v5, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/a/c/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move v1, v3

    .line 3194
    :goto_6
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v1, v3, :cond_18

    move v1, v2

    .line 3203
    :cond_15
    if-eq v1, v2, :cond_4

    .line 3206
    invoke-virtual {v5, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 3207
    if-eqz v1, :cond_4

    .line 3210
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lt v2, v9, :cond_4

    .line 3212
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x37

    if-ne v2, v3, :cond_1c

    .line 3213
    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x35

    if-ne v2, v3, :cond_1a

    .line 3214
    const/16 v0, 0x2007

    .line 3215
    goto/16 :goto_3

    .line 3185
    :cond_16
    iget-object v5, v4, Lcom/a/c/b;->h:Ljava/lang/String;

    const-string v6, "qualcomm"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_17

    .line 3186
    const-string v1, "qualcomm"

    goto :goto_5

    .line 3187
    :cond_17
    iget-object v5, v4, Lcom/a/c/b;->h:Ljava/lang/String;

    const-string v6, "qual"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 3188
    const-string v1, "qual"

    goto :goto_5

    .line 3195
    :cond_18
    const/16 v3, 0x30

    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-gt v3, v6, :cond_19

    const/16 v3, 0x39

    invoke-virtual {v5, v1}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ge v3, v6, :cond_15

    .line 3194
    :cond_19
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 3215
    :cond_1a
    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x37

    if-ne v2, v3, :cond_4

    .line 3216
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v9, :cond_1b

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x61

    if-ne v0, v1, :cond_1b

    .line 3217
    const v0, 0x20005

    .line 3218
    goto/16 :goto_3

    .line 3219
    :cond_1b
    const/16 v0, 0x2003

    .line 3222
    goto/16 :goto_3

    :cond_1c
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_3

    :cond_1d
    move v0, v1

    goto/16 :goto_3

    :cond_1e
    move v1, v3

    goto/16 :goto_2
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 150
    .line 151
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_2

    :cond_0
    move-object p0, v2

    .line 173
    :cond_1
    :goto_0
    return-object p0

    .line 154
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    .line 157
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    move v1, v0

    .line 158
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-lt v0, v4, :cond_5

    .line 164
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_2
    if-gez v0, :cond_6

    .line 170
    :cond_4
    if-gt v1, v3, :cond_7

    move-object p0, v2

    .line 171
    goto :goto_0

    .line 159
    :cond_5
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lcom/a/c/b;->a(C)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 160
    add-int/lit8 v1, v0, 0x1

    .line 158
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 165
    :cond_6
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lcom/a/c/b;->a(C)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 164
    add-int/lit8 v3, v0, -0x1

    move v5, v3

    move v3, v0

    move v0, v5

    goto :goto_2

    .line 173
    :cond_7
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method private static c()Ljava/lang/String;
    .locals 6

    .prologue
    .line 114
    const/4 v1, 0x0

    .line 116
    const/4 v0, 0x2

    :try_start_0
    new-array v0, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "/system/bin/cat"

    aput-object v3, v0, v2

    const/4 v2, 0x1

    const-string v3, "/proc/cpuinfo"

    aput-object v3, v0, v2

    .line 117
    new-instance v2, Ljava/lang/ProcessBuilder;

    invoke-direct {v2, v0}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    .line 118
    invoke-virtual {v2}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v0

    .line 119
    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    .line 120
    const/16 v0, 0x400

    new-array v3, v0, [B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 121
    :goto_0
    :try_start_1
    invoke-virtual {v2, v3}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v4, -0x1

    if-ne v1, v4, :cond_0

    .line 125
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 130
    :goto_1
    return-object v0

    .line 122
    :cond_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v3}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v1, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 123
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v3}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_0

    .line 127
    :catch_0
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2
.end method
