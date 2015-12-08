.class public Lezvcard/util/VCardDateFormatter;
.super Ljava/lang/Object;
.source "VCardDateFormatter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/util/VCardDateFormatter$1;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    return-void
.end method

.method public static format(Ljava/util/Date;Lezvcard/util/ISOFormat;)Ljava/lang/String;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "format"    # Lezvcard/util/ISOFormat;

    .prologue
    .line 50
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lezvcard/util/VCardDateFormatter;->format(Ljava/util/Date;Lezvcard/util/ISOFormat;Ljava/util/TimeZone;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static format(Ljava/util/Date;Lezvcard/util/ISOFormat;Ljava/util/TimeZone;)Ljava/lang/String;
    .locals 4
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "format"    # Lezvcard/util/ISOFormat;
    .param p2, "timeZone"    # Ljava/util/TimeZone;

    .prologue
    .line 62
    sget-object v2, Lezvcard/util/VCardDateFormatter$1;->$SwitchMap$ezvcard$util$ISOFormat:[I

    invoke-virtual {p1}, Lezvcard/util/ISOFormat;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 69
    :goto_0
    invoke-virtual {p1}, Lezvcard/util/ISOFormat;->getFormatDateFormat()Ljava/text/DateFormat;

    move-result-object v0

    .line 70
    .local v0, "df":Ljava/text/DateFormat;
    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 71
    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 73
    .local v1, "str":Ljava/lang/String;
    sget-object v2, Lezvcard/util/VCardDateFormatter$1;->$SwitchMap$ezvcard$util$ISOFormat:[I

    invoke-virtual {p1}, Lezvcard/util/ISOFormat;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_1

    .line 81
    :goto_1
    return-object v1

    .line 65
    .end local v0    # "df":Ljava/text/DateFormat;
    .end local v1    # "str":Ljava/lang/String;
    :pswitch_0
    const-string v2, "UTC"

    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p2

    goto :goto_0

    .line 77
    .restart local v0    # "df":Ljava/text/DateFormat;
    .restart local v1    # "str":Ljava/lang/String;
    :pswitch_1
    const-string v2, "([-\\+]\\d{2})(\\d{2})$"

    const-string v3, "$1:$2"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 62
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 73
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_1
    .end packed-switch
.end method

.method public static parse(Ljava/lang/String;)Ljava/util/Date;
    .locals 9
    .param p0, "dateStr"    # Ljava/lang/String;

    .prologue
    .line 93
    const/4 v4, 0x0

    .line 94
    .local v4, "format":Lezvcard/util/ISOFormat;
    invoke-static {}, Lezvcard/util/ISOFormat;->values()[Lezvcard/util/ISOFormat;

    move-result-object v0

    .local v0, "arr$":[Lezvcard/util/ISOFormat;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_0
    if-ge v5, v6, :cond_0

    aget-object v3, v0, v5

    .line 95
    .local v3, "f":Lezvcard/util/ISOFormat;
    invoke-virtual {v3, p0}, Lezvcard/util/ISOFormat;->matches(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 96
    move-object v4, v3

    .line 100
    .end local v3    # "f":Lezvcard/util/ISOFormat;
    :cond_0
    if-nez v4, :cond_2

    .line 101
    new-instance v7, Ljava/lang/IllegalArgumentException;

    const-string v8, "Date string is not in a valid ISO-8601 format."

    invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 94
    .restart local v3    # "f":Lezvcard/util/ISOFormat;
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 105
    .end local v3    # "f":Lezvcard/util/ISOFormat;
    :cond_2
    sget-object v7, Lezvcard/util/VCardDateFormatter$1;->$SwitchMap$ezvcard$util$ISOFormat:[I

    invoke-virtual {v4}, Lezvcard/util/ISOFormat;->ordinal()I

    move-result v8

    aget v7, v7, v8

    packed-switch v7, :pswitch_data_0

    .line 120
    :goto_1
    invoke-virtual {v4}, Lezvcard/util/ISOFormat;->getParseDateFormat()Ljava/text/DateFormat;

    move-result-object v1

    .line 122
    .local v1, "df":Ljava/text/DateFormat;
    :try_start_0
    invoke-virtual {v1, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    return-object v7

    .line 110
    .end local v1    # "df":Ljava/text/DateFormat;
    :pswitch_0
    const-string v7, "([-\\+]\\d{2}):(\\d{2})$"

    const-string v8, "$1$2"

    invoke-virtual {p0, v7, v8}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 111
    goto :goto_1

    .line 115
    :pswitch_1
    const-string v7, "Z"

    const-string v8, "+0000"

    invoke-virtual {p0, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    .line 123
    .restart local v1    # "df":Ljava/text/DateFormat;
    :catch_0
    move-exception v2

    .line 125
    .local v2, "e":Ljava/text/ParseException;
    new-instance v7, Ljava/lang/RuntimeException;

    invoke-direct {v7, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v7

    .line 105
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static parseTimeZoneId(Ljava/lang/String;)Ljava/util/TimeZone;
    .locals 3
    .param p0, "timezoneId"    # Ljava/lang/String;

    .prologue
    .line 135
    invoke-static {p0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    .line 136
    .local v0, "timezone":Ljava/util/TimeZone;
    const-string v1, "GMT"

    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .end local v0    # "timezone":Ljava/util/TimeZone;
    :cond_0
    return-object v0
.end method
