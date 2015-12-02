.class public abstract Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;
.super Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;
.source "BeanSerializerBase.java"

# interfaces
.implements Lcom/fasterxml/jackson/databind/jsonschema/SchemaAware;
.implements Lcom/fasterxml/jackson/databind/ser/ContextualSerializer;
.implements Lcom/fasterxml/jackson/databind/ser/ResolvableSerializer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer",
        "<",
        "Ljava/lang/Object;",
        ">;",
        "Lcom/fasterxml/jackson/databind/jsonschema/SchemaAware;",
        "Lcom/fasterxml/jackson/databind/ser/ContextualSerializer;",
        "Lcom/fasterxml/jackson/databind/ser/ResolvableSerializer;"
    }
.end annotation


# static fields
.field protected static final NO_PROPS:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;


# instance fields
.field protected final _anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

.field protected final _filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

.field protected final _objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

.field protected final _propertyFilterId:Ljava/lang/Object;

.field protected final _props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

.field protected final _typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    sput-object v0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->NO_PROPS:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 101
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;-><init>(Lcom/fasterxml/jackson/databind/JavaType;)V

    .line 102
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 103
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 104
    if-nez p2, :cond_0

    .line 105
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 106
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    .line 107
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_propertyFilterId:Ljava/lang/Object;

    .line 108
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    .line 115
    :goto_0
    return-void

    .line 110
    :cond_0
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->getTypeId()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 111
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->getAnyGetter()Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    .line 112
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->getFilterId()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_propertyFilterId:Ljava/lang/Object;

    .line 113
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/ser/BeanSerializerBuilder;->getObjectIdWriter()Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    goto :goto_0
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;)V
    .locals 2

    .prologue
    .line 205
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    iget-object v1, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    invoke-direct {p0, p1, v0, v1}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;-><init>(Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)V

    .line 206
    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;)V
    .locals 1

    .prologue
    .line 132
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_handledType:Ljava/lang/Class;

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;-><init>(Ljava/lang/Class;)V

    .line 133
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 134
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 136
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 137
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    .line 138
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    .line 139
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_propertyFilterId:Ljava/lang/Object;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_propertyFilterId:Ljava/lang/Object;

    .line 140
    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;Lcom/fasterxml/jackson/databind/util/NameTransformer;)V
    .locals 2

    .prologue
    .line 213
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    invoke-static {v0, p2}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->rename([Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;Lcom/fasterxml/jackson/databind/util/NameTransformer;)[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    move-result-object v0

    iget-object v1, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    invoke-static {v1, p2}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->rename([Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;Lcom/fasterxml/jackson/databind/util/NameTransformer;)[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;-><init>(Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)V

    .line 214
    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)V
    .locals 1

    .prologue
    .line 120
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_handledType:Ljava/lang/Class;

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;-><init>(Ljava/lang/Class;)V

    .line 121
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 122
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 124
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 125
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    .line 126
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    .line 127
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_propertyFilterId:Ljava/lang/Object;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_propertyFilterId:Ljava/lang/Object;

    .line 128
    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;[Ljava/lang/String;)V
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 144
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_handledType:Ljava/lang/Class;

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;-><init>(Ljava/lang/Class;)V

    .line 147
    invoke-static {p2}, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->arrayToSet([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object v3

    .line 148
    iget-object v4, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 149
    iget-object v5, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 150
    array-length v6, v4

    .line 152
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    if-nez v5, :cond_1

    move-object v1, v2

    .line 155
    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-ge v0, v6, :cond_3

    .line 156
    aget-object v8, v4, v0

    .line 158
    invoke-virtual {v8}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 155
    :cond_0
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 153
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    move-object v1, v0

    goto :goto_0

    .line 161
    :cond_2
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    if-eqz v5, :cond_0

    .line 163
    aget-object v8, v5, v0

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 166
    :cond_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 167
    if-nez v1, :cond_4

    :goto_3
    iput-object v2, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 169
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    .line 170
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    .line 171
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    .line 172
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_propertyFilterId:Ljava/lang/Object;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_propertyFilterId:Ljava/lang/Object;

    .line 173
    return-void

    .line 167
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    move-object v2, v0

    goto :goto_3
.end method

.method private final _customTypeId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 498
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 499
    if-nez v0, :cond_0

    .line 500
    const-string v0, ""

    .line 502
    :goto_0
    return-object v0

    :cond_0
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private final _serializeWithObjectId(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)V
    .locals 4

    .prologue
    .line 458
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    .line 459
    iget-object v0, v1, Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;->generator:Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;

    invoke-virtual {p3, p1, v0}, Lcom/fasterxml/jackson/databind/SerializerProvider;->findObjectId(Ljava/lang/Object;Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;)Lcom/fasterxml/jackson/databind/ser/impl/WritableObjectId;

    move-result-object v0

    .line 460
    iget-object v2, v0, Lcom/fasterxml/jackson/databind/ser/impl/WritableObjectId;->id:Ljava/lang/Object;

    .line 462
    if-eqz v2, :cond_0

    .line 463
    iget-object v0, v0, Lcom/fasterxml/jackson/databind/ser/impl/WritableObjectId;->serializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    invoke-virtual {v0, v2, p2, p3}, Lcom/fasterxml/jackson/databind/JsonSerializer;->serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    .line 494
    :goto_0
    return-void

    .line 467
    :cond_0
    iget-object v2, v1, Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;->serializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    iput-object v2, v0, Lcom/fasterxml/jackson/databind/ser/impl/WritableObjectId;->serializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    .line 468
    iget-object v2, v0, Lcom/fasterxml/jackson/databind/ser/impl/WritableObjectId;->generator:Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;

    invoke-virtual {v2, p1}, Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;->generateId(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/fasterxml/jackson/databind/ser/impl/WritableObjectId;->id:Ljava/lang/Object;

    .line 470
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 471
    :goto_1
    if-nez v0, :cond_3

    .line 472
    invoke-virtual {p4, p1, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeTypePrefixForObject(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 478
    :goto_2
    iget-object v3, v1, Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;->propertyName:Lcom/fasterxml/jackson/core/io/SerializedString;

    .line 479
    if-eqz v3, :cond_1

    .line 480
    invoke-virtual {p2, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Lcom/fasterxml/jackson/core/SerializableString;)V

    .line 481
    iget-object v1, v1, Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;->serializer:Lcom/fasterxml/jackson/databind/JsonSerializer;

    invoke-virtual {v1, v2, p2, p3}, Lcom/fasterxml/jackson/databind/JsonSerializer;->serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    .line 484
    :cond_1
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_propertyFilterId:Ljava/lang/Object;

    if-eqz v1, :cond_4

    .line 485
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->serializeFieldsFiltered(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    .line 489
    :goto_3
    if-nez v0, :cond_5

    .line 490
    invoke-virtual {p4, p1, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeTypeSuffixForObject(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;)V

    goto :goto_0

    .line 470
    :cond_2
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_customTypeId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 474
    :cond_3
    invoke-virtual {p4, p1, p2, v0}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeCustomTypePrefixForObject(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/lang/String;)V

    goto :goto_2

    .line 487
    :cond_4
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->serializeFields(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    goto :goto_3

    .line 492
    :cond_5
    invoke-virtual {p4, p1, p2, v0}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeCustomTypeSuffixForObject(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static final rename([Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;Lcom/fasterxml/jackson/databind/util/NameTransformer;)[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;
    .locals 4

    .prologue
    .line 219
    if-eqz p0, :cond_0

    array-length v0, p0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    sget-object v0, Lcom/fasterxml/jackson/databind/util/NameTransformer;->NOP:Lcom/fasterxml/jackson/databind/util/NameTransformer;

    if-ne p1, v0, :cond_1

    .line 230
    :cond_0
    :goto_0
    return-object p0

    .line 222
    :cond_1
    array-length v2, p0

    .line 223
    new-array v0, v2, [Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 224
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v2, :cond_3

    .line 225
    aget-object v3, p0, v1

    .line 226
    if-eqz v3, :cond_2

    .line 227
    invoke-virtual {v3, p1}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->rename(Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    move-result-object v3

    aput-object v3, v0, v1

    .line 224
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    move-object p0, v0

    .line 230
    goto :goto_0
.end method


# virtual methods
.method protected abstract asArraySerializer()Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;
.end method

.method public createContextual(Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/SerializerProvider;",
            "Lcom/fasterxml/jackson/databind/BeanProperty;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonSerializer",
            "<*>;"
        }
    .end annotation

    .prologue
    const/4 v11, 0x1

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 326
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    .line 328
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/SerializerProvider;->getAnnotationIntrospector()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;

    move-result-object v5

    .line 329
    if-eqz p2, :cond_0

    if-nez v5, :cond_1

    :cond_0
    move-object v4, v1

    .line 333
    :goto_0
    if-eqz p2, :cond_a

    if-eqz v5, :cond_a

    .line 334
    invoke-virtual {v5, v4}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findPropertiesToIgnore(Lcom/fasterxml/jackson/databind/introspect/Annotated;)[Ljava/lang/String;

    move-result-object v0

    .line 335
    invoke-virtual {v5, v4}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findObjectIdInfo(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    move-result-object v6

    .line 336
    if-eqz v6, :cond_9

    .line 342
    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;->getGeneratorType()Ljava/lang/Class;

    move-result-object v2

    .line 343
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/SerializerProvider;->constructType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v7

    .line 344
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/SerializerProvider;->getTypeFactory()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v8

    const-class v9, Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;

    invoke-virtual {v8, v7, v9}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->findTypeParameters(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)[Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v7

    aget-object v7, v7, v3

    .line 346
    const-class v8, Lcom/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator;

    if-ne v2, v8, :cond_7

    .line 347
    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;->getPropertyName()Ljava/lang/String;

    move-result-object v7

    .line 350
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    array-length v8, v2

    move v2, v3

    .line 351
    :goto_1
    if-ne v2, v8, :cond_2

    .line 352
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid Object Id definition for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_handledType:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": can not find property with name \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 329
    :cond_1
    invoke-interface {p2}, Lcom/fasterxml/jackson/databind/BeanProperty;->getMember()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    .line 355
    :cond_2
    iget-object v9, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    aget-object v9, v9, v2

    .line 356
    invoke-virtual {v9}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 361
    if-lez v2, :cond_3

    .line 362
    iget-object v7, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    iget-object v8, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    invoke-static {v7, v3, v8, v11, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 363
    iget-object v7, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    aput-object v9, v7, v3

    .line 364
    iget-object v7, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    if-eqz v7, :cond_3

    .line 365
    iget-object v7, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    aget-object v7, v7, v2

    .line 366
    iget-object v8, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    iget-object v10, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    invoke-static {v8, v3, v10, v11, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 367
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    aput-object v7, v2, v3

    .line 373
    :cond_3
    invoke-virtual {v9}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v2

    .line 374
    new-instance v3, Lcom/fasterxml/jackson/databind/ser/impl/PropertyBasedObjectIdGenerator;

    invoke-direct {v3, v6, v9}, Lcom/fasterxml/jackson/databind/ser/impl/PropertyBasedObjectIdGenerator;-><init>(Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)V

    .line 375
    invoke-static {v2, v1, v3}, Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;->construct(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/String;Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;)Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    move-result-object v1

    move-object v12, v0

    move-object v0, v1

    move-object v1, v12

    .line 384
    :goto_2
    if-eqz v0, :cond_8

    .line 385
    iget-object v2, v0, Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;->idType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {p1, v2, p2}, Lcom/fasterxml/jackson/databind/SerializerProvider;->findValueSerializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v2

    .line 386
    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;->withSerializer(Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    move-result-object v0

    .line 387
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    if-eq v0, v2, :cond_8

    .line 388
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->withObjectIdWriter(Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;)Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;

    move-result-object p0

    move-object v0, p0

    .line 392
    :goto_3
    if-eqz v1, :cond_4

    array-length v2, v1

    if-eqz v2, :cond_4

    .line 393
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->withIgnorals([Ljava/lang/String;)Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;

    move-result-object v0

    .line 396
    :cond_4
    if-eqz v4, :cond_5

    .line 397
    invoke-virtual {v5, v4}, Lcom/fasterxml/jackson/databind/AnnotationIntrospector;->findFormat(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Lcom/fasterxml/jackson/annotation/JsonFormat$Value;

    move-result-object v1

    .line 399
    if-eqz v1, :cond_5

    .line 400
    invoke-virtual {v1}, Lcom/fasterxml/jackson/annotation/JsonFormat$Value;->getShape()Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;

    move-result-object v1

    sget-object v2, Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;->ARRAY:Lcom/fasterxml/jackson/annotation/JsonFormat$Shape;

    if-ne v1, v2, :cond_5

    .line 401
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->asArraySerializer()Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;

    move-result-object v0

    .line 405
    :cond_5
    return-object v0

    .line 350
    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    .line 377
    :cond_7
    invoke-virtual {p1, v4, v6}, Lcom/fasterxml/jackson/databind/SerializerProvider;->objectIdGeneratorInstance(Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;)Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;

    move-result-object v1

    .line 378
    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2, v1}, Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;->construct(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/String;Lcom/fasterxml/jackson/annotation/ObjectIdGenerator;)Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    move-result-object v1

    move-object v12, v0

    move-object v0, v1

    move-object v1, v12

    goto :goto_2

    :cond_8
    move-object v0, p0

    goto :goto_3

    :cond_9
    move-object v1, v0

    move-object v0, v2

    goto :goto_2

    :cond_a
    move-object v0, v2

    goto :goto_2
.end method

.method protected findFilter(Lcom/fasterxml/jackson/databind/SerializerProvider;)Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;
    .locals 4

    .prologue
    .line 600
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_propertyFilterId:Ljava/lang/Object;

    .line 601
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/SerializerProvider;->getFilterProvider()Lcom/fasterxml/jackson/databind/ser/FilterProvider;

    move-result-object v1

    .line 603
    if-nez v1, :cond_0

    .line 604
    new-instance v1, Lcom/fasterxml/jackson/databind/JsonMappingException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Can not resolve BeanPropertyFilter with id \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\'; no FilterProvider configured"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 606
    :cond_0
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/ser/FilterProvider;->findFilter(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;

    move-result-object v0

    .line 608
    return-object v0
.end method

.method public getSchema(Lcom/fasterxml/jackson/databind/SerializerProvider;Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 7

    .prologue
    .line 615
    const-string v0, "object"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->createSchemaNode(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v3

    .line 618
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_handledType:Ljava/lang/Class;

    const-class v1, Lcom/fasterxml/jackson/databind/jsonschema/JsonSerializableSchema;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/jsonschema/JsonSerializableSchema;

    .line 619
    if-eqz v0, :cond_0

    .line 620
    invoke-interface {v0}, Lcom/fasterxml/jackson/databind/jsonschema/JsonSerializableSchema;->id()Ljava/lang/String;

    move-result-object v0

    .line 621
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 622
    const-string v1, "id"

    invoke-virtual {v3, v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 627
    :cond_0
    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v4

    .line 628
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    array-length v0, v0

    if-ge v1, v0, :cond_5

    .line 629
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    aget-object v5, v0, v1

    .line 630
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getSerializationType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    .line 632
    if-nez v0, :cond_3

    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getGenericPropertyType()Ljava/lang/reflect/Type;

    move-result-object v0

    move-object v2, v0

    .line 634
    :goto_1
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getSerializer()Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v0

    .line 635
    if-nez v0, :cond_2

    .line 636
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getRawSerializationType()Ljava/lang/Class;

    move-result-object v0

    .line 637
    if-nez v0, :cond_1

    .line 638
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getPropertyType()Ljava/lang/Class;

    move-result-object v0

    .line 640
    :cond_1
    invoke-virtual {p1, v0, v5}, Lcom/fasterxml/jackson/databind/SerializerProvider;->findValueSerializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v0

    .line 642
    :cond_2
    instance-of v6, v0, Lcom/fasterxml/jackson/databind/jsonschema/SchemaAware;

    if-eqz v6, :cond_4

    check-cast v0, Lcom/fasterxml/jackson/databind/jsonschema/SchemaAware;

    invoke-interface {v0, p1, v2}, Lcom/fasterxml/jackson/databind/jsonschema/SchemaAware;->getSchema(Lcom/fasterxml/jackson/databind/SerializerProvider;Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 645
    :goto_2
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 628
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 632
    :cond_3
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v0

    move-object v2, v0

    goto :goto_1

    .line 642
    :cond_4
    invoke-static {}, Lcom/fasterxml/jackson/databind/jsonschema/JsonSchema;->getDefaultSchemaNode()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    goto :goto_2

    .line 647
    :cond_5
    const-string v0, "properties"

    invoke-virtual {v3, v0, v4}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    .line 648
    return-object v3
.end method

.method public resolve(Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 247
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    if-nez v1, :cond_2

    move v2, v0

    .line 248
    :goto_0
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    array-length v4, v1

    move v3, v0

    :goto_1
    if-ge v3, v4, :cond_7

    .line 249
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    aget-object v5, v0, v3

    .line 251
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->willSuppressNulls()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->hasNullSerializer()Z

    move-result v0

    if-nez v0, :cond_0

    .line 252
    invoke-virtual {p1, v5}, Lcom/fasterxml/jackson/databind/SerializerProvider;->findNullValueSerializer(Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v0

    .line 253
    if-eqz v0, :cond_0

    .line 254
    invoke-virtual {v5, v0}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->assignNullSerializer(Lcom/fasterxml/jackson/databind/JsonSerializer;)V

    .line 256
    if-ge v3, v2, :cond_0

    .line 257
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    aget-object v1, v1, v3

    .line 258
    if-eqz v1, :cond_0

    .line 259
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->assignNullSerializer(Lcom/fasterxml/jackson/databind/JsonSerializer;)V

    .line 265
    :cond_0
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->hasSerializer()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 248
    :cond_1
    :goto_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 247
    :cond_2
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    array-length v1, v1

    move v2, v1

    goto :goto_0

    .line 269
    :cond_3
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getSerializationType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    .line 275
    if-nez v0, :cond_5

    .line 276
    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getGenericPropertyType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/SerializerProvider;->constructType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    .line 277
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JavaType;->isFinal()Z

    move-result v1

    if-nez v1, :cond_5

    .line 282
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JavaType;->isContainerType()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JavaType;->containedTypeCount()I

    move-result v1

    if-lez v1, :cond_1

    .line 283
    :cond_4
    invoke-virtual {v5, v0}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->setNonTrivialBaseType(Lcom/fasterxml/jackson/databind/JavaType;)V

    goto :goto_2

    .line 289
    :cond_5
    invoke-virtual {p1, v0, v5}, Lcom/fasterxml/jackson/databind/SerializerProvider;->findValueSerializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonSerializer;

    move-result-object v1

    .line 293
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JavaType;->isContainerType()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 294
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JavaType;->getContentType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JavaType;->getTypeHandler()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;

    .line 295
    if-eqz v0, :cond_6

    .line 297
    instance-of v6, v1, Lcom/fasterxml/jackson/databind/ser/ContainerSerializer;

    if-eqz v6, :cond_6

    .line 300
    check-cast v1, Lcom/fasterxml/jackson/databind/ser/ContainerSerializer;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/ser/ContainerSerializer;->withValueTypeSerializer(Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)Lcom/fasterxml/jackson/databind/ser/ContainerSerializer;

    move-result-object v1

    .line 305
    :cond_6
    invoke-virtual {v5, v1}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->assignSerializer(Lcom/fasterxml/jackson/databind/JsonSerializer;)V

    .line 307
    if-ge v3, v2, :cond_1

    .line 308
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    aget-object v0, v0, v3

    .line 309
    if-eqz v0, :cond_1

    .line 310
    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->assignSerializer(Lcom/fasterxml/jackson/databind/JsonSerializer;)V

    goto :goto_2

    .line 316
    :cond_7
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    if-eqz v0, :cond_8

    .line 317
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->resolve(Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    .line 319
    :cond_8
    return-void
.end method

.method public abstract serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
.end method

.method protected serializeFields(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .locals 4

    .prologue
    .line 515
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/SerializerProvider;->getSerializationView()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 516
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 520
    :goto_0
    const/4 v2, 0x0

    .line 522
    :try_start_0
    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_2

    .line 523
    aget-object v3, v0, v2

    .line 524
    if-eqz v3, :cond_0

    .line 525
    invoke-virtual {v3, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->serializeAsField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1

    .line 522
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 518
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    goto :goto_0

    .line 528
    :cond_2
    :try_start_1
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    if-eqz v1, :cond_3

    .line 529
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    invoke-virtual {v1, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->getAndSerialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/StackOverflowError; {:try_start_1 .. :try_end_1} :catch_1

    .line 544
    :cond_3
    :goto_2
    return-void

    .line 531
    :catch_0
    move-exception v1

    .line 532
    array-length v3, v0

    if-ne v2, v3, :cond_4

    const-string v0, "[anySetter]"

    .line 533
    :goto_3
    invoke-virtual {p0, p3, v1, p1, v0}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->wrapAndThrow(Lcom/fasterxml/jackson/databind/SerializerProvider;Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    .line 532
    :cond_4
    aget-object v0, v0, v2

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 534
    :catch_1
    move-exception v1

    .line 539
    new-instance v1, Lcom/fasterxml/jackson/databind/JsonMappingException;

    const-string v3, "Infinite recursion (StackOverflowError)"

    invoke-direct {v1, v3}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/lang/String;)V

    .line 540
    array-length v3, v0

    if-ne v2, v3, :cond_5

    const-string v0, "[anySetter]"

    .line 541
    :goto_4
    new-instance v2, Lcom/fasterxml/jackson/databind/JsonMappingException$Reference;

    invoke-direct {v2, p1, v0}, Lcom/fasterxml/jackson/databind/JsonMappingException$Reference;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonMappingException;->prependPath(Lcom/fasterxml/jackson/databind/JsonMappingException$Reference;)V

    .line 542
    throw v1

    .line 540
    :cond_5
    aget-object v0, v0, v2

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_4
.end method

.method protected serializeFieldsFiltered(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .locals 5

    .prologue
    .line 559
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lcom/fasterxml/jackson/databind/SerializerProvider;->getSerializationView()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 560
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_filteredProps:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    .line 564
    :goto_0
    invoke-virtual {p0, p3}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->findFilter(Lcom/fasterxml/jackson/databind/SerializerProvider;)Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;

    move-result-object v1

    .line 566
    if-nez v1, :cond_2

    .line 567
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->serializeFields(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    .line 591
    :cond_0
    :goto_1
    return-void

    .line 562
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_props:[Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;

    goto :goto_0

    .line 571
    :cond_2
    const/4 v2, 0x0

    .line 573
    :try_start_0
    array-length v3, v0

    :goto_2
    if-ge v2, v3, :cond_4

    .line 574
    aget-object v4, v0, v2

    .line 575
    if-eqz v4, :cond_3

    .line 576
    invoke-interface {v1, p1, p2, p3, v4}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;->serializeAsField(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;)V

    .line 573
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 579
    :cond_4
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    if-eqz v1, :cond_0

    .line 580
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_anyGetterWriter:Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;

    invoke-virtual {v1, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/AnyGetterWriter;->getAndSerialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    .line 582
    :catch_0
    move-exception v1

    .line 583
    array-length v3, v0

    if-ne v2, v3, :cond_5

    const-string v0, "[anySetter]"

    .line 584
    :goto_3
    invoke-virtual {p0, p3, v1, p1, v0}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->wrapAndThrow(Lcom/fasterxml/jackson/databind/SerializerProvider;Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    .line 583
    :cond_5
    aget-object v0, v0, v2

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 585
    :catch_1
    move-exception v1

    .line 586
    new-instance v1, Lcom/fasterxml/jackson/databind/JsonMappingException;

    const-string v3, "Infinite recursion (StackOverflowError)"

    invoke-direct {v1, v3}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/lang/String;)V

    .line 587
    array-length v3, v0

    if-ne v2, v3, :cond_6

    const-string v0, "[anySetter]"

    .line 588
    :goto_4
    new-instance v2, Lcom/fasterxml/jackson/databind/JsonMappingException$Reference;

    invoke-direct {v2, p1, v0}, Lcom/fasterxml/jackson/databind/JsonMappingException$Reference;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/databind/JsonMappingException;->prependPath(Lcom/fasterxml/jackson/databind/JsonMappingException$Reference;)V

    .line 589
    throw v1

    .line 587
    :cond_6
    aget-object v0, v0, v2

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_4
.end method

.method public serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)V
    .locals 2

    .prologue
    .line 430
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    if-eqz v0, :cond_0

    .line 431
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_serializeWithObjectId(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;)V

    .line 451
    :goto_0
    return-void

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_typeId:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 436
    :goto_1
    if-nez v0, :cond_2

    .line 437
    invoke-virtual {p4, p1, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeTypePrefixForObject(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;)V

    .line 441
    :goto_2
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_propertyFilterId:Ljava/lang/Object;

    if-eqz v1, :cond_3

    .line 442
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->serializeFieldsFiltered(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    .line 446
    :goto_3
    if-nez v0, :cond_4

    .line 447
    invoke-virtual {p4, p1, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeTypeSuffixForObject(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;)V

    goto :goto_0

    .line 435
    :cond_1
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_customTypeId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 439
    :cond_2
    invoke-virtual {p4, p1, p2, v0}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeCustomTypePrefixForObject(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/lang/String;)V

    goto :goto_2

    .line 444
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->serializeFields(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    goto :goto_3

    .line 449
    :cond_4
    invoke-virtual {p4, p1, p2, v0}, Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;->writeCustomTypeSuffixForObject(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public usesObjectId()Z
    .locals 1

    .prologue
    .line 416
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;->_objectIdWriter:Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected abstract withIgnorals([Ljava/lang/String;)Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;
.end method

.method public abstract withObjectIdWriter(Lcom/fasterxml/jackson/databind/ser/impl/ObjectIdWriter;)Lcom/fasterxml/jackson/databind/ser/std/BeanSerializerBase;
.end method
