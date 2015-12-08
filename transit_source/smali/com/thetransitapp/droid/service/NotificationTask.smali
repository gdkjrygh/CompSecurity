.class public Lcom/thetransitapp/droid/service/NotificationTask;
.super Lcom/thetransitapp/droid/service/BaseServiceTask;
.source "NotificationTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/service/BaseServiceTask",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private client:Lorg/apache/http/impl/client/DefaultHttpClient;

.field private email:Ljava/lang/String;

.field private location:Landroid/location/Location;

.field private statURL:Ljava/lang/String;
    .annotation runtime Lroboguice/inject/InjectResource;
        value = 0x7f0a0066
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/location/Location;)V
    .locals 10
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "location"    # Landroid/location/Location;

    .prologue
    const/4 v9, 0x0

    .line 42
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;-><init>(Landroid/content/Context;)V

    .line 44
    new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    iput-object v3, p0, Lcom/thetransitapp/droid/service/NotificationTask;->client:Lorg/apache/http/impl/client/DefaultHttpClient;

    .line 45
    iput-object p2, p0, Lcom/thetransitapp/droid/service/NotificationTask;->location:Landroid/location/Location;

    .line 47
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f080018

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 49
    .local v2, "pad":I
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 50
    .local v0, "alertDialog":Landroid/app/AlertDialog;
    new-instance v1, Landroid/widget/EditText;

    invoke-direct {v1, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 51
    .local v1, "input":Landroid/widget/EditText;
    sget-object v8, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    .line 53
    .local v8, "emailPattern":Ljava/util/regex/Pattern;
    invoke-static {p1}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v3

    invoke-virtual {v3}, Landroid/accounts/AccountManager;->getAccounts()[Landroid/accounts/Account;

    move-result-object v7

    .line 54
    .local v7, "accounts":[Landroid/accounts/Account;
    array-length v4, v7

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v4, :cond_0

    .line 60
    const v3, 0x7f0a0097

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setTitle(I)V

    move v3, v2

    move v4, v2

    move v5, v2

    .line 61
    invoke-virtual/range {v0 .. v5}, Landroid/app/AlertDialog;->setView(Landroid/view/View;IIII)V

    .line 62
    const/4 v3, -0x1

    const v4, 0x7f0a002f

    invoke-virtual {p1, v4}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v9}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 64
    const/4 v3, -0x2

    const v4, 0x7f0a0030

    invoke-virtual {p1, v4}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v9}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 66
    new-instance v3, Lcom/thetransitapp/droid/service/NotificationTask$1;

    invoke-direct {v3, p0, v0, v1, v8}, Lcom/thetransitapp/droid/service/NotificationTask$1;-><init>(Lcom/thetransitapp/droid/service/NotificationTask;Landroid/app/AlertDialog;Landroid/widget/EditText;Ljava/util/regex/Pattern;)V

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 89
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 90
    return-void

    .line 54
    :cond_0
    aget-object v6, v7, v3

    .line 55
    .local v6, "account":Landroid/accounts/Account;
    iget-object v5, v6, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v8, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 56
    iget-object v5, v6, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v1, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 54
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method static synthetic access$2(Lcom/thetransitapp/droid/service/NotificationTask;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/thetransitapp/droid/service/NotificationTask;->email:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$3(Lcom/thetransitapp/droid/service/NotificationTask;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/thetransitapp/droid/service/NotificationTask;->email:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/service/NotificationTask;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 94
    new-instance v3, Lorg/apache/http/client/methods/HttpPost;

    new-instance v4, Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/thetransitapp/droid/service/NotificationTask;->statURL:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "/notification"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 95
    .local v3, "request":Lorg/apache/http/client/methods/HttpPost;
    const-string v4, "Authorization"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Basic "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getOnlineSource()Lcom/thetransitapp/droid/data/BaseOnlineSource;

    move-result-object v6

    invoke-virtual {v6}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getAuth()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const-string v4, "User-Agent"

    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getOnlineSource()Lcom/thetransitapp/droid/data/BaseOnlineSource;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getUserAgent()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    const/4 v4, 0x1

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .local v2, "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    new-instance v4, Lorg/apache/http/message/BasicNameValuePair;

    const-string v5, "email"

    iget-object v6, p0, Lcom/thetransitapp/droid/service/NotificationTask;->email:Ljava/lang/String;

    invoke-direct {v4, v5, v6}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    new-instance v4, Lorg/apache/http/message/BasicNameValuePair;

    const-string v5, "lat"

    new-instance v6, Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/thetransitapp/droid/service/NotificationTask;->location:Landroid/location/Location;

    invoke-virtual {v7}, Landroid/location/Location;->getLatitude()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    new-instance v4, Lorg/apache/http/message/BasicNameValuePair;

    const-string v5, "lng"

    new-instance v6, Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/thetransitapp/droid/service/NotificationTask;->location:Landroid/location/Location;

    invoke-virtual {v7}, Landroid/location/Location;->getLongitude()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    new-instance v4, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    invoke-direct {v4, v2}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;)V

    invoke-virtual {v3, v4}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 105
    const-string v4, "Content-Type"

    const-string v5, "application/x-www-form-urlencoded"

    invoke-virtual {v3, v4, v5}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    iget-object v4, p0, Lcom/thetransitapp/droid/service/NotificationTask;->client:Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-virtual {v4, v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v1

    .line 109
    .local v1, "httpResponse":Lorg/apache/http/HttpResponse;
    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v4

    invoke-interface {v4}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v4

    const/16 v5, 0x12c

    if-lt v4, v5, :cond_0

    .line 110
    new-instance v4, Lorg/apache/http/HttpException;

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v5

    invoke-interface {v5}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lorg/apache/http/HttpException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    .end local v1    # "httpResponse":Lorg/apache/http/HttpResponse;
    .end local v2    # "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    :catch_0
    move-exception v0

    .line 113
    .local v0, "e":Ljava/lang/Exception;
    const-class v4, Lcom/thetransitapp/droid/service/NotificationTask;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 114
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 117
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_0
    const/4 v4, 0x0

    return-object v4
.end method

.method protected onException(Ljava/lang/Exception;)V
    .locals 3
    .param p1, "e"    # Ljava/lang/Exception;

    .prologue
    .line 122
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;->onException(Ljava/lang/Exception;)V

    .line 124
    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0a0073

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 125
    .local v0, "message":Ljava/lang/String;
    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 126
    return-void
.end method

.method protected bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/service/NotificationTask;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method protected onSuccess(Ljava/lang/Void;)V
    .locals 3
    .param p1, "t"    # Ljava/lang/Void;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 130
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;->onSuccess(Ljava/lang/Object;)V

    .line 132
    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0a0098

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 133
    .local v0, "message":Ljava/lang/String;
    invoke-super {p0}, Lcom/thetransitapp/droid/service/BaseServiceTask;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 134
    return-void
.end method
