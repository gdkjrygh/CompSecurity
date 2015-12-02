.class Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;
.super Lcom/qihoo/security/v5/e;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-direct {p0}, Lcom/qihoo/security/v5/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 84
    return-void
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->a:Z

    .line 60
    packed-switch p1, :pswitch_data_0

    .line 74
    :goto_0
    :pswitch_0
    return-void

    .line 62
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a()V

    goto :goto_0

    .line 69
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)V

    goto :goto_0

    .line 60
    nop

    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 79
    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 4

    .prologue
    .line 91
    if-nez p2, :cond_0

    .line 92
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->a:Z

    .line 93
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    iget-object v0, v0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    iget-object v1, v1, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->b:Landroid/os/Handler;

    const/16 v2, 0x3eb

    iget-object v3, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v3}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->b(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x320

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 98
    :goto_0
    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)V

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 105
    iget-boolean v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->a:Z

    if-nez v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    iget-object v0, v0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    iget-object v1, v1, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->b:Landroid/os/Handler;

    const/16 v2, 0x3eb

    iget-object v3, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v3}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x320

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->d(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Lcom/qihoo/security/v5/UpdateService;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->d(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Lcom/qihoo/security/v5/UpdateService;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/b;)V

    .line 112
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->a:Z

    .line 113
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 117
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->d(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Lcom/qihoo/security/v5/UpdateService;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->d(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Lcom/qihoo/security/v5/UpdateService;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/b;)V

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)V

    .line 121
    return-void
.end method
