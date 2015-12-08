.class public final Lkik/android/widget/GifSearchFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/GifSearchFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/widget/GifSearchFragment;


# direct methods
.method public constructor <init>(Lkik/android/widget/GifSearchFragment;)V
    .locals 0

    .prologue
    .line 535
    iput-object p1, p0, Lkik/android/widget/GifSearchFragment$b;->a:Lkik/android/widget/GifSearchFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 544
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment$b;->a:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0, v3}, Lkik/android/widget/GifSearchFragment;->c(Lkik/android/widget/GifSearchFragment;Z)Z

    .line 545
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment$b;->a:Lkik/android/widget/GifSearchFragment;

    iget-object v0, v0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    invoke-virtual {v0, p2}, Lkik/android/widget/RobotoEditText;->setText(Ljava/lang/CharSequence;)V

    .line 546
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment$b;->a:Lkik/android/widget/GifSearchFragment;

    iget-object v0, v0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    invoke-virtual {v0}, Lkik/android/widget/RobotoEditText;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 547
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment$b;->a:Lkik/android/widget/GifSearchFragment;

    iget-object v0, v0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/widget/RobotoEditText;->setSelection(I)V

    .line 549
    :cond_0
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment$b;->a:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0, p1}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    .line 550
    new-instance v1, Lkik/android/widget/bm;

    invoke-direct {v1, p0, p1}, Lkik/android/widget/bm;-><init>(Lkik/android/widget/GifSearchFragment$b;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 560
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment$b;->a:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0}, Lkik/android/widget/GifSearchFragment;->h(Lkik/android/widget/GifSearchFragment;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "GIF_HINT_BAR_KEY"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 561
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment$b;->a:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0}, Lkik/android/widget/GifSearchFragment;->h(Lkik/android/widget/GifSearchFragment;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "GIF_EMOJI_TAPPED_KEY"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 562
    add-int/lit8 v0, v0, 0x1

    .line 563
    iget-object v1, p0, Lkik/android/widget/GifSearchFragment$b;->a:Lkik/android/widget/GifSearchFragment;

    invoke-static {v1}, Lkik/android/widget/GifSearchFragment;->h(Lkik/android/widget/GifSearchFragment;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 564
    const-string v2, "GIF_EMOJI_TAPPED_KEY"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 565
    const/4 v2, 0x3

    if-lt v0, v2, :cond_1

    .line 566
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment$b;->a:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0}, Lkik/android/widget/GifSearchFragment;->j(Lkik/android/widget/GifSearchFragment;)V

    .line 567
    const-string v0, "GIF_HINT_BAR_KEY"

    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 569
    :cond_1
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 571
    :cond_2
    return-void
.end method
