.class Lcom/qihoo/security/lite/LicenseActivity$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/lite/LicenseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/lite/LicenseActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/lite/LicenseActivity;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/qihoo/security/lite/LicenseActivity$1;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 49
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 50
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 55
    :goto_0
    return-void

    .line 52
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$1;->a:Lcom/qihoo/security/lite/LicenseActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/lite/LicenseActivity;->a(Lcom/qihoo/security/lite/LicenseActivity;Z)Z

    goto :goto_0

    .line 50
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
