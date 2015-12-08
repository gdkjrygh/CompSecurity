.class final Lkik/android/widget/bk;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Lkik/android/widget/GifSearchFragment;


# direct methods
.method constructor <init>(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 474
    iput-object p1, p0, Lkik/android/widget/bk;->c:Lkik/android/widget/GifSearchFragment;

    iput-object p2, p0, Lkik/android/widget/bk;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/android/widget/bk;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 474
    check-cast p1, Lkik/android/widget/au;

    invoke-virtual {p1}, Lkik/android/widget/au;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/bk;->c:Lkik/android/widget/GifSearchFragment;

    iget-object v1, p0, Lkik/android/widget/bk;->c:Lkik/android/widget/GifSearchFragment;

    iget-object v1, v1, Lkik/android/widget/GifSearchFragment;->_noSearchResultsText:Landroid/widget/TextView;

    iget-object v2, p0, Lkik/android/widget/bk;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lkik/android/widget/GifSearchFragment;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lkik/android/widget/bk;->b:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lkik/android/widget/au;->c()V

    iget-object v0, p0, Lkik/android/widget/bk;->c:Lkik/android/widget/GifSearchFragment;

    sget v1, Lkik/android/widget/GifWidget$a;->d:I

    invoke-virtual {v0, v1}, Lkik/android/widget/GifSearchFragment;->a(I)V

    goto :goto_0
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 491
    iget-object v0, p0, Lkik/android/widget/bk;->c:Lkik/android/widget/GifSearchFragment;

    new-instance v1, Lkik/android/widget/bl;

    invoke-direct {v1, p0}, Lkik/android/widget/bl;-><init>(Lkik/android/widget/bk;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/GifSearchFragment;->b(Ljava/lang/Runnable;)V

    .line 499
    return-void
.end method
