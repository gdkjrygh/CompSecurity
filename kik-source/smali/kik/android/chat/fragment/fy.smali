.class final Lkik/android/chat/fragment/fy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/fx;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/fx;)V
    .locals 0

    .prologue
    .line 5176
    iput-object p1, p0, Lkik/android/chat/fragment/fy;->a:Lkik/android/chat/fragment/fx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 5180
    iget-object v0, p0, Lkik/android/chat/fragment/fy;->a:Lkik/android/chat/fragment/fx;

    iget-object v0, v0, Lkik/android/chat/fragment/fx;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/fy;->a:Lkik/android/chat/fragment/fx;

    iget-object v1, v1, Lkik/android/chat/fragment/fx;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/widget/ResizeEventList;->getCount()I

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/widget/ResizeEventList;->smoothScrollToPosition(I)V

    .line 5181
    return-void
.end method
