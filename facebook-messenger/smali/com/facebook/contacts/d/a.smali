.class public Lcom/facebook/contacts/d/a;
.super Ljava/lang/Object;
.source "ContactsInviteServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/contacts/e/e;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/contacts/data/k;

.field private final f:Lcom/facebook/contacts/g/a/k;

.field private final g:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/contacts/d/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/d/a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/contacts/data/k;Lcom/facebook/contacts/g/a/k;Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/contacts/e/e;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/contacts/data/k;",
            "Lcom/facebook/contacts/g/a/k;",
            "Lcom/fasterxml/jackson/databind/ObjectMapper;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/facebook/contacts/d/a;->b:Ljavax/inject/a;

    .line 47
    iput-object p2, p0, Lcom/facebook/contacts/d/a;->c:Ljavax/inject/a;

    .line 48
    iput-object p3, p0, Lcom/facebook/contacts/d/a;->d:Ljavax/inject/a;

    .line 49
    iput-object p4, p0, Lcom/facebook/contacts/d/a;->e:Lcom/facebook/contacts/data/k;

    .line 50
    iput-object p5, p0, Lcom/facebook/contacts/d/a;->f:Lcom/facebook/contacts/g/a/k;

    .line 51
    iput-object p6, p0, Lcom/facebook/contacts/d/a;->g:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 52
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 65
    sget-object v0, Lcom/facebook/contacts/d/a;->a:Ljava/lang/String;

    const-string v1, "Starting Invite All"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lcom/facebook/contacts/d/a;->e:Lcom/facebook/contacts/data/k;

    sget-object v1, Lcom/facebook/contacts/data/i;->e:Lcom/facebook/contacts/data/j;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v0

    .line 69
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 70
    :cond_0
    sget-object v0, Lcom/facebook/contacts/d/a;->a:Ljava/lang/String;

    const-string v1, "No one to invite"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 99
    :goto_0
    return-object v0

    .line 73
    :cond_1
    iget-object v1, p0, Lcom/facebook/contacts/d/a;->g:Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v2, Ljava/util/HashSet;

    invoke-virtual {v1, v0, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    .line 77
    iget-object v1, p0, Lcom/facebook/contacts/d/a;->b:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/e/e;

    .line 78
    invoke-virtual {v1}, Lcom/facebook/contacts/e/e;->a()V

    .line 81
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 82
    :cond_2
    :goto_1
    invoke-virtual {v1}, Lcom/facebook/contacts/e/e;->e()Lcom/facebook/user/User;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 83
    invoke-virtual {v3}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 84
    invoke-virtual {v2, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 87
    :cond_3
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    .line 89
    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 90
    iget-object v0, p0, Lcom/facebook/contacts/d/a;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 92
    new-instance v2, Lcom/facebook/contacts/server/UsersInviteParams;

    invoke-direct {v2, v1, v0}, Lcom/facebook/contacts/server/UsersInviteParams;-><init>(Lcom/google/common/a/es;Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lcom/facebook/contacts/d/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 94
    iget-object v1, p0, Lcom/facebook/contacts/d/a;->f:Lcom/facebook/contacts/g/a/k;

    invoke-interface {v0, v1, v2}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    :cond_4
    sget-object v0, Lcom/facebook/contacts/d/a;->a:Ljava/lang/String;

    const-string v1, "Done Invite All"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 56
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 57
    sget-object v1, Lcom/facebook/contacts/server/d;->n:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 58
    invoke-direct {p0, p1}, Lcom/facebook/contacts/d/a;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0

    .line 60
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown operation type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
