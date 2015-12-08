.class public final Lcom/android/volley/toolbox/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 121
    :try_start_0
    invoke-static {p0}, Lorg/apache/http/impl/cookie/DateUtils;->parseDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Lorg/apache/http/impl/cookie/DateParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 125
    :goto_0
    return-wide v0

    :catch_0
    move-exception v0

    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lcom/android/volley/k;)Lcom/android/volley/b$a;
    .locals 15

    .prologue
    const/4 v6, 0x0

    const-wide/16 v4, 0x0

    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 46
    iget-object v0, p0, Lcom/android/volley/k;->c:Ljava/util/Map;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_0
    move-object v1, v0

    .line 54
    :goto_0
    const-string v0, "date"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 58
    if-eqz v0, :cond_d

    .line 59
    invoke-static {v0}, Lcom/android/volley/toolbox/f;->a(Ljava/lang/String;)J

    move-result-wide v2

    .line 62
    :goto_1
    const-string v0, "cache-control"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 63
    if-eqz v0, :cond_c

    .line 64
    const/4 v8, 0x1

    .line 65
    const-string v7, ","

    invoke-virtual {v0, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    move v0, v6

    move-wide v6, v4

    .line 66
    :goto_2
    array-length v10, v9

    if-ge v0, v10, :cond_8

    .line 67
    aget-object v10, v9, v0

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 68
    const-string v11, "no-cache"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    const-string v11, "no-store"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 69
    :cond_1
    const/4 v0, 0x0

    .line 111
    :goto_3
    return-object v0

    .line 46
    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_3
    move-object v1, v2

    goto :goto_0

    .line 71
    :cond_4
    const-string v11, "max-age="

    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 73
    const/16 v11, 0x8

    :try_start_0
    invoke-virtual {v10, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v6

    .line 66
    :cond_5
    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 78
    :cond_6
    const-string v11, "must-revalidate"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    const-string v11, "proxy-revalidate"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    :cond_7
    move-wide v6, v4

    .line 79
    goto :goto_5

    :cond_8
    move v14, v8

    move-wide v8, v6

    move v6, v14

    .line 84
    :goto_6
    const-string v0, "expires"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 85
    if-eqz v0, :cond_b

    .line 86
    invoke-static {v0}, Lcom/android/volley/toolbox/f;->a(Ljava/lang/String;)J

    move-result-wide v10

    .line 89
    :goto_7
    const-string v0, "etag"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 93
    if-eqz v6, :cond_a

    .line 94
    const-wide/16 v4, 0x3e8

    mul-long/2addr v4, v8

    add-long/2addr v4, v12

    .line 101
    :cond_9
    :goto_8
    new-instance v1, Lcom/android/volley/b$a;

    invoke-direct {v1}, Lcom/android/volley/b$a;-><init>()V

    .line 102
    iget-object v6, p0, Lcom/android/volley/k;->b:[B

    iput-object v6, v1, Lcom/android/volley/b$a;->a:[B

    .line 103
    iput-object v0, v1, Lcom/android/volley/b$a;->b:Ljava/lang/String;

    .line 104
    iput-wide v4, v1, Lcom/android/volley/b$a;->e:J

    .line 105
    iget-wide v4, v1, Lcom/android/volley/b$a;->e:J

    iput-wide v4, v1, Lcom/android/volley/b$a;->d:J

    .line 106
    iput-wide v2, v1, Lcom/android/volley/b$a;->c:J

    .line 109
    iget-object v0, p0, Lcom/android/volley/k;->c:Ljava/util/Map;

    iput-object v0, v1, Lcom/android/volley/b$a;->f:Ljava/util/Map;

    move-object v0, v1

    .line 111
    goto/16 :goto_3

    .line 96
    :cond_a
    cmp-long v1, v2, v4

    if-lez v1, :cond_9

    cmp-long v1, v10, v2

    if-ltz v1, :cond_9

    .line 98
    sub-long v4, v10, v2

    add-long/2addr v4, v12

    goto :goto_8

    .line 76
    :catch_0
    move-exception v10

    goto :goto_5

    :cond_b
    move-wide v10, v4

    goto :goto_7

    :cond_c
    move-wide v8, v4

    goto :goto_6

    :cond_d
    move-wide v2, v4

    goto/16 :goto_1
.end method

.method public static a(Ljava/util/Map;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 135
    const-string v0, "Content-Type"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 136
    if-eqz v0, :cond_1

    .line 137
    const-string v2, ";"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    move v0, v1

    .line 138
    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_1

    .line 139
    aget-object v3, v2, v0

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 140
    array-length v4, v3

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    .line 141
    const/4 v4, 0x0

    aget-object v4, v3, v4

    const-string v5, "charset"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 142
    aget-object v0, v3, v1

    .line 148
    :goto_1
    return-object v0

    .line 138
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 148
    :cond_1
    const-string v0, "ISO-8859-1"

    goto :goto_1
.end method
