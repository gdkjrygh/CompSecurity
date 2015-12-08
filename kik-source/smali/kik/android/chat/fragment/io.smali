.class final Lkik/android/chat/fragment/io;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikCodeFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCodeFragment;)V
    .locals 0

    .prologue
    .line 733
    iput-object p1, p0, Lkik/android/chat/fragment/io;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 737
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/io;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_fakeCode:Lkik/android/widget/KikCodeBackgroundImageView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 738
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/io;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_spinner:Landroid/widget/ProgressBar;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/chat/fragment/io;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 739
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/io;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_codeInfo:Landroid/view/ViewGroup;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/chat/fragment/io;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_scanText:Landroid/widget/TextView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/av;->b([Landroid/view/View;)V

    .line 740
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/io;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_errorHolder:Landroid/widget/LinearLayout;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/chat/fragment/io;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_retryImage:Landroid/widget/ImageView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/av;->a([Landroid/view/View;)V

    .line 741
    return-void
.end method
