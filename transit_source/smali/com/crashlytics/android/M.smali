.class final Lcom/crashlytics/android/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/E;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 1963
    iput-object p2, p0, Lcom/crashlytics/android/M;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1967
    :try_start_0
    iget-object v0, p0, Lcom/crashlytics/android/M;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1971
    :goto_0
    return-void

    .line 1968
    :catch_0
    move-exception v0

    .line 1969
    const-string v1, "Failed to execute task."

    invoke-static {v1, v0}, Lcom/crashlytics/android/aB;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
