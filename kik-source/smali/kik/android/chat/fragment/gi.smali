.class final Lkik/android/chat/fragment/gi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/util/ao;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatInfoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 165
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;Z)Z

    .line 166
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->x:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    .line 167
    invoke-virtual {v0}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v1

    .line 169
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/k;)Lkik/a/d/k;

    .line 170
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v2, "Chat Info Group Member Tapped"

    invoke-virtual {v0, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 171
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 172
    if-eqz v2, :cond_0

    .line 174
    invoke-virtual {v2}, Landroid/app/Activity;->closeContextMenu()V

    .line 176
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;

    move-result-object v0

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 177
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->f:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->showContextMenu()Z

    .line 182
    :goto_0
    return-void

    .line 180
    :cond_1
    new-instance v0, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->d(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    invoke-static {v0, v2}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0
.end method

.method public final a(Lkik/a/d/k;)V
    .locals 3

    .prologue
    .line 195
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;Z)Z

    .line 196
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/k;)Lkik/a/d/k;

    .line 197
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v1, "Chat Info Group Member Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 198
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 199
    if-eqz v1, :cond_0

    .line 201
    invoke-virtual {v1}, Landroid/app/Activity;->closeContextMenu()V

    .line 203
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;

    move-result-object v0

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 204
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->f:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->showContextMenu()Z

    .line 209
    :goto_0
    return-void

    .line 207
    :cond_1
    new-instance v0, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    iget-object v2, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 187
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;Z)Z

    .line 188
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v1, "Chat Info Add Group Member Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 189
    iget-object v0, p0, Lkik/android/chat/fragment/gi;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->d()V

    .line 190
    return-void
.end method
