.class final Lkik/android/widget/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/BugmeBarView;


# direct methods
.method constructor <init>(Lkik/android/widget/BugmeBarView;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lkik/android/widget/e;->a:Lkik/android/widget/BugmeBarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 51
    iget-object v0, p0, Lkik/android/widget/e;->a:Lkik/android/widget/BugmeBarView;

    invoke-static {v0, v2}, Lkik/android/widget/BugmeBarView;->a(Lkik/android/widget/BugmeBarView;Z)Z

    .line 52
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v1, p0, Lkik/android/widget/e;->a:Lkik/android/widget/BugmeBarView;

    invoke-virtual {v1}, Lkik/android/widget/BugmeBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    invoke-static {}, Lkik/android/util/cq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090149

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    new-instance v1, Lkik/android/widget/h;

    invoke-direct {v1, p0}, Lkik/android/widget/h;-><init>(Lkik/android/widget/e;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Landroid/content/DialogInterface$OnCancelListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090300

    new-instance v2, Lkik/android/widget/g;

    invoke-direct {v2, p0}, Lkik/android/widget/g;-><init>(Lkik/android/widget/e;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090299

    new-instance v2, Lkik/android/widget/f;

    invoke-direct {v2, p0}, Lkik/android/widget/f;-><init>(Lkik/android/widget/e;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    .line 83
    iget-object v1, p0, Lkik/android/widget/e;->a:Lkik/android/widget/BugmeBarView;

    invoke-static {v1}, Lkik/android/widget/BugmeBarView;->b(Lkik/android/widget/BugmeBarView;)Lcom/kik/h/c;

    move-result-object v1

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kik/h/c;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 89
    :goto_0
    return-void

    .line 87
    :cond_0
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/e;->a:Lkik/android/widget/BugmeBarView;

    invoke-static {v1}, Lkik/android/widget/BugmeBarView;->c(Lkik/android/widget/BugmeBarView;)Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/e;->a:Lkik/android/widget/BugmeBarView;

    invoke-static {v2}, Lkik/android/widget/BugmeBarView;->d(Lkik/android/widget/BugmeBarView;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/util/p;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;Landroid/content/Context;)V

    goto :goto_0
.end method
