.class final Lkik/android/chat/fragment/jg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/app/LoaderManager$LoaderCallbacks;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikContactsListFragment;

.field private b:Z

.field private c:Z


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikContactsListFragment;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 380
    iput-object p1, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 381
    iput-boolean v0, p0, Lkik/android/chat/fragment/jg;->b:Z

    .line 382
    iput-boolean v0, p0, Lkik/android/chat/fragment/jg;->c:Z

    return-void
.end method


# virtual methods
.method public final onCreateLoader(ILandroid/os/Bundle;)Landroid/support/v4/content/Loader;
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 387
    packed-switch p1, :pswitch_data_0

    move-object v0, v3

    .line 395
    :goto_0
    return-object v0

    .line 389
    :pswitch_0
    new-instance v0, Landroid/support/v4/content/CursorLoader;

    iget-object v1, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikContactsListFragment;->f:Landroid/net/Uri;

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->e(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->j()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "filteredRecentContacts"

    :goto_1
    move-object v5, v3

    move-object v6, v3

    invoke-direct/range {v0 .. v6}, Landroid/support/v4/content/CursorLoader;-><init>(Landroid/content/Context;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v4, "recentcontacts"

    goto :goto_1

    .line 392
    :pswitch_1
    new-instance v0, Landroid/support/v4/content/CursorLoader;

    iget-object v1, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikContactsListFragment;->f:Landroid/net/Uri;

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->e(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->j()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "filteredContacts"

    :goto_2
    move-object v5, v3

    move-object v6, v3

    invoke-direct/range {v0 .. v6}, Landroid/support/v4/content/CursorLoader;-><init>(Landroid/content/Context;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v4, v3

    goto :goto_2

    .line 387
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic onLoadFinished(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
    .locals 13

    .prologue
    const/16 v12, 0x8

    const/4 v11, 0x3

    const v8, 0x7f0900ea

    const/4 v9, 0x1

    const/4 v10, 0x0

    .line 380
    check-cast p2, Landroid/database/Cursor;

    invoke-virtual {p1}, Landroid/support/v4/content/Loader;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iput-boolean v9, p0, Lkik/android/chat/fragment/jg;->b:Z

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v1, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-boolean v0, p0, Lkik/android/chat/fragment/jg;->b:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/jg;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->g()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    iput-boolean v10, p0, Lkik/android/chat/fragment/jg;->c:Z

    iput-boolean v10, p0, Lkik/android/chat/fragment/jg;->b:Z

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->n()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->g(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/a;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    new-instance v2, Lcom/kik/view/adapters/a;

    invoke-direct {v2, v1, v11}, Lcom/kik/view/adapters/a;-><init>(Landroid/content/Context;I)V

    invoke-static {v0, v2}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikContactsListFragment;Lcom/kik/view/adapters/a;)Lcom/kik/view/adapters/a;

    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->R()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-nez v0, :cond_f

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->R()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->g(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/a;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/kik/view/adapters/k;->b(Ljava/lang/String;Landroid/widget/Adapter;)V

    :cond_3
    :goto_2
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->o()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->I:Lkik/android/util/ck;

    sget-object v2, Lkik/android/util/ck$b;->c:Lkik/android/util/ck$b;

    invoke-virtual {v0, v2}, Lkik/android/util/ck;->b(Lkik/android/util/ck$b;)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->i(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/bd;

    move-result-object v0

    if-nez v0, :cond_4

    iget-object v7, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    new-instance v0, Lcom/kik/view/adapters/bd;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikContactsListFragment;->I:Lkik/android/util/ck;

    sget-object v3, Lkik/android/util/ck$b;->c:Lkik/android/util/ck$b;

    invoke-virtual {v2, v3}, Lkik/android/util/ck;->c(Lkik/android/util/ck$b;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikContactsListFragment;->I:Lkik/android/util/ck;

    sget-object v4, Lkik/android/util/ck$b;->c:Lkik/android/util/ck$b;

    invoke-virtual {v3, v4}, Lkik/android/util/ck;->d(Lkik/android/util/ck$b;)Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v4, v4, Lkik/android/chat/fragment/KikContactsListFragment;->K:Lcom/kik/cache/ad;

    iget-object v5, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/KikContactsListFragment;->H:Lkik/a/e/r;

    iget-object v6, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v6, v6, Lkik/android/chat/fragment/KikContactsListFragment;->J:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v6}, Lcom/kik/view/adapters/bd;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/Map;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    invoke-static {v7, v0}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikContactsListFragment;Lcom/kik/view/adapters/bd;)Lcom/kik/view/adapters/bd;

    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    invoke-static {v8}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    invoke-static {v8}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->i(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/bd;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;Landroid/widget/Adapter;)V

    :cond_5
    :goto_3
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    invoke-static {v2}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Z)V

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->x()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->g()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/16 v2, 0xa

    if-lt v0, v2, :cond_14

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    if-eqz v0, :cond_13

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v0, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    invoke-virtual {v2, v0}, Lcom/kik/view/adapters/ContactsCursorAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;

    :cond_6
    :goto_4
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->k(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/ContactsCursorAdapter;

    move-result-object v0

    if-eqz v0, :cond_15

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_15

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->k(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/ContactsCursorAdapter;

    move-result-object v2

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    invoke-virtual {v2, v0}, Lcom/kik/view/adapters/ContactsCursorAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;

    :goto_5
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/view/adapters/k;->notifyDataSetChanged()V

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    invoke-static {v0}, Lcom/kik/m/n;->a(Landroid/widget/ListView;)V

    :cond_7
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/view/adapters/k;->a()I

    move-result v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->n()Z

    move-result v2

    if-nez v2, :cond_1c

    if-nez v0, :cond_8

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->i()Z

    move-result v2

    if-eqz v2, :cond_9

    :cond_8
    if-nez v0, :cond_1c

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    :cond_9
    if-nez v0, :cond_1b

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->l(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->l(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1b

    :cond_a
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->p:Landroid/widget/TextView;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_6
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v2, 0x30

    invoke-virtual {v0, v2}, Landroid/view/Window;->setSoftInputMode(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0, v12}, Landroid/widget/ListView;->setVisibility(I)V

    :goto_7
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->m(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :cond_b
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    const-string v2, "suggest_text_2"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_1e

    :cond_c
    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/database/Cursor;

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->d(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1d

    move v0, v9

    :goto_8
    const/4 v2, 0x4

    new-array v2, v2, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikContactsListFragment;->i:Landroid/view/View;

    aput-object v3, v2, v10

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikContactsListFragment;->j:Landroid/view/View;

    aput-object v3, v2, v9

    const/4 v3, 0x2

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v4, v4, Lkik/android/chat/fragment/KikContactsListFragment;->k:Landroid/view/View;

    aput-object v4, v2, v3

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikContactsListFragment;->h:Landroid/view/View;

    aput-object v3, v2, v11

    invoke-static {v2}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->i()Z

    move-result v2

    if-eqz v2, :cond_d

    if-nez v0, :cond_d

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->d(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->d(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    :cond_d
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->x:Lkik/android/sdkutils/concurrent/c;

    invoke-virtual {v0}, Lkik/android/sdkutils/concurrent/c;->c()V

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->t()V

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->n(Lkik/android/chat/fragment/KikContactsListFragment;)Z

    :cond_e
    :goto_9
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->o(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikContactsListFragment;->b(Ljava/lang/String;)V

    const v0, 0x7f0e005e

    invoke-virtual {v1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->s()V

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getHeight()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/jh;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/jh;-><init>(Lkik/android/chat/fragment/jg;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    :pswitch_1
    iput-boolean v9, p0, Lkik/android/chat/fragment/jg;->c:Z

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v1, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_f
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->g(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Landroid/widget/Adapter;)V

    goto/16 :goto_2

    :cond_10
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->R()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    new-instance v2, Lcom/kik/view/adapters/a;

    invoke-direct {v2, v1, v10}, Lcom/kik/view/adapters/a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Landroid/widget/Adapter;)V

    goto/16 :goto_2

    :cond_11
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->i(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/bd;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->b(Landroid/widget/Adapter;)V

    goto/16 :goto_3

    :cond_12
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    invoke-static {v8}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    new-instance v2, Lcom/kik/view/adapters/bd;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikContactsListFragment;->K:Lcom/kik/cache/ad;

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v4, v4, Lkik/android/chat/fragment/KikContactsListFragment;->H:Lkik/a/e/r;

    iget-object v5, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/KikContactsListFragment;->J:Lcom/kik/android/a;

    invoke-direct {v2, v1, v3, v4, v5}, Lcom/kik/view/adapters/bd;-><init>(Landroid/content/Context;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->b(Landroid/widget/Adapter;)V

    goto/16 :goto_3

    :cond_13
    new-instance v0, Lcom/kik/view/adapters/MultiselectContactsCursorAdapter;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/database/Cursor;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->k()Z

    move-result v3

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->j(Lkik/android/chat/fragment/KikContactsListFragment;)Z

    move-result v4

    iget-object v5, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v6, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v6, v6, Lkik/android/chat/fragment/KikContactsListFragment;->K:Lcom/kik/cache/ad;

    iget-object v7, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v7, v7, Lkik/android/chat/fragment/KikContactsListFragment;->H:Lkik/a/e/r;

    iget-object v8, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v8, v8, Lkik/android/chat/fragment/KikContactsListFragment;->J:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v8}, Lcom/kik/view/adapters/MultiselectContactsCursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;ZZLcom/kik/view/adapters/u;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    invoke-static {}, Lkik/android/chat/fragment/KikContactsListFragment;->q()I

    move-result v2

    invoke-static {}, Lkik/android/chat/fragment/KikContactsListFragment;->r()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/kik/view/adapters/MultiselectContactsCursorAdapter;->a(II)V

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iput-object v0, v2, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->Q()Z

    move-result v4

    invoke-virtual {v0, v2, v3, v4}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;Landroid/widget/Adapter;Z)V

    goto/16 :goto_4

    :cond_14
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v0, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    invoke-virtual {v2, v0}, Lcom/kik/view/adapters/ContactsCursorAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;

    goto/16 :goto_4

    :cond_15
    new-instance v0, Lcom/kik/view/adapters/MultiselectContactsCursorAdapter;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/database/Cursor;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->k()Z

    move-result v3

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->j(Lkik/android/chat/fragment/KikContactsListFragment;)Z

    move-result v4

    iget-object v5, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v6, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v6, v6, Lkik/android/chat/fragment/KikContactsListFragment;->K:Lcom/kik/cache/ad;

    iget-object v7, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v7, v7, Lkik/android/chat/fragment/KikContactsListFragment;->H:Lkik/a/e/r;

    iget-object v8, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v8, v8, Lkik/android/chat/fragment/KikContactsListFragment;->J:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v8}, Lcom/kik/view/adapters/MultiselectContactsCursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;ZZLcom/kik/view/adapters/u;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    invoke-static {}, Lkik/android/chat/fragment/KikContactsListFragment;->q()I

    move-result v2

    invoke-static {}, Lkik/android/chat/fragment/KikContactsListFragment;->r()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/kik/view/adapters/MultiselectContactsCursorAdapter;->a(II)V

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2, v0}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikContactsListFragment;Lcom/kik/view/adapters/ContactsCursorAdapter;)Lcom/kik/view/adapters/ContactsCursorAdapter;

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->k(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/ContactsCursorAdapter;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->m()Z

    move-result v4

    invoke-virtual {v0, v2, v3, v4}, Lcom/kik/view/adapters/k;->b(Ljava/lang/String;Landroid/widget/Adapter;Z)V

    goto/16 :goto_5

    :cond_16
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->g()Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/16 v2, 0xa

    if-lt v0, v2, :cond_19

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    if-eqz v0, :cond_18

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_18

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v0, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    invoke-virtual {v2, v0}, Lcom/kik/view/adapters/ContactsCursorAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;

    :cond_17
    :goto_a
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->k(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/ContactsCursorAdapter;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->k(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/ContactsCursorAdapter;

    move-result-object v2

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    invoke-virtual {v2, v0}, Lcom/kik/view/adapters/ContactsCursorAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;

    goto/16 :goto_5

    :cond_18
    iget-object v8, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    new-instance v0, Lcom/kik/view/adapters/ContactsCursorAdapter;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/database/Cursor;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->k()Z

    move-result v3

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->j(Lkik/android/chat/fragment/KikContactsListFragment;)Z

    move-result v4

    iget-object v5, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/KikContactsListFragment;->K:Lcom/kik/cache/ad;

    iget-object v6, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v6, v6, Lkik/android/chat/fragment/KikContactsListFragment;->H:Lkik/a/e/r;

    iget-object v7, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v7, v7, Lkik/android/chat/fragment/KikContactsListFragment;->J:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v7}, Lcom/kik/view/adapters/ContactsCursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;ZZLcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    iput-object v0, v8, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->Q()Z

    move-result v4

    invoke-virtual {v0, v2, v3, v4}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;Landroid/widget/Adapter;Z)V

    goto :goto_a

    :cond_19
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    if-eqz v0, :cond_17

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/k;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_17

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v0, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    invoke-virtual {v2, v0}, Lcom/kik/view/adapters/ContactsCursorAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;

    goto/16 :goto_a

    :cond_1a
    iget-object v8, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    new-instance v0, Lcom/kik/view/adapters/ContactsCursorAdapter;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/database/Cursor;

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->k()Z

    move-result v3

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->j(Lkik/android/chat/fragment/KikContactsListFragment;)Z

    move-result v4

    iget-object v5, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/KikContactsListFragment;->K:Lcom/kik/cache/ad;

    iget-object v6, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v6, v6, Lkik/android/chat/fragment/KikContactsListFragment;->H:Lkik/a/e/r;

    iget-object v7, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v7, v7, Lkik/android/chat/fragment/KikContactsListFragment;->J:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v7}, Lcom/kik/view/adapters/ContactsCursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;ZZLcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    invoke-static {v8, v0}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikContactsListFragment;Lcom/kik/view/adapters/ContactsCursorAdapter;)Lcom/kik/view/adapters/ContactsCursorAdapter;

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->h()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikContactsListFragment;->k(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/ContactsCursorAdapter;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->m()Z

    move-result v4

    invoke-virtual {v0, v2, v3, v4}, Lcom/kik/view/adapters/k;->b(Ljava/lang/String;Landroid/widget/Adapter;Z)V

    goto/16 :goto_5

    :cond_1b
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->p:Landroid/widget/TextView;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->c()Ljava/lang/String;

    move-result-object v2

    new-array v3, v9, [Ljava/lang/Object;

    iget-object v4, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikContactsListFragment;->l(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v10

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_1c
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v2, 0x10

    invoke-virtual {v0, v2}, Landroid/view/Window;->setSoftInputMode(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0, v10}, Landroid/widget/ListView;->setVisibility(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v12}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_7

    :cond_1d
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_c

    :cond_1e
    move v0, v10

    goto/16 :goto_8

    :cond_1f
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikContactsListFragment;->d(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikContactsListFragment;Ljava/lang/String;)V

    goto/16 :goto_9

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onLoaderReset(Landroid/support/v4/content/Loader;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 600
    invoke-virtual {p1}, Landroid/support/v4/content/Loader;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 615
    :cond_0
    :goto_0
    return-void

    .line 602
    :pswitch_0
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    if-eqz v0, :cond_0

    .line 603
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/ContactsCursorAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;

    goto :goto_0

    .line 607
    :pswitch_1
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->k(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/ContactsCursorAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 608
    iget-object v0, p0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->k(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/ContactsCursorAdapter;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/ContactsCursorAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;

    goto :goto_0

    .line 600
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
