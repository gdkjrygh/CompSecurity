.class final Lkik/android/widget/bs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/widget/GifWidget;


# direct methods
.method constructor <init>(Lkik/android/widget/GifWidget;)V
    .locals 0

    .prologue
    .line 409
    iput-object p1, p0, Lkik/android/widget/bs;->a:Lkik/android/widget/GifWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 413
    iget-object v0, p0, Lkik/android/widget/bs;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_gifsCantLoad:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lkik/android/widget/bs;->a:Lkik/android/widget/GifWidget;

    invoke-virtual {v1}, Lkik/android/widget/GifWidget;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0007

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 414
    iget-object v0, p0, Lkik/android/widget/bs;->a:Lkik/android/widget/GifWidget;

    iget-object v0, v0, Lkik/android/widget/GifWidget;->_gifsCantLoad:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 415
    return-void
.end method
