.class public Lcom/kik/cards/web/userdata/UserDataPlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;

.field private static b:Z


# instance fields
.field private d:Lcom/kik/cards/web/userdata/e;

.field private e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

.field private f:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-string v0, "CardsWebUserData"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/web/userdata/UserDataPlugin;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lcom/kik/cards/web/userdata/a;Lcom/kik/cards/web/browser/BrowserPlugin$a;)V
    .locals 1

    .prologue
    .line 34
    const-string v0, "UserData"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->d:Lcom/kik/cards/web/userdata/e;

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->f:Ljava/util/ArrayList;

    .line 36
    invoke-interface {p1}, Lcom/kik/cards/web/userdata/a;->a()Lcom/kik/cards/web/userdata/e;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->d:Lcom/kik/cards/web/userdata/e;

    .line 37
    iput-object p2, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    .line 38
    const/4 v0, 0x0

    sput-boolean v0, Lcom/kik/cards/web/userdata/UserDataPlugin;->b:Z

    .line 39
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/userdata/UserDataPlugin;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)V
    .locals 1

    .prologue
    .line 23
    const/16 v0, 0xc8

    invoke-static {p0, v0, p1}, Lcom/kik/cards/web/userdata/UserDataPlugin;->a(Lcom/kik/cards/web/plugin/a;ILorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic b(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)V
    .locals 1

    .prologue
    .line 23
    const/16 v0, 0x1f4

    invoke-static {p0, v0, p1}, Lcom/kik/cards/web/userdata/UserDataPlugin;->a(Lcom/kik/cards/web/plugin/a;ILorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic c()Lorg/c/b;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/kik/cards/web/userdata/UserDataPlugin;->a:Lorg/c/b;

    return-object v0
.end method

.method static synthetic d()Z
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    sput-boolean v0, Lcom/kik/cards/web/userdata/UserDataPlugin;->b:Z

    return v0
.end method


# virtual methods
.method public checkPermissions(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 7
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 126
    const/4 v2, 0x0

    .line 128
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 129
    const/4 v2, 0x0

    .line 131
    :try_start_1
    iget-object v0, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->d:Lcom/kik/cards/web/userdata/e;

    invoke-interface {v0}, Lcom/kik/cards/web/userdata/e;->a()Lcom/kik/g/p;

    move-result-object v0

    const-wide/16 v4, 0x64

    invoke-static {v0, v4, v5}, Lcom/kik/g/s;->b(Lcom/kik/g/p;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    move-result v0

    .line 135
    :goto_0
    :try_start_2
    const-string v2, "permitted"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v0, v1

    .line 140
    :goto_1
    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v0}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    return-object v1

    :catch_0
    move-exception v0

    move v0, v2

    goto :goto_0

    .line 137
    :catch_1
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    .line 138
    :goto_2
    sget-object v2, Lcom/kik/cards/web/userdata/UserDataPlugin;->a:Lorg/c/b;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error firing back event: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lorg/c/b;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 137
    :catch_2
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    goto :goto_2
.end method

.method public getUserData(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 5
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 44
    iget-object v1, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v1}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 45
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 120
    :goto_0
    return-object v0

    .line 47
    :cond_0
    const-string v1, "fields"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 49
    const-string v2, "skipPrompt"

    invoke-virtual {p2, v2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 51
    if-eqz v1, :cond_2

    .line 52
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 53
    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v0, v4, :cond_1

    .line 54
    const-string v4, ""

    invoke-virtual {v1, v0, v4}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 56
    :cond_1
    const-string v0, "profile"

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 59
    :cond_2
    iget-object v1, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->d:Lcom/kik/cards/web/userdata/e;

    invoke-interface {v1, v2, p3}, Lcom/kik/cards/web/userdata/e;->a(ZLjava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 60
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1a4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 63
    :cond_3
    iget-object v1, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    sget-boolean v1, Lcom/kik/cards/web/userdata/UserDataPlugin;->b:Z

    if-nez v1, :cond_4

    .line 65
    const/4 v1, 0x1

    sput-boolean v1, Lcom/kik/cards/web/userdata/UserDataPlugin;->b:Z

    .line 66
    iget-object v1, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->d:Lcom/kik/cards/web/userdata/e;

    invoke-interface {v1, v0, v2, p3}, Lcom/kik/cards/web/userdata/e;->a(ZZLjava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    .line 68
    new-instance v1, Lcom/kik/cards/web/userdata/b;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/userdata/b;-><init>(Lcom/kik/cards/web/userdata/UserDataPlugin;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 120
    :cond_4
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public pickFilteredUsers(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 9
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v8, -0x1

    .line 219
    iget-object v0, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 298
    :goto_0
    return-object v0

    .line 224
    :cond_0
    const-string v0, "minResults"

    invoke-virtual {p2, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    .line 225
    const-string v0, "maxResults"

    invoke-virtual {p2, v0, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    .line 226
    const-string v0, "filterSelf"

    invoke-virtual {p2, v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 228
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 230
    const-string v0, "filtered"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 231
    if-eqz v3, :cond_1

    move v0, v6

    .line 232
    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-ge v0, v7, :cond_1

    .line 233
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 237
    :cond_1
    if-eq v2, v8, :cond_2

    if-gt v1, v2, :cond_3

    :cond_2
    if-gez v1, :cond_4

    .line 238
    :cond_3
    new-instance v0, Lorg/json/JSONException;

    const-string v1, "minResults must be nonnegative and cannot be greater than maxResults"

    invoke-direct {v0, v1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 240
    :cond_4
    const-string v0, "preselected"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 241
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 242
    if-eqz v0, :cond_5

    .line 243
    :goto_2
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-ge v6, v7, :cond_5

    .line 244
    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 248
    :cond_5
    iget-object v0, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->d:Lcom/kik/cards/web/userdata/e;

    invoke-interface/range {v0 .. v5}, Lcom/kik/cards/web/userdata/e;->a(IILjava/util/List;ZLjava/util/List;)Lcom/kik/g/p;

    move-result-object v0

    .line 250
    new-instance v1, Lcom/kik/cards/web/userdata/d;

    invoke-direct {v1, p0, p1}, Lcom/kik/cards/web/userdata/d;-><init>(Lcom/kik/cards/web/userdata/UserDataPlugin;Lcom/kik/cards/web/plugin/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 298
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public pickUsers(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 6
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    const/4 v3, -0x1

    .line 146
    iget-object v0, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->e:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 213
    :goto_0
    return-object v0

    .line 151
    :cond_0
    const-string v0, "minResults"

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    .line 152
    const-string v0, "maxResults"

    invoke-virtual {p2, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    .line 155
    if-eq v2, v3, :cond_1

    if-gt v1, v2, :cond_2

    :cond_1
    if-gez v1, :cond_3

    .line 156
    :cond_2
    new-instance v0, Lorg/json/JSONException;

    const-string v1, "minResults must be nonnegative and cannot be greater than maxResults"

    invoke-direct {v0, v1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 158
    :cond_3
    const-string v0, "preselected"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 159
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 160
    if-eqz v3, :cond_4

    .line 161
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v0, v5, :cond_4

    .line 162
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 166
    :cond_4
    iget-object v0, p0, Lcom/kik/cards/web/userdata/UserDataPlugin;->d:Lcom/kik/cards/web/userdata/e;

    invoke-interface {v0, v1, v2, v4}, Lcom/kik/cards/web/userdata/e;->a(IILjava/util/List;)Lcom/kik/g/p;

    move-result-object v0

    .line 168
    new-instance v1, Lcom/kik/cards/web/userdata/c;

    invoke-direct {v1, p0, p1}, Lcom/kik/cards/web/userdata/c;-><init>(Lcom/kik/cards/web/userdata/UserDataPlugin;Lcom/kik/cards/web/plugin/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 213
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method
