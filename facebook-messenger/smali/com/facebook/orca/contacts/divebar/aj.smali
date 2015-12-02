.class Lcom/facebook/orca/contacts/divebar/aj;
.super Ljava/lang/Object;
.source "DivebarLoader.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/ad;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/ad;)V
    .locals 0

    .prologue
    .line 610
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/aj;->a:Lcom/facebook/orca/contacts/divebar/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 3

    .prologue
    .line 615
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aj;->a:Lcom/facebook/orca/contacts/divebar/ad;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/ad;->c(Lcom/facebook/orca/contacts/divebar/ad;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 616
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aj;->a:Lcom/facebook/orca/contacts/divebar/ad;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/ad;Z)Z

    .line 617
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/aj;->a:Lcom/facebook/orca/contacts/divebar/ad;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/ad;->c(Lcom/facebook/orca/contacts/divebar/ad;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 618
    monitor-exit v1

    .line 619
    const/4 v0, 0x0

    return-object v0

    .line 618
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 610
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/aj;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
