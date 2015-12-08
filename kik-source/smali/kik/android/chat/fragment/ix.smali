.class final Lkik/android/chat/fragment/ix;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/a/d/n;

.field final synthetic b:Lkik/android/chat/fragment/KikCodeFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCodeFragment;Lkik/a/d/n;)V
    .locals 0

    .prologue
    .line 348
    iput-object p1, p0, Lkik/android/chat/fragment/ix;->b:Lkik/android/chat/fragment/KikCodeFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/ix;->a:Lkik/a/d/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 352
    iget-object v0, p0, Lkik/android/chat/fragment/ix;->a:Lkik/a/d/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ix;->a:Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->r()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 353
    iget-object v0, p0, Lkik/android/chat/fragment/ix;->b:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikCodeFragment;->l(Lkik/android/chat/fragment/KikCodeFragment;)Z

    .line 354
    new-instance v0, Lkik/android/chat/fragment/ViewPictureFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/ViewPictureFragment$a;-><init>()V

    .line 355
    iget-object v1, p0, Lkik/android/chat/fragment/ix;->a:Lkik/a/d/n;

    invoke-virtual {v1}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/ViewPictureFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/ix;->a:Lkik/a/d/n;

    invoke-virtual {v2}, Lkik/a/d/n;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/ViewPictureFragment$a;->c(Ljava/lang/String;)Lkik/android/chat/fragment/ViewPictureFragment$a;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->d()Lkik/android/chat/fragment/ViewPictureFragment$a;

    .line 356
    iget-object v1, p0, Lkik/android/chat/fragment/ix;->b:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikCodeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 358
    :cond_0
    return-void
.end method
