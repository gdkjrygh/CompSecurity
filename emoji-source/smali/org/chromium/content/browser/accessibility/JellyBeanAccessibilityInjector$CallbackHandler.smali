.class Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;
.super Ljava/lang/Object;
.source "JellyBeanAccessibilityInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CallbackHandler"
.end annotation


# static fields
.field private static final JAVASCRIPT_ACTION_TEMPLATE:Ljava/lang/String; = "(function() {  retVal = false;  try {    retVal = %s;  } catch (e) {    retVal = false;  }  %s.onResult(%d, retVal);})()"

.field private static final RESULT_TIMEOUT:J = 0x1388L


# instance fields
.field private final mInterfaceName:Ljava/lang/String;

.field private mResult:Z

.field private mResultId:J

.field private final mResultIdCounter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final mResultLock:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1, "interfaceName"    # Ljava/lang/String;

    .prologue
    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultIdCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 167
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultLock:Ljava/lang/Object;

    .line 170
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResult:Z

    .line 171
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultId:J

    .line 174
    iput-object p1, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mInterfaceName:Ljava/lang/String;

    .line 175
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$1;

    .prologue
    .line 151
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;Lorg/chromium/content/browser/ContentViewCore;Ljava/lang/String;)Z
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;
    .param p1, "x1"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p2, "x2"    # Ljava/lang/String;

    .prologue
    .line 151
    invoke-direct {p0, p1, p2}, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->performAction(Lorg/chromium/content/browser/ContentViewCore;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private clearResultLocked()V
    .locals 2

    .prologue
    .line 212
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultId:J

    .line 213
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResult:Z

    .line 214
    return-void
.end method

.method private getResultAndClear(I)Z
    .locals 4
    .param p1, "resultId"    # I

    .prologue
    .line 200
    iget-object v3, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultLock:Ljava/lang/Object;

    monitor-enter v3

    .line 201
    :try_start_0
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->waitForResultTimedLocked(I)Z

    move-result v1

    .line 202
    .local v1, "success":Z
    if-eqz v1, :cond_0

    iget-boolean v0, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResult:Z

    .line 203
    .local v0, "result":Z
    :goto_0
    invoke-direct {p0}, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->clearResultLocked()V

    .line 204
    monitor-exit v3

    return v0

    .line 202
    .end local v0    # "result":Z
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 205
    .end local v1    # "success":Z
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method private performAction(Lorg/chromium/content/browser/ContentViewCore;Ljava/lang/String;)Z
    .locals 7
    .param p1, "contentView"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p2, "code"    # Ljava/lang/String;

    .prologue
    .line 185
    iget-object v2, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultIdCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    .line 186
    .local v1, "resultId":I
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "(function() {  retVal = false;  try {    retVal = %s;  } catch (e) {    retVal = false;  }  %s.onResult(%d, retVal);})()"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p2, v4, v5

    const/4 v5, 0x1

    iget-object v6, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mInterfaceName:Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 188
    .local v0, "js":Ljava/lang/String;
    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Lorg/chromium/content/browser/ContentViewCore;->evaluateJavaScript(Ljava/lang/String;Lorg/chromium/content_public/browser/JavaScriptCallback;)V

    .line 190
    invoke-direct {p0, v1}, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->getResultAndClear(I)Z

    move-result v2

    return v2
.end method

.method private waitForResultTimedLocked(I)Z
    .locals 12
    .param p1, "resultId"    # I

    .prologue
    const/4 v6, 0x0

    .line 223
    const-wide/16 v4, 0x1388

    .line 224
    .local v4, "waitTimeMillis":J
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 227
    .local v2, "startTimeMillis":J
    :goto_0
    :try_start_0
    iget-wide v8, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultId:J

    int-to-long v10, p1

    cmp-long v7, v8, v10

    if-nez v7, :cond_1

    const/4 v6, 0x1

    .line 231
    :cond_0
    return v6

    .line 228
    :cond_1
    iget-wide v8, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultId:J

    int-to-long v10, p1

    cmp-long v7, v8, v10

    if-gtz v7, :cond_0

    .line 229
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    sub-long v0, v8, v2

    .line 230
    .local v0, "elapsedTimeMillis":J
    const-wide/16 v8, 0x1388

    sub-long v4, v8, v0

    .line 231
    const-wide/16 v8, 0x0

    cmp-long v7, v4, v8

    if-lez v7, :cond_0

    .line 232
    iget-object v7, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultLock:Ljava/lang/Object;

    invoke-virtual {v7, v4, v5}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 233
    .end local v0    # "elapsedTimeMillis":J
    :catch_0
    move-exception v7

    goto :goto_0
.end method


# virtual methods
.method public onResult(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "result"    # Ljava/lang/String;
    .annotation runtime Lorg/chromium/content/browser/JavascriptInterface;
    .end annotation

    .prologue
    .line 251
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    .line 256
    .local v2, "resultId":J
    iget-object v4, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultLock:Ljava/lang/Object;

    monitor-enter v4

    .line 257
    :try_start_1
    iget-wide v6, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultId:J

    cmp-long v1, v2, v6

    if-lez v1, :cond_0

    .line 258
    invoke-static {p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResult:Z

    .line 259
    iput-wide v2, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultId:J

    .line 261
    :cond_0
    iget-object v1, p0, Lorg/chromium/content/browser/accessibility/JellyBeanAccessibilityInjector$CallbackHandler;->mResultLock:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 262
    monitor-exit v4

    .line 263
    .end local v2    # "resultId":J
    :goto_0
    return-void

    .line 252
    :catch_0
    move-exception v0

    .line 253
    .local v0, "e":Ljava/lang/NumberFormatException;
    goto :goto_0

    .line 262
    .end local v0    # "e":Ljava/lang/NumberFormatException;
    .restart local v2    # "resultId":J
    :catchall_0
    move-exception v1

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
