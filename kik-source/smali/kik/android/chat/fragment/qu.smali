.class final Lkik/android/chat/fragment/qu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ScanCodeTabFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ScanCodeTabFragment;)V
    .locals 0

    .prologue
    .line 393
    iput-object p1, p0, Lkik/android/chat/fragment/qu;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 397
    iget-object v0, p0, Lkik/android/chat/fragment/qu;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/ScanCodeTabFragment;->_viewPager:Lkik/android/widget/VelocityControlledViewPager;

    invoke-virtual {v0, v3}, Lkik/android/widget/VelocityControlledViewPager;->a(Z)V

    .line 398
    const/4 v0, 0x3

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/qu;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/ScanCodeTabFragment;->_scanToggle:Landroid/widget/SeekBar;

    aput-object v2, v0, v1

    iget-object v1, p0, Lkik/android/chat/fragment/qu;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/ScanCodeTabFragment;->_cameraIcon:Landroid/widget/ImageView;

    aput-object v1, v0, v3

    const/4 v1, 0x2

    iget-object v2, p0, Lkik/android/chat/fragment/qu;->a:Lkik/android/chat/fragment/ScanCodeTabFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/ScanCodeTabFragment;->_codeIcon:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 399
    return-void
.end method
