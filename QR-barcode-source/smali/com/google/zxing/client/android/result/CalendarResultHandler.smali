.class public final Lcom/google/zxing/client/android/result/CalendarResultHandler;
.super Lcom/google/zxing/client/android/result/ResultHandler;
.source "CalendarResultHandler.java"


# static fields
.field private static final TAG:Ljava/lang/String;

.field private static final buttons:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 39
    const-class v0, Lcom/google/zxing/client/android/result/CalendarResultHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/zxing/client/android/result/CalendarResultHandler;->TAG:Ljava/lang/String;

    .line 41
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 42
    sget v2, Lcom/google/zxing/client/android/R$string;->button_add_calendar:I

    aput v2, v0, v1

    .line 41
    sput-object v0, Lcom/google/zxing/client/android/result/CalendarResultHandler;->buttons:[I

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "result"    # Lcom/google/zxing/client/result/ParsedResult;

    .prologue
    .line 46
    invoke-direct {p0, p1, p2}, Lcom/google/zxing/client/android/result/ResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;)V

    .line 47
    return-void
.end method

.method private addCalendarEvent(Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 8
    .param p1, "summary"    # Ljava/lang/String;
    .param p2, "start"    # Ljava/util/Date;
    .param p3, "allDay"    # Z
    .param p4, "end"    # Ljava/util/Date;
    .param p5, "location"    # Ljava/lang/String;
    .param p6, "description"    # Ljava/lang/String;
    .param p7, "attendees"    # [Ljava/lang/String;

    .prologue
    .line 103
    new-instance v1, Landroid/content/Intent;

    const-string v6, "android.intent.action.INSERT"

    invoke-direct {v1, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 104
    .local v1, "intent":Landroid/content/Intent;
    const-string v6, "vnd.android.cursor.item/event"

    invoke-virtual {v1, v6}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 105
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    .line 106
    .local v4, "startMilliseconds":J
    const-string v6, "beginTime"

    invoke-virtual {v1, v6, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 107
    if-eqz p3, :cond_0

    .line 108
    const-string v6, "allDay"

    const/4 v7, 0x1

    invoke-virtual {v1, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 111
    :cond_0
    if-nez p4, :cond_3

    .line 112
    if-eqz p3, :cond_2

    .line 114
    const-wide/32 v6, 0x5265c00

    add-long v2, v4, v6

    .line 121
    .local v2, "endMilliseconds":J
    :goto_0
    const-string v6, "endTime"

    invoke-virtual {v1, v6, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 122
    const-string v6, "title"

    invoke-virtual {v1, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 123
    const-string v6, "eventLocation"

    invoke-virtual {v1, v6, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    const-string v6, "description"

    invoke-virtual {v1, v6, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 125
    if-eqz p7, :cond_1

    .line 126
    const-string v6, "android.intent.extra.EMAIL"

    invoke-virtual {v1, v6, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 132
    :cond_1
    :try_start_0
    invoke-virtual {p0, v1}, Lcom/google/zxing/client/android/result/CalendarResultHandler;->rawLaunchIntent(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    :goto_1
    return-void

    .line 116
    .end local v2    # "endMilliseconds":J
    :cond_2
    move-wide v2, v4

    .line 118
    .restart local v2    # "endMilliseconds":J
    goto :goto_0

    .line 119
    .end local v2    # "endMilliseconds":J
    :cond_3
    invoke-virtual {p4}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    .restart local v2    # "endMilliseconds":J
    goto :goto_0

    .line 133
    :catch_0
    move-exception v0

    .line 134
    .local v0, "anfe":Landroid/content/ActivityNotFoundException;
    sget-object v6, Lcom/google/zxing/client/android/result/CalendarResultHandler;->TAG:Ljava/lang/String;

    const-string v7, "No calendar app available that responds to android.intent.action.INSERT"

    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    const-string v6, "android.intent.action.EDIT"

    invoke-virtual {v1, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 137
    invoke-virtual {p0, v1}, Lcom/google/zxing/client/android/result/CalendarResultHandler;->launchIntent(Landroid/content/Intent;)V

    goto :goto_1
.end method

.method private static format(ZLjava/util/Date;)Ljava/lang/String;
    .locals 2
    .param p0, "allDay"    # Z
    .param p1, "date"    # Ljava/util/Date;

    .prologue
    const/4 v1, 0x2

    .line 173
    if-nez p1, :cond_0

    .line 174
    const/4 v1, 0x0

    .line 179
    :goto_0
    return-object v1

    .line 176
    :cond_0
    if-eqz p0, :cond_1

    .line 177
    invoke-static {v1}, Ljava/text/DateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v0

    .line 179
    .local v0, "format":Ljava/text/DateFormat;
    :goto_1
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 178
    .end local v0    # "format":Ljava/text/DateFormat;
    :cond_1
    invoke-static {v1, v1}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object v0

    goto :goto_1
.end method


# virtual methods
.method public getButtonCount()I
    .locals 1

    .prologue
    .line 51
    sget-object v0, Lcom/google/zxing/client/android/result/CalendarResultHandler;->buttons:[I

    array-length v0, v0

    return v0
.end method

.method public getButtonText(I)I
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 56
    sget-object v0, Lcom/google/zxing/client/android/result/CalendarResultHandler;->buttons:[I

    aget v0, v0, p1

    return v0
.end method

.method public getDisplayContents()Ljava/lang/CharSequence;
    .locals 10

    .prologue
    .line 145
    invoke-virtual {p0}, Lcom/google/zxing/client/android/result/CalendarResultHandler;->getResult()Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v0

    check-cast v0, Lcom/google/zxing/client/result/CalendarParsedResult;

    .line 146
    .local v0, "calResult":Lcom/google/zxing/client/result/CalendarParsedResult;
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v5, 0x64

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 148
    .local v3, "result":Ljava/lang/StringBuilder;
    invoke-virtual {v0}, Lcom/google/zxing/client/result/CalendarParsedResult;->getSummary()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 150
    invoke-virtual {v0}, Lcom/google/zxing/client/result/CalendarParsedResult;->getStart()Ljava/util/Date;

    move-result-object v4

    .line 151
    .local v4, "start":Ljava/util/Date;
    invoke-virtual {v0}, Lcom/google/zxing/client/result/CalendarParsedResult;->isStartAllDay()Z

    move-result v5

    invoke-static {v5, v4}, Lcom/google/zxing/client/android/result/CalendarResultHandler;->format(ZLjava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 153
    invoke-virtual {v0}, Lcom/google/zxing/client/result/CalendarParsedResult;->getEnd()Ljava/util/Date;

    move-result-object v1

    .line 154
    .local v1, "end":Ljava/util/Date;
    if-eqz v1, :cond_1

    .line 155
    invoke-virtual {v0}, Lcom/google/zxing/client/result/CalendarParsedResult;->isEndAllDay()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4, v1}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 160
    new-instance v2, Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    const-wide/32 v8, 0x5265c00

    sub-long/2addr v6, v8

    invoke-direct {v2, v6, v7}, Ljava/util/Date;-><init>(J)V

    .end local v1    # "end":Ljava/util/Date;
    .local v2, "end":Ljava/util/Date;
    move-object v1, v2

    .line 162
    .end local v2    # "end":Ljava/util/Date;
    .restart local v1    # "end":Ljava/util/Date;
    :cond_0
    invoke-virtual {v0}, Lcom/google/zxing/client/result/CalendarParsedResult;->isEndAllDay()Z

    move-result v5

    invoke-static {v5, v1}, Lcom/google/zxing/client/android/result/CalendarResultHandler;->format(ZLjava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 165
    :cond_1
    invoke-virtual {v0}, Lcom/google/zxing/client/result/CalendarParsedResult;->getLocation()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 166
    invoke-virtual {v0}, Lcom/google/zxing/client/result/CalendarParsedResult;->getOrganizer()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 167
    invoke-virtual {v0}, Lcom/google/zxing/client/result/CalendarParsedResult;->getAttendees()[Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend([Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 168
    invoke-virtual {v0}, Lcom/google/zxing/client/result/CalendarParsedResult;->getDescription()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 169
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    return-object v5
.end method

.method public getDisplayTitle()I
    .locals 1

    .prologue
    .line 184
    sget v0, Lcom/google/zxing/client/android/R$string;->result_calendar:I

    return v0
.end method

.method public handleButtonPress(I)V
    .locals 10
    .param p1, "index"    # I

    .prologue
    .line 61
    if-nez p1, :cond_1

    .line 62
    invoke-virtual {p0}, Lcom/google/zxing/client/android/result/CalendarResultHandler;->getResult()Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v8

    check-cast v8, Lcom/google/zxing/client/result/CalendarParsedResult;

    .line 64
    .local v8, "calendarResult":Lcom/google/zxing/client/result/CalendarParsedResult;
    invoke-virtual {v8}, Lcom/google/zxing/client/result/CalendarParsedResult;->getDescription()Ljava/lang/String;

    move-result-object v6

    .line 65
    .local v6, "description":Ljava/lang/String;
    invoke-virtual {v8}, Lcom/google/zxing/client/result/CalendarParsedResult;->getOrganizer()Ljava/lang/String;

    move-result-object v9

    .line 66
    .local v9, "organizer":Ljava/lang/String;
    if-eqz v9, :cond_0

    .line 67
    if-nez v6, :cond_2

    .line 68
    move-object v6, v9

    .line 74
    :cond_0
    :goto_0
    invoke-virtual {v8}, Lcom/google/zxing/client/result/CalendarParsedResult;->getSummary()Ljava/lang/String;

    move-result-object v1

    .line 75
    invoke-virtual {v8}, Lcom/google/zxing/client/result/CalendarParsedResult;->getStart()Ljava/util/Date;

    move-result-object v2

    .line 76
    invoke-virtual {v8}, Lcom/google/zxing/client/result/CalendarParsedResult;->isStartAllDay()Z

    move-result v3

    .line 77
    invoke-virtual {v8}, Lcom/google/zxing/client/result/CalendarParsedResult;->getEnd()Ljava/util/Date;

    move-result-object v4

    .line 78
    invoke-virtual {v8}, Lcom/google/zxing/client/result/CalendarParsedResult;->getLocation()Ljava/lang/String;

    move-result-object v5

    .line 80
    invoke-virtual {v8}, Lcom/google/zxing/client/result/CalendarParsedResult;->getAttendees()[Ljava/lang/String;

    move-result-object v7

    move-object v0, p0

    .line 74
    invoke-direct/range {v0 .. v7}, Lcom/google/zxing/client/android/result/CalendarResultHandler;->addCalendarEvent(Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 82
    .end local v6    # "description":Ljava/lang/String;
    .end local v8    # "calendarResult":Lcom/google/zxing/client/result/CalendarParsedResult;
    .end local v9    # "organizer":Ljava/lang/String;
    :cond_1
    return-void

    .line 70
    .restart local v6    # "description":Ljava/lang/String;
    .restart local v8    # "calendarResult":Lcom/google/zxing/client/result/CalendarParsedResult;
    .restart local v9    # "organizer":Ljava/lang/String;
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_0
.end method
