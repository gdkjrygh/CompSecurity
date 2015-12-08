.class final Lcom/google/zxing/client/android/ViewfinderResultPointCallback;
.super Ljava/lang/Object;
.source "ViewfinderResultPointCallback.java"

# interfaces
.implements Lcom/google/zxing/ResultPointCallback;


# instance fields
.field private final viewfinderView:Lcom/google/zxing/client/android/ViewfinderView;


# direct methods
.method constructor <init>(Lcom/google/zxing/client/android/ViewfinderView;)V
    .locals 0
    .param p1, "viewfinderView"    # Lcom/google/zxing/client/android/ViewfinderView;

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/google/zxing/client/android/ViewfinderResultPointCallback;->viewfinderView:Lcom/google/zxing/client/android/ViewfinderView;

    .line 28
    return-void
.end method


# virtual methods
.method public foundPossibleResultPoint(Lcom/google/zxing/ResultPoint;)V
    .locals 1
    .param p1, "point"    # Lcom/google/zxing/ResultPoint;

    .prologue
    .line 32
    iget-object v0, p0, Lcom/google/zxing/client/android/ViewfinderResultPointCallback;->viewfinderView:Lcom/google/zxing/client/android/ViewfinderView;

    invoke-virtual {v0, p1}, Lcom/google/zxing/client/android/ViewfinderView;->addPossibleResultPoint(Lcom/google/zxing/ResultPoint;)V

    .line 33
    return-void
.end method
