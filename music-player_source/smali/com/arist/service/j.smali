.class final Lcom/arist/service/j;
.super Landroid/telephony/PhoneStateListener;


# instance fields
.field final synthetic a:Lcom/arist/service/MusicPlayService;


# direct methods
.method private constructor <init>(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/service/j;->a:Lcom/arist/service/MusicPlayService;

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/service/MusicPlayService;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/arist/service/j;-><init>(Lcom/arist/service/MusicPlayService;)V

    return-void
.end method


# virtual methods
.method public final onCallStateChanged(ILjava/lang/String;)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/service/j;->a:Lcom/arist/service/MusicPlayService;

    invoke-virtual {v0}, Lcom/arist/service/MusicPlayService;->a()V

    iget-object v0, p0, Lcom/arist/service/j;->a:Lcom/arist/service/MusicPlayService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/arist/service/MusicPlayService;->a(Lcom/arist/service/MusicPlayService;Z)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/arist/service/j;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->f(Lcom/arist/service/MusicPlayService;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/service/j;->a:Lcom/arist/service/MusicPlayService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/arist/service/MusicPlayService;->a(Lcom/arist/service/MusicPlayService;Z)V

    iget-object v0, p0, Lcom/arist/service/j;->a:Lcom/arist/service/MusicPlayService;

    invoke-virtual {v0}, Lcom/arist/service/MusicPlayService;->a()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
