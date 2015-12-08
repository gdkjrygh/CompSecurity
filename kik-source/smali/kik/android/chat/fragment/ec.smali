.class final Lkik/android/chat/fragment/ec;
.super Lcom/kik/m/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;Z)V
    .locals 0

    .prologue
    .line 2826
    iput-object p1, p0, Lkik/android/chat/fragment/ec;->b:Lkik/android/chat/fragment/KikChatFragment;

    iput-boolean p2, p0, Lkik/android/chat/fragment/ec;->a:Z

    invoke-direct {p0}, Lcom/kik/m/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .prologue
    .line 2830
    iget-boolean v0, p0, Lkik/android/chat/fragment/ec;->a:Z

    if-eqz v0, :cond_0

    .line 2832
    iget-object v0, p0, Lkik/android/chat/fragment/ec;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/ed;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ed;-><init>(Lkik/android/chat/fragment/ec;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/widget/ResizeEventList;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2840
    :cond_0
    return-void
.end method
