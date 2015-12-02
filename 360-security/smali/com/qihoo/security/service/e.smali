.class public Lcom/qihoo/security/service/e;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Z

.field private static b:Ljava/lang/String;

.field private static c:J

.field private static d:Z

.field private static e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 20
    sput-boolean v2, Lcom/qihoo/security/service/e;->a:Z

    .line 22
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/qihoo/security/service/e;->c:J

    .line 23
    sput-boolean v2, Lcom/qihoo/security/service/e;->d:Z

    .line 24
    sput-boolean v2, Lcom/qihoo/security/service/e;->e:Z

    return-void
.end method

.method public static a()V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/service/e;->e:Z

    .line 55
    return-void
.end method

.method public static a(Landroid/content/Context;J)V
    .locals 1

    .prologue
    .line 68
    const-string/jumbo v0, "sp_key_last_scan_time"

    invoke-static {p0, v0, p1, p2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 69
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 27
    invoke-static {p0, p1}, Lcom/qihoo/security/malware/db/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 28
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 29
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->riskClass:I

    if-gt v0, v1, :cond_1

    move v0, v1

    :goto_0
    sput-boolean v0, Lcom/qihoo/security/service/e;->a:Z

    .line 40
    :goto_1
    sput-boolean v2, Lcom/qihoo/security/service/e;->d:Z

    .line 41
    sget-object v0, Lcom/qihoo/security/service/e;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-wide v6, Lcom/qihoo/security/service/e;->c:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0xbb8

    cmp-long v0, v4, v6

    if-gez v0, :cond_3

    :goto_2
    sput-boolean v1, Lcom/qihoo/security/service/e;->d:Z

    .line 45
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/service/e;->b:Ljava/lang/String;

    .line 46
    return-void

    :cond_1
    move v0, v2

    .line 29
    goto :goto_0

    .line 35
    :cond_2
    sput-boolean v2, Lcom/qihoo/security/service/e;->a:Z

    goto :goto_1

    :cond_3
    move v1, v2

    .line 42
    goto :goto_2
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 6

    .prologue
    const/4 v5, 0x6

    const/4 v0, 0x1

    .line 72
    const-string/jumbo v1, "sp_key_last_scan_time"

    const-wide/16 v2, 0x0

    invoke-static {p0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 73
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 74
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 75
    invoke-virtual {v4, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 76
    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-eq v2, v3, :cond_1

    .line 82
    :cond_0
    :goto_0
    return v0

    .line 79
    :cond_1
    invoke-virtual {v4, v5}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v2, v1, :cond_0

    .line 80
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 49
    sput-object p1, Lcom/qihoo/security/service/e;->b:Ljava/lang/String;

    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/qihoo/security/service/e;->c:J

    .line 51
    return-void
.end method

.method public static b()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 58
    sget-boolean v1, Lcom/qihoo/security/service/e;->d:Z

    if-nez v1, :cond_0

    sget-boolean v1, Lcom/qihoo/security/service/e;->e:Z

    if-eqz v1, :cond_1

    :cond_0
    sget-boolean v1, Lcom/qihoo/security/service/e;->a:Z

    if-eqz v1, :cond_1

    .line 63
    :goto_0
    return v0

    .line 61
    :cond_1
    sput-boolean v0, Lcom/qihoo/security/service/e;->d:Z

    .line 62
    sput-boolean v0, Lcom/qihoo/security/service/e;->e:Z

    .line 63
    const/4 v0, 0x1

    goto :goto_0
.end method
