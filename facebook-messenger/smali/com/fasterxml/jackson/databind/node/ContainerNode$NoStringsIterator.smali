.class public Lcom/fasterxml/jackson/databind/node/ContainerNode$NoStringsIterator;
.super Ljava/lang/Object;
.source "ContainerNode.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field static final instance:Lcom/fasterxml/jackson/databind/node/ContainerNode$NoStringsIterator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 160
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ContainerNode$NoStringsIterator;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/node/ContainerNode$NoStringsIterator;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/node/ContainerNode$NoStringsIterator;->instance:Lcom/fasterxml/jackson/databind/node/ContainerNode$NoStringsIterator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static instance()Lcom/fasterxml/jackson/databind/node/ContainerNode$NoStringsIterator;
    .locals 1

    .prologue
    .line 164
    sget-object v0, Lcom/fasterxml/jackson/databind/node/ContainerNode$NoStringsIterator;->instance:Lcom/fasterxml/jackson/databind/node/ContainerNode$NoStringsIterator;

    return-object v0
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 167
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 157
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/ContainerNode$NoStringsIterator;->next()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public next()Ljava/lang/String;
    .locals 1

    .prologue
    .line 169
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 174
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
