.class public Lcom/facebook/orca/p/e;
.super Ljava/lang/Object;
.source "LastActiveHelper.java"


# instance fields
.field private final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/facebook/orca/p/e;->a:Landroid/content/res/Resources;

    .line 37
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/LastActive;Lcom/facebook/l/x;)I
    .locals 4

    .prologue
    .line 63
    if-nez p1, :cond_0

    .line 64
    const/4 v0, 0x0

    .line 73
    :goto_0
    return v0

    .line 67
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/user/LastActive;->a()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/facebook/user/LastActive;->b()Z

    move-result v2

    invoke-virtual {p2}, Lcom/facebook/l/x;->a()Lcom/facebook/l/a;

    move-result-object v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/facebook/orca/p/e;->a(JZLcom/facebook/l/a;)J

    move-result-wide v0

    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v0, v2, v0

    .line 73
    const-wide/32 v2, 0x36ee80

    div-long/2addr v0, v2

    long-to-int v0, v0

    goto :goto_0
.end method

.method public a(JZLcom/facebook/l/a;)J
    .locals 6

    .prologue
    const-wide/16 v0, 0x0

    .line 40
    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 54
    :goto_0
    return-wide v0

    .line 45
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, p1

    .line 47
    sget-object v4, Lcom/facebook/l/a;->AVAILABLE:Lcom/facebook/l/a;

    if-eq p4, v4, :cond_1

    if-eqz p3, :cond_3

    const-wide/32 v4, 0x36ee80

    cmp-long v4, v2, v4

    if-gez v4, :cond_3

    .line 49
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    :cond_2
    :goto_1
    move-wide v0, p1

    .line 54
    goto :goto_0

    .line 51
    :cond_3
    const-wide/32 v4, 0x14997000

    cmp-long v2, v2, v4

    if-lez v2, :cond_2

    move-wide p1, v0

    .line 52
    goto :goto_1
.end method

.method public a(J)Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v6, 0x3c

    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 110
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 111
    const/4 v0, 0x0

    .line 133
    :goto_0
    return-object v0

    .line 114
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    .line 115
    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v0, v0

    .line 116
    div-int/lit8 v1, v0, 0x3c

    .line 117
    div-int/lit8 v2, v1, 0x3c

    .line 118
    div-int/lit8 v3, v2, 0x18

    .line 120
    if-ge v0, v6, :cond_1

    .line 121
    iget-object v0, p0, Lcom/facebook/orca/p/e;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->presence_active_now:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 122
    :cond_1
    if-ne v1, v4, :cond_2

    .line 123
    iget-object v0, p0, Lcom/facebook/orca/p/e;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->presence_active_one_min_ago:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 124
    :cond_2
    if-ge v1, v6, :cond_3

    .line 125
    iget-object v0, p0, Lcom/facebook/orca/p/e;->a:Landroid/content/res/Resources;

    sget v2, Lcom/facebook/o;->presence_active_x_mins_ago:I

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v5

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 126
    :cond_3
    if-ne v2, v4, :cond_4

    .line 127
    iget-object v0, p0, Lcom/facebook/orca/p/e;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->presence_active_one_hour_ago:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 128
    :cond_4
    const/16 v0, 0x18

    if-ge v2, v0, :cond_5

    .line 129
    iget-object v0, p0, Lcom/facebook/orca/p/e;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->presence_active_x_hours_ago:I

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v3, v5

    invoke-virtual {v0, v1, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 130
    :cond_5
    if-ne v3, v4, :cond_6

    .line 131
    iget-object v0, p0, Lcom/facebook/orca/p/e;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->presence_active_one_day_ago:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 133
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/p/e;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->presence_active_x_days_ago:I

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/facebook/user/LastActive;Lcom/facebook/l/x;Lcom/facebook/orca/p/f;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 88
    if-nez p1, :cond_0

    .line 89
    const/4 v0, 0x0

    .line 100
    :goto_0
    return-object v0

    .line 92
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/user/LastActive;->a()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/facebook/user/LastActive;->b()Z

    move-result v2

    invoke-virtual {p2}, Lcom/facebook/l/x;->a()Lcom/facebook/l/a;

    move-result-object v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/facebook/orca/p/e;->a(JZLcom/facebook/l/a;)J

    move-result-wide v0

    .line 97
    sget-object v2, Lcom/facebook/orca/p/f;->SHORT:Lcom/facebook/orca/p/f;

    if-ne v2, p3, :cond_1

    .line 98
    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/p/e;->b(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 100
    :cond_1
    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/p/e;->a(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public b(J)Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v6, 0x3c

    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 143
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 144
    const/4 v0, 0x0

    .line 160
    :goto_0
    return-object v0

    .line 147
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    .line 148
    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v0, v0

    .line 149
    div-int/lit8 v1, v0, 0x3c

    .line 150
    div-int/lit8 v2, v1, 0x3c

    .line 151
    div-int/lit8 v3, v2, 0x18

    .line 153
    if-ge v0, v6, :cond_1

    .line 154
    iget-object v0, p0, Lcom/facebook/orca/p/e;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->short_active_x_mins_ago:I

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 155
    :cond_1
    if-ge v1, v6, :cond_2

    .line 156
    iget-object v0, p0, Lcom/facebook/orca/p/e;->a:Landroid/content/res/Resources;

    sget v2, Lcom/facebook/o;->short_active_x_mins_ago:I

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v5

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 157
    :cond_2
    const/16 v0, 0x18

    if-ge v2, v0, :cond_3

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/p/e;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->short_active_x_hours_ago:I

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v3, v5

    invoke-virtual {v0, v1, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 160
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/p/e;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->short_active_x_days_ago:I

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
