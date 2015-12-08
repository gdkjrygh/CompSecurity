.class public abstract Lcom/google/ads/f;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/os/AsyncTask",
        "<",
        "Lorg/json/JSONObject;",
        "Ljava/lang/Void;",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;


# instance fields
.field private final b:Lcom/google/android/gms/ads/AdListener;

.field private final c:Lcom/google/ads/h;

.field private final d:Ljava/lang/Object;

.field private e:Z

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 33
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    sput-object v0, Lcom/google/ads/f;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-void
.end method

.method constructor <init>(Lcom/google/ads/h;Lcom/google/android/gms/ads/AdListener;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 53
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 45
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/ads/f;->d:Ljava/lang/Object;

    .line 54
    iput-object p2, p0, Lcom/google/ads/f;->b:Lcom/google/android/gms/ads/AdListener;

    .line 55
    iput-object p1, p0, Lcom/google/ads/f;->c:Lcom/google/ads/h;

    .line 56
    iput v1, p0, Lcom/google/ads/f;->f:I

    .line 57
    iput-boolean v1, p0, Lcom/google/ads/f;->e:Z

    .line 58
    return-void
.end method

.method public static a(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)",
            "Ljava/util/concurrent/Future",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 40
    sget-object v0, Lcom/google/ads/f;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected abstract a(Lorg/json/JSONObject;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")TT;"
        }
    .end annotation
.end method

.method protected varargs a([Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/json/JSONObject;",
            ")TT;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 98
    array-length v1, p1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    .line 99
    const-string v1, "Ads"

    const-string v2, "Incorrect number of ad JSON objects."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    invoke-virtual {p0, v3}, Lcom/google/ads/f;->a(I)V

    .line 105
    :goto_0
    return-object v0

    .line 103
    :cond_0
    aget-object v1, p1, v3

    invoke-virtual {p0, v1}, Lcom/google/ads/f;->a(Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object v1

    .line 104
    iget-object v2, p0, Lcom/google/ads/f;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 105
    :try_start_0
    iget-boolean v3, p0, Lcom/google/ads/f;->e:Z

    if-eqz v3, :cond_1

    :goto_1
    monitor-exit v2

    goto :goto_0

    .line 106
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    move-object v0, v1

    .line 105
    goto :goto_1
.end method

.method protected a(Lorg/json/JSONObject;Ljava/lang/String;Z)Ljava/util/concurrent/Future;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/concurrent/Future",
            "<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .prologue
    .line 132
    if-eqz p3, :cond_1

    .line 133
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 135
    :goto_0
    if-nez v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 137
    :cond_0
    if-eqz p3, :cond_2

    const-string v1, "url"

    .line 138
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 141
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 142
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p3}, Lcom/google/ads/f;->a(IZ)V

    .line 143
    new-instance v0, Lcom/google/ads/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/ads/g;-><init>(Ljava/lang/Object;)V

    .line 146
    :goto_2
    return-object v0

    .line 134
    :cond_1
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_0

    .line 138
    :cond_2
    const-string v1, "url"

    .line 139
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 146
    :cond_3
    iget-object v1, p0, Lcom/google/ads/f;->c:Lcom/google/ads/h;

    new-instance v2, Lcom/google/ads/f$1;

    invoke-direct {v2, p0, p3}, Lcom/google/ads/f$1;-><init>(Lcom/google/ads/f;Z)V

    invoke-virtual {v1, v0, v2}, Lcom/google/ads/h;->a(Ljava/lang/String;Lcom/google/ads/h$a;)Ljava/util/concurrent/Future;

    move-result-object v0

    goto :goto_2
.end method

.method protected a(I)V
    .locals 2

    .prologue
    .line 79
    iget-object v1, p0, Lcom/google/ads/f;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 80
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/ads/f;->e:Z

    .line 81
    iput p1, p0, Lcom/google/ads/f;->f:I

    .line 82
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected a(IZ)V
    .locals 0

    .prologue
    .line 91
    if-eqz p2, :cond_0

    .line 92
    invoke-virtual {p0, p1}, Lcom/google/ads/f;->a(I)V

    .line 94
    :cond_0
    return-void
.end method

.method protected abstract a(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    check-cast p1, [Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/google/ads/f;->a([Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 112
    iget-boolean v0, p0, Lcom/google/ads/f;->e:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_2

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/google/ads/f;->b:Lcom/google/android/gms/ads/AdListener;

    if-eqz v0, :cond_1

    .line 114
    iget-object v0, p0, Lcom/google/ads/f;->b:Lcom/google/android/gms/ads/AdListener;

    iget v1, p0, Lcom/google/ads/f;->f:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdListener;->onAdFailedToLoad(I)V

    .line 119
    :cond_1
    :goto_0
    return-void

    .line 118
    :cond_2
    invoke-virtual {p0, p1}, Lcom/google/ads/f;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method
