.class final Lkik/android/widget/cu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lkik/android/widget/PagerIconTabs;


# direct methods
.method constructor <init>(Lkik/android/widget/PagerIconTabs;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lkik/android/widget/cu;->a:Lkik/android/widget/PagerIconTabs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 131
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 132
    iget-object v0, p0, Lkik/android/widget/cu;->a:Lkik/android/widget/PagerIconTabs;

    invoke-virtual {v0}, Lkik/android/widget/PagerIconTabs;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 138
    :goto_0
    iget-object v0, p0, Lkik/android/widget/cu;->a:Lkik/android/widget/PagerIconTabs;

    invoke-static {v0}, Lkik/android/widget/PagerIconTabs;->a(Lkik/android/widget/PagerIconTabs;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    .line 139
    iget-object v1, p0, Lkik/android/widget/cu;->a:Lkik/android/widget/PagerIconTabs;

    invoke-static {v1, v0}, Lkik/android/widget/PagerIconTabs;->a(Lkik/android/widget/PagerIconTabs;I)V

    .line 140
    return-void

    .line 135
    :cond_0
    iget-object v0, p0, Lkik/android/widget/cu;->a:Lkik/android/widget/PagerIconTabs;

    invoke-virtual {v0}, Lkik/android/widget/PagerIconTabs;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0
.end method
