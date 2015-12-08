.class public Landroid/support/v4/util/TimeUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HUNDRED_DAY_FIELD_LEN:I = 0x13

.field private static final SECONDS_PER_DAY:I = 0x15180

.field private static final SECONDS_PER_HOUR:I = 0xe10

.field private static final SECONDS_PER_MINUTE:I = 0x3c

.field private static sFormatStr:[C

.field private static final sFormatSync:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroid/support/v4/util/TimeUtils;->sFormatSync:Ljava/lang/Object;

    .line 36
    const/16 v0, 0x18

    new-array v0, v0, [C

    sput-object v0, Landroid/support/v4/util/TimeUtils;->sFormatStr:[C

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static accumField(IIZI)I
    .locals 1

    .prologue
    .line 39
    const/16 v0, 0x63

    if-gt p0, v0, :cond_0

    if-eqz p2, :cond_1

    const/4 v0, 0x3

    if-lt p3, v0, :cond_1

    .line 40
    :cond_0
    add-int/lit8 v0, p1, 0x3

    .line 48
    :goto_0
    return v0

    .line 42
    :cond_1
    const/16 v0, 0x9

    if-gt p0, v0, :cond_2

    if-eqz p2, :cond_3

    const/4 v0, 0x2

    if-lt p3, v0, :cond_3

    .line 43
    :cond_2
    add-int/lit8 v0, p1, 0x2

    goto :goto_0

    .line 45
    :cond_3
    if-nez p2, :cond_4

    if-lez p0, :cond_5

    .line 46
    :cond_4
    add-int/lit8 v0, p1, 0x1

    goto :goto_0

    .line 48
    :cond_5
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static formatDuration(JJLjava/io/PrintWriter;)V
    .locals 4

    .prologue
    .line 169
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    .line 170
    const-string v0, "--"

    invoke-virtual {p4, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 174
    :goto_0
    return-void

    .line 173
    :cond_0
    sub-long v0, p0, p2

    const/4 v2, 0x0

    invoke-static {v0, v1, p4, v2}, Landroid/support/v4/util/TimeUtils;->formatDuration(JLjava/io/PrintWriter;I)V

    goto :goto_0
.end method

.method public static formatDuration(JLjava/io/PrintWriter;)V
    .locals 2

    .prologue
    .line 164
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Landroid/support/v4/util/TimeUtils;->formatDuration(JLjava/io/PrintWriter;I)V

    .line 165
    return-void
.end method

.method public static formatDuration(JLjava/io/PrintWriter;I)V
    .locals 6

    .prologue
    .line 156
    sget-object v1, Landroid/support/v4/util/TimeUtils;->sFormatSync:Ljava/lang/Object;

    monitor-enter v1

    .line 157
    :try_start_0
    invoke-static {p0, p1, p3}, Landroid/support/v4/util/TimeUtils;->formatDurationLocked(JI)I

    move-result v0

    .line 158
    new-instance v2, Ljava/lang/String;

    sget-object v3, Landroid/support/v4/util/TimeUtils;->sFormatStr:[C

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4, v0}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 159
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static formatDuration(JLjava/lang/StringBuilder;)V
    .locals 4

    .prologue
    .line 148
    sget-object v1, Landroid/support/v4/util/TimeUtils;->sFormatSync:Ljava/lang/Object;

    monitor-enter v1

    .line 149
    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0, p1, v0}, Landroid/support/v4/util/TimeUtils;->formatDurationLocked(JI)I

    move-result v0

    .line 150
    sget-object v2, Landroid/support/v4/util/TimeUtils;->sFormatStr:[C

    const/4 v3, 0x0

    invoke-virtual {p2, v2, v3, v0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 151
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static formatDurationLocked(JI)I
    .locals 18

    .prologue
    .line 76
    sget-object v2, Landroid/support/v4/util/TimeUtils;->sFormatStr:[C

    array-length v2, v2

    move/from16 v0, p2

    if-ge v2, v0, :cond_0

    .line 77
    move/from16 v0, p2

    new-array v2, v0, [C

    sput-object v2, Landroid/support/v4/util/TimeUtils;->sFormatStr:[C

    .line 80
    :cond_0
    sget-object v2, Landroid/support/v4/util/TimeUtils;->sFormatStr:[C

    .line 82
    const-wide/16 v4, 0x0

    cmp-long v3, p0, v4

    if-nez v3, :cond_2

    .line 84
    add-int/lit8 v3, p2, -0x1

    .line 85
    :goto_0
    if-lez v3, :cond_1

    .line 86
    const/4 v4, 0x0

    const/16 v5, 0x20

    aput-char v5, v2, v4

    goto :goto_0

    .line 88
    :cond_1
    const/4 v3, 0x0

    const/16 v4, 0x30

    aput-char v4, v2, v3

    .line 89
    const/4 v2, 0x1

    .line 143
    :goto_1
    return v2

    .line 93
    :cond_2
    const-wide/16 v4, 0x0

    cmp-long v3, p0, v4

    if-lez v3, :cond_4

    .line 94
    const/16 v3, 0x2b

    move v4, v3

    .line 100
    :goto_2
    const-wide/16 v6, 0x3e8

    rem-long v6, p0, v6

    long-to-int v0, v6

    move/from16 v16, v0

    .line 101
    const-wide/16 v6, 0x3e8

    div-long v6, p0, v6

    long-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-int v7, v6

    .line 102
    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 104
    const v8, 0x15180

    if-le v7, v8, :cond_3

    .line 105
    const v3, 0x15180

    div-int v3, v7, v3

    .line 106
    const v8, 0x15180

    mul-int/2addr v8, v3

    sub-int/2addr v7, v8

    .line 108
    :cond_3
    const/16 v8, 0xe10

    if-le v7, v8, :cond_14

    .line 109
    div-int/lit16 v6, v7, 0xe10

    .line 110
    mul-int/lit16 v8, v6, 0xe10

    sub-int/2addr v7, v8

    move v15, v6

    move v6, v7

    .line 112
    :goto_3
    const/16 v7, 0x3c

    if-le v6, v7, :cond_13

    .line 113
    div-int/lit8 v5, v6, 0x3c

    .line 114
    mul-int/lit8 v7, v5, 0x3c

    sub-int/2addr v6, v7

    move v13, v5

    move v14, v6

    .line 117
    :goto_4
    const/4 v6, 0x0

    .line 119
    if-eqz p2, :cond_9

    .line 120
    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static {v3, v5, v7, v8}, Landroid/support/v4/util/TimeUtils;->accumField(IIZI)I

    move-result v7

    .line 121
    const/4 v8, 0x1

    if-lez v7, :cond_5

    const/4 v5, 0x1

    :goto_5
    const/4 v9, 0x2

    invoke-static {v15, v8, v5, v9}, Landroid/support/v4/util/TimeUtils;->accumField(IIZI)I

    move-result v5

    add-int/2addr v7, v5

    .line 122
    const/4 v8, 0x1

    if-lez v7, :cond_6

    const/4 v5, 0x1

    :goto_6
    const/4 v9, 0x2

    invoke-static {v13, v8, v5, v9}, Landroid/support/v4/util/TimeUtils;->accumField(IIZI)I

    move-result v5

    add-int/2addr v7, v5

    .line 123
    const/4 v8, 0x1

    if-lez v7, :cond_7

    const/4 v5, 0x1

    :goto_7
    const/4 v9, 0x2

    invoke-static {v14, v8, v5, v9}, Landroid/support/v4/util/TimeUtils;->accumField(IIZI)I

    move-result v5

    add-int/2addr v7, v5

    .line 124
    const/4 v8, 0x2

    const/4 v9, 0x1

    if-lez v7, :cond_8

    const/4 v5, 0x3

    :goto_8
    move/from16 v0, v16

    invoke-static {v0, v8, v9, v5}, Landroid/support/v4/util/TimeUtils;->accumField(IIZI)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    add-int/2addr v5, v7

    move/from16 v17, v5

    move v5, v6

    move/from16 v6, v17

    .line 125
    :goto_9
    move/from16 v0, p2

    if-ge v6, v0, :cond_a

    .line 126
    const/16 v7, 0x20

    aput-char v7, v2, v5

    .line 127
    add-int/lit8 v7, v5, 0x1

    .line 128
    add-int/lit8 v5, v6, 0x1

    move v6, v5

    move v5, v7

    goto :goto_9

    .line 96
    :cond_4
    const/16 v3, 0x2d

    .line 97
    move-wide/from16 v0, p0

    neg-long v0, v0

    move-wide/from16 p0, v0

    move v4, v3

    goto/16 :goto_2

    .line 121
    :cond_5
    const/4 v5, 0x0

    goto :goto_5

    .line 122
    :cond_6
    const/4 v5, 0x0

    goto :goto_6

    .line 123
    :cond_7
    const/4 v5, 0x0

    goto :goto_7

    .line 124
    :cond_8
    const/4 v5, 0x0

    goto :goto_8

    :cond_9
    move v5, v6

    .line 132
    :cond_a
    aput-char v4, v2, v5

    .line 133
    add-int/lit8 v5, v5, 0x1

    .line 136
    if-eqz p2, :cond_b

    const/4 v4, 0x1

    move v12, v4

    .line 137
    :goto_a
    const/16 v4, 0x64

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Landroid/support/v4/util/TimeUtils;->printField([CICIZI)I

    move-result v9

    .line 138
    const/16 v8, 0x68

    if-eq v9, v5, :cond_c

    const/4 v10, 0x1

    :goto_b
    if-eqz v12, :cond_d

    const/4 v11, 0x2

    :goto_c
    move-object v6, v2

    move v7, v15

    invoke-static/range {v6 .. v11}, Landroid/support/v4/util/TimeUtils;->printField([CICIZI)I

    move-result v9

    .line 139
    const/16 v8, 0x6d

    if-eq v9, v5, :cond_e

    const/4 v10, 0x1

    :goto_d
    if-eqz v12, :cond_f

    const/4 v11, 0x2

    :goto_e
    move-object v6, v2

    move v7, v13

    invoke-static/range {v6 .. v11}, Landroid/support/v4/util/TimeUtils;->printField([CICIZI)I

    move-result v9

    .line 140
    const/16 v8, 0x73

    if-eq v9, v5, :cond_10

    const/4 v10, 0x1

    :goto_f
    if-eqz v12, :cond_11

    const/4 v11, 0x2

    :goto_10
    move-object v6, v2

    move v7, v14

    invoke-static/range {v6 .. v11}, Landroid/support/v4/util/TimeUtils;->printField([CICIZI)I

    move-result v8

    .line 141
    const/16 v4, 0x6d

    const/4 v6, 0x1

    if-eqz v12, :cond_12

    if-eq v8, v5, :cond_12

    const/4 v7, 0x3

    :goto_11
    move/from16 v3, v16

    move v5, v8

    invoke-static/range {v2 .. v7}, Landroid/support/v4/util/TimeUtils;->printField([CICIZI)I

    move-result v3

    .line 142
    const/16 v4, 0x73

    aput-char v4, v2, v3

    .line 143
    add-int/lit8 v2, v3, 0x1

    goto/16 :goto_1

    .line 136
    :cond_b
    const/4 v4, 0x0

    move v12, v4

    goto :goto_a

    .line 138
    :cond_c
    const/4 v10, 0x0

    goto :goto_b

    :cond_d
    const/4 v11, 0x0

    goto :goto_c

    .line 139
    :cond_e
    const/4 v10, 0x0

    goto :goto_d

    :cond_f
    const/4 v11, 0x0

    goto :goto_e

    .line 140
    :cond_10
    const/4 v10, 0x0

    goto :goto_f

    :cond_11
    const/4 v11, 0x0

    goto :goto_10

    .line 141
    :cond_12
    const/4 v7, 0x0

    goto :goto_11

    :cond_13
    move v13, v5

    move v14, v6

    goto/16 :goto_4

    :cond_14
    move v15, v6

    move v6, v7

    goto/16 :goto_3
.end method

.method private static printField([CICIZI)I
    .locals 4

    .prologue
    .line 53
    if-nez p4, :cond_0

    if-lez p1, :cond_6

    .line 55
    :cond_0
    if-eqz p4, :cond_1

    const/4 v0, 0x3

    if-ge p5, v0, :cond_2

    :cond_1
    const/16 v0, 0x63

    if-le p1, v0, :cond_7

    .line 56
    :cond_2
    div-int/lit8 v1, p1, 0x64

    .line 57
    add-int/lit8 v0, v1, 0x30

    int-to-char v0, v0

    aput-char v0, p0, p3

    .line 58
    add-int/lit8 v0, p3, 0x1

    .line 59
    mul-int/lit8 v1, v1, 0x64

    sub-int v1, p1, v1

    .line 61
    :goto_0
    if-eqz p4, :cond_3

    const/4 v2, 0x2

    if-ge p5, v2, :cond_4

    :cond_3
    const/16 v2, 0x9

    if-gt v1, v2, :cond_4

    if-eq p3, v0, :cond_5

    .line 62
    :cond_4
    div-int/lit8 v2, v1, 0xa

    .line 63
    add-int/lit8 v3, v2, 0x30

    int-to-char v3, v3

    aput-char v3, p0, v0

    .line 64
    add-int/lit8 v0, v0, 0x1

    .line 65
    mul-int/lit8 v2, v2, 0xa

    sub-int/2addr v1, v2

    .line 67
    :cond_5
    add-int/lit8 v1, v1, 0x30

    int-to-char v1, v1

    aput-char v1, p0, v0

    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    aput-char p2, p0, v0

    .line 70
    add-int/lit8 p3, v0, 0x1

    .line 72
    :cond_6
    return p3

    :cond_7
    move v0, p3

    move v1, p1

    goto :goto_0
.end method
