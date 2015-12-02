.class public Lcom/facebook/selfupdate/SelfUpdateInstallActivity;
.super Lcom/facebook/base/activity/i;
.source "SelfUpdateInstallActivity.java"


# instance fields
.field private p:Z

.field private q:Landroid/view/View;

.field private r:Lcom/facebook/selfupdate/o;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/selfupdate/SelfUpdateInstallActivity;)Lcom/facebook/selfupdate/o;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->r:Lcom/facebook/selfupdate/o;

    return-object v0
.end method

.method private b(Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 4

    .prologue
    .line 155
    const/4 v1, 0x0

    .line 157
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v2, Lcom/facebook/common/f/d;

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/f/d;

    .line 159
    :try_start_0
    new-instance v2, Ljava/net/URI;

    invoke-direct {v2, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 161
    invoke-virtual {v2}, Ljava/net/URI;->isAbsolute()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 162
    invoke-virtual {v0, v2}, Lcom/facebook/common/f/d;->a(Ljava/net/URI;)Ljava/io/File;

    move-result-object v0

    .line 166
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 172
    :goto_1
    return-object v0

    .line 164
    :cond_0
    invoke-virtual {v0, p1}, Lcom/facebook/common/f/d;->a(Ljava/lang/String;)Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 167
    :catch_0
    move-exception v0

    .line 169
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid file: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/f;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_1
.end method

.method static synthetic b(Lcom/facebook/selfupdate/SelfUpdateInstallActivity;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->j()V

    return-void
.end method

.method private j()V
    .locals 2

    .prologue
    .line 186
    invoke-virtual {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    .line 187
    const-class v1, Lcom/facebook/selfupdate/af;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/selfupdate/af;

    .line 188
    invoke-virtual {v0}, Lcom/facebook/selfupdate/af;->e()V

    .line 189
    invoke-virtual {v0}, Lcom/facebook/selfupdate/af;->f()V

    .line 190
    return-void
.end method

.method private k()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 201
    invoke-virtual {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "no_cancel"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->p:Z

    .line 202
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->r:Lcom/facebook/selfupdate/o;

    sget-object v1, Lcom/facebook/selfupdate/p;->NO_CANCEL_FROM_INTENT:Lcom/facebook/selfupdate/p;

    iget-boolean v2, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->p:Z

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p0, v1, v2}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;Ljava/lang/String;)V

    .line 204
    iget-boolean v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->p:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 206
    :cond_0
    iput-boolean v3, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->p:Z

    .line 207
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->r:Lcom/facebook/selfupdate/o;

    sget-object v1, Lcom/facebook/selfupdate/p;->NO_CANCEL_CHANGED_TO_FALSE:Lcom/facebook/selfupdate/p;

    invoke-virtual {v0, p0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 209
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->p:Z

    if-eqz v0, :cond_2

    .line 210
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 214
    :goto_0
    return-void

    .line 212
    :cond_2
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->q:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method private l()V
    .locals 4

    .prologue
    .line 218
    invoke-virtual {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 221
    :try_start_0
    const-class v0, Lcom/facebook/selfupdate/aj;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/selfupdate/aj;
    :try_end_0
    .catch Lcom/facebook/inject/aq; {:try_start_0 .. :try_end_0} :catch_0

    .line 227
    if-eqz v0, :cond_0

    .line 228
    invoke-virtual {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "help/122940794553357/?ref=lmupdate"

    invoke-interface {v0, v2, v3}, Lcom/facebook/selfupdate/aj;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 231
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 232
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 233
    sget v2, Lcom/facebook/i;->help_center_link:I

    invoke-virtual {p0, v2}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 234
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 235
    new-instance v3, Lcom/facebook/selfupdate/n;

    invoke-direct {v3, p0, v0, v1}, Lcom/facebook/selfupdate/n;-><init>(Lcom/facebook/selfupdate/SelfUpdateInstallActivity;Landroid/net/Uri;Lcom/facebook/inject/t;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 245
    :cond_0
    :goto_0
    return-void

    .line 222
    :catch_0
    move-exception v0

    .line 224
    iget-object v1, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->r:Lcom/facebook/selfupdate/o;

    const-string v2, "UrlHelperInterface NOT implemented"

    invoke-virtual {v1, v2, v0}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private m()Z
    .locals 3

    .prologue
    .line 248
    invoke-virtual {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/selfupdate/i;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/selfupdate/i;

    .line 249
    invoke-virtual {v0}, Lcom/facebook/selfupdate/i;->b()Z

    move-result v0

    .line 250
    if-nez v0, :cond_0

    .line 251
    iget-object v1, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->r:Lcom/facebook/selfupdate/o;

    sget-object v2, Lcom/facebook/selfupdate/p;->UNKNOWN_SOURCES_NOT_CHECKED:Lcom/facebook/selfupdate/p;

    invoke-virtual {v1, p0, v2}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 253
    :cond_0
    return v0
.end method

.method private n()Z
    .locals 2

    .prologue
    .line 257
    invoke-virtual {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/config/b/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/b/a;

    .line 258
    invoke-interface {v0}, Lcom/facebook/config/b/a;->b()I

    move-result v1

    invoke-interface {v0}, Lcom/facebook/config/b/a;->c()I

    move-result v0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 11

    .prologue
    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 46
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 48
    invoke-virtual {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->i()Lcom/facebook/inject/t;

    move-result-object v2

    .line 49
    const-class v0, Lcom/facebook/selfupdate/o;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/selfupdate/o;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->r:Lcom/facebook/selfupdate/o;

    .line 50
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->r:Lcom/facebook/selfupdate/o;

    sget-object v1, Lcom/facebook/selfupdate/p;->ON_ACTIVITY_CREATE:Lcom/facebook/selfupdate/p;

    invoke-virtual {v0, p0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 52
    invoke-virtual {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 53
    const-string v0, "local_uri"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 55
    const-class v0, Lcom/facebook/selfupdate/af;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/selfupdate/af;

    .line 56
    invoke-virtual {v0, v4}, Lcom/facebook/selfupdate/af;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 57
    invoke-virtual {v0}, Lcom/facebook/selfupdate/af;->f()V

    .line 58
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->r:Lcom/facebook/selfupdate/o;

    const-string v1, "File doesn\'t exist for SelfUpdateInstallActivity"

    invoke-virtual {v0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->finish()V

    .line 146
    :goto_0
    return-void

    .line 63
    :cond_0
    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    .line 64
    const-class v5, Lcom/facebook/common/f/f;

    invoke-virtual {v2, v5}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/f/f;

    .line 65
    sget-object v5, Lcom/facebook/common/f/g;->INTERNAL:Lcom/facebook/common/f/g;

    invoke-virtual {v2, v5}, Lcom/facebook/common/f/f;->a(Lcom/facebook/common/f/g;)J

    move-result-wide v5

    sget-object v2, Lcom/facebook/selfupdate/j;->q:Lcom/facebook/prefs/shared/ae;

    const-wide/32 v7, 0x1e00000

    invoke-interface {v1, v2, v7, v8}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v1

    cmp-long v1, v5, v1

    if-gez v1, :cond_1

    .line 69
    invoke-virtual {v0}, Lcom/facebook/selfupdate/af;->f()V

    .line 70
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->r:Lcom/facebook/selfupdate/o;

    const-string v1, "Not enough free space in internal storage for installation"

    invoke-virtual {v0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;)V

    .line 71
    invoke-virtual {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->finish()V

    goto :goto_0

    .line 75
    :cond_1
    sget v0, Lcom/facebook/k;->install_new_build:I

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->setContentView(I)V

    .line 78
    sget v0, Lcom/facebook/i;->title:I

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 79
    sget v1, Lcom/facebook/o;->install_new_build_title:I

    invoke-virtual {p0, v1}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    const-string v0, "app_name"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 83
    if-nez v0, :cond_2

    .line 84
    const-string v0, ""

    .line 86
    :cond_2
    const-string v1, "2.3"

    .line 87
    invoke-direct {p0, v4}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->b(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 88
    if-eqz v2, :cond_3

    .line 92
    iget-object v1, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 96
    :cond_3
    sget v2, Lcom/facebook/o;->install_new_build_app:I

    invoke-virtual {p0, v2}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 97
    new-array v3, v10, [Ljava/lang/Object;

    aput-object v0, v3, v9

    invoke-static {v2, v3}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 98
    sget v0, Lcom/facebook/i;->lbl_install_new_build_app:I

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 99
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    sget v0, Lcom/facebook/o;->install_new_build_version:I

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 103
    new-array v2, v10, [Ljava/lang/Object;

    aput-object v1, v2, v9

    invoke-static {v0, v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 104
    sget v0, Lcom/facebook/i;->lbl_install_new_build_version:I

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 105
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    invoke-virtual {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "release_notes"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 109
    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 110
    sget v0, Lcom/facebook/o;->install_new_build_notes_default_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 112
    :cond_4
    sget v1, Lcom/facebook/o;->install_new_build_notes_text:I

    invoke-virtual {p0, v1}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 113
    new-array v2, v10, [Ljava/lang/Object;

    aput-object v0, v2, v9

    invoke-static {v1, v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 114
    sget v0, Lcom/facebook/i;->lbl_install_new_build_notes_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 115
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    sget v0, Lcom/facebook/i;->btn_install_new_build:I

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/facebook/selfupdate/l;

    invoke-direct {v1, p0, v4}, Lcom/facebook/selfupdate/l;-><init>(Lcom/facebook/selfupdate/SelfUpdateInstallActivity;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    sget v0, Lcom/facebook/i;->btn_install_new_build_remind:I

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->q:Landroid/view/View;

    .line 134
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->q:Landroid/view/View;

    new-instance v1, Lcom/facebook/selfupdate/m;

    invoke-direct {v1, p0}, Lcom/facebook/selfupdate/m;-><init>(Lcom/facebook/selfupdate/SelfUpdateInstallActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    invoke-direct {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->l()V

    goto/16 :goto_0
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 177
    iget-boolean v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->p:Z

    if-eqz v0, :cond_0

    .line 183
    :goto_0
    return-void

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->r:Lcom/facebook/selfupdate/o;

    sget-object v1, Lcom/facebook/selfupdate/p;->BACK_BUTTON_PRESS_CANCEL:Lcom/facebook/selfupdate/p;

    invoke-virtual {v0, p0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 181
    invoke-direct {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->j()V

    .line 182
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onBackPressed()V

    goto :goto_0
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 150
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onResume()V

    .line 151
    invoke-direct {p0}, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;->k()V

    .line 152
    return-void
.end method
