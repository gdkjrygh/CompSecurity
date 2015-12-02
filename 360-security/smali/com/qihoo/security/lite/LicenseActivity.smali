.class public Lcom/qihoo/security/lite/LicenseActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# instance fields
.field private A:Z

.field private B:Landroid/view/View;

.field private C:Landroid/view/View;

.field private D:Landroid/view/View;

.field private E:Landroid/widget/CheckBox;

.field private F:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private G:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private H:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private I:Z

.field private J:Landroid/webkit/WebView;

.field private K:Landroid/webkit/WebView;

.field private final L:Landroid/os/Handler;

.field private y:Landroid/content/Context;

.field private z:Landroid/content/Intent;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 34
    iput-boolean v1, p0, Lcom/qihoo/security/lite/LicenseActivity;->A:Z

    .line 35
    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->C:Landroid/view/View;

    .line 36
    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->D:Landroid/view/View;

    .line 37
    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->E:Landroid/widget/CheckBox;

    .line 41
    iput-boolean v1, p0, Lcom/qihoo/security/lite/LicenseActivity;->I:Z

    .line 44
    new-instance v0, Lcom/qihoo/security/lite/LicenseActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/lite/LicenseActivity$1;-><init>(Lcom/qihoo/security/lite/LicenseActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->L:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->D:Landroid/view/View;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/lite/LicenseActivity;Z)Z
    .locals 0

    .prologue
    .line 29
    iput-boolean p1, p0, Lcom/qihoo/security/lite/LicenseActivity;->I:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->J:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/lite/LicenseActivity;Z)Z
    .locals 0

    .prologue
    .line 29
    iput-boolean p1, p0, Lcom/qihoo/security/lite/LicenseActivity;->A:Z

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/lite/LicenseActivity;)Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->I:Z

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->B:Landroid/view/View;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->C:Landroid/view/View;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->L:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/widget/CheckBox;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->E:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->y:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public onBackPressed()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 170
    iget-boolean v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->A:Z

    if-eqz v0, :cond_0

    .line 171
    iput-boolean v1, p0, Lcom/qihoo/security/lite/LicenseActivity;->A:Z

    .line 172
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->B:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 173
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->C:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 177
    :goto_0
    return-void

    .line 175
    :cond_0
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onBackPressed()V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 61
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 63
    const v0, 0x7f03006f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/LicenseActivity;->setContentView(I)V

    .line 65
    invoke-virtual {p0}, Lcom/qihoo/security/lite/LicenseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->y:Landroid/content/Context;

    .line 66
    invoke-virtual {p0}, Lcom/qihoo/security/lite/LicenseActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->z:Landroid/content/Intent;

    .line 67
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->z:Landroid/content/Intent;

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->z:Landroid/content/Intent;

    .line 69
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->z:Landroid/content/Intent;

    const/high16 v1, 0x20000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 71
    :cond_0
    const v0, 0x7f0b0108

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/LicenseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->D:Landroid/view/View;

    .line 72
    const v0, 0x7f0b0178

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/LicenseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->E:Landroid/widget/CheckBox;

    .line 73
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->E:Landroid/widget/CheckBox;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "user_ex"

    invoke-static {v1, v2, v6}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 75
    const v0, 0x7f0b0175

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/LicenseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->B:Landroid/view/View;

    .line 76
    const v0, 0x7f0b0177

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/LicenseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->J:Landroid/webkit/WebView;

    .line 77
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-virtual {p0}, Lcom/qihoo/security/lite/LicenseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060001

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 78
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 79
    const-string/jumbo v1, ""

    .line 81
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 82
    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 84
    :catch_0
    move-exception v0

    .line 89
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->J:Landroid/webkit/WebView;

    const-string/jumbo v1, ""

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "text/html"

    const-string/jumbo v4, "utf-8"

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const v0, 0x7f0b017c

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/LicenseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->K:Landroid/webkit/WebView;

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->K:Landroid/webkit/WebView;

    new-instance v1, Lcom/qihoo/security/lite/LicenseActivity$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/lite/LicenseActivity$2;-><init>(Lcom/qihoo/security/lite/LicenseActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 113
    const v0, 0x7f0b017b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/LicenseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->C:Landroid/view/View;

    .line 114
    const v0, 0x7f0b0176

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/LicenseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 115
    const v0, 0x7f0b0179

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/LicenseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->G:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 116
    const v0, 0x7f0b017a

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/LicenseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->H:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 117
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->G:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v1, Lcom/qihoo/security/lite/LicenseActivity$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/lite/LicenseActivity$3;-><init>(Lcom/qihoo/security/lite/LicenseActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 137
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->G:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFlags(I)V

    .line 138
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->G:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 139
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->H:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v1, Lcom/qihoo/security/lite/LicenseActivity$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/lite/LicenseActivity$4;-><init>(Lcom/qihoo/security/lite/LicenseActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 158
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 188
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 190
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->J:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->J:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 192
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->J:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 193
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->J:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->removeAllViews()V

    .line 194
    iput-object v1, p0, Lcom/qihoo/security/lite/LicenseActivity;->J:Landroid/webkit/WebView;

    .line 197
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->K:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    .line 198
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->K:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 199
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->K:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 200
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->K:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->removeAllViews()V

    .line 201
    iput-object v1, p0, Lcom/qihoo/security/lite/LicenseActivity;->K:Landroid/webkit/WebView;

    .line 203
    :cond_1
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 162
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onResume()V

    .line 163
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0158

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 164
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->G:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c01d5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 165
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity;->H:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0159

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 166
    return-void
.end method
