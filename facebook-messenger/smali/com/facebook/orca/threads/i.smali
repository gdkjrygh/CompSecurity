.class public Lcom/facebook/orca/threads/i;
.super Ljava/lang/Object;
.source "MessagesCollectionMerger.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/orca/threads/i;

    sput-object v0, Lcom/facebook/orca/threads/i;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;Z)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 16

    .prologue
    .line 65
    sget-object v1, Lcom/facebook/orca/threads/i;->a:Ljava/lang/Class;

    const-string v2, "MERGE: %d new, %d old"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/threads/MessagesCollection;->f()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-virtual/range {p2 .. p2}, Lcom/facebook/orca/threads/MessagesCollection;->f()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/threads/MessagesCollection;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/facebook/orca/threads/MessagesCollection;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 73
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Message Collections with different thread ids"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 77
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual/range {p2 .. p2}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 203
    :cond_1
    :goto_0
    return-object p1

    .line 79
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v1

    if-eqz v1, :cond_3

    move-object/from16 p1, p2

    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v1

    if-nez v1, :cond_1

    .line 87
    invoke-direct/range {p0 .. p2}, Lcom/facebook/orca/threads/i;->d(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Z

    move-result v1

    if-nez v1, :cond_4

    move-object/from16 p1, p2

    .line 88
    goto :goto_0

    .line 92
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/threads/MessagesCollection;->f()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threads/MessagesCollection;->a(I)Lcom/facebook/messages/model/threads/Message;

    move-result-object v3

    .line 93
    new-instance v4, Lcom/facebook/orca/threads/k;

    const/4 v1, 0x0

    invoke-direct {v4, v1}, Lcom/facebook/orca/threads/k;-><init>(Lcom/facebook/orca/threads/j;)V

    .line 94
    new-instance v5, Lcom/facebook/orca/threads/k;

    const/4 v1, 0x0

    invoke-direct {v5, v1}, Lcom/facebook/orca/threads/k;-><init>(Lcom/facebook/orca/threads/j;)V

    .line 96
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/messages/model/threads/Message;

    .line 97
    invoke-virtual {v4, v1}, Lcom/facebook/orca/threads/k;->a(Lcom/facebook/messages/model/threads/Message;)V

    goto :goto_1

    .line 101
    :cond_5
    const/4 v2, 0x0

    .line 102
    invoke-virtual/range {p2 .. p2}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/messages/model/threads/Message;

    .line 103
    invoke-virtual {v5, v1}, Lcom/facebook/orca/threads/k;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 104
    move-object/from16 v0, p0

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/threads/i;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/Message;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 105
    const/4 v1, 0x1

    .line 110
    :goto_2
    if-nez v1, :cond_7

    .line 111
    const-string v1, "MERGE: couldn\'t find sync point"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/facebook/orca/threads/i;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    if-nez p3, :cond_1

    .line 119
    :goto_3
    const/4 v3, 0x0

    .line 120
    const/4 v2, 0x0

    .line 121
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/threads/MessagesCollection;->f()I

    move-result v6

    .line 122
    invoke-virtual/range {p2 .. p2}, Lcom/facebook/orca/threads/MessagesCollection;->f()I

    move-result v7

    .line 124
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v8

    .line 125
    new-instance v9, Lcom/facebook/orca/threads/k;

    const/4 v1, 0x0

    invoke-direct {v9, v1}, Lcom/facebook/orca/threads/k;-><init>(Lcom/facebook/orca/threads/j;)V

    .line 126
    :goto_4
    if-ge v3, v6, :cond_11

    if-ge v2, v7, :cond_11

    .line 130
    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lcom/facebook/orca/threads/MessagesCollection;->a(I)Lcom/facebook/messages/model/threads/Message;

    move-result-object v10

    .line 131
    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threads/MessagesCollection;->a(I)Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 133
    invoke-virtual {v9, v10}, Lcom/facebook/orca/threads/k;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 134
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 116
    :cond_7
    const-string v1, "MERGE: found sync point (%s)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    invoke-static {v1, v2}, Lcom/facebook/orca/threads/i;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 135
    :cond_8
    invoke-virtual {v9, v1}, Lcom/facebook/orca/threads/k;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v11

    if-eqz v11, :cond_9

    .line 136
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 137
    :cond_9
    move-object/from16 v0, p0

    invoke-direct {v0, v10, v1}, Lcom/facebook/orca/threads/i;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/Message;)Z

    move-result v11

    if-eqz v11, :cond_b

    .line 138
    const-string v11, "MERGE: inserting matching element (%s)"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-virtual {v10}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-static {v11, v12}, Lcom/facebook/orca/threads/i;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    move-object/from16 v0, p0

    invoke-direct {v0, v1, v10}, Lcom/facebook/orca/threads/i;->b(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/Message;)Z

    move-result v11

    if-eqz v11, :cond_a

    .line 140
    invoke-virtual {v8, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 144
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 145
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 142
    :cond_a
    invoke-virtual {v8, v10}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_5

    .line 147
    :cond_b
    invoke-virtual {v5, v10}, Lcom/facebook/orca/threads/k;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v11

    if-eqz v11, :cond_10

    .line 148
    invoke-virtual {v5, v10}, Lcom/facebook/orca/threads/k;->c(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v11

    .line 149
    invoke-virtual {v10}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v12

    invoke-virtual {v11}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v14

    cmp-long v12, v12, v14

    if-gtz v12, :cond_c

    invoke-virtual {v10}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v12

    if-nez v12, :cond_d

    invoke-virtual {v11}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v12

    if-eqz v12, :cond_d

    .line 152
    :cond_c
    const-string v1, "MERGE: Inserting new element (%s) and discarding old"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-virtual {v10}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-static {v1, v12}, Lcom/facebook/orca/threads/i;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    invoke-virtual {v8, v10}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 154
    invoke-virtual {v9, v10}, Lcom/facebook/orca/threads/k;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 155
    invoke-virtual {v5, v11}, Lcom/facebook/orca/threads/k;->d(Lcom/facebook/messages/model/threads/Message;)V

    .line 156
    add-int/lit8 v1, v3, 0x1

    :goto_6
    move v3, v1

    .line 180
    goto/16 :goto_4

    .line 160
    :cond_d
    const-string v11, "MERGE: Iterating old to find message matching (%s)"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-virtual {v10}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-static {v11, v12}, Lcom/facebook/orca/threads/i;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    :goto_7
    move-object/from16 v0, p0

    invoke-direct {v0, v10, v1}, Lcom/facebook/orca/threads/i;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/Message;)Z

    move-result v1

    if-nez v1, :cond_14

    if-ge v2, v7, :cond_14

    .line 162
    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threads/MessagesCollection;->a(I)Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 165
    invoke-virtual {v4, v1}, Lcom/facebook/orca/threads/k;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v11

    if-eqz v11, :cond_e

    move-object/from16 v0, p0

    invoke-direct {v0, v1, v10}, Lcom/facebook/orca/threads/i;->b(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/Message;)Z

    move-result v11

    if-nez v11, :cond_e

    .line 166
    invoke-virtual {v5, v1}, Lcom/facebook/orca/threads/k;->d(Lcom/facebook/messages/model/threads/Message;)V

    .line 167
    const-string v11, "MERGE: Not inserting old element (%s)"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-static {v11, v12}, Lcom/facebook/orca/threads/i;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    :goto_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 168
    :cond_e
    invoke-virtual {v9, v1}, Lcom/facebook/orca/threads/k;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v11

    if-eqz v11, :cond_f

    .line 169
    invoke-virtual {v5, v1}, Lcom/facebook/orca/threads/k;->d(Lcom/facebook/messages/model/threads/Message;)V

    .line 170
    const-string v11, "MERGE: Not inserting old element (%s)"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-static {v11, v12}, Lcom/facebook/orca/threads/i;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_8

    .line 172
    :cond_f
    const-string v11, "MERGE: Inserting missing old element (%s)"

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v12, v13

    invoke-static {v11, v12}, Lcom/facebook/orca/threads/i;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    invoke-virtual {v8, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 174
    invoke-virtual {v9, v1}, Lcom/facebook/orca/threads/k;->a(Lcom/facebook/messages/model/threads/Message;)V

    goto :goto_8

    .line 181
    :cond_10
    const-string v1, "MERGE: Inserting new element (%s)"

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    invoke-virtual {v10}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v11, v12

    invoke-static {v1, v11}, Lcom/facebook/orca/threads/i;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    invoke-virtual {v8, v10}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 183
    invoke-virtual {v9, v10}, Lcom/facebook/orca/threads/k;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 184
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_4

    .line 191
    :cond_11
    :goto_9
    if-ge v2, v7, :cond_13

    .line 192
    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threads/MessagesCollection;->a(I)Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 193
    invoke-virtual {v9, v1}, Lcom/facebook/orca/threads/k;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 194
    const-string v3, "MERGE: Not inserting old element (%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-static {v3, v4}, Lcom/facebook/orca/threads/i;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    :goto_a
    add-int/lit8 v2, v2, 0x1

    .line 201
    goto :goto_9

    .line 196
    :cond_12
    const-string v3, "MERGE: inserting old element (%s)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Lcom/facebook/orca/threads/i;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    invoke-virtual {v8, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 198
    invoke-virtual {v9, v1}, Lcom/facebook/orca/threads/k;->a(Lcom/facebook/messages/model/threads/Message;)V

    goto :goto_a

    .line 203
    :cond_13
    new-instance v1, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/orca/threads/MessagesCollection;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/facebook/orca/threads/MessagesCollection;->d()Z

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    move-object/from16 p1, v1

    goto/16 :goto_0

    :cond_14
    move v1, v3

    goto/16 :goto_6

    :cond_15
    move v1, v2

    goto/16 :goto_2
.end method

.method private static varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 274
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/Message;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 226
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 233
    :cond_0
    :goto_0
    return v0

    .line 229
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 233
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/Message;)Z
    .locals 1

    .prologue
    .line 237
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Z
    .locals 5

    .prologue
    .line 212
    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->h_()Lcom/google/common/a/mh;

    move-result-object v2

    .line 213
    invoke-virtual {p2}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->h_()Lcom/google/common/a/mh;

    move-result-object v3

    .line 214
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 215
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 216
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/messages/model/threads/Message;

    .line 217
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 219
    :cond_1
    const/4 v0, 0x1

    .line 222
    :goto_0
    return v0

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/threads/i;->a(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;Z)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 1

    .prologue
    .line 49
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/threads/i;->a(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;Z)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 252
    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 268
    :goto_0
    return v0

    .line 254
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    .line 255
    goto :goto_0

    .line 256
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 257
    goto :goto_0

    .line 261
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->f()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lcom/facebook/orca/threads/MessagesCollection;->a(I)Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    .line 262
    invoke-virtual {p2}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 263
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    .line 265
    goto :goto_0

    .line 268
    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method
