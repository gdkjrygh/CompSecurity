.class Lcom/qihoo/security/floatview/ui/i$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/floatview/ui/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/floatview/ui/i;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/ui/i;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/i$1;->a:Lcom/qihoo/security/floatview/ui/i;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 209
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 216
    :goto_0
    return-void

    .line 211
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/i$1;->a:Lcom/qihoo/security/floatview/ui/i;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/i;->setMemoryAlpha(F)V

    goto :goto_0

    .line 209
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
