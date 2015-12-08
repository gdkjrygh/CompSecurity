.class final Lkik/android/ab;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/aa;


# direct methods
.method constructor <init>(Lkik/android/aa;)V
    .locals 0

    .prologue
    .line 246
    iput-object p1, p0, Lkik/android/ab;->a:Lkik/android/aa;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 250
    iget-object v0, p0, Lkik/android/ab;->a:Lkik/android/aa;

    iget-object v0, v0, Lkik/android/aa;->a:Lkik/android/KikNotificationHandler;

    invoke-static {v0}, Lkik/android/KikNotificationHandler;->c(Lkik/android/KikNotificationHandler;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 251
    :try_start_0
    iget-object v0, p0, Lkik/android/ab;->a:Lkik/android/aa;

    iget-object v0, v0, Lkik/android/aa;->a:Lkik/android/KikNotificationHandler;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lkik/android/KikNotificationHandler;->a(Lkik/android/KikNotificationHandler;Lcom/kik/g/p;)Lcom/kik/g/p;

    .line 252
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
