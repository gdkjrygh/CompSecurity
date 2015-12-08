.class final Lkik/android/chat/fragment/lq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikGroupMembersListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V
    .locals 0

    .prologue
    .line 335
    iput-object p1, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    .line 339
    iget-object v0, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->c(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    .line 340
    iget-object v0, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->d(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/ba;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 341
    iget-object v0, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->d(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/view/adapters/ba;->notifyDataSetChanged()V

    .line 346
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->f(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/ba;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 347
    iget-object v0, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->f(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/view/adapters/ba;->notifyDataSetChanged()V

    .line 352
    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->h(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/ba;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 353
    iget-object v0, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->h(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/view/adapters/ba;->notifyDataSetChanged()V

    .line 359
    :goto_2
    iget-object v0, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->k(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->j(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->d(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/ba;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/view/adapters/k;->e(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 360
    iget-object v0, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->k(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->l(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->f(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/ba;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/view/adapters/k;->e(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 361
    iget-object v0, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->k(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->m(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->h(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/ba;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/view/adapters/k;->e(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 362
    iget-object v0, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->k(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/view/adapters/k;->notifyDataSetChanged()V

    .line 363
    return-void

    .line 344
    :cond_0
    iget-object v6, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    new-instance v0, Lcom/kik/view/adapters/ba;

    iget-object v1, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->e(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikGroupMembersListFragment;->d:Lcom/kik/cache/ad;

    iget-object v4, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v4, v4, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    iget-object v5, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/KikGroupMembersListFragment;->e:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v5}, Lcom/kik/view/adapters/ba;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    invoke-static {v6, v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikGroupMembersListFragment;Lcom/kik/view/adapters/ba;)Lcom/kik/view/adapters/ba;

    goto/16 :goto_0

    .line 350
    :cond_1
    iget-object v6, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    new-instance v0, Lcom/kik/view/adapters/ba;

    iget-object v1, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->g(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikGroupMembersListFragment;->d:Lcom/kik/cache/ad;

    iget-object v4, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v4, v4, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    iget-object v5, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/KikGroupMembersListFragment;->e:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v5}, Lcom/kik/view/adapters/ba;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    invoke-static {v6, v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(Lkik/android/chat/fragment/KikGroupMembersListFragment;Lcom/kik/view/adapters/ba;)Lcom/kik/view/adapters/ba;

    goto/16 :goto_1

    .line 356
    :cond_2
    iget-object v6, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    new-instance v0, Lcom/kik/view/adapters/ba;

    iget-object v1, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikGroupMembersListFragment;->d:Lcom/kik/cache/ad;

    iget-object v4, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v4, v4, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    iget-object v5, p0, Lkik/android/chat/fragment/lq;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/KikGroupMembersListFragment;->e:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v5}, Lcom/kik/view/adapters/ba;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    invoke-static {v6, v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->c(Lkik/android/chat/fragment/KikGroupMembersListFragment;Lcom/kik/view/adapters/ba;)Lcom/kik/view/adapters/ba;

    goto/16 :goto_2
.end method
