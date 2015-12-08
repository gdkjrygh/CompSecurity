.class final Lkik/android/chat/fragment/bz;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 821
    iput-object p1, p0, Lkik/android/chat/fragment/bz;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 821
    check-cast p2, Lkik/a/f/f/q;

    iget-object v0, p0, Lkik/android/chat/fragment/bz;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->e:Lkik/a/e/l;

    invoke-virtual {p2}, Lkik/a/f/f/q;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lkik/a/e/l;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v0

    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->m()Lkik/a/d/k;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->n()Landroid/text/Spannable;

    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->o()Lkik/a/d/s;

    :cond_0
    return-void
.end method
