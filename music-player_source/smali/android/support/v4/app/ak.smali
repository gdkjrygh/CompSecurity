.class final Landroid/support/v4/app/ak;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/app/af;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v4/app/ad;)Landroid/app/Notification;
    .locals 18

    new-instance v1, Landroid/support/v4/app/am;

    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/support/v4/app/ad;->a:Landroid/content/Context;

    move-object/from16 v0, p1

    iget-object v3, v0, Landroid/support/v4/app/ad;->r:Landroid/app/Notification;

    move-object/from16 v0, p1

    iget-object v4, v0, Landroid/support/v4/app/ad;->b:Ljava/lang/CharSequence;

    move-object/from16 v0, p1

    iget-object v5, v0, Landroid/support/v4/app/ad;->c:Ljava/lang/CharSequence;

    move-object/from16 v0, p1

    iget-object v6, v0, Landroid/support/v4/app/ad;->h:Ljava/lang/CharSequence;

    move-object/from16 v0, p1

    iget-object v7, v0, Landroid/support/v4/app/ad;->f:Landroid/widget/RemoteViews;

    move-object/from16 v0, p1

    iget v8, v0, Landroid/support/v4/app/ad;->i:I

    move-object/from16 v0, p1

    iget-object v9, v0, Landroid/support/v4/app/ad;->d:Landroid/app/PendingIntent;

    move-object/from16 v0, p1

    iget-object v10, v0, Landroid/support/v4/app/ad;->e:Landroid/app/PendingIntent;

    move-object/from16 v0, p1

    iget-object v11, v0, Landroid/support/v4/app/ad;->g:Landroid/graphics/Bitmap;

    move-object/from16 v0, p1

    iget v12, v0, Landroid/support/v4/app/ad;->n:I

    move-object/from16 v0, p1

    iget v13, v0, Landroid/support/v4/app/ad;->o:I

    move-object/from16 v0, p1

    iget-boolean v14, v0, Landroid/support/v4/app/ad;->p:Z

    move-object/from16 v0, p1

    iget-boolean v15, v0, Landroid/support/v4/app/ad;->k:Z

    move-object/from16 v0, p1

    iget v0, v0, Landroid/support/v4/app/ad;->j:I

    move/from16 v16, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/support/v4/app/ad;->m:Ljava/lang/CharSequence;

    move-object/from16 v17, v0

    invoke-direct/range {v1 .. v17}, Landroid/support/v4/app/am;-><init>(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;IIZZILjava/lang/CharSequence;)V

    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/support/v4/app/ad;->q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v4/app/aa;

    iget v4, v2, Landroid/support/v4/app/aa;->a:I

    iget-object v5, v2, Landroid/support/v4/app/aa;->b:Ljava/lang/CharSequence;

    iget-object v2, v2, Landroid/support/v4/app/aa;->c:Landroid/app/PendingIntent;

    invoke-virtual {v1, v4, v5, v2}, Landroid/support/v4/app/am;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/support/v4/app/ad;->l:Landroid/support/v4/app/al;

    if-eqz v2, :cond_1

    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/support/v4/app/ad;->l:Landroid/support/v4/app/al;

    instance-of v2, v2, Landroid/support/v4/app/ac;

    if-eqz v2, :cond_2

    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/support/v4/app/ad;->l:Landroid/support/v4/app/al;

    check-cast v2, Landroid/support/v4/app/ac;

    iget-object v3, v2, Landroid/support/v4/app/ac;->d:Ljava/lang/CharSequence;

    iget-boolean v4, v2, Landroid/support/v4/app/ac;->f:Z

    iget-object v5, v2, Landroid/support/v4/app/ac;->e:Ljava/lang/CharSequence;

    iget-object v2, v2, Landroid/support/v4/app/ac;->a:Ljava/lang/CharSequence;

    invoke-virtual {v1, v3, v4, v5, v2}, Landroid/support/v4/app/am;->a(Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V

    :cond_1
    :goto_1
    invoke-virtual {v1}, Landroid/support/v4/app/am;->a()Landroid/app/Notification;

    move-result-object v1

    return-object v1

    :cond_2
    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/support/v4/app/ad;->l:Landroid/support/v4/app/al;

    instance-of v2, v2, Landroid/support/v4/app/ae;

    if-eqz v2, :cond_3

    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/support/v4/app/ad;->l:Landroid/support/v4/app/al;

    check-cast v2, Landroid/support/v4/app/ae;

    iget-object v3, v2, Landroid/support/v4/app/ae;->d:Ljava/lang/CharSequence;

    iget-boolean v4, v2, Landroid/support/v4/app/ae;->f:Z

    iget-object v5, v2, Landroid/support/v4/app/ae;->e:Ljava/lang/CharSequence;

    iget-object v2, v2, Landroid/support/v4/app/ae;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v3, v4, v5, v2}, Landroid/support/v4/app/am;->a(Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/util/ArrayList;)V

    goto :goto_1

    :cond_3
    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/support/v4/app/ad;->l:Landroid/support/v4/app/al;

    instance-of v2, v2, Landroid/support/v4/app/ab;

    if-eqz v2, :cond_1

    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/support/v4/app/ad;->l:Landroid/support/v4/app/al;

    move-object v7, v2

    check-cast v7, Landroid/support/v4/app/ab;

    iget-object v2, v7, Landroid/support/v4/app/ab;->d:Ljava/lang/CharSequence;

    iget-boolean v3, v7, Landroid/support/v4/app/ab;->f:Z

    iget-object v4, v7, Landroid/support/v4/app/ab;->e:Ljava/lang/CharSequence;

    iget-object v5, v7, Landroid/support/v4/app/ab;->a:Landroid/graphics/Bitmap;

    iget-object v6, v7, Landroid/support/v4/app/ab;->b:Landroid/graphics/Bitmap;

    iget-boolean v7, v7, Landroid/support/v4/app/ab;->c:Z

    invoke-virtual/range {v1 .. v7}, Landroid/support/v4/app/am;->a(Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Z)V

    goto :goto_1
.end method
