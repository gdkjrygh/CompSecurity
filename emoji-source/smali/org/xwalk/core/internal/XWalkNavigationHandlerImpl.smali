.class public Lorg/xwalk/core/internal/XWalkNavigationHandlerImpl;
.super Ljava/lang/Object;
.source "XWalkNavigationHandlerImpl.java"

# interfaces
.implements Lorg/xwalk/core/internal/XWalkNavigationHandler;


# static fields
.field private static final ACTION_GEO_PREFIX:Ljava/lang/String; = "geo:"

.field private static final ACTION_MAIL_PREFIX:Ljava/lang/String; = "mailto:"

.field private static final ACTION_MARKET_PREFIX:Ljava/lang/String; = "market:"

.field private static final ACTION_SMS_PREFIX:Ljava/lang/String; = "sms:"

.field private static final ACTION_TEL_PREFIX:Ljava/lang/String; = "tel:"

.field private static final PROTOCOL_WTAI_MC_PREFIX:Ljava/lang/String; = "wtai://wp/mc;"

.field private static final PROTOCOL_WTAI_PREFIX:Ljava/lang/String; = "wtai://"

.field private static final TAG:Ljava/lang/String; = "XWalkNavigationHandlerImpl"


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkNavigationHandlerImpl;->mContext:Landroid/content/Context;

    .line 40
    return-void
.end method

.method private createIntentForActionUri(Ljava/lang/String;)Landroid/content/Intent;
    .locals 7
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x4

    .line 82
    const/4 v1, 0x0

    .line 83
    .local v1, "intent":Landroid/content/Intent;
    const-string v5, "tel:"

    invoke-virtual {p1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 85
    new-instance v1, Landroid/content/Intent;

    .end local v1    # "intent":Landroid/content/Intent;
    const-string v5, "android.intent.action.DIAL"

    invoke-direct {v1, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 86
    .restart local v1    # "intent":Landroid/content/Intent;
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 124
    :cond_0
    :goto_0
    return-object v1

    .line 87
    :cond_1
    const-string v5, "geo:"

    invoke-virtual {p1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 89
    new-instance v1, Landroid/content/Intent;

    .end local v1    # "intent":Landroid/content/Intent;
    const-string v5, "android.intent.action.VIEW"

    invoke-direct {v1, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 90
    .restart local v1    # "intent":Landroid/content/Intent;
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    goto :goto_0

    .line 91
    :cond_2
    const-string v5, "mailto:"

    invoke-virtual {p1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 93
    new-instance v1, Landroid/content/Intent;

    .end local v1    # "intent":Landroid/content/Intent;
    const-string v5, "android.intent.action.VIEW"

    invoke-direct {v1, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 94
    .restart local v1    # "intent":Landroid/content/Intent;
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    goto :goto_0

    .line 95
    :cond_3
    const-string v5, "sms:"

    invoke-virtual {p1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 97
    new-instance v1, Landroid/content/Intent;

    .end local v1    # "intent":Landroid/content/Intent;
    const-string v5, "android.intent.action.VIEW"

    invoke-direct {v1, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 100
    .restart local v1    # "intent":Landroid/content/Intent;
    const/4 v0, 0x0

    .line 101
    .local v0, "address":Ljava/lang/String;
    const/16 v5, 0x3f

    invoke-virtual {p1, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 102
    .local v2, "parmIndex":I
    const/4 v5, -0x1

    if-ne v2, v5, :cond_5

    .line 103
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 116
    :cond_4
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "sms:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 117
    const-string v5, "address"

    invoke-virtual {v1, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 118
    const-string v5, "vnd.android-dir/mms-sms"

    invoke-virtual {v1, v5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 105
    :cond_5
    invoke-virtual {p1, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 108
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 109
    .local v4, "uri":Landroid/net/Uri;
    invoke-virtual {v4}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v3

    .line 110
    .local v3, "query":Ljava/lang/String;
    if-eqz v3, :cond_4

    .line 111
    const-string v5, "body="

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 112
    const-string v5, "sms_body"

    const/4 v6, 0x5

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    .line 119
    .end local v0    # "address":Ljava/lang/String;
    .end local v2    # "parmIndex":I
    .end local v3    # "query":Ljava/lang/String;
    .end local v4    # "uri":Landroid/net/Uri;
    :cond_6
    const-string v5, "market:"

    invoke-virtual {p1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 121
    new-instance v1, Landroid/content/Intent;

    .end local v1    # "intent":Landroid/content/Intent;
    const-string v5, "android.intent.action.VIEW"

    invoke-direct {v1, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 122
    .restart local v1    # "intent":Landroid/content/Intent;
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    goto/16 :goto_0
.end method

.method private createIntentForWTAI(Ljava/lang/String;)Landroid/content/Intent;
    .locals 5
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 71
    const/4 v0, 0x0

    .line 72
    .local v0, "intent":Landroid/content/Intent;
    const-string v3, "wtai://wp/mc;"

    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 73
    const-string v3, "wtai://wp/mc;"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 74
    .local v2, "number":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "tel:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 75
    .local v1, "mcUrl":Ljava/lang/String;
    new-instance v0, Landroid/content/Intent;

    .end local v0    # "intent":Landroid/content/Intent;
    const-string v3, "android.intent.action.DIAL"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 76
    .restart local v0    # "intent":Landroid/content/Intent;
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 78
    .end local v1    # "mcUrl":Ljava/lang/String;
    .end local v2    # "number":Ljava/lang/String;
    :cond_0
    return-object v0
.end method

.method private handleUrlByMimeType(Ljava/lang/String;)Z
    .locals 5
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 128
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v1

    .line 129
    .local v1, "map":Landroid/webkit/MimeTypeMap;
    invoke-static {p1}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 130
    .local v0, "extenstion":Ljava/lang/String;
    invoke-virtual {v1, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 132
    .local v2, "mimeType":Ljava/lang/String;
    invoke-direct {p0, v2}, Lorg/xwalk/core/internal/XWalkNavigationHandlerImpl;->shouldHandleMimeType(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 133
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 134
    .local v3, "sendIntent":Landroid/content/Intent;
    const-string v4, "android.intent.action.VIEW"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 135
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 137
    iget-object v4, p0, Lorg/xwalk/core/internal/XWalkNavigationHandlerImpl;->mContext:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 138
    invoke-virtual {p0, v3}, Lorg/xwalk/core/internal/XWalkNavigationHandlerImpl;->startActivity(Landroid/content/Intent;)Z

    .line 139
    const/4 v4, 0x1

    .line 142
    .end local v3    # "sendIntent":Landroid/content/Intent;
    :goto_0
    return v4

    :cond_0
    const/4 v4, 0x0

    goto :goto_0
.end method

.method private shouldHandleMimeType(Ljava/lang/String;)Z
    .locals 1
    .param p1, "mimeType"    # Ljava/lang/String;

    .prologue
    .line 149
    if-eqz p1, :cond_0

    const-string v0, "application/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    const/4 v0, 0x1

    .line 152
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public handleNavigation(Lorg/chromium/components/navigation_interception/NavigationParams;)Z
    .locals 3
    .param p1, "params"    # Lorg/chromium/components/navigation_interception/NavigationParams;

    .prologue
    .line 44
    iget-object v1, p1, Lorg/chromium/components/navigation_interception/NavigationParams;->url:Ljava/lang/String;

    .line 45
    .local v1, "url":Ljava/lang/String;
    const/4 v0, 0x0

    .line 46
    .local v0, "intent":Landroid/content/Intent;
    const-string v2, "wtai://"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 47
    invoke-direct {p0, v1}, Lorg/xwalk/core/internal/XWalkNavigationHandlerImpl;->createIntentForWTAI(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 51
    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/XWalkNavigationHandlerImpl;->startActivity(Landroid/content/Intent;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    .line 53
    :goto_1
    return v2

    .line 49
    :cond_0
    invoke-direct {p0, v1}, Lorg/xwalk/core/internal/XWalkNavigationHandlerImpl;->createIntentForActionUri(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    goto :goto_0

    .line 53
    :cond_1
    invoke-direct {p0, v1}, Lorg/xwalk/core/internal/XWalkNavigationHandlerImpl;->handleUrlByMimeType(Ljava/lang/String;)Z

    move-result v2

    goto :goto_1
.end method

.method protected startActivity(Landroid/content/Intent;)Z
    .locals 4
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v1, 0x0

    .line 58
    :try_start_0
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkNavigationHandlerImpl;->mContext:Landroid/content/Context;

    instance-of v2, v2, Landroid/app/Activity;

    if-nez v2, :cond_0

    .line 59
    const/high16 v2, 0x10000000

    invoke-virtual {p1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 61
    :cond_0
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkNavigationHandlerImpl;->mContext:Landroid/content/Context;

    invoke-virtual {v2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    const/4 v1, 0x1

    :goto_0
    return v1

    .line 62
    :catch_0
    move-exception v0

    .line 63
    .local v0, "exception":Landroid/content/ActivityNotFoundException;
    const-string v2, "XWalkNavigationHandlerImpl"

    const-string v3, "Activity not found for Intent:"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    const-string v2, "XWalkNavigationHandlerImpl"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
