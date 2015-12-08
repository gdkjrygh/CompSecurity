.class final Lkik/android/chat/fragment/fz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;I)V
    .locals 0

    .prologue
    .line 5251
    iput-object p1, p0, Lkik/android/chat/fragment/fz;->b:Lkik/android/chat/fragment/KikChatFragment;

    iput p2, p0, Lkik/android/chat/fragment/fz;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 5255
    iget-object v0, p0, Lkik/android/chat/fragment/fz;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aR(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v0

    iget v1, p0, Lkik/android/chat/fragment/fz;->a:I

    if-eq v0, v1, :cond_1

    .line 5260
    iget-object v0, p0, Lkik/android/chat/fragment/fz;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aS(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5261
    iget-object v0, p0, Lkik/android/chat/fragment/fz;->b:Lkik/android/chat/fragment/KikChatFragment;

    sget-object v1, Lkik/android/chat/fragment/KikChatFragment$b;->d:Lkik/android/chat/fragment/KikChatFragment$b;

    invoke-static {v0, v1, v2}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$b;Z)V

    .line 5266
    :cond_0
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/fz;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aU(Lkik/android/chat/fragment/KikChatFragment;)Z

    .line 5267
    iget-object v0, p0, Lkik/android/chat/fragment/fz;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->_contentFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 5269
    :cond_1
    return-void

    .line 5263
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/fz;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aT(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v0

    sget v1, Lkik/android/chat/fragment/KikChatFragment$c;->a:I

    if-eq v0, v1, :cond_0

    .line 5264
    iget-object v0, p0, Lkik/android/chat/fragment/fz;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v2, v2}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;ZZ)V

    goto :goto_0
.end method
