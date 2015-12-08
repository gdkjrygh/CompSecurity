.class final Lkik/android/chat/fragment/pw;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lkik/android/chat/fragment/KikStartGroupFragment;

.field final synthetic d:Lkik/android/chat/fragment/KikStartGroupFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikStartGroupFragment;Ljava/lang/String;Ljava/util/List;Lkik/android/chat/fragment/KikStartGroupFragment;)V
    .locals 0

    .prologue
    .line 476
    iput-object p1, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/pw;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/android/chat/fragment/pw;->b:Ljava/util/List;

    iput-object p4, p0, Lkik/android/chat/fragment/pw;->c:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 476
    check-cast p1, Lkik/a/d/n;

    iget-object v0, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Lkik/android/chat/fragment/KikStartGroupFragment;Lkik/a/d/n;)Lkik/a/d/n;

    iget-object v0, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikStartGroupFragment;->Y:Lcom/kik/android/a;

    const-string v1, "Group Created"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Name Length"

    iget-object v0, p0, Lkik/android/chat/fragment/pw;->a:Ljava/lang/String;

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    :goto_0
    invoke-virtual {v2, v3, v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Has Picture"

    iget-object v2, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(Lkik/android/chat/fragment/KikStartGroupFragment;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Participants Count"

    iget-object v2, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Lkik/android/chat/fragment/KikStartGroupFragment;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    iget-object v0, p0, Lkik/android/chat/fragment/pw;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->p()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikStartGroupFragment;->U:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-interface {v2, v0}, Lkik/a/e/r;->a(Lkik/a/d/j;)Lcom/kik/g/p;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/pw;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    int-to-long v0, v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Lkik/android/util/p$a;

    invoke-virtual {p1}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikStartGroupFragment;->Z:Lkik/a/f/k;

    iget-object v3, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikStartGroupFragment;->aa:Lkik/a/e/n;

    iget-object v4, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    iget-object v4, v4, Lkik/android/chat/fragment/KikStartGroupFragment;->W:Lkik/a/e/w;

    iget-object v5, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/KikStartGroupFragment;->X:Lkik/a/e/v;

    invoke-direct/range {v0 .. v6}, Lkik/android/util/p$a;-><init>(Ljava/lang/String;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/w;Lkik/a/e/v;B)V

    const/4 v1, 0x1

    new-array v1, v1, [Lkik/android/e/d;

    iget-object v2, p0, Lkik/android/chat/fragment/pw;->c:Lkik/android/chat/fragment/KikStartGroupFragment;

    aput-object v2, v1, v6

    invoke-virtual {v0, v1}, Lkik/android/util/p$a;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_2
    return-void

    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(Lkik/android/chat/fragment/KikStartGroupFragment;Lkik/a/d/n;)V

    goto :goto_2
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    const v3, 0x7f0902c8

    const/4 v6, 0x1

    .line 507
    iget-object v1, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 509
    const/16 v1, 0x64

    .line 512
    instance-of v2, p1, Lkik/a/f/q;

    if-eqz v2, :cond_2

    .line 513
    check-cast p1, Lkik/a/f/q;

    .line 515
    invoke-virtual {p1}, Lkik/a/f/q;->a()I

    move-result v1

    .line 516
    invoke-virtual {p1}, Lkik/a/f/q;->b()Ljava/lang/Object;

    move-result-object v0

    move v2, v1

    .line 519
    :goto_0
    const-string v1, "Other"

    .line 521
    sparse-switch v2, :sswitch_data_0

    .line 548
    iget-object v0, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikStartGroupFragment;->d(I)V

    move-object v0, v1

    .line 552
    :goto_1
    const/16 v1, 0x65

    if-ne v2, v1, :cond_0

    .line 553
    const-string v0, "Network"

    .line 555
    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikStartGroupFragment;->Y:Lcom/kik/android/a;

    const-string v2, "Group Create Failed"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Reason"

    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 557
    return-void

    .line 524
    :sswitch_0
    iget-object v3, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikStartGroupFragment;->U:Lkik/a/e/r;

    check-cast v0, Ljava/lang/String;

    invoke-interface {v3, v0, v6}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    .line 526
    if-nez v0, :cond_1

    .line 527
    const v0, 0x7f090202

    invoke-static {v0}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(I)Ljava/lang/String;

    move-result-object v0

    .line 530
    :cond_1
    iget-object v3, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    const v4, 0x7f0902e7

    invoke-static {v4}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f0901a2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    invoke-static {v5, v6}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    .line 531
    goto :goto_1

    .line 533
    :sswitch_1
    iget-object v0, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-static {}, Lkik/android/util/cq;->a()Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f090025

    invoke-static {v4}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    .line 534
    goto :goto_1

    :sswitch_2
    move-object v1, v0

    .line 536
    check-cast v1, Ljava/lang/String;

    .line 537
    iget-object v3, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-static {}, Lkik/android/util/cq;->a()Ljava/lang/String;

    move-result-object v4

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v4, v0}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    .line 538
    goto :goto_1

    .line 540
    :sswitch_3
    const-string v0, "Restricted Name"

    .line 541
    iget-object v1, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f090121

    invoke-static {v4}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 544
    :sswitch_4
    const-string v0, "Invalid Name"

    .line 545
    iget-object v1, p0, Lkik/android/chat/fragment/pw;->d:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f090059

    invoke-static {v4}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_2
    move v2, v1

    goto/16 :goto_0

    .line 521
    nop

    :sswitch_data_0
    .sparse-switch
        0x68 -> :sswitch_2
        0xc9 -> :sswitch_0
        0xca -> :sswitch_1
        0x191 -> :sswitch_4
        0x193 -> :sswitch_3
    .end sparse-switch
.end method
