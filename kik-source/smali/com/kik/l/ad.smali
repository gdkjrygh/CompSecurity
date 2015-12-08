.class final Lcom/kik/l/ad;
.super Lcom/kik/l/y;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/database/Cursor;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1}, Lcom/kik/l/y;-><init>(Landroid/database/Cursor;)V

    .line 45
    return-void
.end method

.method public static a(Lkik/a/d/s;)Landroid/content/ContentValues;
    .locals 13

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 143
    const-class v0, Lkik/a/d/a/h;

    invoke-static {p0, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/h;

    .line 144
    const/4 v1, 0x0

    .line 146
    if-eqz v0, :cond_8

    .line 147
    invoke-virtual {v0}, Lkik/a/d/a/h;->a()Ljava/lang/String;

    move-result-object v0

    .line 150
    :goto_0
    invoke-virtual {p0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v5

    .line 151
    invoke-virtual {p0}, Lkik/a/d/s;->d()Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v2

    .line 152
    :goto_1
    invoke-virtual {p0}, Lkik/a/d/s;->c()I

    move-result v6

    .line 153
    invoke-virtual {p0}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v7

    .line 154
    invoke-virtual {p0}, Lkik/a/d/s;->a()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    move v4, v3

    .line 155
    :goto_2
    invoke-virtual {p0}, Lkik/a/d/s;->e()J

    move-result-wide v8

    .line 156
    invoke-virtual {p0}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v10

    .line 158
    new-instance v11, Landroid/content/ContentValues;

    invoke-direct {v11}, Landroid/content/ContentValues;-><init>()V

    .line 159
    const-string v12, "body"

    invoke-virtual {v11, v12, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v0, "partner_jid"

    invoke-virtual {v11, v0, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    const-string v0, "was_me"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 162
    const-string v0, "read_state"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 163
    const-string v0, "uid"

    invoke-virtual {v11, v0, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    const-string v0, "length"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 166
    const-string v0, "timestamp"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 167
    const-string v0, "bin_id"

    invoke-virtual {v11, v0, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const-string v0, "req_read_reciept"

    invoke-virtual {p0}, Lkik/a/d/s;->j()Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 169
    const-string v0, "message_retry_count"

    invoke-virtual {p0}, Lkik/a/d/s;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 171
    const-string v0, "encryption_failure"

    invoke-virtual {p0}, Lkik/a/d/s;->k()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 172
    const-string v0, "encryption_key"

    invoke-virtual {p0}, Lkik/a/d/s;->o()[B

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 175
    const-class v0, Lkik/a/d/a/m;

    invoke-static {p0, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/m;

    .line 176
    const-class v1, Lkik/a/d/a/l;

    invoke-static {p0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/l;

    .line 177
    const-class v2, Lkik/a/d/a/a;

    invoke-static {p0, v2}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v2

    check-cast v2, Lkik/a/d/a/a;

    .line 178
    const-class v3, Lkik/a/d/a/d;

    invoke-static {p0, v3}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v3

    check-cast v3, Lkik/a/d/a/d;

    .line 179
    const-class v4, Lkik/a/f/e/k;

    invoke-static {p0, v4}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v4

    check-cast v4, Lkik/a/f/e/k;

    .line 181
    if-eqz v4, :cond_0

    .line 182
    const-string v5, "render_instructions"

    invoke-virtual {v4}, Lkik/a/f/e/k;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    :cond_0
    if-eqz v0, :cond_1

    .line 186
    const-string v4, "sys_msg"

    invoke-virtual {v0}, Lkik/a/d/a/m;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    :cond_1
    if-eqz v1, :cond_2

    .line 190
    const-string v0, "stat_msg"

    invoke-virtual {v1}, Lkik/a/d/a/l;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const-string v0, "stat_user_jid"

    invoke-virtual {v1}, Lkik/a/d/a/l;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    const-string v0, "stat_special_visibility"

    invoke-virtual {v1}, Lkik/a/d/a/l;->c()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 195
    :cond_2
    if-eqz v2, :cond_3

    .line 196
    const-string v0, "content_id"

    invoke-virtual {v2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const-string v0, "app_id"

    invoke-virtual {v2}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    :cond_3
    if-eqz v3, :cond_4

    .line 201
    const-string v0, "friend_attr_id"

    invoke-virtual {v3}, Lkik/a/d/a/d;->i()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 204
    :cond_4
    return-object v11

    :cond_5
    move v1, v3

    .line 151
    goto/16 :goto_1

    .line 154
    :cond_6
    invoke-virtual {p0}, Lkik/a/d/s;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    goto/16 :goto_2

    :cond_7
    move v2, v3

    .line 168
    goto/16 :goto_3

    :cond_8
    move-object v0, v1

    goto/16 :goto_0
.end method
