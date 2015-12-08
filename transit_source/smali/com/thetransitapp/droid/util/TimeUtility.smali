.class public final Lcom/thetransitapp/droid/util/TimeUtility;
.super Ljava/lang/Object;
.source "TimeUtility.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
.end method

.method public static getNextSchedule(Lcom/thetransitapp/droid/model/Schedule;)Lcom/thetransitapp/droid/model/ScheduleItem;
    .locals 6
    .param p0, "schedule"    # Lcom/thetransitapp/droid/model/Schedule;

    .prologue
    .line 21
    const/4 v2, 0x0

    .line 22
    .local v2, "next":Lcom/thetransitapp/droid/model/ScheduleItem;
    const v1, 0x7fffffff

    .line 25
    .local v1, "minTime":I
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/Schedule;->getScheduleItems()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 34
    return-object v2

    .line 25
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/ScheduleItem;

    .line 26
    .local v0, "item":Lcom/thetransitapp/droid/model/ScheduleItem;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getMinutesRemaining()I

    move-result v3

    .line 28
    .local v3, "time":I
    if-le v1, v3, :cond_0

    if-lez v3, :cond_0

    .line 29
    move-object v2, v0

    .line 30
    move v1, v3

    goto :goto_0
.end method

.method public static getNextStopTime(Lcom/thetransitapp/droid/model/Schedule;)I
    .locals 2
    .param p0, "schedule"    # Lcom/thetransitapp/droid/model/Schedule;

    .prologue
    .line 11
    invoke-static {p0}, Lcom/thetransitapp/droid/util/TimeUtility;->getNextSchedule(Lcom/thetransitapp/droid/model/Schedule;)Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v0

    .line 13
    .local v0, "scheduleItem":Lcom/thetransitapp/droid/model/ScheduleItem;
    if-eqz v0, :cond_0

    .line 14
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/ScheduleItem;->getMinutesRemaining()I

    move-result v1

    .line 16
    :goto_0
    return v1

    :cond_0
    const/4 v1, -0x1

    goto :goto_0
.end method
