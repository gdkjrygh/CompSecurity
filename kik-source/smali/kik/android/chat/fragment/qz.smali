.class final Lkik/android/chat/fragment/qz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/SendToFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/SendToFragment;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lkik/android/chat/fragment/qz;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3

    .prologue
    .line 125
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lkik/android/util/af;

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lkik/android/chat/fragment/qz;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/SendToFragment;->c(Lkik/android/chat/fragment/SendToFragment;)Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/af;

    iget-object v0, v0, Lkik/android/util/af;->a:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    .line 147
    :goto_0
    return-void

    .line 129
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/qz;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/SendToFragment;->c(Lkik/android/chat/fragment/SendToFragment;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0, p3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 130
    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    .line 132
    iget-object v1, p0, Lkik/android/chat/fragment/qz;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/SendToFragment;->d(Lkik/android/chat/fragment/SendToFragment;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 133
    new-instance v1, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    .line 134
    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/qz;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/SendToFragment;->e(Lkik/android/chat/fragment/SendToFragment;)Lkik/android/chat/fragment/SendToFragment$a;

    move-result-object v2

    invoke-virtual {v2}, Lkik/android/chat/fragment/SendToFragment$a;->h()I

    move-result v2

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikChatFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 136
    iget-object v0, p0, Lkik/android/chat/fragment/qz;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/SendToFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v1, v0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 143
    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/qz;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/SendToFragment;->J()V

    .line 145
    iget-object v0, p0, Lkik/android/chat/fragment/qz;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/SendToFragment;->f(Lkik/android/chat/fragment/SendToFragment;)Z

    goto :goto_0

    .line 139
    :cond_1
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 140
    const-string v2, "SendToFragment.RESULT_JID"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    iget-object v0, p0, Lkik/android/chat/fragment/qz;->a:Lkik/android/chat/fragment/SendToFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/SendToFragment;->a(Landroid/os/Bundle;)V

    goto :goto_1
.end method
