.class final Lkik/android/chat/fragment/kh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikConversationsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikConversationsFragment;)V
    .locals 0

    .prologue
    .line 929
    iput-object p1, p0, Lkik/android/chat/fragment/kh;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 933
    iget-object v0, p0, Lkik/android/chat/fragment/kh;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment;->i(Lkik/android/chat/fragment/KikConversationsFragment;)Lcom/kik/view/adapters/t;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 934
    iget-object v0, p0, Lkik/android/chat/fragment/kh;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment;->i(Lkik/android/chat/fragment/KikConversationsFragment;)Lcom/kik/view/adapters/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/view/adapters/t;->b()V

    .line 936
    :cond_0
    return-void
.end method
