.class final Lcom/roidapp/photogrid/release/ku;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/kt;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/kt;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .prologue
    const/16 v14, 0x17

    const/4 v1, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 121
    const/4 v0, 0x3

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "_data"

    aput-object v0, v2, v8

    const-string v0, "date_modified"

    aput-object v0, v2, v6

    const-string v0, "_size"

    aput-object v0, v2, v1

    .line 130
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "date_modified desc"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move v1, v8

    .line 136
    :goto_0
    if-eqz v1, :cond_12

    .line 138
    const-wide/16 v0, 0xbb8

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 143
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "date_modified desc"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    move-object v1, v0

    .line 151
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/16 v2, 0x3c

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 152
    if-eqz v1, :cond_f

    .line 154
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 155
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/16 v2, 0x3d

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 156
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_d

    .line 164
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide v4, 0x134fd9000L

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    div-long v10, v2, v4

    move-object v3, v7

    move v4, v8

    .line 168
    :cond_0
    :goto_3
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    move-result v0

    if-eqz v0, :cond_6

    .line 170
    const/4 v0, 0x0

    :try_start_4
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 171
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 182
    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 183
    if-eqz v5, :cond_0

    .line 210
    const/16 v2, 0xc8

    if-ge v4, v2, :cond_11

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    cmp-long v2, v8, v10

    if-lez v2, :cond_11

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    const-wide/16 v12, 0x5000

    cmp-long v2, v8, v12

    if-lez v2, :cond_11

    .line 211
    if-nez v3, :cond_10

    .line 212
    new-instance v2, Lcom/roidapp/photogrid/release/kz;

    iget-object v7, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/4 v8, 0x0

    invoke-direct {v2, v7, v8}, Lcom/roidapp/photogrid/release/kz;-><init>(Lcom/roidapp/photogrid/release/kt;B)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    .line 213
    :try_start_5
    iput-object v0, v2, Lcom/roidapp/photogrid/release/kz;->a:Ljava/lang/String;

    .line 216
    :goto_4
    iget v3, v2, Lcom/roidapp/photogrid/release/kz;->b:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lcom/roidapp/photogrid/release/kz;->b:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 218
    add-int/lit8 v4, v4, 0x1

    move v3, v4

    .line 222
    :goto_5
    :try_start_6
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v5, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 223
    const-string v7, "dcim/"

    invoke-virtual {v4, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 224
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/kt;->c(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->c(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/kz;

    iget v4, v0, Lcom/roidapp/photogrid/release/kz;->b:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, Lcom/roidapp/photogrid/release/kz;->b:I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    move v4, v3

    move-object v3, v2

    goto :goto_3

    .line 133
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v1, v6

    move-object v0, v7

    .line 134
    goto/16 :goto_0

    .line 140
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto/16 :goto_1

    .line 146
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 147
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v14}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 340
    :goto_6
    return-void

    .line 227
    :cond_1
    :try_start_7
    new-instance v4, Lcom/roidapp/photogrid/release/kz;

    iget-object v7, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/4 v8, 0x0

    invoke-direct {v4, v7, v8}, Lcom/roidapp/photogrid/release/kz;-><init>(Lcom/roidapp/photogrid/release/kt;B)V

    .line 228
    iput-object v0, v4, Lcom/roidapp/photogrid/release/kz;->a:Ljava/lang/String;

    .line 229
    iget v0, v4, Lcom/roidapp/photogrid/release/kz;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v4, Lcom/roidapp/photogrid/release/kz;->b:I

    .line 230
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->c(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, v5, v4}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v4, v3

    move-object v3, v2

    .line 231
    goto/16 :goto_3

    .line 232
    :cond_2
    const-string v7, "/face"

    invoke-virtual {v4, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 233
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/kt;->d(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 234
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->d(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/kz;

    iget v4, v0, Lcom/roidapp/photogrid/release/kz;->b:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, Lcom/roidapp/photogrid/release/kz;->b:I

    move v4, v3

    move-object v3, v2

    goto/16 :goto_3

    .line 236
    :cond_3
    new-instance v4, Lcom/roidapp/photogrid/release/kz;

    iget-object v7, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/4 v8, 0x0

    invoke-direct {v4, v7, v8}, Lcom/roidapp/photogrid/release/kz;-><init>(Lcom/roidapp/photogrid/release/kt;B)V

    .line 237
    iput-object v0, v4, Lcom/roidapp/photogrid/release/kz;->a:Ljava/lang/String;

    .line 238
    iget v0, v4, Lcom/roidapp/photogrid/release/kz;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v4, Lcom/roidapp/photogrid/release/kz;->b:I

    .line 239
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->d(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, v5, v4}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v4, v3

    move-object v3, v2

    .line 240
    goto/16 :goto_3

    .line 242
    :cond_4
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/kt;->e(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 243
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->e(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/kz;

    iget v4, v0, Lcom/roidapp/photogrid/release/kz;->b:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, Lcom/roidapp/photogrid/release/kz;->b:I

    move v4, v3

    move-object v3, v2

    goto/16 :goto_3

    .line 245
    :cond_5
    new-instance v4, Lcom/roidapp/photogrid/release/kz;

    iget-object v7, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/4 v8, 0x0

    invoke-direct {v4, v7, v8}, Lcom/roidapp/photogrid/release/kz;-><init>(Lcom/roidapp/photogrid/release/kt;B)V

    .line 246
    iput-object v0, v4, Lcom/roidapp/photogrid/release/kz;->a:Ljava/lang/String;

    .line 247
    iget v0, v4, Lcom/roidapp/photogrid/release/kz;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v4, Lcom/roidapp/photogrid/release/kz;->b:I

    .line 248
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->e(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0, v5, v4}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    move v4, v3

    move-object v3, v2

    .line 255
    goto/16 :goto_3

    .line 251
    :catch_3
    move-exception v0

    move v3, v4

    .line 252
    :goto_7
    :try_start_8
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/16 v5, 0x4b

    invoke-static {v4, v5}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 253
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v4, v3

    move-object v3, v2

    .line 254
    goto/16 :goto_3

    .line 257
    :cond_6
    if-eqz v1, :cond_7

    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_7

    .line 258
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/16 v2, 0x4c

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 259
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 263
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->c(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kt;->e(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->size()I

    move-result v2

    add-int/2addr v0, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kt;->d(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->size()I

    move-result v2

    add-int/2addr v0, v2

    new-array v4, v0, [Ljava/lang/String;

    .line 264
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->c(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kt;->e(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->size()I

    move-result v2

    add-int/2addr v0, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kt;->d(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->size()I

    move-result v2

    add-int/2addr v0, v2

    new-array v5, v0, [Ljava/lang/String;

    .line 265
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->c(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kt;->e(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->size()I

    move-result v2

    add-int/2addr v0, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kt;->d(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->size()I

    move-result v2

    add-int/2addr v0, v2

    new-array v7, v0, [Ljava/lang/Integer;

    .line 266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/16 v2, 0x50

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 269
    const/4 v0, 0x0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;)Landroid/content/Context;

    move-result-object v2

    const v8, 0x7f0702cd

    invoke-virtual {v2, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v0

    .line 270
    if-eqz v3, :cond_8

    .line 271
    const/4 v0, 0x0

    iget v2, v3, Lcom/roidapp/photogrid/release/kz;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v7, v0

    .line 272
    const/4 v0, 0x0

    iget-object v2, v3, Lcom/roidapp/photogrid/release/kz;->a:Ljava/lang/String;

    aput-object v2, v5, v0

    .line 283
    :goto_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->c(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v6

    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 284
    aput-object v0, v4, v2

    .line 285
    iget-object v6, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v6}, Lcom/roidapp/photogrid/release/kt;->c(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/kz;

    .line 286
    iget v6, v0, Lcom/roidapp/photogrid/release/kz;->b:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v7, v2

    .line 287
    iget-object v0, v0, Lcom/roidapp/photogrid/release/kz;->a:Ljava/lang/String;

    aput-object v0, v5, v2

    .line 288
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/16 v6, 0x54

    invoke-static {v0, v6}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 289
    add-int/lit8 v2, v2, 0x1

    .line 290
    goto :goto_9

    .line 274
    :cond_8
    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v7, v0

    .line 275
    const/4 v0, 0x0

    const/4 v2, 0x0

    aput-object v2, v5, v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    goto :goto_8

    .line 327
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 328
    if-eqz v1, :cond_9

    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_9

    .line 329
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 331
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v14}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 332
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->f(Lcom/roidapp/photogrid/release/kt;)V

    goto/16 :goto_6

    .line 292
    :cond_a
    :try_start_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->d(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 293
    aput-object v0, v4, v2

    .line 294
    iget-object v6, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v6}, Lcom/roidapp/photogrid/release/kt;->d(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/kz;

    .line 295
    iget v6, v0, Lcom/roidapp/photogrid/release/kz;->b:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v7, v2

    .line 296
    iget-object v0, v0, Lcom/roidapp/photogrid/release/kz;->a:Ljava/lang/String;

    aput-object v0, v5, v2

    .line 297
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/16 v6, 0x56

    invoke-static {v0, v6}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 298
    add-int/lit8 v2, v2, 0x1

    .line 299
    goto :goto_a

    .line 300
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->e(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 301
    aput-object v0, v4, v2

    .line 302
    iget-object v6, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v6}, Lcom/roidapp/photogrid/release/kt;->e(Lcom/roidapp/photogrid/release/kt;)Ljava/util/LinkedHashMap;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/kz;

    .line 303
    iget v6, v0, Lcom/roidapp/photogrid/release/kz;->b:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v7, v2

    .line 304
    iget-object v0, v0, Lcom/roidapp/photogrid/release/kz;->a:Ljava/lang/String;

    aput-object v0, v5, v2

    .line 305
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 306
    goto :goto_b

    .line 307
    :cond_c
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 308
    const-string v2, "folders_array"

    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    const-string v2, "first_pics"

    invoke-virtual {v0, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    const-string v2, "count"

    invoke-virtual {v0, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/16 v3, 0x57

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 312
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 313
    const/16 v3, 0x11

    iput v3, v2, Landroid/os/Message;->what:I

    .line 314
    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 315
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 316
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->f(Lcom/roidapp/photogrid/release/kt;)V

    goto/16 :goto_6

    .line 318
    :cond_d
    if-eqz v1, :cond_e

    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_e

    .line 319
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/16 v2, 0x58

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 320
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 322
    :cond_e
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v0

    const/16 v2, 0x18

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 323
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/16 v2, 0x59

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 324
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->f(Lcom/roidapp/photogrid/release/kt;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    goto/16 :goto_6

    .line 336
    :cond_f
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 337
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    const/16 v1, 0x5a

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 338
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ku;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->f(Lcom/roidapp/photogrid/release/kt;)V

    goto/16 :goto_6

    .line 251
    :catch_5
    move-exception v0

    goto/16 :goto_7

    :catch_6
    move-exception v0

    move-object v2, v3

    move v3, v4

    goto/16 :goto_7

    :cond_10
    move-object v2, v3

    goto/16 :goto_4

    :cond_11
    move-object v2, v3

    move v3, v4

    goto/16 :goto_5

    :cond_12
    move-object v1, v0

    goto/16 :goto_2
.end method
