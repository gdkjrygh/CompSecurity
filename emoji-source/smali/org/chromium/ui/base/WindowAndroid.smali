.class public Lorg/chromium/ui/base/WindowAndroid;
.super Ljava/lang/Object;
.source "WindowAndroid.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/ui/base/WindowAndroid$IntentCallback;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "ui"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final START_INTENT_FAILURE:I = -0x1

.field private static final TAG:Ljava/lang/String; = "WindowAndroid"

.field static final WINDOW_CALLBACK_ERRORS:Ljava/lang/String; = "window_callback_errors"


# instance fields
.field protected mApplicationContext:Landroid/content/Context;

.field protected mIntentErrors:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mNativeWindowAndroid:J

.field protected mOutstandingIntents:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lorg/chromium/ui/base/WindowAndroid$IntentCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final mVSyncListener:Lorg/chromium/ui/VSyncMonitor$Listener;

.field private final mVSyncMonitor:Lorg/chromium/ui/VSyncMonitor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lorg/chromium/ui/base/WindowAndroid;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/ui/base/WindowAndroid;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UseSparseArrays"
        }
    .end annotation

    .prologue
    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mNativeWindowAndroid:J

    .line 50
    new-instance v0, Lorg/chromium/ui/base/WindowAndroid$1;

    invoke-direct {v0, p0}, Lorg/chromium/ui/base/WindowAndroid$1;-><init>(Lorg/chromium/ui/base/WindowAndroid;)V

    iput-object v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mVSyncListener:Lorg/chromium/ui/VSyncMonitor$Listener;

    .line 72
    sget-boolean v0, Lorg/chromium/ui/base/WindowAndroid;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eq p1, v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 73
    :cond_0
    iput-object p1, p0, Lorg/chromium/ui/base/WindowAndroid;->mApplicationContext:Landroid/content/Context;

    .line 74
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mOutstandingIntents:Landroid/util/SparseArray;

    .line 75
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mIntentErrors:Ljava/util/HashMap;

    .line 76
    new-instance v0, Lorg/chromium/ui/VSyncMonitor;

    iget-object v1, p0, Lorg/chromium/ui/base/WindowAndroid;->mVSyncListener:Lorg/chromium/ui/VSyncMonitor$Listener;

    invoke-direct {v0, p1, v1}, Lorg/chromium/ui/VSyncMonitor;-><init>(Landroid/content/Context;Lorg/chromium/ui/VSyncMonitor$Listener;)V

    iput-object v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mVSyncMonitor:Lorg/chromium/ui/VSyncMonitor;

    .line 77
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/ui/base/WindowAndroid;)J
    .locals 2
    .param p0, "x0"    # Lorg/chromium/ui/base/WindowAndroid;

    .prologue
    .line 29
    iget-wide v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mNativeWindowAndroid:J

    return-wide v0
.end method

.method static synthetic access$100(Lorg/chromium/ui/base/WindowAndroid;JJ)V
    .locals 1
    .param p0, "x0"    # Lorg/chromium/ui/base/WindowAndroid;
    .param p1, "x1"    # J
    .param p3, "x2"    # J

    .prologue
    .line 29
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/chromium/ui/base/WindowAndroid;->nativeOnVSync(JJ)V

    return-void
.end method

.method private native nativeDestroy(J)V
.end method

.method private native nativeInit(J)J
.end method

.method private native nativeOnVSync(JJ)V
.end method

.method private requestVSyncUpdate()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 240
    iget-object v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mVSyncMonitor:Lorg/chromium/ui/VSyncMonitor;

    invoke-virtual {v0}, Lorg/chromium/ui/VSyncMonitor;->requestUpdate()V

    .line 241
    return-void
.end method


# virtual methods
.method public canResolveActivity(Landroid/content/Intent;)Z
    .locals 2
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v0, 0x0

    .line 265
    iget-object v1, p0, Lorg/chromium/ui/base/WindowAndroid;->mApplicationContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public cancelIntent(I)V
    .locals 3
    .param p1, "requestCode"    # I

    .prologue
    .line 136
    const-string v0, "WindowAndroid"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t cancel intent as context is not an Activity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    return-void
.end method

.method public destroy()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 272
    iget-wide v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mNativeWindowAndroid:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 273
    iget-wide v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mNativeWindowAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/ui/base/WindowAndroid;->nativeDestroy(J)V

    .line 274
    iput-wide v2, p0, Lorg/chromium/ui/base/WindowAndroid;->mNativeWindowAndroid:J

    .line 276
    :cond_0
    return-void
.end method

.method public getActivity()Ljava/lang/ref/WeakReference;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    .prologue
    .line 192
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public getApplicationContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 199
    iget-object v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mApplicationContext:Landroid/content/Context;

    return-object v0
.end method

.method public getNativePointer()J
    .locals 4

    .prologue
    .line 284
    iget-wide v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mNativeWindowAndroid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 285
    iget-object v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mVSyncMonitor:Lorg/chromium/ui/VSyncMonitor;

    invoke-virtual {v0}, Lorg/chromium/ui/VSyncMonitor;->getVSyncPeriodInMicroseconds()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lorg/chromium/ui/base/WindowAndroid;->nativeInit(J)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mNativeWindowAndroid:J

    .line 287
    :cond_0
    iget-wide v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mNativeWindowAndroid:J

    return-wide v0
.end method

.method public isInsideVSync()Z
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mVSyncMonitor:Lorg/chromium/ui/VSyncMonitor;

    invoke-virtual {v0}, Lorg/chromium/ui/VSyncMonitor;->isInsideVSync()Z

    move-result v0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 1
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 235
    const/4 v0, 0x0

    return v0
.end method

.method public removeIntentCallback(Lorg/chromium/ui/base/WindowAndroid$IntentCallback;)Z
    .locals 3
    .param p1, "callback"    # Lorg/chromium/ui/base/WindowAndroid$IntentCallback;

    .prologue
    .line 146
    iget-object v1, p0, Lorg/chromium/ui/base/WindowAndroid;->mOutstandingIntents:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->indexOfValue(Ljava/lang/Object;)I

    move-result v0

    .line 147
    .local v0, "requestCode":I
    if-gez v0, :cond_0

    const/4 v1, 0x0

    .line 150
    :goto_0
    return v1

    .line 148
    :cond_0
    iget-object v1, p0, Lorg/chromium/ui/base/WindowAndroid;->mOutstandingIntents:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 149
    iget-object v1, p0, Lorg/chromium/ui/base/WindowAndroid;->mIntentErrors:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    const/4 v1, 0x1

    goto :goto_0
.end method

.method public restoreInstanceState(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 217
    if-nez p1, :cond_1

    .line 225
    :cond_0
    :goto_0
    return-void

    .line 219
    :cond_1
    const-string v2, "window_callback_errors"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    .line 220
    .local v0, "errors":Ljava/io/Serializable;
    instance-of v2, v0, Ljava/util/HashMap;

    if-eqz v2, :cond_0

    move-object v1, v0

    .line 222
    check-cast v1, Ljava/util/HashMap;

    .line 223
    .local v1, "intentErrors":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/String;>;"
    iput-object v1, p0, Lorg/chromium/ui/base/WindowAndroid;->mIntentErrors:Ljava/util/HashMap;

    goto :goto_0
.end method

.method public saveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 208
    const-string v0, "window_callback_errors"

    iget-object v1, p0, Lorg/chromium/ui/base/WindowAndroid;->mIntentErrors:Ljava/util/HashMap;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 209
    return-void
.end method

.method public sendBroadcast(Landroid/content/Intent;)V
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 183
    iget-object v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mApplicationContext:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 184
    return-void
.end method

.method protected showCallbackNonExistentError(Ljava/lang/String;)V
    .locals 0
    .param p1, "error"    # Ljava/lang/String;

    .prologue
    .line 176
    invoke-virtual {p0, p1}, Lorg/chromium/ui/base/WindowAndroid;->showError(Ljava/lang/String;)V

    .line 177
    return-void
.end method

.method public showCancelableIntent(Landroid/app/PendingIntent;Lorg/chromium/ui/base/WindowAndroid$IntentCallback;I)I
    .locals 3
    .param p1, "intent"    # Landroid/app/PendingIntent;
    .param p2, "callback"    # Lorg/chromium/ui/base/WindowAndroid$IntentCallback;
    .param p3, "errorId"    # I

    .prologue
    .line 113
    const-string v0, "WindowAndroid"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t show intent as context is not an Activity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    const/4 v0, -0x1

    return v0
.end method

.method public showCancelableIntent(Landroid/content/Intent;Lorg/chromium/ui/base/WindowAndroid$IntentCallback;I)I
    .locals 3
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "callback"    # Lorg/chromium/ui/base/WindowAndroid$IntentCallback;
    .param p3, "errorId"    # I

    .prologue
    .line 127
    const-string v0, "WindowAndroid"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t show intent as context is not an Activity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    const/4 v0, -0x1

    return v0
.end method

.method public showError(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 168
    iget-object v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mApplicationContext:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/chromium/ui/base/WindowAndroid;->showError(Ljava/lang/String;)V

    .line 169
    return-void
.end method

.method public showError(Ljava/lang/String;)V
    .locals 2
    .param p1, "error"    # Ljava/lang/String;

    .prologue
    .line 158
    if-eqz p1, :cond_0

    .line 159
    iget-object v0, p0, Lorg/chromium/ui/base/WindowAndroid;->mApplicationContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 161
    :cond_0
    return-void
.end method

.method public showIntent(Landroid/app/PendingIntent;Lorg/chromium/ui/base/WindowAndroid$IntentCallback;I)Z
    .locals 1
    .param p1, "intent"    # Landroid/app/PendingIntent;
    .param p2, "callback"    # Lorg/chromium/ui/base/WindowAndroid$IntentCallback;
    .param p3, "errorId"    # I

    .prologue
    .line 88
    invoke-virtual {p0, p1, p2, p3}, Lorg/chromium/ui/base/WindowAndroid;->showCancelableIntent(Landroid/app/PendingIntent;Lorg/chromium/ui/base/WindowAndroid$IntentCallback;I)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public showIntent(Landroid/content/Intent;Lorg/chromium/ui/base/WindowAndroid$IntentCallback;I)Z
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "callback"    # Lorg/chromium/ui/base/WindowAndroid$IntentCallback;
    .param p3, "errorId"    # I

    .prologue
    .line 100
    invoke-virtual {p0, p1, p2, p3}, Lorg/chromium/ui/base/WindowAndroid;->showCancelableIntent(Landroid/content/Intent;Lorg/chromium/ui/base/WindowAndroid$IntentCallback;I)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
