.class public final Lezvcard/util/UtcOffset;
.super Ljava/lang/Object;
.source "UtcOffset.java"


# instance fields
.field private final hour:I

.field private final minute:I


# direct methods
.method public constructor <init>(II)V
    .locals 0
    .param p1, "hour"    # I
    .param p2, "minute"    # I

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput p1, p0, Lezvcard/util/UtcOffset;->hour:I

    .line 47
    iput p2, p0, Lezvcard/util/UtcOffset;->minute:I

    .line 48
    return-void
.end method

.method public static parse(Ljava/lang/String;)Lezvcard/util/UtcOffset;
    .locals 11
    .param p0, "text"    # Ljava/lang/String;

    .prologue
    .line 57
    const-string v8, "^([-\\+])?(\\d{1,2})(:?(\\d{2}))?$"

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v7

    .line 58
    .local v7, "timeZoneRegex":Ljava/util/regex/Pattern;
    invoke-virtual {v7, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 60
    .local v2, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v8

    if-nez v8, :cond_0

    .line 61
    new-instance v8, Ljava/lang/IllegalArgumentException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Offset string is not in ISO8610 format: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 64
    :cond_0
    const/4 v8, 0x1

    invoke-virtual {v2, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    .line 66
    .local v6, "sign":Ljava/lang/String;
    const-string v8, "-"

    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 67
    const/4 v5, 0x0

    .line 72
    .local v5, "positive":Z
    :goto_0
    const/4 v8, 0x2

    invoke-virtual {v2, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 73
    .local v1, "hourStr":Ljava/lang/String;
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 74
    .local v0, "hourOffset":I
    if-nez v5, :cond_1

    .line 75
    mul-int/lit8 v0, v0, -0x1

    .line 78
    :cond_1
    const/4 v8, 0x4

    invoke-virtual {v2, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    .line 79
    .local v4, "minuteStr":Ljava/lang/String;
    if-nez v4, :cond_3

    const/4 v3, 0x0

    .line 81
    .local v3, "minuteOffset":I
    :goto_1
    new-instance v8, Lezvcard/util/UtcOffset;

    invoke-direct {v8, v0, v3}, Lezvcard/util/UtcOffset;-><init>(II)V

    return-object v8

    .line 69
    .end local v0    # "hourOffset":I
    .end local v1    # "hourStr":Ljava/lang/String;
    .end local v3    # "minuteOffset":I
    .end local v4    # "minuteStr":Ljava/lang/String;
    .end local v5    # "positive":Z
    :cond_2
    const/4 v5, 0x1

    .restart local v5    # "positive":Z
    goto :goto_0

    .line 79
    .restart local v0    # "hourOffset":I
    .restart local v1    # "hourStr":Ljava/lang/String;
    .restart local v4    # "minuteStr":Ljava/lang/String;
    :cond_3
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    goto :goto_1
.end method

.method public static parse(Ljava/util/TimeZone;)Lezvcard/util/UtcOffset;
    .locals 10
    .param p0, "timezone"    # Ljava/util/TimeZone;

    .prologue
    const-wide/16 v8, 0x3e8

    const-wide/16 v6, 0x3c

    .line 90
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p0, v4, v5}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v4

    int-to-long v2, v4

    .line 91
    .local v2, "offsetMs":J
    div-long v4, v2, v8

    div-long/2addr v4, v6

    div-long/2addr v4, v6

    long-to-int v0, v4

    .line 92
    .local v0, "hours":I
    div-long v4, v2, v8

    div-long/2addr v4, v6

    rem-long/2addr v4, v6

    long-to-int v1, v4

    .line 93
    .local v1, "minutes":I
    if-gez v1, :cond_0

    .line 94
    mul-int/lit8 v1, v1, -0x1

    .line 96
    :cond_0
    new-instance v4, Lezvcard/util/UtcOffset;

    invoke-direct {v4, v0, v1}, Lezvcard/util/UtcOffset;-><init>(II)V

    return-object v4
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 166
    if-ne p0, p1, :cond_1

    .line 177
    :cond_0
    :goto_0
    return v1

    .line 168
    :cond_1
    if-nez p1, :cond_2

    move v1, v2

    .line 169
    goto :goto_0

    .line 170
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_3

    move v1, v2

    .line 171
    goto :goto_0

    :cond_3
    move-object v0, p1

    .line 172
    check-cast v0, Lezvcard/util/UtcOffset;

    .line 173
    .local v0, "other":Lezvcard/util/UtcOffset;
    iget v3, p0, Lezvcard/util/UtcOffset;->hour:I

    iget v4, v0, Lezvcard/util/UtcOffset;->hour:I

    if-eq v3, v4, :cond_4

    move v1, v2

    .line 174
    goto :goto_0

    .line 175
    :cond_4
    iget v3, p0, Lezvcard/util/UtcOffset;->minute:I

    iget v4, v0, Lezvcard/util/UtcOffset;->minute:I

    if-eq v3, v4, :cond_0

    move v1, v2

    .line 176
    goto :goto_0
.end method

.method public getHour()I
    .locals 1

    .prologue
    .line 104
    iget v0, p0, Lezvcard/util/UtcOffset;->hour:I

    return v0
.end method

.method public getMinute()I
    .locals 1

    .prologue
    .line 112
    iget v0, p0, Lezvcard/util/UtcOffset;->minute:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    .prologue
    .line 157
    const/16 v0, 0x1f

    .line 158
    .local v0, "prime":I
    const/4 v1, 0x1

    .line 159
    .local v1, "result":I
    iget v2, p0, Lezvcard/util/UtcOffset;->hour:I

    add-int/lit8 v1, v2, 0x1f

    .line 160
    mul-int/lit8 v2, v1, 0x1f

    iget v3, p0, Lezvcard/util/UtcOffset;->minute:I

    add-int v1, v2, v3

    .line 161
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 122
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lezvcard/util/UtcOffset;->toString(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Z)Ljava/lang/String;
    .locals 6
    .param p1, "extended"    # Z

    .prologue
    const/16 v5, 0x30

    const/16 v4, 0xa

    .line 132
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .local v2, "sb":Ljava/lang/StringBuilder;
    iget v3, p0, Lezvcard/util/UtcOffset;->hour:I

    if-ltz v3, :cond_3

    const/4 v1, 0x1

    .line 135
    .local v1, "positive":Z
    :goto_0
    if-eqz v1, :cond_4

    const/16 v3, 0x2b

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 137
    iget v3, p0, Lezvcard/util/UtcOffset;->hour:I

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 138
    .local v0, "hour":I
    if-ge v0, v4, :cond_0

    .line 139
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 141
    :cond_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    if-eqz p1, :cond_1

    .line 144
    const/16 v3, 0x3a

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 147
    :cond_1
    iget v3, p0, Lezvcard/util/UtcOffset;->minute:I

    if-ge v3, v4, :cond_2

    .line 148
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 150
    :cond_2
    iget v3, p0, Lezvcard/util/UtcOffset;->minute:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 152
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 134
    .end local v0    # "hour":I
    .end local v1    # "positive":Z
    :cond_3
    const/4 v1, 0x0

    goto :goto_0

    .line 135
    .restart local v1    # "positive":Z
    :cond_4
    const/16 v3, 0x2d

    goto :goto_1
.end method
