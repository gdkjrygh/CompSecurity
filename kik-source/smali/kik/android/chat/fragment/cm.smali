.class final Lkik/android/chat/fragment/cm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 951
    iput-object p1, p0, Lkik/android/chat/fragment/cm;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    .prologue
    .line 956
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 957
    iget-object v1, p0, Lkik/android/chat/fragment/cm;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChatFragment;->_mediaTrayContainer:Lkik/android/widget/DarkLinearLayout;

    invoke-virtual {v1, v0}, Lkik/android/widget/DarkLinearLayout;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 959
    iget-object v0, p0, Lkik/android/chat/fragment/cm;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->_mediaTrayContainer:Lkik/android/widget/DarkLinearLayout;

    invoke-virtual {v0}, Lkik/android/widget/DarkLinearLayout;->getMeasuredHeight()I

    move-result v0

    .line 960
    iget-object v1, p0, Lkik/android/chat/fragment/cm;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->t(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 961
    iget-object v1, p0, Lkik/android/chat/fragment/cm;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->H(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v1

    add-int/2addr v0, v1

    move v1, v0

    .line 964
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/cm;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->rootLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 965
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    if-eq v1, v0, :cond_0

    .line 966
    iget-object v0, p0, Lkik/android/chat/fragment/cm;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;I)V

    .line 968
    :cond_0
    return-void

    :cond_1
    move v1, v0

    goto :goto_0
.end method
