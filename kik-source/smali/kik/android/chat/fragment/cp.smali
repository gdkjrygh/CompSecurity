.class final Lkik/android/chat/fragment/cp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/g;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;I)V
    .locals 0

    .prologue
    .line 1133
    iput-object p1, p0, Lkik/android/chat/fragment/cp;->b:Lkik/android/chat/fragment/KikChatFragment;

    iput p2, p0, Lkik/android/chat/fragment/cp;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/d/a/a;)V
    .locals 2

    .prologue
    .line 1138
    iget v0, p0, Lkik/android/chat/fragment/cp;->a:I

    iget-object v1, p0, Lkik/android/chat/fragment/cp;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->N(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v1

    if-ne v0, v1, :cond_0

    if-eqz p1, :cond_0

    .line 1139
    iget-object v0, p0, Lkik/android/chat/fragment/cp;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/KikChatFragment;->b(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;)V

    .line 1140
    iget-object v0, p0, Lkik/android/chat/fragment/cp;->b:Lkik/android/chat/fragment/KikChatFragment;

    const-string v1, "Attached"

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->c(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)V

    .line 1142
    iget-object v0, p0, Lkik/android/chat/fragment/cp;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->O(Lkik/android/chat/fragment/KikChatFragment;)I

    .line 1144
    :cond_0
    return-void
.end method
