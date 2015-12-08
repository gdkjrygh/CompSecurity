.class public Lcom/kik/cards/web/ba;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Lcom/kik/cards/web/az;

.field private c:Lcom/kik/g/k;

.field private d:Lcom/kik/g/k;

.field private e:Lcom/kik/g/k;

.field private f:Lcom/kik/cards/web/au;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-string v0, "WebConsole"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/web/ba;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lcom/kik/cards/web/au;Lcom/kik/cards/web/az;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 24
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/ba;->c:Lcom/kik/g/k;

    .line 25
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/ba;->d:Lcom/kik/g/k;

    .line 26
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/ba;->e:Lcom/kik/g/k;

    .line 33
    iput-object p1, p0, Lcom/kik/cards/web/ba;->f:Lcom/kik/cards/web/au;

    .line 34
    iput-object p2, p0, Lcom/kik/cards/web/ba;->b:Lcom/kik/cards/web/az;

    .line 35
    return-void
.end method

.method private static a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 40
    const-string v0, "Console.%s: %s (%s:%d)"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p3, v1, v2

    const/4 v2, 0x1

    aput-object p0, v1, v2

    const/4 v2, 0x2

    aput-object p2, v1, v2

    const/4 v2, 0x3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/kik/cards/web/ba;->c:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/kik/cards/web/ba;->d:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/kik/cards/web/ba;->e:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public onCloseWindow(Landroid/webkit/WebView;)V
    .locals 2

    .prologue
    .line 76
    iget-object v0, p0, Lcom/kik/cards/web/ba;->d:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 77
    return-void
.end method

.method public onConsoleMessage(Ljava/lang/String;ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 94
    const-string v0, "LOG"

    invoke-static {p1, p2, p3, v0}, Lcom/kik/cards/web/ba;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 97
    sget-object v1, Lcom/kik/cards/web/ba;->a:Lorg/c/b;

    invoke-interface {v1, v0}, Lorg/c/b;->a(Ljava/lang/String;)V

    .line 98
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Ljava/lang/String;ILjava/lang/String;)V

    .line 99
    return-void
.end method

.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 4

    .prologue
    .line 104
    if-nez p1, :cond_0

    const-string v0, "null console message"

    .line 105
    :goto_0
    sget-object v1, Lcom/kik/cards/web/ba;->a:Lorg/c/b;

    invoke-interface {v1, v0}, Lorg/c/b;->a(Ljava/lang/String;)V

    .line 108
    const/4 v0, 0x1

    return v0

    .line 104
    :cond_0
    const-string v0, "LOG"

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/ConsoleMessage$MessageLevel;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->lineNumber()I

    move-result v2

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->sourceId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3, v0}, Lcom/kik/cards/web/ba;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 1

    .prologue
    .line 62
    if-nez p2, :cond_0

    .line 63
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z

    move-result v0

    .line 70
    :goto_0
    return v0

    .line 66
    :cond_0
    if-eqz p3, :cond_1

    .line 67
    iget-object v0, p0, Lcom/kik/cards/web/ba;->e:Lcom/kik/g/k;

    invoke-virtual {v0, p4}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 70
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 150
    iget-object v0, p0, Lcom/kik/cards/web/ba;->b:Lcom/kik/cards/web/az;

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/kik/cards/web/ba;->b:Lcom/kik/cards/web/az;

    invoke-interface {v0, p1, p2}, Lcom/kik/cards/web/az;->a(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V

    .line 157
    :goto_0
    return-void

    .line 155
    :cond_0
    invoke-interface {p2, p1, v1, v1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    goto :goto_0
.end method

.method public onHideCustomView()V
    .locals 1

    .prologue
    .line 184
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    .line 185
    iget-object v0, p0, Lcom/kik/cards/web/ba;->f:Lcom/kik/cards/web/au;

    invoke-interface {v0}, Lcom/kik/cards/web/au;->u()V

    .line 186
    return-void
.end method

.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 2

    .prologue
    .line 115
    sget-object v0, Lcom/kik/cards/web/ba;->a:Lorg/c/b;

    const-string v1, "Blocking alert with message: {}"

    invoke-interface {v0, v1, p3}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V

    .line 117
    const/4 v0, 0x1

    return v0
.end method

.method public onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 2

    .prologue
    .line 143
    sget-object v0, Lcom/kik/cards/web/ba;->a:Lorg/c/b;

    const-string v1, "Blocking beforeUnload with message: {}"

    invoke-interface {v0, v1, p3}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 144
    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V

    .line 145
    const/4 v0, 0x1

    return v0
.end method

.method public onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 2

    .prologue
    .line 124
    sget-object v0, Lcom/kik/cards/web/ba;->a:Lorg/c/b;

    const-string v1, "Blocking confirm with message: {}"

    invoke-interface {v0, v1, p3}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 125
    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V

    .line 126
    const/4 v0, 0x1

    return v0
.end method

.method public onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 2

    .prologue
    .line 133
    sget-object v0, Lcom/kik/cards/web/ba;->a:Lorg/c/b;

    const-string v1, "Blocking confirm with prompt: {}"

    invoke-interface {v0, v1, p3}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    invoke-virtual {p5}, Landroid/webkit/JsPromptResult;->cancel()V

    .line 135
    const/4 v0, 0x1

    return v0
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2

    .prologue
    .line 162
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 164
    iget-object v0, p0, Lcom/kik/cards/web/ba;->c:Lcom/kik/g/k;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 165
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;ILandroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 1

    .prologue
    .line 177
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;ILandroid/webkit/WebChromeClient$CustomViewCallback;)V

    .line 178
    iget-object v0, p0, Lcom/kik/cards/web/ba;->f:Lcom/kik/cards/web/au;

    invoke-interface {v0, p1, p3}, Lcom/kik/cards/web/au;->a(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V

    .line 179
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 1

    .prologue
    .line 170
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V

    .line 171
    iget-object v0, p0, Lcom/kik/cards/web/ba;->f:Lcom/kik/cards/web/au;

    invoke-interface {v0, p1, p2}, Lcom/kik/cards/web/au;->a(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V

    .line 172
    return-void
.end method
