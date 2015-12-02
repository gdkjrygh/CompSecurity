.class public Lcom/facebook/analytics/h/c;
.super Ljava/lang/Object;
.source "TimeSpentBitArray.java"


# static fields
.field private static final a:Ljava/util/Random;


# instance fields
.field private b:J

.field private c:J

.field private d:Ljava/lang/String;

.field private e:[I

.field private f:I

.field private g:I

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 100
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lcom/facebook/analytics/h/c;->a:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    const/4 v0, 0x1

    iput v0, p0, Lcom/facebook/analytics/h/c;->h:I

    .line 115
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, p0, Lcom/facebook/analytics/h/c;->h:I

    .line 117
    invoke-direct {p0}, Lcom/facebook/analytics/h/c;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/h/c;->d:Ljava/lang/String;

    .line 119
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/analytics/h/c;->f:I

    .line 121
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/analytics/h/c;->g:I

    .line 123
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/analytics/h/c;->e:[I

    .line 124
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 127
    sget-object v0, Lcom/facebook/analytics/h/c;->a:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/16 v1, 0x24

    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(J)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 142
    iput-wide p1, p0, Lcom/facebook/analytics/h/c;->c:J

    iput-wide p1, p0, Lcom/facebook/analytics/h/c;->b:J

    .line 143
    iget v1, p0, Lcom/facebook/analytics/h/c;->h:I

    new-array v1, v1, [I

    iput-object v1, p0, Lcom/facebook/analytics/h/c;->e:[I

    .line 145
    iget-object v1, p0, Lcom/facebook/analytics/h/c;->e:[I

    aput v0, v1, v2

    .line 146
    :goto_0
    iget v1, p0, Lcom/facebook/analytics/h/c;->h:I

    if-ge v0, v1, :cond_0

    .line 148
    iget-object v1, p0, Lcom/facebook/analytics/h/c;->e:[I

    aput v2, v1, v0

    .line 146
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 150
    :cond_0
    iget v0, p0, Lcom/facebook/analytics/h/c;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/analytics/h/c;->f:I

    .line 151
    iget v0, p0, Lcom/facebook/analytics/h/c;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/analytics/h/c;->g:I

    .line 152
    return-void
.end method

.method private b(J)Lcom/facebook/analytics/cb;
    .locals 7

    .prologue
    .line 158
    iget-wide v0, p0, Lcom/facebook/analytics/h/c;->b:J

    sub-long v1, p1, v0

    .line 159
    const/4 v0, 0x0

    .line 161
    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-ltz v3, :cond_0

    const-wide/16 v3, 0x40

    cmp-long v3, v1, v3

    if-ltz v3, :cond_1

    .line 163
    :cond_0
    sget-object v0, Lcom/facebook/analytics/h/e;->USER_ACTION:Lcom/facebook/analytics/h/e;

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/analytics/h/c;->c(JLcom/facebook/analytics/h/e;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 166
    :cond_1
    iget-object v3, p0, Lcom/facebook/analytics/h/c;->e:[I

    if-nez v3, :cond_2

    .line 168
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/h/c;->a(J)V

    .line 181
    :goto_0
    return-object v0

    .line 176
    :cond_2
    iget-object v3, p0, Lcom/facebook/analytics/h/c;->e:[I

    long-to-int v4, v1

    shr-int/lit8 v4, v4, 0x5

    aget v5, v3, v4

    const/4 v6, 0x1

    long-to-int v1, v1

    and-int/lit8 v1, v1, 0x1f

    shl-int v1, v6, v1

    or-int/2addr v1, v5

    aput v1, v3, v4

    .line 177
    iput-wide p1, p0, Lcom/facebook/analytics/h/c;->c:J

    .line 178
    iget v1, p0, Lcom/facebook/analytics/h/c;->g:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/facebook/analytics/h/c;->g:I

    goto :goto_0
.end method

.method private b(JLcom/facebook/analytics/h/e;)Lcom/facebook/analytics/cb;
    .locals 6

    .prologue
    const-wide/16 v4, 0x1

    .line 191
    iget-object v0, p0, Lcom/facebook/analytics/h/c;->e:[I

    if-nez v0, :cond_1

    .line 192
    const/4 v0, 0x0

    .line 214
    :cond_0
    :goto_0
    return-object v0

    .line 196
    :cond_1
    iget-wide v0, p0, Lcom/facebook/analytics/h/c;->c:J

    cmp-long v0, p1, v0

    if-lez v0, :cond_2

    .line 197
    const-wide/16 v0, 0x40

    iget-wide v2, p0, Lcom/facebook/analytics/h/c;->b:J

    sub-long v2, p1, v2

    add-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    .line 202
    :goto_1
    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "time_spent_bit_array"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "tos_id"

    iget-object v3, p0, Lcom/facebook/analytics/h/c;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "start_time"

    iget-wide v3, p0, Lcom/facebook/analytics/h/c;->b:J

    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "tos_array"

    iget-object v3, p0, Lcom/facebook/analytics/h/c;->e:[I

    invoke-static {v3}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "tos_len"

    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "tos_seq"

    iget v2, p0, Lcom/facebook/analytics/h/c;->f:I

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "tos_cum"

    iget v2, p0, Lcom/facebook/analytics/h/c;->g:I

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 211
    sget-object v1, Lcom/facebook/analytics/h/e;->CLOCK_CHANGE:Lcom/facebook/analytics/h/e;

    if-ne p3, v1, :cond_0

    .line 212
    const-string v1, "trigger"

    const-string v2, "clock_change"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    goto :goto_0

    .line 199
    :cond_2
    iget-wide v0, p0, Lcom/facebook/analytics/h/c;->c:J

    iget-wide v2, p0, Lcom/facebook/analytics/h/c;->b:J

    sub-long/2addr v0, v2

    add-long/2addr v0, v4

    long-to-int v0, v0

    goto :goto_1
.end method

.method private b()V
    .locals 2

    .prologue
    .line 134
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/analytics/h/c;->e:[I

    .line 135
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/analytics/h/c;->c:J

    .line 136
    return-void
.end method

.method private c(JLcom/facebook/analytics/h/e;)Lcom/facebook/analytics/cb;
    .locals 1

    .prologue
    .line 221
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/analytics/h/c;->b(JLcom/facebook/analytics/h/e;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 222
    invoke-direct {p0}, Lcom/facebook/analytics/h/c;->b()V

    .line 223
    return-object v0
.end method


# virtual methods
.method public a(JLcom/facebook/analytics/h/e;)Lcom/facebook/analytics/cb;
    .locals 5

    .prologue
    const-wide/16 v3, 0x3e8

    .line 230
    const/4 v0, 0x0

    .line 232
    sget-object v1, Lcom/facebook/analytics/h/d;->a:[I

    invoke-virtual {p3}, Lcom/facebook/analytics/h/e;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 250
    :cond_0
    :goto_0
    return-object v0

    .line 236
    :pswitch_0
    div-long v1, p1, v3

    .line 237
    iget-wide v3, p0, Lcom/facebook/analytics/h/c;->c:J

    cmp-long v3, v1, v3

    if-lez v3, :cond_0

    .line 238
    invoke-direct {p0, v1, v2}, Lcom/facebook/analytics/h/c;->b(J)Lcom/facebook/analytics/cb;

    move-result-object v0

    goto :goto_0

    .line 244
    :pswitch_1
    iget-object v1, p0, Lcom/facebook/analytics/h/c;->e:[I

    if-eqz v1, :cond_0

    .line 245
    div-long v0, p1, v3

    .line 246
    invoke-direct {p0, v0, v1, p3}, Lcom/facebook/analytics/h/c;->c(JLcom/facebook/analytics/h/e;)Lcom/facebook/analytics/cb;

    move-result-object v0

    goto :goto_0

    .line 232
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
