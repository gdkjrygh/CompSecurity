.class Lcom/kik/l/e;
.super Lcom/kik/l/y;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/database/Cursor;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1}, Lcom/kik/l/y;-><init>(Landroid/database/Cursor;)V

    .line 44
    return-void
.end method

.method public static a(Lkik/a/d/k;)Landroid/content/ContentValues;
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 158
    instance-of v3, p0, Lkik/a/d/n;

    .line 159
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 164
    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lkik/a/d/k;->l()Z

    move-result v0

    .line 165
    :goto_0
    const-string v5, "display_name"

    invoke-virtual {p0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string v5, "user_name"

    invoke-virtual {p0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const-string v5, "jid"

    invoke-virtual {p0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const-string v5, "in_roster"

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 169
    const-string v0, "is_stub"

    invoke-virtual {p0}, Lkik/a/d/k;->g()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 170
    const-string v0, "photo_url"

    invoke-virtual {p0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    const-string v0, "photo_timestamp"

    invoke-virtual {p0}, Lkik/a/d/k;->s()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    const-string v5, "is_group"

    if-eqz v3, :cond_1

    move v0, v1

    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 173
    const-string v5, "is_blocked"

    invoke-virtual {p0}, Lkik/a/d/k;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 174
    const-string v5, "is_ignored"

    invoke-virtual {p0}, Lkik/a/d/k;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 175
    const-string v5, "pending_convo_clear"

    if-eqz v3, :cond_4

    move-object v0, p0

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    :goto_4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 176
    const-string v5, "pending_in_roster"

    invoke-virtual {p0}, Lkik/a/d/k;->p()Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    :goto_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 177
    const-string v5, "pending_is_blocked"

    invoke-virtual {p0}, Lkik/a/d/k;->q()Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v1

    :goto_6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 178
    const-string v5, "appear_in_convos_list"

    invoke-virtual {p0}, Lkik/a/d/k;->u()Z

    move-result v0

    if-eqz v0, :cond_7

    move v0, v1

    :goto_7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 179
    const-string v0, "roster_operation_attempts"

    invoke-virtual {p0}, Lkik/a/d/k;->f()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 180
    const-string v0, "verified"

    invoke-virtual {p0}, Lkik/a/d/k;->i()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 181
    const-string v0, "public_key"

    invoke-virtual {p0}, Lkik/a/d/k;->j()[B

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 182
    const-string v0, "is_public_key_resolved"

    invoke-virtual {p0}, Lkik/a/d/k;->k()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v4, v0, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 183
    const-string v5, "is_user_admin"

    if-eqz v3, :cond_8

    move-object v0, p0

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->A()Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v1

    :goto_8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 184
    const-string v5, "group_hashtag"

    if-eqz v3, :cond_9

    move-object v0, p0

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->J()Ljava/lang/String;

    move-result-object v0

    :goto_9
    invoke-virtual {v4, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    const-string v5, "is_user_removed"

    if-eqz v3, :cond_a

    move-object v0, p0

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->B()Z

    move-result v0

    if-eqz v0, :cond_a

    :goto_a
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 188
    const-string v0, "content_links"

    invoke-virtual {p0}, Lkik/a/d/k;->d()Lcom/kik/f/a/a/c;

    move-result-object v1

    invoke-static {v1}, Lkik/a/h/g;->a(Lcom/b/a/n;)[B

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 190
    return-object v4

    .line 164
    :cond_0
    invoke-virtual {p0}, Lkik/a/d/k;->n()Z

    move-result v0

    goto/16 :goto_0

    :cond_1
    move v0, v2

    .line 172
    goto/16 :goto_1

    :cond_2
    move v0, v2

    .line 173
    goto/16 :goto_2

    :cond_3
    move v0, v2

    .line 174
    goto/16 :goto_3

    :cond_4
    move v0, v2

    .line 175
    goto/16 :goto_4

    :cond_5
    move v0, v2

    .line 176
    goto/16 :goto_5

    :cond_6
    move v0, v2

    .line 177
    goto/16 :goto_6

    :cond_7
    move v0, v2

    .line 178
    goto/16 :goto_7

    :cond_8
    move v0, v2

    .line 183
    goto :goto_8

    .line 184
    :cond_9
    const/4 v0, 0x0

    goto :goto_9

    :cond_a
    move v1, v2

    .line 187
    goto :goto_a
.end method


# virtual methods
.method final a()Lkik/a/d/k;
    .locals 27

    .prologue
    .line 195
    const/4 v1, 0x0

    .line 197
    invoke-virtual/range {p0 .. p0}, Lcom/kik/l/e;->isAfterLast()Z

    move-result v2

    if-nez v2, :cond_0

    .line 198
    const-string v1, "display_name"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/kik/l/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 199
    const-string v1, "user_name"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/kik/l/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 200
    const-string v1, "jid"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/kik/l/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 201
    const-string v2, "is_user_admin"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v7

    .line 202
    const-string v2, "is_stub"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v15

    .line 203
    const-string v2, "in_roster"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v6

    .line 204
    const-string v2, "is_group"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v4

    .line 205
    const-string v2, "is_blocked"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v18

    .line 206
    const-string v2, "pending_convo_clear"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v11

    .line 207
    const-string v2, "is_ignored"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v19

    .line 208
    const-string v2, "pending_in_roster"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v20

    .line 209
    const-string v2, "pending_is_blocked"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v21

    .line 210
    const-string v2, "appear_in_convos_list"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v22

    .line 211
    const-string v2, "roster_operation_attempts"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/kik/l/e;->d(Ljava/lang/String;)I

    move-result v23

    .line 212
    invoke-static {v1}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v2

    .line 213
    const-string v1, "verified"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v24

    .line 214
    const-string v1, "public_key"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/kik/l/e;->b(Ljava/lang/String;)[B

    move-result-object v25

    .line 215
    const-string v1, "is_public_key_resolved"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v26

    .line 216
    const-string v1, "is_user_removed"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/kik/l/e;->a(Ljava/lang/String;)Z

    move-result v12

    .line 217
    const-string v1, "group_hashtag"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/kik/l/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 219
    const-string v1, "photo_timestamp"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/kik/l/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 220
    const-string v1, "photo_url"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/kik/l/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 222
    const-string v1, "content_links"

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Lcom/kik/l/e;->b(Ljava/lang/String;)[B

    move-result-object v1

    const-class v5, Lcom/kik/f/a/a/c;

    invoke-static {v1, v5}, Lkik/a/h/g;->a([BLjava/lang/Class;)Lcom/b/a/n;

    move-result-object v1

    check-cast v1, Lcom/kik/f/a/a/c;

    .line 224
    if-eqz v4, :cond_1

    .line 225
    new-instance v1, Lkik/a/d/n;

    new-instance v4, Lkik/a/d/n$a;

    invoke-direct {v4}, Lkik/a/d/n$a;-><init>()V

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v10}, Lkik/a/d/n;-><init>(Lkik/a/d/j;Ljava/lang/String;Lkik/a/d/n$a;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v1

    .line 226
    check-cast v2, Lkik/a/d/n;

    invoke-virtual {v2, v12}, Lkik/a/d/n;->i(Z)V

    .line 227
    if-eqz v11, :cond_0

    move-object v2, v1

    .line 228
    check-cast v2, Lkik/a/d/n;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lkik/a/d/n;->k(Z)V

    .line 237
    :cond_0
    :goto_0
    return-object v1

    .line 232
    :cond_1
    new-instance v10, Lkik/a/d/k;

    move-object v11, v2

    move-object v12, v3

    move v14, v6

    move-object/from16 v16, v8

    move-object/from16 v17, v9

    invoke-direct/range {v10 .. v26}, Lkik/a/d/k;-><init>(Lkik/a/d/j;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZZZZZIZ[BZ)V

    .line 233
    invoke-virtual {v10, v1}, Lkik/a/d/k;->a(Lcom/kik/f/a/a/c;)V

    move-object v1, v10

    goto :goto_0
.end method
