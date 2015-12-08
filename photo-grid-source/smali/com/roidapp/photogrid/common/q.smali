.class public final Lcom/roidapp/photogrid/common/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 24
    invoke-static {}, Lcom/facebook/FacebookSdk;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 100
    :goto_0
    return-void

    .line 26
    :cond_0
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 28
    const-string v0, "https://fb.me/919120318127803"

    .line 30
    const-string v1, "https://fbcdn-sphotos-e-a.akamaihd.net/hphotos-ak-xpt1/v/t1.0-9/p370x247/17414_419123284915587_3522621611379441172_n.jpg?oh=93acf96f54e7480529dd3b61d9448b30&oe=55A44442&__gda__=1437965383_0d315ef202d976451bf20f79d56e7613"

    .line 32
    invoke-static {}, Lcom/facebook/share/widget/AppInviteDialog;->canShow()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 33
    new-instance v2, Lcom/facebook/share/model/AppInviteContent$Builder;

    invoke-direct {v2}, Lcom/facebook/share/model/AppInviteContent$Builder;-><init>()V

    invoke-virtual {v2, v0}, Lcom/facebook/share/model/AppInviteContent$Builder;->setApplinkUrl(Ljava/lang/String;)Lcom/facebook/share/model/AppInviteContent$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/AppInviteContent$Builder;->setPreviewImageUrl(Ljava/lang/String;)Lcom/facebook/share/model/AppInviteContent$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/share/model/AppInviteContent$Builder;->build()Lcom/facebook/share/model/AppInviteContent;

    move-result-object v0

    .line 37
    invoke-static {p0, v0}, Lcom/facebook/share/widget/AppInviteDialog;->show(Landroid/app/Activity;Lcom/facebook/share/model/AppInviteContent;)V

    goto :goto_0

    .line 41
    :cond_1
    invoke-static {}, Lcom/facebook/FacebookSdk;->getApplicationId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->loadAppSettingsAsync(Landroid/content/Context;Ljava/lang/String;)V

    .line 42
    new-instance v0, Lcom/roidapp/photogrid/common/r;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/r;-><init>()V

    .line 53
    new-instance v1, Lcom/roidapp/photogrid/common/s;

    invoke-direct {v1}, Lcom/roidapp/photogrid/common/s;-><init>()V

    .line 61
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 62
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    .line 63
    const v0, 0x7f070112

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f070111

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f07003b

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0

    .line 71
    :cond_2
    new-instance v0, Lcom/roidapp/photogrid/common/t;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/t;-><init>(Landroid/app/Activity;)V

    new-instance v1, Lcom/roidapp/photogrid/common/u;

    invoke-direct {v1}, Lcom/roidapp/photogrid/common/u;-><init>()V

    new-instance v2, Lcom/roidapp/photogrid/common/v;

    invoke-direct {v2}, Lcom/roidapp/photogrid/common/v;-><init>()V

    invoke-static {p0, v0, v1, v2}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnKeyListener;)V

    goto :goto_0
.end method
