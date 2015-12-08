.class final Lkik/android/chat/fragment/gk;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatInfoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 0

    .prologue
    .line 596
    iput-object p1, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 596
    check-cast p1, Lkik/a/d/n;

    iget-object v0, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/k;)Lkik/a/d/k;

    iget-object v0, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    invoke-virtual {p1}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/f;)Lkik/a/d/f;

    iget-object v0, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {p1}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->w()V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 6

    .prologue
    const v3, 0x7f0902ba

    .line 609
    iget-object v0, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->w()V

    .line 611
    const/16 v1, 0x64

    .line 612
    const/4 v0, 0x0

    .line 614
    instance-of v2, p1, Lkik/a/f/q;

    if-eqz v2, :cond_0

    .line 615
    check-cast p1, Lkik/a/f/q;

    .line 617
    invoke-virtual {p1}, Lkik/a/f/q;->a()I

    move-result v1

    .line 618
    invoke-virtual {p1}, Lkik/a/f/q;->b()Ljava/lang/Object;

    move-result-object v0

    .line 621
    :cond_0
    sparse-switch v1, :sswitch_data_0

    .line 650
    iget-object v0, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->d(I)V

    .line 653
    :goto_0
    return-void

    .line 623
    :sswitch_0
    iget-object v0, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f090025

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 626
    :sswitch_1
    iget-object v0, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09011a

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 629
    :sswitch_2
    check-cast v0, Ljava/lang/String;

    .line 630
    if-nez v0, :cond_1

    .line 631
    const v0, 0x7f090202

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v0

    .line 633
    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f0901a2

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v3, v4}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 636
    :sswitch_3
    iget-object v1, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {}, Lkik/android/util/cq;->a()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 639
    :sswitch_4
    if-eqz v0, :cond_2

    .line 640
    check-cast v0, Ljava/util/List;

    .line 641
    iget-object v1, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    invoke-static {v0, v1}, Lkik/android/util/cq;->a(Ljava/util/List;Lkik/a/e/r;)Ljava/lang/String;

    .line 643
    iget-object v0, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f090119

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 646
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/gk;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->d(I)V

    goto :goto_0

    .line 621
    :sswitch_data_0
    .sparse-switch
        0x68 -> :sswitch_3
        0xc9 -> :sswitch_2
        0xca -> :sswitch_0
        0xcb -> :sswitch_1
        0xfa2 -> :sswitch_4
    .end sparse-switch
.end method
