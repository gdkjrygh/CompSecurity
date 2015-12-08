.class final Lkik/android/chat/fragment/af;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/f;

.field final synthetic b:Lkik/android/chat/fragment/ConversationsBaseFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ConversationsBaseFragment;Lkik/a/d/f;)V
    .locals 0

    .prologue
    .line 302
    iput-object p1, p0, Lkik/android/chat/fragment/af;->b:Lkik/android/chat/fragment/ConversationsBaseFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/af;->a:Lkik/a/d/f;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic b(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 302
    check-cast p1, Landroid/os/Bundle;

    iget-object v0, p0, Lkik/android/chat/fragment/af;->b:Lkik/android/chat/fragment/ConversationsBaseFragment;

    new-instance v1, Lkik/android/chat/fragment/ag;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ag;-><init>(Lkik/android/chat/fragment/af;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ConversationsBaseFragment;->b(Ljava/lang/Runnable;)V

    invoke-super {p0, p1}, Lcom/kik/g/r;->b(Ljava/lang/Object;)V

    return-void
.end method
