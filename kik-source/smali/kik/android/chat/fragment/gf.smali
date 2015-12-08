.class final Lkik/android/chat/fragment/gf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ge;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ge;)V
    .locals 0

    .prologue
    .line 5647
    iput-object p1, p0, Lkik/android/chat/fragment/gf;->a:Lkik/android/chat/fragment/ge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 5652
    iget-object v0, p0, Lkik/android/chat/fragment/gf;->a:Lkik/android/chat/fragment/ge;

    iget-object v0, v0, Lkik/android/chat/fragment/ge;->a:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->k(Lkik/android/chat/fragment/KikChatFragment;Z)V

    .line 5653
    return-void
.end method
