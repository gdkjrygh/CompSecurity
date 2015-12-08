.class final Lkik/android/chat/fragment/cj;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/chat/fragment/ci;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ci;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 347
    iput-object p1, p0, Lkik/android/chat/fragment/cj;->b:Lkik/android/chat/fragment/ci;

    iput-object p2, p0, Lkik/android/chat/fragment/cj;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 347
    check-cast p1, Ljava/lang/Boolean;

    iget-object v0, p0, Lkik/android/chat/fragment/cj;->b:Lkik/android/chat/fragment/ci;

    iget-object v0, v0, Lkik/android/chat/fragment/ci;->a:Lkik/android/chat/fragment/KikChatFragment;

    new-instance v1, Lkik/android/chat/fragment/ck;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/ck;-><init>(Lkik/android/chat/fragment/cj;Ljava/lang/Boolean;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->b(Ljava/lang/Runnable;)V

    return-void
.end method
