.class final Lkik/android/chat/fragment/jh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/jg;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/jg;)V
    .locals 0

    .prologue
    .line 582
    iput-object p1, p0, Lkik/android/chat/fragment/jh;->a:Lkik/android/chat/fragment/jg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 585
    iget-object v0, p0, Lkik/android/chat/fragment/jh;->a:Lkik/android/chat/fragment/jg;

    iget-object v0, v0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-boolean v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->B:Z

    if-eqz v0, :cond_0

    .line 586
    iget-object v0, p0, Lkik/android/chat/fragment/jh;->a:Lkik/android/chat/fragment/jg;

    iget-object v0, v0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    iget-object v1, p0, Lkik/android/chat/fragment/jh;->a:Lkik/android/chat/fragment/jg;

    iget-object v1, v1, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getHeaderViewsCount()I

    move-result v1

    const/16 v2, 0x71

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    .line 591
    :goto_0
    return-void

    .line 588
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/jh;->a:Lkik/android/chat/fragment/jg;

    iget-object v0, v0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkik/android/chat/fragment/KikContactsListFragment;->B:Z

    .line 589
    iget-object v0, p0, Lkik/android/chat/fragment/jh;->a:Lkik/android/chat/fragment/jg;

    iget-object v0, v0, Lkik/android/chat/fragment/jg;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    goto :goto_0
.end method
