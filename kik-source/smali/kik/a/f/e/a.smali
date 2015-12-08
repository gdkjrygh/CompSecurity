.class public final Lkik/a/f/e/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/String;

.field private static final b:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 48
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "com.kik.ext.camera"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "com.kik.ext.gallery"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "com.kik.ext.video-camera"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "com.kik.ext.video-gallery"

    aput-object v2, v0, v1

    sput-object v0, Lkik/a/f/e/a;->a:[Ljava/lang/String;

    .line 49
    new-instance v0, Ljava/util/HashSet;

    sget-object v1, Lkik/a/f/e/a;->a:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lkik/a/f/e/a;->b:Ljava/util/HashSet;

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 300
    if-eqz p0, :cond_1

    .line 301
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 302
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    .line 303
    const-string v0, "&"

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    .line 304
    if-gez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 305
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 307
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lkik/a/d/a/a;
    .locals 36

    .prologue
    .line 74
    const/16 v30, 0x0

    .line 76
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 77
    new-instance v9, Ljava/util/Hashtable;

    invoke-direct {v9}, Ljava/util/Hashtable;-><init>()V

    .line 78
    new-instance v8, Ljava/util/Hashtable;

    invoke-direct {v8}, Ljava/util/Hashtable;-><init>()V

    .line 79
    new-instance v7, Ljava/util/Hashtable;

    invoke-direct {v7}, Ljava/util/Hashtable;-><init>()V

    .line 80
    const/16 v29, 0x0

    .line 81
    const/4 v11, 0x0

    .line 82
    const/4 v12, 0x0

    .line 83
    const/4 v10, 0x0

    .line 84
    const/16 v28, 0x0

    .line 85
    const/4 v14, 0x0

    .line 87
    const/4 v4, 0x0

    .line 88
    const/4 v3, 0x0

    .line 89
    const/4 v2, 0x0

    .line 90
    const/16 v27, 0x0

    .line 91
    const/16 v26, 0x0

    .line 92
    const/16 v25, 0x0

    .line 93
    const/16 v24, 0x0

    .line 94
    const/16 v23, 0x0

    .line 95
    const/16 v22, 0x0

    .line 96
    const/16 v21, 0x0

    .line 98
    const/16 v20, 0x0

    .line 99
    const/16 v19, 0x0

    .line 100
    const/16 v18, 0x0

    .line 101
    const/16 v17, 0x0

    .line 103
    const/16 v16, 0x0

    .line 104
    new-instance v31, Ljava/util/ArrayList;

    invoke-direct/range {v31 .. v31}, Ljava/util/ArrayList;-><init>()V

    .line 106
    const-string v5, "photo"

    move-object/from16 v0, p0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 107
    const-string v3, "layout"

    sget-object v5, Lkik/a/d/a/a$b;->b:Lkik/a/d/a/a$b;

    invoke-virtual {v5}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v3, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    const/4 v3, 0x1

    move v5, v2

    move v13, v3

    move v15, v4

    .line 122
    :goto_0
    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v32

    move-object v4, v10

    move-object v10, v11

    move-object/from16 v11, v29

    move-object/from16 v29, v30

    :goto_1
    invoke-interface/range {v32 .. v32}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-interface/range {v32 .. v32}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 123
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 124
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 125
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v33

    move/from16 v35, v16

    move/from16 v16, v21

    move/from16 v21, v26

    move-object/from16 v26, v12

    move-object/from16 v12, v19

    move/from16 v19, v24

    move-object/from16 v24, v28

    move-object/from16 v28, v11

    move-object/from16 v11, v18

    move/from16 v18, v23

    move/from16 v23, v14

    move-object/from16 v14, v20

    move/from16 v20, v25

    move-object/from16 v25, v4

    move-object/from16 v4, v17

    move/from16 v17, v22

    move/from16 v22, v27

    move-object/from16 v27, v10

    move/from16 v10, v35

    :goto_2
    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 126
    const-string v30, "app_name"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_3

    .line 127
    const-string v21, "app-name"

    move-object/from16 v0, v21

    invoke-virtual {v7, v0, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    const/4 v2, 0x1

    move/from16 v21, v2

    goto :goto_2

    .line 110
    :cond_0
    const-string v5, "article"

    move-object/from16 v0, p0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 111
    const-string v2, "layout"

    sget-object v5, Lkik/a/d/a/a$b;->c:Lkik/a/d/a/a$b;

    invoke-virtual {v5}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v2, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    const/4 v2, 0x1

    move v5, v2

    move v13, v3

    move v15, v4

    goto/16 :goto_0

    .line 114
    :cond_1
    const-string v4, "video"

    move-object/from16 v0, p0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 115
    const-string v4, "layout"

    sget-object v5, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    invoke-virtual {v5}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    const/4 v4, 0x1

    move v5, v2

    move v13, v3

    move v15, v4

    goto/16 :goto_0

    .line 119
    :cond_2
    const/4 v2, 0x0

    .line 286
    :goto_3
    return-object v2

    .line 130
    :cond_3
    const-string v30, "app_pkg"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_5

    .line 131
    if-eqz v2, :cond_4

    sget-object v22, Lkik/a/f/e/a;->b:Ljava/util/HashSet;

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_4

    .line 133
    const/4 v2, 0x0

    goto :goto_3

    .line 135
    :cond_4
    const-string v22, "app-pkg"

    move-object/from16 v0, v22

    invoke-virtual {v7, v0, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    const/16 v22, 0x1

    move-object/from16 v25, v2

    .line 137
    goto :goto_2

    .line 139
    :cond_5
    const-string v30, "title"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_6

    .line 140
    const-string v30, "title"

    move-object/from16 v0, v30

    invoke-virtual {v7, v0, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 142
    :cond_6
    const-string v30, "text"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_7

    .line 143
    const-string v30, "text"

    move-object/from16 v0, v30

    invoke-virtual {v7, v0, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 145
    :cond_7
    const-string v30, "forwardable"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_8

    .line 146
    const-string v30, "allow-forward"

    invoke-static {v2}, Lkik/a/f/e/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v30

    invoke-virtual {v7, v0, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 148
    :cond_8
    const-string v30, "url"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_a

    .line 150
    const-string v29, ","

    move-object/from16 v0, v29

    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v34

    .line 151
    const/16 v29, 0x0

    .line 152
    if-lez v34, :cond_2a

    .line 153
    const/16 v29, 0x0

    move/from16 v0, v29

    move/from16 v1, v34

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v29

    move-object/from16 v30, v29

    .line 156
    :goto_4
    add-int/lit8 v29, v34, 0x1

    move/from16 v0, v29

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v29

    .line 157
    new-instance v34, Lcom/kik/f/a/a/a;

    const-string v2, "app_name"

    move-object/from16 v0, v34

    move-object/from16 v1, v29

    invoke-direct {v0, v1, v2}, Lcom/kik/f/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    move-object/from16 v0, v34

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lcom/kik/f/a/a/a;->a(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 161
    invoke-virtual/range {v31 .. v31}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v10, v2, :cond_9

    move-object/from16 v0, v31

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 162
    move-object/from16 v0, v31

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v0, v34

    invoke-virtual {v0, v2}, Lcom/kik/f/a/a/a;->c(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 164
    :cond_9
    move-object/from16 v0, v34

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    add-int/lit8 v2, v10, 0x1

    move v10, v2

    .line 166
    goto/16 :goto_2

    .line 167
    :cond_a
    const-string v30, "byline"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_b

    .line 168
    move-object/from16 v0, v31

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 170
    :cond_b
    const-string v30, "image_url"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_e

    .line 171
    invoke-static {v2}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_c

    .line 173
    const-string v2, "image_url"

    move-object/from16 v0, p2

    invoke-static {v0, v2}, Lkik/a/f/e/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 184
    :goto_5
    const/4 v2, 0x1

    move-object/from16 v28, v18

    move/from16 v18, v2

    goto/16 :goto_2

    .line 176
    :cond_c
    invoke-static {v2}, Lkik/a/h/n;->a(Ljava/lang/String;)Z

    move-result v18

    if-nez v18, :cond_d

    .line 177
    const/4 v2, 0x0

    goto/16 :goto_3

    .line 179
    :cond_d
    new-instance v18, Lcom/kik/f/a/a/a;

    const-string v30, "app_name"

    move-object/from16 v0, v18

    move-object/from16 v1, v30

    invoke-direct {v0, v2, v1}, Lcom/kik/f/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    const/4 v2, 0x0

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/kik/f/a/a/a;->a(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 181
    const-string v2, "image"

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/kik/f/a/a/a;->b(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 182
    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v18, v28

    goto :goto_5

    .line 186
    :cond_e
    const-string v30, "video_url"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_11

    .line 187
    invoke-static {v2}, Lkik/a/h/n;->a(Ljava/lang/String;)Z

    move-result v17

    if-nez v17, :cond_f

    invoke-static {v2}, Lkik/a/f/e/a;->b(Ljava/lang/String;)Z

    move-result v17

    if-nez v17, :cond_f

    .line 188
    const/4 v2, 0x0

    goto/16 :goto_3

    .line 190
    :cond_f
    invoke-static {v2}, Lkik/a/f/e/a;->b(Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_10

    .line 191
    const/16 v16, 0x1

    .line 193
    :cond_10
    new-instance v17, Lcom/kik/f/a/a/a;

    const-string v30, "app_name"

    move-object/from16 v0, v17

    move-object/from16 v1, v30

    invoke-direct {v0, v2, v1}, Lcom/kik/f/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const/16 v30, 0x0

    move-object/from16 v0, v17

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lcom/kik/f/a/a/a;->a(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 195
    const-string v30, "video"

    move-object/from16 v0, v17

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lcom/kik/f/a/a/a;->b(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 196
    move-object/from16 v0, v17

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    new-instance v17, Lcom/kik/f/a/a/a;

    const-string v30, "app_name"

    move-object/from16 v0, v17

    move-object/from16 v1, v30

    invoke-direct {v0, v2, v1}, Lcom/kik/f/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    const/4 v2, 0x0

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Lcom/kik/f/a/a/a;->a(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 201
    const-string v2, "image"

    move-object/from16 v0, v17

    invoke-virtual {v0, v2}, Lcom/kik/f/a/a/a;->b(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 202
    move-object/from16 v0, v17

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    const/4 v2, 0x1

    move/from16 v17, v2

    .line 205
    goto/16 :goto_2

    .line 206
    :cond_11
    const-string v30, "preview_url"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_14

    .line 207
    invoke-static {v2}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v26

    if-eqz v26, :cond_12

    .line 209
    const-string v2, "preview_url"

    move-object/from16 v0, p2

    invoke-static {v0, v2}, Lkik/a/f/e/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v26, v2

    goto/16 :goto_2

    .line 212
    :cond_12
    invoke-static {v2}, Lkik/a/h/n;->a(Ljava/lang/String;)Z

    move-result v26

    if-nez v26, :cond_13

    .line 213
    const/4 v2, 0x0

    goto/16 :goto_3

    :cond_13
    move-object/from16 v26, v2

    .line 215
    goto/16 :goto_2

    .line 218
    :cond_14
    const-string v30, "icon_url"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_17

    .line 219
    invoke-static {v2}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v20

    if-eqz v20, :cond_15

    .line 221
    const-string v2, "icon_url"

    move-object/from16 v0, p2

    invoke-static {v0, v2}, Lkik/a/f/e/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 229
    :goto_6
    const/4 v2, 0x1

    move-object/from16 v27, v20

    move/from16 v20, v2

    goto/16 :goto_2

    .line 224
    :cond_15
    invoke-static {v2}, Lkik/a/h/n;->a(Ljava/lang/String;)Z

    move-result v20

    if-nez v20, :cond_16

    .line 225
    const/4 v2, 0x0

    goto/16 :goto_3

    :cond_16
    move-object/from16 v20, v2

    .line 227
    goto :goto_6

    .line 231
    :cond_17
    const-string v30, "native"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_18

    .line 232
    const-string v23, "1"

    move-object/from16 v0, v23

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    move/from16 v23, v2

    goto/16 :goto_2

    .line 234
    :cond_18
    const-string v30, "referer"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_19

    .line 236
    const/16 v19, 0x1

    move-object/from16 v24, v2

    goto/16 :goto_2

    .line 238
    :cond_19
    const-string v30, "video_should_autoplay"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_1a

    .line 239
    invoke-static {v2}, Lkik/a/f/e/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v14, v2

    goto/16 :goto_2

    .line 241
    :cond_1a
    const-string v30, "video_should_loop"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_1b

    .line 242
    invoke-static {v2}, Lkik/a/f/e/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto/16 :goto_2

    .line 244
    :cond_1b
    const-string v30, "video_should_be_muted"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_1c

    .line 245
    invoke-static {v2}, Lkik/a/f/e/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v12, v2

    goto/16 :goto_2

    .line 247
    :cond_1c
    const-string v30, "disallow_save"

    move-object/from16 v0, v30

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_29

    .line 248
    invoke-static {v2}, Lkik/a/f/e/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_7
    move-object v4, v2

    .line 250
    goto/16 :goto_2

    :cond_1d
    move/from16 v35, v10

    move-object/from16 v10, v27

    move/from16 v27, v22

    move/from16 v22, v17

    move-object/from16 v17, v4

    move-object/from16 v4, v25

    move/from16 v25, v20

    move-object/from16 v20, v14

    move/from16 v14, v23

    move/from16 v23, v18

    move-object/from16 v18, v11

    move-object/from16 v11, v28

    move-object/from16 v28, v24

    move/from16 v24, v19

    move-object/from16 v19, v12

    move-object/from16 v12, v26

    move/from16 v26, v21

    move/from16 v21, v16

    move/from16 v16, v35

    .line 251
    goto/16 :goto_1

    .line 253
    :cond_1e
    if-eqz v27, :cond_1f

    if-eqz v26, :cond_1f

    if-eqz v25, :cond_1f

    if-nez v24, :cond_20

    .line 255
    :cond_1f
    const/4 v2, 0x0

    goto/16 :goto_3

    .line 257
    :cond_20
    if-eqz v5, :cond_23

    .line 258
    const-string v2, "title"

    invoke-virtual {v7, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_21

    const-string v2, "text"

    invoke-virtual {v7, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_22

    :cond_21
    if-nez v29, :cond_27

    .line 260
    :cond_22
    const/4 v2, 0x0

    goto/16 :goto_3

    .line 263
    :cond_23
    if-eqz v13, :cond_25

    if-eqz v12, :cond_24

    if-nez v23, :cond_25

    .line 265
    :cond_24
    const/4 v2, 0x0

    goto/16 :goto_3

    .line 267
    :cond_25
    if-eqz v15, :cond_27

    .line 269
    if-eqz v22, :cond_26

    if-nez v12, :cond_27

    if-nez v21, :cond_27

    .line 270
    :cond_26
    const/4 v2, 0x0

    goto/16 :goto_3

    .line 273
    :cond_27
    if-eqz v14, :cond_28

    .line 275
    const-string v2, "app-pkg"

    invoke-virtual {v7, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object v13, v2

    .line 278
    :goto_8
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    .line 279
    new-instance v2, Lkik/a/d/a/a;

    const-string v5, "2"

    invoke-direct/range {v2 .. v14}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 281
    move-object/from16 v0, v20

    invoke-virtual {v2, v0}, Lkik/a/d/a/a;->j(Ljava/lang/String;)V

    .line 282
    move-object/from16 v0, v17

    invoke-virtual {v2, v0}, Lkik/a/d/a/a;->i(Ljava/lang/String;)V

    .line 283
    move-object/from16 v0, v19

    invoke-virtual {v2, v0}, Lkik/a/d/a/a;->l(Ljava/lang/String;)V

    .line 284
    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Lkik/a/d/a/a;->k(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_28
    move-object/from16 v13, v28

    goto :goto_8

    :cond_29
    move-object v2, v4

    goto/16 :goto_7

    :cond_2a
    move-object/from16 v30, v29

    goto/16 :goto_4
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 56
    if-eqz p0, :cond_0

    .line 57
    const-string v0, "data:"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    .line 59
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 64
    if-eqz p0, :cond_0

    const-string v0, "content://"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 291
    invoke-static {p0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    const-string v0, "false"

    .line 295
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "1"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "true"

    goto :goto_0

    :cond_1
    const-string v0, "false"

    goto :goto_0
.end method
