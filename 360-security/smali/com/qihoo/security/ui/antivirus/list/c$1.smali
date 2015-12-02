.class Lcom/qihoo/security/ui/antivirus/list/c$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/c;->e(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field final synthetic b:Lcom/qihoo/security/malware/vo/MaliciousInfo;

.field final synthetic c:Lcom/qihoo/security/ui/antivirus/list/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/c;Lcom/qihoo/security/locale/widget/LocaleTextView;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V
    .locals 0

    .prologue
    .line 234
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/c$1;->c:Lcom/qihoo/security/ui/antivirus/list/c;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/list/c$1;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object p3, p0, Lcom/qihoo/security/ui/antivirus/list/c$1;->b:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 237
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/c$1;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 238
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 239
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/c$1;->b:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-boolean v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    if-eqz v0, :cond_1

    .line 240
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/c$1;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 245
    :cond_0
    :goto_0
    return-void

    .line 242
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/c$1;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/c$1;->c:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Lcom/qihoo/security/ui/antivirus/list/c;)Lcom/qihoo/security/locale/d;

    move-result-object v2

    const v3, 0x7f0c0102

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method
