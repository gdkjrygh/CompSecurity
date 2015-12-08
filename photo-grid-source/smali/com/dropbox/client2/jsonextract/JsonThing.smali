.class public final Lcom/dropbox/client2/jsonextract/JsonThing;
.super Lcom/dropbox/client2/jsonextract/JsonBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/dropbox/client2/jsonextract/JsonBase",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final TypeNames:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 17
    const-class v0, Lcom/dropbox/client2/jsonextract/JsonThing;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/dropbox/client2/jsonextract/JsonThing;->$assertionsDisabled:Z

    .line 27
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 29
    sput-object v0, Lcom/dropbox/client2/jsonextract/JsonThing;->TypeNames:Ljava/util/HashMap;

    const-class v1, Ljava/lang/String;

    const-string v2, "a string"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    sget-object v0, Lcom/dropbox/client2/jsonextract/JsonThing;->TypeNames:Ljava/util/HashMap;

    const-class v1, Ljava/lang/Number;

    const-string v2, "a number"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    sget-object v0, Lcom/dropbox/client2/jsonextract/JsonThing;->TypeNames:Ljava/util/HashMap;

    const-class v1, Ljava/lang/Boolean;

    const-string v2, "a boolean"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    sget-object v0, Lcom/dropbox/client2/jsonextract/JsonThing;->TypeNames:Ljava/util/HashMap;

    const-class v1, Ljava/util/Map;

    const-string v2, "an object"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    sget-object v0, Lcom/dropbox/client2/jsonextract/JsonThing;->TypeNames:Ljava/util/HashMap;

    const-class v1, Ljava/util/List;

    const-string v2, "an array"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    return-void

    .line 17
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/dropbox/client2/jsonextract/JsonBase;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1, p2}, Lcom/dropbox/client2/jsonextract/JsonBase;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    return-void
.end method

.method private expect(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 59
    sget-boolean v0, Lcom/dropbox/client2/jsonextract/JsonThing;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 63
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    .line 64
    return-object v0

    .line 67
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "expecting "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/dropbox/client2/jsonextract/JsonThing;->typeNameForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", found "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    invoke-static {v1}, Lcom/dropbox/client2/jsonextract/JsonThing;->typeNameForObject(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->error(Ljava/lang/String;)Lcom/dropbox/client2/jsonextract/JsonExtractionException;

    move-result-object v0

    throw v0
.end method

.method private is(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 54
    sget-boolean v0, Lcom/dropbox/client2/jsonextract/JsonThing;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static pathConcat(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 196
    if-nez p0, :cond_0

    .line 197
    :goto_0
    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method private static typeNameForClass(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 37
    if-nez p0, :cond_1

    const-string v0, "null"

    .line 40
    :cond_0
    return-object v0

    .line 38
    :cond_1
    sget-object v0, Lcom/dropbox/client2/jsonextract/JsonThing;->TypeNames:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 39
    sget-boolean v1, Lcom/dropbox/client2/jsonextract/JsonThing;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method private static typeNameForObject(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 44
    if-nez p0, :cond_0

    const-string v0, "null"

    .line 49
    :goto_0
    return-object v0

    .line 45
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_1

    const-string v0, "a number"

    goto :goto_0

    .line 46
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v0, "a string"

    goto :goto_0

    .line 47
    :cond_2
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    const-string v0, "a boolean"

    goto :goto_0

    .line 48
    :cond_3
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_4

    const-string v0, "an object"

    goto :goto_0

    .line 49
    :cond_4
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_5

    const-string v0, "an array"

    goto :goto_0

    .line 50
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "not a valid org.json.simple type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final bridge synthetic error(Ljava/lang/String;)Lcom/dropbox/client2/jsonextract/JsonExtractionException;
    .locals 1

    .prologue
    .line 17
    invoke-super {p0, p1}, Lcom/dropbox/client2/jsonextract/JsonBase;->error(Ljava/lang/String;)Lcom/dropbox/client2/jsonextract/JsonExtractionException;

    move-result-object v0

    return-object v0
.end method

.method public final expectBoolean()Z
    .locals 1

    .prologue
    .line 188
    const-class v0, Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->expect(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final expectFloat64()D
    .locals 2

    .prologue
    .line 155
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    .line 157
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0

    .line 160
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "expecting a floating point number, found "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    invoke-static {v1}, Lcom/dropbox/client2/jsonextract/JsonThing;->typeNameForObject(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->error(Ljava/lang/String;)Lcom/dropbox/client2/jsonextract/JsonExtractionException;

    move-result-object v0

    throw v0
.end method

.method public final expectInt32()I
    .locals 2

    .prologue
    .line 132
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    .line 137
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0

    .line 140
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "expecting an integer, found "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    invoke-static {v1}, Lcom/dropbox/client2/jsonextract/JsonThing;->typeNameForObject(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->error(Ljava/lang/String;)Lcom/dropbox/client2/jsonextract/JsonExtractionException;

    move-result-object v0

    throw v0
.end method

.method public final expectInt64()J
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    .line 114
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 117
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "expecting an integer, found "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    invoke-static {v1}, Lcom/dropbox/client2/jsonextract/JsonThing;->typeNameForObject(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->error(Ljava/lang/String;)Lcom/dropbox/client2/jsonextract/JsonExtractionException;

    move-result-object v0

    throw v0
.end method

.method public final expectList()Lcom/dropbox/client2/jsonextract/JsonList;
    .locals 3

    .prologue
    .line 92
    const-class v0, Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->expect(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 93
    new-instance v1, Lcom/dropbox/client2/jsonextract/JsonList;

    iget-object v2, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->path:Ljava/lang/String;

    invoke-direct {v1, v0, v2}, Lcom/dropbox/client2/jsonextract/JsonList;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object v1
.end method

.method public final expectMap()Lcom/dropbox/client2/jsonextract/JsonMap;
    .locals 3

    .prologue
    .line 82
    const-class v0, Ljava/util/Map;

    invoke-direct {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->expect(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 83
    new-instance v1, Lcom/dropbox/client2/jsonextract/JsonMap;

    iget-object v2, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->path:Ljava/lang/String;

    invoke-direct {v1, v0, v2}, Lcom/dropbox/client2/jsonextract/JsonMap;-><init>(Ljava/util/Map;Ljava/lang/String;)V

    return-object v1
.end method

.method public final expectNull()V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 72
    const-string v0, "expecting null"

    invoke-virtual {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->error(Ljava/lang/String;)Lcom/dropbox/client2/jsonextract/JsonExtractionException;

    move-result-object v0

    throw v0

    .line 74
    :cond_0
    return-void
.end method

.method public final expectNumber()Ljava/lang/Number;
    .locals 1

    .prologue
    .line 101
    const-class v0, Ljava/lang/Number;

    invoke-direct {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->expect(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    return-object v0
.end method

.method public final expectString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 175
    const-class v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->expect(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final expectStringOrNull()Ljava/lang/String;
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 180
    :goto_0
    return-object v0

    :cond_0
    const-class v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->expect(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0
.end method

.method public final isBoolean()Z
    .locals 1

    .prologue
    .line 192
    const-class v0, Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->is(Ljava/lang/Class;)Z

    move-result v0

    return v0
.end method

.method public final isFloat64()Z
    .locals 1

    .prologue
    .line 166
    :try_start_0
    invoke-virtual {p0}, Lcom/dropbox/client2/jsonextract/JsonThing;->expectFloat64()D
    :try_end_0
    .catch Lcom/dropbox/client2/jsonextract/JsonExtractionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    const/4 v0, 0x1

    .line 170
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isInt32()Z
    .locals 1

    .prologue
    .line 146
    :try_start_0
    invoke-virtual {p0}, Lcom/dropbox/client2/jsonextract/JsonThing;->expectInt32()I
    :try_end_0
    .catch Lcom/dropbox/client2/jsonextract/JsonExtractionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    const/4 v0, 0x1

    .line 150
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isInt64()Z
    .locals 1

    .prologue
    .line 123
    :try_start_0
    invoke-virtual {p0}, Lcom/dropbox/client2/jsonextract/JsonThing;->expectInt64()J
    :try_end_0
    .catch Lcom/dropbox/client2/jsonextract/JsonExtractionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    const/4 v0, 0x1

    .line 127
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isList()Z
    .locals 1

    .prologue
    .line 97
    const-class v0, Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->is(Ljava/lang/Class;)Z

    move-result v0

    return v0
.end method

.method public final isMap()Z
    .locals 1

    .prologue
    .line 87
    const-class v0, Ljava/util/Map;

    invoke-direct {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->is(Ljava/lang/Class;)Z

    move-result v0

    return v0
.end method

.method public final isNull()Z
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isNumber()Z
    .locals 1

    .prologue
    .line 105
    const-class v0, Ljava/lang/Number;

    invoke-direct {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->is(Ljava/lang/Class;)Z

    move-result v0

    return v0
.end method

.method public final isString()Z
    .locals 1

    .prologue
    .line 184
    const-class v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->is(Ljava/lang/Class;)Z

    move-result v0

    return v0
.end method

.method public final optionalExtract(Lcom/dropbox/client2/jsonextract/JsonExtractor;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/dropbox/client2/jsonextract/JsonExtractor",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 217
    invoke-virtual {p0}, Lcom/dropbox/client2/jsonextract/JsonThing;->isNull()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 218
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1, p0}, Lcom/dropbox/client2/jsonextract/JsonExtractor;->extract(Lcom/dropbox/client2/jsonextract/JsonThing;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final unexpected()Lcom/dropbox/client2/jsonextract/JsonExtractionException;
    .locals 2

    .prologue
    .line 201
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unexpected type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/dropbox/client2/jsonextract/JsonThing;->internal:Ljava/lang/Object;

    invoke-static {v1}, Lcom/dropbox/client2/jsonextract/JsonThing;->typeNameForObject(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->error(Ljava/lang/String;)Lcom/dropbox/client2/jsonextract/JsonExtractionException;

    move-result-object v0

    return-object v0
.end method
