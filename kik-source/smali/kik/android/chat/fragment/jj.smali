.class final Lkik/android/chat/fragment/jj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ji;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ji;)V
    .locals 0

    .prologue
    .line 694
    iput-object p1, p0, Lkik/android/chat/fragment/jj;->a:Lkik/android/chat/fragment/ji;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 698
    iget-object v0, p0, Lkik/android/chat/fragment/jj;->a:Lkik/android/chat/fragment/ji;

    iget-object v0, v0, Lkik/android/chat/fragment/ji;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 699
    iget-object v0, p0, Lkik/android/chat/fragment/jj;->a:Lkik/android/chat/fragment/ji;

    iget-object v0, v0, Lkik/android/chat/fragment/ji;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikContactsListFragment;->d(Ljava/lang/String;)V

    .line 700
    iget-object v0, p0, Lkik/android/chat/fragment/jj;->a:Lkik/android/chat/fragment/ji;

    iget-object v0, v0, Lkik/android/chat/fragment/ji;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->s:Landroid/widget/EditText;

    iget-object v1, p0, Lkik/android/chat/fragment/jj;->a:Lkik/android/chat/fragment/ji;

    iget-object v1, v1, Lkik/android/chat/fragment/ji;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 701
    iget-object v0, p0, Lkik/android/chat/fragment/jj;->a:Lkik/android/chat/fragment/ji;

    iget-object v0, v0, Lkik/android/chat/fragment/ji;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/jj;->a:Lkik/android/chat/fragment/ji;

    iget-object v1, v1, Lkik/android/chat/fragment/ji;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Ljava/lang/String;Z)V

    .line 703
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/jj;->a:Lkik/android/chat/fragment/ji;

    iget-object v0, v0, Lkik/android/chat/fragment/ji;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 704
    return-void
.end method
