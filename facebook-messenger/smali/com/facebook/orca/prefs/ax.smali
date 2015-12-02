.class Lcom/facebook/orca/prefs/ax;
.super Ljava/lang/Object;
.source "ThreadNotificationPrefsSynchronizer.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/av;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/av;)V
    .locals 0

    .prologue
    .line 149
    iput-object p1, p0, Lcom/facebook/orca/prefs/ax;->a:Lcom/facebook/orca/prefs/av;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/orca/prefs/ax;->a:Lcom/facebook/orca/prefs/av;

    invoke-static {v0}, Lcom/facebook/orca/prefs/av;->a(Lcom/facebook/orca/prefs/av;)V

    .line 153
    return-void
.end method
