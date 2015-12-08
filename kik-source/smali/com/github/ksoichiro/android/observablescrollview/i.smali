.class final Lcom/github/ksoichiro/android/observablescrollview/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroid/view/MotionEvent;

.field final synthetic c:Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;


# direct methods
.method constructor <init>(Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;Landroid/view/ViewGroup;Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 173
    iput-object p1, p0, Lcom/github/ksoichiro/android/observablescrollview/i;->c:Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;

    iput-object p2, p0, Lcom/github/ksoichiro/android/observablescrollview/i;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/github/ksoichiro/android/observablescrollview/i;->b:Landroid/view/MotionEvent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 176
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/i;->a:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/i;->b:Landroid/view/MotionEvent;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 177
    return-void
.end method
