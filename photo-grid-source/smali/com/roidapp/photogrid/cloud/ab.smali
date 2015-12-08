.class final Lcom/roidapp/photogrid/cloud/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/aa;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/aa;)V
    .locals 0

    .prologue
    .line 200
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/ab;->a:Lcom/roidapp/photogrid/cloud/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    .line 203
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.ksmobile.launcher.theme.t100119625"

    const-string v2, "https://play.google.com/store/apps/details?id=com.ksmobile.launcher.theme.t100119625&referrer=utm_source%3DPG_Template_feed"

    const-string v3, "https://play.google.com/store/apps/details?id=com.ksmobile.launcher.theme.t100119625&referrer=utm_source%3DPG_Template_feed"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/ads/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 209
    const-string v0, "Ad/Click/CML"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    return-void
.end method
