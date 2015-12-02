.class Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/appbox/b/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 99
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 104
    :goto_0
    return-void

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 103
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->k:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public a(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 162
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 171
    :cond_0
    :goto_0
    return-void

    .line 165
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 166
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->f()V

    .line 167
    const v0, 0x9ca6

    if-ne v0, p1, :cond_0

    .line 168
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 169
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->m:Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;->a()V

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/appbox/core/AppBoxResponse;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v2, 0x1

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 155
    :cond_0
    :goto_0
    return-void

    .line 114
    :cond_1
    if-eqz p1, :cond_0

    .line 117
    iget-object v0, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 121
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 122
    iget v0, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->end_state:I

    if-ne v0, v2, :cond_2

    .line 123
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->m:Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;->a()V

    .line 126
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-static {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->a(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 127
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-static {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->a(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 128
    const/16 v0, 0x6592

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 135
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-static {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->a(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-static {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->a(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_7

    .line 136
    invoke-static {}, Lcom/qihoo/security/appbox/core/a;->a()Lcom/qihoo/security/appbox/core/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/core/a;->c()I

    move-result v0

    .line 137
    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 138
    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1, v2}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->b(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 139
    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-static {v1}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->b(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 140
    iget-object v1, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 141
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-static {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->a(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/core/c;

    .line 142
    iget-object v3, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-static {v3}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->b(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    .line 129
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-static {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->a(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v2, :cond_5

    .line 130
    const/16 v0, 0x6593

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_1

    .line 131
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-static {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->a(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 132
    const/16 v0, 0x6594

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto/16 :goto_1

    .line 145
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-static {v1}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->b(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/appbox/ui/view/a;->a(Ljava/util/List;)V

    .line 149
    :goto_3
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->r:Landroid/content/Context;

    const-string/jumbo v1, "click_home_appbox_timestamp"

    invoke-static {v0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 150
    cmp-long v2, v0, v4

    if-eqz v2, :cond_0

    .line 151
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v0, v2, v0

    .line 152
    const/16 v2, 0x659a

    invoke-static {v2, v0, v1}, Lcom/qihoo/security/support/b;->b(IJ)V

    .line 153
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->r:Landroid/content/Context;

    const-string/jumbo v1, "click_home_appbox_timestamp"

    invoke-static {v0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    goto/16 :goto_0

    .line 147
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    iget-object v1, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/appbox/ui/view/a;->a(Ljava/util/List;)V

    goto :goto_3
.end method

.method public b()V
    .locals 2

    .prologue
    .line 178
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 183
    :goto_0
    return-void

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 182
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->f()V

    goto :goto_0
.end method
