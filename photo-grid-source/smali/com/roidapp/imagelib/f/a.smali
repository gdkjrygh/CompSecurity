.class public final Lcom/roidapp/imagelib/f/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:[D


# instance fields
.field public a:I

.field private b:C

.field private c:Ljava/lang/CharSequence;

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    .line 292
    const/16 v0, 0x80

    new-array v0, v0, [D

    sput-object v0, Lcom/roidapp/imagelib/f/a;->e:[D

    .line 295
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/roidapp/imagelib/f/a;->e:[D

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 296
    sget-object v1, Lcom/roidapp/imagelib/f/a;->e:[D

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    int-to-double v4, v0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    aput-wide v2, v1, v0

    .line 295
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 298
    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/roidapp/imagelib/f/a;->c:Ljava/lang/CharSequence;

    .line 35
    iput v1, p0, Lcom/roidapp/imagelib/f/a;->a:I

    .line 36
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/f/a;->d:I

    .line 37
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    iput-char v0, p0, Lcom/roidapp/imagelib/f/a;->b:C

    .line 38
    return-void
.end method

.method private static a(C)V
    .locals 3

    .prologue
    .line 261
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected char \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private d()C
    .locals 2

    .prologue
    .line 41
    iget v0, p0, Lcom/roidapp/imagelib/f/a;->a:I

    iget v1, p0, Lcom/roidapp/imagelib/f/a;->d:I

    if-ge v0, v1, :cond_0

    .line 42
    iget v0, p0, Lcom/roidapp/imagelib/f/a;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/imagelib/f/a;->a:I

    .line 44
    :cond_0
    iget v0, p0, Lcom/roidapp/imagelib/f/a;->a:I

    iget v1, p0, Lcom/roidapp/imagelib/f/a;->d:I

    if-ne v0, v1, :cond_1

    .line 45
    const/4 v0, 0x0

    .line 47
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/f/a;->c:Ljava/lang/CharSequence;

    iget v1, p0, Lcom/roidapp/imagelib/f/a;->a:I

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 52
    :goto_0
    iget v0, p0, Lcom/roidapp/imagelib/f/a;->a:I

    iget v1, p0, Lcom/roidapp/imagelib/f/a;->d:I

    if-ge v0, v1, :cond_0

    .line 53
    iget-object v0, p0, Lcom/roidapp/imagelib/f/a;->c:Ljava/lang/CharSequence;

    iget v1, p0, Lcom/roidapp/imagelib/f/a;->a:I

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    invoke-virtual {p0}, Lcom/roidapp/imagelib/f/a;->b()V

    goto :goto_0

    .line 59
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 78
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/a;->d()C

    move-result v0

    iput-char v0, p0, Lcom/roidapp/imagelib/f/a;->b:C

    .line 79
    return-void
.end method

.method public final c()F
    .locals 11

    .prologue
    const/16 v10, 0x9

    const/4 v2, 0x1

    const/4 v7, 0x0

    const/4 v1, 0x0

    .line 301
    invoke-virtual {p0}, Lcom/roidapp/imagelib/f/a;->a()V

    .line 1095
    iget-char v0, p0, Lcom/roidapp/imagelib/f/a;->b:C

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    move v0, v2

    .line 1103
    :goto_0
    iget-char v3, p0, Lcom/roidapp/imagelib/f/a;->b:C

    packed-switch v3, :pswitch_data_1

    .line 1105
    :pswitch_1
    const/high16 v0, 0x7fc00000    # NaNf

    .line 2062
    :goto_1
    iget v1, p0, Lcom/roidapp/imagelib/f/a;->a:I

    iget v2, p0, Lcom/roidapp/imagelib/f/a;->d:I

    if-ge v1, v2, :cond_0

    .line 2063
    iget-object v1, p0, Lcom/roidapp/imagelib/f/a;->c:Ljava/lang/CharSequence;

    iget v2, p0, Lcom/roidapp/imagelib/f/a;->a:I

    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    .line 2064
    sparse-switch v1, :sswitch_data_0

    .line 304
    :cond_0
    return v0

    :pswitch_2
    move v0, v1

    .line 1100
    :goto_2
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/a;->d()C

    move-result v3

    iput-char v3, p0, Lcom/roidapp/imagelib/f/a;->b:C

    goto :goto_0

    :pswitch_3
    move v3, v1

    move v4, v1

    move v5, v1

    move v6, v1

    .line 1146
    :goto_3
    iget-char v8, p0, Lcom/roidapp/imagelib/f/a;->b:C

    const/16 v9, 0x2e

    if-ne v8, v9, :cond_3

    .line 1147
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/a;->d()C

    move-result v8

    iput-char v8, p0, Lcom/roidapp/imagelib/f/a;->b:C

    .line 1148
    iget-char v8, p0, Lcom/roidapp/imagelib/f/a;->b:C

    packed-switch v8, :pswitch_data_2

    .line 1151
    if-nez v4, :cond_3

    .line 1152
    iget-char v0, p0, Lcom/roidapp/imagelib/f/a;->b:C

    invoke-static {v0}, Lcom/roidapp/imagelib/f/a;->a(C)V

    move v0, v7

    .line 1153
    goto :goto_1

    .line 1113
    :pswitch_4
    :sswitch_0
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/a;->d()C

    move-result v3

    iput-char v3, p0, Lcom/roidapp/imagelib/f/a;->b:C

    .line 1114
    iget-char v3, p0, Lcom/roidapp/imagelib/f/a;->b:C

    sparse-switch v3, :sswitch_data_1

    move v0, v7

    .line 1121
    goto :goto_1

    :sswitch_1
    move v3, v1

    move v4, v2

    move v5, v1

    move v6, v1

    .line 1119
    goto :goto_3

    :pswitch_5
    :sswitch_2
    move v3, v1

    move v4, v1

    move v5, v1

    .line 1130
    :pswitch_6
    if-ge v5, v10, :cond_1

    .line 1131
    add-int/lit8 v5, v5, 0x1

    .line 1132
    mul-int/lit8 v4, v4, 0xa

    iget-char v6, p0, Lcom/roidapp/imagelib/f/a;->b:C

    add-int/lit8 v6, v6, -0x30

    add-int/2addr v4, v6

    .line 1136
    :goto_4
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/a;->d()C

    move-result v6

    iput-char v6, p0, Lcom/roidapp/imagelib/f/a;->b:C

    .line 1137
    iget-char v6, p0, Lcom/roidapp/imagelib/f/a;->b:C

    packed-switch v6, :pswitch_data_3

    move v6, v5

    move v5, v4

    move v4, v2

    .line 1139
    goto :goto_3

    .line 1134
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 1158
    :pswitch_7
    if-nez v6, :cond_e

    .line 1160
    :pswitch_8
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/a;->d()C

    move-result v8

    iput-char v8, p0, Lcom/roidapp/imagelib/f/a;->b:C

    .line 1161
    add-int/lit8 v3, v3, -0x1

    .line 1162
    iget-char v8, p0, Lcom/roidapp/imagelib/f/a;->b:C

    packed-switch v8, :pswitch_data_4

    .line 1167
    if-nez v4, :cond_3

    move v0, v7

    .line 1168
    goto :goto_1

    :pswitch_9
    move v4, v5

    move v5, v6

    .line 1178
    :goto_5
    :pswitch_a
    if-ge v5, v10, :cond_2

    .line 1179
    add-int/lit8 v5, v5, 0x1

    .line 1180
    mul-int/lit8 v4, v4, 0xa

    iget-char v6, p0, Lcom/roidapp/imagelib/f/a;->b:C

    add-int/lit8 v6, v6, -0x30

    add-int/2addr v4, v6

    .line 1181
    add-int/lit8 v3, v3, -0x1

    .line 1183
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/a;->d()C

    move-result v6

    iput-char v6, p0, Lcom/roidapp/imagelib/f/a;->b:C

    .line 1184
    iget-char v6, p0, Lcom/roidapp/imagelib/f/a;->b:C

    packed-switch v6, :pswitch_data_5

    move v5, v4

    .line 1194
    :cond_3
    iget-char v4, p0, Lcom/roidapp/imagelib/f/a;->b:C

    sparse-switch v4, :sswitch_data_2

    .line 1249
    :goto_6
    if-nez v2, :cond_4

    .line 1250
    neg-int v1, v1

    .line 1252
    :cond_4
    add-int/2addr v1, v3

    .line 1253
    if-nez v0, :cond_d

    .line 1254
    neg-int v0, v5

    .line 1268
    :goto_7
    const/16 v2, -0x7d

    if-lt v1, v2, :cond_5

    if-nez v0, :cond_7

    :cond_5
    move v0, v7

    .line 1269
    goto/16 :goto_1

    .line 1196
    :sswitch_3
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/a;->d()C

    move-result v4

    iput-char v4, p0, Lcom/roidapp/imagelib/f/a;->b:C

    .line 1197
    iget-char v4, p0, Lcom/roidapp/imagelib/f/a;->b:C

    packed-switch v4, :pswitch_data_6

    .line 1199
    :pswitch_b
    iget-char v0, p0, Lcom/roidapp/imagelib/f/a;->b:C

    invoke-static {v0}, Lcom/roidapp/imagelib/f/a;->a(C)V

    move v0, v7

    .line 1200
    goto/16 :goto_1

    :pswitch_c
    move v2, v1

    .line 1204
    :pswitch_d
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/a;->d()C

    move-result v4

    iput-char v4, p0, Lcom/roidapp/imagelib/f/a;->b:C

    .line 1205
    iget-char v4, p0, Lcom/roidapp/imagelib/f/a;->b:C

    packed-switch v4, :pswitch_data_7

    .line 1207
    iget-char v0, p0, Lcom/roidapp/imagelib/f/a;->b:C

    invoke-static {v0}, Lcom/roidapp/imagelib/f/a;->a(C)V

    move v0, v7

    .line 1208
    goto/16 :goto_1

    .line 1216
    :pswitch_e
    iget-char v4, p0, Lcom/roidapp/imagelib/f/a;->b:C

    packed-switch v4, :pswitch_data_8

    goto :goto_6

    .line 1219
    :pswitch_f
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/a;->d()C

    move-result v4

    iput-char v4, p0, Lcom/roidapp/imagelib/f/a;->b:C

    .line 1220
    iget-char v4, p0, Lcom/roidapp/imagelib/f/a;->b:C

    packed-switch v4, :pswitch_data_9

    goto :goto_6

    :pswitch_10
    move v4, v1

    .line 1233
    :goto_8
    :pswitch_11
    const/4 v6, 0x3

    if-ge v1, v6, :cond_6

    .line 1234
    add-int/lit8 v1, v1, 0x1

    .line 1235
    mul-int/lit8 v4, v4, 0xa

    iget-char v6, p0, Lcom/roidapp/imagelib/f/a;->b:C

    add-int/lit8 v6, v6, -0x30

    add-int/2addr v4, v6

    .line 1237
    :cond_6
    invoke-direct {p0}, Lcom/roidapp/imagelib/f/a;->d()C

    move-result v6

    iput-char v6, p0, Lcom/roidapp/imagelib/f/a;->b:C

    .line 1238
    iget-char v6, p0, Lcom/roidapp/imagelib/f/a;->b:C

    packed-switch v6, :pswitch_data_a

    move v1, v4

    .line 1240
    goto :goto_6

    .line 1272
    :cond_7
    const/16 v2, 0x80

    if-lt v1, v2, :cond_9

    .line 1273
    if-lez v0, :cond_8

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    goto/16 :goto_1

    :cond_8
    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    goto/16 :goto_1

    .line 1278
    :cond_9
    if-nez v1, :cond_a

    .line 1279
    int-to-float v0, v0

    goto/16 :goto_1

    .line 1282
    :cond_a
    const/high16 v2, 0x4000000

    if-lt v0, v2, :cond_b

    .line 1283
    add-int/lit8 v0, v0, 0x1

    .line 1286
    :cond_b
    if-lez v1, :cond_c

    int-to-double v2, v0

    sget-object v0, Lcom/roidapp/imagelib/f/a;->e:[D

    aget-wide v0, v0, v1

    mul-double/2addr v0, v2

    :goto_9
    double-to-float v0, v0

    goto/16 :goto_1

    :cond_c
    int-to-double v2, v0

    sget-object v0, Lcom/roidapp/imagelib/f/a;->e:[D

    neg-int v1, v1

    aget-wide v0, v0, v1

    div-double v0, v2, v0

    goto :goto_9

    .line 2069
    :sswitch_4
    invoke-virtual {p0}, Lcom/roidapp/imagelib/f/a;->b()V

    goto/16 :goto_1

    :cond_d
    move v0, v5

    goto/16 :goto_7

    :pswitch_12
    move v4, v1

    goto :goto_8

    :cond_e
    :pswitch_13
    move v4, v5

    move v5, v6

    goto/16 :goto_5

    :pswitch_14
    move v0, v2

    goto/16 :goto_2

    .line 1095
    nop

    :pswitch_data_0
    .packed-switch 0x2b
        :pswitch_14
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 1103
    :pswitch_data_1
    .packed-switch 0x2e
        :pswitch_3
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch

    .line 2064
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_4
        0xa -> :sswitch_4
        0x20 -> :sswitch_4
        0x2c -> :sswitch_4
    .end sparse-switch

    .line 1148
    :pswitch_data_2
    .packed-switch 0x30
        :pswitch_7
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
    .end packed-switch

    .line 1114
    :sswitch_data_1
    .sparse-switch
        0x2e -> :sswitch_1
        0x30 -> :sswitch_0
        0x31 -> :sswitch_2
        0x32 -> :sswitch_2
        0x33 -> :sswitch_2
        0x34 -> :sswitch_2
        0x35 -> :sswitch_2
        0x36 -> :sswitch_2
        0x37 -> :sswitch_2
        0x38 -> :sswitch_2
        0x39 -> :sswitch_2
        0x45 -> :sswitch_1
        0x65 -> :sswitch_1
    .end sparse-switch

    .line 1137
    :pswitch_data_3
    .packed-switch 0x30
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
    .end packed-switch

    .line 1162
    :pswitch_data_4
    .packed-switch 0x30
        :pswitch_8
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch

    .line 1184
    :pswitch_data_5
    .packed-switch 0x30
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
    .end packed-switch

    .line 1194
    :sswitch_data_2
    .sparse-switch
        0x45 -> :sswitch_3
        0x65 -> :sswitch_3
    .end sparse-switch

    .line 1197
    :pswitch_data_6
    .packed-switch 0x2b
        :pswitch_d
        :pswitch_b
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
    .end packed-switch

    .line 1205
    :pswitch_data_7
    .packed-switch 0x30
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
    .end packed-switch

    .line 1216
    :pswitch_data_8
    .packed-switch 0x30
        :pswitch_f
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
    .end packed-switch

    .line 1220
    :pswitch_data_9
    .packed-switch 0x30
        :pswitch_f
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
    .end packed-switch

    .line 1238
    :pswitch_data_a
    .packed-switch 0x30
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
    .end packed-switch
.end method
