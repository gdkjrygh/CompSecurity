.class public Lcom/qihoo/antivirus/update/j;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/qihoo/antivirus/update/h;Lcom/qihoo/antivirus/update/q;)Z
    .locals 1

    .prologue
    .line 216
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 217
    :cond_0
    const/4 v0, 0x0

    .line 226
    :goto_0
    return v0

    .line 220
    :cond_1
    invoke-virtual {p1}, Lcom/qihoo/antivirus/update/h;->c()Ljava/util/ArrayList;

    move-result-object v0

    .line 221
    if-nez v0, :cond_2

    .line 222
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 223
    invoke-virtual {p1, v0}, Lcom/qihoo/antivirus/update/h;->c(Ljava/util/ArrayList;)V

    .line 226
    :cond_2
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method private a(Lcom/qihoo/antivirus/update/h;Lcom/qihoo/antivirus/update/s;)Z
    .locals 1

    .prologue
    .line 201
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 202
    :cond_0
    const/4 v0, 0x0

    .line 211
    :goto_0
    return v0

    .line 205
    :cond_1
    invoke-virtual {p1}, Lcom/qihoo/antivirus/update/h;->b()Ljava/util/ArrayList;

    move-result-object v0

    .line 206
    if-nez v0, :cond_2

    .line 207
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 208
    invoke-virtual {p1, v0}, Lcom/qihoo/antivirus/update/h;->b(Ljava/util/ArrayList;)V

    .line 211
    :cond_2
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method private a(Lcom/qihoo/antivirus/update/h;Lcom/qihoo/antivirus/update/u;)Z
    .locals 1

    .prologue
    .line 186
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 187
    :cond_0
    const/4 v0, 0x0

    .line 196
    :goto_0
    return v0

    .line 190
    :cond_1
    invoke-virtual {p1}, Lcom/qihoo/antivirus/update/h;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 191
    if-nez v0, :cond_2

    .line 192
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 193
    invoke-virtual {p1, v0}, Lcom/qihoo/antivirus/update/h;->a(Ljava/util/ArrayList;)V

    .line 196
    :cond_2
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;)Lcom/qihoo/antivirus/update/h;
    .locals 30

    .prologue
    .line 38
    :try_start_0
    new-instance v28, Lcom/qihoo/antivirus/update/aa;

    const-string/jumbo v2, "UTF-8"

    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    const/4 v3, 0x1

    move-object/from16 v0, v28

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/antivirus/update/aa;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;Z)V

    .line 39
    new-instance v27, Lcom/qihoo/antivirus/update/h;

    invoke-direct/range {v27 .. v27}, Lcom/qihoo/antivirus/update/h;-><init>()V

    .line 41
    invoke-virtual/range {v28 .. v28}, Lcom/qihoo/antivirus/update/aa;->a()Ljava/util/Iterator;

    move-result-object v29

    .line 44
    :cond_0
    :goto_0
    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    move-object/from16 v2, v27

    .line 181
    :goto_1
    return-object v2

    .line 46
    :cond_1
    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 48
    const-string/jumbo v3, "patch_url"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 49
    const-string/jumbo v3, "patch_size"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 50
    const-string/jumbo v3, "patch_md5"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 51
    const-string/jumbo v3, "diff_method"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    .line 52
    const-string/jumbo v3, "url"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 53
    const-string/jumbo v3, "size"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 54
    const-string/jumbo v3, "md5"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 55
    const-string/jumbo v3, "ver"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 56
    if-nez v12, :cond_2

    .line 57
    const-string/jumbo v3, "version"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 59
    :cond_2
    const-string/jumbo v3, "code"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 60
    const-string/jumbo v3, "path"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 61
    const-string/jumbo v3, "description"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 62
    const-string/jumbo v3, "flag"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 64
    const-string/jumbo v3, "file_exists"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 65
    const-string/jumbo v4, "package_exists"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v4}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 66
    const-string/jumbo v5, "package_ver"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v5}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 67
    const-string/jumbo v6, "file_exists_rule"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v6}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 68
    const-string/jumbo v7, "package_exists_rule"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v7}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 69
    const-string/jumbo v8, "package_ver_rule"

    move-object/from16 v0, v28

    invoke-virtual {v0, v2, v8}, Lcom/qihoo/antivirus/update/aa;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v8

    .line 72
    if-eqz v10, :cond_6

    .line 74
    :try_start_1
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v25

    .line 88
    const-wide/16 v10, 0x0

    .line 89
    if-eqz v18, :cond_3

    .line 91
    :try_start_2
    invoke-static/range {v18 .. v18}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    move-result-wide v10

    .line 99
    :cond_3
    const-wide/16 v18, 0x0

    .line 100
    if-eqz v20, :cond_4

    .line 102
    :try_start_3
    invoke-static/range {v20 .. v20}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    move-result-wide v18

    .line 111
    :cond_4
    const/16 v20, -0x1

    .line 112
    if-eqz v22, :cond_5

    .line 114
    :try_start_4
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    move-result v20

    .line 123
    :cond_5
    const/4 v2, 0x1

    .line 124
    and-int/lit8 v22, v25, 0x1

    if-lez v22, :cond_c

    .line 125
    const/4 v2, 0x0

    move/from16 v23, v2

    .line 128
    :goto_2
    const/4 v2, 0x0

    .line 129
    and-int/lit8 v22, v25, 0x4

    if-lez v22, :cond_b

    .line 130
    const/4 v2, 0x1

    move/from16 v22, v2

    .line 138
    :goto_3
    if-eqz v23, :cond_a

    move-object/from16 v2, p1

    .line 139
    :try_start_5
    invoke-static/range {v2 .. v8}, Lcom/qihoo/antivirus/update/aj;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 141
    if-ltz v2, :cond_9

    .line 142
    if-eqz v22, :cond_8

    .line 143
    and-int/lit8 v2, v25, 0x2

    if-eqz v2, :cond_7

    const/4 v15, 0x1

    .line 145
    :goto_4
    new-instance v2, Lcom/qihoo/antivirus/update/u;

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    move-wide/from16 v5, v18

    move/from16 v7, v20

    move-object/from16 v8, v21

    invoke-direct/range {v2 .. v15}, Lcom/qihoo/antivirus/update/u;-><init>(Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 148
    move-object/from16 v0, p0

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v2}, Lcom/qihoo/antivirus/update/j;->a(Lcom/qihoo/antivirus/update/h;Lcom/qihoo/antivirus/update/u;)Z

    goto/16 :goto_0

    .line 177
    :catch_0
    move-exception v2

    .line 181
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 75
    :catch_1
    move-exception v2

    .line 79
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 85
    :cond_6
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 92
    :catch_2
    move-exception v2

    .line 96
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 103
    :catch_3
    move-exception v2

    .line 107
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 115
    :catch_4
    move-exception v2

    .line 119
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 143
    :cond_7
    const/4 v15, 0x0

    goto :goto_4

    .line 150
    :cond_8
    new-instance v14, Lcom/qihoo/antivirus/update/s;

    move-object/from16 v22, v9

    move-wide/from16 v23, v10

    move-object/from16 v26, v12

    invoke-direct/range {v14 .. v26}, Lcom/qihoo/antivirus/update/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;JILjava/lang/String;)V

    .line 152
    move-object/from16 v0, p0

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v14}, Lcom/qihoo/antivirus/update/j;->a(Lcom/qihoo/antivirus/update/h;Lcom/qihoo/antivirus/update/s;)Z

    goto/16 :goto_0

    .line 155
    :cond_9
    const/4 v3, -0x3

    if-eq v2, v3, :cond_0

    .line 163
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 167
    :cond_a
    if-eqz v15, :cond_0

    .line 168
    new-instance v2, Lcom/qihoo/antivirus/update/q;

    invoke-direct {v2, v15}, Lcom/qihoo/antivirus/update/q;-><init>(Ljava/lang/String;)V

    .line 169
    move-object/from16 v0, p0

    move-object/from16 v1, v27

    invoke-direct {v0, v1, v2}, Lcom/qihoo/antivirus/update/j;->a(Lcom/qihoo/antivirus/update/h;Lcom/qihoo/antivirus/update/q;)Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_0

    :cond_b
    move/from16 v22, v2

    goto :goto_3

    :cond_c
    move/from16 v23, v2

    goto :goto_2
.end method
