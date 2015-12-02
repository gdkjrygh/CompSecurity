.class Lcom/facebook/orca/contacts/divebar/ak;
.super Ljava/lang/Object;
.source "DivebarLoader.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
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
    .line 623
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ak;->a:Lcom/facebook/orca/contacts/divebar/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 623
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/divebar/ak;->a(Ljava/lang/Void;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 632
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 633
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "Failed to cancel pending fetches"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 635
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ak;->a:Lcom/facebook/orca/contacts/divebar/ad;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/ad;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 636
    return-void
.end method

.method public a(Ljava/lang/Void;)V
    .locals 2

    .prologue
    .line 627
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ak;->a:Lcom/facebook/orca/contacts/divebar/ad;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/ad;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 628
    return-void
.end method
