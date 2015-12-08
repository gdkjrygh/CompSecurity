.class final Lkik/android/chat/fragment/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/AbTestsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/AbTestsFragment;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lkik/android/chat/fragment/a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    .prologue
    .line 91
    iget-object v0, p0, Lkik/android/chat/fragment/a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/AbTestsFragment;->a(Lkik/android/chat/fragment/AbTestsFragment;)Lcom/kik/view/adapters/bb;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/kik/view/adapters/bb;->a(I)Landroid/widget/Adapter;

    move-result-object v0

    .line 93
    instance-of v1, v0, Lkik/android/chat/fragment/AbTestsFragment$e;

    if-eqz v1, :cond_1

    .line 94
    iget-object v0, p0, Lkik/android/chat/fragment/a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/AbTestsFragment;->a(Lkik/android/chat/fragment/AbTestsFragment;)Lcom/kik/view/adapters/bb;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/kik/view/adapters/bb;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/a;

    .line 95
    iget-object v1, p0, Lkik/android/chat/fragment/a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/AbTestsFragment;->a:Lkik/a/a/c;

    invoke-virtual {v0}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkik/a/a/c;->c(Ljava/lang/String;)V

    .line 117
    :cond_0
    :goto_0
    return-void

    .line 97
    :cond_1
    instance-of v1, v0, Lkik/android/chat/fragment/AbTestsFragment$c;

    if-eqz v1, :cond_2

    .line 99
    iget-object v0, p0, Lkik/android/chat/fragment/a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/AbTestsFragment;->a(Lkik/android/chat/fragment/AbTestsFragment;)Lcom/kik/view/adapters/bb;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/kik/view/adapters/bb;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/b;

    .line 100
    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikDialogFragment;-><init>()V

    .line 101
    invoke-virtual {v0}, Lkik/a/a/b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;)V

    .line 102
    invoke-virtual {v0}, Lkik/a/a/b;->b()[Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkik/android/chat/fragment/b;

    invoke-direct {v3, p0, v0}, Lkik/android/chat/fragment/b;-><init>(Lkik/android/chat/fragment/a;Lkik/a/a/b;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment;->b([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 111
    iget-object v0, p0, Lkik/android/chat/fragment/a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/AbTestsFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    goto :goto_0

    .line 113
    :cond_2
    instance-of v0, v0, Lkik/android/chat/fragment/AbTestsFragment$a;

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lkik/android/chat/fragment/a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/AbTestsFragment;->a:Lkik/a/a/c;

    invoke-virtual {v0}, Lkik/a/a/c;->d()V

    .line 115
    iget-object v0, p0, Lkik/android/chat/fragment/a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/AbTestsFragment;->a(Lkik/android/chat/fragment/AbTestsFragment;)Lcom/kik/view/adapters/bb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/view/adapters/bb;->notifyDataSetChanged()V

    goto :goto_0
.end method
