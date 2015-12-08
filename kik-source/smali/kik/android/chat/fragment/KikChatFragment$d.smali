.class public final Lkik/android/chat/fragment/KikChatFragment$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikChatFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method public constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 279
    iput-object p1, p0, Lkik/android/chat/fragment/KikChatFragment$d;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 283
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment$d;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 284
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment$d;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v1, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;ZZ)V

    .line 286
    :cond_0
    return-void
.end method

.method public final a(Lkik/android/widget/bn;)V
    .locals 1

    .prologue
    .line 302
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment$d;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/widget/bn;)Lkik/android/widget/bn;

    .line 303
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 290
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment$d;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->b(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 291
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment$d;->a:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Z)V

    .line 293
    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment$d;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->b(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    return v0
.end method
