.class public Lcom/qihoo/antivirus/update/v;
.super Landroid/os/AsyncTask;
.source "360Security"

# interfaces
.implements Lcom/qihoo/antivirus/update/x$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Long;",
        "Lcom/qihoo/antivirus/update/ab;",
        ">;",
        "Lcom/qihoo/antivirus/update/x$a;"
    }
.end annotation


# instance fields
.field public final a:Lcom/qihoo/antivirus/update/d;

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/s;",
            ">;"
        }
    .end annotation
.end field

.field private c:J

.field private d:J

.field private e:J


# direct methods
.method public constructor <init>(Lcom/qihoo/antivirus/update/d;)V
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    .line 26
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 23
    iput-wide v0, p0, Lcom/qihoo/antivirus/update/v;->c:J

    .line 24
    iput-wide v0, p0, Lcom/qihoo/antivirus/update/v;->d:J

    .line 326
    iput-wide v0, p0, Lcom/qihoo/antivirus/update/v;->e:J

    .line 27
    iput-object p1, p0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    .line 28
    invoke-virtual {p1}, Lcom/qihoo/antivirus/update/d;->d()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/v;->b:Ljava/util/ArrayList;

    .line 29
    invoke-virtual {p1}, Lcom/qihoo/antivirus/update/d;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/antivirus/update/v;->c:J

    .line 30
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Lcom/qihoo/antivirus/update/ab;
    .locals 18

    .prologue
    .line 34
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_a

    .line 36
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/qihoo/antivirus/update/af;->a(Landroid/content/Context;)Z

    move-result v3

    .line 37
    const/4 v2, 0x0

    .line 38
    if-eqz v3, :cond_0

    .line 39
    const/16 v2, 0x2710

    .line 44
    :cond_0
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v3}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/qihoo/antivirus/update/x;->e(Landroid/content/Context;)Lorg/apache/http/HttpHost;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/qihoo/antivirus/update/x;->a(Lorg/apache/http/HttpHost;I)Lorg/apache/http/client/HttpClient;

    move-result-object v11

    .line 45
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    .line 111
    invoke-virtual/range {p0 .. p0}, Lcom/qihoo/antivirus/update/v;->isCancelled()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 115
    const/4 v3, 0x0

    .line 231
    :cond_1
    :goto_1
    return-object v3

    .line 45
    :cond_2
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/antivirus/update/s;

    .line 46
    sget-boolean v3, Lcom/qihoo/antivirus/update/UpdateService;->f:Z

    if-eqz v3, :cond_3

    .line 50
    const/4 v3, 0x0

    goto :goto_1

    .line 53
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/qihoo/antivirus/update/v;->isCancelled()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 57
    const/4 v3, 0x0

    goto :goto_1

    .line 65
    :cond_4
    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/s;->c()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 66
    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/s;->c()Ljava/lang/String;

    move-result-object v5

    .line 67
    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/s;->d()Ljava/lang/String;

    move-result-object v10

    .line 68
    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/s;->e()J

    move-result-wide v8

    .line 69
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, ".patch"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 77
    :goto_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v3, v2}, Lcom/qihoo/antivirus/update/d;->c(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 78
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 80
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/qihoo/antivirus/update/af;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 81
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 83
    move-object/from16 v0, p0

    iget-wide v2, v0, Lcom/qihoo/antivirus/update/v;->d:J

    add-long/2addr v2, v8

    move-object/from16 v0, p0

    iput-wide v2, v0, Lcom/qihoo/antivirus/update/v;->d:J

    .line 84
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Long;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/qihoo/antivirus/update/v;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/qihoo/antivirus/update/v;->c:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/qihoo/antivirus/update/v;->publishProgress([Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 71
    :cond_5
    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/s;->f()Ljava/lang/String;

    move-result-object v5

    .line 72
    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/s;->g()Ljava/lang/String;

    move-result-object v10

    .line 73
    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/s;->h()J

    move-result-wide v8

    .line 74
    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/s;->b()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 87
    :cond_6
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 90
    :cond_7
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/qihoo/antivirus/update/d;->d(Ljava/lang/String;)V

    .line 97
    new-instance v3, Lcom/qihoo/antivirus/update/r;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v4}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v4

    .line 98
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v7, p0

    .line 97
    invoke-direct/range {v3 .. v10}, Lcom/qihoo/antivirus/update/r;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo/antivirus/update/v;JLjava/lang/String;)V

    .line 99
    invoke-virtual {v3, v11}, Lcom/qihoo/antivirus/update/r;->a(Lorg/apache/http/client/HttpClient;)Z

    move-result v4

    .line 104
    if-eqz v4, :cond_1

    .line 107
    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/qihoo/antivirus/update/v;->d:J

    add-long/2addr v4, v8

    move-object/from16 v0, p0

    iput-wide v4, v0, Lcom/qihoo/antivirus/update/v;->d:J

    .line 108
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/qihoo/antivirus/update/d;->e(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 122
    :cond_8
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    .line 125
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/d;->g()Lcom/qihoo/antivirus/update/ad;

    move-result-object v2

    const-string/jumbo v3, "serverTime"

    invoke-virtual {v2, v3}, Lcom/qihoo/antivirus/update/ad;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    move-wide v10, v2

    .line 131
    :goto_3
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 132
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :cond_9
    :goto_4
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_b

    .line 225
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_15

    .line 228
    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    .line 231
    :cond_a
    const/4 v3, 0x0

    goto/16 :goto_1

    .line 126
    :catch_0
    move-exception v2

    .line 127
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    move-wide v10, v2

    goto :goto_3

    .line 132
    :cond_b
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/qihoo/antivirus/update/s;

    .line 133
    const/4 v12, 0x0

    .line 134
    const/4 v4, 0x0

    .line 135
    invoke-virtual {v6}, Lcom/qihoo/antivirus/update/s;->b()Ljava/lang/String;

    move-result-object v3

    .line 137
    invoke-virtual {v6}, Lcom/qihoo/antivirus/update/s;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_e

    .line 138
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v5, ".patch"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 143
    :goto_6
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v5, v2}, Lcom/qihoo/antivirus/update/d;->c(Ljava/lang/String;)Ljava/io/File;

    move-result-object v16

    .line 144
    if-eqz v16, :cond_9

    .line 145
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v2, v3}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 146
    if-eqz v3, :cond_d

    .line 147
    invoke-virtual {v6}, Lcom/qihoo/antivirus/update/s;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_11

    .line 149
    invoke-virtual {v6}, Lcom/qihoo/antivirus/update/s;->i()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 151
    const/16 v2, 0x3e8

    if-le v7, v2, :cond_10

    .line 158
    const/4 v9, 0x1

    .line 160
    new-instance v4, Ljava/io/File;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 161
    move-object/from16 v0, v16

    invoke-static {v0, v4}, Lcom/qihoo/antivirus/update/af;->a(Ljava/io/File;Ljava/io/File;)Z

    move-result v2

    .line 162
    if-eqz v2, :cond_f

    .line 163
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v6}, Lcom/qihoo/antivirus/update/s;->j()I

    move-result v5

    invoke-virtual {v6}, Lcom/qihoo/antivirus/update/s;->a()I

    move-result v6

    const/4 v8, 0x0

    invoke-virtual/range {v2 .. v8}, Lcom/qihoo/antivirus/update/d;->a(Ljava/io/File;Ljava/io/File;IIII)V

    move v2, v9

    move v4, v12

    .line 206
    :goto_7
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 208
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    .line 209
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v6}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v5, v10, v11}, Lcom/qihoo/antivirus/update/af;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 213
    :cond_c
    if-eqz v4, :cond_14

    .line 214
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/antivirus/update/d;->a(Ljava/io/File;Z)V

    .line 221
    :cond_d
    :goto_8
    move-object/from16 v0, v16

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    :cond_e
    move-object v2, v3

    .line 140
    goto/16 :goto_6

    .line 168
    :cond_f
    const/4 v2, 0x1

    move v4, v2

    move v2, v9

    .line 170
    goto :goto_7

    .line 171
    :cond_10
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v6}, Lcom/qihoo/antivirus/update/s;->j()I

    move-result v5

    move-object/from16 v0, v16

    invoke-static {v2, v3, v0, v7, v5}, Lcom/qihoo/antivirus/update/g;->a(Landroid/content/Context;Ljava/io/File;Ljava/io/File;II)Z

    move-result v2

    .line 172
    if-nez v2, :cond_16

    .line 176
    const/4 v2, 0x1

    move/from16 v17, v4

    move v4, v2

    move/from16 v2, v17

    .line 179
    goto :goto_7

    .line 180
    :cond_11
    invoke-virtual {v6}, Lcom/qihoo/antivirus/update/s;->a()I

    move-result v2

    .line 181
    and-int/lit8 v2, v2, 0x10

    if-lez v2, :cond_13

    .line 183
    const/4 v9, 0x1

    .line 184
    new-instance v4, Ljava/io/File;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v2}, Lcom/qihoo/antivirus/update/d;->e()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v7, ".tmp"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 185
    move-object/from16 v0, v16

    invoke-static {v0, v4}, Lcom/qihoo/antivirus/update/af;->a(Ljava/io/File;Ljava/io/File;)Z

    move-result v2

    .line 186
    if-eqz v2, :cond_12

    .line 188
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v6}, Lcom/qihoo/antivirus/update/s;->j()I

    move-result v5

    invoke-virtual {v6}, Lcom/qihoo/antivirus/update/s;->a()I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v2 .. v8}, Lcom/qihoo/antivirus/update/d;->a(Ljava/io/File;Ljava/io/File;IIII)V

    move v2, v9

    move v4, v12

    .line 189
    goto/16 :goto_7

    .line 193
    :cond_12
    const/4 v2, 0x1

    move v4, v2

    move v2, v9

    .line 195
    goto/16 :goto_7

    .line 196
    :cond_13
    move-object/from16 v0, v16

    invoke-static {v0, v3}, Lcom/qihoo/antivirus/update/af;->a(Ljava/io/File;Ljava/io/File;)Z

    move-result v2

    .line 197
    if-nez v2, :cond_16

    .line 201
    const/4 v2, 0x1

    move/from16 v17, v4

    move v4, v2

    move/from16 v2, v17

    goto/16 :goto_7

    .line 216
    :cond_14
    if-nez v2, :cond_d

    .line 217
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/antivirus/update/d;->a(Ljava/io/File;Z)V

    goto/16 :goto_8

    .line 225
    :cond_15
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    .line 226
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto/16 :goto_5

    :cond_16
    move v2, v4

    move v4, v12

    goto/16 :goto_7
.end method

.method public a(ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 271
    return-void
.end method

.method public a(JJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 260
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Long;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/qihoo/antivirus/update/v;->d:J

    add-long/2addr v2, p1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/qihoo/antivirus/update/v;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/qihoo/antivirus/update/v;->publishProgress([Ljava/lang/Object;)V

    .line 264
    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/v;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    .line 266
    :cond_0
    return-void
.end method

.method protected a(Lcom/qihoo/antivirus/update/ab;)V
    .locals 2

    .prologue
    .line 245
    if-nez p1, :cond_0

    .line 246
    iget-object v0, p0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/antivirus/update/d;->a(Z)V

    .line 250
    :goto_0
    return-void

    .line 248
    :cond_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/antivirus/update/d;->a(Lcom/qihoo/antivirus/update/ab;)V

    goto :goto_0
.end method

.method public a(Lorg/apache/http/HttpResponse;)V
    .locals 6

    .prologue
    .line 288
    const/4 v0, 0x0

    .line 289
    const-string/jumbo v1, "Date"

    invoke-interface {p1, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v1

    .line 290
    if-eqz v1, :cond_0

    .line 291
    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v1

    .line 292
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 294
    const-string/jumbo v2, "FileUpdateTask"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "Server time: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 296
    :try_start_0
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string/jumbo v3, "EEE, d MMM yyyy HH:mm:ss Z"

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v2, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 314
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 315
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 317
    :cond_1
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    .line 318
    iget-object v2, p0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v3, "serverTime"

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string/jumbo v3, "yyyyMMdd"

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 320
    iget-object v2, p0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v3, "timestamp"

    invoke-virtual {v2, v3, v0}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    const-string/jumbo v2, "FileUpdateTask"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "Server timestamp:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v3, "("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 324
    return-void

    .line 297
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected varargs a([Ljava/lang/Long;)V
    .locals 6

    .prologue
    .line 236
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 237
    iget-wide v2, p0, Lcom/qihoo/antivirus/update/v;->e:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 238
    iput-wide v0, p0, Lcom/qihoo/antivirus/update/v;->e:J

    .line 239
    iget-object v0, p0, Lcom/qihoo/antivirus/update/v;->a:Lcom/qihoo/antivirus/update/d;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const/4 v1, 0x1

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/qihoo/antivirus/update/d;->a(JJ)V

    .line 241
    :cond_0
    return-void
.end method

.method protected varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/qihoo/antivirus/update/v;->a([Ljava/lang/String;)Lcom/qihoo/antivirus/update/ab;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Lcom/qihoo/antivirus/update/ab;

    invoke-virtual {p0, p1}, Lcom/qihoo/antivirus/update/v;->a(Lcom/qihoo/antivirus/update/ab;)V

    return-void
.end method

.method protected varargs synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/qihoo/antivirus/update/v;->a([Ljava/lang/Long;)V

    return-void
.end method
