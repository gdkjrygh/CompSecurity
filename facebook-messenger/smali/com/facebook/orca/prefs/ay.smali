.class Lcom/facebook/orca/prefs/ay;
.super Ljava/lang/Object;
.source "ThreadNotificationPrefsSynchronizer.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/av;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/av;)V
    .locals 0

    .prologue
    .line 240
    iput-object p1, p0, Lcom/facebook/orca/prefs/ay;->a:Lcom/facebook/orca/prefs/av;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 243
    iget-object v0, p0, Lcom/facebook/orca/prefs/ay;->a:Lcom/facebook/orca/prefs/av;

    invoke-static {v0}, Lcom/facebook/orca/prefs/av;->b(Lcom/facebook/orca/prefs/av;)V

    .line 244
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 240
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/prefs/ay;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 248
    iget-object v0, p0, Lcom/facebook/orca/prefs/ay;->a:Lcom/facebook/orca/prefs/av;

    invoke-static {v0}, Lcom/facebook/orca/prefs/av;->c(Lcom/facebook/orca/prefs/av;)V

    .line 249
    return-void
.end method
