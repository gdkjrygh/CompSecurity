.class final Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;
.super Ljava/lang/Object;
.source "BeanPropertyMap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;",
        ">;"
    }
.end annotation


# instance fields
.field private final _buckets:[Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;

.field private _currentBucket:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;

.field private _nextBucketIndex:I


# direct methods
.method public constructor <init>([Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;)V
    .locals 4

    .prologue
    .line 295
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 296
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_buckets:[Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;

    .line 298
    const/4 v1, 0x0

    .line 299
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_buckets:[Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 300
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_buckets:[Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;

    add-int/lit8 v0, v1, 0x1

    aget-object v1, v3, v1

    .line 301
    if-eqz v1, :cond_0

    .line 302
    iput-object v1, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_currentBucket:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;

    .line 306
    :goto_1
    iput v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_nextBucketIndex:I

    .line 307
    return-void

    :cond_0
    move v1, v0

    .line 305
    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 311
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_currentBucket:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public next()Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .locals 4

    .prologue
    .line 317
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_currentBucket:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;

    .line 318
    if-nez v1, :cond_0

    .line 319
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 322
    :cond_0
    iget-object v0, v1, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;->next:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;

    .line 323
    :goto_0
    if-nez v0, :cond_1

    iget v2, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_nextBucketIndex:I

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_buckets:[Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;

    array-length v3, v3

    if-ge v2, v3, :cond_1

    .line 324
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_buckets:[Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;

    iget v2, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_nextBucketIndex:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_nextBucketIndex:I

    aget-object v0, v0, v2

    goto :goto_0

    .line 326
    :cond_1
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->_currentBucket:Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;

    .line 327
    iget-object v0, v1, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$Bucket;->value:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 278
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap$IteratorImpl;->next()Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 332
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
