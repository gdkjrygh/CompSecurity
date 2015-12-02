.class Lcom/facebook/prefs/shared/o;
.super Ljava/lang/Object;
.source "FbSharedPreferencesImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/prefs/shared/j;


# direct methods
.method constructor <init>(Lcom/facebook/prefs/shared/j;)V
    .locals 0

    .prologue
    .line 663
    iput-object p1, p0, Lcom/facebook/prefs/shared/o;->a:Lcom/facebook/prefs/shared/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 666
    iget-object v1, p0, Lcom/facebook/prefs/shared/o;->a:Lcom/facebook/prefs/shared/j;

    monitor-enter v1

    .line 667
    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/o;->a:Lcom/facebook/prefs/shared/j;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/facebook/prefs/shared/j;->a(Lcom/facebook/prefs/shared/j;Z)Z

    .line 668
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 669
    iget-object v0, p0, Lcom/facebook/prefs/shared/o;->a:Lcom/facebook/prefs/shared/j;

    invoke-static {v0}, Lcom/facebook/prefs/shared/j;->b(Lcom/facebook/prefs/shared/j;)V

    .line 670
    return-void

    .line 668
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
