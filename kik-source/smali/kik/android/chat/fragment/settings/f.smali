.class final Lkik/android/chat/fragment/settings/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lkik/android/chat/fragment/settings/PreferenceFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/settings/PreferenceFragment;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lkik/android/chat/fragment/settings/f;->b:Lkik/android/chat/fragment/settings/PreferenceFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/settings/f;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 5

    .prologue
    const/16 v4, 0xff

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    .line 204
    iget-object v0, p0, Lkik/android/chat/fragment/settings/f;->b:Lkik/android/chat/fragment/settings/PreferenceFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->b(Lkik/android/chat/fragment/settings/PreferenceFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    if-lez p2, :cond_1

    .line 206
    iget-object v0, p0, Lkik/android/chat/fragment/settings/f;->b:Lkik/android/chat/fragment/settings/PreferenceFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->c(Lkik/android/chat/fragment/settings/PreferenceFragment;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 207
    iget-object v0, p0, Lkik/android/chat/fragment/settings/f;->a:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 229
    :cond_0
    :goto_0
    return-void

    .line 209
    :cond_1
    invoke-virtual {p1, v2}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 210
    invoke-virtual {p1, v2}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    .line 211
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getTop()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 212
    iget-object v0, p0, Lkik/android/chat/fragment/settings/f;->b:Lkik/android/chat/fragment/settings/PreferenceFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->c(Lkik/android/chat/fragment/settings/PreferenceFragment;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 213
    iget-object v0, p0, Lkik/android/chat/fragment/settings/f;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 216
    :cond_2
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lkik/android/chat/fragment/settings/f;->b:Lkik/android/chat/fragment/settings/PreferenceFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/settings/PreferenceFragment;->c(Lkik/android/chat/fragment/settings/PreferenceFragment;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 217
    cmpg-float v1, v0, v3

    if-gez v1, :cond_3

    .line 218
    iget-object v1, p0, Lkik/android/chat/fragment/settings/f;->b:Lkik/android/chat/fragment/settings/PreferenceFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/settings/PreferenceFragment;->c(Lkik/android/chat/fragment/settings/PreferenceFragment;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v2, v0

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 219
    iget-object v1, p0, Lkik/android/chat/fragment/settings/f;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 222
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/settings/f;->b:Lkik/android/chat/fragment/settings/PreferenceFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->c(Lkik/android/chat/fragment/settings/PreferenceFragment;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 223
    iget-object v0, p0, Lkik/android/chat/fragment/settings/f;->a:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 224
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/settings/f;->a:Landroid/view/View;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    goto :goto_0
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .prologue
    .line 199
    return-void
.end method
