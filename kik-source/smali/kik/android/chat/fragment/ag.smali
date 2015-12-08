.class final Lkik/android/chat/fragment/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/af;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/af;)V
    .locals 0

    .prologue
    .line 306
    iput-object p1, p0, Lkik/android/chat/fragment/ag;->a:Lkik/android/chat/fragment/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 310
    iget-object v0, p0, Lkik/android/chat/fragment/ag;->a:Lkik/android/chat/fragment/af;

    iget-object v0, v0, Lkik/android/chat/fragment/af;->b:Lkik/android/chat/fragment/ConversationsBaseFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ConversationsBaseFragment;->b(Z)V

    .line 311
    iget-object v0, p0, Lkik/android/chat/fragment/ag;->a:Lkik/android/chat/fragment/af;

    iget-object v0, v0, Lkik/android/chat/fragment/af;->b:Lkik/android/chat/fragment/ConversationsBaseFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/ag;->a:Lkik/android/chat/fragment/af;

    iget-object v1, v1, Lkik/android/chat/fragment/af;->a:Lkik/a/d/f;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ConversationsBaseFragment;->b(Lkik/a/d/f;)V

    .line 312
    return-void
.end method
