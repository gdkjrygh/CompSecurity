.class final Lkik/android/chat/fragment/hs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/hr;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/hr;)V
    .locals 0

    .prologue
    .line 333
    iput-object p1, p0, Lkik/android/chat/fragment/hs;->a:Lkik/android/chat/fragment/hr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 338
    iget-object v0, p0, Lkik/android/chat/fragment/hs;->a:Lkik/android/chat/fragment/hr;

    iget-object v0, v0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v0, v0, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v1, "Chat Info Block Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 340
    iget-object v0, p0, Lkik/android/chat/fragment/hs;->a:Lkik/android/chat/fragment/hr;

    iget-object v0, v0, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v0, v0, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    iget-object v1, p0, Lkik/android/chat/fragment/hs;->a:Lkik/android/chat/fragment/hr;

    iget-object v1, v1, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v1, v1, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/r;->c(Lkik/a/d/j;)Lcom/kik/g/p;

    move-result-object v0

    .line 342
    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v1

    if-nez v1, :cond_0

    .line 343
    iget-object v1, p0, Lkik/android/chat/fragment/hs;->a:Lkik/android/chat/fragment/hr;

    iget-object v1, v1, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v1, v1, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->g(Lkik/android/chat/fragment/KikChatInfoFragment;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 346
    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/hs;->a:Lkik/android/chat/fragment/hr;

    iget-object v1, v1, Lkik/android/chat/fragment/hr;->b:Lkik/android/chat/fragment/hq;

    iget-object v1, v1, Lkik/android/chat/fragment/hq;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->getView()Landroid/view/View;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/ht;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/ht;-><init>(Lkik/android/chat/fragment/hs;)V

    invoke-static {v1, v2}, Lcom/kik/sdkutils/d;->a(Landroid/view/View;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 368
    return-void
.end method
