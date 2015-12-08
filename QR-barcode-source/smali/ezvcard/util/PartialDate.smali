.class public final Lezvcard/util/PartialDate;
.super Ljava/lang/Object;
.source "PartialDate.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/util/PartialDate$Format;
    }
.end annotation


# static fields
.field private static final DATE:I = 0x2

.field private static final HOUR:I = 0x3

.field private static final MINUTE:I = 0x4

.field private static final MONTH:I = 0x1

.field private static final SECOND:I = 0x5

.field private static final SKIP:I = -0x1

.field private static final TIMEZONE_HOUR:I = 0x6

.field private static final TIMEZONE_MINUTE:I = 0x7

.field private static final YEAR:I = 0x0

.field private static final dateFormats:[Lezvcard/util/PartialDate$Format;

.field private static final timeFormats:[Lezvcard/util/PartialDate$Format;

.field private static final timezoneRegex:Ljava/lang/String; = "(([-+]\\d{1,2}):?(\\d{2})?)?"


# instance fields
.field final components:[Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .prologue
    const/4 v9, 0x5

    const/4 v8, 0x4

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 76
    const/4 v0, 0x6

    new-array v0, v0, [Lezvcard/util/PartialDate$Format;

    new-instance v1, Lezvcard/util/PartialDate$Format;

    const-string v2, "(\\d{4})"

    new-array v3, v6, [I

    aput v5, v3, v5

    invoke-direct {v1, v2, v3}, Lezvcard/util/PartialDate$Format;-><init>(Ljava/lang/String;[I)V

    aput-object v1, v0, v5

    new-instance v1, Lezvcard/util/PartialDate$Format;

    const-string v2, "(\\d{4})-(\\d{2})"

    new-array v3, v7, [I

    fill-array-data v3, :array_0

    invoke-direct {v1, v2, v3}, Lezvcard/util/PartialDate$Format;-><init>(Ljava/lang/String;[I)V

    aput-object v1, v0, v6

    new-instance v1, Lezvcard/util/PartialDate$Format;

    const-string v2, "(\\d{4})-?(\\d{2})-?(\\d{2})"

    const/4 v3, 0x3

    new-array v3, v3, [I

    fill-array-data v3, :array_1

    invoke-direct {v1, v2, v3}, Lezvcard/util/PartialDate$Format;-><init>(Ljava/lang/String;[I)V

    aput-object v1, v0, v7

    const/4 v1, 0x3

    new-instance v2, Lezvcard/util/PartialDate$Format;

    const-string v3, "--(\\d{2})-?(\\d{2})"

    new-array v4, v7, [I

    fill-array-data v4, :array_2

    invoke-direct {v2, v3, v4}, Lezvcard/util/PartialDate$Format;-><init>(Ljava/lang/String;[I)V

    aput-object v2, v0, v1

    new-instance v1, Lezvcard/util/PartialDate$Format;

    const-string v2, "--(\\d{2})"

    new-array v3, v6, [I

    aput v6, v3, v5

    invoke-direct {v1, v2, v3}, Lezvcard/util/PartialDate$Format;-><init>(Ljava/lang/String;[I)V

    aput-object v1, v0, v8

    new-instance v1, Lezvcard/util/PartialDate$Format;

    const-string v2, "---(\\d{2})"

    new-array v3, v6, [I

    aput v7, v3, v5

    invoke-direct {v1, v2, v3}, Lezvcard/util/PartialDate$Format;-><init>(Ljava/lang/String;[I)V

    aput-object v1, v0, v9

    sput-object v0, Lezvcard/util/PartialDate;->dateFormats:[Lezvcard/util/PartialDate$Format;

    .line 89
    const/4 v0, 0x6

    new-array v0, v0, [Lezvcard/util/PartialDate$Format;

    new-instance v1, Lezvcard/util/PartialDate$Format;

    const-string v2, "(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?"

    new-array v3, v8, [I

    fill-array-data v3, :array_3

    invoke-direct {v1, v2, v3}, Lezvcard/util/PartialDate$Format;-><init>(Ljava/lang/String;[I)V

    aput-object v1, v0, v5

    new-instance v1, Lezvcard/util/PartialDate$Format;

    const-string v2, "(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?"

    new-array v3, v9, [I

    fill-array-data v3, :array_4

    invoke-direct {v1, v2, v3}, Lezvcard/util/PartialDate$Format;-><init>(Ljava/lang/String;[I)V

    aput-object v1, v0, v6

    new-instance v1, Lezvcard/util/PartialDate$Format;

    const-string v2, "(\\d{2}):?(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?"

    const/4 v3, 0x6

    new-array v3, v3, [I

    fill-array-data v3, :array_5

    invoke-direct {v1, v2, v3}, Lezvcard/util/PartialDate$Format;-><init>(Ljava/lang/String;[I)V

    aput-object v1, v0, v7

    const/4 v1, 0x3

    new-instance v2, Lezvcard/util/PartialDate$Format;

    const-string v3, "-(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?"

    new-array v4, v9, [I

    fill-array-data v4, :array_6

    invoke-direct {v2, v3, v4}, Lezvcard/util/PartialDate$Format;-><init>(Ljava/lang/String;[I)V

    aput-object v2, v0, v1

    new-instance v1, Lezvcard/util/PartialDate$Format;

    const-string v2, "-(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?"

    new-array v3, v8, [I

    fill-array-data v3, :array_7

    invoke-direct {v1, v2, v3}, Lezvcard/util/PartialDate$Format;-><init>(Ljava/lang/String;[I)V

    aput-object v1, v0, v8

    new-instance v1, Lezvcard/util/PartialDate$Format;

    const-string v2, "--(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?"

    new-array v3, v8, [I

    fill-array-data v3, :array_8

    invoke-direct {v1, v2, v3}, Lezvcard/util/PartialDate$Format;-><init>(Ljava/lang/String;[I)V

    aput-object v1, v0, v9

    sput-object v0, Lezvcard/util/PartialDate;->timeFormats:[Lezvcard/util/PartialDate$Format;

    return-void

    .line 76
    nop

    :array_0
    .array-data 4
        0x0
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x1
        0x2
    .end array-data

    :array_2
    .array-data 4
        0x1
        0x2
    .end array-data

    .line 89
    :array_3
    .array-data 4
        0x3
        -0x1
        0x6
        0x7
    .end array-data

    :array_4
    .array-data 4
        0x3
        0x4
        -0x1
        0x6
        0x7
    .end array-data

    :array_5
    .array-data 4
        0x3
        0x4
        0x5
        -0x1
        0x6
        0x7
    .end array-data

    :array_6
    .array-data 4
        0x4
        0x5
        -0x1
        0x6
        0x7
    .end array-data

    :array_7
    .array-data 4
        0x4
        -0x1
        0x6
        0x7
    .end array-data

    :array_8
    .array-data 4
        0x5
        -0x1
        0x6
        0x7
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lezvcard/util/UtcOffset;)V
    .locals 5
    .param p1, "year"    # Ljava/lang/Integer;
    .param p2, "month"    # Ljava/lang/Integer;
    .param p3, "date"    # Ljava/lang/Integer;
    .param p4, "hour"    # Ljava/lang/Integer;
    .param p5, "minute"    # Ljava/lang/Integer;
    .param p6, "second"    # Ljava/lang/Integer;
    .param p7, "offset"    # Lezvcard/util/UtcOffset;

    .prologue
    const/4 v1, 0x0

    const/16 v4, 0x3b

    const/4 v3, 0x1

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Integer;

    iput-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    .line 250
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lt v0, v3, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0xc

    if-le v0, v2, :cond_1

    .line 251
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Month must be between 1 and 12 inclusive."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 253
    :cond_1
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lt v0, v3, :cond_2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x1f

    if-le v0, v2, :cond_3

    .line 254
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Date must be between 1 and 31 inclusive."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 256
    :cond_3
    if-eqz p4, :cond_5

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x17

    if-le v0, v2, :cond_5

    .line 257
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Hour must be between 0 and 23 inclusive."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 259
    :cond_5
    if-eqz p5, :cond_7

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_6

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le v0, v4, :cond_7

    .line 260
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Minute must be between 0 and 59 inclusive."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 262
    :cond_7
    if-eqz p6, :cond_9

    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_8

    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le v0, v4, :cond_9

    .line 263
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Second must be between 0 and 59 inclusive."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 265
    :cond_9
    if-eqz p7, :cond_b

    invoke-virtual {p7}, Lezvcard/util/UtcOffset;->getMinute()I

    move-result v0

    if-ltz v0, :cond_a

    invoke-virtual {p7}, Lezvcard/util/UtcOffset;->getMinute()I

    move-result v0

    if-le v0, v4, :cond_b

    .line 266
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Timezone minute must be between 0 and 59 inclusive."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 270
    :cond_b
    if-eqz p1, :cond_c

    if-nez p2, :cond_c

    if-eqz p3, :cond_c

    .line 271
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid date component combination: year, date"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 273
    :cond_c
    if-eqz p4, :cond_d

    if-nez p5, :cond_d

    if-eqz p6, :cond_d

    .line 274
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid time component combination: hour, second"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 278
    :cond_d
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    .line 279
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    aput-object p2, v0, v3

    .line 280
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v2, 0x2

    aput-object p3, v0, v2

    .line 281
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v2, 0x3

    aput-object p4, v0, v2

    .line 282
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v2, 0x4

    aput-object p5, v0, v2

    .line 283
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v2, 0x5

    aput-object p6, v0, v2

    .line 284
    iget-object v2, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v3, 0x6

    if-nez p7, :cond_e

    move-object v0, v1

    :goto_0
    aput-object v0, v2, v3

    .line 285
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v2, 0x7

    if-nez p7, :cond_f

    :goto_1
    aput-object v1, v0, v2

    .line 286
    return-void

    .line 284
    :cond_e
    invoke-virtual {p7}, Lezvcard/util/UtcOffset;->getHour()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 285
    :cond_f
    invoke-virtual {p7}, Lezvcard/util/UtcOffset;->getMinute()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 5
    .param p1, "string"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 292
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    const/16 v3, 0x8

    new-array v3, v3, [Ljava/lang/Integer;

    iput-object v3, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    .line 293
    const-string v3, "T"

    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 295
    .local v0, "split":[Ljava/lang/String;
    array-length v3, v0

    if-ne v3, v2, :cond_2

    .line 297
    invoke-direct {p0, p1}, Lezvcard/util/PartialDate;->parseDate(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-direct {p0, p1}, Lezvcard/util/PartialDate;->parseTime(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    move v1, v2

    .line 306
    .local v1, "success":Z
    :cond_1
    :goto_0
    if-nez v1, :cond_5

    .line 307
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not parse date: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 298
    .end local v1    # "success":Z
    :cond_2
    aget-object v3, v0, v1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_3

    .line 300
    aget-object v2, v0, v2

    invoke-direct {p0, v2}, Lezvcard/util/PartialDate;->parseTime(Ljava/lang/String;)Z

    move-result v1

    .restart local v1    # "success":Z
    goto :goto_0

    .line 303
    .end local v1    # "success":Z
    :cond_3
    aget-object v3, v0, v1

    invoke-direct {p0, v3}, Lezvcard/util/PartialDate;->parseDate(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    aget-object v3, v0, v2

    invoke-direct {p0, v3}, Lezvcard/util/PartialDate;->parseTime(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v1, v2

    .restart local v1    # "success":Z
    :cond_4
    goto :goto_0

    .line 309
    :cond_5
    return-void
.end method

.method public static date(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lezvcard/util/PartialDate;
    .locals 8
    .param p0, "year"    # Ljava/lang/Integer;
    .param p1, "month"    # Ljava/lang/Integer;
    .param p2, "date"    # Ljava/lang/Integer;

    .prologue
    const/4 v4, 0x0

    .line 121
    new-instance v0, Lezvcard/util/PartialDate;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, v4

    move-object v6, v4

    move-object v7, v4

    invoke-direct/range {v0 .. v7}, Lezvcard/util/PartialDate;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lezvcard/util/UtcOffset;)V

    return-object v0
.end method

.method public static dateTime(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lezvcard/util/PartialDate;
    .locals 7
    .param p0, "year"    # Ljava/lang/Integer;
    .param p1, "month"    # Ljava/lang/Integer;
    .param p2, "date"    # Ljava/lang/Integer;
    .param p3, "hour"    # Ljava/lang/Integer;
    .param p4, "minute"    # Ljava/lang/Integer;
    .param p5, "second"    # Ljava/lang/Integer;

    .prologue
    .line 194
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v6}, Lezvcard/util/PartialDate;->dateTime(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lezvcard/util/UtcOffset;)Lezvcard/util/PartialDate;

    move-result-object v0

    return-object v0
.end method

.method public static dateTime(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lezvcard/util/UtcOffset;)Lezvcard/util/PartialDate;
    .locals 8
    .param p0, "year"    # Ljava/lang/Integer;
    .param p1, "month"    # Ljava/lang/Integer;
    .param p2, "date"    # Ljava/lang/Integer;
    .param p3, "hour"    # Ljava/lang/Integer;
    .param p4, "minute"    # Ljava/lang/Integer;
    .param p5, "second"    # Ljava/lang/Integer;
    .param p6, "offset"    # Lezvcard/util/UtcOffset;

    .prologue
    .line 222
    new-instance v0, Lezvcard/util/PartialDate;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lezvcard/util/PartialDate;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lezvcard/util/UtcOffset;)V

    return-object v0
.end method

.method private hasDate()Z
    .locals 1

    .prologue
    .line 362
    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getDate()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private hasHour()Z
    .locals 1

    .prologue
    .line 374
    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getHour()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private hasMinute()Z
    .locals 1

    .prologue
    .line 386
    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getMinute()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private hasMonth()Z
    .locals 1

    .prologue
    .line 350
    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getMonth()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private hasSecond()Z
    .locals 1

    .prologue
    .line 398
    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getSecond()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private hasTimezone()Z
    .locals 2

    .prologue
    .line 414
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private hasYear()Z
    .locals 1

    .prologue
    .line 338
    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getYear()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private parseDate(Ljava/lang/String;)Z
    .locals 5
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 312
    sget-object v0, Lezvcard/util/PartialDate;->dateFormats:[Lezvcard/util/PartialDate$Format;

    .local v0, "arr$":[Lezvcard/util/PartialDate$Format;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 313
    .local v3, "regex":Lezvcard/util/PartialDate$Format;
    invoke-virtual {v3, p0, p1}, Lezvcard/util/PartialDate$Format;->parse(Lezvcard/util/PartialDate;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 314
    const/4 v4, 0x1

    .line 317
    .end local v3    # "regex":Lezvcard/util/PartialDate$Format;
    :goto_1
    return v4

    .line 312
    .restart local v3    # "regex":Lezvcard/util/PartialDate$Format;
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 317
    .end local v3    # "regex":Lezvcard/util/PartialDate$Format;
    :cond_1
    const/4 v4, 0x0

    goto :goto_1
.end method

.method private parseTime(Ljava/lang/String;)Z
    .locals 5
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 321
    sget-object v0, Lezvcard/util/PartialDate;->timeFormats:[Lezvcard/util/PartialDate$Format;

    .local v0, "arr$":[Lezvcard/util/PartialDate$Format;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 322
    .local v3, "regex":Lezvcard/util/PartialDate$Format;
    invoke-virtual {v3, p0, p1}, Lezvcard/util/PartialDate$Format;->parse(Lezvcard/util/PartialDate;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 323
    const/4 v4, 0x1

    .line 326
    .end local v3    # "regex":Lezvcard/util/PartialDate$Format;
    :goto_1
    return v4

    .line 321
    .restart local v3    # "regex":Lezvcard/util/PartialDate$Format;
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 326
    .end local v3    # "regex":Lezvcard/util/PartialDate$Format;
    :cond_1
    const/4 v4, 0x0

    goto :goto_1
.end method

.method public static time(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lezvcard/util/PartialDate;
    .locals 1
    .param p0, "hour"    # Ljava/lang/Integer;
    .param p1, "minute"    # Ljava/lang/Integer;
    .param p2, "second"    # Ljava/lang/Integer;

    .prologue
    .line 143
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lezvcard/util/PartialDate;->time(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lezvcard/util/UtcOffset;)Lezvcard/util/PartialDate;

    move-result-object v0

    return-object v0
.end method

.method public static time(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lezvcard/util/UtcOffset;)Lezvcard/util/PartialDate;
    .locals 8
    .param p0, "hour"    # Ljava/lang/Integer;
    .param p1, "minute"    # Ljava/lang/Integer;
    .param p2, "second"    # Ljava/lang/Integer;
    .param p3, "offset"    # Lezvcard/util/UtcOffset;

    .prologue
    const/4 v1, 0x0

    .line 167
    new-instance v0, Lezvcard/util/PartialDate;

    move-object v2, v1

    move-object v3, v1

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lezvcard/util/PartialDate;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lezvcard/util/UtcOffset;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 509
    if-ne p0, p1, :cond_1

    .line 518
    :cond_0
    :goto_0
    return v1

    .line 511
    :cond_1
    if-nez p1, :cond_2

    move v1, v2

    .line 512
    goto :goto_0

    .line 513
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_3

    move v1, v2

    .line 514
    goto :goto_0

    :cond_3
    move-object v0, p1

    .line 515
    check-cast v0, Lezvcard/util/PartialDate;

    .line 516
    .local v0, "other":Lezvcard/util/PartialDate;
    iget-object v3, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    iget-object v4, v0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    move v1, v2

    .line 517
    goto :goto_0
.end method

.method public getDate()Ljava/lang/Integer;
    .locals 2

    .prologue
    .line 358
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getHour()Ljava/lang/Integer;
    .locals 2

    .prologue
    .line 370
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getMinute()Ljava/lang/Integer;
    .locals 2

    .prologue
    .line 382
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getMonth()Ljava/lang/Integer;
    .locals 2

    .prologue
    .line 346
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getSecond()Ljava/lang/Integer;
    .locals 2

    .prologue
    .line 394
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getTimezone()[Ljava/lang/Integer;
    .locals 4

    .prologue
    .line 407
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasTimezone()Z

    move-result v0

    if-nez v0, :cond_0

    .line 408
    const/4 v0, 0x0

    .line 410
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    iget-object v2, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    aput-object v2, v0, v1

    goto :goto_0
.end method

.method public getYear()Ljava/lang/Integer;
    .locals 2

    .prologue
    .line 334
    iget-object v0, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public hasDateComponent()Z
    .locals 1

    .prologue
    .line 422
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasYear()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMonth()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasDate()Z

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

.method public hasTimeComponent()Z
    .locals 1

    .prologue
    .line 430
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasHour()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMinute()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasSecond()Z

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

.method public hashCode()I
    .locals 3

    .prologue
    .line 501
    const/16 v0, 0x1f

    .line 502
    .local v0, "prime":I
    const/4 v1, 0x1

    .line 503
    .local v1, "result":I
    iget-object v2, p0, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v2

    add-int/lit8 v1, v2, 0x1f

    .line 504
    return v1
.end method

.method public toDateAndOrTime(Z)Ljava/lang/String;
    .locals 13
    .param p1, "extended"    # Z

    .prologue
    .line 439
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 440
    .local v6, "sb":Ljava/lang/StringBuilder;
    new-instance v5, Ljava/text/DecimalFormat;

    const-string v10, "00"

    invoke-direct {v5, v10}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 442
    .local v5, "nf":Ljava/text/NumberFormat;
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasYear()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getYear()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v9

    .line 443
    .local v9, "yearStr":Ljava/lang/String;
    :goto_0
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMonth()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getMonth()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/text/NumberFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 444
    .local v4, "monthStr":Ljava/lang/String;
    :goto_1
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasDate()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getDate()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/text/NumberFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 446
    .local v1, "dateStr":Ljava/lang/String;
    :goto_2
    if-eqz p1, :cond_7

    const-string v0, "-"

    .line 447
    .local v0, "dash":Ljava/lang/String;
    :goto_3
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasYear()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMonth()Z

    move-result v10

    if-nez v10, :cond_8

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasDate()Z

    move-result v10

    if-nez v10, :cond_8

    .line 448
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    :cond_0
    :goto_4
    invoke-virtual {p0}, Lezvcard/util/PartialDate;->hasTimeComponent()Z

    move-result v10

    if-eqz v10, :cond_3

    .line 464
    const/16 v10, 0x54

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 466
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasHour()Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getHour()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/text/NumberFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 467
    .local v2, "hourStr":Ljava/lang/String;
    :goto_5
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMinute()Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getMinute()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/text/NumberFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 468
    .local v3, "minuteStr":Ljava/lang/String;
    :goto_6
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasSecond()Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getSecond()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/text/NumberFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 470
    .local v7, "secondStr":Ljava/lang/String;
    :goto_7
    if-eqz p1, :cond_11

    const-string v0, ":"

    .line 471
    :goto_8
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasHour()Z

    move-result v10

    if-eqz v10, :cond_12

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMinute()Z

    move-result v10

    if-nez v10, :cond_12

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasSecond()Z

    move-result v10

    if-nez v10, :cond_12

    .line 472
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    :cond_1
    :goto_9
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasTimezone()Z

    move-result v10

    if-eqz v10, :cond_3

    .line 488
    invoke-virtual {p0}, Lezvcard/util/PartialDate;->getTimezone()[Ljava/lang/Integer;

    move-result-object v8

    .line 489
    .local v8, "timezone":[Ljava/lang/Integer;
    const/4 v10, 0x1

    aget-object v10, v8, v10

    if-nez v10, :cond_2

    .line 490
    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v8, v10

    .line 492
    :cond_2
    new-instance v10, Lezvcard/util/UtcOffset;

    const/4 v11, 0x0

    aget-object v11, v8, v11

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    const/4 v12, 0x1

    aget-object v12, v8, v12

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-direct {v10, v11, v12}, Lezvcard/util/UtcOffset;-><init>(II)V

    invoke-virtual {v10, p1}, Lezvcard/util/UtcOffset;->toString(Z)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .end local v2    # "hourStr":Ljava/lang/String;
    .end local v3    # "minuteStr":Ljava/lang/String;
    .end local v7    # "secondStr":Ljava/lang/String;
    .end local v8    # "timezone":[Ljava/lang/Integer;
    :cond_3
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    return-object v10

    .line 442
    .end local v0    # "dash":Ljava/lang/String;
    .end local v1    # "dateStr":Ljava/lang/String;
    .end local v4    # "monthStr":Ljava/lang/String;
    .end local v9    # "yearStr":Ljava/lang/String;
    :cond_4
    const/4 v9, 0x0

    goto/16 :goto_0

    .line 443
    .restart local v9    # "yearStr":Ljava/lang/String;
    :cond_5
    const/4 v4, 0x0

    goto/16 :goto_1

    .line 444
    .restart local v4    # "monthStr":Ljava/lang/String;
    :cond_6
    const/4 v1, 0x0

    goto/16 :goto_2

    .line 446
    .restart local v1    # "dateStr":Ljava/lang/String;
    :cond_7
    const-string v0, ""

    goto/16 :goto_3

    .line 449
    .restart local v0    # "dash":Ljava/lang/String;
    :cond_8
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasYear()Z

    move-result v10

    if-nez v10, :cond_9

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMonth()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasDate()Z

    move-result v10

    if-nez v10, :cond_9

    .line 450
    const-string v10, "--"

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    .line 451
    :cond_9
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasYear()Z

    move-result v10

    if-nez v10, :cond_a

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMonth()Z

    move-result v10

    if-nez v10, :cond_a

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasDate()Z

    move-result v10

    if-eqz v10, :cond_a

    .line 452
    const-string v10, "---"

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    .line 453
    :cond_a
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasYear()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMonth()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasDate()Z

    move-result v10

    if-nez v10, :cond_b

    .line 454
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "-"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    .line 455
    :cond_b
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasYear()Z

    move-result v10

    if-nez v10, :cond_c

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMonth()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasDate()Z

    move-result v10

    if-eqz v10, :cond_c

    .line 456
    const-string v10, "--"

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    .line 457
    :cond_c
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasYear()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMonth()Z

    move-result v10

    if-nez v10, :cond_d

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasDate()Z

    move-result v10

    if-eqz v10, :cond_d

    .line 458
    new-instance v10, Ljava/lang/IllegalStateException;

    const-string v11, "Invalid date component combination: year, date"

    invoke-direct {v10, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 459
    :cond_d
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasYear()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMonth()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasDate()Z

    move-result v10

    if-eqz v10, :cond_0

    .line 460
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    .line 466
    :cond_e
    const/4 v2, 0x0

    goto/16 :goto_5

    .line 467
    .restart local v2    # "hourStr":Ljava/lang/String;
    :cond_f
    const/4 v3, 0x0

    goto/16 :goto_6

    .line 468
    .restart local v3    # "minuteStr":Ljava/lang/String;
    :cond_10
    const/4 v7, 0x0

    goto/16 :goto_7

    .line 470
    .restart local v7    # "secondStr":Ljava/lang/String;
    :cond_11
    const-string v0, ""

    goto/16 :goto_8

    .line 473
    :cond_12
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasHour()Z

    move-result v10

    if-nez v10, :cond_13

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMinute()Z

    move-result v10

    if-eqz v10, :cond_13

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasSecond()Z

    move-result v10

    if-nez v10, :cond_13

    .line 474
    const-string v10, "-"

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_9

    .line 475
    :cond_13
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasHour()Z

    move-result v10

    if-nez v10, :cond_14

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMinute()Z

    move-result v10

    if-nez v10, :cond_14

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasSecond()Z

    move-result v10

    if-eqz v10, :cond_14

    .line 476
    const-string v10, "--"

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_9

    .line 477
    :cond_14
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasHour()Z

    move-result v10

    if-eqz v10, :cond_15

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMinute()Z

    move-result v10

    if-eqz v10, :cond_15

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasSecond()Z

    move-result v10

    if-nez v10, :cond_15

    .line 478
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_9

    .line 479
    :cond_15
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasHour()Z

    move-result v10

    if-nez v10, :cond_16

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMinute()Z

    move-result v10

    if-eqz v10, :cond_16

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasSecond()Z

    move-result v10

    if-eqz v10, :cond_16

    .line 480
    const-string v10, "-"

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_9

    .line 481
    :cond_16
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasHour()Z

    move-result v10

    if-eqz v10, :cond_17

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMinute()Z

    move-result v10

    if-nez v10, :cond_17

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasSecond()Z

    move-result v10

    if-eqz v10, :cond_17

    .line 482
    new-instance v10, Ljava/lang/IllegalStateException;

    const-string v11, "Invalid time component combination: hour, second"

    invoke-direct {v10, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 483
    :cond_17
    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasHour()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasMinute()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-direct {p0}, Lezvcard/util/PartialDate;->hasSecond()Z

    move-result v10

    if-eqz v10, :cond_1

    .line 484
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_9
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 523
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lezvcard/util/PartialDate;->toDateAndOrTime(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
