.class public Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;
.super Lcom/qihoo/security/dialog/AbsDialogActivity;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;
    }
.end annotation


# instance fields
.field protected c:Lcom/qihoo/security/ui/result/AdvData;

.field private final d:J

.field private e:Lcom/qihoo/security/widget/CommonWebView;

.field private f:Landroid/os/PowerManager$WakeLock;

.field private g:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;

.field private final h:Landroid/webkit/WebViewClient;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;-><init>()V

    .line 42
    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->d:J

    .line 54
    new-instance v0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;-><init>(Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->g:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;

    .line 148
    new-instance v0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$1;-><init>(Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->h:Landroid/webkit/WebViewClient;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;)Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->g:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 232
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->g:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;->removeMessages(I)V

    .line 233
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->g:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;->removeMessages(I)V

    .line 234
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v1, v1, Lcom/qihoo/security/ui/result/AdvData;->pkg:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/qihoo/security/support/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->finish()V

    .line 236
    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 130
    new-instance v0, Lcom/qihoo/security/widget/CommonWebView;

    invoke-direct {v0, p0}, Lcom/qihoo/security/widget/CommonWebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->e:Lcom/qihoo/security/widget/CommonWebView;

    .line 131
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->e:Lcom/qihoo/security/widget/CommonWebView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->h:Landroid/webkit/WebViewClient;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CommonWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 132
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->e:Lcom/qihoo/security/widget/CommonWebView;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/CommonWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    .line 133
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 134
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 137
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->b()Lcom/qihoo/security/dialog/DialogView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/DialogView;->a()V

    .line 139
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->b()Lcom/qihoo/security/dialog/DialogView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/DialogView;->getContentView()Landroid/widget/FrameLayout;

    move-result-object v1

    .line 140
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 141
    const/4 v2, 0x0

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 142
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 144
    const v0, 0x7f0b0079

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ProgressCircleView;

    .line 145
    const v1, 0x7f02003d

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ProgressCircleView;->setProgressBackground(I)V

    .line 146
    return-void
.end method

.method private d()V
    .locals 4

    .prologue
    .line 219
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->openUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 223
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->e()V

    .line 224
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->e:Lcom/qihoo/security/widget/CommonWebView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v1, v1, Lcom/qihoo/security/ui/result/AdvData;->openUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CommonWebView;->loadUrl(Ljava/lang/String;)V

    .line 225
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->g:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;

    const/4 v1, 0x0

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;->sendEmptyMessageDelayed(IJ)Z

    .line 229
    :goto_0
    return-void

    .line 227
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->finish()V

    goto :goto_0
.end method

.method private e()V
    .locals 1

    .prologue
    .line 252
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->f()V

    .line 253
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->f:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 254
    return-void
.end method

.method private f()V
    .locals 2

    .prologue
    .line 257
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->f:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 258
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->f:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 259
    return-void
.end method


# virtual methods
.method protected a()Landroid/view/View;
    .locals 3

    .prologue
    .line 240
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030020

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 99
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onCreate(Landroid/os/Bundle;)V

    .line 100
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "adv_data"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    .line 103
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    if-nez v0, :cond_0

    .line 104
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->finish()V

    .line 126
    :goto_0
    return-void

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->openUrl:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 107
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->pkg:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->pkg:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/qihoo/security/support/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->finish()V

    goto :goto_0

    .line 114
    :cond_2
    invoke-static {}, Lcom/qihoo/security/ui/result/a;->a()Lcom/qihoo/security/ui/result/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v1, v1, Lcom/qihoo/security/ui/result/AdvData;->openUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->openUrl:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 121
    :cond_3
    const-string/jumbo v0, "power"

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 122
    const v1, 0x2000000a

    const-string/jumbo v2, "AdvLoadingActivity"

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->f:Landroid/os/PowerManager$WakeLock;

    .line 124
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->c()V

    .line 125
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->d()V

    goto :goto_0
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 208
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onDestroy()V

    .line 209
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->g:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;->removeMessages(I)V

    .line 210
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->g:Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity$a;->removeMessages(I)V

    .line 211
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->e:Lcom/qihoo/security/widget/CommonWebView;

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->e:Lcom/qihoo/security/widget/CommonWebView;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/CommonWebView;->removeAllViews()V

    .line 213
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->e:Lcom/qihoo/security/widget/CommonWebView;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/CommonWebView;->destroy()V

    .line 214
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->e:Lcom/qihoo/security/widget/CommonWebView;

    .line 216
    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 199
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onStop()V

    .line 200
    invoke-direct {p0}, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;->f()V

    .line 201
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 245
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 246
    const/4 v0, 0x1

    .line 248
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/AbsDialogActivity;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0
.end method
