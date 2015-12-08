.class public final Lb/a/j;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private final b:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lb/a/j;->a:I

    const-wide/32 v0, 0xea60

    iput-wide v0, p0, Lb/a/j;->b:J

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget v0, p0, Lb/a/j;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0

    :pswitch_0
    const-wide/32 v0, 0xdbba00

    goto :goto_0

    :pswitch_1
    const-wide/32 v0, 0x1b77400

    goto :goto_0

    :pswitch_2
    const-wide/32 v0, 0x5265c00

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final a(Landroid/content/Context;Lb/a/et;)Lb/a/et;
    .locals 8

    const-wide/32 v6, 0xea60

    const/4 v0, 0x0

    const/4 v3, 0x1

    if-nez p2, :cond_1

    move-object p2, v0

    :cond_0
    :goto_0
    return-object p2

    :cond_1
    iget v1, p0, Lb/a/j;->a:I

    if-ne v1, v3, :cond_2

    invoke-virtual {p2}, Lb/a/et;->i()Lb/a/et;

    goto :goto_0

    :cond_2
    iget v1, p0, Lb/a/j;->a:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    new-array v0, v3, [Lb/a/eh;

    const/4 v1, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    new-instance v4, Lb/a/eh;

    invoke-direct {v4}, Lb/a/eh;-><init>()V

    invoke-static {p1}, Lb/a/ia;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lb/a/eh;->a(Ljava/lang/String;)Lb/a/eh;

    invoke-virtual {v4, v2, v3}, Lb/a/eh;->a(J)Lb/a/eh;

    add-long/2addr v2, v6

    invoke-virtual {v4, v2, v3}, Lb/a/eh;->b(J)Lb/a/eh;

    invoke-virtual {v4, v6, v7}, Lb/a/eh;->c(J)Lb/a/eh;

    aput-object v4, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lb/a/et;->a(Ljava/util/List;)Lb/a/et;

    invoke-virtual {p2}, Lb/a/et;->i()Lb/a/et;

    goto :goto_0

    :cond_3
    iget v1, p0, Lb/a/j;->a:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    invoke-virtual {p2, v0}, Lb/a/et;->a(Ljava/util/List;)Lb/a/et;

    invoke-virtual {p2}, Lb/a/et;->i()Lb/a/et;

    goto :goto_0
.end method

.method public final a(I)V
    .locals 1

    if-ltz p1, :cond_0

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    iput p1, p0, Lb/a/j;->a:I

    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    iget v0, p0, Lb/a/j;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
