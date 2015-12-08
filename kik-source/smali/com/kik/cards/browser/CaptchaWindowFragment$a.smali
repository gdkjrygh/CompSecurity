.class final Lcom/kik/cards/browser/CaptchaWindowFragment$a;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/browser/CaptchaWindowFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/cards/browser/CaptchaWindowFragment;


# direct methods
.method private constructor <init>(Lcom/kik/cards/browser/CaptchaWindowFragment;)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lcom/kik/cards/browser/CaptchaWindowFragment$a;->a:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/kik/cards/browser/CaptchaWindowFragment;B)V
    .locals 0

    .prologue
    .line 146
    invoke-direct {p0, p1}, Lcom/kik/cards/browser/CaptchaWindowFragment$a;-><init>(Lcom/kik/cards/browser/CaptchaWindowFragment;)V

    return-void
.end method


# virtual methods
.method public final onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 151
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 152
    return-void
.end method
