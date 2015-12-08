.class final Lkik/android/chat/fragment/ey;
.super Lcom/kik/m/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 3820
    iput-object p1, p0, Lkik/android/chat/fragment/ey;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Lcom/kik/m/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 3831
    iget-object v0, p0, Lkik/android/chat/fragment/ey;->a:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lkik/android/chat/fragment/KikChatFragment;->y:Z

    .line 3832
    iget-object v0, p0, Lkik/android/chat/fragment/ey;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->_newMessagesButton:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 3833
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 3825
    iget-object v0, p0, Lkik/android/chat/fragment/ey;->a:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkik/android/chat/fragment/KikChatFragment;->y:Z

    .line 3826
    return-void
.end method
