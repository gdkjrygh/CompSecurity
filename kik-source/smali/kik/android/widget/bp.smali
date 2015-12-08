.class final Lkik/android/widget/bp;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/bo;


# direct methods
.method constructor <init>(Lkik/android/widget/bo;)V
    .locals 0

    .prologue
    .line 323
    iput-object p1, p0, Lkik/android/widget/bp;->a:Lkik/android/widget/bo;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 323
    check-cast p1, Lkik/a/d/a/a;

    iget-object v0, p0, Lkik/android/widget/bp;->a:Lkik/android/widget/bo;

    iget-object v0, v0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v1, p0, Lkik/android/widget/bp;->a:Lkik/android/widget/bo;

    invoke-static {v1}, Lkik/android/widget/bo;->a(Lkik/android/widget/bo;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/bp;->a:Lkik/android/widget/bo;

    invoke-static {v2}, Lkik/android/widget/bo;->b(Lkik/android/widget/bo;)I

    move-result v2

    iget-object v3, p0, Lkik/android/widget/bp;->a:Lkik/android/widget/bo;

    invoke-static {v3}, Lkik/android/widget/bo;->c(Lkik/android/widget/bo;)Lkik/android/gifs/a/f;

    move-result-object v3

    invoke-virtual {v3}, Lkik/android/gifs/a/f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lkik/android/widget/GifWidget;->a(Lkik/android/widget/GifWidget;Ljava/lang/String;ILjava/lang/String;)V

    iget-object v0, p0, Lkik/android/widget/bp;->a:Lkik/android/widget/bo;

    iget-object v0, v0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    invoke-static {v0}, Lkik/android/widget/GifWidget;->a(Lkik/android/widget/GifWidget;)Lkik/a/e/g;

    move-result-object v0

    invoke-interface {v0, p1}, Lkik/a/e/g;->a(Lkik/a/d/a/a;)V

    iget-object v0, p0, Lkik/android/widget/bp;->a:Lkik/android/widget/bo;

    iget-object v0, v0, Lkik/android/widget/bo;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_previewView:Landroid/widget/FrameLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    iget-object v0, p0, Lkik/android/widget/bp;->a:Lkik/android/widget/bo;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/widget/bo;->a(Lkik/android/widget/bo;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    return-void
.end method
