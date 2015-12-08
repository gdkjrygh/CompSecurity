.class final Lkik/android/chat/fragment/fw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;Z)V
    .locals 0

    .prologue
    .line 5155
    iput-object p1, p0, Lkik/android/chat/fragment/fw;->b:Lkik/android/chat/fragment/KikChatFragment;

    iput-boolean p2, p0, Lkik/android/chat/fragment/fw;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .prologue
    .line 5159
    iget-object v0, p0, Lkik/android/chat/fragment/fw;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/fw;->a:Z

    if-eqz v0, :cond_0

    .line 5160
    iget-object v0, p0, Lkik/android/chat/fragment/fw;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/fw;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/widget/ResizeEventList;->getCount()I

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/widget/ResizeEventList;->smoothScrollToPosition(I)V

    .line 5162
    :cond_0
    return-void
.end method
