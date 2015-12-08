.class public Lkik/android/chat/fragment/KikComposeFragment;
.super Lkik/android/chat/fragment/KikDefaultContactsListFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikComposeFragment$a;
    }
.end annotation


# instance fields
.field private U:Z

.field private V:Z

.field private W:Landroid/view/View;

.field private X:Lkik/a/d/a/a;

.field private Y:J

.field private Z:Ljava/lang/String;

.field private a:Z

.field private final aa:Lkik/android/chat/fragment/KikComposeFragment$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 31
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;-><init>()V

    .line 33
    iput-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->a:Z

    .line 34
    iput-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->U:Z

    .line 35
    iput-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->V:Z

    .line 40
    new-instance v0, Lkik/android/chat/fragment/KikComposeFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikComposeFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->aa:Lkik/android/chat/fragment/KikComposeFragment$a;

    .line 307
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikComposeFragment;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikComposeFragment;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method private c(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 98
    if-eqz p1, :cond_0

    .line 99
    const-string v0, "chatContactJID"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 100
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikComposeFragment;->c(Ljava/lang/String;)V

    .line 102
    :cond_0
    return-void
.end method


# virtual methods
.method protected final K()I
    .locals 1

    .prologue
    .line 260
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->a:Z

    if-eqz v0, :cond_0

    .line 261
    const v0, 0x7f09030a

    .line 263
    :goto_0
    return v0

    :cond_0
    const v0, 0x7f09029d

    goto :goto_0
.end method

.method protected final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 134
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final a(Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 60
    if-eqz p1, :cond_2

    .line 61
    invoke-virtual {p1}, Lkik/a/d/k;->m()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lkik/a/d/k;->p()Z

    move-result v0

    if-nez v0, :cond_3

    .line 62
    :cond_0
    const/4 v0, 0x1

    .line 63
    iget-boolean v1, p0, Lkik/android/chat/fragment/KikComposeFragment;->a:Z

    if-eqz v1, :cond_1

    .line 64
    const/4 v0, 0x2

    .line 66
    :cond_1
    invoke-virtual {p0, p1, v0}, Lkik/android/chat/fragment/KikComposeFragment;->a(Lkik/a/d/k;I)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/ja;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ja;-><init>(Lkik/android/chat/fragment/KikComposeFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 81
    :cond_2
    :goto_0
    return-void

    .line 78
    :cond_3
    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikComposeFragment;->c(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected final a_(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 54
    invoke-virtual {p0, p1}, Lkik/android/chat/fragment/KikComposeFragment;->c(Ljava/lang/String;)V

    .line 55
    return-void
.end method

.method protected final b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 246
    if-eqz p1, :cond_0

    .line 247
    const-string v0, "find"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->L:Z

    .line 249
    :cond_0
    return-void
.end method

.method protected final b(Lkik/a/d/k;)V
    .locals 3

    .prologue
    .line 204
    iget-object v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->H:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/r;->b(Lkik/a/d/j;)Lcom/kik/g/p;

    move-result-object v0

    .line 206
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikComposeFragment;->getView()Landroid/view/View;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/jd;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/jd;-><init>(Lkik/android/chat/fragment/KikComposeFragment;)V

    invoke-static {v1, v2}, Lcom/kik/sdkutils/d;->a(Landroid/view/View;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 219
    return-void
.end method

.method protected final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 140
    const v0, 0x7f090106

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikComposeFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Z
    .locals 1

    .prologue
    .line 146
    const/4 v0, 0x0

    return v0
.end method

.method protected final e()V
    .locals 3

    .prologue
    .line 153
    invoke-super {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->e()V

    .line 154
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->a:Z

    if-eqz v0, :cond_0

    .line 155
    new-instance v0, Lkik/android/chat/fragment/KikAddContactFragment$b;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikAddContactFragment$b;-><init>()V

    .line 156
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikAddContactFragment$b;->b(I)Lkik/android/chat/fragment/KikAddContactFragment$b;

    move-result-object v1

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikComposeFragment;->T()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikAddContactFragment$b;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikComposeFragment;->aa:Lkik/android/chat/fragment/KikComposeFragment$a;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikComposeFragment$a;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 159
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikComposeFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/jb;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/jb;-><init>(Lkik/android/chat/fragment/KikComposeFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 185
    :goto_0
    return-void

    .line 169
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/KikAddContactFragment$b;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikAddContactFragment$b;-><init>()V

    .line 170
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikComposeFragment;->T()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikAddContactFragment$b;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikComposeFragment;->aa:Lkik/android/chat/fragment/KikComposeFragment$a;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikComposeFragment$a;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 172
    invoke-virtual {v0}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a()Lkik/android/chat/fragment/KikAddContactFragment$b;

    .line 175
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikComposeFragment;->S()V

    .line 176
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikComposeFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/jc;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/jc;-><init>(Lkik/android/chat/fragment/KikComposeFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method protected final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 195
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->a:Z

    if-nez v0, :cond_0

    .line 196
    const v0, 0x7f0902ab

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikComposeFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 198
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final g()Z
    .locals 1

    .prologue
    .line 235
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->a:Z

    if-eqz v0, :cond_0

    .line 236
    const/4 v0, 0x1

    .line 239
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final i()Z
    .locals 1

    .prologue
    .line 286
    const/4 v0, 0x1

    return v0
.end method

.method protected final j()Z
    .locals 1

    .prologue
    .line 292
    const/4 v0, 0x0

    return v0
.end method

.method protected final n()Z
    .locals 1

    .prologue
    .line 298
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->U:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final o()Z
    .locals 1

    .prologue
    .line 304
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->U:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 86
    const/16 v0, 0x617

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const-string v0, "SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    const-string v0, "SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 89
    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikComposeFragment;->c(Landroid/os/Bundle;)V

    .line 94
    :goto_0
    return-void

    .line 92
    :cond_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikComposeFragment;->S()V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 107
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->onCreate(Landroid/os/Bundle;)V

    .line 108
    iget-object v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->aa:Lkik/android/chat/fragment/KikComposeFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikComposeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikComposeFragment$a;->a(Landroid/os/Bundle;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->aa:Lkik/android/chat/fragment/KikComposeFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikComposeFragment$a;->a(Lkik/android/chat/fragment/KikComposeFragment$a;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->a:Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->aa:Lkik/android/chat/fragment/KikComposeFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikComposeFragment$a;->b(Lkik/android/chat/fragment/KikComposeFragment$a;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->U:Z

    .line 109
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 114
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->W:Landroid/view/View;

    .line 115
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikComposeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikComposeFragment;->b(Landroid/os/Bundle;)V

    .line 116
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/f/a/f;->e()Lkik/a/d/a/a;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->X:Lkik/a/d/a/a;

    .line 117
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/f/a/f;->g()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->Y:J

    .line 118
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/f/a/f;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->Z:Ljava/lang/String;

    .line 120
    iget-object v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->W:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 4

    .prologue
    .line 276
    invoke-super {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->onDestroy()V

    .line 277
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->U:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->V:Z

    if-nez v0, :cond_0

    .line 278
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikComposeFragment;->X:Lkik/a/d/a/a;

    iget-wide v2, p0, Lkik/android/chat/fragment/KikComposeFragment;->Y:J

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;J)V

    .line 279
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikComposeFragment;->Z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/android/f/a/f;->c(Ljava/lang/String;)V

    .line 281
    :cond_0
    return-void
.end method

.method public final v()Z
    .locals 1

    .prologue
    .line 269
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikComposeFragment;->V:Z

    .line 270
    invoke-super {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->v()Z

    move-result v0

    return v0
.end method
