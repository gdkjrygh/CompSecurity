.class final Lkik/android/aa;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/KikNotificationHandler;


# direct methods
.method constructor <init>(Lkik/android/KikNotificationHandler;)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Lkik/android/aa;->a:Lkik/android/KikNotificationHandler;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 239
    iget-object v0, p0, Lkik/android/aa;->a:Lkik/android/KikNotificationHandler;

    invoke-static {v0}, Lkik/android/KikNotificationHandler;->c(Lkik/android/KikNotificationHandler;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lkik/android/aa;->a:Lkik/android/KikNotificationHandler;

    invoke-static {v0}, Lkik/android/KikNotificationHandler;->d(Lkik/android/KikNotificationHandler;)Lcom/kik/g/p;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    new-instance v2, Lkik/android/ab;

    invoke-direct {v2, p0}, Lkik/android/ab;-><init>(Lkik/android/aa;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    iget-object v2, p0, Lkik/android/aa;->a:Lkik/android/KikNotificationHandler;

    invoke-static {v2, v0}, Lkik/android/KikNotificationHandler;->a(Lkik/android/KikNotificationHandler;Lcom/kik/g/p;)Lcom/kik/g/p;

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
