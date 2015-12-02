.class Lcom/facebook/orca/prefs/e;
.super Ljava/lang/Object;
.source "GlobalNotificationPrefsSynchronizer.java"

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
.field final synthetic a:Lcom/facebook/orca/prefs/b;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/b;)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lcom/facebook/orca/prefs/e;->a:Lcom/facebook/orca/prefs/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcom/facebook/orca/prefs/e;->a:Lcom/facebook/orca/prefs/b;

    invoke-static {v0}, Lcom/facebook/orca/prefs/b;->b(Lcom/facebook/orca/prefs/b;)V

    .line 150
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 146
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/prefs/e;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/facebook/orca/prefs/e;->a:Lcom/facebook/orca/prefs/b;

    invoke-static {v0}, Lcom/facebook/orca/prefs/b;->c(Lcom/facebook/orca/prefs/b;)V

    .line 155
    return-void
.end method
