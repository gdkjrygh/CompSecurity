.class final Lkik/android/chat/fragment/rn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lkik/android/chat/fragment/rl;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/rl;I)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lkik/android/chat/fragment/rn;->b:Lkik/android/chat/fragment/rl;

    iput p2, p0, Lkik/android/chat/fragment/rn;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 141
    iget-object v0, p0, Lkik/android/chat/fragment/rn;->b:Lkik/android/chat/fragment/rl;

    invoke-static {v0}, Lkik/android/chat/fragment/rl;->a(Lkik/android/chat/fragment/rl;)Lkik/android/chat/fragment/rl$a;

    move-result-object v0

    iget v1, p0, Lkik/android/chat/fragment/rn;->a:I

    invoke-interface {v0, p2, v1}, Lkik/android/chat/fragment/rl$a;->a(Landroid/view/MotionEvent;I)Z

    move-result v0

    return v0
.end method
