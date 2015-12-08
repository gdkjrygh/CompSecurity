.class final Lcom/google/inject/internal/EncounterImpl;
.super Ljava/lang/Object;
.source "EncounterImpl.java"

# interfaces
.implements Lcom/google/inject/spi/TypeEncounter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/spi/TypeEncounter",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final errors:Lcom/google/inject/internal/Errors;

.field private injectionListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/InjectionListener",
            "<-TT;>;>;"
        }
    .end annotation
.end field

.field private final lookups:Lcom/google/inject/internal/Lookups;

.field private membersInjectors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/MembersInjector",
            "<-TT;>;>;"
        }
    .end annotation
.end field

.field private valid:Z


# direct methods
.method constructor <init>(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/Lookups;)V
    .locals 1
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .param p2, "lookups"    # Lcom/google/inject/internal/Lookups;

    .prologue
    .line 48
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/inject/internal/EncounterImpl;->valid:Z

    .line 49
    iput-object p1, p0, Lcom/google/inject/internal/EncounterImpl;->errors:Lcom/google/inject/internal/Errors;

    .line 50
    iput-object p2, p0, Lcom/google/inject/internal/EncounterImpl;->lookups:Lcom/google/inject/internal/Lookups;

    .line 51
    return-void
.end method


# virtual methods
.method public addError(Lcom/google/inject/spi/Message;)V
    .locals 2
    .param p1, "message"    # Lcom/google/inject/spi/Message;

    .prologue
    .line 120
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    iget-boolean v0, p0, Lcom/google/inject/internal/EncounterImpl;->valid:Z

    const-string v1, "Encounters may not be used after hear() returns."

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 121
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/Errors;->addMessage(Lcom/google/inject/spi/Message;)Lcom/google/inject/internal/Errors;

    .line 122
    return-void
.end method

.method public varargs addError(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "arguments"    # [Ljava/lang/Object;

    .prologue
    .line 110
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    iget-boolean v0, p0, Lcom/google/inject/internal/EncounterImpl;->valid:Z

    const-string v1, "Encounters may not be used after hear() returns."

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 111
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v0, p1, p2}, Lcom/google/inject/internal/Errors;->addMessage(Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    .line 112
    return-void
.end method

.method public addError(Ljava/lang/Throwable;)V
    .locals 5
    .param p1, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 115
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    iget-boolean v0, p0, Lcom/google/inject/internal/EncounterImpl;->valid:Z

    const-string v1, "Encounters may not be used after hear() returns."

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 116
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->errors:Lcom/google/inject/internal/Errors;

    const-string v1, "An exception was caught and reported. Message: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/inject/internal/Errors;->errorInUserCode(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    .line 117
    return-void
.end method

.method getInjectionListeners()Lcom/google/inject/internal/util/$ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Lcom/google/inject/spi/InjectionListener",
            "<-TT;>;>;"
        }
    .end annotation

    .prologue
    .line 84
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->injectionListeners:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableList;->of()Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->injectionListeners:Ljava/util/List;

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableList;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    goto :goto_0
.end method

.method public getMembersInjector(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/MembersInjector;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;)",
            "Lcom/google/inject/MembersInjector",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 134
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    .local p1, "typeLiteral":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    iget-boolean v0, p0, Lcom/google/inject/internal/EncounterImpl;->valid:Z

    const-string v1, "Encounters may not be used after hear() returns."

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 135
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->lookups:Lcom/google/inject/internal/Lookups;

    invoke-interface {v0, p1}, Lcom/google/inject/internal/Lookups;->getMembersInjector(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/MembersInjector;

    move-result-object v0

    return-object v0
.end method

.method public getMembersInjector(Ljava/lang/Class;)Lcom/google/inject/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/inject/MembersInjector",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 139
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-static {p1}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/EncounterImpl;->getMembersInjector(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/MembersInjector;

    move-result-object v0

    return-object v0
.end method

.method getMembersInjectors()Lcom/google/inject/internal/util/$ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Lcom/google/inject/MembersInjector",
            "<-TT;>;>;"
        }
    .end annotation

    .prologue
    .line 78
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->membersInjectors:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableList;->of()Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->membersInjectors:Ljava/util/List;

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableList;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    goto :goto_0
.end method

.method public getProvider(Lcom/google/inject/Key;)Lcom/google/inject/Provider;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Key",
            "<TT;>;)",
            "Lcom/google/inject/Provider",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 125
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    iget-boolean v0, p0, Lcom/google/inject/internal/EncounterImpl;->valid:Z

    const-string v1, "Encounters may not be used after hear() returns."

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 126
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->lookups:Lcom/google/inject/internal/Lookups;

    invoke-interface {v0, p1}, Lcom/google/inject/internal/Lookups;->getProvider(Lcom/google/inject/Key;)Lcom/google/inject/Provider;

    move-result-object v0

    return-object v0
.end method

.method public getProvider(Ljava/lang/Class;)Lcom/google/inject/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/inject/Provider",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 130
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-static {p1}, Lcom/google/inject/Key;->get(Ljava/lang/Class;)Lcom/google/inject/Key;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/EncounterImpl;->getProvider(Lcom/google/inject/Key;)Lcom/google/inject/Provider;

    move-result-object v0

    return-object v0
.end method

.method invalidate()V
    .locals 1

    .prologue
    .line 54
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/inject/internal/EncounterImpl;->valid:Z

    .line 55
    return-void
.end method

.method public register(Lcom/google/inject/MembersInjector;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/MembersInjector",
            "<-TT;>;)V"
        }
    .end annotation

    .prologue
    .line 90
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    .local p1, "membersInjector":Lcom/google/inject/MembersInjector;, "Lcom/google/inject/MembersInjector<-TT;>;"
    iget-boolean v0, p0, Lcom/google/inject/internal/EncounterImpl;->valid:Z

    const-string v1, "Encounters may not be used after hear() returns."

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->membersInjectors:Ljava/util/List;

    if-nez v0, :cond_0

    .line 93
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->membersInjectors:Ljava/util/List;

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->membersInjectors:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    return-void
.end method

.method public register(Lcom/google/inject/spi/InjectionListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/InjectionListener",
            "<-TT;>;)V"
        }
    .end annotation

    .prologue
    .line 100
    .local p0, "this":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    .local p1, "injectionListener":Lcom/google/inject/spi/InjectionListener;, "Lcom/google/inject/spi/InjectionListener<-TT;>;"
    iget-boolean v0, p0, Lcom/google/inject/internal/EncounterImpl;->valid:Z

    const-string v1, "Encounters may not be used after hear() returns."

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 102
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->injectionListeners:Ljava/util/List;

    if-nez v0, :cond_0

    .line 103
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->injectionListeners:Ljava/util/List;

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/EncounterImpl;->injectionListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    return-void
.end method
