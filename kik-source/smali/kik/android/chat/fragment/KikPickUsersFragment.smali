.class public Lkik/android/chat/fragment/KikPickUsersFragment;
.super Lkik/android/chat/fragment/KikMultiselectContactsListFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikPickUsersFragment$a;
    }
.end annotation


# instance fields
.field protected N:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private O:I

.field private U:I

.field private V:Ljava/util/List;

.field private W:Ljava/util/List;

.field private X:Z

.field private Y:Lkik/android/chat/fragment/KikPickUsersFragment$a;

.field private Z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;-><init>()V

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->W:Ljava/util/List;

    .line 49
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->X:Z

    .line 51
    new-instance v0, Lkik/android/chat/fragment/KikPickUsersFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikPickUsersFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Y:Lkik/android/chat/fragment/KikPickUsersFragment$a;

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Z:Z

    .line 397
    return-void
.end method

.method private ad()V
    .locals 2

    .prologue
    .line 290
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->size()I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->O:I

    if-lt v0, v1, :cond_0

    .line 291
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d(Z)V

    .line 296
    :goto_0
    return-void

    .line 294
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d(Z)V

    goto :goto_0
.end method


# virtual methods
.method protected final C()I
    .locals 1

    .prologue
    .line 267
    const/16 v0, 0x10

    return v0
.end method

.method protected final R()Ljava/lang/String;
    .locals 1

    .prologue
    .line 394
    const v0, 0x7f090014

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickUsersFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final Y()V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 66
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashSet;->size()I

    move-result v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->O:I

    if-lt v1, v2, :cond_3

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashSet;->size()I

    move-result v1

    iget-object v4, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v1, v4

    new-array v4, v1, [Lcom/kik/cards/util/UserDataParcelable;

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v1, v0

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v6, Lcom/kik/cards/util/UserDataParcelable;

    invoke-direct {v6, v0, v3, v3}, Lcom/kik/cards/util/UserDataParcelable;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v6, v4, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v5, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->H:Lkik/a/e/r;

    invoke-interface {v5, v0, v8}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    new-instance v5, Lcom/kik/cards/util/UserDataParcelable;

    invoke-virtual {v0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v6, v7, v0}, Lcom/kik/cards/util/UserDataParcelable;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v5, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    const-string v0, "KikPickUsersFragment.RESULT_SELECTED_USERS"

    invoke-virtual {v2, v0, v4}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    move-object v0, v2

    .line 67
    :goto_2
    if-eqz v0, :cond_2

    .line 68
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickUsersFragment;->a(Landroid/os/Bundle;)V

    .line 69
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->J()V

    .line 71
    :cond_2
    return-void

    .line 66
    :cond_3
    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    const v2, 0x7f090228

    new-array v4, v8, [Ljava/lang/Object;

    iget v5, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->O:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    invoke-virtual {p0, v2, v4}, Lkik/android/chat/fragment/KikPickUsersFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->Z()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v2, 0x7f090193

    invoke-virtual {v0, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, v1, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "confirmationDialog"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikPickUsersFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    move-object v0, v3

    goto :goto_2
.end method

.method protected Z()Ljava/lang/String;
    .locals 1

    .prologue
    .line 127
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Z:Z

    if-eqz v0, :cond_0

    const v0, 0x7f090224

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x7f090225

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 307
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final a(Ljava/lang/String;Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 274
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 275
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {p2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 276
    invoke-super {p0, p1, p2}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Ljava/lang/String;Lkik/a/d/k;)V

    .line 277
    return-void
.end method

.method protected final a(Lkik/a/d/k;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 216
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Lkik/a/d/k;)V

    .line 218
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Z:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->size()I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    if-lez v0, :cond_0

    .line 219
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->Y()V

    .line 226
    :goto_0
    return-void

    .line 222
    :cond_0
    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikPickUsersFragment;->c(Z)V

    .line 223
    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikPickUsersFragment;->b(Z)V

    .line 224
    invoke-direct {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->ad()V

    goto :goto_0
.end method

.method protected final a(Lkik/a/d/k;Lcom/kik/view/adapters/ContactsCursorAdapter$a;Landroid/database/Cursor;I)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 108
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->size()I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 110
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Lkik/a/d/k;Lcom/kik/view/adapters/ContactsCursorAdapter$a;Landroid/database/Cursor;I)V

    .line 115
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->b:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 116
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->l()V

    .line 122
    :cond_1
    :goto_0
    return-void

    .line 119
    :cond_2
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->size()I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    if-lt v0, v1, :cond_1

    .line 120
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    if-ne v0, v3, :cond_3

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f090329

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v1, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f09032b

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    iget v3, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method protected final aa()Ljava/lang/String;
    .locals 1

    .prologue
    .line 325
    const v0, 0x7f0902ab

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickUsersFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final b(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 133
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Y:Lkik/android/chat/fragment/KikPickUsersFragment$a;

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->a(Landroid/os/Bundle;)V

    .line 134
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Y:Lkik/android/chat/fragment/KikPickUsersFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->a()I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->O:I

    .line 135
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Y:Lkik/android/chat/fragment/KikPickUsersFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->b()I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    .line 136
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Y:Lkik/android/chat/fragment/KikPickUsersFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->c()Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->X:Z

    .line 137
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Y:Lkik/android/chat/fragment/KikPickUsersFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->d()Ljava/util/ArrayList;

    move-result-object v0

    .line 138
    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Y:Lkik/android/chat/fragment/KikPickUsersFragment$a;

    const-string v2, "KikPickUsersFragment.EXTRA_FILTERED_USERS"

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->m(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 141
    iget v2, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    if-ne v2, v4, :cond_0

    .line 142
    iput-boolean v4, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Z:Z

    .line 145
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->f()V

    .line 148
    :cond_0
    iget-boolean v2, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->X:Z

    if-eqz v2, :cond_1

    .line 149
    iget-object v2, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->W:Ljava/util/List;

    iget-object v3, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->N:Lkik/a/e/w;

    invoke-interface {v3}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v3

    iget-object v3, v3, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    :cond_1
    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 153
    iget-object v2, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->W:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 157
    :cond_2
    if-eqz v0, :cond_4

    iget v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    if-eq v1, v4, :cond_4

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->W:Ljava/util/List;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->W:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->X:Z

    if-eqz v1, :cond_4

    .line 160
    :cond_3
    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 163
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 165
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->W:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 167
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->W:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickUsersFragment;->a(Ljava/util/ArrayList;)V

    .line 171
    :cond_5
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 172
    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 176
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 177
    iget-object v2, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->H:Lkik/a/e/r;

    invoke-interface {v2, v0}, Lkik/a/e/r;->b(Ljava/lang/String;)Lkik/a/d/k;

    move-result-object v2

    .line 178
    if-eqz v2, :cond_7

    .line 180
    iget-object v3, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 181
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    invoke-virtual {p0, v2, v5, v5, v0}, Lkik/android/chat/fragment/KikPickUsersFragment;->a(Lkik/a/d/k;Lcom/kik/view/adapters/ContactsCursorAdapter$a;Landroid/database/Cursor;I)V

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikPickUsersFragment;->a(Lkik/a/d/k;)V

    goto :goto_0

    .line 184
    :cond_7
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickUsersFragment;->g(Ljava/lang/String;)V

    .line 185
    iget-object v2, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->H:Lkik/a/e/r;

    invoke-interface {v2, v0}, Lkik/a/e/r;->d(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v2

    .line 186
    new-instance v3, Lkik/android/chat/fragment/no;

    invoke-direct {v3, p0, v0}, Lkik/android/chat/fragment/no;-><init>(Lkik/android/chat/fragment/KikPickUsersFragment;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 196
    :cond_8
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 301
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 313
    const v0, 0x7f090106

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPickUsersFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final d(Lkik/a/d/k;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 238
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->d(Lkik/a/d/k;)V

    .line 239
    invoke-direct {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->ad()V

    .line 240
    iget v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->O:I

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->size()I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    if-gtz v0, :cond_0

    .line 241
    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikPickUsersFragment;->c(Z)V

    .line 242
    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikPickUsersFragment;->b(Z)V

    .line 244
    :cond_0
    return-void
.end method

.method protected final e(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 249
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 250
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->e(Ljava/lang/String;)V

    .line 251
    return-void
.end method

.method protected final e(Lkik/a/d/k;)V
    .locals 3

    .prologue
    .line 331
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->H:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/r;->b(Lkik/a/d/j;)Lcom/kik/g/p;

    move-result-object v0

    .line 333
    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v1

    if-nez v1, :cond_0

    .line 334
    const v1, 0x7f09036a

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikPickUsersFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lkik/android/chat/fragment/KikPickUsersFragment;->b(Ljava/lang/String;Z)V

    .line 337
    :cond_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->getView()Landroid/view/View;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/np;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/np;-><init>(Lkik/android/chat/fragment/KikPickUsersFragment;)V

    invoke-static {v1, v2}, Lcom/kik/sdkutils/d;->a(Landroid/view/View;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 350
    return-void
.end method

.method protected final f(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 283
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 284
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->f(Ljava/lang/String;)V

    .line 285
    invoke-direct {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->ad()V

    .line 286
    return-void
.end method

.method protected final g(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 231
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->g(Ljava/lang/String;)V

    .line 232
    invoke-direct {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->ad()V

    .line 233
    return-void
.end method

.method protected final g()Z
    .locals 1

    .prologue
    .line 376
    const/4 v0, 0x1

    return v0
.end method

.method protected final i()Z
    .locals 1

    .prologue
    .line 382
    const/4 v0, 0x1

    return v0
.end method

.method protected final j()Z
    .locals 1

    .prologue
    .line 388
    iget-object v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v2, -0x1

    .line 355
    const/16 v0, 0x617

    if-ne p1, v0, :cond_2

    if-ne p2, v2, :cond_2

    const-string v0, "SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->size()I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    if-lt v0, v1, :cond_2

    iget v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    if-eq v0, v2, :cond_2

    .line 359
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->size()I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    if-lt v0, v1, :cond_0

    .line 360
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    if-ne v0, v3, :cond_1

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f090329

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v1, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 365
    :cond_0
    :goto_1
    return-void

    .line 360
    :cond_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f09032b

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    iget v3, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->U:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 364
    :cond_2
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikPickUsersFragment;)V

    .line 60
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->onCreate(Landroid/os/Bundle;)V

    .line 61
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 201
    invoke-super {p0, p1, p2}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 204
    iget v0, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->O:I

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->d()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->size()I

    move-result v0

    iget-object v3, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->V:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v0, v3

    if-gtz v0, :cond_0

    move v0, v1

    .line 205
    :goto_0
    iget-boolean v3, p0, Lkik/android/chat/fragment/KikPickUsersFragment;->Z:Z

    if-nez v3, :cond_1

    if-nez v0, :cond_1

    .line 207
    :goto_1
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikPickUsersFragment;->c(Z)V

    .line 208
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikPickUsersFragment;->b(Z)V

    .line 210
    invoke-direct {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->ad()V

    .line 211
    return-void

    :cond_0
    move v0, v2

    .line 204
    goto :goto_0

    :cond_1
    move v1, v2

    .line 205
    goto :goto_1
.end method
