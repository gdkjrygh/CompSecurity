.class public Lcom/umeng/analytics/ReportPolicy;
.super Ljava/lang/Object;


# static fields
.field public static final BATCH_AT_LAUNCH:I = 0x1

.field public static final BATCH_BY_INTERVAL:I = 0x6

.field public static final DAILY:I = 0x4

.field public static final REALTIME:I = 0x0

.field public static final WIFIONLY:I = 0x5

.field static final a:I = 0x2

.field static final b:I = 0x3

.field private static c:J


# instance fields
.field private d:I

.field private e:J

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x2710

    sput-wide v0, Lcom/umeng/analytics/ReportPolicy;->c:J

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const-wide/16 v2, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/umeng/analytics/ReportPolicy;->d:I

    iput-wide v2, p0, Lcom/umeng/analytics/ReportPolicy;->e:J

    iput-wide v2, p0, Lcom/umeng/analytics/ReportPolicy;->f:J

    return-void
.end method

.method static a(Landroid/content/Context;I)V
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x6

    if-le p1, v0, :cond_1

    :cond_0
    const-string v0, "MobclickAgent"

    const-string v1, "Illegal value of report policy"

    invoke-static {v0, v1}, Lcom/umeng/common/Log;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    invoke-static {p0}, Lcom/umeng/analytics/h;->b(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "umeng_local_report_policy"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method

.method static b(Landroid/content/Context;IJ)V
    .locals 6

    const/4 v0, 0x6

    if-ltz p1, :cond_0

    if-le p1, v0, :cond_1

    :cond_0
    const-string v0, "MobclickAgent"

    const-string v1, "Illegal value of report policy"

    invoke-static {v0, v1}, Lcom/umeng/common/Log;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    if-ne p1, v0, :cond_2

    sget-wide v0, Lcom/umeng/analytics/ReportPolicy;->c:J

    cmp-long v0, p2, v0

    if-gez v0, :cond_2

    sget-wide p2, Lcom/umeng/analytics/ReportPolicy;->c:J

    const-string v0, "MobclickAgent"

    const-string v1, "Report interval can\'t be less than %dms, reset to %dms"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    sget-wide v4, Lcom/umeng/analytics/ReportPolicy;->c:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    sget-wide v4, Lcom/umeng/analytics/ReportPolicy;->c:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/umeng/common/Log;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-static {p0}, Lcom/umeng/analytics/h;->b(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "umeng_local_report_policy"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "report_interval"

    invoke-interface {v0, v1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method


# virtual methods
.method a(Landroid/content/Context;)V
    .locals 4

    iget v0, p0, Lcom/umeng/analytics/ReportPolicy;->d:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    invoke-static {p1}, Lcom/umeng/analytics/h;->d(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {}, Lcom/umeng/common/b;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "true"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p0, Lcom/umeng/analytics/ReportPolicy;->d:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/umeng/analytics/ReportPolicy;->e:J

    invoke-static {p1}, Lcom/umeng/analytics/h;->b(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "last_report_time"

    iget-wide v2, p0, Lcom/umeng/analytics/ReportPolicy;->e:J

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method

.method a(Landroid/content/Context;IJ)V
    .locals 5

    if-ltz p2, :cond_0

    const/4 v0, 0x6

    if-le p2, v0, :cond_1

    :cond_0
    const-string v0, "MobclickAgent"

    const-string v1, "Illegal value of report policy"

    invoke-static {v0, v1}, Lcom/umeng/common/Log;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    iput p2, p0, Lcom/umeng/analytics/ReportPolicy;->d:I

    iput-wide p3, p0, Lcom/umeng/analytics/ReportPolicy;->f:J

    invoke-static {p1}, Lcom/umeng/analytics/h;->b(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "umeng_net_report_policy"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "report_interval"

    sget-wide v2, Lcom/umeng/analytics/ReportPolicy;->c:J

    cmp-long v2, p3, v2

    if-gez v2, :cond_2

    sget-wide p3, Lcom/umeng/analytics/ReportPolicy;->c:J

    :cond_2
    invoke-interface {v0, v1, p3, p4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method

.method a()Z
    .locals 6

    const/4 v0, 0x1

    iget v1, p0, Lcom/umeng/analytics/ReportPolicy;->d:I

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lcom/umeng/analytics/ReportPolicy;->d:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/umeng/analytics/ReportPolicy;->e:J

    sub-long/2addr v2, v4

    iget-wide v4, p0, Lcom/umeng/analytics/ReportPolicy;->f:J

    cmp-long v1, v2, v4

    if-gtz v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 6

    const/4 v1, 0x0

    const/4 v0, 0x1

    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p2, v2}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p2}, Lcom/umeng/common/b;->m(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_0
    move v0, v1

    :cond_1
    :goto_0
    :pswitch_0
    return v0

    :cond_2
    const-string v2, "flush"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "error"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget v2, p0, Lcom/umeng/analytics/ReportPolicy;->d:I

    packed-switch v2, :pswitch_data_0

    :pswitch_1
    invoke-virtual {p0, p2}, Lcom/umeng/analytics/ReportPolicy;->b(Landroid/content/Context;)I

    move-result v1

    iput v1, p0, Lcom/umeng/analytics/ReportPolicy;->d:I

    goto :goto_0

    :pswitch_2
    const-string v2, "launch"

    if-eq p1, v2, :cond_1

    :cond_3
    move v0, v1

    goto :goto_0

    :pswitch_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/umeng/analytics/ReportPolicy;->e:J

    sub-long/2addr v2, v4

    iget-wide v4, p0, Lcom/umeng/analytics/ReportPolicy;->f:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_3

    goto :goto_0

    :pswitch_4
    const-string v2, "terminate"

    if-ne p1, v2, :cond_3

    goto :goto_0

    :pswitch_5
    invoke-static {p2}, Lcom/umeng/analytics/h;->d(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-static {}, Lcom/umeng/common/b;->c()Ljava/lang/String;

    move-result-object v3

    const-string v4, "false"

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "true"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "launch"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_4
    move v0, v1

    goto :goto_0

    :pswitch_6
    invoke-static {p2}, Lcom/umeng/common/b;->k(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_5
        :pswitch_6
        :pswitch_3
    .end packed-switch
.end method

.method b(Landroid/content/Context;)I
    .locals 4

    const/4 v3, 0x1

    const/4 v2, -0x1

    invoke-static {p1}, Lcom/umeng/analytics/h;->b(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "umeng_net_report_policy"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    if-eq v1, v2, :cond_0

    const-string v1, "umeng_net_report_policy"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const-string v1, "umeng_local_report_policy"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_0
.end method

.method c(Landroid/content/Context;)V
    .locals 6

    const-wide/16 v4, -0x1

    iget v0, p0, Lcom/umeng/analytics/ReportPolicy;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/ReportPolicy;->b(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/umeng/analytics/ReportPolicy;->d:I

    :cond_0
    iget v0, p0, Lcom/umeng/analytics/ReportPolicy;->d:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    iget-wide v0, p0, Lcom/umeng/analytics/ReportPolicy;->f:J

    cmp-long v0, v0, v4

    if-nez v0, :cond_1

    invoke-static {p1}, Lcom/umeng/analytics/h;->b(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "report_interval"

    sget-wide v2, Lcom/umeng/analytics/ReportPolicy;->c:J

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/umeng/analytics/ReportPolicy;->f:J

    const-string v1, "last_report_time"

    invoke-interface {v0, v1, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/umeng/analytics/ReportPolicy;->e:J

    :cond_1
    return-void
.end method
