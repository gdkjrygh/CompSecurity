.class Ljp/co/cyberagent/android/gpuimage/GPUImageView$LoadingView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;


# direct methods
.method public constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 500
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$LoadingView;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 501
    invoke-direct {p0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 502
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$LoadingView;->init()V

    .line 503
    return-void
.end method

.method public constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 505
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$LoadingView;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 506
    invoke-direct {p0, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 507
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$LoadingView;->init()V

    .line 508
    return-void
.end method

.method public constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 510
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$LoadingView;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 511
    invoke-direct {p0, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 512
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$LoadingView;->init()V

    .line 513
    return-void
.end method

.method private init()V
    .locals 4

    .prologue
    const/4 v3, -0x2

    .line 516
    new-instance v0, Landroid/widget/ProgressBar;

    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$LoadingView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 517
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x11

    invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 519
    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$LoadingView;->addView(Landroid/view/View;)V

    .line 520
    const/high16 v0, -0x1000000

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$LoadingView;->setBackgroundColor(I)V

    .line 521
    return-void
.end method
