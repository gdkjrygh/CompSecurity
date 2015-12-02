.class Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$9;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)V
    .locals 0

    .prologue
    .line 261
    iput-object p1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$9;->a:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 264
    const/4 v1, 0x4

    if-ne p2, v1, :cond_1

    .line 265
    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$9;->a:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v1}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->e(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Lcom/qihoo/security/dialog/k;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 272
    :cond_0
    :goto_0
    return v0

    .line 269
    :cond_1
    const/16 v1, 0x54

    if-eq p2, v1, :cond_0

    .line 272
    const/4 v0, 0x0

    goto :goto_0
.end method
