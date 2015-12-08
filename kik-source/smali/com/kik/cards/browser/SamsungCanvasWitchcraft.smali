.class public Lcom/kik/cards/browser/SamsungCanvasWitchcraft;
.super Landroid/webkit/WebView;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-string v0, "CanvasFix"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/browser/SamsungCanvasWitchcraft;->a:Lorg/c/b;

    .line 22
    const/4 v0, 0x0

    sput-boolean v0, Lcom/kik/cards/browser/SamsungCanvasWitchcraft;->b:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/kik/cards/browser/SamsungCanvasWitchcraft;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    .line 31
    invoke-direct {p0, p1, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    new-instance v0, Lcom/kik/cards/browser/f;

    invoke-direct {v0, p0}, Lcom/kik/cards/browser/f;-><init>(Lcom/kik/cards/browser/SamsungCanvasWitchcraft;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {p0, v0, v2, v3}, Lcom/kik/cards/browser/SamsungCanvasWitchcraft;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 41
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/browser/SamsungCanvasWitchcraft;)Z
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/kik/cards/browser/SamsungCanvasWitchcraft;->b()Z

    move-result v0

    return v0
.end method

.method static synthetic a(Z)Z
    .locals 0

    .prologue
    .line 16
    sput-boolean p0, Lcom/kik/cards/browser/SamsungCanvasWitchcraft;->b:Z

    return p0
.end method

.method private b()Z
    .locals 2

    .prologue
    .line 80
    invoke-virtual {p0}, Lcom/kik/cards/browser/SamsungCanvasWitchcraft;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 81
    if-eqz v1, :cond_0

    instance-of v0, v1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 82
    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->isShown()Z

    move-result v0

    .line 83
    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 86
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 56
    sget-boolean v0, Lcom/kik/cards/browser/SamsungCanvasWitchcraft;->b:Z

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v0, v2, :cond_0

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "samsung"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    .line 57
    invoke-direct {p0}, Lcom/kik/cards/browser/SamsungCanvasWitchcraft;->b()Z

    .line 74
    :goto_1
    return-void

    .line 56
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {p0}, Lcom/kik/cards/browser/SamsungCanvasWitchcraft;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 64
    const-string v0, "<!DOCTYPE html><html><body><canvas id=\"canvas\"></canvas><script>var c=document.getElementById(\'canvas\'), ctx=c.getContext(\'2d\'), width=window.innerWidth, height=window.innerHeight, i=0;c.width=width;c.height=height;var timeout=setInterval(function (){var x=0.5*width, y=0.5*height;ctx.fillStyle=\'#FF0000\';ctx.beginPath();ctx.moveTo(x+1, y+1);ctx.arc(x+1, y+1, 10, 0, Math.PI*2, false);ctx.fill();i++;if (i > 1000){clearInterval(timeout);}}, 5);</script></body></html>"

    const-string v1, "text/html"

    const-string v2, "UTF-8"

    invoke-virtual {p0, v0, v1, v2}, Lcom/kik/cards/browser/SamsungCanvasWitchcraft;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    new-instance v0, Lcom/kik/cards/browser/g;

    invoke-direct {v0, p0}, Lcom/kik/cards/browser/g;-><init>(Lcom/kik/cards/browser/SamsungCanvasWitchcraft;)V

    const-wide/16 v2, 0x1388

    invoke-virtual {p0, v0, v2, v3}, Lcom/kik/cards/browser/SamsungCanvasWitchcraft;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1
.end method
