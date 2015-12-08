.class public final Lkik/a/h/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/a/a/b/b;

.field private static final b:Lorg/a/a/b/b;

.field private static final c:Lorg/a/a/b/b;

.field private static final d:Lorg/a/a/b/b;

.field private static final e:Lorg/a/a/b/b;

.field private static final f:Lorg/a/a/b/b;

.field private static final g:Ljava/util/List;

.field private static h:Ljava/util/Random;

.field private static i:Ljava/lang/StringBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const v2, 0x1f600

    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x1f64f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/a/a/b/b;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lorg/a/a/b/b;

    move-result-object v0

    sput-object v0, Lkik/a/h/i;->a:Lorg/a/a/b/b;

    .line 15
    const/16 v0, 0x2702

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x27b0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/a/a/b/b;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lorg/a/a/b/b;

    move-result-object v0

    sput-object v0, Lkik/a/h/i;->b:Lorg/a/a/b/b;

    .line 16
    const v0, 0x1f680

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x1f6c0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/a/a/b/b;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lorg/a/a/b/b;

    move-result-object v0

    sput-object v0, Lkik/a/h/i;->c:Lorg/a/a/b/b;

    .line 17
    const v0, 0x1f170

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x1f251

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/a/a/b/b;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lorg/a/a/b/b;

    move-result-object v0

    sput-object v0, Lkik/a/h/i;->d:Lorg/a/a/b/b;

    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x1f636

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/a/a/b/b;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lorg/a/a/b/b;

    move-result-object v0

    sput-object v0, Lkik/a/h/i;->e:Lorg/a/a/b/b;

    .line 19
    const v0, 0x1f300

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x1f5ff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/a/a/b/b;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lorg/a/a/b/b;

    move-result-object v0

    sput-object v0, Lkik/a/h/i;->f:Lorg/a/a/b/b;

    .line 21
    const/4 v0, 0x6

    new-array v0, v0, [Lorg/a/a/b/b;

    const/4 v1, 0x0

    sget-object v2, Lkik/a/h/i;->a:Lorg/a/a/b/b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lkik/a/h/i;->b:Lorg/a/a/b/b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lkik/a/h/i;->c:Lorg/a/a/b/b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lkik/a/h/i;->d:Lorg/a/a/b/b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lkik/a/h/i;->e:Lorg/a/a/b/b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lkik/a/h/i;->f:Lorg/a/a/b/b;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lkik/a/h/i;->g:Ljava/util/List;

    .line 25
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lkik/a/h/i;->h:Ljava/util/Random;

    .line 296
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    sput-object v0, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 354
    if-nez p0, :cond_0

    .line 355
    const-string p0, ""

    .line 357
    :cond_0
    if-nez p1, :cond_1

    .line 358
    const-string p1, ""

    .line 360
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static a()Ljava/lang/String;
    .locals 5

    .prologue
    const v4, 0xffff

    .line 211
    sget-object v1, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    monitor-enter v1

    .line 213
    :try_start_0
    sget-object v0, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 215
    sget-object v0, Lkik/a/h/i;->h:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    const/16 v2, 0x10

    invoke-static {v0, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    .line 216
    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 217
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 219
    :cond_0
    sget-object v2, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    const/16 v3, 0x8

    invoke-static {v0, v3}, Lkik/a/h/i;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 220
    sget-object v0, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    const/16 v2, 0x2d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 221
    sget-object v0, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    sget-object v2, Lkik/a/h/i;->h:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    move-result v2

    and-int/2addr v2, v4

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v2, v3}, Lkik/a/h/i;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 222
    sget-object v0, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    const/16 v2, 0x2d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 223
    sget-object v0, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    sget-object v2, Lkik/a/h/i;->h:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    move-result v2

    and-int/2addr v2, v4

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v2, v3}, Lkik/a/h/i;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 224
    sget-object v0, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    const/16 v2, 0x2d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 225
    sget-object v0, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    sget-object v2, Lkik/a/h/i;->h:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    move-result v2

    and-int/2addr v2, v4

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v2, v3}, Lkik/a/h/i;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 226
    sget-object v0, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    const/16 v2, 0x2d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 228
    sget-object v0, Lkik/a/h/i;->h:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v2

    const/16 v0, 0x10

    invoke-static {v2, v3, v0}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v0

    .line 229
    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 230
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 232
    :cond_1
    sget-object v2, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    const/16 v3, 0xc

    invoke-static {v0, v3}, Lkik/a/h/i;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    const/16 v4, 0xc

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 234
    sget-object v0, Lkik/a/h/i;->i:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 235
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static a(J)Ljava/lang/String;
    .locals 8

    .prologue
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v4, 0x4090000000000000L    # 1024.0

    .line 379
    invoke-static {}, Ljava/text/NumberFormat;->getNumberInstance()Ljava/text/NumberFormat;

    move-result-object v0

    .line 380
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 382
    const-wide/16 v2, 0x1f4

    cmp-long v1, p0, v2

    if-gez v1, :cond_0

    .line 383
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "B"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 393
    :goto_0
    return-object v0

    .line 385
    :cond_0
    const-wide/32 v2, 0x7d000

    cmp-long v1, p0, v2

    if-gez v1, :cond_1

    .line 386
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 387
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    long-to-double v2, p0

    mul-double/2addr v2, v6

    div-double/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "KB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 389
    :cond_1
    const-wide/32 v2, 0x1f400000

    cmp-long v1, p0, v2

    if-gez v1, :cond_2

    .line 390
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    long-to-double v2, p0

    mul-double/2addr v2, v6

    div-double/2addr v2, v4

    div-double/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "MB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 393
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    long-to-double v2, p0

    mul-double/2addr v2, v6

    div-double/2addr v2, v4

    div-double/2addr v2, v4

    div-double/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "GB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 173
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, p1, :cond_0

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "0"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 177
    :cond_0
    return-object p0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 5

    .prologue
    .line 55
    if-nez p0, :cond_0

    .line 56
    const-string v0, ""

    .line 65
    :goto_0
    return-object v0

    .line 58
    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 60
    const/4 v0, 0x0

    :goto_1
    array-length v2, p0

    if-ge v0, v2, :cond_1

    .line 62
    aget-byte v2, p0, v0

    .line 63
    const-string v3, "0123456789abcdef"

    and-int/lit16 v4, v2, 0xf0

    shr-int/lit8 v4, v4, 0x4

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move-result-object v3

    const-string v4, "0123456789abcdef"

    and-int/lit8 v2, v2, 0xf

    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 60
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/CharSequence;)Z
    .locals 1

    .prologue
    .line 365
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

.method public static a(Ljava/lang/String;)[B
    .locals 5

    .prologue
    .line 70
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    rem-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    new-array v1, v0, [B

    .line 72
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 73
    div-int/lit8 v2, v0, 0x2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v4, v0, 0x2

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    .line 72
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 76
    :cond_0
    return-object v1
.end method

.method public static b(Ljava/lang/String;)I
    .locals 2

    .prologue
    const/16 v0, 0x3e8

    .line 81
    .line 83
    if-eqz p0, :cond_0

    .line 85
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 92
    :cond_0
    :goto_0
    return v0

    .line 88
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    const/16 v1, 0xff

    .line 405
    if-nez p0, :cond_1

    .line 406
    const/4 p0, 0x0

    .line 413
    :cond_0
    :goto_0
    return-object p0

    .line 409
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v1, :cond_0

    .line 410
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/16 v3, 0xa

    const/4 v2, 0x0

    .line 431
    if-nez p0, :cond_1

    .line 439
    :cond_0
    :goto_0
    return-object v0

    .line 435
    :cond_1
    invoke-static {p0}, Lkik/a/h/i;->e(Ljava/lang/String;)I

    move-result v1

    if-gt v3, v1, :cond_0

    .line 439
    invoke-virtual {p0, v2, v2}, Ljava/lang/String;->offsetByCodePoints(II)I

    move-result v0

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->offsetByCodePoints(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static e(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 451
    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->codePointCount(II)I

    move-result v0

    return v0
.end method

.method public static f(Ljava/lang/String;)I
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 456
    move v1, v0

    move v2, v0

    .line 458
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 459
    invoke-virtual {p0, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    .line 460
    sget-object v0, Lkik/a/h/i;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/a/a/b/b;

    .line 461
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Lorg/a/a/b/b;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 462
    add-int/lit8 v2, v2, 0x1

    .line 467
    :cond_1
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    .line 468
    goto :goto_0

    .line 470
    :cond_2
    return v2
.end method
