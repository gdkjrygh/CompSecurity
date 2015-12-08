.class public Lorg/chromium/content_public/browser/LoadUrlParams;
.super Ljava/lang/Object;
.source "LoadUrlParams.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final LOAD_TYPE_BROWSER_INITIATED_HTTP_POST:I = 0x1

.field public static final LOAD_TYPE_DATA:I = 0x2

.field public static final LOAD_TYPE_DEFAULT:I = 0x0

.field public static final UA_OVERRIDE_FALSE:I = 0x1

.field public static final UA_OVERRIDE_INHERIT:I = 0x0

.field public static final UA_OVERRIDE_TRUE:I = 0x2


# instance fields
.field mBaseUrlForDataUrl:Ljava/lang/String;

.field mCanLoadLocalResources:Z

.field private mExtraHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field mIsRendererInitiated:Z

.field mLoadUrlType:I

.field mPostData:[B

.field mReferrer:Lorg/chromium/content_public/common/Referrer;

.field mTransitionType:I

.field mUaOverrideOption:I

.field mUrl:Ljava/lang/String;

.field private mVerbatimHeaders:Ljava/lang/String;

.field mVirtualUrlForDataUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lorg/chromium/content_public/browser/LoadUrlParams;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content_public/browser/LoadUrlParams;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 58
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/chromium/content_public/browser/LoadUrlParams;-><init>(Ljava/lang/String;I)V

    .line 59
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "transitionType"    # I

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mUrl:Ljava/lang/String;

    .line 68
    iput p2, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mTransitionType:I

    .line 72
    iput v1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mLoadUrlType:I

    .line 73
    iput v1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mUaOverrideOption:I

    .line 74
    iput-object v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mPostData:[B

    .line 75
    iput-object v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mBaseUrlForDataUrl:Ljava/lang/String;

    .line 76
    iput-object v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mVirtualUrlForDataUrl:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public static createLoadDataParams(Ljava/lang/String;Ljava/lang/String;Z)Lorg/chromium/content_public/browser/LoadUrlParams;
    .locals 1
    .param p0, "data"    # Ljava/lang/String;
    .param p1, "mimeType"    # Ljava/lang/String;
    .param p2, "isBase64Encoded"    # Z

    .prologue
    .line 87
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lorg/chromium/content_public/browser/LoadUrlParams;->createLoadDataParams(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lorg/chromium/content_public/browser/LoadUrlParams;

    move-result-object v0

    return-object v0
.end method

.method public static createLoadDataParams(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lorg/chromium/content_public/browser/LoadUrlParams;
    .locals 4
    .param p0, "data"    # Ljava/lang/String;
    .param p1, "mimeType"    # Ljava/lang/String;
    .param p2, "isBase64Encoded"    # Z
    .param p3, "charset"    # Ljava/lang/String;

    .prologue
    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "data:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .local v0, "dataUrl":Ljava/lang/StringBuilder;
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 103
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ";charset="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    :cond_0
    if-eqz p2, :cond_1

    .line 106
    const-string v2, ";base64"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    :cond_1
    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    new-instance v1, Lorg/chromium/content_public/browser/LoadUrlParams;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/chromium/content_public/browser/LoadUrlParams;-><init>(Ljava/lang/String;)V

    .line 112
    .local v1, "params":Lorg/chromium/content_public/browser/LoadUrlParams;
    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lorg/chromium/content_public/browser/LoadUrlParams;->setLoadType(I)V

    .line 113
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lorg/chromium/content_public/browser/LoadUrlParams;->setTransitionType(I)V

    .line 114
    return-object v1
.end method

.method public static createLoadDataParamsWithBaseUrl(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lorg/chromium/content_public/browser/LoadUrlParams;
    .locals 6
    .param p0, "data"    # Ljava/lang/String;
    .param p1, "mimeType"    # Ljava/lang/String;
    .param p2, "isBase64Encoded"    # Z
    .param p3, "baseUrl"    # Ljava/lang/String;
    .param p4, "historyUrl"    # Ljava/lang/String;

    .prologue
    .line 133
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v5}, Lorg/chromium/content_public/browser/LoadUrlParams;->createLoadDataParamsWithBaseUrl(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/chromium/content_public/browser/LoadUrlParams;

    move-result-object v0

    return-object v0
.end method

.method public static createLoadDataParamsWithBaseUrl(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/chromium/content_public/browser/LoadUrlParams;
    .locals 3
    .param p0, "data"    # Ljava/lang/String;
    .param p1, "mimeType"    # Ljava/lang/String;
    .param p2, "isBase64Encoded"    # Z
    .param p3, "baseUrl"    # Ljava/lang/String;
    .param p4, "historyUrl"    # Ljava/lang/String;
    .param p5, "charset"    # Ljava/lang/String;

    .prologue
    .line 155
    invoke-static {p0, p1, p2, p5}, Lorg/chromium/content_public/browser/LoadUrlParams;->createLoadDataParams(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lorg/chromium/content_public/browser/LoadUrlParams;

    move-result-object v0

    .line 161
    .local v0, "params":Lorg/chromium/content_public/browser/LoadUrlParams;
    if-eqz p3, :cond_0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p3, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "data:"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 162
    :cond_0
    if-eqz p3, :cond_2

    .end local p3    # "baseUrl":Ljava/lang/String;
    :goto_0
    invoke-virtual {v0, p3}, Lorg/chromium/content_public/browser/LoadUrlParams;->setBaseUrlForDataUrl(Ljava/lang/String;)V

    .line 163
    if-eqz p4, :cond_3

    .end local p4    # "historyUrl":Ljava/lang/String;
    :goto_1
    invoke-virtual {v0, p4}, Lorg/chromium/content_public/browser/LoadUrlParams;->setVirtualUrlForDataUrl(Ljava/lang/String;)V

    .line 165
    :cond_1
    return-object v0

    .line 162
    .restart local p3    # "baseUrl":Ljava/lang/String;
    .restart local p4    # "historyUrl":Ljava/lang/String;
    :cond_2
    const-string p3, "about:blank"

    goto :goto_0

    .line 163
    .end local p3    # "baseUrl":Ljava/lang/String;
    :cond_3
    const-string p4, "about:blank"

    goto :goto_1
.end method

.method public static createLoadHttpPostParams(Ljava/lang/String;[B)Lorg/chromium/content_public/browser/LoadUrlParams;
    .locals 2
    .param p0, "url"    # Ljava/lang/String;
    .param p1, "postData"    # [B

    .prologue
    const/4 v1, 0x1

    .line 175
    new-instance v0, Lorg/chromium/content_public/browser/LoadUrlParams;

    invoke-direct {v0, p0}, Lorg/chromium/content_public/browser/LoadUrlParams;-><init>(Ljava/lang/String;)V

    .line 176
    .local v0, "params":Lorg/chromium/content_public/browser/LoadUrlParams;
    invoke-virtual {v0, v1}, Lorg/chromium/content_public/browser/LoadUrlParams;->setLoadType(I)V

    .line 177
    invoke-virtual {v0, v1}, Lorg/chromium/content_public/browser/LoadUrlParams;->setTransitionType(I)V

    .line 178
    invoke-virtual {v0, p1}, Lorg/chromium/content_public/browser/LoadUrlParams;->setPostData([B)V

    .line 179
    return-object v0
.end method

.method private getExtraHeadersString(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 5
    .param p1, "delimiter"    # Ljava/lang/String;
    .param p2, "addTerminator"    # Z

    .prologue
    .line 277
    iget-object v3, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mExtraHeaders:Ljava/util/Map;

    if-nez v3, :cond_0

    const/4 v3, 0x0

    .line 291
    :goto_0
    return-object v3

    .line 279
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 280
    .local v1, "headerBuilder":Ljava/lang/StringBuilder;
    iget-object v3, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mExtraHeaders:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 281
    .local v0, "header":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 288
    .end local v0    # "header":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_2
    if-eqz p2, :cond_3

    .line 289
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0
.end method

.method private static initializeConstants(IIIIII)V
    .locals 3
    .param p0, "loadTypeDefault"    # I
    .param p1, "loadTypeBrowserInitiatedHttpPost"    # I
    .param p2, "loadTypeData"    # I
    .param p3, "uaOverrideInherit"    # I
    .param p4, "uaOverrideFalse"    # I
    .param p5, "uaOverrideTrue"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 421
    sget-boolean v0, Lorg/chromium/content_public/browser/LoadUrlParams;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 422
    :cond_0
    sget-boolean v0, Lorg/chromium/content_public/browser/LoadUrlParams;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    if-eq v1, p1, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 423
    :cond_1
    sget-boolean v0, Lorg/chromium/content_public/browser/LoadUrlParams;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    if-eq v2, p2, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 424
    :cond_2
    sget-boolean v0, Lorg/chromium/content_public/browser/LoadUrlParams;->$assertionsDisabled:Z

    if-nez v0, :cond_3

    if-eqz p3, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 425
    :cond_3
    sget-boolean v0, Lorg/chromium/content_public/browser/LoadUrlParams;->$assertionsDisabled:Z

    if-nez v0, :cond_4

    if-eq v1, p4, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 426
    :cond_4
    sget-boolean v0, Lorg/chromium/content_public/browser/LoadUrlParams;->$assertionsDisabled:Z

    if-nez v0, :cond_5

    if-eq v2, p5, :cond_5

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 427
    :cond_5
    return-void
.end method

.method private static native nativeIsDataScheme(Ljava/lang/String;)Z
.end method


# virtual methods
.method public getBaseUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mBaseUrlForDataUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCanLoadLocalResources()Z
    .locals 1

    .prologue
    .line 382
    iget-boolean v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mCanLoadLocalResources:Z

    return v0
.end method

.method public getExtraHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 253
    iget-object v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mExtraHeaders:Ljava/util/Map;

    return-object v0
.end method

.method public getExtraHeadersString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 264
    const-string v0, "\n"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getExtraHeadersString(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getExtraHttpRequestHeadersString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 273
    const-string v0, "\r\n"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lorg/chromium/content_public/browser/LoadUrlParams;->getExtraHeadersString(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIsRendererInitiated()Z
    .locals 1

    .prologue
    .line 400
    iget-boolean v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mIsRendererInitiated:Z

    return v0
.end method

.method public getLoadUrlType()I
    .locals 1

    .prologue
    .line 386
    iget v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mLoadUrlType:I

    return v0
.end method

.method public getPostData()[B
    .locals 1

    .prologue
    .line 338
    iget-object v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mPostData:[B

    return-object v0
.end method

.method public getReferrer()Lorg/chromium/content_public/common/Referrer;
    .locals 1

    .prologue
    .line 237
    iget-object v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mReferrer:Lorg/chromium/content_public/common/Referrer;

    return-object v0
.end method

.method public getTransitionType()I
    .locals 1

    .prologue
    .line 223
    iget v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mTransitionType:I

    return v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getUserAgentOverrideOption()I
    .locals 1

    .prologue
    .line 322
    iget v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mUaOverrideOption:I

    return v0
.end method

.method public getVerbatimHeaders()Ljava/lang/String;
    .locals 1

    .prologue
    .line 306
    iget-object v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mVerbatimHeaders:Ljava/lang/String;

    return-object v0
.end method

.method public getVirtualUrlForDataUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 357
    iget-object v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mVirtualUrlForDataUrl:Ljava/lang/String;

    return-object v0
.end method

.method public isBaseUrlDataScheme()Z
    .locals 2

    .prologue
    .line 406
    iget-object v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mBaseUrlForDataUrl:Ljava/lang/String;

    if-nez v0, :cond_0

    iget v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mLoadUrlType:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 407
    const/4 v0, 0x1

    .line 409
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mBaseUrlForDataUrl:Ljava/lang/String;

    invoke-static {v0}, Lorg/chromium/content_public/browser/LoadUrlParams;->nativeIsDataScheme(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method public setBaseUrlForDataUrl(Ljava/lang/String;)V
    .locals 0
    .param p1, "baseUrl"    # Ljava/lang/String;

    .prologue
    .line 348
    iput-object p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mBaseUrlForDataUrl:Ljava/lang/String;

    .line 349
    return-void
.end method

.method public setCanLoadLocalResources(Z)V
    .locals 0
    .param p1, "canLoad"    # Z

    .prologue
    .line 374
    iput-boolean p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mCanLoadLocalResources:Z

    .line 375
    return-void
.end method

.method public setExtraHeaders(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 246
    .local p1, "extraHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    iput-object p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mExtraHeaders:Ljava/util/Map;

    .line 247
    return-void
.end method

.method public setIsRendererInitiated(Z)V
    .locals 0
    .param p1, "rendererInitiated"    # Z

    .prologue
    .line 393
    iput-boolean p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mIsRendererInitiated:Z

    .line 394
    return-void
.end method

.method public setLoadType(I)V
    .locals 0
    .param p1, "loadType"    # I

    .prologue
    .line 208
    iput p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mLoadUrlType:I

    .line 209
    return-void
.end method

.method public setOverrideUserAgent(I)V
    .locals 0
    .param p1, "uaOption"    # I

    .prologue
    .line 314
    iput p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mUaOverrideOption:I

    .line 315
    return-void
.end method

.method public setPostData([B)V
    .locals 0
    .param p1, "postData"    # [B

    .prologue
    .line 331
    iput-object p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mPostData:[B

    .line 332
    return-void
.end method

.method public setReferrer(Lorg/chromium/content_public/common/Referrer;)V
    .locals 0
    .param p1, "referrer"    # Lorg/chromium/content_public/common/Referrer;

    .prologue
    .line 230
    iput-object p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mReferrer:Lorg/chromium/content_public/common/Referrer;

    .line 231
    return-void
.end method

.method public setTransitionType(I)V
    .locals 0
    .param p1, "transitionType"    # I

    .prologue
    .line 216
    iput p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mTransitionType:I

    .line 217
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 186
    iput-object p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mUrl:Ljava/lang/String;

    .line 187
    return-void
.end method

.method public setVerbatimHeaders(Ljava/lang/String;)V
    .locals 0
    .param p1, "headers"    # Ljava/lang/String;

    .prologue
    .line 299
    iput-object p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mVerbatimHeaders:Ljava/lang/String;

    .line 300
    return-void
.end method

.method public setVirtualUrlForDataUrl(Ljava/lang/String;)V
    .locals 0
    .param p1, "virtualUrl"    # Ljava/lang/String;

    .prologue
    .line 366
    iput-object p1, p0, Lorg/chromium/content_public/browser/LoadUrlParams;->mVirtualUrlForDataUrl:Ljava/lang/String;

    .line 367
    return-void
.end method
