.class final Lkik/android/chat/fragment/hj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/a/d/k;

.field final synthetic b:Lkik/a/d/f;

.field final synthetic c:Lkik/android/chat/fragment/KikChatInfoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/k;Lkik/a/d/f;)V
    .locals 0

    .prologue
    .line 1511
    iput-object p1, p0, Lkik/android/chat/fragment/hj;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/hj;->a:Lkik/a/d/k;

    iput-object p3, p0, Lkik/android/chat/fragment/hj;->b:Lkik/a/d/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 1516
    packed-switch p2, :pswitch_data_0

    .line 1527
    const-string v0, "Not Set"

    .line 1530
    :goto_0
    iget-object v1, p0, Lkik/android/chat/fragment/hj;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v2, "Muted"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Is Verified"

    iget-object v3, p0, Lkik/android/chat/fragment/hj;->a:Lkik/a/d/k;

    invoke-virtual {v3}, Lkik/a/d/k;->i()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Source"

    const-string v3, "Chat Info"

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Duration"

    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Group"

    iget-object v2, p0, Lkik/android/chat/fragment/hj;->a:Lkik/a/d/k;

    instance-of v2, v2, Lkik/a/d/n;

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Participants Count"

    iget-object v0, p0, Lkik/android/chat/fragment/hj;->a:Lkik/a/d/k;

    instance-of v0, v0, Lkik/a/d/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/hj;->a:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->E()I

    move-result v0

    int-to-long v0, v0

    :goto_1
    invoke-virtual {v2, v3, v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1532
    iget-object v0, p0, Lkik/android/chat/fragment/hj;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/chat/fragment/hj;->b:Lkik/a/d/f;

    invoke-virtual {v1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lkik/a/e/i;->a(Ljava/lang/String;I)V

    .line 1533
    return-void

    .line 1518
    :pswitch_0
    const-string v0, "One Hour"

    goto :goto_0

    .line 1521
    :pswitch_1
    const-string v0, "Until 8:00"

    goto :goto_0

    .line 1524
    :pswitch_2
    const-string v0, "Forever"

    goto :goto_0

    .line 1530
    :cond_0
    const-wide/16 v0, 0x1

    goto :goto_1

    .line 1516
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
