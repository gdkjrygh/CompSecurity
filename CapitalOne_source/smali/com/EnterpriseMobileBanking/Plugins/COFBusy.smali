.class public Lcom/EnterpriseMobileBanking/Plugins/COFBusy;
.super Ljava/lang/Object;
.source "COFBusy.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "COFBusy"


# instance fields
.field private bCanceled:Z

.field private hideTask:Ljava/lang/Runnable;

.field private mActivity:Landroid/app/Activity;

.field private mCancelButton:Landroid/widget/ImageButton;

.field private mCancelCallback:Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;

.field private mCancelTimeoutSecs:I

.field private mCancelable:Z

.field private mCurrentView:Landroid/view/View;

.field private mDisableHWBackButton:Z

.field private mShowOnCreate:Z

.field private mTextMsg:Ljava/lang/String;

.field private showCancel:Ljava/lang/Runnable;

.field private spinner:Landroid/app/AlertDialog;

.field private txt:Landroid/widget/TextView;

.field private waitingToHide:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/View;Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;Z)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "v"    # Landroid/view/View;
    .param p3, "args"    # Lorg/json/JSONArray;
    .param p4, "cancelCallback"    # Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;
    .param p5, "show"    # Z

    .prologue
    const/4 v1, 0x0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    .line 27
    iput-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->waitingToHide:Z

    .line 51
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$1;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$1;-><init>(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->hideTask:Ljava/lang/Runnable;

    .line 245
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$9;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$9;-><init>(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->showCancel:Ljava/lang/Runnable;

    .line 60
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mActivity:Landroid/app/Activity;

    .line 61
    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCurrentView:Landroid/view/View;

    .line 62
    iput-boolean p5, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mShowOnCreate:Z

    .line 63
    iput-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->bCanceled:Z

    .line 64
    iput-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mDisableHWBackButton:Z

    .line 65
    invoke-direct {p0, p3}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->parseOptions(Lorg/json/JSONArray;)V

    .line 67
    iput-object p4, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelCallback:Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;

    .line 69
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->buildSpinner()V

    .line 70
    return-void
.end method

.method private _buildSpinner()V
    .locals 8

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 95
    const-string v3, "COFBusy"

    const-string v6, "Building Spinner"

    invoke-static {v3, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    iput-boolean v5, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->bCanceled:Z

    .line 100
    :try_start_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mActivity:Landroid/app/Activity;

    invoke-direct {v0, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 102
    .local v0, "builder":Landroid/app/AlertDialog$Builder;
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mActivity:Landroid/app/Activity;

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v6, 0x7f030008

    const/4 v7, 0x0

    invoke-virtual {v3, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    .line 103
    .local v2, "progressView":Landroid/widget/RelativeLayout;
    const v3, 0x7f080059

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->txt:Landroid/widget/TextView;

    .line 104
    const v3, 0x7f08005a

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageButton;

    iput-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelButton:Landroid/widget/ImageButton;

    .line 105
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelButton:Landroid/widget/ImageButton;

    const/4 v6, 0x4

    invoke-virtual {v3, v6}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 106
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->txt:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mTextMsg:Ljava/lang/String;

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 108
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v3

    iput-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    .line 109
    iget-object v6, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    iget-boolean v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mDisableHWBackButton:Z

    if-nez v3, :cond_2

    move v3, v4

    :goto_0
    invoke-virtual {v6, v3}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 110
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 111
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->requestWindowFeature(I)Z

    .line 113
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    new-instance v4, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$3;

    invoke-direct {v4, p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$3;-><init>(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 123
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelButton:Landroid/widget/ImageButton;

    new-instance v4, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$4;

    invoke-direct {v4, p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$4;-><init>(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V

    invoke-virtual {v3, v4}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 136
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    new-instance v4, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$5;

    invoke-direct {v4, p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$5;-><init>(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 143
    iget-boolean v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mShowOnCreate:Z

    if-eqz v3, :cond_0

    .line 144
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    invoke-virtual {v3}, Landroid/app/AlertDialog;->show()V

    .line 148
    :cond_0
    iget-boolean v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelable:Z

    if-eqz v3, :cond_1

    .line 149
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCurrentView:Landroid/view/View;

    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->showCancel:Ljava/lang/Runnable;

    iget v5, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelTimeoutSecs:I

    mul-int/lit16 v5, v5, 0x3e8

    int-to-long v6, v5

    invoke-virtual {v3, v4, v6, v7}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 151
    :cond_1
    const-string v3, "COFBusy"

    const-string v4, "Built Spinner"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    .end local v0    # "builder":Landroid/app/AlertDialog$Builder;
    .end local v2    # "progressView":Landroid/widget/RelativeLayout;
    :goto_1
    return-void

    .restart local v0    # "builder":Landroid/app/AlertDialog$Builder;
    .restart local v2    # "progressView":Landroid/widget/RelativeLayout;
    :cond_2
    move v3, v5

    .line 109
    goto :goto_0

    .line 152
    .end local v0    # "builder":Landroid/app/AlertDialog$Builder;
    .end local v2    # "progressView":Landroid/widget/RelativeLayout;
    :catch_0
    move-exception v1

    .line 153
    .local v1, "e":Ljava/lang/Exception;
    const-string v3, "COFBusy"

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method private _show()V
    .locals 2

    .prologue
    .line 218
    const-string v0, "COFBusy"

    const-string v1, "_show()"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCurrentView:Landroid/view/View;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->hideTask:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 220
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCurrentView:Landroid/view/View;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->showCancel:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 221
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->waitingToHide:Z

    .line 223
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mActivity:Landroid/app/Activity;

    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;

    invoke-direct {v1, p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$8;-><init>(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 242
    invoke-static {}, Ljava/lang/Thread;->yield()V

    .line 243
    return-void
.end method

.method static synthetic access$000(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->_buildSpinner()V

    return-void
.end method

.method static synthetic access$100(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Z
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .prologue
    .line 22
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->bCanceled:Z

    return v0
.end method

.method static synthetic access$1000(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Landroid/view/View;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .prologue
    .line 22
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCurrentView:Landroid/view/View;

    return-object v0
.end method

.method static synthetic access$102(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;
    .param p1, "x1"    # Z

    .prologue
    .line 22
    iput-boolean p1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->bCanceled:Z

    return p1
.end method

.method static synthetic access$200(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .prologue
    .line 22
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelCallback:Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;

    return-object v0
.end method

.method static synthetic access$300(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Landroid/app/AlertDialog;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .prologue
    .line 22
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic access$400(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Landroid/widget/ImageButton;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .prologue
    .line 22
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelButton:Landroid/widget/ImageButton;

    return-object v0
.end method

.method static synthetic access$500(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->updateSpinner()V

    return-void
.end method

.method static synthetic access$600(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->reset()V

    return-void
.end method

.method static synthetic access$700(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Z
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .prologue
    .line 22
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelable:Z

    return v0
.end method

.method static synthetic access$800(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)Ljava/lang/Runnable;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .prologue
    .line 22
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->showCancel:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic access$900(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)I
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/COFBusy;

    .prologue
    .line 22
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelTimeoutSecs:I

    return v0
.end method

.method private buildSpinner()V
    .locals 2

    .prologue
    .line 80
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    if-nez v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mActivity:Landroid/app/Activity;

    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$2;

    invoke-direct {v1, p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$2;-><init>(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 92
    :cond_0
    return-void
.end method

.method private parseOptions(Lorg/json/JSONArray;)V
    .locals 4
    .param p1, "args"    # Lorg/json/JSONArray;

    .prologue
    .line 187
    :try_start_0
    const-string v1, "COFBusy"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Parse args..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mTextMsg:Ljava/lang/String;

    .line 189
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getBoolean(I)Z

    move-result v1

    iput-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelable:Z

    .line 190
    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v1

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelTimeoutSecs:I

    .line 191
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    const/4 v2, 0x4

    if-lt v1, v2, :cond_0

    .line 192
    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getBoolean(I)Z

    move-result v1

    iput-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mDisableHWBackButton:Z

    .line 194
    :cond_0
    const-string v1, "COFBusy"

    const-string v2, "end Parse args..."

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    :goto_0
    return-void

    .line 196
    :catch_0
    move-exception v0

    .line 198
    .local v0, "e1":Lorg/json/JSONException;
    const-string v1, "COFBusy"

    const-string v2, "parseOptions() : Missing arguments."

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private reset()V
    .locals 1

    .prologue
    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    .line 74
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->bCanceled:Z

    .line 75
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->buildSpinner()V

    .line 76
    return-void
.end method

.method private updateSpinner()V
    .locals 4

    .prologue
    .line 256
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->txt:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mTextMsg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelable:Z

    if-eqz v0, :cond_1

    .line 259
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCurrentView:Landroid/view/View;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->showCancel:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 260
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCurrentView:Landroid/view/View;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->showCancel:Ljava/lang/Runnable;

    iget v2, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelTimeoutSecs:I

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 264
    :goto_0
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mDisableHWBackButton:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 266
    :cond_0
    return-void

    .line 262
    :cond_1
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCurrentView:Landroid/view/View;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->showCancel:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 264
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method


# virtual methods
.method public declared-synchronized forceHide()V
    .locals 2

    .prologue
    .line 170
    monitor-enter p0

    :try_start_0
    const-string v0, "COFBusy"

    const-string v1, "forceHide"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mActivity:Landroid/app/Activity;

    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$6;

    invoke-direct {v1, p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$6;-><init>(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 179
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->waitingToHide:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    :cond_0
    monitor-exit p0

    return-void

    .line 170
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized hide()V
    .locals 4

    .prologue
    .line 162
    monitor-enter p0

    :try_start_0
    const-string v0, "COFBusy"

    const-string v1, "hide called"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->waitingToHide:Z

    if-nez v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCurrentView:Landroid/view/View;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->hideTask:Ljava/lang/Runnable;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 165
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->waitingToHide:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    :cond_0
    monitor-exit p0

    return-void

    .line 162
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isVisible()Z
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->spinner:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    return v0
.end method

.method public declared-synchronized show(Lorg/json/JSONArray;Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;)V
    .locals 2
    .param p1, "args"    # Lorg/json/JSONArray;
    .param p2, "cb"    # Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;

    .prologue
    .line 204
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->parseOptions(Lorg/json/JSONArray;)V

    .line 206
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mActivity:Landroid/app/Activity;

    new-instance v1, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$7;

    invoke-direct {v1, p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy$7;-><init>(Lcom/EnterpriseMobileBanking/Plugins/COFBusy;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 213
    iput-object p2, p0, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->mCancelCallback:Lcom/EnterpriseMobileBanking/Plugins/BusyIndicatorCallback;

    .line 214
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/Plugins/COFBusy;->_show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    monitor-exit p0

    return-void

    .line 204
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
