.class public Lcom/cleanmaster/ui/app/market/data/filter/g;
.super Lcom/cleanmaster/ui/app/market/data/filter/b;
.source "SourceFile"


# static fields
.field private static g:Ljava/text/SimpleDateFormat;


# instance fields
.field e:J

.field f:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    sput-object v0, Lcom/cleanmaster/ui/app/market/data/filter/g;->g:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const-wide/16 v0, -0x1

    .line 16
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/data/filter/b;-><init>()V

    .line 17
    iput-wide v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/g;->e:J

    .line 18
    iput-wide v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/g;->f:J

    return-void
.end method

.method public static a(J)Ljava/lang/String;
    .locals 2

    .prologue
    .line 32
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    .line 33
    const-string v0, "N/A"

    .line 46
    :goto_0
    return-object v0

    .line 35
    :cond_0
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 36
    invoke-virtual {v0}, Ljava/util/Date;->getYear()I

    move-result v0

    const/16 v1, 0x46

    if-eq v0, v1, :cond_2

    .line 37
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 38
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 40
    sget-object v0, Lcom/cleanmaster/ui/app/market/data/filter/g;->g:Ljava/text/SimpleDateFormat;

    if-nez v0, :cond_1

    .line 41
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd:hh:mm"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/cleanmaster/ui/app/market/data/filter/g;->g:Ljava/text/SimpleDateFormat;

    .line 44
    :cond_1
    sget-object v0, Lcom/cleanmaster/ui/app/market/data/filter/g;->g:Ljava/text/SimpleDateFormat;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 46
    :cond_2
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "market_unknown_app_install_date"

    invoke-static {v1}, Lcom/cleanmaster/util/q;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static b(J)J
    .locals 4

    .prologue
    .line 75
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 76
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 78
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 79
    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    .line 82
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 86
    :goto_0
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    .line 88
    return-wide v0

    .line 84
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/text/ParseException;->printStackTrace()V

    goto :goto_0
.end method

.method public static b(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/filter/g;
    .locals 10

    .prologue
    const-wide/16 v8, 0x3e8

    const-wide/16 v6, 0x0

    .line 50
    new-instance v1, Lcom/cleanmaster/ui/app/market/data/filter/g;

    invoke-direct {v1}, Lcom/cleanmaster/ui/app/market/data/filter/g;-><init>()V

    .line 52
    :try_start_0
    const-string v0, "time_condition"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    const-string v2, "start_time"

    const-wide/16 v4, -0x1

    invoke-virtual {v0, v2, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/cleanmaster/ui/app/market/data/filter/g;->e:J

    .line 55
    iget-wide v2, v1, Lcom/cleanmaster/ui/app/market/data/filter/g;->e:J

    cmp-long v2, v2, v6

    if-lez v2, :cond_0

    .line 56
    iget-wide v2, v1, Lcom/cleanmaster/ui/app/market/data/filter/g;->e:J

    mul-long/2addr v2, v8

    iput-wide v2, v1, Lcom/cleanmaster/ui/app/market/data/filter/g;->e:J

    .line 57
    iget-wide v2, v1, Lcom/cleanmaster/ui/app/market/data/filter/g;->e:J

    invoke-static {v2, v3}, Lcom/cleanmaster/ui/app/market/data/filter/g;->b(J)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/cleanmaster/ui/app/market/data/filter/g;->e:J

    .line 60
    :cond_0
    const-string v2, "end_time"

    const-wide/16 v4, -0x1

    invoke-virtual {v0, v2, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/cleanmaster/ui/app/market/data/filter/g;->f:J

    .line 61
    iget-wide v2, v1, Lcom/cleanmaster/ui/app/market/data/filter/g;->f:J

    cmp-long v0, v2, v6

    if-lez v0, :cond_1

    .line 62
    iget-wide v2, v1, Lcom/cleanmaster/ui/app/market/data/filter/g;->f:J

    mul-long/2addr v2, v8

    iput-wide v2, v1, Lcom/cleanmaster/ui/app/market/data/filter/g;->f:J

    .line 63
    iget-wide v2, v1, Lcom/cleanmaster/ui/app/market/data/filter/g;->f:J

    invoke-static {v2, v3}, Lcom/cleanmaster/ui/app/market/data/filter/g;->b(J)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/cleanmaster/ui/app/market/data/filter/g;->f:J
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :cond_1
    :goto_0
    return-object v1

    .line 67
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method protected b(Lcom/cleanmaster/ui/app/market/data/filter/a;)Z
    .locals 4

    .prologue
    .line 22
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/data/filter/a;->g()J

    move-result-wide v0

    .line 23
    iget-wide v2, p0, Lcom/cleanmaster/ui/app/market/data/filter/g;->e:J

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    iget-wide v2, p0, Lcom/cleanmaster/ui/app/market/data/filter/g;->f:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    .line 27
    :goto_0
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 27
    goto :goto_0
.end method
