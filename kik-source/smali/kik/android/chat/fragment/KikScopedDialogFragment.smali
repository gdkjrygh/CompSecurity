.class public Lkik/android/chat/fragment/KikScopedDialogFragment;
.super Lkik/android/chat/fragment/KikFragmentBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikScopedDialogFragment$b;,
        Lkik/android/chat/fragment/KikScopedDialogFragment$a;
    }
.end annotation


# instance fields
.field protected T:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private a:Z

.field private b:Lkik/android/chat/fragment/KikDialogFragment;

.field private c:Z

.field private d:Lkik/android/chat/fragment/KikDialogFragment;

.field private e:Z

.field private f:Z

.field private g:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 28
    invoke-direct {p0}, Lkik/android/chat/fragment/KikFragmentBase;-><init>()V

    .line 32
    iput-object v1, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->b:Lkik/android/chat/fragment/KikDialogFragment;

    .line 33
    iput-boolean v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->c:Z

    .line 34
    iput-object v1, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment;

    .line 48
    iput-boolean v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->e:Z

    .line 49
    iput-boolean v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->f:Z

    .line 51
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    .line 53
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikScopedDialogFragment;)Landroid/util/SparseArray;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    return-object v0
.end method

.method private c()V
    .locals 3

    .prologue
    .line 170
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v2

    .line 172
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 173
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/fragment/KikScopedDialogFragment$b;

    .line 174
    iget-object v0, v0, Lkik/android/chat/fragment/KikScopedDialogFragment$b;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment;->dismissAllowingStateLoss()V

    .line 172
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 176
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 177
    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 293
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 294
    if-eqz v0, :cond_0

    .line 295
    new-instance v1, Lkik/android/chat/fragment/pi;

    invoke-direct {v1, p0, v0, p2, p1}, Lkik/android/chat/fragment/pi;-><init>(Lkik/android/chat/fragment/KikScopedDialogFragment;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 314
    :cond_0
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikDialogFragment;)V
    .locals 3

    .prologue
    .line 258
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->b:Lkik/android/chat/fragment/KikDialogFragment;

    .line 259
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->ac()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 261
    const/4 v1, 0x0

    iput-object v1, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->b:Lkik/android/chat/fragment/KikDialogFragment;

    .line 263
    :cond_0
    if-eqz v0, :cond_1

    .line 264
    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 265
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->ac()Z

    move-result v1

    if-nez v1, :cond_4

    .line 266
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->c:Z

    .line 277
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->ac()Z

    move-result v0

    if-nez v0, :cond_6

    .line 278
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment;

    if-eqz v0, :cond_2

    .line 279
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment;->d()Lcom/kik/g/p;

    move-result-object v0

    .line 280
    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 282
    :cond_2
    iput-object p1, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment;

    .line 288
    :cond_3
    :goto_1
    return-void

    .line 269
    :cond_4
    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment;->dismiss()V

    .line 270
    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment;->d()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "replace dialog"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 274
    :cond_5
    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment;->d()Lcom/kik/g/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    goto :goto_0

    .line 284
    :cond_6
    if-eqz p1, :cond_3

    .line 285
    iput-object p1, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->b:Lkik/android/chat/fragment/KikDialogFragment;

    .line 286
    sget-object v0, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v1, "dialog"

    invoke-virtual {p0, p1, v0, v1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 68
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 69
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->ac()Z

    move-result v1

    if-nez v1, :cond_1

    .line 112
    :cond_0
    :goto_0
    return-void

    .line 72
    :cond_1
    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    invoke-virtual {p2, v1}, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->c:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    invoke-virtual {p2, v1}, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 73
    :cond_2
    invoke-virtual {p1}, Lkik/android/chat/fragment/KikDialogFragment;->d()Lcom/kik/g/p;

    move-result-object v1

    .line 75
    new-instance v2, Lkik/android/chat/fragment/ph;

    invoke-direct {v2, p0, p1}, Lkik/android/chat/fragment/ph;-><init>(Lkik/android/chat/fragment/KikScopedDialogFragment;Lkik/android/chat/fragment/KikDialogFragment;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 84
    new-instance v1, Lkik/android/chat/fragment/KikScopedDialogFragment$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment$b;-><init>(B)V

    .line 85
    iput-object p1, v1, Lkik/android/chat/fragment/KikScopedDialogFragment$b;->a:Lkik/android/chat/fragment/KikDialogFragment;

    .line 86
    iput-object p2, v1, Lkik/android/chat/fragment/KikScopedDialogFragment$b;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    .line 88
    iget-object v2, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    invoke-virtual {p1}, Lkik/android/chat/fragment/KikDialogFragment;->c()I

    move-result v3

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 90
    :cond_3
    invoke-virtual {p1}, Lkik/android/chat/fragment/KikDialogFragment;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 91
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot show an already shown dialog fragment."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_4
    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->c:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    invoke-virtual {p2, v1}, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 107
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0e00f7

    invoke-virtual {v0, v1, p1, p3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto :goto_0

    .line 110
    :cond_5
    invoke-virtual {p1, v0, p3}, Lkik/android/chat/fragment/KikDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final ab()V
    .locals 1

    .prologue
    .line 149
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->a:Z

    .line 150
    invoke-direct {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->c()V

    .line 151
    return-void
.end method

.method public final ac()Z
    .locals 2

    .prologue
    .line 220
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 221
    if-nez v0, :cond_0

    .line 222
    const/4 v0, 0x0

    .line 228
    :goto_0
    return v0

    .line 224
    :cond_0
    instance-of v1, v0, Lkik/android/chat/activity/FragmentWrapperActivity;

    if-eqz v1, :cond_1

    .line 225
    check-cast v0, Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-virtual {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->d()Z

    move-result v0

    goto :goto_0

    .line 228
    :cond_1
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->e:Z

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 62
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    .line 63
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 64
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 156
    invoke-super {p0}, Lkik/android/chat/fragment/KikFragmentBase;->onDestroy()V

    .line 160
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 161
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    const/4 v0, 0x1

    .line 162
    :goto_0
    if-nez v0, :cond_1

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->a:Z

    if-eqz v0, :cond_3

    .line 166
    :cond_1
    :goto_1
    return-void

    .line 161
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 165
    :cond_3
    invoke-direct {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->c()V

    goto :goto_1
.end method

.method public onDestroyView()V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 125
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->a:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v3

    new-instance v4, Landroid/util/SparseArray;

    invoke-direct {v4, v3}, Landroid/util/SparseArray;-><init>(I)V

    move v0, v2

    :goto_0
    if-ge v0, v3, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    iget-object v5, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v5, Landroid/util/SparseArray;

    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    move v1, v2

    :goto_1
    if-ge v1, v3, :cond_3

    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/fragment/KikScopedDialogFragment$b;

    sget-object v6, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    iget-object v7, v0, Lkik/android/chat/fragment/KikScopedDialogFragment$b;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    invoke-virtual {v6, v7}, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->ac()Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v0, v0, Lkik/android/chat/fragment/KikScopedDialogFragment$b;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment;->dismiss()V

    :cond_1
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    sget-object v6, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->c:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    iget-object v7, v0, Lkik/android/chat/fragment/KikScopedDialogFragment$b;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    invoke-virtual {v6, v7}, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v6

    invoke-virtual {v5, v6, v0}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v6

    invoke-virtual {v6}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v6

    iget-object v0, v0, Lkik/android/chat/fragment/KikScopedDialogFragment$b;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {v6, v0}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    iput-object v5, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    .line 126
    :cond_4
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment;

    .line 127
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->c:Z

    .line 128
    invoke-super {p0}, Lkik/android/chat/fragment/KikFragmentBase;->onDestroyView()V

    .line 129
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 235
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->e:Z

    .line 237
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->c:Z

    if-eqz v0, :cond_2

    .line 238
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 239
    iput-object v1, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment;

    .line 240
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->c:Z

    .line 247
    :cond_0
    :goto_0
    invoke-super {p0}, Lkik/android/chat/fragment/KikFragmentBase;->onResume()V

    .line 251
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->T:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->a(Lkik/a/e/v;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 252
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, p0}, Lkik/android/widget/ce;->a(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    .line 254
    :cond_1
    return-void

    .line 242
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment;

    if-eqz v0, :cond_0

    .line 243
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 244
    iput-object v1, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->d:Lkik/android/chat/fragment/KikDialogFragment;

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 319
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikFragmentBase;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 320
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->e:Z

    .line 321
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 134
    invoke-super {p0, p1, p2}, Lkik/android/chat/fragment/KikFragmentBase;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 136
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v2

    .line 138
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 139
    iget-object v0, p0, Lkik/android/chat/fragment/KikScopedDialogFragment;->g:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/fragment/KikScopedDialogFragment$b;

    .line 140
    sget-object v3, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->c:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    iget-object v4, v0, Lkik/android/chat/fragment/KikScopedDialogFragment$b;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    invoke-virtual {v3, v4}, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 141
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    iget-object v0, v0, Lkik/android/chat/fragment/KikScopedDialogFragment$b;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 138
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 144
    :cond_1
    return-void
.end method
