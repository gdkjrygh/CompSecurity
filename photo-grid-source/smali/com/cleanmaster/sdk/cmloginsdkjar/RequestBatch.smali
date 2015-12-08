.class public Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;
.super Ljava/util/AbstractList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList",
        "<",
        "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
        ">;"
    }
.end annotation


# static fields
.field private static idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private batchApplicationId:Ljava/lang/String;

.field private callbackHandler:Landroid/os/Handler;

.field private callbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$Callback;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private requests:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;"
        }
    .end annotation
.end field

.field private timeoutInMilliseconds:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    .line 16
    const/16 v0, 0x2710

    iput v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->timeoutInMilliseconds:I

    .line 17
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->id:Ljava/lang/String;

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbacks:Ljava/util/List;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    .line 26
    return-void
.end method

.method public constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V
    .locals 2

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    .line 16
    const/16 v0, 0x2710

    iput v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->timeoutInMilliseconds:I

    .line 17
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->id:Ljava/lang/String;

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbacks:Ljava/util/List;

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    .line 56
    iget-object v0, p1, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbackHandler:Landroid/os/Handler;

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbackHandler:Landroid/os/Handler;

    .line 57
    iget v0, p1, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->timeoutInMilliseconds:I

    iput v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->timeoutInMilliseconds:I

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbacks:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbacks:Ljava/util/List;

    .line 59
    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 32
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    .line 16
    const/16 v0, 0x2710

    iput v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->timeoutInMilliseconds:I

    .line 17
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->id:Ljava/lang/String;

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbacks:Ljava/util/List;

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    .line 35
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 36
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getTimeout()I

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->getTimeout()I

    move-result v0

    iput v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->timeoutInMilliseconds:I

    .line 40
    :cond_0
    return-void
.end method

.method public varargs constructor <init>([Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    .line 16
    const/16 v0, 0x2710

    iput v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->timeoutInMilliseconds:I

    .line 17
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->id:Ljava/lang/String;

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbacks:Ljava/util/List;

    .line 47
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    .line 48
    return-void
.end method


# virtual methods
.method public final add(ILcom/cleanmaster/sdk/cmloginsdkjar/Request;)V
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 108
    return-void
.end method

.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 11
    check-cast p2, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    invoke-virtual {p0, p1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->add(ILcom/cleanmaster/sdk/cmloginsdkjar/Request;)V

    return-void
.end method

.method public final add(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)Z
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 11
    check-cast p1, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    invoke-virtual {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->add(Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)Z

    move-result v0

    return v0
.end method

.method public addCallback(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$Callback;)V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    :cond_0
    return-void
.end method

.method public final clear()V
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 113
    return-void
.end method

.method public final executeAndWait()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 177
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->executeAndWaitImpl()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method executeAndWaitImpl()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 227
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeBatchAndWait(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final executeAsync()Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;
    .locals 1

    .prologue
    .line 194
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->executeAsyncImpl()Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;

    move-result-object v0

    return-object v0
.end method

.method executeAsyncImpl()Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;
    .locals 1

    .prologue
    .line 231
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeBatchAsync(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;

    move-result-object v0

    return-object v0
.end method

.method public final get(I)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 11
    invoke-virtual {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->get(I)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    return-object v0
.end method

.method final getBatchApplicationId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->batchApplicationId:Ljava/lang/String;

    return-object v0
.end method

.method final getCallbackHandler()Landroid/os/Handler;
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbackHandler:Landroid/os/Handler;

    return-object v0
.end method

.method final getCallbacks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$Callback;",
            ">;"
        }
    .end annotation

    .prologue
    .line 152
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbacks:Ljava/util/List;

    return-object v0
.end method

.method final getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->id:Ljava/lang/String;

    return-object v0
.end method

.method final getRequests()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;"
        }
    .end annotation

    .prologue
    .line 148
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    return-object v0
.end method

.method public getTimeout()I
    .locals 1

    .prologue
    .line 66
    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->timeoutInMilliseconds:I

    return v0
.end method

.method public final remove(I)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    return-object v0
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 11
    invoke-virtual {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->remove(I)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    return-object v0
.end method

.method public removeCallback(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$Callback;)V
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 98
    return-void
.end method

.method public final set(ILcom/cleanmaster/sdk/cmloginsdkjar/Request;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    return-object v0
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 11
    check-cast p2, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    invoke-virtual {p0, p1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->set(ILcom/cleanmaster/sdk/cmloginsdkjar/Request;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    move-result-object v0

    return-object v0
.end method

.method final setBatchApplicationId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->batchApplicationId:Ljava/lang/String;

    .line 161
    return-void
.end method

.method final setCallbackHandler(Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->callbackHandler:Landroid/os/Handler;

    .line 145
    return-void
.end method

.method public setTimeout(I)V
    .locals 2

    .prologue
    .line 74
    if-gez p1, :cond_0

    .line 75
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Argument timeoutInMilliseconds must be >= 0."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 77
    :cond_0
    iput p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->timeoutInMilliseconds:I

    .line 78
    return-void
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
