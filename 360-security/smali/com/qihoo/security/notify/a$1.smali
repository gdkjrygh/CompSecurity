.class Lcom/qihoo/security/notify/a$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/notify/a;-><init>(Landroid/content/Context;Lcom/qihoo/security/service/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/notify/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/notify/a;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/qihoo/security/notify/a$1;->a:Lcom/qihoo/security/notify/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 51
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 74
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 75
    return-void

    .line 53
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/notify/a$1;->a:Lcom/qihoo/security/notify/a;

    invoke-static {v0}, Lcom/qihoo/security/notify/a;->a(Lcom/qihoo/security/notify/a;)V

    goto :goto_0

    .line 56
    :pswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v0, v0

    invoke-static {v0, v1}, Lcom/qihoo/security/booster/a;->a(J)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v0

    .line 57
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v1

    .line 58
    const/16 v2, 0x1006

    invoke-virtual {v1, v2}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 59
    invoke-virtual {v1, v0}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/notify/a$1;->a:Lcom/qihoo/security/notify/a;

    invoke-static {v0}, Lcom/qihoo/security/notify/a;->b(Lcom/qihoo/security/notify/a;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "sp_key_last_nofity_booster"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    goto :goto_0

    .line 69
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/notify/a$1;->a:Lcom/qihoo/security/notify/a;

    invoke-static {v0}, Lcom/qihoo/security/notify/a;->b(Lcom/qihoo/security/notify/a;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "sp_key_last_nofity_booster"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    goto :goto_0

    .line 51
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
