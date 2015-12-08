.class Lcom/splunk/mint/StacktraceHash;
.super Ljava/lang/Object;
.source "StacktraceHash.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final manipulateStacktrace(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;
    .locals 21
    .param p0, "packageName"    # Ljava/lang/String;
    .param p1, "stacktrace"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 16
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 17
    :cond_0
    const/4 v11, 0x0

    .line 132
    :goto_0
    return-object v11

    .line 19
    :cond_1
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 21
    .local v11, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v7, 0x0

    .line 22
    .local v7, "klass":Ljava/lang/String;
    const/16 v17, 0x0

    .line 23
    .local v17, "where":Ljava/lang/String;
    const/4 v9, 0x0

    .line 24
    .local v9, "library":Ljava/lang/String;
    const/4 v4, 0x0

    .line 25
    .local v4, "errorHash":Ljava/lang/String;
    const/4 v12, 0x0

    .line 30
    .local v12, "message":Ljava/lang/String;
    const-string v18, "\n\t"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    .line 32
    .local v14, "stackArray":[Ljava/lang/String;
    array-length v0, v14

    move/from16 v18, v0

    const/16 v19, 0x1

    move/from16 v0, v18

    move/from16 v1, v19

    if-ne v0, v1, :cond_2

    .line 33
    const-string v18, "\n"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    .line 36
    :cond_2
    const/16 v18, 0x0

    aget-object v12, v14, v18

    .line 38
    invoke-static {v12}, Lcom/splunk/mint/StacktraceHash;->removeFirstDate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 41
    const/16 v18, 0x0

    :try_start_0
    const-string v19, ":"

    move-object/from16 v0, v19

    invoke-virtual {v12, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v19

    move/from16 v0, v18

    move/from16 v1, v19

    invoke-virtual {v12, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .line 48
    :goto_1
    const-string v18, "Caused by:"

    const-string v19, ""

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v12, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 50
    const-string v18, "message"

    move-object/from16 v0, v18

    invoke-virtual {v11, v0, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    const-string v18, "klass"

    move-object/from16 v0, v18

    invoke-virtual {v11, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    const-string v18, "."

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_3

    .line 56
    const-string v18, "\\."

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13

    .line 57
    .local v13, "packageParts":[Ljava/lang/String;
    const/16 v18, 0x0

    aget-object v18, v13, v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v18

    const/16 v19, 0x3

    move/from16 v0, v18

    move/from16 v1, v19

    if-le v0, v1, :cond_5

    .line 58
    const/16 v18, 0x0

    aget-object p0, v13, v18

    .line 65
    .end local v13    # "packageParts":[Ljava/lang/String;
    :cond_3
    :goto_2
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .local v15, "stringForHash":Ljava/lang/StringBuilder;
    move-object v2, v14

    .local v2, "arr$":[Ljava/lang/String;
    array-length v8, v2

    .local v8, "len$":I
    const/4 v6, 0x0

    .local v6, "i$":I
    :goto_3
    if-ge v6, v8, :cond_6

    aget-object v10, v2, v6

    .line 69
    .local v10, "line":Ljava/lang/String;
    move-object/from16 v0, p0

    invoke-virtual {v10, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    const/16 v19, -0x1

    move/from16 v0, v18

    move/from16 v1, v19

    if-eq v0, v1, :cond_4

    move-object/from16 v0, p0

    invoke-virtual {v10, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    const/16 v19, 0x14

    move/from16 v0, v18

    move/from16 v1, v19

    if-gt v0, v1, :cond_4

    .line 70
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    const-string v18, "\n"

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 42
    .end local v2    # "arr$":[Ljava/lang/String;
    .end local v6    # "i$":I
    .end local v8    # "len$":I
    .end local v10    # "line":Ljava/lang/String;
    .end local v15    # "stringForHash":Ljava/lang/StringBuilder;
    :catch_0
    move-exception v3

    .line 43
    .local v3, "e":Ljava/lang/Exception;
    move-object v7, v12

    goto :goto_1

    .line 60
    .end local v3    # "e":Ljava/lang/Exception;
    .restart local v13    # "packageParts":[Ljava/lang/String;
    :cond_5
    const/16 v18, 0x1

    aget-object p0, v13, v18

    goto :goto_2

    .line 79
    .end local v13    # "packageParts":[Ljava/lang/String;
    .restart local v2    # "arr$":[Ljava/lang/String;
    .restart local v6    # "i$":I
    .restart local v8    # "len$":I
    .restart local v15    # "stringForHash":Ljava/lang/StringBuilder;
    :cond_6
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->length()I

    move-result v18

    if-nez v18, :cond_8

    .line 80
    move-object v2, v14

    array-length v8, v2

    const/4 v6, 0x0

    :goto_4
    if-ge v6, v8, :cond_8

    aget-object v10, v2, v6

    .line 83
    .restart local v10    # "line":Ljava/lang/String;
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v18

    const/16 v19, 0xa

    move/from16 v0, v18

    move/from16 v1, v19

    if-le v0, v1, :cond_7

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v18

    const-string v19, "at "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_7

    const-string v18, "..."

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_7

    const-string v18, ".java."

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_7

    const/16 v18, 0x0

    const/16 v19, 0xa

    move/from16 v0, v18

    move/from16 v1, v19

    invoke-virtual {v10, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v18

    const-string v19, "android"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_7

    const-string v18, "org.apache"

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_7

    const-string v18, "org.acra"

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_7

    const-string v18, "dalvik"

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_7

    const-string v18, ".acra."

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_7

    .line 86
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    const-string v18, "\n"

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    :cond_7
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 92
    .end local v10    # "line":Ljava/lang/String;
    :cond_8
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->length()I

    move-result v18

    if-nez v18, :cond_b

    .line 93
    move-object v2, v14

    array-length v8, v2

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v8, :cond_b

    aget-object v10, v2, v6

    .line 94
    .restart local v10    # "line":Ljava/lang/String;
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v18

    const/16 v19, 0xa

    move/from16 v0, v18

    move/from16 v1, v19

    if-le v0, v1, :cond_a

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v18

    const-string v19, "at "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_a

    const-string v18, ".java"

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_9

    const-string v18, "Unknown"

    move-object/from16 v0, v18

    invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_a

    .line 95
    :cond_9
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    const-string v18, "\n"

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    :cond_a
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    .line 102
    .end local v10    # "line":Ljava/lang/String;
    :cond_b
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->length()I

    move-result v18

    if-nez v18, :cond_c

    .line 106
    :cond_c
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    const-string v19, "\n"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v18

    const/16 v19, 0x0

    aget-object v5, v18, v19

    .line 109
    .local v5, "firstline":Ljava/lang/String;
    move-object/from16 v0, p0

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_d

    .line 110
    const-string v18, "\\."

    move-object/from16 v0, v18

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v18

    const/16 v19, 0x1

    aget-object v9, v18, v19

    .line 113
    :cond_d
    const-string v18, "library"

    move-object/from16 v0, v18

    invoke-virtual {v11, v0, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    move-object/from16 v17, v5

    .line 116
    const-string v18, "("

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_e

    .line 117
    const-string v18, "("

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    add-int/lit8 v18, v18, 0x1

    const-string v19, ")"

    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v19

    invoke-virtual/range {v17 .. v19}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v17

    .line 122
    :goto_6
    const-string v18, "where"

    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-virtual {v11, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    const-string v19, "@\\w+"

    const-string v20, ""

    invoke-virtual/range {v18 .. v20}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 126
    .local v16, "stringToHash":Ljava/lang/String;
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    const-string v19, "$\\w+"

    const-string v20, ""

    invoke-virtual/range {v18 .. v20}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 128
    invoke-static/range {v16 .. v16}, Lcom/splunk/mint/StacktraceHash;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 130
    const-string v18, "errorHash"

    move-object/from16 v0, v18

    invoke-virtual {v11, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 119
    .end local v16    # "stringToHash":Ljava/lang/String;
    :cond_e
    const-string v17, "Unknown"

    goto :goto_6
.end method

.method private static md5(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "stringToHash"    # Ljava/lang/String;

    .prologue
    .line 138
    :try_start_0
    const-string v5, "MD5"

    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4

    .line 140
    .local v4, "m":Ljava/security/MessageDigest;
    invoke-virtual {v4}, Ljava/security/MessageDigest;->reset()V

    .line 141
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/security/MessageDigest;->update([B)V

    .line 142
    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 143
    .local v1, "digest":[B
    new-instance v0, Ljava/math/BigInteger;

    const/4 v5, 0x1

    invoke-direct {v0, v5, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 144
    .local v0, "bigInt":Ljava/math/BigInteger;
    const/16 v5, 0x10

    invoke-virtual {v0, v5}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 147
    .local v3, "hashtext":Ljava/lang/String;
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v6, 0x20

    if-ge v5, v6, :cond_0

    .line 148
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "0"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    goto :goto_0

    .line 151
    .end local v0    # "bigInt":Ljava/math/BigInteger;
    .end local v1    # "digest":[B
    .end local v3    # "hashtext":Ljava/lang/String;
    .end local v4    # "m":Ljava/security/MessageDigest;
    :catch_0
    move-exception v2

    .line 152
    .local v2, "e":Ljava/security/NoSuchAlgorithmException;
    invoke-virtual {v2}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    .line 154
    const-string v3, ""

    .end local v2    # "e":Ljava/security/NoSuchAlgorithmException;
    :cond_0
    return-object v3
.end method

.method private static removeFirstDate(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "message"    # Ljava/lang/String;

    .prologue
    .line 161
    const-string v3, "\n"

    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 162
    const-string v3, "\\n"

    invoke-virtual {p0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 163
    .local v0, "parts":[Ljava/lang/String;
    const-string v3, "[\\d]{2}:[\\d]{2}:[\\d]{2}"

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 164
    .local v1, "regex":Ljava/util/regex/Pattern;
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 165
    .local v2, "regexMatcher":Ljava/util/regex/Matcher;
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 166
    const/4 v3, 0x1

    aget-object p0, v0, v3

    .line 170
    .end local v0    # "parts":[Ljava/lang/String;
    .end local v1    # "regex":Ljava/util/regex/Pattern;
    .end local v2    # "regexMatcher":Ljava/util/regex/Matcher;
    :cond_0
    return-object p0
.end method
