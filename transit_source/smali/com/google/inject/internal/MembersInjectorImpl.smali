.class final Lcom/google/inject/internal/MembersInjectorImpl;
.super Ljava/lang/Object;
.source "MembersInjectorImpl.java"

# interfaces
.implements Lcom/google/inject/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/MembersInjector",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final injectionListeners:Lcom/google/inject/internal/util/$ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Lcom/google/inject/spi/InjectionListener",
            "<-TT;>;>;"
        }
    .end annotation
.end field

.field private final injector:Lcom/google/inject/internal/InjectorImpl;

.field private final memberInjectors:Lcom/google/inject/internal/util/$ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Lcom/google/inject/internal/SingleMemberInjector;",
            ">;"
        }
    .end annotation
.end field

.field private final typeLiteral:Lcom/google/inject/TypeLiteral;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final userMembersInjectors:Lcom/google/inject/internal/util/$ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Lcom/google/inject/MembersInjector",
            "<-TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/TypeLiteral;Lcom/google/inject/internal/EncounterImpl;Lcom/google/inject/internal/util/$ImmutableList;)V
    .locals 1
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;",
            "Lcom/google/inject/internal/EncounterImpl",
            "<TT;>;",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Lcom/google/inject/internal/SingleMemberInjector;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 42
    .local p0, "this":Lcom/google/inject/internal/MembersInjectorImpl;, "Lcom/google/inject/internal/MembersInjectorImpl<TT;>;"
    .local p2, "typeLiteral":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    .local p3, "encounter":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    .local p4, "memberInjectors":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<Lcom/google/inject/internal/SingleMemberInjector;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/google/inject/internal/MembersInjectorImpl;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 44
    iput-object p2, p0, Lcom/google/inject/internal/MembersInjectorImpl;->typeLiteral:Lcom/google/inject/TypeLiteral;

    .line 45
    iput-object p4, p0, Lcom/google/inject/internal/MembersInjectorImpl;->memberInjectors:Lcom/google/inject/internal/util/$ImmutableList;

    .line 46
    invoke-virtual {p3}, Lcom/google/inject/internal/EncounterImpl;->getMembersInjectors()Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/MembersInjectorImpl;->userMembersInjectors:Lcom/google/inject/internal/util/$ImmutableList;

    .line 47
    invoke-virtual {p3}, Lcom/google/inject/internal/EncounterImpl;->getInjectionListeners()Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/MembersInjectorImpl;->injectionListeners:Lcom/google/inject/internal/util/$ImmutableList;

    .line 51
    return-void
.end method


# virtual methods
.method public getInjectionPoints()Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;"
        }
    .end annotation

    .prologue
    .line 133
    .local p0, "this":Lcom/google/inject/internal/MembersInjectorImpl;, "Lcom/google/inject/internal/MembersInjectorImpl<TT;>;"
    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableSet;->builder()Lcom/google/inject/internal/util/$ImmutableSet$Builder;

    move-result-object v0

    .line 134
    .local v0, "builder":Lcom/google/inject/internal/util/$ImmutableSet$Builder;, "Lcom/google/inject/internal/util/$ImmutableSet$Builder<Lcom/google/inject/spi/InjectionPoint;>;"
    iget-object v3, p0, Lcom/google/inject/internal/MembersInjectorImpl;->memberInjectors:Lcom/google/inject/internal/util/$ImmutableList;

    invoke-virtual {v3}, Lcom/google/inject/internal/util/$ImmutableList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/inject/internal/SingleMemberInjector;

    .line 135
    .local v2, "memberInjector":Lcom/google/inject/internal/SingleMemberInjector;
    invoke-interface {v2}, Lcom/google/inject/internal/SingleMemberInjector;->getInjectionPoint()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->add(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet$Builder;

    goto :goto_0

    .line 137
    .end local v2    # "memberInjector":Lcom/google/inject/internal/SingleMemberInjector;
    :cond_0
    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->build()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v3

    return-object v3
.end method

.method public getMemberInjectors()Lcom/google/inject/internal/util/$ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Lcom/google/inject/internal/SingleMemberInjector;",
            ">;"
        }
    .end annotation

    .prologue
    .line 54
    .local p0, "this":Lcom/google/inject/internal/MembersInjectorImpl;, "Lcom/google/inject/internal/MembersInjectorImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/MembersInjectorImpl;->memberInjectors:Lcom/google/inject/internal/util/$ImmutableList;

    return-object v0
.end method

.method injectAndNotify(Ljava/lang/Object;Lcom/google/inject/internal/Errors;Z)V
    .locals 2
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .param p3, "toolableOnly"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/inject/internal/Errors;",
            "Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 69
    .local p0, "this":Lcom/google/inject/internal/MembersInjectorImpl;, "Lcom/google/inject/internal/MembersInjectorImpl<TT;>;"
    .local p1, "instance":Ljava/lang/Object;, "TT;"
    if-nez p1, :cond_1

    .line 91
    :cond_0
    :goto_0
    return-void

    .line 73
    :cond_1
    iget-object v0, p0, Lcom/google/inject/internal/MembersInjectorImpl;->injector:Lcom/google/inject/internal/InjectorImpl;

    new-instance v1, Lcom/google/inject/internal/MembersInjectorImpl$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/inject/internal/MembersInjectorImpl$1;-><init>(Lcom/google/inject/internal/MembersInjectorImpl;Ljava/lang/Object;Lcom/google/inject/internal/Errors;Z)V

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/InjectorImpl;->callInContext(Lcom/google/inject/internal/ContextualCallable;)Ljava/lang/Object;

    .line 88
    if-nez p3, :cond_0

    .line 89
    invoke-virtual {p0, p1, p2}, Lcom/google/inject/internal/MembersInjectorImpl;->notifyListeners(Ljava/lang/Object;Lcom/google/inject/internal/Errors;)V

    goto :goto_0
.end method

.method public injectMembers(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 58
    .local p0, "this":Lcom/google/inject/internal/MembersInjectorImpl;, "Lcom/google/inject/internal/MembersInjectorImpl<TT;>;"
    .local p1, "instance":Ljava/lang/Object;, "TT;"
    new-instance v1, Lcom/google/inject/internal/Errors;

    iget-object v2, p0, Lcom/google/inject/internal/MembersInjectorImpl;->typeLiteral:Lcom/google/inject/TypeLiteral;

    invoke-direct {v1, v2}, Lcom/google/inject/internal/Errors;-><init>(Ljava/lang/Object;)V

    .line 60
    .local v1, "errors":Lcom/google/inject/internal/Errors;
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v1, v2}, Lcom/google/inject/internal/MembersInjectorImpl;->injectAndNotify(Ljava/lang/Object;Lcom/google/inject/internal/Errors;Z)V
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    :goto_0
    invoke-virtual {v1}, Lcom/google/inject/internal/Errors;->throwProvisionExceptionIfErrorsExist()V

    .line 66
    return-void

    .line 61
    :catch_0
    move-exception v0

    .line 62
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_0
.end method

.method injectMembers(Ljava/lang/Object;Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Z)V
    .locals 6
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .param p3, "context"    # Lcom/google/inject/internal/InternalContext;
    .param p4, "toolableOnly"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/inject/internal/Errors;",
            "Lcom/google/inject/internal/InternalContext;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 107
    .local p0, "this":Lcom/google/inject/internal/MembersInjectorImpl;, "Lcom/google/inject/internal/MembersInjectorImpl<TT;>;"
    .local p1, "t":Ljava/lang/Object;, "TT;"
    const/4 v1, 0x0

    .local v1, "i":I
    iget-object v5, p0, Lcom/google/inject/internal/MembersInjectorImpl;->memberInjectors:Lcom/google/inject/internal/util/$ImmutableList;

    invoke-virtual {v5}, Lcom/google/inject/internal/util/$ImmutableList;->size()I

    move-result v3

    .local v3, "size":I
    :goto_0
    if-ge v1, v3, :cond_2

    .line 108
    iget-object v5, p0, Lcom/google/inject/internal/MembersInjectorImpl;->memberInjectors:Lcom/google/inject/internal/util/$ImmutableList;

    invoke-virtual {v5, v1}, Lcom/google/inject/internal/util/$ImmutableList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/inject/internal/SingleMemberInjector;

    .line 109
    .local v2, "injector":Lcom/google/inject/internal/SingleMemberInjector;
    if-eqz p4, :cond_0

    invoke-interface {v2}, Lcom/google/inject/internal/SingleMemberInjector;->getInjectionPoint()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/inject/spi/InjectionPoint;->isToolable()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 110
    :cond_0
    invoke-interface {v2, p2, p3, p1}, Lcom/google/inject/internal/SingleMemberInjector;->inject(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Ljava/lang/Object;)V

    .line 107
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 115
    .end local v2    # "injector":Lcom/google/inject/internal/SingleMemberInjector;
    :cond_2
    if-nez p4, :cond_3

    .line 117
    const/4 v1, 0x0

    iget-object v5, p0, Lcom/google/inject/internal/MembersInjectorImpl;->userMembersInjectors:Lcom/google/inject/internal/util/$ImmutableList;

    invoke-virtual {v5}, Lcom/google/inject/internal/util/$ImmutableList;->size()I

    move-result v3

    :goto_1
    if-ge v1, v3, :cond_3

    .line 118
    iget-object v5, p0, Lcom/google/inject/internal/MembersInjectorImpl;->userMembersInjectors:Lcom/google/inject/internal/util/$ImmutableList;

    invoke-virtual {v5, v1}, Lcom/google/inject/internal/util/$ImmutableList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/inject/MembersInjector;

    .line 120
    .local v4, "userMembersInjector":Lcom/google/inject/MembersInjector;, "Lcom/google/inject/MembersInjector<-TT;>;"
    :try_start_0
    invoke-interface {v4, p1}, Lcom/google/inject/MembersInjector;->injectMembers(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 121
    :catch_0
    move-exception v0

    .line 122
    .local v0, "e":Ljava/lang/RuntimeException;
    iget-object v5, p0, Lcom/google/inject/internal/MembersInjectorImpl;->typeLiteral:Lcom/google/inject/TypeLiteral;

    invoke-virtual {p2, v4, v5, v0}, Lcom/google/inject/internal/Errors;->errorInUserInjector(Lcom/google/inject/MembersInjector;Lcom/google/inject/TypeLiteral;Ljava/lang/RuntimeException;)Lcom/google/inject/internal/Errors;

    goto :goto_2

    .line 126
    .end local v0    # "e":Ljava/lang/RuntimeException;
    .end local v4    # "userMembersInjector":Lcom/google/inject/MembersInjector;, "Lcom/google/inject/MembersInjector<-TT;>;"
    :cond_3
    return-void
.end method

.method notifyListeners(Ljava/lang/Object;Lcom/google/inject/internal/Errors;)V
    .locals 5
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/inject/internal/Errors;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 94
    .local p0, "this":Lcom/google/inject/internal/MembersInjectorImpl;, "Lcom/google/inject/internal/MembersInjectorImpl<TT;>;"
    .local p1, "instance":Ljava/lang/Object;, "TT;"
    invoke-virtual {p2}, Lcom/google/inject/internal/Errors;->size()I

    move-result v3

    .line 95
    .local v3, "numErrorsBefore":I
    iget-object v4, p0, Lcom/google/inject/internal/MembersInjectorImpl;->injectionListeners:Lcom/google/inject/internal/util/$ImmutableList;

    invoke-virtual {v4}, Lcom/google/inject/internal/util/$ImmutableList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/inject/spi/InjectionListener;

    .line 97
    .local v2, "injectionListener":Lcom/google/inject/spi/InjectionListener;, "Lcom/google/inject/spi/InjectionListener<-TT;>;"
    :try_start_0
    invoke-interface {v2, p1}, Lcom/google/inject/spi/InjectionListener;->afterInjection(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 98
    :catch_0
    move-exception v0

    .line 99
    .local v0, "e":Ljava/lang/RuntimeException;
    iget-object v4, p0, Lcom/google/inject/internal/MembersInjectorImpl;->typeLiteral:Lcom/google/inject/TypeLiteral;

    invoke-virtual {p2, v2, v4, v0}, Lcom/google/inject/internal/Errors;->errorNotifyingInjectionListener(Lcom/google/inject/spi/InjectionListener;Lcom/google/inject/TypeLiteral;Ljava/lang/RuntimeException;)Lcom/google/inject/internal/Errors;

    goto :goto_0

    .line 102
    .end local v0    # "e":Ljava/lang/RuntimeException;
    .end local v2    # "injectionListener":Lcom/google/inject/spi/InjectionListener;, "Lcom/google/inject/spi/InjectionListener<-TT;>;"
    :cond_0
    invoke-virtual {p2, v3}, Lcom/google/inject/internal/Errors;->throwIfNewErrors(I)V

    .line 103
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 129
    .local p0, "this":Lcom/google/inject/internal/MembersInjectorImpl;, "Lcom/google/inject/internal/MembersInjectorImpl<TT;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MembersInjector<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/internal/MembersInjectorImpl;->typeLiteral:Lcom/google/inject/TypeLiteral;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
