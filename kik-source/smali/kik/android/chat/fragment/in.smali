.class final Lkik/android/chat/fragment/in;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikCodeFragment$c;

.field final synthetic b:Lkik/android/chat/fragment/KikCodeFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCodeFragment;Lkik/android/chat/fragment/KikCodeFragment$c;)V
    .locals 0

    .prologue
    .line 721
    iput-object p1, p0, Lkik/android/chat/fragment/in;->b:Lkik/android/chat/fragment/KikCodeFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/in;->a:Lkik/android/chat/fragment/KikCodeFragment$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 725
    iget-object v0, p0, Lkik/android/chat/fragment/in;->b:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikCodeFragment;->_fakeCode:Lkik/android/widget/KikCodeBackgroundImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/widget/KikCodeBackgroundImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 726
    iget-object v0, p0, Lkik/android/chat/fragment/in;->b:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikCodeFragment;->p(Lkik/android/chat/fragment/KikCodeFragment;)V

    .line 727
    iget-object v0, p0, Lkik/android/chat/fragment/in;->a:Lkik/android/chat/fragment/KikCodeFragment$c;

    if-eqz v0, :cond_0

    .line 728
    iget-object v0, p0, Lkik/android/chat/fragment/in;->a:Lkik/android/chat/fragment/KikCodeFragment$c;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCodeFragment$c;->a()V

    .line 730
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
