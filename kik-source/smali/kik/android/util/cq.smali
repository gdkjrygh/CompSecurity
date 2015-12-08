.class public final Lkik/android/util/cq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/util/cq$a;
    }
.end annotation


# static fields
.field private static a:[Ljava/lang/String;

.field private static b:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lkik/android/util/cq;->b:Ljava/util/Random;

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 3

    .prologue
    .line 316
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const v2, 0x7f0900a6

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const v2, 0x7f0900a7

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const v2, 0x7f0900a8

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const v2, 0x7f0900a9

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const v2, 0x7f0900aa

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const v2, 0x7f0900ab

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 317
    sput-object v0, Lkik/android/util/cq;->a:[Ljava/lang/String;

    sget-object v1, Lkik/android/util/cq;->b:Ljava/util/Random;

    sget-object v2, Lkik/android/util/cq;->a:[Ljava/lang/String;

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 27
    :try_start_0
    const-string v0, "MD5"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 28
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 29
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 32
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 33
    const/4 v0, 0x0

    :goto_0
    array-length v3, v1

    if-ge v0, v3, :cond_0

    .line 34
    aget-byte v3, v1, v0

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 33
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 41
    :goto_1
    return-object v0

    .line 38
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    .line 41
    const-string v0, ""

    goto :goto_1
.end method

.method public static a(Ljava/util/List;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 280
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 281
    const v0, 0x7f0902b7

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    .line 306
    :goto_0
    return-object v0

    .line 284
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_3

    const/4 v0, 0x1

    move v1, v0

    .line 285
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x7

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 287
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    :goto_2
    if-ge v2, v4, :cond_5

    .line 288
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 290
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-lez v5, :cond_2

    .line 291
    if-nez v1, :cond_1

    add-int/lit8 v5, v4, -0x1

    if-ge v2, v5, :cond_4

    .line 292
    :cond_1
    const-string v5, ", "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    :goto_3
    add-int/lit8 v5, v4, -0x1

    if-ne v2, v5, :cond_2

    .line 299
    const-string v5, "and "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    :cond_2
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    move v1, v2

    .line 284
    goto :goto_1

    .line 295
    :cond_4
    const/16 v5, 0x20

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 306
    :cond_5
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/util/List;Lkik/a/e/r;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 266
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 267
    :cond_0
    const v0, 0x7f0902b7

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    .line 275
    :goto_0
    return-object v0

    .line 270
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 271
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 272
    const/4 v3, 0x1

    invoke-interface {p1, v0, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 275
    :cond_2
    invoke-static {v1}, Lkik/android/util/cq;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/util/List;Lkik/a/e/r;I)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 240
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 241
    :cond_0
    const v0, 0x7f0902b7

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    .line 261
    :goto_0
    return-object v0

    .line 244
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    const/4 v0, 0x0

    .line 247
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 248
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1, v0, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    if-lez p2, :cond_5

    add-int/lit8 v0, v1, 0x1

    if-ge v0, p2, :cond_2

    :goto_2
    move v1, v0

    .line 250
    goto :goto_1

    .line 254
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-le v0, v5, :cond_3

    .line 255
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const-string v3, ""

    invoke-virtual {v2, v0, v1, v3}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    :cond_3
    if-lez p2, :cond_4

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p2, :cond_4

    .line 258
    const-string v0, "..."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_2
.end method

.method public static a(Lkik/a/d/k;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 155
    invoke-virtual {p0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const v0, 0x7f090202

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkik/android/util/cq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Lkik/a/d/n;Lkik/a/e/r;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 208
    invoke-virtual {p0}, Lkik/a/d/n;->c()Ljava/lang/String;

    move-result-object v0

    .line 209
    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 210
    invoke-virtual {p0}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    .line 211
    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 212
    invoke-virtual {p0}, Lkik/a/d/n;->I()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 213
    invoke-virtual {p0}, Lkik/a/d/n;->J()Ljava/lang/String;

    move-result-object v0

    .line 223
    :cond_0
    :goto_0
    return-object v0

    .line 216
    :cond_1
    invoke-virtual {p0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v0, p1, v1}, Lkik/android/util/cq;->a(Ljava/util/List;Lkik/a/e/r;I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 6

    .prologue
    .line 339
    if-nez p0, :cond_0

    .line 340
    const-string v0, ""

    .line 346
    :goto_0
    return-object v0

    .line 342
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 343
    array-length v2, p0

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v2, :cond_1

    aget-byte v3, p0, v0

    .line 344
    const-string v4, "0123456789abcdef"

    and-int/lit16 v5, v3, 0xf0

    shr-int/lit8 v5, v5, 0x4

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "0123456789abcdef"

    and-int/lit8 v3, v3, 0xf

    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 343
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 346
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(JZ)Lkik/android/util/cq$a;
    .locals 12

    .prologue
    const-wide/32 v10, 0xea60

    const v9, 0x7f0900ad

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 52
    new-instance v2, Lkik/android/util/cq$a;

    invoke-direct {v2}, Lkik/android/util/cq$a;-><init>()V

    .line 53
    iput v6, v2, Lkik/android/util/cq$a;->b:I

    .line 54
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    sub-long/2addr v0, p0

    .line 55
    const-wide/32 v4, 0x1d4c0

    cmp-long v3, v0, v4

    if-gtz v3, :cond_1

    .line 56
    if-eqz p2, :cond_0

    .line 57
    const v0, 0x7f090197

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    :goto_0
    move-object v0, v2

    .line 110
    :goto_1
    return-object v0

    .line 60
    :cond_0
    const v0, 0x7f090196

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    goto :goto_0

    .line 64
    :cond_1
    const-wide/32 v4, 0x36ee80

    cmp-long v3, v0, v4

    if-gez v3, :cond_3

    .line 65
    if-eqz p2, :cond_2

    .line 66
    const v3, 0x7f09036f

    new-array v4, v7, [Ljava/lang/Object;

    div-long/2addr v0, v10

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v6

    invoke-static {v3, v4}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    :goto_2
    move-object v0, v2

    .line 71
    goto :goto_1

    .line 69
    :cond_2
    const v3, 0x7f09036e

    new-array v4, v7, [Ljava/lang/Object;

    div-long/2addr v0, v10

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v6

    invoke-static {v3, v4}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    goto :goto_2

    .line 73
    :cond_3
    const-wide/32 v4, 0x1ee62800

    cmp-long v0, v0, v4

    if-gez v0, :cond_7

    .line 74
    const-string v0, "h:mm aa"

    invoke-static {v0, p0, p1}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 75
    const-string v1, "E"

    invoke-static {v1, p0, p1}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 76
    const-string v3, "E"

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 77
    if-eqz p2, :cond_4

    .line 78
    iput-object v0, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    move-object v0, v2

    .line 79
    goto :goto_1

    .line 82
    :cond_4
    const v1, 0x7f09032e

    new-array v3, v7, [Ljava/lang/Object;

    aput-object v0, v3, v6

    invoke-static {v1, v3}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    .line 83
    iget-object v1, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lkik/android/util/cq$a;->b:I

    move-object v0, v2

    .line 84
    goto :goto_1

    .line 88
    :cond_5
    if-eqz p2, :cond_6

    .line 89
    iput-object v1, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    move-object v0, v2

    .line 90
    goto/16 :goto_1

    .line 93
    :cond_6
    new-array v3, v8, [Ljava/lang/Object;

    aput-object v1, v3, v6

    aput-object v0, v3, v7

    invoke-static {v9, v3}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    .line 94
    iget-object v1, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lkik/android/util/cq$a;->b:I

    move-object v0, v2

    .line 95
    goto/16 :goto_1

    .line 100
    :cond_7
    const-string v0, "M/d/yyyy"

    invoke-static {v0, p0, p1}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 101
    if-eqz p2, :cond_8

    .line 102
    iput-object v0, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    move-object v0, v2

    .line 103
    goto/16 :goto_1

    .line 107
    :cond_8
    const-string v1, "h:mm aa"

    invoke-static {v1, p0, p1}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 108
    new-array v3, v8, [Ljava/lang/Object;

    aput-object v0, v3, v6

    aput-object v1, v3, v7

    invoke-static {v9, v3}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    .line 109
    iget-object v0, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lkik/android/util/cq$a;->b:I

    move-object v0, v2

    .line 110
    goto/16 :goto_1
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 145
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 146
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 147
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 148
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 150
    :cond_0
    return-object v0
.end method

.method public static b(Lkik/a/d/k;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 173
    invoke-virtual {p0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 332
    if-eqz p0, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
