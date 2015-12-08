.class final Lkik/android/chat/fragment/dc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/db;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/db;)V
    .locals 0

    .prologue
    .line 1614
    iput-object p1, p0, Lkik/android/chat/fragment/dc;->a:Lkik/android/chat/fragment/db;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 1618
    iget-object v0, p0, Lkik/android/chat/fragment/dc;->a:Lkik/android/chat/fragment/db;

    iget-object v0, v0, Lkik/android/chat/fragment/db;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->q:Lcom/kik/android/c/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/dc;->a:Lkik/android/chat/fragment/db;

    iget-object v0, v0, Lkik/android/chat/fragment/db;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ImeAwareEditText;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1619
    iget-object v0, p0, Lkik/android/chat/fragment/dc;->a:Lkik/android/chat/fragment/db;

    iget-object v0, v0, Lkik/android/chat/fragment/db;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->q:Lcom/kik/android/c/f;

    iget-object v0, p0, Lkik/android/chat/fragment/dc;->a:Lkik/android/chat/fragment/db;

    iget-object v0, v0, Lkik/android/chat/fragment/db;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ImeAwareEditText;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/android/c/f;->b(Landroid/text/Editable;)V

    .line 1621
    :cond_0
    return-void
.end method
