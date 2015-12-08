.class public Lorg/chromium/content/browser/TracingControllerAndroid;
.super Ljava/lang/Object;
.source "TracingControllerAndroid.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/TracingControllerAndroid$TracingBroadcastReceiver;,
        Lorg/chromium/content/browser/TracingControllerAndroid$TracingIntentFilter;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final ACTION_LIST_CATEGORIES:Ljava/lang/String; = "GPU_PROFILER_LIST_CATEGORIES"

.field private static final ACTION_START:Ljava/lang/String; = "GPU_PROFILER_START"

.field private static final ACTION_STOP:Ljava/lang/String; = "GPU_PROFILER_STOP"

.field private static final CATEGORIES_EXTRA:Ljava/lang/String; = "categories"

.field private static final DEFAULT_CHROME_CATEGORIES_PLACE_HOLDER:Ljava/lang/String; = "_DEFAULT_CHROME_CATEGORIES"

.field private static final FILE_EXTRA:Ljava/lang/String; = "file"

.field private static final PROFILER_FINISHED_FMT:Ljava/lang/String; = "Profiler finished. Results are in %s."

.field private static final PROFILER_STARTED_FMT:Ljava/lang/String; = "Profiler started: %s"

.field private static final RECORD_CONTINUOUSLY_EXTRA:Ljava/lang/String; = "continuous"

.field private static final TAG:Ljava/lang/String; = "TracingControllerAndroid"


# instance fields
.field private final mBroadcastReceiver:Lorg/chromium/content/browser/TracingControllerAndroid$TracingBroadcastReceiver;

.field private final mContext:Landroid/content/Context;

.field private mFilename:Ljava/lang/String;

.field private final mIntentFilter:Lorg/chromium/content/browser/TracingControllerAndroid$TracingIntentFilter;

.field private mIsTracing:Z

.field private mNativeTracingControllerAndroid:J

.field private mShowToasts:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    const-class v0, Lorg/chromium/content/browser/TracingControllerAndroid;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/TracingControllerAndroid;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mShowToasts:Z

    .line 73
    iput-object p1, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mContext:Landroid/content/Context;

    .line 74
    new-instance v0, Lorg/chromium/content/browser/TracingControllerAndroid$TracingBroadcastReceiver;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/TracingControllerAndroid$TracingBroadcastReceiver;-><init>(Lorg/chromium/content/browser/TracingControllerAndroid;)V

    iput-object v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mBroadcastReceiver:Lorg/chromium/content/browser/TracingControllerAndroid$TracingBroadcastReceiver;

    .line 75
    new-instance v0, Lorg/chromium/content/browser/TracingControllerAndroid$TracingIntentFilter;

    invoke-direct {v0, p1}, Lorg/chromium/content/browser/TracingControllerAndroid$TracingIntentFilter;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mIntentFilter:Lorg/chromium/content/browser/TracingControllerAndroid$TracingIntentFilter;

    .line 76
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/TracingControllerAndroid;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/TracingControllerAndroid;

    .prologue
    .line 43
    invoke-direct {p0}, Lorg/chromium/content/browser/TracingControllerAndroid;->nativeGetDefaultCategories()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static generateTracingFilePath()Ljava/lang/String;
    .locals 6
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 126
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v3

    .line 127
    .local v3, "state":Ljava/lang/String;
    const-string v4, "mounted"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 128
    const/4 v4, 0x0

    .line 140
    :goto_0
    return-object v4

    .line 133
    :cond_0
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy-MM-dd-HHmmss"

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 135
    .local v2, "formatter":Ljava/text/SimpleDateFormat;
    const-string v4, "UTC"

    invoke-static {v4}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 136
    sget-object v4, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v4}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 138
    .local v0, "dir":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "chrome-profile-results-"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 140
    .local v1, "file":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    goto :goto_0
.end method

.method private initializeNativeControllerIfNeeded()V
    .locals 4

    .prologue
    .line 161
    iget-wide v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mNativeTracingControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 162
    invoke-direct {p0}, Lorg/chromium/content/browser/TracingControllerAndroid;->nativeInit()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mNativeTracingControllerAndroid:J

    .line 164
    :cond_0
    return-void
.end method

.method private logAndToastError(Ljava/lang/String;)V
    .locals 2
    .param p1, "str"    # Ljava/lang/String;

    .prologue
    .line 261
    const-string v0, "TracingControllerAndroid"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 262
    iget-boolean v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mShowToasts:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 263
    :cond_0
    return-void
.end method

.method private logForProfiler(Ljava/lang/String;)V
    .locals 1
    .param p1, "str"    # Ljava/lang/String;

    .prologue
    .line 267
    const-string v0, "TracingControllerAndroid"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 268
    return-void
.end method

.method private native nativeDestroy(J)V
.end method

.method private native nativeGetDefaultCategories()Ljava/lang/String;
.end method

.method private native nativeGetKnownCategoryGroupsAsync(J)Z
.end method

.method private native nativeInit()J
.end method

.method private native nativeStartTracing(JLjava/lang/String;Ljava/lang/String;)Z
.end method

.method private native nativeStopTracing(JLjava/lang/String;)V
.end method

.method private showToast(Ljava/lang/String;)V
    .locals 2
    .param p1, "str"    # Ljava/lang/String;

    .prologue
    .line 271
    iget-boolean v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mShowToasts:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 272
    :cond_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 254
    iget-wide v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mNativeTracingControllerAndroid:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 255
    iget-wide v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mNativeTracingControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/TracingControllerAndroid;->nativeDestroy(J)V

    .line 256
    iput-wide v2, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mNativeTracingControllerAndroid:J

    .line 258
    :cond_0
    return-void
.end method

.method protected finalize()V
    .locals 4

    .prologue
    .line 246
    sget-boolean v0, Lorg/chromium/content/browser/TracingControllerAndroid;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mNativeTracingControllerAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 247
    :cond_0
    return-void
.end method

.method public getBroadcastReceiver()Landroid/content/BroadcastReceiver;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mBroadcastReceiver:Lorg/chromium/content/browser/TracingControllerAndroid$TracingBroadcastReceiver;

    return-object v0
.end method

.method public getCategoryGroups()V
    .locals 2

    .prologue
    .line 237
    invoke-direct {p0}, Lorg/chromium/content/browser/TracingControllerAndroid;->initializeNativeControllerIfNeeded()V

    .line 238
    iget-wide v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mNativeTracingControllerAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/TracingControllerAndroid;->nativeGetKnownCategoryGroupsAsync(J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 239
    const-string v0, "TracingControllerAndroid"

    const-string v1, "Unable to fetch tracing record groups list."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    :cond_0
    return-void
.end method

.method public getIntentFilter()Landroid/content/IntentFilter;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mIntentFilter:Lorg/chromium/content/browser/TracingControllerAndroid$TracingIntentFilter;

    return-object v0
.end method

.method public getOutputPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mFilename:Ljava/lang/String;

    return-object v0
.end method

.method public isTracing()Z
    .locals 1

    .prologue
    .line 111
    iget-boolean v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mIsTracing:Z

    return v0
.end method

.method protected onTracingStopped()V
    .locals 5
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 220
    invoke-virtual {p0}, Lorg/chromium/content/browser/TracingControllerAndroid;->isTracing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 222
    const-string v0, "TracingControllerAndroid"

    const-string v1, "Received onTracingStopped, but we aren\'t tracing"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    :goto_0
    return-void

    .line 226
    :cond_0
    const-string v0, "Profiler finished. Results are in %s."

    new-array v1, v3, [Ljava/lang/Object;

    iget-object v2, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mFilename:Ljava/lang/String;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/chromium/content/browser/TracingControllerAndroid;->logForProfiler(Ljava/lang/String;)V

    .line 227
    iget-object v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mContext:Landroid/content/Context;

    sget v1, Lorg/chromium/content/R$string;->profiler_stopped_toast:I

    new-array v2, v3, [Ljava/lang/Object;

    iget-object v3, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mFilename:Ljava/lang/String;

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/chromium/content/browser/TracingControllerAndroid;->showToast(Ljava/lang/String;)V

    .line 228
    iput-boolean v4, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mIsTracing:Z

    .line 229
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mFilename:Ljava/lang/String;

    goto :goto_0
.end method

.method public registerReceiver(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 96
    invoke-virtual {p0}, Lorg/chromium/content/browser/TracingControllerAndroid;->getBroadcastReceiver()Landroid/content/BroadcastReceiver;

    move-result-object v0

    invoke-virtual {p0}, Lorg/chromium/content/browser/TracingControllerAndroid;->getIntentFilter()Landroid/content/IntentFilter;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 97
    return-void
.end method

.method public startTracing(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Z
    .locals 5
    .param p1, "filename"    # Ljava/lang/String;
    .param p2, "showToasts"    # Z
    .param p3, "categories"    # Ljava/lang/String;
    .param p4, "traceOptions"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 185
    iput-boolean p2, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mShowToasts:Z

    .line 186
    invoke-virtual {p0}, Lorg/chromium/content/browser/TracingControllerAndroid;->isTracing()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 188
    const-string v1, "TracingControllerAndroid"

    const-string v2, "Received startTracing, but we\'re already tracing"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 203
    :goto_0
    return v0

    .line 192
    :cond_0
    invoke-direct {p0}, Lorg/chromium/content/browser/TracingControllerAndroid;->initializeNativeControllerIfNeeded()V

    .line 193
    iget-wide v2, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mNativeTracingControllerAndroid:J

    invoke-virtual {p4}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v2, v3, p3, v4}, Lorg/chromium/content/browser/TracingControllerAndroid;->nativeStartTracing(JLjava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 195
    iget-object v1, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mContext:Landroid/content/Context;

    sget v2, Lorg/chromium/content/R$string;->profiler_error_toast:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lorg/chromium/content/browser/TracingControllerAndroid;->logAndToastError(Ljava/lang/String;)V

    goto :goto_0

    .line 199
    :cond_1
    const-string v2, "Profiler started: %s"

    new-array v3, v1, [Ljava/lang/Object;

    aput-object p3, v3, v0

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/chromium/content/browser/TracingControllerAndroid;->logForProfiler(Ljava/lang/String;)V

    .line 200
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mContext:Landroid/content/Context;

    sget v3, Lorg/chromium/content/R$string;->profiler_started_toast:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/chromium/content/browser/TracingControllerAndroid;->showToast(Ljava/lang/String;)V

    .line 201
    iput-object p1, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mFilename:Ljava/lang/String;

    .line 202
    iput-boolean v1, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mIsTracing:Z

    move v0, v1

    .line 203
    goto :goto_0
.end method

.method public startTracing(ZLjava/lang/String;Ljava/lang/String;)Z
    .locals 3
    .param p1, "showToasts"    # Z
    .param p2, "categories"    # Ljava/lang/String;
    .param p3, "traceOptions"    # Ljava/lang/String;

    .prologue
    .line 150
    iput-boolean p1, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mShowToasts:Z

    .line 152
    invoke-static {}, Lorg/chromium/content/browser/TracingControllerAndroid;->generateTracingFilePath()Ljava/lang/String;

    move-result-object v0

    .line 153
    .local v0, "filePath":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 154
    iget-object v1, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mContext:Landroid/content/Context;

    sget v2, Lorg/chromium/content/R$string;->profiler_no_storage_toast:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lorg/chromium/content/browser/TracingControllerAndroid;->logAndToastError(Ljava/lang/String;)V

    .line 157
    :cond_0
    invoke-virtual {p0, v0, p1, p2, p3}, Lorg/chromium/content/browser/TracingControllerAndroid;->startTracing(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Z

    move-result v1

    return v1
.end method

.method public stopTracing()V
    .locals 3

    .prologue
    .line 210
    invoke-virtual {p0}, Lorg/chromium/content/browser/TracingControllerAndroid;->isTracing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 211
    iget-wide v0, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mNativeTracingControllerAndroid:J

    iget-object v2, p0, Lorg/chromium/content/browser/TracingControllerAndroid;->mFilename:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lorg/chromium/content/browser/TracingControllerAndroid;->nativeStopTracing(JLjava/lang/String;)V

    .line 213
    :cond_0
    return-void
.end method

.method public unregisterReceiver(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 104
    invoke-virtual {p0}, Lorg/chromium/content/browser/TracingControllerAndroid;->getBroadcastReceiver()Landroid/content/BroadcastReceiver;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 105
    return-void
.end method
