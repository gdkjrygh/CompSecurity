.class final Lkik/android/chat/fragment/jk;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikContactsListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikContactsListFragment;)V
    .locals 0

    .prologue
    .line 709
    iput-object p1, p0, Lkik/android/chat/fragment/jk;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .prologue
    const v7, 0x7f0902ba

    const/4 v6, 0x1

    .line 713
    iget-object v0, p0, Lkik/android/chat/fragment/jk;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 714
    instance-of v0, p2, Lkik/a/f/q;

    if-eqz v0, :cond_0

    .line 715
    check-cast p2, Ljava/lang/Throwable;

    .line 716
    invoke-static {p2}, Lkik/a/f/q;->a(Ljava/lang/Throwable;)I

    move-result v0

    .line 717
    invoke-static {p2}, Lkik/a/f/q;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 719
    sparse-switch v0, :sswitch_data_0

    .line 733
    iget-object v1, p0, Lkik/android/chat/fragment/jk;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikContactsListFragment;->d(I)V

    .line 737
    :cond_0
    :goto_0
    :sswitch_0
    return-void

    .line 721
    :sswitch_1
    invoke-static {v1}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 722
    iget-object v1, p0, Lkik/android/chat/fragment/jk;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v7}, Lkik/android/chat/fragment/KikContactsListFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lkik/android/util/cy;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 725
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/jk;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    const v2, 0x7f09034a

    new-array v3, v6, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lkik/android/chat/fragment/jk;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/KikContactsListFragment;->H:Lkik/a/e/r;

    invoke-interface {v5, v1, v6}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    invoke-static {v1}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v4

    invoke-static {v2, v3}, Lkik/android/chat/fragment/KikContactsListFragment;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lkik/android/chat/fragment/KikContactsListFragment;->Q:Ljava/lang/String;

    .line 726
    iget-object v0, p0, Lkik/android/chat/fragment/jk;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-static {v7}, Lkik/android/chat/fragment/KikContactsListFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/jk;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikContactsListFragment;->Q:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 719
    nop

    :sswitch_data_0
    .sparse-switch
        0x68 -> :sswitch_0
        0xfa1 -> :sswitch_1
    .end sparse-switch
.end method
