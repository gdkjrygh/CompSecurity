.class public Lcom/thetransitapp/droid/model/ServiceDay;
.super Ljava/lang/Object;
.source "ServiceDay.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x3610c56dfc9d46ccL


# instance fields
.field private date:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/model/ServiceDay;->getMidnight(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/model/ServiceDay;->date:Ljava/util/Date;

    .line 22
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2
    .param p1, "dayOffset"    # I

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 26
    .local v0, "calendar":Ljava/util/Calendar;
    const/4 v1, 0x6

    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->add(II)V

    .line 28
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/thetransitapp/droid/model/ServiceDay;->getMidnight(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v1

    iput-object v1, p0, Lcom/thetransitapp/droid/model/ServiceDay;->date:Ljava/util/Date;

    .line 29
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3
    .param p1, "serviceDate"    # Ljava/lang/String;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 36
    .local v0, "tempDate":Ljava/util/Date;
    if-eqz p1, :cond_0

    .line 37
    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy-MM-dd"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 43
    :cond_0
    :goto_0
    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/model/ServiceDay;->getMidnight(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v1

    iput-object v1, p0, Lcom/thetransitapp/droid/model/ServiceDay;->date:Ljava/util/Date;

    .line 44
    return-void

    .line 39
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static getActiveServiceDates()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ServiceDay;",
            ">;"
        }
    .end annotation

    .prologue
    .line 47
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .local v1, "serviceDays":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ServiceDay;>;"
    new-instance v2, Lcom/thetransitapp/droid/model/ServiceDay;

    invoke-direct {v2}, Lcom/thetransitapp/droid/model/ServiceDay;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    const/16 v3, 0xb

    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 52
    .local v0, "hour":I
    const/16 v2, 0x8

    if-ge v0, v2, :cond_1

    .line 53
    new-instance v2, Lcom/thetransitapp/droid/model/ServiceDay;

    const/4 v3, -0x1

    invoke-direct {v2, v3}, Lcom/thetransitapp/droid/model/ServiceDay;-><init>(I)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    :cond_0
    :goto_0
    return-object v1

    .line 54
    :cond_1
    const/16 v2, 0x16

    if-lt v0, v2, :cond_0

    .line 55
    new-instance v2, Lcom/thetransitapp/droid/model/ServiceDay;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/thetransitapp/droid/model/ServiceDay;-><init>(I)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private getMidnight(Ljava/util/Date;)Ljava/util/Date;
    .locals 3
    .param p1, "date"    # Ljava/util/Date;

    .prologue
    const/4 v2, 0x0

    .line 105
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 106
    .local v0, "calendar":Ljava/util/Calendar;
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 107
    const/16 v1, 0xb

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 108
    const/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 109
    const/16 v1, 0xd

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 110
    const/16 v1, 0xe

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 112
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    return-object v1
.end method

.method public static getNextWeekServiceDates()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/ServiceDay;",
            ">;"
        }
    .end annotation

    .prologue
    .line 62
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .local v1, "serviceDays":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/ServiceDay;>;"
    const/4 v0, 0x0

    .local v0, "day":I
    :goto_0
    const/4 v2, 0x7

    if-le v0, v2, :cond_0

    .line 68
    return-object v1

    .line 65
    :cond_0
    new-instance v2, Lcom/thetransitapp/droid/model/ServiceDay;

    invoke-direct {v2, v0}, Lcom/thetransitapp/droid/model/ServiceDay;-><init>(I)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 122
    instance-of v1, p1, Lcom/thetransitapp/droid/model/ServiceDay;

    if-nez v1, :cond_0

    .line 123
    const/4 v1, 0x0

    .line 127
    :goto_0
    return v1

    :cond_0
    move-object v0, p1

    .line 126
    check-cast v0, Lcom/thetransitapp/droid/model/ServiceDay;

    .line 127
    .local v0, "seviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    iget-object v1, p0, Lcom/thetransitapp/droid/model/ServiceDay;->date:Ljava/util/Date;

    iget-object v2, v0, Lcom/thetransitapp/droid/model/ServiceDay;->date:Ljava/util/Date;

    invoke-virtual {v1, v2}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0
.end method

.method public getDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ServiceDay;->date:Ljava/util/Date;

    return-object v0
.end method

.method public getDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 10
    .param p1, "stopTime"    # Ljava/lang/String;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .prologue
    const/16 v9, 0xc

    const/16 v8, 0xb

    .line 73
    const/4 v0, 0x0

    .line 77
    .local v0, "addDay":I
    const/4 v6, 0x0

    :try_start_0
    const-string v7, ":"

    invoke-virtual {p1, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {p1, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    .line 79
    .local v3, "hours":I
    const/16 v6, 0x17

    if-le v3, v6, :cond_0

    .line 80
    add-int/lit8 v0, v0, 0x1

    .line 87
    .end local v3    # "hours":I
    :cond_0
    :goto_0
    :try_start_1
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v7, "HH:mm"

    invoke-direct {v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v4

    .line 92
    .local v4, "tempDate":Ljava/util/Date;
    :goto_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 93
    .local v1, "calendar":Ljava/util/Calendar;
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 95
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 96
    .local v5, "value":Ljava/util/Calendar;
    iget-object v6, p0, Lcom/thetransitapp/droid/model/ServiceDay;->date:Ljava/util/Date;

    invoke-virtual {v5, v6}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 97
    invoke-virtual {v1, v8}, Ljava/util/Calendar;->get(I)I

    move-result v6

    invoke-virtual {v5, v8, v6}, Ljava/util/Calendar;->set(II)V

    .line 98
    invoke-virtual {v1, v9}, Ljava/util/Calendar;->get(I)I

    move-result v6

    invoke-virtual {v5, v9, v6}, Ljava/util/Calendar;->set(II)V

    .line 99
    const/4 v6, 0x6

    invoke-virtual {v5, v6, v0}, Ljava/util/Calendar;->add(II)V

    .line 101
    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v6

    return-object v6

    .line 88
    .end local v1    # "calendar":Ljava/util/Calendar;
    .end local v4    # "tempDate":Ljava/util/Date;
    .end local v5    # "value":Ljava/util/Calendar;
    :catch_0
    move-exception v2

    .line 89
    .local v2, "e":Ljava/text/ParseException;
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .restart local v4    # "tempDate":Ljava/util/Date;
    goto :goto_1

    .line 82
    .end local v2    # "e":Ljava/text/ParseException;
    .end local v4    # "tempDate":Ljava/util/Date;
    :catch_1
    move-exception v6

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/thetransitapp/droid/model/ServiceDay;->date:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    return v0
.end method
