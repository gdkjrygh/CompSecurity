.class public Lezvcard/io/json/JsonValue;
.super Ljava/lang/Object;
.source "JsonValue.java"


# instance fields
.field private final array:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lezvcard/io/json/JsonValue;",
            ">;"
        }
    .end annotation
.end field

.field private final isNull:Z

.field private final object:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lezvcard/io/json/JsonValue;",
            ">;"
        }
    .end annotation
.end field

.field private final value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lezvcard/io/json/JsonValue;->value:Ljava/lang/Object;

    .line 47
    iput-object v0, p0, Lezvcard/io/json/JsonValue;->array:Ljava/util/List;

    .line 48
    iput-object v0, p0, Lezvcard/io/json/JsonValue;->object:Ljava/util/Map;

    .line 49
    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lezvcard/io/json/JsonValue;->isNull:Z

    .line 50
    return-void

    .line 49
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lezvcard/io/json/JsonValue;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "array":Ljava/util/List;, "Ljava/util/List<Lezvcard/io/json/JsonValue;>;"
    const/4 v0, 0x0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lezvcard/io/json/JsonValue;->array:Ljava/util/List;

    .line 58
    iput-object v0, p0, Lezvcard/io/json/JsonValue;->value:Ljava/lang/Object;

    .line 59
    iput-object v0, p0, Lezvcard/io/json/JsonValue;->object:Ljava/util/Map;

    .line 60
    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lezvcard/io/json/JsonValue;->isNull:Z

    .line 61
    return-void

    .line 60
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lezvcard/io/json/JsonValue;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "object":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lezvcard/io/json/JsonValue;>;"
    const/4 v0, 0x0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lezvcard/io/json/JsonValue;->object:Ljava/util/Map;

    .line 69
    iput-object v0, p0, Lezvcard/io/json/JsonValue;->value:Ljava/lang/Object;

    .line 70
    iput-object v0, p0, Lezvcard/io/json/JsonValue;->array:Ljava/util/List;

    .line 71
    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lezvcard/io/json/JsonValue;->isNull:Z

    .line 72
    return-void

    .line 71
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 119
    if-ne p0, p1, :cond_1

    .line 143
    :cond_0
    :goto_0
    return v1

    .line 121
    :cond_1
    if-nez p1, :cond_2

    move v1, v2

    .line 122
    goto :goto_0

    .line 123
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_3

    move v1, v2

    .line 124
    goto :goto_0

    :cond_3
    move-object v0, p1

    .line 125
    check-cast v0, Lezvcard/io/json/JsonValue;

    .line 126
    .local v0, "other":Lezvcard/io/json/JsonValue;
    iget-object v3, p0, Lezvcard/io/json/JsonValue;->array:Ljava/util/List;

    if-nez v3, :cond_4

    .line 127
    iget-object v3, v0, Lezvcard/io/json/JsonValue;->array:Ljava/util/List;

    if-eqz v3, :cond_5

    move v1, v2

    .line 128
    goto :goto_0

    .line 129
    :cond_4
    iget-object v3, p0, Lezvcard/io/json/JsonValue;->array:Ljava/util/List;

    iget-object v4, v0, Lezvcard/io/json/JsonValue;->array:Ljava/util/List;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    move v1, v2

    .line 130
    goto :goto_0

    .line 131
    :cond_5
    iget-boolean v3, p0, Lezvcard/io/json/JsonValue;->isNull:Z

    iget-boolean v4, v0, Lezvcard/io/json/JsonValue;->isNull:Z

    if-eq v3, v4, :cond_6

    move v1, v2

    .line 132
    goto :goto_0

    .line 133
    :cond_6
    iget-object v3, p0, Lezvcard/io/json/JsonValue;->object:Ljava/util/Map;

    if-nez v3, :cond_7

    .line 134
    iget-object v3, v0, Lezvcard/io/json/JsonValue;->object:Ljava/util/Map;

    if-eqz v3, :cond_8

    move v1, v2

    .line 135
    goto :goto_0

    .line 136
    :cond_7
    iget-object v3, p0, Lezvcard/io/json/JsonValue;->object:Ljava/util/Map;

    iget-object v4, v0, Lezvcard/io/json/JsonValue;->object:Ljava/util/Map;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    move v1, v2

    .line 137
    goto :goto_0

    .line 138
    :cond_8
    iget-object v3, p0, Lezvcard/io/json/JsonValue;->value:Ljava/lang/Object;

    if-nez v3, :cond_9

    .line 139
    iget-object v3, v0, Lezvcard/io/json/JsonValue;->value:Ljava/lang/Object;

    if-eqz v3, :cond_0

    move v1, v2

    .line 140
    goto :goto_0

    .line 141
    :cond_9
    iget-object v3, p0, Lezvcard/io/json/JsonValue;->value:Ljava/lang/Object;

    iget-object v4, v0, Lezvcard/io/json/JsonValue;->value:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    move v1, v2

    .line 142
    goto :goto_0
.end method

.method public getArray()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/io/json/JsonValue;",
            ">;"
        }
    .end annotation

    .prologue
    .line 87
    iget-object v0, p0, Lezvcard/io/json/JsonValue;->array:Ljava/util/List;

    return-object v0
.end method

.method public getObject()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lezvcard/io/json/JsonValue;",
            ">;"
        }
    .end annotation

    .prologue
    .line 95
    iget-object v0, p0, Lezvcard/io/json/JsonValue;->object:Ljava/util/Map;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lezvcard/io/json/JsonValue;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 108
    const/16 v0, 0x1f

    .line 109
    .local v0, "prime":I
    const/4 v1, 0x1

    .line 110
    .local v1, "result":I
    iget-object v2, p0, Lezvcard/io/json/JsonValue;->array:Ljava/util/List;

    if-nez v2, :cond_0

    move v2, v3

    :goto_0
    add-int/lit8 v1, v2, 0x1f

    .line 111
    mul-int/lit8 v4, v1, 0x1f

    iget-boolean v2, p0, Lezvcard/io/json/JsonValue;->isNull:Z

    if-eqz v2, :cond_1

    const/16 v2, 0x4cf

    :goto_1
    add-int v1, v4, v2

    .line 112
    mul-int/lit8 v4, v1, 0x1f

    iget-object v2, p0, Lezvcard/io/json/JsonValue;->object:Ljava/util/Map;

    if-nez v2, :cond_2

    move v2, v3

    :goto_2
    add-int v1, v4, v2

    .line 113
    mul-int/lit8 v2, v1, 0x1f

    iget-object v4, p0, Lezvcard/io/json/JsonValue;->value:Ljava/lang/Object;

    if-nez v4, :cond_3

    :goto_3
    add-int v1, v2, v3

    .line 114
    return v1

    .line 110
    :cond_0
    iget-object v2, p0, Lezvcard/io/json/JsonValue;->array:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    .line 111
    :cond_1
    const/16 v2, 0x4d5

    goto :goto_1

    .line 112
    :cond_2
    iget-object v2, p0, Lezvcard/io/json/JsonValue;->object:Ljava/util/Map;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    .line 113
    :cond_3
    iget-object v3, p0, Lezvcard/io/json/JsonValue;->value:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_3
.end method

.method public isNull()Z
    .locals 1

    .prologue
    .line 103
    iget-boolean v0, p0, Lezvcard/io/json/JsonValue;->isNull:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 148
    iget-boolean v0, p0, Lezvcard/io/json/JsonValue;->isNull:Z

    if-eqz v0, :cond_0

    .line 149
    const-string v0, "NULL"

    .line 164
    :goto_0
    return-object v0

    .line 152
    :cond_0
    iget-object v0, p0, Lezvcard/io/json/JsonValue;->value:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VALUE = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lezvcard/io/json/JsonValue;->value:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 156
    :cond_1
    iget-object v0, p0, Lezvcard/io/json/JsonValue;->array:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ARRAY = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lezvcard/io/json/JsonValue;->array:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 160
    :cond_2
    iget-object v0, p0, Lezvcard/io/json/JsonValue;->object:Ljava/util/Map;

    if-eqz v0, :cond_3

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OBJECT = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lezvcard/io/json/JsonValue;->object:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 164
    :cond_3
    const-string v0, ""

    goto :goto_0
.end method
