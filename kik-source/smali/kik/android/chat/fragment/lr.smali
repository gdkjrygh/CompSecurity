.class final Lkik/android/chat/fragment/lr;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikGroupMembersListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V
    .locals 0

    .prologue
    .line 417
    iput-object p1, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 417
    check-cast p1, Lkik/a/f/f/r;

    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->n(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/ls;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ls;-><init>(Lkik/android/chat/fragment/lr;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p1}, Lkik/a/f/f/r;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->e:Lcom/kik/android/a;

    const-string v1, "User Banned"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Participants Count"

    iget-object v2, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lkik/a/d/n;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/n;->F()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Banned Count"

    iget-object v2, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lkik/a/d/n;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/n;->D()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lkik/a/f/f/r;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->e:Lcom/kik/android/a;

    const-string v1, "User Removed"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Participants Count"

    iget-object v2, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lkik/a/d/n;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/n;->F()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lkik/a/f/f/r;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->e:Lcom/kik/android/a;

    const-string v1, "User Unbanned"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Participants Count"

    iget-object v2, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lkik/a/d/n;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/n;->F()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Banned Count"

    iget-object v2, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lkik/a/d/n;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/n;->D()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 6

    .prologue
    const v5, 0x7f0902ba

    .line 452
    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 453
    instance-of v0, p1, Lkik/a/f/q;

    if-eqz v0, :cond_0

    .line 454
    invoke-static {p1}, Lkik/a/f/q;->a(Ljava/lang/Throwable;)I

    move-result v0

    .line 455
    invoke-static {p1}, Lkik/a/f/q;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 457
    sparse-switch v0, :sswitch_data_0

    .line 483
    iget-object v1, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->d(I)V

    .line 487
    :cond_0
    :goto_0
    return-void

    .line 459
    :sswitch_0
    iget-object v2, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v1}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v0}, Lkik/android/util/cy;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, v2, Lkik/android/chat/fragment/KikGroupMembersListFragment;->Q:Ljava/lang/String;

    .line 460
    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikGroupMembersListFragment;->Q:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 459
    :cond_1
    const v0, 0x7f09004d

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-static {v0, v3}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 463
    :sswitch_1
    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09017b

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 466
    :sswitch_2
    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09017e

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 469
    :sswitch_3
    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09017f

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 472
    :sswitch_4
    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09034c

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    :sswitch_5
    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09034d

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 477
    :sswitch_6
    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f090181

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 480
    :sswitch_7
    iget-object v0, p0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f090180

    invoke-static {v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 457
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
