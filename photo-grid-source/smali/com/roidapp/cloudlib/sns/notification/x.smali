.class public final Lcom/roidapp/cloudlib/sns/notification/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lorg/json/JSONObject;Landroid/os/Bundle;)[Lcom/roidapp/cloudlib/push/f;
    .locals 17

    .prologue
    .line 62
    .line 1212
    sget-boolean v2, Lcom/roidapp/baselib/f/a;->b:Z

    if-eqz v2, :cond_0

    .line 1213
    const/4 v2, 0x1

    .line 62
    :goto_0
    if-eqz v2, :cond_5

    .line 63
    const/4 v2, 0x0

    .line 164
    :goto_1
    return-object v2

    .line 1214
    :cond_0
    const-string v2, "activity"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/ActivityManager;

    .line 1215
    if-eqz v2, :cond_4

    .line 1216
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;

    move-result-object v2

    .line 1217
    if-eqz v2, :cond_4

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    .line 1218
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/ActivityManager$RunningTaskInfo;

    .line 1219
    if-eqz v2, :cond_3

    iget-object v3, v2, Landroid/app/ActivityManager$RunningTaskInfo;->baseActivity:Landroid/content/ComponentName;

    if-eqz v3, :cond_1

    const-string v3, "com.roidapp.photogrid"

    iget-object v4, v2, Landroid/app/ActivityManager$RunningTaskInfo;->baseActivity:Landroid/content/ComponentName;

    invoke-virtual {v4}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    iget-object v3, v2, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    if-eqz v3, :cond_3

    const-string v3, "com.roidapp.photogrid"

    iget-object v2, v2, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    goto :goto_0

    .line 1223
    :cond_4
    const/4 v2, 0x0

    goto :goto_0

    .line 66
    :cond_5
    invoke-static/range {p0 .. p0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 67
    const/4 v2, 0x0

    goto :goto_1

    .line 68
    :cond_6
    const-string v2, "sns_uid"

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v2

    .line 69
    invoke-static/range {p0 .. p0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v4

    iget-object v4, v4, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v4, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    cmp-long v2, v4, v2

    if-eqz v2, :cond_7

    .line 70
    const/4 v2, 0x0

    goto :goto_1

    .line 72
    :cond_7
    new-instance v2, Lcom/roidapp/cloudlib/sns/b/a/c;

    invoke-direct {v2}, Lcom/roidapp/cloudlib/sns/b/a/c;-><init>()V

    .line 73
    const/4 v3, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v2, v0, v3}, Lcom/roidapp/cloudlib/sns/b/a/c;->a(Lorg/json/JSONObject;Z)V

    .line 74
    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/b/a/c;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_10

    .line 75
    new-instance v12, Ljava/util/ArrayList;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/b/a/c;->size()I

    move-result v3

    invoke-direct {v12, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/b/a/c;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_8
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/roidapp/cloudlib/sns/b/h;

    .line 79
    if-eqz v6, :cond_8

    iget-object v2, v6, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    if-eqz v2, :cond_8

    iget-object v2, v6, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v2, :cond_8

    iget-object v2, v6, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    if-eqz v2, :cond_8

    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v4, 0x0

    .line 83
    const/4 v3, 0x0

    .line 84
    const/4 v2, 0x0

    .line 85
    const/4 v10, 0x0

    .line 87
    sget-object v5, Lcom/roidapp/cloudlib/sns/notification/y;->a:[I

    iget-object v7, v6, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    invoke-virtual {v7}, Lcom/roidapp/cloudlib/sns/b/i;->ordinal()I

    move-result v7

    aget v5, v5, v7

    packed-switch v5, :pswitch_data_0

    goto :goto_2

    .line 89
    :pswitch_0
    sget v2, Lcom/roidapp/cloudlib/at;->aJ:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-object v9, v6, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v9, v9, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    aput-object v9, v5, v7

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 90
    const/4 v2, 0x1

    move v5, v3

    move/from16 v16, v2

    move v2, v4

    move/from16 v4, v16

    .line 115
    :goto_3
    if-nez v2, :cond_9

    const-string v2, "snsPid"

    iget v3, v6, Lcom/roidapp/cloudlib/sns/b/h;->e:I

    move-object/from16 v0, p2

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 117
    :cond_9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_b

    .line 118
    iget-object v2, v6, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/c;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 120
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v9, 0x1050005

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 121
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v11, 0x1050006

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    .line 122
    if-eqz v2, :cond_c

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v11

    if-eqz v11, :cond_c

    .line 124
    :try_start_0
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v10

    .line 137
    :goto_4
    if-eqz v10, :cond_11

    .line 138
    :try_start_1
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    move-result-object v2

    const/4 v11, 0x0

    invoke-virtual {v2, v10, v3, v9, v11}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v2

    .line 139
    :goto_5
    if-eqz v2, :cond_a

    .line 140
    :try_start_2
    invoke-static {v2}, Lcom/roidapp/baselib/a/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3

    move-result-object v2

    :cond_a
    move-object v10, v2

    .line 146
    :cond_b
    :goto_6
    new-instance v2, Lcom/roidapp/cloudlib/push/f;

    if-eqz v5, :cond_d

    const/4 v3, 0x6

    :goto_7
    if-eqz v4, :cond_e

    iget v4, v6, Lcom/roidapp/cloudlib/sns/b/h;->e:I

    :goto_8
    const-string v5, "PGSns"

    iget v9, v6, Lcom/roidapp/cloudlib/sns/b/h;->e:I

    iget-wide v14, v6, Lcom/roidapp/cloudlib/sns/b/h;->f:J

    .line 1250
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v11, "PGSns"

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/roidapp/baselib/c/n;->b(Ljava/lang/String;)J

    move-result-wide v14

    invoke-virtual {v6, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 146
    const/4 v11, 0x0

    move-object/from16 v9, p2

    invoke-direct/range {v2 .. v11}, Lcom/roidapp/cloudlib/push/f;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/graphics/Bitmap;Z)V

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 93
    :pswitch_1
    sget v3, Lcom/roidapp/cloudlib/at;->aH:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-object v8, v6, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v8, v8, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    aput-object v8, v5, v7

    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 94
    iget-object v8, v6, Lcom/roidapp/cloudlib/sns/b/h;->b:Ljava/lang/String;

    .line 95
    const/4 v3, 0x1

    move v5, v3

    move/from16 v16, v2

    move v2, v4

    move/from16 v4, v16

    .line 96
    goto/16 :goto_3

    .line 98
    :pswitch_2
    sget v4, Lcom/roidapp/cloudlib/at;->aI:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-object v9, v6, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v9, v9, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    aput-object v9, v5, v7

    move-object/from16 v0, p0

    invoke-virtual {v0, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 99
    const/4 v4, 0x1

    move v5, v3

    move/from16 v16, v2

    move v2, v4

    move/from16 v4, v16

    .line 100
    goto/16 :goto_3

    .line 102
    :pswitch_3
    sget v2, Lcom/roidapp/cloudlib/at;->aK:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-object v8, v6, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v8, v8, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    aput-object v8, v5, v7

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 103
    iget-object v8, v6, Lcom/roidapp/cloudlib/sns/b/h;->b:Ljava/lang/String;

    .line 104
    const/4 v2, 0x1

    move v5, v3

    move/from16 v16, v2

    move v2, v4

    move/from16 v4, v16

    .line 105
    goto/16 :goto_3

    .line 107
    :pswitch_4
    sget v2, Lcom/roidapp/cloudlib/at;->aK:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-object v8, v6, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v8, v8, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    aput-object v8, v5, v7

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 108
    iget-object v8, v6, Lcom/roidapp/cloudlib/sns/b/h;->b:Ljava/lang/String;

    .line 109
    const/4 v2, 0x1

    move v5, v3

    move/from16 v16, v2

    move v2, v4

    move/from16 v4, v16

    .line 110
    goto/16 :goto_3

    .line 126
    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_4

    .line 130
    :cond_c
    :try_start_3
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v11, Lcom/roidapp/cloudlib/aq;->w:I

    invoke-static {v2, v11}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v10

    goto/16 :goto_4

    .line 132
    :catch_1
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_4

    .line 142
    :catch_2
    move-exception v2

    :goto_9
    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_6

    .line 146
    :cond_d
    const/4 v3, 0x4

    goto/16 :goto_7

    :cond_e
    sget v4, Lcom/roidapp/cloudlib/push/GcmBroadcastReceiver;->a:I

    add-int/lit8 v5, v4, 0x1

    sput v5, Lcom/roidapp/cloudlib/push/GcmBroadcastReceiver;->a:I

    goto/16 :goto_8

    .line 161
    :cond_f
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Lcom/roidapp/cloudlib/push/f;

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/roidapp/cloudlib/push/f;

    goto/16 :goto_1

    .line 164
    :cond_10
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 142
    :catch_3
    move-exception v3

    move-object v10, v2

    move-object v2, v3

    goto :goto_9

    :cond_11
    move-object v2, v10

    goto/16 :goto_5

    .line 87
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
