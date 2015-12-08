.class final Lcom/kik/cards/web/plugin/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/plugin/JavascriptGlue;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/plugin/JavascriptGlue;)V
    .locals 0

    .prologue
    .line 235
    iput-object p1, p0, Lcom/kik/cards/web/plugin/e;->a:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    .line 240
    iget-object v0, p0, Lcom/kik/cards/web/plugin/e;->a:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-static {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->a(Lcom/kik/cards/web/plugin/JavascriptGlue;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 245
    :goto_0
    return-void

    .line 243
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 244
    iget-object v0, p0, Lcom/kik/cards/web/plugin/e;->a:Lcom/kik/cards/web/plugin/JavascriptGlue;

    invoke-static {v0}, Lcom/kik/cards/web/plugin/JavascriptGlue;->h(Lcom/kik/cards/web/plugin/JavascriptGlue;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v7, 0x0

    new-instance v1, Landroid/view/KeyEvent;

    const-string v4, ""

    const/4 v5, -0x1

    const/16 v6, 0x20

    invoke-direct/range {v1 .. v6}, Landroid/view/KeyEvent;-><init>(JLjava/lang/String;II)V

    invoke-virtual {v0, v7, v1}, Landroid/webkit/WebView;->onKeyUp(ILandroid/view/KeyEvent;)Z

    goto :goto_0
.end method
