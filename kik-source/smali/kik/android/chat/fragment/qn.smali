.class final Lkik/android/chat/fragment/qn;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ScanCodeTabFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ScanCodeTabFragment;Landroid/support/v4/app/FragmentManager;)V
    .locals 0

    .prologue
    .line 428
    iput-object p1, p0, Lkik/android/chat/fragment/qn;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-direct {p0, p2}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 443
    invoke-static {}, Lkik/android/chat/fragment/ScanCodeTabFragment;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 432
    iget-object v0, p0, Lkik/android/chat/fragment/qn;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->d(Lkik/android/chat/fragment/ScanCodeTabFragment;)I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 433
    iget-object v0, p0, Lkik/android/chat/fragment/qn;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->e(Lkik/android/chat/fragment/ScanCodeTabFragment;)Lkik/android/chat/fragment/KikCodeFragment;

    move-result-object v0

    .line 436
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/qn;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->h(Lkik/android/chat/fragment/ScanCodeTabFragment;)Lkik/android/scan/fragment/ScanFragment;

    move-result-object v0

    goto :goto_0
.end method
