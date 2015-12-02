.class Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->a(Landroid/view/View;ILandroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;Lcom/qihoo/security/locale/widget/LocaleTextView;)V
    .locals 0

    .prologue
    .line 200
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$1;->b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$1;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 203
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$1;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 204
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 205
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$1;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 207
    :cond_0
    return-void
.end method
