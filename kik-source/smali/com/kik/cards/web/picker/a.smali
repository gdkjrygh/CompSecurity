.class final Lcom/kik/cards/web/picker/a;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/plugin/a;

.field final synthetic b:Lcom/kik/cards/web/picker/PickerPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/picker/PickerPlugin;Lcom/kik/cards/web/plugin/a;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/kik/cards/web/picker/a;->b:Lcom/kik/cards/web/picker/PickerPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/picker/a;->a:Lcom/kik/cards/web/plugin/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 108
    check-cast p1, Lorg/json/JSONObject;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v0, "responseData"

    invoke-virtual {v1, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lcom/kik/cards/web/picker/a;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v2, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v2, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    invoke-interface {v0, v2}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 127
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 128
    iget-object v0, p0, Lcom/kik/cards/web/picker/a;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1}, Lcom/kik/cards/web/plugin/j;-><init>()V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 129
    return-void
.end method
