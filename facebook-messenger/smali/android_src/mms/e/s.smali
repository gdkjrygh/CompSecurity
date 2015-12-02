.class public Landroid_src/mms/e/s;
.super Ljava/lang/Object;
.source "PduPart.java"


# static fields
.field static final a:[B

.field static final b:[B

.field static final c:[B


# instance fields
.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private e:Landroid/net/Uri;

.field private f:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 96
    const-string v0, "from-data"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    sput-object v0, Landroid_src/mms/e/s;->a:[B

    .line 97
    const-string v0, "attachment"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    sput-object v0, Landroid_src/mms/e/s;->b:[B

    .line 98
    const-string v0, "inline"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    sput-object v0, Landroid_src/mms/e/s;->c:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    .line 115
    iput-object v0, p0, Landroid_src/mms/e/s;->e:Landroid/net/Uri;

    .line 120
    iput-object v0, p0, Landroid_src/mms/e/s;->f:[B

    .line 128
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    .line 129
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .prologue
    .line 220
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x81

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    return-void
.end method

.method public a(Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 166
    iput-object p1, p0, Landroid_src/mms/e/s;->e:Landroid/net/Uri;

    .line 167
    return-void
.end method

.method public a([B)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 137
    if-nez p1, :cond_0

    .line 143
    :goto_0
    return-void

    .line 141
    :cond_0
    array-length v0, p1

    new-array v0, v0, [B

    iput-object v0, p0, Landroid_src/mms/e/s;->f:[B

    .line 142
    iget-object v0, p0, Landroid_src/mms/e/s;->f:[B

    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method public a()[B
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 151
    iget-object v0, p0, Landroid_src/mms/e/s;->f:[B

    if-nez v0, :cond_0

    .line 152
    const/4 v0, 0x0

    .line 157
    :goto_0
    return-object v0

    .line 155
    :cond_0
    iget-object v0, p0, Landroid_src/mms/e/s;->f:[B

    array-length v0, v0

    new-array v0, v0, [B

    .line 156
    iget-object v1, p0, Landroid_src/mms/e/s;->f:[B

    iget-object v2, p0, Landroid_src/mms/e/s;->f:[B

    array-length v2, v2

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method public b()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Landroid_src/mms/e/s;->e:Landroid/net/Uri;

    return-object v0
.end method

.method public b([B)V
    .locals 6

    .prologue
    const/16 v5, 0xc0

    const/16 v4, 0x3e

    const/16 v1, 0x3c

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 185
    if-eqz p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 186
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Content-Id may not be null or empty."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 190
    :cond_1
    array-length v0, p1

    if-le v0, v3, :cond_2

    aget-byte v0, p1, v2

    int-to-char v0, v0

    if-ne v0, v1, :cond_2

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, p1, v0

    int-to-char v0, v0

    if-ne v0, v4, :cond_2

    .line 193
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    :goto_0
    return-void

    .line 198
    :cond_2
    array-length v0, p1

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    .line 199
    aput-byte v1, v0, v2

    .line 200
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aput-byte v4, v0, v1

    .line 201
    array-length v1, p1

    invoke-static {p1, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 202
    iget-object v1, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public c([B)V
    .locals 2

    .prologue
    .line 244
    if-nez p1, :cond_0

    .line 245
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null content-location"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 248
    :cond_0
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x8e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    return-void
.end method

.method public c()[B
    .locals 2

    .prologue
    .line 211
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0xc0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    return-object v0
.end method

.method public d()I
    .locals 2

    .prologue
    .line 229
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x81

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 230
    if-nez v0, :cond_0

    .line 231
    const/4 v0, 0x0

    .line 233
    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method public d([B)V
    .locals 2

    .prologue
    .line 273
    if-nez p1, :cond_0

    .line 274
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null content-disposition"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 277
    :cond_0
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0xc5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    return-void
.end method

.method public e([B)V
    .locals 2

    .prologue
    .line 296
    if-nez p1, :cond_0

    .line 297
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null content-type"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 300
    :cond_0
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x91

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    return-void
.end method

.method public e()[B
    .locals 2

    .prologue
    .line 260
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x8e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    return-object v0
.end method

.method public f([B)V
    .locals 2

    .prologue
    .line 319
    if-nez p1, :cond_0

    .line 320
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null content-transfer-encoding"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 323
    :cond_0
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0xc8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    return-void
.end method

.method public f()[B
    .locals 2

    .prologue
    .line 286
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0xc5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    return-object v0
.end method

.method public g([B)V
    .locals 2

    .prologue
    .line 342
    if-nez p1, :cond_0

    .line 343
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null content-id"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 346
    :cond_0
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x97

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    return-void
.end method

.method public g()[B
    .locals 2

    .prologue
    .line 309
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x91

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    return-object v0
.end method

.method public h([B)V
    .locals 2

    .prologue
    .line 365
    if-nez p1, :cond_0

    .line 366
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null content-id"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 369
    :cond_0
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x98

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    return-void
.end method

.method public h()[B
    .locals 2

    .prologue
    .line 332
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0xc8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    return-object v0
.end method

.method public i()[B
    .locals 2

    .prologue
    .line 355
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x97

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    return-object v0
.end method

.method public j()[B
    .locals 2

    .prologue
    .line 378
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x98

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 3

    .prologue
    .line 385
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x97

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    .line 386
    if-nez v0, :cond_1

    .line 387
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x98

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    .line 389
    if-nez v0, :cond_1

    .line 390
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0x8e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    move-object v1, v0

    .line 394
    :goto_0
    if-nez v1, :cond_0

    .line 395
    iget-object v0, p0, Landroid_src/mms/e/s;->d:Ljava/util/Map;

    const/16 v1, 0xc0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    .line 396
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cid:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 398
    :goto_1
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    goto :goto_1

    :cond_1
    move-object v1, v0

    goto :goto_0
.end method
