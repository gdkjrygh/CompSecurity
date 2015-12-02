.class Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$6;
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
.field final synthetic a:Lcom/qihoo/security/locale/LocaleInfo;

.field final synthetic b:Lcom/qihoo/security/dialog/i;

.field final synthetic c:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Lcom/qihoo/security/locale/LocaleInfo;Lcom/qihoo/security/dialog/i;)V
    .locals 0

    .prologue
    .line 213
    iput-object p1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$6;->c:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    iput-object p2, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$6;->a:Lcom/qihoo/security/locale/LocaleInfo;

    iput-object p3, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$6;->b:Lcom/qihoo/security/dialog/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 216
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 217
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$6;->a:Lcom/qihoo/security/locale/LocaleInfo;

    iget-boolean v0, v0, Lcom/qihoo/security/locale/LocaleInfo;->support:Z

    if-eqz v0, :cond_1

    .line 218
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$6;->c:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$6;->a:Lcom/qihoo/security/locale/LocaleInfo;

    iget-object v1, v1, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a(Ljava/lang/String;)V

    .line 223
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$6;->b:Lcom/qihoo/security/dialog/i;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 225
    :cond_0
    return-void

    .line 220
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$6;->c:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a()V

    goto :goto_0
.end method
