.class final Lkik/android/chat/fragment/cb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ca;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ca;)V
    .locals 0

    .prologue
    .line 845
    iput-object p1, p0, Lkik/android/chat/fragment/cb;->a:Lkik/android/chat/fragment/ca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 849
    iget-object v0, p0, Lkik/android/chat/fragment/cb;->a:Lkik/android/chat/fragment/ca;

    iget-object v0, v0, Lkik/android/chat/fragment/ca;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->C(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 850
    return-void
.end method
