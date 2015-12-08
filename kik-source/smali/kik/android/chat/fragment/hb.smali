.class final Lkik/android/chat/fragment/hb;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatInfoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 0

    .prologue
    .line 1164
    iput-object p1, p0, Lkik/android/chat/fragment/hb;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 1164
    check-cast p1, Lkik/a/d/n;

    iget-object v0, p0, Lkik/android/chat/fragment/hb;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v1, "Group Left"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Admin"

    invoke-virtual {p1}, Lkik/a/d/n;->A()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Participants Count"

    invoke-virtual {p1}, Lkik/a/d/n;->E()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    iget-object v0, p0, Lkik/android/chat/fragment/hb;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->w()V

    iget-object v0, p0, Lkik/android/chat/fragment/hb;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->x(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 1177
    iget-object v0, p0, Lkik/android/chat/fragment/hb;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->w()V

    .line 1178
    invoke-static {p1}, Lkik/a/f/q;->a(Ljava/lang/Throwable;)I

    move-result v0

    .line 1179
    invoke-static {p1}, Lkik/a/f/q;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 1180
    sparse-switch v0, :sswitch_data_0

    .line 1194
    iget-object v1, p0, Lkik/android/chat/fragment/hb;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->d(I)V

    .line 1197
    :goto_0
    return-void

    .line 1182
    :sswitch_0
    iget-object v0, p0, Lkik/android/chat/fragment/hb;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/chat/fragment/hb;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->b(Ljava/lang/String;)V

    .line 1183
    iget-object v0, p0, Lkik/android/chat/fragment/hb;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->x(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    goto :goto_0

    .line 1188
    :sswitch_1
    iget-object v0, p0, Lkik/android/chat/fragment/hb;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {}, Lkik/android/util/cq;->a()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0900ae

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1191
    :sswitch_2
    iget-object v0, p0, Lkik/android/chat/fragment/hb;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    const v2, 0x7f0902bb

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1180
    nop

    :sswitch_data_0
    .sparse-switch
        0x68 -> :sswitch_2
        0xc9 -> :sswitch_0
        0xca -> :sswitch_1
    .end sparse-switch
.end method
