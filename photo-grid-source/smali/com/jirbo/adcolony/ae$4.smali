.class Lcom/jirbo/adcolony/ae$4;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field final synthetic b:Lcom/jirbo/adcolony/ae;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/ae;)V
    .locals 1

    .prologue
    .line 1001
    iput-object p1, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 1002
    sget-object v0, Lcom/jirbo/adcolony/a;->T:Ljava/lang/String;

    iput-object v0, p0, Lcom/jirbo/adcolony/ae$4;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1038
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "DEC onLoad: "

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 1039
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$4;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1042
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "DEC disabling mouse events"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 1044
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    const-string v1, "if (typeof(CN) != \'undefined\' && CN.div) {\n  if (typeof(cn_dispatch_on_touch_begin) != \'undefined\') CN.div.removeEventListener(\'mousedown\',  cn_dispatch_on_touch_begin, true);\n  if (typeof(cn_dispatch_on_touch_end) != \'undefined\')   CN.div.removeEventListener(\'mouseup\',  cn_dispatch_on_touch_end, true);\n  if (typeof(cn_dispatch_on_touch_move) != \'undefined\')  CN.div.removeEventListener(\'mousemove\',  cn_dispatch_on_touch_move, true);\n}\n"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ae;->a(Ljava/lang/String;)V

    .line 1051
    :cond_0
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 1067
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$4;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->T:Ljava/lang/String;

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1069
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/jirbo/adcolony/ae;->D:Z

    .line 1070
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/jirbo/adcolony/ADCVideo;->l:Z

    .line 1071
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/jirbo/adcolony/ae;->w:J

    .line 1072
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    iget-wide v2, v1, Lcom/jirbo/adcolony/ae;->w:J

    iget-object v1, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    iget-wide v4, v1, Lcom/jirbo/adcolony/ae;->v:J

    sub-long/2addr v2, v4

    long-to-double v2, v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    iput-wide v2, v0, Lcom/jirbo/adcolony/ADCVideo;->p:D

    .line 1074
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    iget-object v1, v1, Lcom/jirbo/adcolony/ae;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 1075
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    .line 1056
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$4;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1058
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    iget-object v0, v0, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/jirbo/adcolony/ADCVideo;->k:Z

    .line 1059
    iget-object v0, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/jirbo/adcolony/ae;->v:J

    .line 1061
    :cond_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 1007
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "DEC request: "

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 1010
    const-string v1, "mraid:"

    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1012
    iget-object v1, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    iget-object v1, v1, Lcom/jirbo/adcolony/ae;->aw:Lcom/jirbo/adcolony/m;

    invoke-virtual {v1, p2}, Lcom/jirbo/adcolony/m;->a(Ljava/lang/String;)V

    .line 1030
    :cond_0
    :goto_0
    return v0

    .line 1017
    :cond_1
    const-string v1, "youtube"

    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1020
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "vnd.youtube:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1021
    const-string v2, "VIDEO_ID"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1022
    iget-object v2, p0, Lcom/jirbo/adcolony/ae$4;->b:Lcom/jirbo/adcolony/ae;

    iget-object v2, v2, Lcom/jirbo/adcolony/ae;->d:Lcom/jirbo/adcolony/ADCVideo;

    invoke-virtual {v2, v1}, Lcom/jirbo/adcolony/ADCVideo;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 1025
    :cond_2
    const-string v1, "mraid.js"

    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1030
    const/4 v0, 0x0

    goto :goto_0
.end method
