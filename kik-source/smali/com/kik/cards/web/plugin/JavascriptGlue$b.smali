.class final Lcom/kik/cards/web/plugin/JavascriptGlue$b;
.super Lcom/kik/cards/web/ba;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/web/plugin/JavascriptGlue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/cards/web/plugin/JavascriptGlue;


# direct methods
.method public constructor <init>(Lcom/kik/cards/web/plugin/JavascriptGlue;Lcom/kik/cards/web/au;Lcom/kik/cards/web/az;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$b;->a:Lcom/kik/cards/web/plugin/JavascriptGlue;

    .line 103
    invoke-direct {p0, p2, p3}, Lcom/kik/cards/web/ba;-><init>(Lcom/kik/cards/web/au;Lcom/kik/cards/web/az;)V

    .line 104
    return-void
.end method

.method private a(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v0, 0x1

    .line 139
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 141
    const-string v2, "poll"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$b;->a:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-static {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->b(Lcom/kik/cards/web/plugin/JavascriptGlue;)Lcom/kik/cards/web/plugin/JavascriptGlue$JsInterface;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue$JsInterface;->poll()Ljava/lang/String;

    move-result-object v0

    .line 156
    :goto_0
    return-object v0

    .line 144
    :cond_0
    const-string v2, "invokeAsyncFunction"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 145
    iget-object v1, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$b;->a:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-static {v1}, Lcom/kik/cards/web/plugin/JavascriptGlue;->b(Lcom/kik/cards/web/plugin/JavascriptGlue;)Lcom/kik/cards/web/plugin/JavascriptGlue$JsInterface;

    move-result-object v1

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3, p2}, Lcom/kik/cards/web/plugin/JavascriptGlue$JsInterface;->invokeAsyncFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 147
    :cond_1
    const-string v2, "invokeFunction"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 148
    iget-object v1, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$b;->a:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-static {v1}, Lcom/kik/cards/web/plugin/JavascriptGlue;->b(Lcom/kik/cards/web/plugin/JavascriptGlue;)Lcom/kik/cards/web/plugin/JavascriptGlue$JsInterface;

    move-result-object v1

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p2}, Lcom/kik/cards/web/plugin/JavascriptGlue$JsInterface;->invokeFunction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 150
    :cond_2
    const-string v2, "batchInvoke"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 151
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 152
    :goto_1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 153
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v2

    .line 154
    invoke-direct {p0, v2, p2}, Lcom/kik/cards/web/plugin/JavascriptGlue$b;->a(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 152
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 156
    :cond_3
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 159
    :cond_4
    new-instance v0, Ljava/lang/NoSuchMethodException;

    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 2

    .prologue
    .line 166
    invoke-super {p0, p1}, Lcom/kik/cards/web/ba;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    .line 167
    iget-object v0, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$b;->a:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/cards/web/plugin/JavascriptGlue;->a(Lcom/kik/cards/web/plugin/JavascriptGlue;Ljava/lang/String;)V

    .line 168
    const/4 v0, 0x1

    return v0
.end method

.method public final onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 109
    iget-object v0, p0, Lcom/kik/cards/web/plugin/JavascriptGlue$b;->a:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-static {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->a(Lcom/kik/cards/web/plugin/JavascriptGlue;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    invoke-static {}, Lcom/kik/cards/web/plugin/JavascriptGlue;->c()Lorg/c/b;

    move-result-object v0

    const-string v1, "Prompt after unhook: {}"

    invoke-interface {v0, v1, p4}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 111
    invoke-virtual {p5}, Landroid/webkit/JsPromptResult;->cancel()V

    .line 134
    :goto_0
    return v2

    .line 114
    :cond_0
    const-string v0, "CardsBridge"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lcom/kik/cards/web/plugin/JavascriptGlue$b;->a(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p5, v0}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 119
    :catch_0
    move-exception v0

    .line 127
    :cond_1
    :goto_1
    invoke-virtual {p5}, Landroid/webkit/JsPromptResult;->cancel()V

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    .line 123
    :catch_2
    move-exception v0

    goto :goto_1
.end method
