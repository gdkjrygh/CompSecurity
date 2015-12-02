.class public Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;
    }
.end annotation


# instance fields
.field private A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;"
        }
    .end annotation
.end field

.field private B:Landroid/widget/ProgressBar;

.field private C:Z

.field private D:Z

.field private y:Landroid/widget/ListView;

.field private z:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 173
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->B:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->A:Ljava/util/List;

    return-object p1
.end method

.method private a(Lcom/qihoo/security/malware/vo/MaliciousInfo;)V
    .locals 3

    .prologue
    .line 144
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->p:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/antivirus/MalwareDetailActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 145
    const-string/jumbo v1, "extra_detail_info"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 146
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 147
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;Z)Z
    .locals 0

    .prologue
    .line 39
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->C:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->A:Ljava/util/List;

    return-object v0
.end method

.method private b(Lcom/qihoo/security/malware/vo/MaliciousInfo;)V
    .locals 3

    .prologue
    .line 155
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->p:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 156
    const-string/jumbo v1, "extra_detail_info"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 157
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->startActivity(Landroid/content/Intent;)V

    .line 158
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;Z)Z
    .locals 0

    .prologue
    .line 39
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->D:Z

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;)Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->z:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    return-object v0
.end method

.method private o()V
    .locals 3

    .prologue
    .line 66
    const v0, 0x7f0b021f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->y:Landroid/widget/ListView;

    .line 67
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->y:Landroid/widget/ListView;

    const v1, 0x7f0b0093

    invoke-virtual {p0, v1}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 69
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->p:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->A:Ljava/util/List;

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;-><init>(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->z:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    .line 70
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->y:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->z:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 71
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->y:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 73
    const v0, 0x7f0b009c

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->B:Landroid/widget/ProgressBar;

    .line 74
    return-void
.end method

.method private p()V
    .locals 3

    .prologue
    .line 85
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 87
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 88
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 89
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->p:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isUninstall(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 90
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 91
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->p:Landroid/content/Context;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v2, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 94
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->z:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->notifyDataSetChanged()V

    .line 95
    return-void
.end method

.method private q()V
    .locals 1

    .prologue
    .line 98
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;-><init>(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;->start()V

    .line 126
    return-void
.end method


# virtual methods
.method protected j()V
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 61
    const v0, 0x7f0c0116

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->b(I)V

    .line 63
    :cond_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 162
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/app/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 163
    if-nez p1, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    if-eqz p3, :cond_0

    .line 164
    const-string/jumbo v0, "extra_detail_info"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 165
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->A:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 166
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->D:Z

    .line 167
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->A:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 168
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->z:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->notifyDataSetChanged()V

    .line 171
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 224
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->D:Z

    if-eqz v0, :cond_0

    .line 225
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->setResult(I)V

    .line 227
    :cond_0
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onBackPressed()V

    .line 228
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 51
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 52
    const v0, 0x7f0300a7

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->setContentView(I)V

    .line 53
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->o()V

    .line 54
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->q()V

    .line 55
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 130
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->A:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 131
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 132
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->a(Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    .line 136
    :goto_0
    return-void

    .line 134
    :cond_0
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->b(Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    goto :goto_0
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 78
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onResume()V

    .line 79
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->C:Z

    if-eqz v0, :cond_0

    .line 80
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->p()V

    .line 82
    :cond_0
    return-void
.end method
