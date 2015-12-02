.class final Lcom/qihoo/security/support/b$a;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/support/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 68
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .prologue
    const-wide/16 v2, 0x0

    const/4 v8, 0x1

    const/4 v6, 0x0

    .line 72
    if-nez p1, :cond_1

    .line 298
    :cond_0
    :goto_0
    return-void

    .line 79
    :cond_1
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 81
    const-string/jumbo v0, ""

    .line 82
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 88
    :pswitch_0
    invoke-static {v1}, Lcom/qihoo/security/support/b;->d(I)Ljava/lang/String;

    move-result-object v0

    .line 90
    const/4 v2, 0x0

    :try_start_0
    invoke-static {v0, v2}, Lcom/qihoo/security/support/b;->a(Ljava/lang/String;I)I

    move-result v2

    add-int/2addr v2, v8

    invoke-static {v0, v2}, Lcom/qihoo/security/support/b;->b(Ljava/lang/String;I)V

    .line 91
    invoke-static {v1}, Lcom/qihoo/security/support/b;->e(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 92
    invoke-static {v1}, Lcom/qihoo/security/support/b;->f(I)Ljava/lang/String;

    move-result-object v0

    .line 93
    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/support/b;->c(Ljava/lang/String;I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v0, v2}, Lcom/qihoo/security/support/b;->d(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_9

    .line 101
    :cond_2
    :goto_1
    invoke-static {v1}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0

    .line 108
    :pswitch_1
    iget v0, p1, Landroid/os/Message;->arg2:I

    .line 109
    invoke-static {v1}, Lcom/qihoo/security/support/b;->d(I)Ljava/lang/String;

    move-result-object v2

    .line 111
    const/4 v3, 0x0

    :try_start_1
    invoke-static {v2, v3}, Lcom/qihoo/security/support/b;->a(Ljava/lang/String;I)I

    move-result v3

    add-int/2addr v3, v0

    invoke-static {v2, v3}, Lcom/qihoo/security/support/b;->b(Ljava/lang/String;I)V

    .line 112
    invoke-static {v1}, Lcom/qihoo/security/support/b;->e(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 113
    invoke-static {v1}, Lcom/qihoo/security/support/b;->f(I)Ljava/lang/String;

    move-result-object v2

    .line 114
    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/qihoo/security/support/b;->c(Ljava/lang/String;I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v2, v3}, Lcom/qihoo/security/support/b;->d(Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_8

    .line 121
    :cond_3
    :goto_2
    int-to-long v2, v0

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_0

    .line 128
    :pswitch_2
    iget v0, p1, Landroid/os/Message;->arg2:I

    .line 129
    invoke-static {v1}, Lcom/qihoo/security/support/b;->d(I)Ljava/lang/String;

    move-result-object v2

    .line 131
    :try_start_2
    invoke-static {v2, v0}, Lcom/qihoo/security/support/b;->b(Ljava/lang/String;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    .line 137
    :goto_3
    int-to-long v2, v0

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_0

    .line 143
    :pswitch_3
    invoke-static {v1}, Lcom/qihoo/security/support/b;->d(I)Ljava/lang/String;

    move-result-object v0

    .line 144
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const-string/jumbo v3, "value"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 146
    const-wide/16 v4, 0x0

    :try_start_3
    invoke-static {v0, v4, v5}, Lcom/qihoo/security/support/b;->a(Ljava/lang/String;J)J

    move-result-wide v4

    add-long/2addr v4, v2

    invoke-static {v0, v4, v5}, Lcom/qihoo/security/support/b;->b(Ljava/lang/String;J)V

    .line 147
    invoke-static {v1}, Lcom/qihoo/security/support/b;->e(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 148
    invoke-static {v1}, Lcom/qihoo/security/support/b;->f(I)Ljava/lang/String;

    move-result-object v0

    .line 149
    const/4 v4, 0x0

    invoke-static {v0, v4}, Lcom/qihoo/security/support/b;->c(Ljava/lang/String;I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v0, v4}, Lcom/qihoo/security/support/b;->d(Ljava/lang/String;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7

    .line 156
    :cond_4
    :goto_4
    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_0

    .line 162
    :pswitch_4
    iget v0, p1, Landroid/os/Message;->arg2:I

    .line 163
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const-string/jumbo v3, "value"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 165
    :try_start_4
    invoke-static {v1}, Lcom/qihoo/security/support/b;->d(I)Ljava/lang/String;

    move-result-object v3

    .line 166
    const-string/jumbo v4, ""

    invoke-static {v3, v4}, Lcom/qihoo/security/support/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 167
    invoke-static {v4, v0, v2}, Lcom/qihoo/security/support/b;->a(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v2

    .line 168
    invoke-static {v3, v2}, Lcom/qihoo/security/support/b;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    .line 174
    :goto_5
    int-to-long v2, v0

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_0

    .line 177
    :pswitch_5
    iget v0, p1, Landroid/os/Message;->arg2:I

    .line 178
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    const-string/jumbo v3, "value"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 184
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 190
    :pswitch_6
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 191
    if-eqz v0, :cond_0

    .line 192
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static/range {v1 .. v6}, Lcom/qihoo/security/support/b;->a(IJJZ)Landroid/content/ContentValues;

    move-result-object v1

    .line 194
    if-eqz v1, :cond_0

    .line 196
    :try_start_5
    sget-object v2, Lcom/qihoo/security/support/StatisticianProvider;->a:Landroid/net/Uri;

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_0

    .line 197
    :catch_0
    move-exception v0

    goto/16 :goto_0

    .line 206
    :pswitch_7
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 207
    const-string/jumbo v2, "value"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 208
    const-string/jumbo v3, "value2"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 209
    const-string/jumbo v4, "value3"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 213
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 214
    if-eqz v0, :cond_0

    .line 215
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static/range {v1 .. v8}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;JJZ)Landroid/content/ContentValues;

    move-result-object v1

    .line 217
    if-eqz v1, :cond_0

    .line 219
    :try_start_6
    sget-object v2, Lcom/qihoo/security/support/StatisticianProvider;->a:Landroid/net/Uri;

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto/16 :goto_0

    .line 220
    :catch_1
    move-exception v0

    goto/16 :goto_0

    .line 230
    :pswitch_8
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 231
    const-string/jumbo v2, "value"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 232
    const-string/jumbo v3, "value2"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 233
    const-string/jumbo v4, "value3"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 237
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 238
    if-eqz v0, :cond_0

    .line 239
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    move v7, v8

    invoke-static/range {v1 .. v7}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)Landroid/content/ContentValues;

    move-result-object v1

    .line 241
    if-eqz v1, :cond_0

    .line 243
    :try_start_7
    sget-object v2, Lcom/qihoo/security/support/StatisticianProvider;->a:Landroid/net/Uri;

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    goto/16 :goto_0

    .line 244
    :catch_2
    move-exception v0

    goto/16 :goto_0

    .line 253
    :pswitch_9
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 254
    const-string/jumbo v2, "value"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 255
    const-string/jumbo v3, "value2"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 259
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 260
    if-eqz v0, :cond_0

    .line 261
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move v6, v8

    invoke-static/range {v1 .. v6}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;JZ)Landroid/content/ContentValues;

    move-result-object v1

    .line 263
    if-eqz v1, :cond_0

    .line 265
    :try_start_8
    sget-object v2, Lcom/qihoo/security/support/StatisticianProvider;->a:Landroid/net/Uri;

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    goto/16 :goto_0

    .line 266
    :catch_3
    move-exception v0

    goto/16 :goto_0

    .line 275
    :pswitch_a
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 276
    const-string/jumbo v2, "value"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 280
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 281
    if-eqz v0, :cond_0

    .line 282
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move v6, v8

    invoke-static/range {v1 .. v6}, Lcom/qihoo/security/support/b;->a(IJJZ)Landroid/content/ContentValues;

    move-result-object v1

    .line 284
    if-eqz v1, :cond_0

    .line 286
    :try_start_9
    sget-object v2, Lcom/qihoo/security/support/StatisticianProvider;->a:Landroid/net/Uri;

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    goto/16 :goto_0

    .line 287
    :catch_4
    move-exception v0

    goto/16 :goto_0

    .line 132
    :catch_5
    move-exception v2

    goto/16 :goto_3

    .line 169
    :catch_6
    move-exception v2

    goto/16 :goto_5

    .line 151
    :catch_7
    move-exception v0

    goto/16 :goto_4

    .line 116
    :catch_8
    move-exception v2

    goto/16 :goto_2

    .line 95
    :catch_9
    move-exception v0

    goto/16 :goto_1

    .line 82
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method
