.class final Lkik/android/chat/fragment/ho;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/hn;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/hn;)V
    .locals 0

    .prologue
    .line 1663
    iput-object p1, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 1663
    check-cast p1, Lkik/a/f/f/r;

    iget-object v0, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismissAllowingStateLoss()V

    iget-object v0, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->b:Landroid/view/View;

    new-instance v1, Lkik/android/chat/fragment/hp;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/hp;-><init>(Lkik/android/chat/fragment/ho;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;

    move-result-object v0

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {p1}, Lkik/a/f/f/r;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v1, v1, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v2, "User Banned"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Participants Count"

    invoke-virtual {v0}, Lkik/a/d/n;->F()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    int-to-long v4, v3

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Banned Count"

    invoke-virtual {v0}, Lkik/a/d/n;->D()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    int-to-long v4, v0

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lkik/a/f/f/r;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v1, v1, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v2, "User Removed"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Participants Count"

    invoke-virtual {v0}, Lkik/a/d/n;->F()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    int-to-long v4, v0

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 6

    .prologue
    const v5, 0x7f0902ba

    .line 1687
    iget-object v0, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismissAllowingStateLoss()V

    .line 1688
    instance-of v0, p1, Lkik/a/f/q;

    if-eqz v0, :cond_0

    .line 1689
    invoke-static {p1}, Lkik/a/f/q;->a(Ljava/lang/Throwable;)I

    move-result v0

    .line 1690
    invoke-static {p1}, Lkik/a/f/q;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 1692
    sparse-switch v0, :sswitch_data_0

    .line 1718
    iget-object v1, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v1, v1, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->d(I)V

    .line 1722
    :cond_0
    :goto_0
    return-void

    .line 1694
    :sswitch_0
    iget-object v2, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v2, v2, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v1}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v0}, Lkik/android/util/cy;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, v2, Lkik/android/chat/fragment/KikChatInfoFragment;->Q:Ljava/lang/String;

    .line 1695
    iget-object v0, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v2, v2, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikChatInfoFragment;->Q:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1694
    :cond_1
    const v0, 0x7f09004d

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-static {v0, v3}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 1698
    :sswitch_1
    iget-object v0, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09017b

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1701
    :sswitch_2
    iget-object v0, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09017e

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1704
    :sswitch_3
    iget-object v0, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09017f

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1707
    :sswitch_4
    iget-object v0, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09034c

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1709
    :sswitch_5
    iget-object v0, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09034d

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1712
    :sswitch_6
    iget-object v0, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f090181

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1715
    :sswitch_7
    iget-object v0, p0, Lkik/android/chat/fragment/ho;->a:Lkik/android/chat/fragment/hn;

    iget-object v0, v0, Lkik/android/chat/fragment/hn;->c:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f090180

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1692
    :sswitch_data_0
    .sparse-switch
        0x191 -> :sswitch_6
        0x195 -> :sswitch_7
        0xfa1 -> :sswitch_0
        0xfa2 -> :sswitch_1
        0xfa3 -> :sswitch_2
        0xfa4 -> :sswitch_3
        0xfa5 -> :sswitch_5
        0xfa6 -> :sswitch_4
    .end sparse-switch
.end method
