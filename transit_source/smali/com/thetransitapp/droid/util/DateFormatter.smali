.class public Lcom/thetransitapp/droid/util/DateFormatter;
.super Ljava/lang/Object;
.source "DateFormatter.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$thetransitapp$droid$util$DateFormatter$DateFormatterType:[I = null

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private dateFormat:Ljava/lang/String;

.field private type:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;


# direct methods
.method static synthetic $SWITCH_TABLE$com$thetransitapp$droid$util$DateFormatter$DateFormatterType()[I
    .locals 3

    .prologue
    .line 11
    sget-object v0, Lcom/thetransitapp/droid/util/DateFormatter;->$SWITCH_TABLE$com$thetransitapp$droid$util$DateFormatter$DateFormatterType:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->values()[Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->DELAY:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_6

    :goto_1
    :try_start_1
    sget-object v1, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->EPOCH:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_5

    :goto_2
    :try_start_2
    sget-object v1, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->EPOCH_MILLISEC:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_4

    :goto_3
    :try_start_3
    sget-object v1, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->MINUTES_AGO:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :goto_4
    :try_start_4
    sget-object v1, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->MINUTE_DELAY:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_2

    :goto_5
    :try_start_5
    sget-object v1, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->OTHER:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_1

    :goto_6
    :try_start_6
    sget-object v1, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->SECONDS_AGO:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_0

    :goto_7
    sput-object v0, Lcom/thetransitapp/droid/util/DateFormatter;->$SWITCH_TABLE$com$thetransitapp$droid$util$DateFormatter$DateFormatterType:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_7

    :catch_1
    move-exception v1

    goto :goto_6

    :catch_2
    move-exception v1

    goto :goto_5

    :catch_3
    move-exception v1

    goto :goto_4

    :catch_4
    move-exception v1

    goto :goto_3

    :catch_5
    move-exception v1

    goto :goto_2

    :catch_6
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "format"    # Ljava/lang/String;

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const-string v0, "epoch"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    sget-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->EPOCH:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    iput-object v0, p0, Lcom/thetransitapp/droid/util/DateFormatter;->type:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    .line 38
    :goto_0
    return-void

    .line 24
    :cond_0
    const-string v0, "epoch-milli"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 25
    sget-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->EPOCH_MILLISEC:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    iput-object v0, p0, Lcom/thetransitapp/droid/util/DateFormatter;->type:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    goto :goto_0

    .line 26
    :cond_1
    const-string v0, "delay"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 27
    sget-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->DELAY:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    iput-object v0, p0, Lcom/thetransitapp/droid/util/DateFormatter;->type:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    goto :goto_0

    .line 28
    :cond_2
    const-string v0, "minutes-delay"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 29
    sget-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->MINUTE_DELAY:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    iput-object v0, p0, Lcom/thetransitapp/droid/util/DateFormatter;->type:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    goto :goto_0

    .line 30
    :cond_3
    const-string v0, "seconds-ago"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 31
    sget-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->SECONDS_AGO:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    iput-object v0, p0, Lcom/thetransitapp/droid/util/DateFormatter;->type:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    goto :goto_0

    .line 32
    :cond_4
    const-string v0, "minutes-ago"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 33
    sget-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->MINUTES_AGO:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    iput-object v0, p0, Lcom/thetransitapp/droid/util/DateFormatter;->type:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    goto :goto_0

    .line 35
    :cond_5
    sget-object v0, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->OTHER:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    iput-object v0, p0, Lcom/thetransitapp/droid/util/DateFormatter;->type:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    .line 36
    iput-object p1, p0, Lcom/thetransitapp/droid/util/DateFormatter;->dateFormat:Ljava/lang/String;

    goto :goto_0
.end method

.method private getDoubleValue(Ljava/lang/String;)D
    .locals 5
    .param p1, "string"    # Ljava/lang/String;

    .prologue
    .line 86
    const-string v2, "[^0-9]"

    const-string v3, ""

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 88
    .local v1, "value":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 90
    :try_start_0
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    .line 96
    :goto_0
    return-wide v2

    .line 91
    :catch_0
    move-exception v0

    .line 92
    .local v0, "e":Ljava/lang/NumberFormatException;
    const-string v2, "DateFormatter"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error parsing double "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    .end local v0    # "e":Ljava/lang/NumberFormatException;
    :cond_0
    const-wide/16 v2, 0x0

    goto :goto_0
.end method

.method private getLongValue(Ljava/lang/String;)J
    .locals 5
    .param p1, "string"    # Ljava/lang/String;

    .prologue
    .line 100
    const-string v2, "[^0-9]"

    const-string v3, ""

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 102
    .local v1, "value":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 104
    :try_start_0
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    .line 110
    :goto_0
    return-wide v2

    .line 105
    :catch_0
    move-exception v0

    .line 106
    .local v0, "e":Ljava/lang/NumberFormatException;
    const-string v2, "DateFormatter"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error parsing long "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    .end local v0    # "e":Ljava/lang/NumberFormatException;
    :cond_0
    const-wide/16 v2, 0x0

    goto :goto_0
.end method


# virtual methods
.method public format(Ljava/lang/String;)Ljava/util/Date;
    .locals 12
    .param p1, "string"    # Ljava/lang/String;

    .prologue
    const-wide/16 v6, 0x0

    const/4 v3, 0x0

    const-wide/16 v10, 0x3e8

    .line 41
    invoke-static {}, Lcom/thetransitapp/droid/util/DateFormatter;->$SWITCH_TABLE$com$thetransitapp$droid$util$DateFormatter$DateFormatterType()[I

    move-result-object v4

    iget-object v5, p0, Lcom/thetransitapp/droid/util/DateFormatter;->type:Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/util/DateFormatter$DateFormatterType;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 82
    :cond_0
    :goto_0
    return-object v3

    .line 43
    :pswitch_0
    new-instance v3, Ljava/util/Date;

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/util/DateFormatter;->getDoubleValue(Ljava/lang/String;)D

    move-result-wide v6

    double-to-long v6, v6

    mul-long/2addr v6, v10

    add-long/2addr v4, v6

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    goto :goto_0

    .line 45
    :pswitch_1
    new-instance v3, Ljava/util/Date;

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/util/DateFormatter;->getDoubleValue(Ljava/lang/String;)D

    move-result-wide v6

    const-wide/high16 v8, 0x404e000000000000L    # 60.0

    mul-double/2addr v6, v8

    const-wide v8, 0x4041800000000000L    # 35.0

    add-double/2addr v6, v8

    double-to-long v6, v6

    mul-long/2addr v6, v10

    add-long/2addr v4, v6

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    goto :goto_0

    .line 47
    :pswitch_2
    new-instance v3, Ljava/util/Date;

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/util/DateFormatter;->getDoubleValue(Ljava/lang/String;)D

    move-result-wide v6

    neg-double v6, v6

    double-to-long v6, v6

    mul-long/2addr v6, v10

    add-long/2addr v4, v6

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    goto :goto_0

    .line 49
    :pswitch_3
    new-instance v3, Ljava/util/Date;

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/util/DateFormatter;->getDoubleValue(Ljava/lang/String;)D

    move-result-wide v6

    neg-double v6, v6

    double-to-long v6, v6

    const-wide/16 v8, 0x3c

    mul-long/2addr v6, v8

    mul-long/2addr v6, v10

    add-long/2addr v4, v6

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    goto :goto_0

    .line 51
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/util/DateFormatter;->getLongValue(Ljava/lang/String;)J

    move-result-wide v1

    .line 53
    .local v1, "value":J
    cmp-long v4, v1, v6

    if-eqz v4, :cond_0

    .line 57
    new-instance v3, Ljava/util/Date;

    mul-long v4, v1, v10

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    goto :goto_0

    .line 60
    .end local v1    # "value":J
    :pswitch_5
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/util/DateFormatter;->getLongValue(Ljava/lang/String;)J

    move-result-wide v1

    .line 62
    .restart local v1    # "value":J
    cmp-long v4, v1, v6

    if-eqz v4, :cond_0

    .line 66
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v1, v2}, Ljava/util/Date;-><init>(J)V

    goto/16 :goto_0

    .line 70
    .end local v1    # "value":J
    :pswitch_6
    :try_start_0
    iget-object v4, p0, Lcom/thetransitapp/droid/util/DateFormatter;->dateFormat:Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 71
    iget-object v4, p0, Lcom/thetransitapp/droid/util/DateFormatter;->dateFormat:Ljava/lang/String;

    const-string v5, "\'Z\'"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "Z"

    invoke-virtual {p1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 72
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "Z"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 75
    :cond_1
    new-instance v4, Ljava/text/SimpleDateFormat;

    iget-object v5, p0, Lcom/thetransitapp/droid/util/DateFormatter;->dateFormat:Ljava/lang/String;

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v4, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v4, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    goto/16 :goto_0

    .line 77
    :catch_0
    move-exception v0

    .line 78
    .local v0, "e":Ljava/text/ParseException;
    goto/16 :goto_0

    .line 41
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
