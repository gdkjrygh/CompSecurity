.class public Lcom/qihoo/security/v5/UpdatedDialog;
.super Lcom/qihoo/security/dialog/AbsDialogActivity;
.source "360Security"


# instance fields
.field private c:Landroid/content/Context;

.field private d:Z

.field private e:I

.field private f:I

.field private final g:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 39
    invoke-direct {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;-><init>()V

    .line 44
    iput-boolean v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->d:Z

    .line 52
    iput v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->e:I

    .line 58
    new-instance v0, Lcom/qihoo/security/v5/UpdatedDialog$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/v5/UpdatedDialog$1;-><init>(Lcom/qihoo/security/v5/UpdatedDialog;)V

    iput-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->g:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/v5/UpdatedDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/v5/UpdatedDialog;)I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->f:I

    return v0
.end method

.method public static b(I)Z
    .locals 1

    .prologue
    .line 230
    packed-switch p0, :pswitch_data_0

    .line 238
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 233
    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    .line 230
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private c()Z
    .locals 9

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 270
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "com.android.vending"

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/o;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/b/o;->d(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 273
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    const-string/jumbo v3, "android.intent.action.VIEW"

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string/jumbo v5, "market://details?id=%s"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string/jumbo v8, "com.qihoo.security.lite"

    aput-object v8, v6, v7

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 275
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xb

    if-lt v3, v4, :cond_0

    .line 276
    const v3, 0x10008000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 280
    :goto_0
    const-string/jumbo v3, "com.android.vending"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 281
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/qihoo/security/v5/c;->a(Landroid/content/Context;)I

    .line 282
    invoke-virtual {p0, v2}, Lcom/qihoo/security/v5/UpdatedDialog;->startActivity(Landroid/content/Intent;)V

    .line 290
    :goto_1
    return v0

    .line 278
    :cond_0
    const/high16 v3, 0x10000000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 284
    :catch_0
    move-exception v0

    :cond_1
    move v0, v1

    .line 290
    goto :goto_1
.end method

.method static synthetic c(Lcom/qihoo/security/v5/UpdatedDialog;)Z
    .locals 1

    .prologue
    .line 39
    iget-boolean v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->d:Z

    return v0
.end method


# virtual methods
.method protected a()Landroid/view/View;
    .locals 1

    .prologue
    .line 265
    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 258
    iget-boolean v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->d:Z

    if-nez v0, :cond_0

    .line 259
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->finish()V

    .line 261
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 10

    .prologue
    const v6, 0x7f0c017f

    const v5, 0x7f0c0156

    const/4 v9, 0x2

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 75
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onCreate(Landroid/os/Bundle;)V

    .line 77
    sget-boolean v0, Lcom/qihoo/security/v5/UpdateHelper;->a:Z

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->finish()V

    .line 226
    :goto_0
    return-void

    .line 87
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 88
    if-nez v1, :cond_1

    .line 92
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->finish()V

    goto :goto_0

    .line 95
    :cond_1
    const-string/jumbo v0, "FromNotify"

    invoke-virtual {v1, v0, v7}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 96
    const-string/jumbo v0, "path"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 97
    if-eqz v0, :cond_2

    .line 98
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 99
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v3, "android.intent.action.VIEW"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 100
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    const-string/jumbo v3, "application/vnd.android.package-archive"

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 101
    const/high16 v2, 0x10000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 102
    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/UpdatedDialog;->startActivity(Landroid/content/Intent;)V

    .line 103
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->finish()V

    .line 105
    :cond_2
    const/16 v0, 0x6988

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 107
    :cond_3
    const-string/jumbo v0, "UPDATE_TYPE"

    invoke-virtual {v1, v0, v7}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->e:I

    .line 108
    const-string/jumbo v0, "type"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->f:I

    .line 109
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->c:Landroid/content/Context;

    .line 110
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 111
    const-string/jumbo v2, "com.qihoo.security.action.ACTION_DISMISS_UPDATED_DIALOG"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 112
    iget-object v2, p0, Lcom/qihoo/security/v5/UpdatedDialog;->g:Landroid/content/BroadcastReceiver;

    const-string/jumbo v3, "com.qihoo.security.lite.PERMISSION"

    const/4 v4, 0x0

    invoke-virtual {p0, v2, v0, v3, v4}, Lcom/qihoo/security/v5/UpdatedDialog;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 114
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 115
    const-string/jumbo v2, "com.qihoo.security.action.ACTION_SHOW_NEW_VERSION_DIALOG"

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 116
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v2, 0x1009

    invoke-virtual {v0, v2}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 119
    :cond_4
    const-string/jumbo v0, ""

    .line 120
    iget v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->e:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 122
    :pswitch_0
    const/16 v0, 0x697f

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 123
    invoke-virtual {p0, v6}, Lcom/qihoo/security/v5/UpdatedDialog;->setDialogTitle(I)V

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->b:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01bf

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 125
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdatedDialog;->b:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c01d2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 126
    new-array v2, v8, [Ljava/lang/Object;

    aput-object v1, v2, v7

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/UpdatedDialog;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 127
    new-array v0, v8, [I

    aput v5, v0, v7

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/UpdatedDialog;->setButtonText([I)V

    .line 128
    new-array v0, v8, [Landroid/view/View$OnClickListener;

    new-instance v1, Lcom/qihoo/security/v5/UpdatedDialog$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/v5/UpdatedDialog$2;-><init>(Lcom/qihoo/security/v5/UpdatedDialog;)V

    aput-object v1, v0, v7

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/UpdatedDialog;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 136
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 137
    const v1, 0x7f0c01ba

    invoke-virtual {p0, v1}, Lcom/qihoo/security/v5/UpdatedDialog;->setDialogTitle(I)V

    .line 138
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdatedDialog;->b:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0180

    new-array v3, v8, [Ljava/lang/Object;

    aput-object v0, v3, v7

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/UpdatedDialog;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 139
    new-array v0, v8, [I

    aput v5, v0, v7

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/UpdatedDialog;->setButtonText([I)V

    .line 140
    const/16 v0, 0x697a

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 141
    new-array v0, v8, [Landroid/view/View$OnClickListener;

    new-instance v1, Lcom/qihoo/security/v5/UpdatedDialog$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/v5/UpdatedDialog$3;-><init>(Lcom/qihoo/security/v5/UpdatedDialog;)V

    aput-object v1, v0, v7

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/UpdatedDialog;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 150
    :pswitch_2
    invoke-static {v1}, Lcom/qihoo/security/v5/d;->a(Landroid/os/Bundle;)Lcom/qihoo/security/v5/d;

    move-result-object v2

    .line 151
    invoke-virtual {v2}, Lcom/qihoo/security/v5/d;->a()Z

    move-result v3

    .line 152
    iget-boolean v0, v2, Lcom/qihoo/security/v5/d;->e:Z

    iput-boolean v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->d:Z

    .line 153
    iget-boolean v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->d:Z

    .line 154
    const-string/jumbo v4, "uiforce"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 155
    const-string/jumbo v0, "uiforce"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 158
    :cond_5
    iget-object v1, v2, Lcom/qihoo/security/v5/d;->d:Ljava/lang/String;

    .line 164
    iget-object v4, p0, Lcom/qihoo/security/v5/UpdatedDialog;->c:Landroid/content/Context;

    invoke-static {v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 165
    iget-object v2, v2, Lcom/qihoo/security/v5/d;->c:Ljava/lang/String;

    .line 166
    invoke-virtual {p0, v6}, Lcom/qihoo/security/v5/UpdatedDialog;->setDialogTitle(I)V

    .line 167
    iget-boolean v5, p0, Lcom/qihoo/security/v5/UpdatedDialog;->d:Z

    if-eqz v5, :cond_8

    .line 168
    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdatedDialog;->b:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c0182

    new-array v5, v8, [Ljava/lang/Object;

    aput-object v2, v5, v7

    invoke-virtual {v1, v4, v5}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {p0, v1}, Lcom/qihoo/security/v5/UpdatedDialog;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 186
    :cond_6
    new-array v1, v9, [I

    fill-array-data v1, :array_0

    invoke-virtual {p0, v1}, Lcom/qihoo/security/v5/UpdatedDialog;->setButtonText([I)V

    .line 187
    new-array v1, v9, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo/security/v5/UpdatedDialog$4;

    invoke-direct {v2, p0, v0, v3}, Lcom/qihoo/security/v5/UpdatedDialog$4;-><init>(Lcom/qihoo/security/v5/UpdatedDialog;ZZ)V

    aput-object v2, v1, v7

    new-instance v0, Lcom/qihoo/security/v5/UpdatedDialog$5;

    invoke-direct {v0, p0}, Lcom/qihoo/security/v5/UpdatedDialog$5;-><init>(Lcom/qihoo/security/v5/UpdatedDialog;)V

    aput-object v0, v1, v8

    invoke-virtual {p0, v1}, Lcom/qihoo/security/v5/UpdatedDialog;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 220
    const/16 v0, 0x6981

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0

    .line 168
    :cond_7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/qihoo/security/v5/UpdatedDialog;->b:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c0183

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 172
    :cond_8
    if-nez v1, :cond_9

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdatedDialog;->b:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c0181

    new-array v6, v9, [Ljava/lang/Object;

    aput-object v4, v6, v7

    aput-object v2, v6, v8

    invoke-virtual {v1, v5, v6}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 174
    :cond_9
    invoke-virtual {p0, v1}, Lcom/qihoo/security/v5/UpdatedDialog;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 175
    iget v1, p0, Lcom/qihoo/security/v5/UpdatedDialog;->f:I

    if-nez v1, :cond_a

    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/common/e/b;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 176
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c00c5

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    .line 177
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->finish()V

    goto/16 :goto_0

    .line 180
    :cond_a
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->c()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 181
    const/16 v0, 0x6980

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 182
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdatedDialog;->finish()V

    goto/16 :goto_0

    .line 120
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 186
    :array_0
    .array-data 4
        0x7f0c0184
        0x7f0c014f
    .end array-data
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    .line 247
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog;->g:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/UpdatedDialog;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 252
    :goto_0
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onDestroy()V

    .line 254
    return-void

    .line 248
    :catch_0
    move-exception v0

    .line 249
    const-string/jumbo v1, "V5UpdatedDialog"

    const-string/jumbo v2, "[unregisterReceiver]"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
