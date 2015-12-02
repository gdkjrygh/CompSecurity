.class public Lcom/android/volley/toolbox/d;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 111
    :try_start_0
    invoke-static {p0}, Lorg/apache/http/impl/cookie/DateUtils;->parseDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Lorg/apache/http/impl/cookie/DateParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 114
    :goto_0
    return-wide v0

    .line 112
    :catch_0
    move-exception v0

    .line 114
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lcom/android/volley/i;)Lcom/android/volley/a$a;
    .locals 15

    .prologue
    const/4 v6, 0x0

    const-wide/16 v4, 0x0

    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 43
    iget-object v14, p0, Lcom/android/volley/i;->c:Ljava/util/Map;

    .line 54
    const-string/jumbo v0, "Date"

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 55
    if-eqz v0, :cond_a

    .line 56
    invoke-static {v0}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;)J

    move-result-wide v0

    move-wide v2, v0

    .line 59
    :goto_0
    const-string/jumbo v0, "Cache-Control"

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 60
    if-eqz v0, :cond_9

    .line 61
    const/4 v1, 0x1

    .line 62
    const-string/jumbo v7, ","

    invoke-virtual {v0, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    move v0, v6

    move-wide v6, v4

    .line 63
    :goto_1
    array-length v9, v8

    if-lt v0, v9, :cond_1

    move-wide v8, v6

    move v6, v1

    .line 78
    :goto_2
    const-string/jumbo v0, "Expires"

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 79
    if-eqz v0, :cond_8

    .line 80
    invoke-static {v0}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;)J

    move-result-wide v0

    move-wide v10, v0

    .line 83
    :goto_3
    const-string/jumbo v0, "ETag"

    invoke-interface {v14, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 87
    if-eqz v6, :cond_7

    .line 88
    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, v8

    add-long/2addr v4, v12

    .line 94
    :cond_0
    :goto_4
    new-instance v1, Lcom/android/volley/a$a;

    invoke-direct {v1}, Lcom/android/volley/a$a;-><init>()V

    .line 95
    iget-object v6, p0, Lcom/android/volley/i;->b:[B

    iput-object v6, v1, Lcom/android/volley/a$a;->a:[B

    .line 96
    iput-object v0, v1, Lcom/android/volley/a$a;->b:Ljava/lang/String;

    .line 97
    iput-wide v4, v1, Lcom/android/volley/a$a;->e:J

    .line 98
    iget-wide v4, v1, Lcom/android/volley/a$a;->e:J

    iput-wide v4, v1, Lcom/android/volley/a$a;->d:J

    .line 99
    iput-wide v2, v1, Lcom/android/volley/a$a;->c:J

    .line 100
    iput-object v14, v1, Lcom/android/volley/a$a;->f:Ljava/util/Map;

    move-object v0, v1

    .line 102
    :goto_5
    return-object v0

    .line 64
    :cond_1
    aget-object v9, v8, v0

    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    .line 65
    const-string/jumbo v10, "no-cache"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string/jumbo v10, "no-store"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 66
    :cond_2
    const/4 v0, 0x0

    goto :goto_5

    .line 67
    :cond_3
    const-string/jumbo v10, "max-age="

    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 69
    const/16 v10, 0x8

    :try_start_0
    invoke-virtual {v9, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v6

    .line 63
    :cond_4
    :goto_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 72
    :cond_5
    const-string/jumbo v10, "must-revalidate"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    const-string/jumbo v10, "proxy-revalidate"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    :cond_6
    move-wide v6, v4

    .line 73
    goto :goto_6

    .line 89
    :cond_7
    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    cmp-long v1, v10, v2

    if-ltz v1, :cond_0

    .line 91
    sub-long v4, v10, v2

    add-long/2addr v4, v12

    goto :goto_4

    .line 70
    :catch_0
    move-exception v9

    goto :goto_6

    :cond_8
    move-wide v10, v4

    goto :goto_3

    :cond_9
    move-wide v8, v4

    goto/16 :goto_2

    :cond_a
    move-wide v2, v4

    goto/16 :goto_0
.end method

.method public static a(Ljava/util/Map;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 123
    const-string/jumbo v0, "Content-Type"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 124
    if-eqz v0, :cond_0

    .line 125
    const-string/jumbo v2, ";"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    move v0, v1

    .line 126
    :goto_0
    array-length v3, v2

    if-lt v0, v3, :cond_1

    .line 136
    :cond_0
    const-string/jumbo v0, "ISO-8859-1"

    :goto_1
    return-object v0

    .line 127
    :cond_1
    aget-object v3, v2, v0

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 128
    array-length v4, v3

    const/4 v5, 0x2

    if-ne v4, v5, :cond_2

    .line 129
    const/4 v4, 0x0

    aget-object v4, v3, v4

    const-string/jumbo v5, "charset"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 130
    aget-object v0, v3, v1

    goto :goto_1

    .line 126
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
