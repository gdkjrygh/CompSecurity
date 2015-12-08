.class final Lkik/android/widget/bf;
.super Lcom/kik/m/s;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/GifSearchFragment;


# direct methods
.method constructor <init>(Lkik/android/widget/GifSearchFragment;)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Lkik/android/widget/bf;->a:Lkik/android/widget/GifSearchFragment;

    invoke-direct {p0}, Lcom/kik/m/s;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .prologue
    .line 199
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 200
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 201
    iget-object v0, p0, Lkik/android/widget/bf;->a:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0}, Lkik/android/widget/GifSearchFragment;->e(Lkik/android/widget/GifSearchFragment;)V

    .line 202
    iget-object v0, p0, Lkik/android/widget/bf;->a:Lkik/android/widget/GifSearchFragment;

    iget-object v0, v0, Lkik/android/widget/GifSearchFragment;->_searchCancel:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 203
    iget-object v0, p0, Lkik/android/widget/bf;->a:Lkik/android/widget/GifSearchFragment;

    sget v1, Lkik/android/widget/GifWidget$a;->c:I

    invoke-virtual {v0, v1}, Lkik/android/widget/GifSearchFragment;->a(I)V

    .line 214
    :goto_0
    return-void

    .line 206
    :cond_0
    iget-object v1, p0, Lkik/android/widget/bf;->a:Lkik/android/widget/GifSearchFragment;

    iget-object v1, v1, Lkik/android/widget/GifSearchFragment;->_searchCancel:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 207
    iget-object v1, p0, Lkik/android/widget/bf;->a:Lkik/android/widget/GifSearchFragment;

    invoke-static {v1}, Lkik/android/widget/GifSearchFragment;->f(Lkik/android/widget/GifSearchFragment;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 208
    iget-object v1, p0, Lkik/android/widget/bf;->a:Lkik/android/widget/GifSearchFragment;

    invoke-static {v1, v0}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;)Lcom/kik/g/p;

    goto :goto_0

    .line 211
    :cond_1
    iget-object v0, p0, Lkik/android/widget/bf;->a:Lkik/android/widget/GifSearchFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/widget/GifSearchFragment;->c(Lkik/android/widget/GifSearchFragment;Z)Z

    goto :goto_0
.end method
