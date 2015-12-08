.class public Lnet/coocent/android/exitwithrate/EnterAndExit;
.super Ljava/lang/Object;
.source "EnterAndExit.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# static fields
.field public static final PREFERENCE_BASE_INFO:Ljava/lang/String; = "APP_BASE_INFOS"

.field public static final PREFERENCE_KEY_RATE:Ljava/lang/String; = "APP_RATE"

.field public static final PREFERENCE_OPEN_TIMES:Ljava/lang/String; = "open_times"

.field private static isShowExitAd:Z


# instance fields
.field private dlg:Landroid/app/AlertDialog;

.field private mActivity:Landroid/app/Activity;

.field private opentimes:I

.field private v:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    sput-boolean v0, Lnet/coocent/android/exitwithrate/EnterAndExit;->isShowExitAd:Z

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3
    .param p1, "act"    # Landroid/app/Activity;

    .prologue
    const/4 v2, 0x0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    .line 35
    const-string v1, "APP_BASE_INFOS"

    .line 34
    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 36
    .local v0, "mBaseSettings":Landroid/content/SharedPreferences;
    const-string v1, "open_times"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->opentimes:I

    .line 37
    return-void
.end method

.method private createExitAdDlg(Landroid/view/View;)V
    .locals 5
    .param p1, "adView"    # Landroid/view/View;

    .prologue
    .line 97
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    iput-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->dlg:Landroid/app/AlertDialog;

    .line 98
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->dlg:Landroid/app/AlertDialog;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 99
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->dlg:Landroid/app/AlertDialog;

    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V

    .line 100
    const/4 v2, 0x1

    sput-boolean v2, Lnet/coocent/android/exitwithrate/EnterAndExit;->isShowExitAd:Z

    .line 101
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->dlg:Landroid/app/AlertDialog;

    invoke-virtual {v2}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    .line 102
    .local v1, "window":Landroid/view/Window;
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lnet/coocent/promotionsdk/R$layout;->exitad:I

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->v:Landroid/view/View;

    .line 103
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->v:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 105
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->v:Landroid/view/View;

    sget v3, Lnet/coocent/promotionsdk/R$id;->exit_adview:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 107
    .local v0, "ly":Landroid/widget/LinearLayout;
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    :goto_0
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->v:Landroid/view/View;

    sget v3, Lnet/coocent/promotionsdk/R$id;->yes:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->v:Landroid/view/View;

    sget v3, Lnet/coocent/promotionsdk/R$id;->no:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->v:Landroid/view/View;

    sget v3, Lnet/coocent/promotionsdk/R$id;->close:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {v2, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    return-void

    .line 108
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method private createRateDlg()V
    .locals 4

    .prologue
    .line 84
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    iput-object v1, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->dlg:Landroid/app/AlertDialog;

    .line 85
    iget-object v1, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->dlg:Landroid/app/AlertDialog;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 86
    iget-object v1, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->dlg:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 88
    iget-object v1, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->dlg:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 89
    .local v0, "window":Landroid/view/Window;
    iget-object v1, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lnet/coocent/promotionsdk/R$layout;->show_exit:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->v:Landroid/view/View;

    .line 90
    iget-object v1, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->v:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 92
    iget-object v1, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->v:Landroid/view/View;

    sget v2, Lnet/coocent/promotionsdk/R$id;->negativeButton:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    iget-object v1, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->v:Landroid/view/View;

    sget v2, Lnet/coocent/promotionsdk/R$id;->positiveButton:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    return-void
.end method

.method private isRate()Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 148
    iget-object v1, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    .line 149
    const-string v2, "APP_BASE_INFOS"

    .line 148
    invoke-virtual {v1, v2, v3}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 150
    .local v0, "mBaseSettings":Landroid/content/SharedPreferences;
    const-string v1, "APP_RATE"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    return v1
.end method

.method public static onDes(Landroid/app/Activity;)V
    .locals 5
    .param p0, "act"    # Landroid/app/Activity;

    .prologue
    const/4 v4, 0x0

    .line 154
    .line 155
    const-string v2, "APP_BASE_INFOS"

    .line 154
    invoke-virtual {p0, v2, v4}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 156
    .local v0, "mBaseSettings":Landroid/content/SharedPreferences;
    const-string v2, "open_times"

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 157
    .local v1, "opentimes":I
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "open_times"

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 158
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 159
    sput-boolean v4, Lnet/coocent/android/exitwithrate/EnterAndExit;->isShowExitAd:Z

    .line 160
    return-void
.end method


# virtual methods
.method public enterWithRate()V
    .locals 2

    .prologue
    .line 58
    invoke-direct {p0}, Lnet/coocent/android/exitwithrate/EnterAndExit;->isRate()Z

    move-result v0

    if-nez v0, :cond_0

    .line 59
    iget v0, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->opentimes:I

    rem-int/lit8 v0, v0, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 60
    invoke-direct {p0}, Lnet/coocent/android/exitwithrate/EnterAndExit;->createRateDlg()V

    .line 62
    :cond_0
    return-void
.end method

.method public exitWithAd(ZLandroid/view/View;)V
    .locals 1
    .param p1, "isExitAdLoad"    # Z
    .param p2, "adView"    # Landroid/view/View;

    .prologue
    .line 76
    if-eqz p1, :cond_0

    sget-boolean v0, Lnet/coocent/android/exitwithrate/EnterAndExit;->isShowExitAd:Z

    if-nez v0, :cond_0

    .line 77
    invoke-direct {p0, p2}, Lnet/coocent/android/exitwithrate/EnterAndExit;->createExitAdDlg(Landroid/view/View;)V

    .line 81
    :goto_0
    return-void

    .line 79
    :cond_0
    iget-object v0, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method

.method public exitWithRate(ZLandroid/view/View;)V
    .locals 1
    .param p1, "isExitAdLoad"    # Z
    .param p2, "adView"    # Landroid/view/View;

    .prologue
    .line 65
    invoke-direct {p0}, Lnet/coocent/android/exitwithrate/EnterAndExit;->isRate()Z

    move-result v0

    if-nez v0, :cond_1

    .line 66
    iget v0, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->opentimes:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    .line 67
    invoke-direct {p0}, Lnet/coocent/android/exitwithrate/EnterAndExit;->createRateDlg()V

    .line 73
    :goto_0
    return-void

    .line 69
    :cond_0
    invoke-virtual {p0, p1, p2}, Lnet/coocent/android/exitwithrate/EnterAndExit;->exitWithAd(ZLandroid/view/View;)V

    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {p0, p1, p2}, Lnet/coocent/android/exitwithrate/EnterAndExit;->exitWithAd(ZLandroid/view/View;)V

    goto :goto_0
.end method

.method public full(Z)V
    .locals 4
    .param p1, "enable"    # Z

    .prologue
    const/16 v3, 0x200

    .line 40
    if-eqz p1, :cond_0

    .line 41
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 42
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    .line 43
    .local v1, "lp":Landroid/view/WindowManager$LayoutParams;
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 v2, v2, 0x400

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 44
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 45
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/Window;->addFlags(I)V

    .line 55
    .end local v1    # "lp":Landroid/view/WindowManager$LayoutParams;
    :goto_0
    return-void

    .line 48
    :cond_0
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 49
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 50
    .local v0, "attr":Landroid/view/WindowManager$LayoutParams;
    iget v2, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v2, v2, -0x401

    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 51
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 52
    iget-object v2, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/Window;->clearFlags(I)V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 118
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    sget v5, Lnet/coocent/promotionsdk/R$id;->negativeButton:I

    if-ne v4, v5, :cond_1

    .line 119
    iget-object v4, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->dlg:Landroid/app/AlertDialog;

    invoke-virtual {v4}, Landroid/app/AlertDialog;->cancel()V

    .line 120
    iget-object v4, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->finish()V

    .line 145
    :cond_0
    :goto_0
    return-void

    .line 121
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    sget v5, Lnet/coocent/promotionsdk/R$id;->positiveButton:I

    if-ne v4, v5, :cond_2

    .line 122
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "market://details?id="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    iget-object v5, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 122
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 125
    .local v3, "uri":Landroid/net/Uri;
    :try_start_0
    iget-object v4, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 126
    const-string v5, "com.android.vending"

    invoke-virtual {v4, v5}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    .line 127
    const-string v5, "android.intent.action.VIEW"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 128
    .local v1, "intent":Landroid/content/Intent;
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 129
    iget-object v4, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v4, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    :goto_1
    iget-object v4, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    .line 136
    const-string v5, "APP_BASE_INFOS"

    const/4 v6, 0x0

    .line 135
    invoke-virtual {v4, v5, v6}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 137
    .local v2, "mBaseSettings":Landroid/content/SharedPreferences;
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    const-string v5, "APP_RATE"

    const/4 v6, 0x1

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 138
    iget-object v4, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->dlg:Landroid/app/AlertDialog;

    invoke-virtual {v4}, Landroid/app/AlertDialog;->cancel()V

    goto :goto_0

    .line 130
    .end local v1    # "intent":Landroid/content/Intent;
    .end local v2    # "mBaseSettings":Landroid/content/SharedPreferences;
    :catch_0
    move-exception v0

    .line 131
    .local v0, "e":Ljava/lang/Exception;
    new-instance v1, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v1, v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 132
    .restart local v1    # "intent":Landroid/content/Intent;
    iget-object v4, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v4, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 139
    .end local v0    # "e":Ljava/lang/Exception;
    .end local v1    # "intent":Landroid/content/Intent;
    .end local v3    # "uri":Landroid/net/Uri;
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    sget v5, Lnet/coocent/promotionsdk/R$id;->yes:I

    if-ne v4, v5, :cond_3

    .line 140
    iget-object v4, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->dlg:Landroid/app/AlertDialog;

    invoke-virtual {v4}, Landroid/app/AlertDialog;->dismiss()V

    .line 141
    iget-object v4, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->mActivity:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 142
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    sget v5, Lnet/coocent/promotionsdk/R$id;->no:I

    if-eq v4, v5, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    sget v5, Lnet/coocent/promotionsdk/R$id;->close:I

    if-ne v4, v5, :cond_0

    .line 143
    :cond_4
    iget-object v4, p0, Lnet/coocent/android/exitwithrate/EnterAndExit;->dlg:Landroid/app/AlertDialog;

    invoke-virtual {v4}, Landroid/app/AlertDialog;->dismiss()V

    goto/16 :goto_0
.end method
