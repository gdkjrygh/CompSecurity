.class public Lcom/facebook/orca/threads/n;
.super Ljava/lang/Object;
.source "ThreadDateUtil.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private final a:Ljava/text/SimpleDateFormat;

.field private final b:Ljava/text/SimpleDateFormat;

.field private final c:Ljava/text/SimpleDateFormat;

.field private final d:Ljava/text/SimpleDateFormat;

.field private final e:Ljava/text/SimpleDateFormat;

.field private final f:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/facebook/orca/threads/n;->f:Landroid/content/Context;

    .line 36
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget v1, Lcom/facebook/o;->thread_date_short_day_of_week:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/orca/threads/n;->a:Ljava/text/SimpleDateFormat;

    .line 38
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget v1, Lcom/facebook/o;->thread_date_short:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/orca/threads/n;->b:Ljava/text/SimpleDateFormat;

    .line 40
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget v1, Lcom/facebook/o;->thread_date_full:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/orca/threads/n;->c:Ljava/text/SimpleDateFormat;

    .line 42
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget v1, Lcom/facebook/o;->message_date_no_year:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/orca/threads/n;->d:Ljava/text/SimpleDateFormat;

    .line 44
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget v1, Lcom/facebook/o;->message_date_with_year:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/orca/threads/n;->e:Ljava/text/SimpleDateFormat;

    .line 46
    return-void
.end method

.method private e(J)[Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 187
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    .line 188
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 189
    sub-long/2addr v1, p1

    const-wide/32 v3, 0x5265c00

    div-long/2addr v1, v3

    .line 191
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 192
    const-wide/16 v4, 0xb4

    cmp-long v1, v1, v4

    if-gez v1, :cond_0

    .line 193
    iget-object v1, p0, Lcom/facebook/orca/threads/n;->d:Ljava/text/SimpleDateFormat;

    invoke-virtual {v1, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    .line 197
    :goto_0
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/facebook/orca/threads/n;->f:Landroid/content/Context;

    invoke-static {v2}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 198
    return-object v0

    .line 195
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/threads/n;->e:Ljava/text/SimpleDateFormat;

    invoke-virtual {v1, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    goto :goto_0
.end method


# virtual methods
.method public a(J)Ljava/lang/String;
    .locals 6

    .prologue
    const-wide/16 v4, 0x3c

    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 90
    sub-long/2addr v0, p1

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    div-long/2addr v0, v4

    div-long/2addr v0, v4

    long-to-int v0, v0

    .line 91
    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    .line 92
    iget-object v0, p0, Lcom/facebook/orca/threads/n;->f:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 103
    :goto_0
    return-object v0

    .line 95
    :cond_0
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 96
    div-int/lit8 v0, v0, 0x18

    .line 97
    const/4 v2, 0x4

    if-ge v0, v2, :cond_1

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/threads/n;->a:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 100
    :cond_1
    const/16 v2, 0xb4

    if-ge v0, v2, :cond_2

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/threads/n;->b:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 103
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threads/n;->c:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public b(J)Z
    .locals 7

    .prologue
    const/4 v6, 0x5

    const/4 v5, 0x2

    const/4 v0, 0x1

    .line 113
    invoke-static {}, Ljava/util/GregorianCalendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 114
    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 115
    invoke-static {}, Ljava/util/GregorianCalendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 116
    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    if-ne v3, v4, :cond_0

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v3

    invoke-virtual {v2, v5}, Ljava/util/Calendar;->get(I)I

    move-result v4

    if-ne v3, v4, :cond_0

    invoke-virtual {v1, v6}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {v2, v6}, Ljava/util/Calendar;->get(I)I

    move-result v2

    if-ne v1, v2, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(J)Ljava/lang/String;
    .locals 10

    .prologue
    const-wide/16 v8, 0x3c

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 134
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 135
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 136
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/threads/n;->b(J)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 137
    iget-object v0, p0, Lcom/facebook/orca/threads/n;->f:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 152
    :goto_0
    return-object v0

    .line 139
    :cond_0
    sub-long/2addr v0, p1

    const-wide/16 v3, 0x3e8

    div-long/2addr v0, v3

    div-long/2addr v0, v8

    div-long/2addr v0, v8

    long-to-int v0, v0

    div-int/lit8 v0, v0, 0x18

    .line 140
    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    .line 141
    iget-object v0, p0, Lcom/facebook/orca/threads/n;->f:Landroid/content/Context;

    sget v1, Lcom/facebook/o;->message_date_time_order:I

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/facebook/orca/threads/n;->a:Ljava/text/SimpleDateFormat;

    invoke-virtual {v4, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    iget-object v4, p0, Lcom/facebook/orca/threads/n;->f:Landroid/content/Context;

    invoke-static {v4}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v6

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 146
    :cond_1
    const/16 v1, 0xb4

    if-ge v0, v1, :cond_2

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/threads/n;->f:Landroid/content/Context;

    sget v1, Lcom/facebook/o;->message_date_time_order:I

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/facebook/orca/threads/n;->b:Ljava/text/SimpleDateFormat;

    invoke-virtual {v4, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    iget-object v4, p0, Lcom/facebook/orca/threads/n;->f:Landroid/content/Context;

    invoke-static {v4}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v6

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 152
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threads/n;->f:Landroid/content/Context;

    sget v1, Lcom/facebook/o;->message_date_time_order:I

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/facebook/orca/threads/n;->c:Ljava/text/SimpleDateFormat;

    invoke-virtual {v4, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    iget-object v4, p0, Lcom/facebook/orca/threads/n;->f:Landroid/content/Context;

    invoke-static {v4}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v6

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public d(J)Ljava/lang/String;
    .locals 3

    .prologue
    .line 178
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threads/n;->e(J)[Ljava/lang/String;

    move-result-object v0

    .line 179
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x64

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 180
    const/4 v2, 0x0

    aget-object v2, v0, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
