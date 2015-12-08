.class public Lcom/kik/cards/web/picker/PickerPlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private b:Lcom/kik/cards/web/browser/BrowserPlugin$a;

.field private d:Lcom/kik/cards/web/picker/PickerRequest;

.field private e:Ljava/lang/String;

.field private f:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    const-string v0, "CardsWebPicker"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/web/picker/PickerPlugin;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/kik/cards/web/browser/BrowserPlugin$a;)V
    .locals 1

    .prologue
    .line 62
    const-string v0, "Picker"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 63
    iput-object p1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->e:Ljava/lang/String;

    .line 64
    iput-object p2, p0, Lcom/kik/cards/web/picker/PickerPlugin;->b:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    .line 65
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/kik/cards/web/browser/BrowserPlugin$a;Lcom/kik/cards/web/picker/PickerRequest;)V
    .locals 1

    .prologue
    .line 69
    const-string v0, "Picker"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 70
    iput-object p1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->e:Ljava/lang/String;

    .line 71
    iput-object p2, p0, Lcom/kik/cards/web/picker/PickerPlugin;->b:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    .line 72
    iput-object p3, p0, Lcom/kik/cards/web/picker/PickerPlugin;->d:Lcom/kik/cards/web/picker/PickerRequest;

    .line 73
    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 232
    iget-object v0, p0, Lcom/kik/cards/web/picker/PickerPlugin;->e:Ljava/lang/String;

    return-object v0
.end method

.method public cancelRequest(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 216
    iget-object v0, p0, Lcom/kik/cards/web/picker/PickerPlugin;->b:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/picker/PickerPlugin;->d:Lcom/kik/cards/web/picker/PickerRequest;

    if-eqz v0, :cond_0

    .line 218
    iput-object v1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->e:Ljava/lang/String;

    .line 219
    iput-object v1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->d:Lcom/kik/cards/web/picker/PickerRequest;

    .line 222
    iget-object v0, p0, Lcom/kik/cards/web/picker/PickerPlugin;->b:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0, v1}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->a(Lorg/json/JSONObject;)V

    .line 223
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    .line 226
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public completeRequest(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 190
    const-string v0, "responseData"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 192
    iget-object v2, p0, Lcom/kik/cards/web/picker/PickerPlugin;->b:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v2}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/kik/cards/web/picker/PickerPlugin;->d:Lcom/kik/cards/web/picker/PickerRequest;

    if-eqz v2, :cond_1

    .line 194
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v2

    if-nez v2, :cond_0

    move-object v0, v1

    .line 197
    :cond_0
    iput-object v1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->d:Lcom/kik/cards/web/picker/PickerRequest;

    .line 198
    iget-object v1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->b:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v1, v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->a(Lorg/json/JSONObject;)V

    .line 199
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    .line 202
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public forwardRequest(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 3
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 138
    const-string v0, "target"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 141
    iget-object v1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->d:Lcom/kik/cards/web/picker/PickerRequest;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->b:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v1, v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->b:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v1}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 142
    :cond_0
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 145
    :goto_0
    return-object v0

    .line 144
    :cond_1
    iget-object v1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->b:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    iget-object v2, p0, Lcom/kik/cards/web/picker/PickerPlugin;->d:Lcom/kik/cards/web/picker/PickerRequest;

    invoke-interface {v1, v0, v2}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->a(Ljava/lang/String;Lcom/kik/cards/web/picker/PickerRequest;)Lcom/kik/g/p;

    .line 145
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public getRequest(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 158
    iget-object v0, p0, Lcom/kik/cards/web/picker/PickerPlugin;->d:Lcom/kik/cards/web/picker/PickerRequest;

    if-eqz v0, :cond_0

    .line 159
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 161
    :try_start_0
    const-string v0, "requestData"

    iget-object v2, p0, Lcom/kik/cards/web/picker/PickerPlugin;->d:Lcom/kik/cards/web/picker/PickerRequest;

    iget-object v2, v2, Lcom/kik/cards/web/picker/PickerRequest;->b:Lorg/json/JSONObject;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    .line 171
    :goto_0
    return-object v0

    .line 163
    :catch_0
    move-exception v0

    .line 164
    sget-object v1, Lcom/kik/cards/web/picker/PickerPlugin;->a:Lorg/c/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error generating getRequest result: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 165
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 171
    :cond_0
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method

.method public startRequest(Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/c;
    .end annotation

    .prologue
    .line 92
    const-string v0, "requestUrl"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 93
    const-string v1, "requestData"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->f:Lorg/json/JSONObject;

    .line 96
    iget-object v1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/kik/cards/web/picker/PickerPlugin;->b:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v1}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 97
    :cond_0
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 132
    :goto_0
    return-object v0

    .line 100
    :cond_1
    new-instance v1, Lcom/kik/cards/web/picker/PickerRequest;

    iget-object v2, p0, Lcom/kik/cards/web/picker/PickerPlugin;->e:Ljava/lang/String;

    iget-object v3, p0, Lcom/kik/cards/web/picker/PickerPlugin;->f:Lorg/json/JSONObject;

    invoke-direct {v1, v2, v3}, Lcom/kik/cards/web/picker/PickerRequest;-><init>(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 102
    iget-object v2, p0, Lcom/kik/cards/web/picker/PickerPlugin;->f:Lorg/json/JSONObject;

    if-eqz v2, :cond_2

    if-nez p1, :cond_3

    .line 103
    :cond_2
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 106
    :cond_3
    iget-object v2, p0, Lcom/kik/cards/web/picker/PickerPlugin;->b:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v2, v0, v1}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->b(Ljava/lang/String;Lcom/kik/cards/web/picker/PickerRequest;)Lcom/kik/g/p;

    move-result-object v0

    .line 108
    new-instance v1, Lcom/kik/cards/web/picker/a;

    invoke-direct {v1, p0, p1}, Lcom/kik/cards/web/picker/a;-><init>(Lcom/kik/cards/web/picker/PickerPlugin;Lcom/kik/cards/web/plugin/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 132
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0xca

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method
