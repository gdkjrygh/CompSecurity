.class public Lorg/chromium/content/browser/accessibility/AccessibilityInjector;
.super Lorg/chromium/content/browser/WebContentsObserverAndroid;
.source "AccessibilityInjector.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;,
        Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;
    }
.end annotation


# static fields
.field private static final ACCESSIBILITY_SCREEN_READER_JAVASCRIPT_TEMPLATE:Ljava/lang/String; = "(function() {    var chooser = document.createElement(\'script\');    chooser.type = \'text/javascript\';    chooser.src = \'%1s\';    document.getElementsByTagName(\'head\')[0].appendChild(chooser);  })();"

.field private static final ACCESSIBILITY_SCRIPT_INJECTION_OPTED_OUT:I = 0x0

.field private static final ACCESSIBILITY_SCRIPT_INJECTION_PROVIDED:I = 0x1

.field private static final ACCESSIBILITY_SCRIPT_INJECTION_UNDEFINED:I = -0x1

.field private static final ALIAS_ACCESSIBILITY_JS_INTERFACE:Ljava/lang/String; = "accessibility"

.field private static final ALIAS_ACCESSIBILITY_JS_INTERFACE_2:Ljava/lang/String; = "accessibility2"

.field private static final DEFAULT_ACCESSIBILITY_SCREEN_READER_URL:Ljava/lang/String; = "https://ssl.gstatic.com/accessibility/javascript/android/chromeandroidvox.js"

.field private static final FEEDBACK_BRAILLE:I = 0x20

.field private static final TAG:Ljava/lang/String; = "AccessibilityInjector"

.field private static final TOGGLE_CHROME_VOX_JAVASCRIPT:Ljava/lang/String; = "(function() {    if (typeof cvox !== \'undefined\') {        cvox.ChromeVox.host.activateOrDeactivateChromeVox(%1s);    }  })();"


# instance fields
.field private mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;

.field private final mAccessibilityScreenReaderUrl:Ljava/lang/String;

.field protected mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

.field private final mHasVibratePermission:Z

.field protected mInjectedScriptEnabled:Z

.field protected mScriptInjected:Z

.field private mTextToSpeech:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;

.field private mVibrator:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;


# direct methods
.method protected constructor <init>(Lorg/chromium/content/browser/ContentViewCore;)V
    .locals 3
    .param p1, "view"    # Lorg/chromium/content/browser/ContentViewCore;

    .prologue
    .line 110
    invoke-virtual {p1}, Lorg/chromium/content/browser/ContentViewCore;->getWebContents()Lorg/chromium/content_public/browser/WebContents;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/chromium/content/browser/WebContentsObserverAndroid;-><init>(Lorg/chromium/content_public/browser/WebContents;)V

    .line 111
    iput-object p1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    .line 113
    invoke-static {}, Lorg/chromium/base/CommandLine;->getInstance()Lorg/chromium/base/CommandLine;

    move-result-object v0

    const-string v1, "accessibility-js-url"

    const-string v2, "https://ssl.gstatic.com/accessibility/javascript/android/chromeandroidvox.js"

    invoke-virtual {v0, v1, v2}, Lorg/chromium/base/CommandLine;->getSwitchValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mAccessibilityScreenReaderUrl:Ljava/lang/String;

    .line 117
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.VIBRATE"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mHasVibratePermission:Z

    .line 119
    return-void

    .line 117
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private getAccessibilityManager()Landroid/view/accessibility/AccessibilityManager;
    .locals 2

    .prologue
    .line 338
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    if-nez v0, :cond_0

    .line 339
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    .line 343
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mAccessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    return-object v0
.end method

.method private getAxsUrlParameterValue()I
    .locals 6

    .prologue
    const/4 v3, -0x1

    .line 308
    iget-object v4, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v4}, Lorg/chromium/content/browser/ContentViewCore;->getWebContents()Lorg/chromium/content_public/browser/WebContents;

    move-result-object v4

    invoke-interface {v4}, Lorg/chromium/content_public/browser/WebContents;->getUrl()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    .line 329
    :cond_0
    :goto_0
    return v3

    .line 313
    :cond_1
    :try_start_0
    new-instance v4, Ljava/net/URI;

    iget-object v5, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v5}, Lorg/chromium/content/browser/ContentViewCore;->getWebContents()Lorg/chromium/content_public/browser/WebContents;

    move-result-object v5

    invoke-interface {v5}, Lorg/chromium/content_public/browser/WebContents;->getUrl()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lorg/apache/http/client/utils/URLEncodedUtils;->parse(Ljava/net/URI;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 316
    .local v2, "params":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/http/NameValuePair;

    .line 317
    .local v1, "param":Lorg/apache/http/NameValuePair;
    const-string v4, "axs"

    invoke-interface {v1}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 318
    invoke-interface {v1}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    goto :goto_0

    .line 325
    .end local v0    # "i$":Ljava/util/Iterator;
    .end local v1    # "param":Lorg/apache/http/NameValuePair;
    .end local v2    # "params":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    :catch_0
    move-exception v4

    goto :goto_0

    .line 323
    :catch_1
    move-exception v4

    goto :goto_0

    .line 321
    :catch_2
    move-exception v4

    goto :goto_0
.end method

.method private getScreenReaderInjectingJs()Ljava/lang/String;
    .locals 4

    .prologue
    .line 333
    const-string v0, "(function() {    var chooser = document.createElement(\'script\');    chooser.type = \'text/javascript\';    chooser.src = \'%1s\';    document.getElementsByTagName(\'head\')[0].appendChild(chooser);  })();"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mAccessibilityScreenReaderUrl:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static newInstance(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/accessibility/AccessibilityInjector;
    .locals 2
    .param p0, "view"    # Lorg/chromium/content/browser/ContentViewCore;

    .prologue
    .line 98
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 99
    new-instance v0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;-><init>(Lorg/chromium/content/browser/ContentViewCore;)V

    .line 101
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector;-><init>(Lorg/chromium/content/browser/ContentViewCore;)V

    goto :goto_0
.end method


# virtual methods
.method public accessibilityIsAvailable()Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 170
    invoke-direct {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->getAccessibilityManager()Landroid/view/accessibility/AccessibilityManager;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v3}, Lorg/chromium/content/browser/ContentViewCore;->getContentSettings()Lorg/chromium/content/browser/ContentSettings;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v3}, Lorg/chromium/content/browser/ContentViewCore;->getContentSettings()Lorg/chromium/content/browser/ContentSettings;

    move-result-object v3

    invoke-virtual {v3}, Lorg/chromium/content/browser/ContentSettings;->getJavaScriptEnabled()Z

    move-result v3

    if-nez v3, :cond_1

    .line 185
    :cond_0
    :goto_0
    return v2

    .line 178
    :cond_1
    :try_start_0
    invoke-direct {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->getAccessibilityManager()Landroid/view/accessibility/AccessibilityManager;

    move-result-object v3

    const/16 v4, 0x21

    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object v1

    .line 181
    .local v1, "services":Ljava/util/List;, "Ljava/util/List<Landroid/accessibilityservice/AccessibilityServiceInfo;>;"
    invoke-interface {v1}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    if-lez v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    .line 182
    .end local v1    # "services":Ljava/util/List;, "Ljava/util/List<Landroid/accessibilityservice/AccessibilityServiceInfo;>;"
    :catch_0
    move-exception v0

    .line 185
    .local v0, "e":Ljava/lang/NullPointerException;
    goto :goto_0
.end method

.method protected addAccessibilityApis()V
    .locals 4

    .prologue
    .line 274
    iget-object v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v1}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 275
    .local v0, "context":Landroid/content/Context;
    if-eqz v0, :cond_1

    .line 277
    iget-object v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mTextToSpeech:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;

    if-nez v1, :cond_0

    .line 278
    new-instance v1, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;

    iget-object v2, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewCore;->getContainerView()Landroid/view/ViewGroup;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;-><init>(Landroid/view/View;Landroid/content/Context;)V

    iput-object v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mTextToSpeech:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;

    .line 280
    iget-object v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    iget-object v2, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mTextToSpeech:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;

    const-string v3, "accessibility"

    invoke-virtual {v1, v2, v3}, Lorg/chromium/content/browser/ContentViewCore;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    :cond_0
    iget-object v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mVibrator:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mHasVibratePermission:Z

    if-eqz v1, :cond_1

    .line 285
    new-instance v1, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;

    invoke-direct {v1, v0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mVibrator:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;

    .line 286
    iget-object v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    iget-object v2, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mVibrator:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;

    const-string v3, "accessibility2"

    invoke-virtual {v1, v2, v3}, Lorg/chromium/content/browser/ContentViewCore;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    :cond_1
    return-void
.end method

.method public addOrRemoveAccessibilityApisIfNecessary()V
    .locals 1

    .prologue
    .line 159
    invoke-virtual {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->accessibilityIsAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->addAccessibilityApis()V

    .line 164
    :goto_0
    return-void

    .line 162
    :cond_0
    invoke-virtual {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->removeAccessibilityApis()V

    goto :goto_0
.end method

.method public didStartLoading(Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 218
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mScriptInjected:Z

    .line 219
    return-void
.end method

.method public didStopLoading(Ljava/lang/String;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 223
    invoke-virtual {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->injectAccessibilityScriptIntoPage()V

    .line 224
    return-void
.end method

.method public injectAccessibilityScriptIntoPage()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 130
    invoke-virtual {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->accessibilityIsAvailable()Z

    move-result v2

    if-nez v2, :cond_1

    .line 145
    :cond_0
    :goto_0
    return-void

    .line 132
    :cond_1
    invoke-direct {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->getAxsUrlParameterValue()I

    move-result v0

    .line 133
    .local v0, "axsParameterValue":I
    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    .line 137
    invoke-direct {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->getScreenReaderInjectingJs()Ljava/lang/String;

    move-result-object v1

    .line 138
    .local v1, "js":Ljava/lang/String;
    iget-object v2, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewCore;->isDeviceAccessibilityScriptInjectionEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewCore;->isAlive()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 140
    invoke-virtual {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->addOrRemoveAccessibilityApisIfNecessary()V

    .line 141
    iget-object v2, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lorg/chromium/content/browser/ContentViewCore;->evaluateJavaScript(Ljava/lang/String;Lorg/chromium/content_public/browser/JavaScriptCallback;)V

    .line 142
    iput-boolean v4, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mInjectedScriptEnabled:Z

    .line 143
    iput-boolean v4, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mScriptInjected:Z

    goto :goto_0
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 0
    .param p1, "info"    # Landroid/view/accessibility/AccessibilityNodeInfo;

    .prologue
    .line 247
    return-void
.end method

.method public onPageLostFocus()V
    .locals 1

    .prologue
    .line 230
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 231
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mTextToSpeech:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mTextToSpeech:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;

    invoke-virtual {v0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->stop()I

    .line 232
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mVibrator:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mVibrator:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;

    invoke-virtual {v0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;->cancel()V

    .line 234
    :cond_1
    return-void
.end method

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 1
    .param p1, "action"    # I
    .param p2, "arguments"    # Landroid/os/Bundle;

    .prologue
    .line 270
    const/4 v0, 0x0

    return v0
.end method

.method protected removeAccessibilityApis()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 293
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mTextToSpeech:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;

    if-eqz v0, :cond_0

    .line 294
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/ContentViewCore;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 295
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mTextToSpeech:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;

    invoke-virtual {v0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->stop()I

    .line 296
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mTextToSpeech:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;

    invoke-virtual {v0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;->shutdownInternal()V

    .line 297
    iput-object v2, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mTextToSpeech:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$TextToSpeechWrapper;

    .line 300
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mVibrator:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;

    if-eqz v0, :cond_1

    .line 301
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    const-string v1, "accessibility2"

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/ContentViewCore;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 302
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mVibrator:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;

    invoke-virtual {v0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;->cancel()V

    .line 303
    iput-object v2, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mVibrator:Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;

    .line 305
    :cond_1
    return-void
.end method

.method public setScriptEnabled(Z)V
    .locals 5
    .param p1, "enabled"    # Z

    .prologue
    .line 195
    if-eqz p1, :cond_0

    iget-boolean v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mScriptInjected:Z

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->injectAccessibilityScriptIntoPage()V

    .line 196
    :cond_0
    invoke-virtual {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->accessibilityIsAvailable()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mInjectedScriptEnabled:Z

    if-ne v1, p1, :cond_2

    .line 209
    :cond_1
    :goto_0
    return-void

    .line 198
    :cond_2
    iput-boolean p1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mInjectedScriptEnabled:Z

    .line 199
    iget-object v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v1}, Lorg/chromium/content/browser/ContentViewCore;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 200
    const-string v1, "(function() {    if (typeof cvox !== \'undefined\') {        cvox.ChromeVox.host.activateOrDeactivateChromeVox(%1s);    }  })();"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-boolean v4, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mInjectedScriptEnabled:Z

    invoke-static {v4}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 202
    .local v0, "js":Ljava/lang/String;
    iget-object v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lorg/chromium/content/browser/ContentViewCore;->evaluateJavaScript(Ljava/lang/String;Lorg/chromium/content_public/browser/JavaScriptCallback;)V

    .line 204
    iget-boolean v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->mInjectedScriptEnabled:Z

    if-nez v1, :cond_1

    .line 206
    invoke-virtual {p0}, Lorg/chromium/content/browser/accessibility/AccessibilityInjector;->onPageLostFocus()V

    goto :goto_0
.end method

.method public supportsAccessibilityAction(I)Z
    .locals 1
    .param p1, "action"    # I

    .prologue
    .line 258
    const/4 v0, 0x0

    return v0
.end method
