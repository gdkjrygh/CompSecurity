.class public final Lcom/arist/model/a/b;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/arist/model/b/d;

.field private b:Lcom/arist/model/b/c;

.field private c:Lcom/arist/model/a/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/arist/model/b/d;

    invoke-direct {v0}, Lcom/arist/model/b/d;-><init>()V

    iput-object v0, p0, Lcom/arist/model/a/b;->a:Lcom/arist/model/b/d;

    new-instance v0, Lcom/arist/model/a/a;

    invoke-direct {v0}, Lcom/arist/model/a/a;-><init>()V

    iput-object v0, p0, Lcom/arist/model/a/b;->c:Lcom/arist/model/a/a;

    new-instance v0, Lcom/arist/model/b/c;

    sget-object v1, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/arist/model/b/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/model/a/b;->b:Lcom/arist/model/b/c;

    return-void
.end method

.method static synthetic a(Lcom/arist/model/a/b;)Lcom/arist/model/b/d;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/a/b;->a:Lcom/arist/model/b/d;

    return-object v0
.end method

.method private static a(Lcom/arist/b/b;Ljava/util/ArrayList;Z)V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0, p0}, Lcom/arist/b/c;->b(Lcom/arist/b/b;)Z

    if-eqz p2, :cond_0

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    new-instance v0, Lcom/arist/b/c;

    invoke-direct {v0}, Lcom/arist/b/c;-><init>()V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/arist/b/c;->b(I)V

    iget-object v1, p0, Lcom/arist/model/a/b;->b:Lcom/arist/model/b/c;

    invoke-virtual {v1}, Lcom/arist/model/b/c;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/b/c;->a(Ljava/util/ArrayList;)V

    sget-object v1, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    const v4, 0x7f09007f

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/b/c;->c(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/arist/b/c;

    invoke-direct {v0}, Lcom/arist/b/c;-><init>()V

    const/4 v1, -0x3

    invoke-virtual {v0, v1}, Lcom/arist/b/c;->b(I)V

    iget-object v1, p0, Lcom/arist/model/a/b;->b:Lcom/arist/model/b/c;

    invoke-virtual {v1}, Lcom/arist/model/b/c;->e()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/b/c;->a(Ljava/util/ArrayList;)V

    sget-object v1, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    const v4, 0x7f0900f8

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/b/c;->c(Ljava/lang/String;)V

    sget-object v1, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/arist/model/a/b;->a:Lcom/arist/model/b/d;

    invoke-virtual {v1}, Lcom/arist/model/b/d;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/arist/activity/MyApplication;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lcom/arist/activity/MyApplication;->m:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/arist/model/a/b;->b:Lcom/arist/model/b/c;

    invoke-virtual {v1}, Lcom/arist/model/b/c;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object v0, Lcom/arist/activity/MyApplication;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lcom/arist/activity/MyApplication;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/arist/model/a/b;->b:Lcom/arist/model/b/c;

    invoke-virtual {v1}, Lcom/arist/model/b/c;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object v0, Lcom/arist/activity/MyApplication;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lcom/arist/activity/MyApplication;->o:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/arist/model/a/b;->b:Lcom/arist/model/b/c;

    invoke-virtual {v1}, Lcom/arist/model/b/c;->c()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const-string v0, "PlayListBiz"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    new-instance v4, Lcom/arist/model/a/c;

    invoke-direct {v4, p0}, Lcom/arist/model/a/c;-><init>(Lcom/arist/model/a/b;)V

    invoke-static {v0, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;Lcom/arist/b/c;Landroid/widget/BaseAdapter;Lcom/arist/view/a;)V
    .locals 9

    new-instance v2, Landroid/widget/EditText;

    invoke-direct {v2, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/arist/b/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Lcom/arist/b/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setSelection(I)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x1080027

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0900c8

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    const v0, 0x7f090073

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    new-instance v0, Lcom/arist/model/a/d;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/arist/model/a/d;-><init>(Lcom/arist/model/a/b;Landroid/widget/EditText;Landroid/content/Context;Lcom/arist/b/c;Landroid/widget/BaseAdapter;Lcom/arist/view/a;)V

    invoke-virtual {v7, v8, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09004a

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public final a(Landroid/content/Context;Ljava/lang/Runnable;)V
    .locals 4

    new-instance v0, Landroid/widget/EditText;

    invoke-direct {v0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0900c4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(I)V

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x1080027

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f0900c3

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f09004b

    new-instance v3, Lcom/arist/model/a/e;

    invoke-direct {v3, p0, v0, p2, p1}, Lcom/arist/model/a/e;-><init>(Lcom/arist/model/a/b;Landroid/widget/EditText;Ljava/lang/Runnable;Landroid/content/Context;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09004a

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public final a(Lcom/arist/b/b;)V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/c/c;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/arist/model/a/b;->b:Lcom/arist/model/b/c;

    invoke-virtual {p1}, Lcom/arist/b/b;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/model/b/c;->a(I)I

    sget-object v0, Lcom/arist/activity/MyApplication;->n:Ljava/util/ArrayList;

    invoke-static {p1, v0, v2}, Lcom/arist/model/a/b;->a(Lcom/arist/b/b;Ljava/util/ArrayList;Z)V

    sget-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    invoke-static {p1, v0, v3}, Lcom/arist/model/a/b;->a(Lcom/arist/b/b;Ljava/util/ArrayList;Z)V

    sget-object v0, Lcom/arist/activity/MyApplication;->o:Ljava/util/ArrayList;

    invoke-static {p1, v0, v2}, Lcom/arist/model/a/b;->a(Lcom/arist/b/b;Ljava/util/ArrayList;Z)V

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-static {p1, v0, v3}, Lcom/arist/model/a/b;->a(Lcom/arist/b/b;Ljava/util/ArrayList;Z)V

    sget-object v0, Lcom/arist/activity/MyApplication;->m:Ljava/util/ArrayList;

    invoke-static {p1, v0, v2}, Lcom/arist/model/a/b;->a(Lcom/arist/b/b;Ljava/util/ArrayList;Z)V

    goto :goto_0
.end method

.method public final a(Lcom/arist/b/b;Lcom/arist/b/c;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/a/b;->a:Lcom/arist/model/b/d;

    invoke-virtual {v0, p1, p2}, Lcom/arist/model/b/d;->b(Lcom/arist/b/b;Lcom/arist/b/c;)V

    return-void
.end method

.method public final a(Lcom/arist/b/c;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/a/b;->a:Lcom/arist/model/b/d;

    invoke-virtual {v0, p1}, Lcom/arist/model/b/d;->c(Lcom/arist/b/c;)V

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lcom/arist/b/c;)V
    .locals 1

    invoke-virtual {p1}, Lcom/arist/b/c;->e()V

    iget-object v0, p0, Lcom/arist/model/a/b;->a:Lcom/arist/model/b/d;

    invoke-virtual {v0, p1}, Lcom/arist/model/b/d;->b(Lcom/arist/b/c;)V

    return-void
.end method
