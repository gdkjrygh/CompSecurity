.class public Lorg/chromium/ui/base/ActivityWindowAndroid;
.super Lorg/chromium/ui/base/WindowAndroid;
.source "ActivityWindowAndroid.java"


# static fields
.field private static final REQUEST_CODE_PREFIX:I = 0x3e8

.field private static final REQUEST_CODE_RANGE_SIZE:I = 0x64

.field private static final TAG:Ljava/lang/String; = "ActivityWindowAndroid"


# instance fields
.field private final mActivityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private mNextRequestCode:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 30
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/chromium/ui/base/WindowAndroid;-><init>(Landroid/content/Context;)V

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mNextRequestCode:I

    .line 31
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mActivityRef:Ljava/lang/ref/WeakReference;

    .line 32
    return-void
.end method

.method private generateNextRequestCode()I
    .locals 2

    .prologue
    .line 102
    iget v1, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mNextRequestCode:I

    add-int/lit16 v0, v1, 0x3e8

    .line 103
    .local v0, "requestCode":I
    iget v1, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mNextRequestCode:I

    add-int/lit8 v1, v1, 0x1

    rem-int/lit8 v1, v1, 0x64

    iput v1, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mNextRequestCode:I

    .line 104
    return v0
.end method

.method private storeCallbackData(ILorg/chromium/ui/base/WindowAndroid$IntentCallback;I)V
    .locals 3
    .param p1, "requestCode"    # I
    .param p2, "callback"    # Lorg/chromium/ui/base/WindowAndroid$IntentCallback;
    .param p3, "errorId"    # I

    .prologue
    .line 108
    iget-object v0, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mOutstandingIntents:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 109
    iget-object v0, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mIntentErrors:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mApplicationContext:Landroid/content/Context;

    invoke-virtual {v2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    return-void
.end method


# virtual methods
.method public cancelIntent(I)V
    .locals 2
    .param p1, "requestCode"    # I

    .prologue
    .line 71
    iget-object v1, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mActivityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 72
    .local v0, "activity":Landroid/app/Activity;
    if-nez v0, :cond_0

    .line 74
    :goto_0
    return-void

    .line 73
    :cond_0
    invoke-virtual {v0, p1}, Landroid/app/Activity;->finishActivity(I)V

    goto :goto_0
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
    .line 98
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mActivityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 5
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    const/4 v2, 0x1

    .line 78
    iget-object v3, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mOutstandingIntents:Landroid/util/SparseArray;

    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/ui/base/WindowAndroid$IntentCallback;

    .line 79
    .local v0, "callback":Lorg/chromium/ui/base/WindowAndroid$IntentCallback;
    iget-object v3, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mOutstandingIntents:Landroid/util/SparseArray;

    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->delete(I)V

    .line 80
    iget-object v3, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mIntentErrors:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 82
    .local v1, "errorMessage":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 83
    iget-object v3, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mApplicationContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-interface {v0, p0, p2, v3, p3}, Lorg/chromium/ui/base/WindowAndroid$IntentCallback;->onIntentCompleted(Lorg/chromium/ui/base/WindowAndroid;ILandroid/content/ContentResolver;Landroid/content/Intent;)V

    .line 92
    :goto_0
    return v2

    .line 87
    :cond_0
    if-eqz v1, :cond_1

    .line 88
    invoke-virtual {p0, v1}, Lorg/chromium/ui/base/ActivityWindowAndroid;->showCallbackNonExistentError(Ljava/lang/String;)V

    goto :goto_0

    .line 92
    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public showCancelableIntent(Landroid/app/PendingIntent;Lorg/chromium/ui/base/WindowAndroid$IntentCallback;I)I
    .locals 9
    .param p1, "intent"    # Landroid/app/PendingIntent;
    .param p2, "callback"    # Lorg/chromium/ui/base/WindowAndroid$IntentCallback;
    .param p3, "errorId"    # I

    .prologue
    const/4 v8, -0x1

    .line 36
    iget-object v1, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mActivityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 37
    .local v0, "activity":Landroid/app/Activity;
    if-nez v0, :cond_0

    move v2, v8

    .line 49
    :goto_0
    return v2

    .line 39
    :cond_0
    invoke-direct {p0}, Lorg/chromium/ui/base/ActivityWindowAndroid;->generateNextRequestCode()I

    move-result v2

    .line 42
    .local v2, "requestCode":I
    :try_start_0
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v1

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    invoke-direct {p0, v2, p2, p3}, Lorg/chromium/ui/base/ActivityWindowAndroid;->storeCallbackData(ILorg/chromium/ui/base/WindowAndroid$IntentCallback;I)V

    goto :goto_0

    .line 44
    :catch_0
    move-exception v7

    .local v7, "e":Landroid/content/IntentSender$SendIntentException;
    move v2, v8

    .line 45
    goto :goto_0
.end method

.method public showCancelableIntent(Landroid/content/Intent;Lorg/chromium/ui/base/WindowAndroid$IntentCallback;I)I
    .locals 5
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "callback"    # Lorg/chromium/ui/base/WindowAndroid$IntentCallback;
    .param p3, "errorId"    # I

    .prologue
    const/4 v3, -0x1

    .line 54
    iget-object v4, p0, Lorg/chromium/ui/base/ActivityWindowAndroid;->mActivityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 55
    .local v0, "activity":Landroid/app/Activity;
    if-nez v0, :cond_0

    move v2, v3

    .line 66
    :goto_0
    return v2

    .line 57
    :cond_0
    invoke-direct {p0}, Lorg/chromium/ui/base/ActivityWindowAndroid;->generateNextRequestCode()I

    move-result v2

    .line 60
    .local v2, "requestCode":I
    :try_start_0
    invoke-virtual {v0, p1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    invoke-direct {p0, v2, p2, p3}, Lorg/chromium/ui/base/ActivityWindowAndroid;->storeCallbackData(ILorg/chromium/ui/base/WindowAndroid$IntentCallback;I)V

    goto :goto_0

    .line 61
    :catch_0
    move-exception v1

    .local v1, "e":Landroid/content/ActivityNotFoundException;
    move v2, v3

    .line 62
    goto :goto_0
.end method
