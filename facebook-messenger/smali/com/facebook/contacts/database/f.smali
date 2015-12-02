.class public Lcom/facebook/contacts/database/f;
.super Lcom/facebook/backgroundtasks/a;
.source "AddressBookSyncBackgroundTask.java"


# instance fields
.field private final a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/database/AddressBookPeriodicRunner;)V
    .locals 1

    .prologue
    .line 22
    const-string v0, "ADDRESSBOOK_SYNC"

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/a;-><init>(Ljava/lang/String;)V

    .line 23
    iput-object p1, p0, Lcom/facebook/contacts/database/f;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    .line 24
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 35
    iget-object v0, p0, Lcom/facebook/contacts/database/f;->a:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a(Z)V

    .line 36
    return v1
.end method

.method public c()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/backgroundtasks/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 42
    const/4 v0, 0x0

    return-object v0
.end method

.method public g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 28
    const-class v0, Lcom/facebook/contacts/database/ContactsTaskTag;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
