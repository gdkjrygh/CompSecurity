.class public Lcom/kik/cards/web/config/ConfigurationPlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private b:Lcom/kik/cards/web/config/a;

.field private d:Lkik/android/util/ar;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-string v0, "CardsWebConfiguration"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/web/config/ConfigurationPlugin;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lcom/kik/cards/web/config/a;Lkik/android/util/ar;)V
    .locals 1

    .prologue
    .line 31
    const-string v0, "Configuration"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 32
    iput-object p1, p0, Lcom/kik/cards/web/config/ConfigurationPlugin;->b:Lcom/kik/cards/web/config/a;

    .line 33
    iput-object p2, p0, Lcom/kik/cards/web/config/ConfigurationPlugin;->d:Lkik/android/util/ar;

    .line 34
    return-void
.end method

.method private static a(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 201
    sget v0, Lkik/android/d/b$a;->a:I

    if-ne p0, v0, :cond_0

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 202
    check-cast p1, Ljava/lang/String;

    .line 211
    :goto_0
    return-object p1

    .line 204
    :cond_0
    sget v0, Lkik/android/d/b$a;->c:I

    if-ne p0, v0, :cond_1

    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_1

    .line 205
    check-cast p1, Ljava/lang/Long;

    goto :goto_0

    .line 207
    :cond_1
    sget v0, Lkik/android/d/b$a;->b:I

    if-ne p0, v0, :cond_2

    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    .line 208
    check-cast p1, Ljava/lang/Boolean;

    goto :goto_0

    .line 211
    :cond_2
    const/4 p1, 0x0

    goto :goto_0
.end method

.method private static a(Lkik/android/d/b;)Lorg/json/JSONObject;
    .locals 5

    .prologue
    .line 164
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 166
    :try_start_0
    const-string v0, "name"

    invoke-virtual {p0}, Lkik/android/d/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    const-string v2, "type"

    invoke-virtual {p0}, Lkik/android/d/b;->a()I

    move-result v0

    sget v3, Lkik/android/d/b$a;->a:I

    if-ne v0, v3, :cond_0

    const-string v0, "string"

    :goto_0
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 168
    invoke-virtual {p0}, Lkik/android/d/b;->f()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 169
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 170
    invoke-virtual {p0}, Lkik/android/d/b;->f()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 171
    invoke-virtual {p0}, Lkik/android/d/b;->a()I

    move-result v4

    invoke-static {v4, v3}, Lcom/kik/cards/web/config/ConfigurationPlugin;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 178
    :catch_0
    move-exception v0

    .line 179
    sget-object v2, Lcom/kik/cards/web/config/ConfigurationPlugin;->a:Lorg/c/b;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error converting Configuration to JSONObject: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 181
    :goto_2
    return-object v1

    .line 167
    :cond_0
    :try_start_1
    sget v3, Lkik/android/d/b$a;->d:I

    if-eq v0, v3, :cond_1

    sget v3, Lkik/android/d/b$a;->c:I

    if-ne v0, v3, :cond_2

    :cond_1
    const-string v0, "number"

    goto :goto_0

    :cond_2
    sget v3, Lkik/android/d/b$a;->b:I

    if-ne v0, v3, :cond_3

    const-string v0, "boolean"

    goto :goto_0

    :cond_3
    const-string v0, "unknown"

    goto :goto_0

    .line 173
    :cond_4
    const-string v2, "possibleValues"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 175
    :cond_5
    const-string v0, "defaultValue"

    invoke-virtual {p0}, Lkik/android/d/b;->a()I

    move-result v2

    invoke-virtual {p0}, Lkik/android/d/b;->e()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/kik/cards/web/config/ConfigurationPlugin;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 176
    const-string v0, "value"

    invoke-virtual {p0}, Lkik/android/d/b;->a()I

    move-result v2

    invoke-virtual {p0}, Lkik/android/d/b;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/kik/cards/web/config/ConfigurationPlugin;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2
.end method


# virtual methods
.method public getAvailableServerProfiles(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 13
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    const/16 v12, 0x1f4

    const/4 v2, 0x0

    .line 105
    iget-object v0, p0, Lcom/kik/cards/web/config/ConfigurationPlugin;->b:Lcom/kik/cards/web/config/a;

    invoke-interface {v0}, Lcom/kik/cards/web/config/a;->b()Lkik/android/d/c;

    move-result-object v0

    invoke-interface {v0}, Lkik/android/d/c;->b()Ljava/util/Hashtable;

    move-result-object v0

    .line 106
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 108
    :try_start_0
    invoke-virtual {v0}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 109
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 110
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/f/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v6

    array-length v7, v6

    move v1, v2

    :goto_1
    if-ge v1, v7, :cond_1

    aget-object v8, v6, v1

    .line 111
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->isAccessible()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    array-length v9, v9

    if-nez v9, :cond_0

    .line 112
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    const/4 v11, 0x0

    new-array v11, v11, [Ljava/lang/Object;

    invoke-virtual {v8, v10, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v5, v9, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 110
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 115
    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 118
    :catch_0
    move-exception v0

    .line 119
    sget-object v1, Lcom/kik/cards/web/config/ConfigurationPlugin;->a:Lorg/c/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error generating getAvailableServerProfiles result: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 120
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v12}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 127
    :goto_2
    return-object v0

    .line 122
    :catch_1
    move-exception v0

    .line 123
    sget-object v1, Lcom/kik/cards/web/config/ConfigurationPlugin;->a:Lorg/c/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exception with method reflection: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 124
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v12}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_2

    .line 127
    :cond_2
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v3}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    goto :goto_2
.end method

.method public getCurrentServerProfile(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 133
    iget-object v0, p0, Lcom/kik/cards/web/config/ConfigurationPlugin;->b:Lcom/kik/cards/web/config/a;

    invoke-interface {v0}, Lcom/kik/cards/web/config/a;->b()Lkik/android/d/c;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/config/ConfigurationPlugin;->d:Lkik/android/util/ar;

    invoke-interface {v0, v1}, Lkik/android/d/c;->a(Lkik/android/util/ar;)Ljava/lang/String;

    move-result-object v0

    .line 134
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 136
    :try_start_0
    const-string v2, "name"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    :goto_0
    return-object v0

    .line 138
    :catch_0
    move-exception v0

    .line 139
    sget-object v1, Lcom/kik/cards/web/config/ConfigurationPlugin;->a:Lorg/c/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error generating getCurrentServerProfile result: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 140
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public getPreference(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 59
    const-string v0, "name"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    .line 61
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 76
    :goto_0
    return-object v0

    .line 63
    :cond_0
    iget-object v1, p0, Lcom/kik/cards/web/config/ConfigurationPlugin;->b:Lcom/kik/cards/web/config/a;

    invoke-interface {v1}, Lcom/kik/cards/web/config/a;->b()Lkik/android/d/c;

    move-result-object v1

    invoke-interface {v1, v0}, Lkik/android/d/c;->a(Ljava/lang/String;)Lkik/android/d/b;

    move-result-object v0

    .line 64
    if-nez v0, :cond_1

    .line 65
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x194

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 67
    :cond_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 69
    :try_start_0
    const-string v2, "value"

    invoke-virtual {v0}, Lkik/android/d/b;->a()I

    move-result v3

    invoke-virtual {v0}, Lkik/android/d/b;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/kik/cards/web/config/ConfigurationPlugin;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 71
    :catch_0
    move-exception v0

    .line 72
    sget-object v1, Lcom/kik/cards/web/config/ConfigurationPlugin;->a:Lorg/c/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error generating getPreference result: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 73
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public getPreferenceList(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 39
    iget-object v0, p0, Lcom/kik/cards/web/config/ConfigurationPlugin;->b:Lcom/kik/cards/web/config/a;

    invoke-interface {v0}, Lcom/kik/cards/web/config/a;->b()Lkik/android/d/c;

    move-result-object v0

    invoke-interface {v0}, Lkik/android/d/c;->a()Ljava/util/Collection;

    move-result-object v0

    .line 40
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 41
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 42
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/d/b;

    .line 43
    invoke-static {v0}, Lcom/kik/cards/web/config/ConfigurationPlugin;->a(Lkik/android/d/b;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 46
    :cond_0
    :try_start_0
    const-string v0, "preferences"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    :goto_1
    return-object v0

    .line 48
    :catch_0
    move-exception v0

    .line 49
    sget-object v1, Lcom/kik/cards/web/config/ConfigurationPlugin;->a:Lorg/c/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error generating getPreferenceList result: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 50
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_1
.end method

.method public setCurrentServerProfile(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 149
    const-string v0, "name"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 150
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    .line 151
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 158
    :goto_0
    return-object v0

    .line 154
    :cond_0
    iget-object v1, p0, Lcom/kik/cards/web/config/ConfigurationPlugin;->b:Lcom/kik/cards/web/config/a;

    invoke-interface {v1}, Lcom/kik/cards/web/config/a;->b()Lkik/android/d/c;

    move-result-object v1

    invoke-interface {v1, v0}, Lkik/android/d/c;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    goto :goto_0

    .line 158
    :cond_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public setPreference(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 5
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    const/16 v4, 0x190

    .line 82
    const-string v0, "name"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 84
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v4}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 98
    :goto_0
    return-object v0

    .line 86
    :cond_0
    const-string v0, "value"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    .line 88
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v4}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 90
    :cond_1
    iget-object v2, p0, Lcom/kik/cards/web/config/ConfigurationPlugin;->b:Lcom/kik/cards/web/config/a;

    invoke-interface {v2}, Lcom/kik/cards/web/config/a;->b()Lkik/android/d/c;

    move-result-object v2

    invoke-interface {v2, v1}, Lkik/android/d/c;->a(Ljava/lang/String;)Lkik/android/d/b;

    move-result-object v1

    .line 91
    if-nez v1, :cond_2

    .line 92
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x194

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 94
    :cond_2
    invoke-virtual {v1}, Lkik/android/d/b;->a()I

    move-result v2

    sget v3, Lkik/android/d/b$a;->a:I

    if-ne v2, v3, :cond_3

    :goto_1
    invoke-virtual {v1, v0}, Lkik/android/d/b;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 95
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    goto :goto_0

    .line 94
    :cond_3
    sget v3, Lkik/android/d/b$a;->c:I

    if-ne v2, v3, :cond_4

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_1

    :cond_4
    sget v3, Lkik/android/d/b$a;->b:I

    if-ne v2, v3, :cond_5

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    goto :goto_1

    .line 98
    :cond_6
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v4}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method
