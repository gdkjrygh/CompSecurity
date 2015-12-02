.class Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$8;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


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
    .line 253
    iput-object p1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$8;->a:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 256
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$8;->a:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-static {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->e(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Lcom/qihoo/security/dialog/k;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 258
    return-void
.end method
