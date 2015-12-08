.class final Lkik/android/chat/fragment/dx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 2604
    iput-object p1, p0, Lkik/android/chat/fragment/dx;->b:Lkik/android/chat/fragment/KikChatFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/dx;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 2608
    iget-object v0, p0, Lkik/android/chat/fragment/dx;->b:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 2609
    iget-object v0, p0, Lkik/android/chat/fragment/dx;->b:Lkik/android/chat/fragment/KikChatFragment;

    const v1, 0x7f0902bb

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/dx;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2610
    iget-object v0, p0, Lkik/android/chat/fragment/dx;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->v(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 2611
    return-void
.end method
