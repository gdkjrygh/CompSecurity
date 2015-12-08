.class final Lkik/android/chat/fragment/fp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/fn;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/fn;)V
    .locals 0

    .prologue
    .line 734
    iput-object p1, p0, Lkik/android/chat/fragment/fp;->a:Lkik/android/chat/fragment/fn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 739
    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->k()Lkik/a/d/a/a;

    move-result-object v0

    .line 740
    if-eqz v0, :cond_0

    .line 741
    iget-object v1, p0, Lkik/android/chat/fragment/fp;->a:Lkik/android/chat/fragment/fn;

    iget-object v1, v1, Lkik/android/chat/fragment/fn;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v2, "Attachment Deleted"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Type"

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 743
    iget-object v1, p0, Lkik/android/chat/fragment/fp;->a:Lkik/android/chat/fragment/fn;

    iget-object v1, v1, Lkik/android/chat/fragment/fn;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;)V

    .line 745
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/fp;->a:Lkik/android/chat/fragment/fn;

    iget-object v0, v0, Lkik/android/chat/fragment/fn;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->v(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 746
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 747
    return-void
.end method
