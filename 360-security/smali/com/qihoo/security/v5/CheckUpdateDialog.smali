.class public Lcom/qihoo/security/v5/CheckUpdateDialog;
.super Lcom/qihoo/security/dialog/AbsDialogActivity;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/v5/CheckUpdateDialog$a;
    }
.end annotation


# instance fields
.field private c:Landroid/content/Context;

.field private d:Z

.field private final e:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;-><init>()V

    .line 55
    new-instance v0, Lcom/qihoo/security/v5/CheckUpdateDialog$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/v5/CheckUpdateDialog$1;-><init>(Lcom/qihoo/security/v5/CheckUpdateDialog;)V

    iput-object v0, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->e:Landroid/content/BroadcastReceiver;

    .line 204
    return-void
.end method

.method private static a(Ljava/io/File;Ljava/io/File;)I
    .locals 5

    .prologue
    const/4 v4, 0x4

    const/4 v0, 0x0

    .line 234
    .line 235
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v0

    move-object v2, p1

    .line 239
    :goto_0
    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 248
    :cond_0
    if-le v1, v4, :cond_3

    .line 271
    :cond_1
    :goto_1
    return v0

    .line 242
    :cond_2
    if-gt v1, v4, :cond_1

    .line 245
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    .line 246
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 251
    :cond_3
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 252
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 253
    if-eqz v3, :cond_1

    .line 256
    array-length v4, v3

    move v1, v0

    :goto_2
    if-ge v1, v4, :cond_1

    aget-object v2, v3, v1

    .line 257
    invoke-static {p0, v2}, Lcom/qihoo/security/v5/CheckUpdateDialog;->a(Ljava/io/File;Ljava/io/File;)I

    move-result v2

    add-int/2addr v2, v0

    .line 256
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v2

    goto :goto_2

    .line 261
    :cond_4
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    .line 262
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 263
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const-string/jumbo v3, ".apk"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v2, v3, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const-string/jumbo v3, ".apk"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ".apk"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 266
    const/4 v0, 0x1

    goto :goto_1
.end method

.method private a(Landroid/os/Message;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 180
    iget-boolean v0, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->d:Z

    if-nez v0, :cond_1

    .line 181
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 185
    const/16 v1, 0x96

    if-lt v0, v1, :cond_0

    .line 186
    iget-object v0, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->c:Landroid/content/Context;

    const-string/jumbo v1, "key_malware_is_avc"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 187
    iput-boolean v2, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->d:Z

    .line 189
    const/16 v0, 0x36cc

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 192
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->c:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/v5/UpdateService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 193
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_CHECK_UPDATE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 194
    iget-boolean v1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->d:Z

    if-eqz v1, :cond_2

    .line 195
    const-string/jumbo v1, "type"

    const/16 v2, 0x3ea

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 199
    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 202
    :cond_1
    return-void

    .line 197
    :cond_2
    const-string/jumbo v1, "type"

    const/16 v2, 0xbb9

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/v5/CheckUpdateDialog;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->d()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/v5/CheckUpdateDialog;Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/qihoo/security/v5/CheckUpdateDialog;->a(Landroid/os/Message;)V

    return-void
.end method

.method private a(Landroid/app/Activity;Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    .line 274
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 275
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    .line 276
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledWindowTouchSlop()I

    move-result v2

    .line 277
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    .line 278
    neg-int v4, v2

    if-lt v0, v4, :cond_0

    neg-int v4, v2

    if-lt v1, v4, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v4, v2

    if-gt v0, v4, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int/2addr v0, v2

    if-le v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c()I
    .locals 1

    .prologue
    .line 41
    invoke-static {}, Lcom/qihoo/security/v5/CheckUpdateDialog;->f()I

    move-result v0

    return v0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 138
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/v5/UpdateHelper;->a:Z

    .line 139
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->c:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/v5/UpdateService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 140
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_CHECK_UPDATE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    iget-object v1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 142
    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 2

    .prologue
    .line 168
    iget-object v0, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->c:Landroid/content/Context;

    const-string/jumbo v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 169
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v0

    .line 170
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 171
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 176
    :goto_0
    return-object v0

    .line 173
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static f()I
    .locals 5

    .prologue
    .line 221
    const/4 v0, 0x0

    .line 222
    const-string/jumbo v1, "mounted"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 223
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/common/utils/Utils;->getInternalAndExternalSDPath(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v1

    .line 224
    if-eqz v1, :cond_1

    .line 225
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 226
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v4}, Lcom/qihoo/security/v5/CheckUpdateDialog;->a(Ljava/io/File;Ljava/io/File;)I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    .line 227
    goto :goto_0

    :cond_0
    move v0, v1

    .line 230
    :cond_1
    return v0
.end method


# virtual methods
.method protected a()Landroid/view/View;
    .locals 3

    .prologue
    .line 163
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300a3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 1

    .prologue
    .line 157
    const v0, 0x7f0b017e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 158
    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 159
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 131
    invoke-direct {p0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->d()V

    .line 132
    invoke-virtual {p0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->finish()V

    .line 133
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const/16 v7, 0xbb9

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 71
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onCreate(Landroid/os/Bundle;)V

    .line 72
    invoke-virtual {p0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 73
    if-nez v0, :cond_0

    .line 74
    invoke-virtual {p0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->finish()V

    .line 76
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "type"

    invoke-virtual {v0, v1, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 77
    invoke-virtual {p0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->c:Landroid/content/Context;

    .line 78
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 79
    const-string/jumbo v2, "com.qihoo.security.action.ACTION_DISMISS_CHECK_UPDATE_DIALOG"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 80
    iget-object v2, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->e:Landroid/content/BroadcastReceiver;

    const-string/jumbo v3, "com.qihoo.security.lite.PERMISSION"

    const/4 v4, 0x0

    invoke-virtual {p0, v2, v1, v3, v4}, Lcom/qihoo/security/v5/CheckUpdateDialog;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 81
    const/16 v1, 0xbba

    if-ne v0, v1, :cond_3

    .line 82
    const v1, 0x7f0c017d

    invoke-virtual {p0, v1}, Lcom/qihoo/security/v5/CheckUpdateDialog;->setDialogTitle(I)V

    .line 86
    :cond_1
    :goto_0
    const v1, 0x7f0c017e

    invoke-virtual {p0, v1}, Lcom/qihoo/security/v5/CheckUpdateDialog;->b(I)V

    .line 87
    new-array v1, v6, [I

    const v2, 0x7f0c014f

    aput v2, v1, v5

    invoke-virtual {p0, v1}, Lcom/qihoo/security/v5/CheckUpdateDialog;->setButtonText([I)V

    .line 88
    new-array v1, v6, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo/security/v5/CheckUpdateDialog$2;

    invoke-direct {v2, p0}, Lcom/qihoo/security/v5/CheckUpdateDialog$2;-><init>(Lcom/qihoo/security/v5/CheckUpdateDialog;)V

    aput-object v2, v1, v5

    invoke-virtual {p0, v1}, Lcom/qihoo/security/v5/CheckUpdateDialog;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 97
    iget-object v1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->c:Landroid/content/Context;

    const-string/jumbo v2, "key_malware_is_avc"

    invoke-static {v1, v2, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->d:Z

    .line 98
    invoke-direct {p0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->e()Ljava/lang/String;

    move-result-object v1

    .line 103
    iget-boolean v2, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->d:Z

    if-nez v2, :cond_5

    .line 104
    const-string/jumbo v2, "AT"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string/jumbo v2, "AUT"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 105
    :cond_2
    new-instance v0, Lcom/qihoo/security/v5/CheckUpdateDialog$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/v5/CheckUpdateDialog$a;-><init>(Lcom/qihoo/security/v5/CheckUpdateDialog;)V

    .line 106
    new-instance v1, Lcom/qihoo/security/v5/CheckUpdateDialog$3;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/v5/CheckUpdateDialog$3;-><init>(Lcom/qihoo/security/v5/CheckUpdateDialog;Lcom/qihoo/security/v5/CheckUpdateDialog$a;)V

    invoke-virtual {v1}, Lcom/qihoo/security/v5/CheckUpdateDialog$3;->start()V

    .line 128
    :goto_1
    return-void

    .line 83
    :cond_3
    if-ne v0, v7, :cond_1

    .line 84
    const v1, 0x7f0c01ba

    invoke-virtual {p0, v1}, Lcom/qihoo/security/v5/CheckUpdateDialog;->setDialogTitle(I)V

    goto :goto_0

    .line 115
    :cond_4
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->c:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/v5/UpdateService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 116
    const-string/jumbo v2, "com.qihoo.security.action.ACTION_CHECK_UPDATE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 117
    const-string/jumbo v2, "type"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_1

    .line 122
    :cond_5
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->c:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/v5/UpdateService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 123
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_CHECK_UPDATE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    const-string/jumbo v1, "type"

    const/16 v2, 0x3ea

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 125
    iget-object v1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_1
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 146
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/v5/CheckUpdateDialog;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    :goto_0
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onDestroy()V

    .line 154
    return-void

    .line 147
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 284
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p0, p1}, Lcom/qihoo/security/v5/CheckUpdateDialog;->a(Landroid/app/Activity;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 285
    invoke-direct {p0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->d()V

    .line 286
    invoke-virtual {p0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->finish()V

    .line 287
    const/4 v0, 0x1

    .line 289
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
