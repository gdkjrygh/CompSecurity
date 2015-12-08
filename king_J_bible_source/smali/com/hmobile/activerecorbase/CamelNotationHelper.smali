.class public Lcom/hmobile/activerecorbase/CamelNotationHelper;
.super Ljava/lang/Object;
.source "CamelNotationHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    return-void
.end method

.method public static toJavaClassName(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0, "sqlNotation"    # Ljava/lang/String;

    .prologue
    .line 104
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .local v3, "sb":Ljava/lang/StringBuilder;
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 106
    .local v0, "buf":[C
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v4, v0

    if-lt v2, v4, :cond_0

    .line 119
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4

    .line 107
    :cond_0
    aget-char v1, v0, v2

    .line 108
    .local v1, "c":C
    if-nez v2, :cond_2

    .line 109
    aget-char v4, v0, v2

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 110
    :cond_2
    const/16 v4, 0x5f

    if-eq v1, v4, :cond_3

    .line 111
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 113
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 114
    array-length v4, v0

    if-ge v2, v4, :cond_1

    .line 115
    aget-char v4, v0, v2

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1
.end method

.method public static toJavaMethodName(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p0, "sqlNotation"    # Ljava/lang/String;

    .prologue
    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .local v1, "dest":Ljava/lang/StringBuilder;
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    .line 77
    .local v4, "src":[C
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v5, v4

    if-lt v2, v5, :cond_0

    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    return-object v5

    .line 78
    :cond_0
    aget-char v0, v4, v2

    .line 79
    .local v0, "c":C
    if-nez v2, :cond_3

    const/4 v3, 0x1

    .line 81
    .local v3, "isFirstChar":Z
    :goto_1
    if-nez v3, :cond_1

    const/16 v5, 0x5f

    if-eq v0, v5, :cond_4

    .line 82
    :cond_1
    invoke-static {v0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 79
    .end local v3    # "isFirstChar":Z
    :cond_3
    const/4 v3, 0x0

    goto :goto_1

    .line 84
    .restart local v3    # "isFirstChar":Z
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 85
    array-length v5, v4

    if-ge v2, v5, :cond_2

    .line 86
    aget-char v5, v4, v2

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2
.end method

.method public static toSQLName(Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .param p0, "javaNotation"    # Ljava/lang/String;

    .prologue
    const/16 v10, 0x5f

    const/4 v7, 0x0

    .line 27
    const-string v8, "_id"

    invoke-virtual {p0, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 28
    const-string v7, "_id"

    .line 60
    :goto_0
    return-object v7

    .line 30
    :cond_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .local v6, "sb":Ljava/lang/StringBuilder;
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 33
    .local v0, "buf":[C
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_1
    array-length v8, v0

    if-lt v2, v8, :cond_1

    .line 60
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 34
    :cond_1
    if-lez v2, :cond_4

    add-int/lit8 v8, v2, -0x1

    aget-char v5, v0, v8

    .line 35
    .local v5, "prevChar":C
    :goto_2
    aget-char v1, v0, v2

    .line 36
    .local v1, "c":C
    array-length v8, v0

    add-int/lit8 v8, v8, -0x1

    if-ge v2, v8, :cond_5

    add-int/lit8 v8, v2, 0x1

    aget-char v4, v0, v8

    .line 37
    .local v4, "nextChar":C
    :goto_3
    if-nez v2, :cond_6

    const/4 v3, 0x1

    .line 43
    .local v3, "isFirstChar":Z
    :goto_4
    if-nez v3, :cond_2

    invoke-static {v1}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 44
    :cond_2
    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    :cond_3
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .end local v1    # "c":C
    .end local v3    # "isFirstChar":Z
    .end local v4    # "nextChar":C
    .end local v5    # "prevChar":C
    :cond_4
    move v5, v7

    .line 34
    goto :goto_2

    .restart local v1    # "c":C
    .restart local v5    # "prevChar":C
    :cond_5
    move v4, v7

    .line 36
    goto :goto_3

    .restart local v4    # "nextChar":C
    :cond_6
    move v3, v7

    .line 37
    goto :goto_4

    .line 45
    .restart local v3    # "isFirstChar":Z
    :cond_7
    invoke-static {v1}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 46
    invoke-static {v5}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v8

    if-eqz v8, :cond_a

    .line 47
    invoke-static {v5}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 48
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 49
    :cond_8
    if-lez v4, :cond_9

    invoke-static {v4}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v8

    if-eqz v8, :cond_9

    .line 50
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 52
    :cond_9
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 55
    :cond_a
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_5
.end method
