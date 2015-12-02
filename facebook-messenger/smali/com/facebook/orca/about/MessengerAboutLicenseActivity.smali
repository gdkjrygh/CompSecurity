.class public Lcom/facebook/orca/about/MessengerAboutLicenseActivity;
.super Lcom/facebook/base/activity/i;
.source "MessengerAboutLicenseActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method private c(I)Ljava/lang/String;
    .locals 4

    .prologue
    .line 38
    invoke-virtual {p0}, Lcom/facebook/orca/about/MessengerAboutLicenseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v1

    new-array v1, v1, [B

    .line 40
    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    .line 41
    new-instance v2, Ljava/lang/String;

    const-string v3, "UTF-8"

    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 42
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 44
    return-object v2
.end method


# virtual methods
.method protected b(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    .line 22
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 24
    sget v0, Lcom/facebook/k;->about_license:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/about/MessengerAboutLicenseActivity;->setContentView(I)V

    .line 26
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 29
    :try_start_0
    sget v0, Lcom/facebook/i;->wv:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/about/MessengerAboutLicenseActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    .line 30
    sget v1, Lcom/facebook/n;->orca_license:I

    invoke-direct {p0, v1}, Lcom/facebook/orca/about/MessengerAboutLicenseActivity;->c(I)Ljava/lang/String;

    move-result-object v2

    .line 31
    const/4 v1, 0x0

    const-string v3, "text/txt"

    const-string v4, "utf-8"

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    :goto_0
    return-void

    .line 32
    :catch_0
    move-exception v0

    goto :goto_0
.end method
