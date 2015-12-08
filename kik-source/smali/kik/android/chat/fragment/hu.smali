.class final Lkik/android/chat/fragment/hu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Lkik/android/chat/fragment/ht;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ht;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 359
    iput-object p1, p0, Lkik/android/chat/fragment/hu;->b:Lkik/android/chat/fragment/ht;

    iput-object p2, p0, Lkik/android/chat/fragment/hu;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 363
    iget-object v0, p0, Lkik/android/chat/fragment/hu;->b:Lkik/android/chat/fragment/ht;

    iget-object v0, v0, Lkik/android/chat/fragment/ht;->a:Lkik/android/chat/fragment/hs;

    iget-object v0, v0, Lkik/android/chat/fragment/hs;->a:Lkik/android/chat/fragment/hr;

    iget-object v0, v0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v0, v0, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    const v1, 0x7f0902db

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/hu;->a:Ljava/lang/Throwable;

    invoke-static {v2}, Lkik/android/util/cy;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    return-void
.end method
