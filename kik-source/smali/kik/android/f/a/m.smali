.class final Lkik/android/f/a/m;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/a/a;

.field final synthetic b:Lkik/android/f/a/l;


# direct methods
.method constructor <init>(Lkik/android/f/a/l;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 1366
    iput-object p1, p0, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iput-object p2, p0, Lkik/android/f/a/m;->a:Lkik/a/d/a/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 1366
    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iget-object v0, v0, Lkik/android/f/a/l;->b:Lkik/a/e/r;

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    new-instance v2, Lcom/kik/cards/util/UserDataParcelable;

    invoke-virtual {v0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v1, v3, v0}, Lcom/kik/cards/util/UserDataParcelable;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iget-object v0, v0, Lkik/android/f/a/l;->g:Lkik/android/f/a/f;

    iget-object v1, p0, Lkik/android/f/a/m;->a:Lkik/a/d/a/a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v3, v4}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    iget-object v0, p0, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iget-object v0, v0, Lkik/android/f/a/l;->c:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    if-eqz v1, :cond_0

    instance-of v0, v1, Lkik/android/chat/activity/FragmentWrapperActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iget-object v0, v0, Lkik/android/f/a/l;->c:Landroid/support/v4/app/Fragment;

    instance-of v0, v0, Lkik/android/chat/fragment/KikFragmentBase;

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-virtual {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iget-object v0, v0, Lkik/android/f/a/l;->c:Landroid/support/v4/app/Fragment;

    check-cast v0, Lkik/android/chat/fragment/KikFragmentBase;

    new-instance v3, Lkik/android/f/a/n;

    invoke-direct {v3, p0, p1, v1}, Lkik/android/f/a/n;-><init>(Lkik/android/f/a/m;Ljava/lang/String;Landroid/app/Activity;)V

    invoke-virtual {v0, v3}, Lkik/android/chat/fragment/KikFragmentBase;->a(Ljava/lang/Runnable;)V

    :goto_0
    iget-object v0, p0, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iget-object v0, v0, Lkik/android/f/a/l;->f:Lcom/kik/g/p;

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iget v0, v0, Lkik/android/f/a/l;->d:I

    iget-object v3, p0, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iget-boolean v3, v3, Lkik/android/f/a/l;->e:Z

    iget-object v4, p0, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iget-object v4, v4, Lkik/android/f/a/l;->b:Lkik/a/e/r;

    invoke-static {p1, v1, v0, v3, v4}, Lkik/android/f/a/f;->a(Ljava/lang/String;Landroid/app/Activity;IZLkik/a/e/r;)V

    goto :goto_0
.end method
