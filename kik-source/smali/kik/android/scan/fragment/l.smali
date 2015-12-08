.class final Lkik/android/scan/fragment/l;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/android/scan/fragment/ScanFragment;


# direct methods
.method constructor <init>(Lkik/android/scan/fragment/ScanFragment;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 981
    iput-object p1, p0, Lkik/android/scan/fragment/l;->b:Lkik/android/scan/fragment/ScanFragment;

    iput-object p2, p0, Lkik/android/scan/fragment/l;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 985
    iget-object v0, p0, Lkik/android/scan/fragment/l;->b:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v0}, Lkik/android/scan/fragment/ScanFragment;->n(Lkik/android/scan/fragment/ScanFragment;)Ljava/util/List;

    move-result-object v1

    monitor-enter v1

    .line 986
    :try_start_0
    iget-object v0, p0, Lkik/android/scan/fragment/l;->b:Lkik/android/scan/fragment/ScanFragment;

    invoke-static {v0}, Lkik/android/scan/fragment/ScanFragment;->n(Lkik/android/scan/fragment/ScanFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lkik/android/scan/fragment/l;->a:Lcom/kik/g/p;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 987
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
