.class public Lcom/google/inject/name/Names;
.super Ljava/lang/Object;
.source "Names.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bindProperties(Lcom/google/inject/Binder;Ljava/util/Map;)V
    .locals 7
    .param p0, "binder"    # Lcom/google/inject/Binder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Binder;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 46
    .local p1, "properties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Lcom/google/inject/name/Names;

    aput-object v6, v4, v5

    invoke-interface {p0, v4}, Lcom/google/inject/Binder;->skipSources([Ljava/lang/Class;)Lcom/google/inject/Binder;

    move-result-object p0

    .line 47
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 48
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 49
    .local v2, "key":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 50
    .local v3, "value":Ljava/lang/String;
    const-class v4, Ljava/lang/String;

    new-instance v5, Lcom/google/inject/name/NamedImpl;

    invoke-direct {v5, v2}, Lcom/google/inject/name/NamedImpl;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v5}, Lcom/google/inject/Key;->get(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)Lcom/google/inject/Key;

    move-result-object v4

    invoke-interface {p0, v4}, Lcom/google/inject/Binder;->bind(Lcom/google/inject/Key;)Lcom/google/inject/binder/LinkedBindingBuilder;

    move-result-object v4

    invoke-interface {v4, v3}, Lcom/google/inject/binder/LinkedBindingBuilder;->toInstance(Ljava/lang/Object;)V

    goto :goto_0

    .line 52
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v2    # "key":Ljava/lang/String;
    .end local v3    # "value":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public static bindProperties(Lcom/google/inject/Binder;Ljava/util/Properties;)V
    .locals 6
    .param p0, "binder"    # Lcom/google/inject/Binder;
    .param p1, "properties"    # Ljava/util/Properties;

    .prologue
    .line 60
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Lcom/google/inject/name/Names;

    aput-object v5, v3, v4

    invoke-interface {p0, v3}, Lcom/google/inject/Binder;->skipSources([Ljava/lang/Class;)Lcom/google/inject/Binder;

    move-result-object p0

    .line 63
    invoke-virtual {p1}, Ljava/util/Properties;->propertyNames()Ljava/util/Enumeration;

    move-result-object v0

    .local v0, "e":Ljava/util/Enumeration;, "Ljava/util/Enumeration<*>;"
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 64
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 65
    .local v1, "propertyName":Ljava/lang/String;
    invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 66
    .local v2, "value":Ljava/lang/String;
    const-class v3, Ljava/lang/String;

    new-instance v4, Lcom/google/inject/name/NamedImpl;

    invoke-direct {v4, v1}, Lcom/google/inject/name/NamedImpl;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v4}, Lcom/google/inject/Key;->get(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)Lcom/google/inject/Key;

    move-result-object v3

    invoke-interface {p0, v3}, Lcom/google/inject/Binder;->bind(Lcom/google/inject/Key;)Lcom/google/inject/binder/LinkedBindingBuilder;

    move-result-object v3

    invoke-interface {v3, v2}, Lcom/google/inject/binder/LinkedBindingBuilder;->toInstance(Ljava/lang/Object;)V

    goto :goto_0

    .line 68
    .end local v1    # "propertyName":Ljava/lang/String;
    .end local v2    # "value":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public static named(Ljava/lang/String;)Lcom/google/inject/name/Named;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 38
    new-instance v0, Lcom/google/inject/name/NamedImpl;

    invoke-direct {v0, p0}, Lcom/google/inject/name/NamedImpl;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
