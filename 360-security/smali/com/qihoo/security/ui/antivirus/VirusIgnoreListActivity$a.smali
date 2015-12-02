.class Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;
.super Lcom/qihoo/security/c/a/a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo/security/c/a/a",
        "<",
        "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 175
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->c:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    .line 176
    invoke-direct {p0, p2, p3}, Lcom/qihoo/security/c/a/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 177
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/view/View;ILandroid/view/ViewGroup;)V
    .locals 7

    .prologue
    .line 191
    const v0, 0x7f0b0220

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 192
    const v1, 0x7f0b0221

    invoke-static {p1, v1}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 193
    const v2, 0x7f0b0222

    invoke-static {p1, v2}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/locale/widget/LocaleButton;

    .line 195
    invoke-virtual {p0, p2}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 197
    iget-object v4, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    const v5, 0x7f020044

    invoke-virtual {v0, v4, v5}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->b(Ljava/lang/String;I)V

    .line 199
    iget-object v0, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTag(Ljava/lang/Object;)V

    .line 200
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a()Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    move-result-object v0

    new-instance v4, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$1;

    invoke-direct {v4, p0, v1}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$1;-><init>(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;Lcom/qihoo/security/locale/widget/LocaleTextView;)V

    const-string/jumbo v1, "appLabel"

    iget-object v5, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    iget-object v6, v3, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v4, v1, v5, v6}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$2;

    invoke-direct {v0, p0, v3}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$2;-><init>(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 180
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->a:Ljava/util/List;

    .line 181
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->notifyDataSetChanged()V

    .line 182
    return-void
.end method

.method protected b()I
    .locals 1

    .prologue
    .line 186
    const v0, 0x7f0300a8

    return v0
.end method
