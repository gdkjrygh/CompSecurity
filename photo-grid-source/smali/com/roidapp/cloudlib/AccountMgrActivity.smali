.class public Lcom/roidapp/cloudlib/AccountMgrActivity;
.super Landroid/preference/PreferenceActivity;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private f:Lcom/dropbox/client2/DropboxAPI;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/dropbox/client2/DropboxAPI",
            "<",
            "Lcom/dropbox/client2/android/AndroidAuthSession;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    .line 37
    const-string v0, "facebook"

    iput-object v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->a:Ljava/lang/String;

    .line 38
    const-string v0, "twitter"

    iput-object v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->b:Ljava/lang/String;

    .line 39
    const-string v0, "flickr"

    iput-object v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->c:Ljava/lang/String;

    .line 40
    const-string v0, "dropbox"

    iput-object v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->d:Ljava/lang/String;

    .line 41
    const-string v0, "instagram"

    iput-object v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->e:Ljava/lang/String;

    .line 137
    new-instance v0, Lcom/roidapp/cloudlib/b;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/b;-><init>(Lcom/roidapp/cloudlib/AccountMgrActivity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->h:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/AccountMgrActivity;)Lcom/dropbox/client2/DropboxAPI;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->f:Lcom/dropbox/client2/DropboxAPI;

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 158
    const-string v0, "facebook"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 159
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setChecked(Z)V

    .line 160
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 161
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 162
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setSummaryOn(Ljava/lang/CharSequence;)V

    .line 164
    :cond_0
    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 214
    const-string v0, "twitter"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 215
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->p(Landroid/content/Context;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setChecked(Z)V

    .line 216
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 217
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 218
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setSummaryOn(Ljava/lang/CharSequence;)V

    .line 220
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/AccountMgrActivity;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->d()V

    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 270
    const-string v0, "flickr"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 271
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->h(Landroid/content/Context;)Lcom/googlecode/flickrjandroid/oauth/OAuth;

    move-result-object v1

    .line 272
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getUser()Lcom/googlecode/flickrjandroid/people/User;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setChecked(Z)V

    .line 273
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 274
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 275
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setSummaryOn(Ljava/lang/CharSequence;)V

    .line 277
    :cond_0
    return-void

    .line 272
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/AccountMgrActivity;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->a()V

    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 327
    const-string v0, "dropbox"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 328
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->w(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v1

    .line 329
    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setChecked(Z)V

    .line 330
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 331
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->x(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 332
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setSummaryOn(Ljava/lang/CharSequence;)V

    .line 334
    :cond_0
    return-void

    .line 329
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/AccountMgrActivity;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->b()V

    return-void
.end method

.method private e()V
    .locals 3

    .prologue
    .line 385
    const-string v0, "instagram"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 386
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 387
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 388
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setSummaryOn(Ljava/lang/CharSequence;)V

    .line 389
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setChecked(Z)V

    .line 394
    :goto_0
    return-void

    .line 391
    :cond_0
    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setSummaryOn(Ljava/lang/CharSequence;)V

    .line 392
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setChecked(Z)V

    goto :goto_0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/AccountMgrActivity;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->c()V

    return-void
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/AccountMgrActivity;)Z
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->g:Z

    return v0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/AccountMgrActivity;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->e()V

    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 455
    invoke-super {p0, p1, p2, p3}, Landroid/preference/PreferenceActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 456
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    .line 457
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->a()V

    .line 459
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 460
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/al;->a(Landroid/app/Activity;)V

    .line 471
    :cond_0
    :goto_0
    return-void

    .line 461
    :cond_1
    const/4 v0, 0x2

    if-ne v0, p1, :cond_2

    .line 462
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->b()V

    goto :goto_0

    .line 463
    :cond_2
    const/4 v0, 0x3

    if-ne v0, p1, :cond_3

    .line 464
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->c()V

    goto :goto_0

    .line 465
    :cond_3
    const/4 v0, 0x4

    if-ne v0, p1, :cond_0

    .line 466
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->e()V

    .line 468
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 469
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/roidapp/cloudlib/al;->a(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 50
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    .line 51
    sget v0, Lcom/roidapp/cloudlib/aw;->a:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->addPreferencesFromResource(I)V

    .line 52
    sget v0, Lcom/roidapp/cloudlib/as;->c:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->setContentView(I)V

    .line 54
    invoke-static {p0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Landroid/content/Context;)Lcom/dropbox/client2/android/AndroidAuthSession;

    move-result-object v0

    .line 55
    new-instance v1, Lcom/dropbox/client2/DropboxAPI;

    invoke-direct {v1, v0}, Lcom/dropbox/client2/DropboxAPI;-><init>(Lcom/dropbox/client2/session/Session;)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->f:Lcom/dropbox/client2/DropboxAPI;

    .line 57
    const-string v0, "facebook"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 58
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/aq;->g:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->a(Landroid/graphics/drawable/Drawable;)V

    .line 59
    const-string v0, "instagram"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 60
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/aq;->y:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->a(Landroid/graphics/drawable/Drawable;)V

    .line 61
    const-string v0, "flickr"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 62
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/aq;->i:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->a(Landroid/graphics/drawable/Drawable;)V

    .line 63
    const-string v0, "dropbox"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 64
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/aq;->d:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->a(Landroid/graphics/drawable/Drawable;)V

    .line 66
    const-string v0, "twitter"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 67
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/aq;->J:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->a(Landroid/graphics/drawable/Drawable;)V

    .line 69
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1167
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->a()V

    .line 1168
    const-string v0, "facebook"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 1169
    new-instance v1, Lcom/roidapp/cloudlib/d;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/cloudlib/d;-><init>(Lcom/roidapp/cloudlib/AccountMgrActivity;Lcom/roidapp/cloudlib/IconCheckBoxPreference;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 1223
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->b()V

    .line 1224
    const-string v0, "twitter"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 1225
    new-instance v1, Lcom/roidapp/cloudlib/g;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/cloudlib/g;-><init>(Lcom/roidapp/cloudlib/AccountMgrActivity;Lcom/roidapp/cloudlib/IconCheckBoxPreference;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 1280
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->c()V

    .line 1281
    const-string v0, "flickr"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 1282
    new-instance v1, Lcom/roidapp/cloudlib/j;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/cloudlib/j;-><init>(Lcom/roidapp/cloudlib/AccountMgrActivity;Lcom/roidapp/cloudlib/IconCheckBoxPreference;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 1337
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->d()V

    .line 1338
    const-string v0, "dropbox"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 1339
    new-instance v1, Lcom/roidapp/cloudlib/m;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/cloudlib/m;-><init>(Lcom/roidapp/cloudlib/AccountMgrActivity;Lcom/roidapp/cloudlib/IconCheckBoxPreference;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 1397
    invoke-direct {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->e()V

    .line 1398
    const-string v0, "instagram"

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    .line 1399
    new-instance v1, Lcom/roidapp/cloudlib/p;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/cloudlib/p;-><init>(Lcom/roidapp/cloudlib/AccountMgrActivity;Lcom/roidapp/cloudlib/IconCheckBoxPreference;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 1442
    sget v0, Lcom/roidapp/cloudlib/ar;->cL:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1443
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<u>"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v2, Lcom/roidapp/cloudlib/at;->am:I

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/AccountMgrActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "</u>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1444
    new-instance v1, Lcom/roidapp/cloudlib/s;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/s;-><init>(Lcom/roidapp/cloudlib/AccountMgrActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    sget v0, Lcom/roidapp/cloudlib/ar;->aO:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 86
    sget v1, Lcom/roidapp/cloudlib/at;->g:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/AccountMgrActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    new-instance v1, Lcom/roidapp/cloudlib/a;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/a;-><init>(Lcom/roidapp/cloudlib/AccountMgrActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    sget v0, Lcom/roidapp/cloudlib/ar;->bb:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 96
    return-void

    .line 74
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->getPreferenceScreen()Landroid/preference/PreferenceScreen;

    move-result-object v0

    const-string v1, "facebook"

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/AccountMgrActivity;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceScreen;->removePreference(Landroid/preference/Preference;)Z

    goto/16 :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 476
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 477
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->setResult(I)V

    .line 478
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->finish()V

    .line 480
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/preference/PreferenceActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 110
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onResume()V

    .line 111
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->f:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    invoke-virtual {v0}, Lcom/dropbox/client2/android/AndroidAuthSession;->authenticationSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->g:Z

    .line 116
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->f:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    invoke-virtual {v0}, Lcom/dropbox/client2/android/AndroidAuthSession;->finishAuthentication()Ljava/lang/String;

    .line 118
    iget-object v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->f:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    invoke-virtual {v0}, Lcom/dropbox/client2/android/AndroidAuthSession;->getAccessTokenPair()Lcom/dropbox/client2/session/AccessTokenPair;

    move-result-object v1

    .line 121
    iget-object v0, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->f:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    invoke-virtual {v0}, Lcom/dropbox/client2/android/AndroidAuthSession;->isLinked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, v1, Lcom/dropbox/client2/session/AccessTokenPair;->key:Ljava/lang/String;

    iget-object v1, v1, Lcom/dropbox/client2/session/AccessTokenPair;->secret:Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lcom/roidapp/cloudlib/AccountMgrActivity;->h:Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    :cond_0
    :goto_0
    return-void

    .line 132
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    goto :goto_0
.end method
