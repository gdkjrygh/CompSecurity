.class final Lkik/android/widget/bg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lkik/android/widget/GifSearchFragment;


# direct methods
.method constructor <init>(Lkik/android/widget/GifSearchFragment;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 216
    iput-object p1, p0, Lkik/android/widget/bg;->b:Lkik/android/widget/GifSearchFragment;

    iput-object p2, p0, Lkik/android/widget/bg;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    .line 220
    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    .line 221
    iget-object v0, p0, Lkik/android/widget/bg;->b:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0}, Lkik/android/widget/GifSearchFragment;->g(Lkik/android/widget/GifSearchFragment;)V

    .line 222
    iget-object v0, p0, Lkik/android/widget/bg;->b:Lkik/android/widget/GifSearchFragment;

    iget-object v1, p0, Lkik/android/widget/bg;->b:Lkik/android/widget/GifSearchFragment;

    iget-object v1, v1, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    invoke-virtual {v1}, Lkik/android/widget/RobotoEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/bg;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v0, v1, v2}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;I)V

    .line 224
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
