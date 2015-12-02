.class Lcom/qihoo/security/clearengine/b/a$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/clearengine/b/a;->a(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;Lcom/qihoo/security/clearengine/b/a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic a:Landroid/content/Context;

.field private final synthetic b:I

.field private final synthetic c:Ljava/util/List;

.field private final synthetic d:Lcom/qihoo/security/clearengine/b/a$a;


# direct methods
.method constructor <init>(Landroid/content/Context;ILjava/util/List;Lcom/qihoo/security/clearengine/b/a$a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/b/a$4;->a:Landroid/content/Context;

    iput p2, p0, Lcom/qihoo/security/clearengine/b/a$4;->b:I

    iput-object p3, p0, Lcom/qihoo/security/clearengine/b/a$4;->c:Ljava/util/List;

    iput-object p4, p0, Lcom/qihoo/security/clearengine/b/a$4;->d:Lcom/qihoo/security/clearengine/b/a$a;

    .line 1426
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .prologue
    const-wide/16 v4, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 1433
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$4;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/a/a/a/c;->c(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/cloudquery/ICloudQuery;

    move-result-object v1

    .line 1434
    if-eqz v1, :cond_3

    .line 1435
    const/4 v0, 0x0

    .line 1436
    iget v2, p0, Lcom/qihoo/security/clearengine/b/a$4;->b:I

    packed-switch v2, :pswitch_data_0

    .line 1490
    :cond_0
    :goto_0
    :pswitch_0
    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a$4;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo/security/clearengine/d/b;->b(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1491
    new-instance v2, Lcom/qihoo/security/clearengine/c/a;

    iget-object v3, p0, Lcom/qihoo/security/clearengine/b/a$4;->a:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/qihoo/security/clearengine/c/a;-><init>(Landroid/content/Context;)V

    .line 1492
    invoke-virtual {v2}, Lcom/qihoo/security/clearengine/c/a;->a()Ljava/util/List;

    move-result-object v3

    .line 1493
    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_1

    .line 1494
    invoke-interface {v1, v11, v10, v3}, Lcom/qihoo360/mobilesafe/opti/i/cloudquery/ICloudQuery;->cloudQuery(ILjava/util/List;Ljava/util/List;)I

    move-result v1

    .line 1495
    if-ne v11, v1, :cond_1

    .line 1496
    invoke-virtual {v2}, Lcom/qihoo/security/clearengine/c/a;->b()V

    .line 1508
    :cond_1
    if-ne v0, v11, :cond_2

    .line 1509
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$4;->a:Landroid/content/Context;

    const-string/jumbo v2, "cloud_data_updated_time_stp"

    .line 1510
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1509
    invoke-static {v1, v2, v4, v5}, Lcom/qihoo/security/clearengine/d/c;->b(Landroid/content/Context;Ljava/lang/String;J)V

    .line 1513
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1514
    const-string/jumbo v2, "clear_cloud_query_success"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1515
    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a$4;->a:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 1522
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$4;->d:Lcom/qihoo/security/clearengine/b/a$a;

    if-eqz v1, :cond_3

    .line 1523
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$4;->d:Lcom/qihoo/security/clearengine/b/a$a;

    .line 1524
    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a$4;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo/security/clearengine/d/b;->a(Landroid/content/Context;)I

    move-result v2

    .line 1523
    invoke-interface {v1, v0, v2}, Lcom/qihoo/security/clearengine/b/a$a;->a(II)V

    .line 1527
    :cond_3
    return-void

    .line 1438
    :pswitch_1
    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a$4;->a:Landroid/content/Context;

    const-string/jumbo v3, "cloud_data_updated_time_stp"

    invoke-static {v2, v3, v4, v5}, Lcom/qihoo/security/clearengine/d/c;->a(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    .line 1444
    invoke-interface {v1, v11, v10, v10}, Lcom/qihoo360/mobilesafe/opti/i/cloudquery/ICloudQuery;->cloudQuery(ILjava/util/List;Ljava/util/List;)I

    move-result v0

    goto :goto_0

    .line 1450
    :pswitch_2
    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a$4;->a:Landroid/content/Context;

    .line 1451
    const-string/jumbo v3, "cloud_data_updated_time_stp"

    .line 1450
    invoke-static {v2, v3, v4, v5}, Lcom/qihoo/security/clearengine/d/c;->a(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 1452
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1460
    sub-long v6, v4, v2

    const-wide/32 v8, 0x5265c00

    cmp-long v6, v6, v8

    if-gtz v6, :cond_4

    .line 1461
    cmp-long v2, v4, v2

    if-gtz v2, :cond_0

    .line 1466
    :cond_4
    invoke-interface {v1, v11, v10, v10}, Lcom/qihoo360/mobilesafe/opti/i/cloudquery/ICloudQuery;->cloudQuery(ILjava/util/List;Ljava/util/List;)I

    move-result v0

    goto/16 :goto_0

    .line 1472
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$4;->c:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$4;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_6

    .line 1473
    :cond_5
    invoke-interface {v1, v11, v10, v10}, Lcom/qihoo360/mobilesafe/opti/i/cloudquery/ICloudQuery;->cloudQuery(ILjava/util/List;Ljava/util/List;)I

    move-result v0

    goto/16 :goto_0

    .line 1475
    :cond_6
    const/4 v0, 0x2

    .line 1476
    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a$4;->c:Ljava/util/List;

    .line 1475
    invoke-interface {v1, v0, v2, v10}, Lcom/qihoo360/mobilesafe/opti/i/cloudquery/ICloudQuery;->cloudQuery(ILjava/util/List;Ljava/util/List;)I

    move-result v0

    goto/16 :goto_0

    .line 1482
    :pswitch_4
    invoke-interface {v1, v11, v10, v10}, Lcom/qihoo360/mobilesafe/opti/i/cloudquery/ICloudQuery;->cloudQuery(ILjava/util/List;Ljava/util/List;)I

    move-result v0

    goto/16 :goto_0

    .line 1436
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method
