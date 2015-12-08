.class final Lkik/android/chat/fragment/nb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V
    .locals 0

    .prologue
    .line 310
    iput-object p1, p0, Lkik/android/chat/fragment/nb;->a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 315
    const/4 v1, 0x2

    if-eq p2, v1, :cond_0

    const/4 v1, 0x6

    if-eq p2, v1, :cond_0

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/16 v2, 0x42

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lkik/android/chat/fragment/nb;->a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    iget-boolean v1, v1, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->M:Z

    if-nez v1, :cond_1

    .line 316
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/nb;->a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b(Landroid/view/View;)V

    .line 318
    const/4 v0, 0x1

    .line 322
    :goto_0
    return v0

    .line 321
    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/nb;->a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    iput-boolean v0, v1, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->M:Z

    goto :goto_0
.end method
