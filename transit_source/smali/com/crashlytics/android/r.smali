.class final Lcom/crashlytics/android/r;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private synthetic a:J

.field private synthetic b:Lcom/crashlytics/android/CrashTest;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/CrashTest;J)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/crashlytics/android/r;->b:Lcom/crashlytics/android/CrashTest;

    iput-wide p2, p0, Lcom/crashlytics/android/r;->a:J

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method private varargs a()Ljava/lang/Void;
    .locals 2

    .prologue
    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/crashlytics/android/r;->a:J

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :goto_0
    iget-object v0, p0, Lcom/crashlytics/android/r;->b:Lcom/crashlytics/android/CrashTest;

    const-string v1, "Background thread crash"

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/CrashTest;->throwRuntimeException(Ljava/lang/String;)V

    .line 49
    const/4 v0, 0x0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/crashlytics/android/r;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
