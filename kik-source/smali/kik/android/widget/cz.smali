.class final Lkik/android/widget/cz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lkik/android/widget/cx;


# direct methods
.method constructor <init>(Lkik/android/widget/cx;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lkik/android/widget/cz;->a:Lkik/android/widget/cx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lkik/android/widget/cz;->a:Lkik/android/widget/cx;

    invoke-virtual {v0}, Lkik/android/widget/cx;->dismiss()V

    .line 44
    const/4 v0, 0x1

    return v0
.end method
