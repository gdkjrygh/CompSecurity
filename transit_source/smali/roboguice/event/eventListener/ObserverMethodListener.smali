.class public Lroboguice/event/eventListener/ObserverMethodListener;
.super Ljava/lang/Object;
.source "ObserverMethodListener.java"

# interfaces
.implements Lroboguice/event/EventListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lroboguice/event/EventListener",
        "<TT;>;"
    }
.end annotation


# instance fields
.field protected descriptor:Ljava/lang/String;

.field protected instance:Ljava/lang/Object;

.field protected method:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/reflect/Method;)V
    .locals 2
    .param p1, "instance"    # Ljava/lang/Object;
    .param p2, "method"    # Ljava/lang/reflect/Method;

    .prologue
    .line 21
    .local p0, "this":Lroboguice/event/eventListener/ObserverMethodListener;, "Lroboguice/event/eventListener/ObserverMethodListener<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lroboguice/event/eventListener/ObserverMethodListener;->instance:Ljava/lang/Object;

    .line 23
    iput-object p2, p0, Lroboguice/event/eventListener/ObserverMethodListener;->method:Ljava/lang/reflect/Method;

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lroboguice/event/eventListener/javaassist/RuntimeSupport;->makeDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lroboguice/event/eventListener/ObserverMethodListener;->descriptor:Ljava/lang/String;

    .line 27
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 28
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lroboguice/event/eventListener/ObserverMethodListener;, "Lroboguice/event/eventListener/ObserverMethodListener<TT;>;"
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 46
    if-ne p0, p1, :cond_1

    .line 52
    :cond_0
    :goto_0
    return v1

    .line 47
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_3

    :cond_2
    move v1, v2

    goto :goto_0

    :cond_3
    move-object v0, p1

    .line 49
    check-cast v0, Lroboguice/event/eventListener/ObserverMethodListener;

    .line 51
    .local v0, "that":Lroboguice/event/eventListener/ObserverMethodListener;
    iget-object v3, p0, Lroboguice/event/eventListener/ObserverMethodListener;->descriptor:Ljava/lang/String;

    if-eqz v3, :cond_5

    iget-object v3, p0, Lroboguice/event/eventListener/ObserverMethodListener;->descriptor:Ljava/lang/String;

    iget-object v4, v0, Lroboguice/event/eventListener/ObserverMethodListener;->descriptor:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_4
    move v1, v2

    goto :goto_0

    :cond_5
    iget-object v3, v0, Lroboguice/event/eventListener/ObserverMethodListener;->descriptor:Ljava/lang/String;

    if-nez v3, :cond_4

    .line 52
    :cond_6
    iget-object v3, p0, Lroboguice/event/eventListener/ObserverMethodListener;->instance:Ljava/lang/Object;

    if-eqz v3, :cond_8

    iget-object v3, p0, Lroboguice/event/eventListener/ObserverMethodListener;->instance:Ljava/lang/Object;

    iget-object v4, v0, Lroboguice/event/eventListener/ObserverMethodListener;->instance:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    :cond_7
    move v1, v2

    goto :goto_0

    :cond_8
    iget-object v3, v0, Lroboguice/event/eventListener/ObserverMethodListener;->instance:Ljava/lang/Object;

    if-nez v3, :cond_7

    goto :goto_0
.end method

.method public getInstance()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 41
    .local p0, "this":Lroboguice/event/eventListener/ObserverMethodListener;, "Lroboguice/event/eventListener/ObserverMethodListener<TT;>;"
    iget-object v0, p0, Lroboguice/event/eventListener/ObserverMethodListener;->instance:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .prologue
    .local p0, "this":Lroboguice/event/eventListener/ObserverMethodListener;, "Lroboguice/event/eventListener/ObserverMethodListener<TT;>;"
    const/4 v1, 0x0

    .line 58
    iget-object v2, p0, Lroboguice/event/eventListener/ObserverMethodListener;->descriptor:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lroboguice/event/eventListener/ObserverMethodListener;->descriptor:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 59
    .local v0, "result":I
    :goto_0
    mul-int/lit8 v2, v0, 0x1f

    iget-object v3, p0, Lroboguice/event/eventListener/ObserverMethodListener;->instance:Ljava/lang/Object;

    if-eqz v3, :cond_0

    iget-object v1, p0, Lroboguice/event/eventListener/ObserverMethodListener;->instance:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_0
    add-int v0, v2, v1

    .line 60
    return v0

    .end local v0    # "result":I
    :cond_1
    move v0, v1

    .line 58
    goto :goto_0
.end method

.method public onEvent(Ljava/lang/Object;)V
    .locals 5
    .param p1, "event"    # Ljava/lang/Object;

    .prologue
    .line 32
    .local p0, "this":Lroboguice/event/eventListener/ObserverMethodListener;, "Lroboguice/event/eventListener/ObserverMethodListener<TT;>;"
    :try_start_0
    iget-object v1, p0, Lroboguice/event/eventListener/ObserverMethodListener;->method:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lroboguice/event/eventListener/ObserverMethodListener;->instance:Ljava/lang/Object;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 38
    :goto_0
    return-void

    .line 33
    :catch_0
    move-exception v0

    .line 34
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    invoke-static {v0}, Lroboguice/util/Ln;->e(Ljava/lang/Throwable;)I

    goto :goto_0

    .line 35
    .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
    :catch_1
    move-exception v0

    .line 36
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
