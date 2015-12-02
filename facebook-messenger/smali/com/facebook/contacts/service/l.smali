.class public Lcom/facebook/contacts/service/l;
.super Ljava/lang/Object;
.source "ContactsServicesInitializer.java"

# interfaces
.implements Lcom/facebook/base/c;


# instance fields
.field private final a:Lcom/facebook/fbservice/service/p;


# direct methods
.method public constructor <init>(Lcom/facebook/fbservice/service/p;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/contacts/service/l;->a:Lcom/facebook/fbservice/service/p;

    .line 21
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/service/OperationType;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/contacts/service/l;->a:Lcom/facebook/fbservice/service/p;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 67
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/contacts/service/l;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/contacts/service/ContactsUploadQueue;

    const-class v2, Lcom/facebook/contacts/service/ContactsQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 27
    iget-object v0, p0, Lcom/facebook/contacts/service/l;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/contacts/service/ContactsInviteQueue;

    const-class v2, Lcom/facebook/contacts/service/ContactsQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 28
    iget-object v0, p0, Lcom/facebook/contacts/service/l;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/contacts/service/ContactsQueue;

    const-class v2, Lcom/facebook/contacts/service/ContactsQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 29
    iget-object v0, p0, Lcom/facebook/contacts/service/l;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/contacts/service/ContactsSyncQueue;

    const-class v2, Lcom/facebook/contacts/service/ContactsQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 30
    iget-object v0, p0, Lcom/facebook/contacts/service/l;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/contacts/service/AddressBookQueue;

    const-class v2, Lcom/facebook/contacts/service/ContactsQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 31
    iget-object v0, p0, Lcom/facebook/contacts/service/l;->a:Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/contacts/service/DynamicContactDataQueue;

    const-class v2, Lcom/facebook/contacts/service/ContactsQueueSet;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 34
    sget-object v0, Lcom/facebook/contacts/server/d;->m:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/ContactsUploadQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 37
    sget-object v0, Lcom/facebook/contacts/server/d;->n:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/ContactsInviteQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 41
    sget-object v0, Lcom/facebook/contacts/server/d;->d:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/ContactsQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 42
    sget-object v0, Lcom/facebook/contacts/server/d;->b:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/ContactsQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 43
    sget-object v0, Lcom/facebook/contacts/server/d;->c:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/ContactsQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 44
    sget-object v0, Lcom/facebook/contacts/server/d;->e:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/ContactsQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 45
    sget-object v0, Lcom/facebook/contacts/server/d;->f:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/ContactsQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 48
    sget-object v0, Lcom/facebook/contacts/server/d;->a:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/ContactsSyncQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 51
    sget-object v0, Lcom/facebook/contacts/server/d;->g:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/AddressBookQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 52
    sget-object v0, Lcom/facebook/contacts/server/d;->h:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/AddressBookQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 53
    sget-object v0, Lcom/facebook/contacts/server/d;->i:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/AddressBookQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 54
    sget-object v0, Lcom/facebook/contacts/server/d;->j:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/AddressBookQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 55
    sget-object v0, Lcom/facebook/contacts/server/d;->k:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/AddressBookQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 56
    sget-object v0, Lcom/facebook/contacts/server/d;->l:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/AddressBookQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 59
    sget-object v0, Lcom/facebook/contacts/server/d;->p:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/DynamicContactDataQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 60
    sget-object v0, Lcom/facebook/contacts/server/d;->o:Lcom/facebook/fbservice/service/OperationType;

    const-class v1, Lcom/facebook/contacts/service/DynamicContactDataQueue;

    invoke-direct {p0, v0, v1}, Lcom/facebook/contacts/service/l;->a(Lcom/facebook/fbservice/service/OperationType;Ljava/lang/Class;)V

    .line 63
    return-void
.end method
