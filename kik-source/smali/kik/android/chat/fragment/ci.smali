.class final Lkik/android/chat/fragment/ci;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/util/bw$a;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 337
    iput-object p1, p0, Lkik/android/chat/fragment/ci;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 342
    if-nez p1, :cond_0

    .line 391
    :goto_0
    return-void

    .line 346
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/ci;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/cj;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/cj;-><init>(Lkik/android/chat/fragment/ci;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method
