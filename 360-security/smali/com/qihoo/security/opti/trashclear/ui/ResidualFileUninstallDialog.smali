.class public Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;
.super Lcom/qihoo/security/dialog/AbsDialogActivity;
.source "360Security"


# instance fields
.field private c:Landroid/content/Context;

.field private d:Lcom/qihoo/security/opti/trashclear/service/d;

.field private e:Z

.field private f:Lcom/qihoo/security/service/a;

.field private g:Z

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;

.field private j:J

.field private k:Ljava/lang/String;

.field private final l:Landroid/content/ServiceConnection;

.field private final m:Landroid/content/ServiceConnection;

.field private final n:Lcom/qihoo/security/service/c$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->e:Z

    .line 40
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->g:Z

    .line 43
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->j:J

    .line 44
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->k:Ljava/lang/String;

    .line 171
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$3;-><init>(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->l:Landroid/content/ServiceConnection;

    .line 188
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$4;-><init>(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->m:Landroid/content/ServiceConnection;

    .line 267
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$5;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$5;-><init>(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->n:Lcom/qihoo/security/service/c$a;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)Lcom/qihoo/security/opti/trashclear/service/d;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->d:Lcom/qihoo/security/opti/trashclear/service/d;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;Lcom/qihoo/security/opti/trashclear/service/d;)Lcom/qihoo/security/opti/trashclear/service/d;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->d:Lcom/qihoo/security/opti/trashclear/service/d;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;Lcom/qihoo/security/service/a;)Lcom/qihoo/security/service/a;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->f:Lcom/qihoo/security/service/a;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;Z)Z
    .locals 0

    .prologue
    .line 32
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->e:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)Ljava/util/List;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->h:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)Lcom/qihoo/security/service/a;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->f:Lcom/qihoo/security/service/a;

    return-object v0
.end method

.method private c()V
    .locals 3

    .prologue
    .line 105
    const v0, 0x7f0200cf

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->a(I)V

    .line 106
    const v0, 0x7f0c01d3

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->setDialogTitle(I)V

    .line 107
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View$OnClickListener;

    const/4 v1, 0x0

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$1;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)V

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$2;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog$2;-><init>(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)V

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 150
    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;)Lcom/qihoo/security/service/c$a;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->n:Lcom/qihoo/security/service/c$a;

    return-object v0
.end method

.method private d()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 153
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    const-string/jumbo v2, "com.qihoo.security.ACTION_SERVICE_RESIDUAL_FILE"

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->l:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/common/utils/Utils;->bindService(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 155
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    const-string/jumbo v2, "com.qihoo.security.service.INTERNAL_CONTROL"

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->m:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/common/utils/Utils;->bindService(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 157
    return-void
.end method

.method private e()V
    .locals 4

    .prologue
    .line 290
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c:Landroid/content/Context;

    const-string/jumbo v1, "skfutv"

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 291
    if-eqz v0, :cond_0

    .line 292
    const-string/jumbo v1, "1.0.8.3742"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->compareVersion(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 293
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string/jumbo v2, "v3/saved/info"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/r;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 294
    if-eqz v0, :cond_0

    .line 295
    const-string/jumbo v1, "1"

    const-string/jumbo v2, "force"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 296
    if-eqz v1, :cond_0

    .line 297
    const-string/jumbo v1, "uiforce"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 298
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 299
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 300
    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 301
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 302
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->finish()V

    .line 307
    :cond_0
    return-void
.end method


# virtual methods
.method protected a()Landroid/view/View;
    .locals 1

    .prologue
    .line 161
    const/4 v0, 0x0

    return-object v0
.end method

.method public finish()V
    .locals 1

    .prologue
    .line 217
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->e:Z

    if-nez v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->d:Lcom/qihoo/security/opti/trashclear/service/d;

    if-eqz v0, :cond_0

    .line 223
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->d:Lcom/qihoo/security/opti/trashclear/service/d;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/service/d;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 247
    :cond_0
    :goto_0
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->finish()V

    .line 248
    return-void

    .line 224
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 52
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onCreate(Landroid/os/Bundle;)V

    .line 53
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c:Landroid/content/Context;

    .line 54
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->e()V

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->h:Ljava/util/List;

    .line 56
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 57
    if-nez v0, :cond_0

    .line 63
    :goto_0
    return-void

    .line 61
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c()V

    .line 62
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->d()V

    goto :goto_0
.end method

.method protected onDestroy()V
    .locals 3

    .prologue
    .line 255
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onDestroy()V

    .line 257
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->f:Lcom/qihoo/security/service/a;

    if-eqz v0, :cond_0

    .line 258
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->f:Lcom/qihoo/security/service/a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->n:Lcom/qihoo/security/service/c$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->b(Lcom/qihoo/security/service/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    :cond_0
    :goto_0
    const-string/jumbo v0, "ResidualFileUninstallDialog"

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->l:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/common/utils/Utils;->unbindService(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 264
    const-string/jumbo v0, "ResidualFileUninstallDialog"

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->m:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/common/utils/Utils;->unbindService(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 265
    return-void

    .line 260
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 166
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 167
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->g:Z

    .line 168
    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->setIntent(Landroid/content/Intent;)V

    .line 169
    return-void
.end method

.method protected onResume()V
    .locals 10

    .prologue
    const-wide/16 v4, 0x0

    const v9, 0x7f080031

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 67
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onResume()V

    .line 68
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    iget-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->g:Z

    if-eqz v1, :cond_0

    .line 71
    iput-boolean v6, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->g:Z

    .line 72
    const-string/jumbo v1, "uninstalled_app_info"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->i:Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;

    .line 73
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->i:Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->i:Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;

    iget-wide v0, v0, Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;->fileSize:J

    cmp-long v0, v0, v4

    if-lez v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->h:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->i:Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v7, :cond_2

    .line 76
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->i:Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;->appName:Ljava/lang/String;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->k:Ljava/lang/String;

    .line 80
    :goto_0
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->j:J

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->i:Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;

    iget-wide v2, v2, Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;->fileSize:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->j:J

    .line 86
    :cond_0
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->j:J

    cmp-long v0, v0, v4

    if-gtz v0, :cond_3

    .line 87
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->finish()V

    .line 101
    :cond_1
    :goto_1
    new-array v0, v8, [I

    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->setButtonText([I)V

    .line 102
    return-void

    .line 78
    :cond_2
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->k:Ljava/lang/String;

    goto :goto_0

    .line 90
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c:Landroid/content/Context;

    const v1, 0x7f0c0227

    new-array v2, v7, [Ljava/lang/String;

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->j:J

    invoke-static {v4, v5}, Lcom/qihoo360/common/utils/Utils;->getHumanReadableSizeMore(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    invoke-static {v0, v1, v9, v2}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;II[Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->setDialogMessage(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 95
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->c:Landroid/content/Context;

    const v1, 0x7f0c0226

    new-array v2, v8, [Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->k:Ljava/lang/String;

    aput-object v3, v2, v6

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->j:J

    invoke-static {v4, v5}, Lcom/qihoo360/common/utils/Utils;->getHumanReadableSizeMore(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-static {v0, v1, v9, v2}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;II[Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;->setDialogMessage(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 101
    :array_0
    .array-data 4
        0x7f0c014e
        0x7f0c014f
    .end array-data
.end method
