.class Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$7;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a(Lcom/qihoo/security/locale/LocaleInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/i;

.field final synthetic b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Lcom/qihoo/security/dialog/i;)V
    .locals 0

    .prologue
    .line 226
    iput-object p1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$7;->b:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    iput-object p2, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$7;->a:Lcom/qihoo/security/dialog/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$7;->a:Lcom/qihoo/security/dialog/i;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 230
    return-void
.end method
