.class public Lkik/android/chat/fragment/KikPickContactFragment;
.super Lkik/android/chat/fragment/KikDefaultContactsListFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikPickContactFragment$a;
    }
.end annotation


# static fields
.field private static final Y:Lorg/c/b;


# instance fields
.field private U:Ljava/util/List;

.field private V:Lkik/a/d/n;

.field private W:Landroid/os/Bundle;

.field private X:Lkik/android/chat/fragment/KikPickContactFragment$a;

.field protected a:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    const-string v0, "KikPickContactFragment"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/chat/fragment/KikPickContactFragment;->Y:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;-><init>()V

    .line 43
    new-instance v0, Lkik/android/chat/fragment/KikPickContactFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikPickContactFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->X:Lkik/android/chat/fragment/KikPickContactFragment$a;

    .line 291
    return-void
.end method


# virtual methods
.method protected final K()I
    .locals 1

    .prologue
    .line 172
    const v0, 0x7f09028a

    return v0
.end method

.method protected final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 184
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final a(Ljava/lang/String;Z)V
    .locals 4

    .prologue
    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    const-string v0, "filler;"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 83
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ";"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 86
    sget-object v1, Lkik/android/KikDataProvider;->b:Landroid/net/Uri;

    invoke-static {v1, v0}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickContactFragment;->a(Landroid/net/Uri;)V

    .line 87
    invoke-super {p0, p1, p2}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a(Ljava/lang/String;Z)V

    .line 88
    return-void
.end method

.method protected final a(Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 126
    if-eqz p1, :cond_0

    .line 127
    invoke-virtual {p1}, Lkik/a/d/k;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 128
    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Lkik/android/chat/fragment/KikPickContactFragment;->a(Lkik/a/d/k;I)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/nl;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/nl;-><init>(Lkik/android/chat/fragment/KikPickContactFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 140
    :cond_0
    :goto_0
    return-void

    .line 137
    :cond_1
    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikPickContactFragment;->a_(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected final a_(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 120
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickContactFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    const v1, 0x7f090031

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-virtual {p0, v1, v2}, Lkik/android/chat/fragment/KikPickContactFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f09028d

    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikPickContactFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f0902e0

    new-instance v3, Lkik/android/chat/fragment/nk;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/nk;-><init>(Lkik/android/chat/fragment/KikPickContactFragment;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f090326

    new-instance v3, Lkik/android/chat/fragment/nj;

    invoke-direct {v3, p0, p1}, Lkik/android/chat/fragment/nj;-><init>(Lkik/android/chat/fragment/KikPickContactFragment;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "confirmationDialog"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikPickContactFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 121
    return-void
.end method

.method protected final b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 273
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->X:Lkik/android/chat/fragment/KikPickContactFragment$a;

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikPickContactFragment$a;->a(Landroid/os/Bundle;)V

    .line 275
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->X:Lkik/android/chat/fragment/KikPickContactFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikPickContactFragment$a;->c(Lkik/android/chat/fragment/KikPickContactFragment$a;)Ljava/util/ArrayList;

    move-result-object v0

    .line 276
    iget-object v1, p0, Lkik/android/chat/fragment/KikPickContactFragment;->z:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 277
    return-void
.end method

.method protected final b(Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 256
    return-void
.end method

.method protected final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 190
    const v0, 0x7f090106

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickContactFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 219
    if-nez p1, :cond_1

    .line 245
    :cond_0
    :goto_0
    return-void

    .line 223
    :cond_1
    const-string v0, "kik.prof.extra.jid"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 224
    if-eqz v2, :cond_0

    .line 225
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->a:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    .line 226
    invoke-virtual {v0}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 229
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 230
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 231
    const/4 v0, 0x1

    .line 235
    :goto_1
    if-eqz v0, :cond_3

    .line 236
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickContactFragment;->J()V

    goto :goto_0

    .line 239
    :cond_3
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 240
    const-string v1, "kikpickcontactfrag.groupExtraJidReturn"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickContactFragment;->a(Landroid/os/Bundle;)V

    .line 242
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickContactFragment;->J()V

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method protected final d()Z
    .locals 1

    .prologue
    .line 196
    const/4 v0, 0x1

    return v0
.end method

.method protected final e()V
    .locals 3

    .prologue
    .line 203
    invoke-super {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->e()V

    .line 204
    new-instance v0, Lkik/android/chat/fragment/KikAddContactFragment$b;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikAddContactFragment$b;-><init>()V

    .line 205
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikAddContactFragment$b;->b(I)Lkik/android/chat/fragment/KikAddContactFragment$b;

    move-result-object v1

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickContactFragment;->T()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikAddContactFragment$b;

    .line 207
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickContactFragment;->S()V

    .line 208
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickContactFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/nm;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/nm;-><init>(Lkik/android/chat/fragment/KikPickContactFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 215
    return-void
.end method

.method protected final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 250
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final g()Z
    .locals 1

    .prologue
    .line 267
    const/4 v0, 0x1

    return v0
.end method

.method protected final i()Z
    .locals 1

    .prologue
    .line 282
    const/4 v0, 0x1

    return v0
.end method

.method protected final j()Z
    .locals 1

    .prologue
    .line 288
    const/4 v0, 0x0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 145
    const/16 v0, 0x617

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const-string v0, "SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    const-string v0, "SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 149
    iput-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->W:Landroid/os/Bundle;

    .line 157
    :goto_0
    return-void

    .line 154
    :cond_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickContactFragment;->S()V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 51
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickContactFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikPickContactFragment;)V

    .line 52
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->onCreate(Landroid/os/Bundle;)V

    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->X:Lkik/android/chat/fragment/KikPickContactFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickContactFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPickContactFragment$a;->a(Landroid/os/Bundle;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->X:Lkik/android/chat/fragment/KikPickContactFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikPickContactFragment$a;->a(Lkik/android/chat/fragment/KikPickContactFragment$a;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    iput-object v1, p0, Lkik/android/chat/fragment/KikPickContactFragment;->U:Ljava/util/List;

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickContactFragment;->U:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    :goto_0
    return-void

    .line 53
    :cond_0
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->X:Lkik/android/chat/fragment/KikPickContactFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikPickContactFragment$a;->b(Lkik/android/chat/fragment/KikPickContactFragment$a;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickContactFragment;->G:Lkik/a/e/l;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lkik/a/e/l;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->V:Lkik/a/d/n;

    iget-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->V:Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->U:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickContactFragment;->J()V

    goto :goto_0
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 162
    invoke-super {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->onResume()V

    .line 164
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->W:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickContactFragment;->W:Landroid/os/Bundle;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickContactFragment;->c(Landroid/os/Bundle;)V

    .line 167
    :cond_0
    return-void
.end method
