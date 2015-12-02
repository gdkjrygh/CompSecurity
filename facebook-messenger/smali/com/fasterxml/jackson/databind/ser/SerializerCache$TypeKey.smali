.class public final Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;
.super Ljava/lang/Object;
.source "SerializerCache.java"


# instance fields
.field protected _class:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field protected _hashCode:I

.field protected _isTyped:Z

.field protected _type:Lcom/fasterxml/jackson/databind/JavaType;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/JavaType;Z)V
    .locals 1

    .prologue
    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 215
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    .line 216
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_class:Ljava/lang/Class;

    .line 217
    iput-boolean p2, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_isTyped:Z

    .line 218
    invoke-static {p1, p2}, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->hash(Lcom/fasterxml/jackson/databind/JavaType;Z)I

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_hashCode:I

    .line 219
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;Z)V"
        }
    .end annotation

    .prologue
    .line 207
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 208
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_class:Ljava/lang/Class;

    .line 209
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    .line 210
    iput-boolean p2, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_isTyped:Z

    .line 211
    invoke-static {p1, p2}, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->hash(Ljava/lang/Class;Z)I

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_hashCode:I

    .line 212
    return-void
.end method

.method private static final hash(Lcom/fasterxml/jackson/databind/JavaType;Z)I
    .locals 1

    .prologue
    .line 230
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JavaType;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 231
    if-eqz p1, :cond_0

    .line 232
    add-int/lit8 v0, v0, -0x1

    .line 234
    :cond_0
    return v0
.end method

.method private static final hash(Ljava/lang/Class;Z)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;Z)I"
        }
    .end annotation

    .prologue
    .line 222
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 223
    if-eqz p1, :cond_0

    .line 224
    add-int/lit8 v0, v0, 0x1

    .line 226
    :cond_0
    return v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 277
    if-ne p1, p0, :cond_1

    .line 285
    :cond_0
    :goto_0
    return v0

    .line 278
    :cond_1
    check-cast p1, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;

    .line 279
    iget-boolean v2, p1, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_isTyped:Z

    iget-boolean v3, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_isTyped:Z

    if-ne v2, v3, :cond_3

    .line 280
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_class:Ljava/lang/Class;

    if-eqz v2, :cond_2

    .line 281
    iget-object v2, p1, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_class:Ljava/lang/Class;

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_class:Ljava/lang/Class;

    if-eq v2, v3, :cond_0

    move v0, v1

    goto :goto_0

    .line 283
    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    iget-object v1, p1, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JavaType;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_3
    move v0, v1

    .line 285
    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 265
    iget v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_hashCode:I

    return v0
.end method

.method public resetTyped(Lcom/fasterxml/jackson/databind/JavaType;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 252
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    .line 253
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_class:Ljava/lang/Class;

    .line 254
    iput-boolean v1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_isTyped:Z

    .line 255
    invoke-static {p1, v1}, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->hash(Lcom/fasterxml/jackson/databind/JavaType;Z)I

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_hashCode:I

    .line 256
    return-void
.end method

.method public resetTyped(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 238
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    .line 239
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_class:Ljava/lang/Class;

    .line 240
    iput-boolean v1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_isTyped:Z

    .line 241
    invoke-static {p1, v1}, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->hash(Ljava/lang/Class;Z)I

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_hashCode:I

    .line 242
    return-void
.end method

.method public resetUntyped(Lcom/fasterxml/jackson/databind/JavaType;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 259
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    .line 260
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_class:Ljava/lang/Class;

    .line 261
    iput-boolean v1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_isTyped:Z

    .line 262
    invoke-static {p1, v1}, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->hash(Lcom/fasterxml/jackson/databind/JavaType;Z)I

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_hashCode:I

    .line 263
    return-void
.end method

.method public resetUntyped(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 245
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    .line 246
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_class:Ljava/lang/Class;

    .line 247
    iput-boolean v1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_isTyped:Z

    .line 248
    invoke-static {p1, v1}, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->hash(Ljava/lang/Class;Z)I

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_hashCode:I

    .line 249
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 268
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_class:Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 269
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{class: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_class:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", typed? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_isTyped:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 271
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", typed? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/fasterxml/jackson/databind/ser/SerializerCache$TypeKey;->_isTyped:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
