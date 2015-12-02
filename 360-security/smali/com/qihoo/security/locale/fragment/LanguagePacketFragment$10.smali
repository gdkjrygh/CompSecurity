.class Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$10;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/qihoo/security/dialog/i;

.field final synthetic c:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Ljava/lang/String;Lcom/qihoo/security/dialog/i;)V
    .locals 0

    .prologue
    .line 298
    iput-object p1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$10;->c:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    iput-object p2, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$10;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$10;->b:Lcom/qihoo/security/dialog/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 301
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 302
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$10;->c:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->f(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Lcom/qihoo/security/locale/d;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$10;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(Ljava/lang/String;)V

    .line 303
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$10;->c:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    iget-object v0, v0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$10;->c:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    iget-object v1, v1, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->b:Landroid/os/Handler;

    const/16 v2, 0x3ea

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 305
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$10;->b:Lcom/qihoo/security/dialog/i;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 307
    :cond_0
    return-void
.end method
