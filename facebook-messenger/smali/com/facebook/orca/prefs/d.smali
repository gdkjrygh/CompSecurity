.class Lcom/facebook/orca/prefs/d;
.super Ljava/lang/Object;
.source "GlobalNotificationPrefsSynchronizer.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/b;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/b;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/facebook/orca/prefs/d;->a:Lcom/facebook/orca/prefs/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/orca/prefs/d;->a:Lcom/facebook/orca/prefs/b;

    invoke-static {v0}, Lcom/facebook/orca/prefs/b;->a(Lcom/facebook/orca/prefs/b;)V

    .line 117
    return-void
.end method
