.class final Lkik/android/chat/fragment/ld;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lkik/android/chat/fragment/ld;->b:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/ld;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 154
    check-cast p1, Lkik/a/d/n;

    iget-object v0, p0, Lkik/android/chat/fragment/ld;->b:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->w()V

    iget-object v0, p0, Lkik/android/chat/fragment/ld;->b:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;

    new-instance v1, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    invoke-virtual {v1, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 5

    .prologue
    .line 163
    iget-object v0, p0, Lkik/android/chat/fragment/ld;->b:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->w()V

    .line 164
    invoke-static {p1}, Lkik/a/f/q;->a(Ljava/lang/Throwable;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 169
    iget-object v0, p0, Lkik/android/chat/fragment/ld;->b:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;

    invoke-static {}, Lkik/android/util/cq;->a()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f090266

    invoke-static {v2}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    :goto_0
    return-void

    .line 166
    :pswitch_0
    iget-object v0, p0, Lkik/android/chat/fragment/ld;->b:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;

    const v1, 0x7f090375

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lkik/android/chat/fragment/ld;->a:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0901da

    invoke-static {v2}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 164
    nop

    :pswitch_data_0
    .packed-switch 0x194
        :pswitch_0
    .end packed-switch
.end method
