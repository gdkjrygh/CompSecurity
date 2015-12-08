.class final Lbutterknife/internal/ViewInjection;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final fieldBindings:Ljava/util/Set;

.field private final id:I

.field private final methodBindings:Ljava/util/Map;


# direct methods
.method constructor <init>(I)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lbutterknife/internal/ViewInjection;->fieldBindings:Ljava/util/Set;

    .line 15
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lbutterknife/internal/ViewInjection;->methodBindings:Ljava/util/Map;

    .line 19
    iput p1, p0, Lbutterknife/internal/ViewInjection;->id:I

    .line 20
    return-void
.end method


# virtual methods
.method public final addFieldBinding(Lbutterknife/internal/FieldBinding;)V
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lbutterknife/internal/ViewInjection;->fieldBindings:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 64
    return-void
.end method

.method public final addMethodBinding(Lbutterknife/internal/Listener;Lbutterknife/internal/MethodBinding;)V
    .locals 4

    .prologue
    .line 50
    iget-object v0, p0, Lbutterknife/internal/ViewInjection;->methodBindings:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbutterknife/internal/MethodBinding;

    .line 51
    if-eqz v0, :cond_0

    .line 52
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "View "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lbutterknife/internal/ViewInjection;->id:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " already has method binding for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lbutterknife/internal/Listener;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lbutterknife/internal/MethodBinding;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 59
    :cond_0
    iget-object v0, p0, Lbutterknife/internal/ViewInjection;->methodBindings:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    return-void
.end method

.method public final getFieldBindings()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lbutterknife/internal/ViewInjection;->fieldBindings:Ljava/util/Set;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lbutterknife/internal/ViewInjection;->id:I

    return v0
.end method

.method public final getMethodBindings()Ljava/util/Map;
    .locals 2

    .prologue
    .line 31
    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lbutterknife/internal/ViewInjection;->methodBindings:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getRequiredBindings()Ljava/util/List;
    .locals 4

    .prologue
    .line 35
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    iget-object v0, p0, Lbutterknife/internal/ViewInjection;->fieldBindings:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbutterknife/internal/FieldBinding;

    .line 37
    invoke-virtual {v0}, Lbutterknife/internal/FieldBinding;->isRequired()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 38
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 41
    :cond_1
    iget-object v0, p0, Lbutterknife/internal/ViewInjection;->methodBindings:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbutterknife/internal/MethodBinding;

    .line 42
    invoke-virtual {v0}, Lbutterknife/internal/MethodBinding;->isRequired()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 43
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 46
    :cond_3
    return-object v1
.end method
