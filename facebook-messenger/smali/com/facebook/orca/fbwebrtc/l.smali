.class public Lcom/facebook/orca/fbwebrtc/l;
.super Ljava/lang/Object;
.source "VoipStatusHandler.java"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/facebook/orca/fbwebrtc/bb;

.field private c:Lcom/facebook/c/s;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/fbwebrtc/bb;Lcom/facebook/c/s;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/l;->a:Landroid/content/Context;

    .line 29
    iput-object p2, p0, Lcom/facebook/orca/fbwebrtc/l;->b:Lcom/facebook/orca/fbwebrtc/bb;

    .line 30
    iput-object p3, p0, Lcom/facebook/orca/fbwebrtc/l;->c:Lcom/facebook/c/s;

    .line 31
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/l;->b:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->c()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 5

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/l;->b:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 40
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/l;->a:Landroid/content/Context;

    sget v1, Lcom/facebook/o;->webrtc_incall_status_connecting:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 44
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/l;->a:Landroid/content/Context;

    sget v2, Lcom/facebook/o;->webrtc_call_status_bar_text:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/l;->b:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->f()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public c()V
    .locals 4

    .prologue
    .line 48
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/l;->a:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 49
    const-string v1, "com.facebook.orca.fbwebrtc.intent.action.SHOW_UI"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 51
    const-string v1, "CONTACT_ID"

    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/l;->b:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v2}, Lcom/facebook/orca/fbwebrtc/bb;->a()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 52
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/l;->c:Lcom/facebook/c/s;

    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/l;->a:Landroid/content/Context;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 53
    return-void
.end method
