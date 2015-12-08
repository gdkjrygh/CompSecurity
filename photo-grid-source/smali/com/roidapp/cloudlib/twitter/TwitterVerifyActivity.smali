.class public Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 130
    return-void
.end method

.method public static a()Ltwitter4j/Twitter;
    .locals 4

    .prologue
    .line 54
    new-instance v0, Ltwitter4j/conf/ConfigurationBuilder;

    invoke-direct {v0}, Ltwitter4j/conf/ConfigurationBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/twitter/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ltwitter4j/conf/ConfigurationBuilder;->setOAuthConsumerKey(Ljava/lang/String;)Ltwitter4j/conf/ConfigurationBuilder;

    move-result-object v0

    sget-object v1, Lcom/roidapp/cloudlib/twitter/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ltwitter4j/conf/ConfigurationBuilder;->setOAuthConsumerSecret(Ljava/lang/String;)Ltwitter4j/conf/ConfigurationBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ltwitter4j/conf/ConfigurationBuilder;->setUseSSL(Z)Ltwitter4j/conf/ConfigurationBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ltwitter4j/conf/ConfigurationBuilder;->build()Ltwitter4j/conf/Configuration;

    move-result-object v0

    .line 60
    new-instance v1, Ltwitter4j/TwitterFactory;

    invoke-direct {v1, v0}, Ltwitter4j/TwitterFactory;-><init>(Ltwitter4j/conf/Configuration;)V

    invoke-virtual {v1}, Ltwitter4j/TwitterFactory;->getInstance()Ltwitter4j/Twitter;

    move-result-object v0

    .line 64
    const-string v1, "TwitterVerifyActivity"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "getTwitter:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/roidapp/cloudlib/twitter/a;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/roidapp/cloudlib/twitter/a;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/16 v2, 0x75

    .line 96
    new-instance v0, Ltwitter4j/conf/ConfigurationBuilder;

    invoke-direct {v0}, Ltwitter4j/conf/ConfigurationBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ltwitter4j/conf/ConfigurationBuilder;->setUseSSL(Z)Ltwitter4j/conf/ConfigurationBuilder;

    move-result-object v0

    sget-object v1, Lcom/roidapp/cloudlib/twitter/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ltwitter4j/conf/ConfigurationBuilder;->setOAuthConsumerKey(Ljava/lang/String;)Ltwitter4j/conf/ConfigurationBuilder;

    move-result-object v0

    sget-object v1, Lcom/roidapp/cloudlib/twitter/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ltwitter4j/conf/ConfigurationBuilder;->setOAuthConsumerSecret(Ljava/lang/String;)Ltwitter4j/conf/ConfigurationBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltwitter4j/conf/ConfigurationBuilder;->setOAuthAccessToken(Ljava/lang/String;)Ltwitter4j/conf/ConfigurationBuilder;

    move-result-object v0

    const-string v1, "twitter"

    invoke-virtual {v0, v1}, Ltwitter4j/conf/ConfigurationBuilder;->setMediaProvider(Ljava/lang/String;)Ltwitter4j/conf/ConfigurationBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltwitter4j/conf/ConfigurationBuilder;->setOAuthAccessTokenSecret(Ljava/lang/String;)Ltwitter4j/conf/ConfigurationBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ltwitter4j/conf/ConfigurationBuilder;->build()Ltwitter4j/conf/Configuration;

    move-result-object v0

    .line 106
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v2, :cond_0

    .line 107
    const/4 v1, 0x0

    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 110
    :cond_0
    new-instance v1, Ltwitter4j/media/ImageUploadFactory;

    invoke-direct {v1, v0}, Ltwitter4j/media/ImageUploadFactory;-><init>(Ltwitter4j/conf/Configuration;)V

    sget-object v0, Ltwitter4j/media/MediaProvider;->TWITTER:Ltwitter4j/media/MediaProvider;

    invoke-virtual {v1, v0}, Ltwitter4j/media/ImageUploadFactory;->getInstance(Ltwitter4j/media/MediaProvider;)Ltwitter4j/media/ImageUpload;

    move-result-object v0

    .line 112
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, p2}, Ltwitter4j/media/ImageUpload;->upload(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;)V
    .locals 1

    .prologue
    .line 32
    .line 2091
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->setResult(I)V

    .line 2092
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->finish()V

    .line 32
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 82
    const-string v0, "No authentication challenges found"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Received authentication challenge is null"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    :cond_0
    sget v0, Lcom/roidapp/cloudlib/at;->aZ:I

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 86
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 87
    invoke-virtual {p0, v0, v2}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 88
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 120
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 121
    if-nez p1, :cond_0

    .line 122
    if-ne p2, v0, :cond_1

    .line 123
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->setResult(I)V

    .line 126
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->finish()V

    .line 128
    :cond_0
    return-void

    .line 125
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->setResult(I)V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 38
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 39
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 40
    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 43
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->setContentView(Landroid/view/View;)V

    .line 2049
    :try_start_0
    new-instance v0, Ltwitter4j/auth/AccessToken;

    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ltwitter4j/auth/AccessToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1071
    new-instance v1, Lcom/roidapp/cloudlib/twitter/h;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/roidapp/cloudlib/twitter/h;-><init>(Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;B)V

    const/4 v2, 0x1

    new-array v2, v2, [Ltwitter4j/auth/AccessToken;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/twitter/h;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 1077
    :goto_0
    return-void

    .line 1075
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 1076
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
