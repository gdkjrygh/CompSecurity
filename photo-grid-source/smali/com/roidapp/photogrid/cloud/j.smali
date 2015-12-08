.class final Lcom/roidapp/photogrid/cloud/j;
.super Lcom/pinterest/pinit/PinItListener;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V
    .locals 0

    .prologue
    .line 947
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/j;->a:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-direct {p0}, Lcom/pinterest/pinit/PinItListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Z)V
    .locals 2

    .prologue
    .line 950
    invoke-super {p0, p1}, Lcom/pinterest/pinit/PinItListener;->onComplete(Z)V

    .line 951
    const-string v0, "SharePage_View"

    const-string v1, "Share_BackShare"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 952
    return-void
.end method
