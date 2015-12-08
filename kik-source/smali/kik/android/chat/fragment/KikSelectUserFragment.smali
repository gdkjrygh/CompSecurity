.class public Lkik/android/chat/fragment/KikSelectUserFragment;
.super Lkik/android/chat/fragment/KikDefaultContactsListFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikSelectUserFragment$a;
    }
.end annotation


# instance fields
.field private final U:Lkik/android/chat/fragment/KikSelectUserFragment$a;

.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;-><init>()V

    .line 28
    new-instance v0, Lkik/android/chat/fragment/KikSelectUserFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikSelectUserFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikSelectUserFragment;->U:Lkik/android/chat/fragment/KikSelectUserFragment$a;

    .line 194
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikSelectUserFragment;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 23
    if-eqz p1, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "KikSelectUserFragment.RESULT_JID"

    const-string v2, "chatContactJID"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikSelectUserFragment;->a(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSelectUserFragment;->J()V

    :cond_0
    return-void
.end method


# virtual methods
.method protected final K()I
    .locals 1

    .prologue
    .line 106
    const v0, 0x7f09030a

    return v0
.end method

.method protected final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 112
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final a(Lkik/a/d/k;)V
    .locals 3

    .prologue
    .line 56
    if-eqz p1, :cond_1

    .line 57
    invoke-virtual {p1}, Lkik/a/d/k;->m()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lkik/a/d/k;->l()Z

    move-result v0

    if-nez v0, :cond_2

    .line 58
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    .line 59
    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(I)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(Z)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v1

    iget-boolean v2, p0, Lkik/android/chat/fragment/KikSelectUserFragment;->a:Z

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->d(Z)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikSelectUserFragment;->U:Lkik/android/chat/fragment/KikSelectUserFragment$a;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikSelectUserFragment$a;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 64
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikSelectUserFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/pl;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/pl;-><init>(Lkik/android/chat/fragment/KikSelectUserFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 77
    :cond_1
    :goto_0
    return-void

    .line 74
    :cond_2
    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikSelectUserFragment;->a_(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected final a_(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 33
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikSelectUserFragment;->b(Landroid/view/View;)V

    .line 34
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 35
    const-string v1, "KikSelectUserFragment.RESULT_JID"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikSelectUserFragment;->a(Landroid/os/Bundle;)V

    .line 37
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSelectUserFragment;->J()V

    .line 38
    return-void
.end method

.method protected final b(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 180
    return-void
.end method

.method protected final b(Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 163
    return-void
.end method

.method protected final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 118
    const v0, 0x7f090106

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikSelectUserFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Z
    .locals 1

    .prologue
    .line 124
    const/4 v0, 0x1

    return v0
.end method

.method protected final e()V
    .locals 3

    .prologue
    .line 131
    invoke-super {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->e()V

    .line 133
    new-instance v1, Lkik/android/chat/fragment/KikAddContactFragment$b;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikAddContactFragment$b;-><init>()V

    .line 134
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikAddContactFragment$b;->b(I)Lkik/android/chat/fragment/KikAddContactFragment$b;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSelectUserFragment;->T()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikAddContactFragment$b;

    .line 135
    iget-object v0, p0, Lkik/android/chat/fragment/KikSelectUserFragment;->U:Lkik/android/chat/fragment/KikSelectUserFragment$a;

    if-eqz v0, :cond_0

    sget v0, Lcom/kik/ui/fragment/FragmentBase$a$a;->a:I

    .line 136
    :goto_0
    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 137
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikSelectUserFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/pm;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/pm;-><init>(Lkik/android/chat/fragment/KikSelectUserFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 152
    return-void

    .line 135
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikSelectUserFragment;->U:Lkik/android/chat/fragment/KikSelectUserFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikSelectUserFragment$a;->h()I

    move-result v0

    goto :goto_0
.end method

.method protected final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 157
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final g()Z
    .locals 1

    .prologue
    .line 174
    const/4 v0, 0x1

    return v0
.end method

.method protected final i()Z
    .locals 1

    .prologue
    .line 185
    const/4 v0, 0x1

    return v0
.end method

.method protected final j()Z
    .locals 1

    .prologue
    .line 191
    const/4 v0, 0x0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 82
    if-eqz p3, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const-string v0, "SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x621

    if-eq p1, v0, :cond_1

    const/16 v0, 0x617

    if-eq p1, v0, :cond_1

    .line 89
    :cond_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSelectUserFragment;->S()V

    .line 91
    :cond_1
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 43
    invoke-super {p0, p1, p2}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 44
    iget-object v0, p0, Lkik/android/chat/fragment/KikSelectUserFragment;->U:Lkik/android/chat/fragment/KikSelectUserFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSelectUserFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikSelectUserFragment$a;->a(Landroid/os/Bundle;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikSelectUserFragment;->U:Lkik/android/chat/fragment/KikSelectUserFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikSelectUserFragment$a;->a(Lkik/android/chat/fragment/KikSelectUserFragment$a;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikSelectUserFragment;->a:Z

    .line 45
    return-void
.end method
