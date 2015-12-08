.class final Lkik/android/chat/fragment/pn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikSponsoredBaseFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikSponsoredBaseFragment;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lkik/android/chat/fragment/pn;->a:Lkik/android/chat/fragment/KikSponsoredBaseFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 3

    .prologue
    .line 85
    iget-object v0, p0, Lkik/android/chat/fragment/pn;->a:Lkik/android/chat/fragment/KikSponsoredBaseFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->getUserVisibleHint()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, p2

    .line 86
    :goto_0
    add-int v1, p2, p3

    if-ge v0, v1, :cond_1

    .line 88
    iget-object v1, p0, Lkik/android/chat/fragment/pn;->a:Lkik/android/chat/fragment/KikSponsoredBaseFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->a(Lkik/android/chat/fragment/KikSponsoredBaseFragment;)Ljava/util/HashSet;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/pn;->a:Lkik/android/chat/fragment/KikSponsoredBaseFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->b(Lkik/android/chat/fragment/KikSponsoredBaseFragment;)Ljava/util/HashSet;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 89
    iget-object v1, p0, Lkik/android/chat/fragment/pn;->a:Lkik/android/chat/fragment/KikSponsoredBaseFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->b(Lkik/android/chat/fragment/KikSponsoredBaseFragment;)Ljava/util/HashSet;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 86
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 93
    :cond_1
    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .prologue
    .line 80
    return-void
.end method
