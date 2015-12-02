.class public Lcom/facebook/orca/fbwebrtc/i;
.super Ljava/lang/Object;
.source "VoipCallHandler.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/c/s;

.field private final c:Lcom/facebook/prefs/shared/d;

.field private final d:Lcom/facebook/push/mqtt/v;

.field private final e:Lcom/facebook/orca/fbwebrtc/ae;

.field private final f:Lcom/facebook/orca/fbwebrtc/ag;

.field private final g:Lcom/facebook/e/c;

.field private final h:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/orca/fbwebrtc/i;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/i;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/c/s;Lcom/facebook/prefs/shared/d;Lcom/facebook/push/mqtt/v;Lcom/facebook/orca/fbwebrtc/ae;Lcom/facebook/orca/fbwebrtc/ag;Lcom/facebook/e/c;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/c/s;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/push/mqtt/v;",
            "Lcom/facebook/orca/fbwebrtc/ae;",
            "Lcom/facebook/orca/fbwebrtc/ag;",
            "Lcom/facebook/e/c;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/i;->b:Lcom/facebook/c/s;

    .line 49
    iput-object p2, p0, Lcom/facebook/orca/fbwebrtc/i;->c:Lcom/facebook/prefs/shared/d;

    .line 50
    iput-object p3, p0, Lcom/facebook/orca/fbwebrtc/i;->d:Lcom/facebook/push/mqtt/v;

    .line 51
    iput-object p4, p0, Lcom/facebook/orca/fbwebrtc/i;->e:Lcom/facebook/orca/fbwebrtc/ae;

    .line 52
    iput-object p5, p0, Lcom/facebook/orca/fbwebrtc/i;->f:Lcom/facebook/orca/fbwebrtc/ag;

    .line 53
    iput-object p6, p0, Lcom/facebook/orca/fbwebrtc/i;->g:Lcom/facebook/e/c;

    .line 54
    iput-object p7, p0, Lcom/facebook/orca/fbwebrtc/i;->h:Ljavax/inject/a;

    .line 55
    iput-object p8, p0, Lcom/facebook/orca/fbwebrtc/i;->i:Ljavax/inject/a;

    .line 56
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/i;)Lcom/facebook/orca/fbwebrtc/ae;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/i;->e:Lcom/facebook/orca/fbwebrtc/ae;

    return-object v0
.end method

.method private a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 76
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/facebook/o;->webrtc_free_call_notification_title:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->webrtc_free_call_notification_body:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->webrtc_free_call_call:I

    new-instance v2, Lcom/facebook/orca/fbwebrtc/k;

    invoke-direct {v2, p0, p2, p1}, Lcom/facebook/orca/fbwebrtc/k;-><init>(Lcom/facebook/orca/fbwebrtc/i;Landroid/content/Intent;Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/high16 v1, 0x1040000

    new-instance v2, Lcom/facebook/orca/fbwebrtc/j;

    invoke-direct {v2, p0}, Lcom/facebook/orca/fbwebrtc/j;-><init>(Lcom/facebook/orca/fbwebrtc/i;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 98
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 62
    .line 63
    if-nez p2, :cond_0

    .line 64
    sget v0, Lcom/facebook/o;->webrtc_unable_call_generic_message:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 66
    :cond_0
    invoke-static {p1}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->webrtc_unable_call_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/ui/d/a;->b(Ljava/lang/String;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 70
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/fbwebrtc/i;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/i;->c:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/fbwebrtc/i;)Lcom/facebook/c/s;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/i;->b:Lcom/facebook/c/s;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/facebook/user/UserKey;ZLjava/lang/String;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 110
    invoke-virtual {p2}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 111
    invoke-virtual {p2}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 113
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/i;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/i;->g:Lcom/facebook/e/c;

    invoke-virtual {v0}, Lcom/facebook/e/c;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 114
    sget v0, Lcom/facebook/o;->webrtc_incall_status_carrier_blocked:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/fbwebrtc/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 150
    :goto_1
    return-void

    :cond_0
    move v0, v1

    .line 110
    goto :goto_0

    .line 119
    :cond_1
    if-nez p3, :cond_2

    .line 120
    invoke-direct {p0, p1, p4}, Lcom/facebook/orca/fbwebrtc/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 124
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/i;->d:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/v;->d()Z

    move-result v0

    if-nez v0, :cond_3

    .line 125
    sget v0, Lcom/facebook/o;->webrtc_unable_call_generic_message:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/fbwebrtc/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 130
    :cond_3
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-direct {v4, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 131
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/i;->f:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 132
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/i;->f:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/i;->f:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->c()J

    move-result-wide v5

    cmp-long v0, v5, v2

    if-nez v0, :cond_4

    .line 133
    const-string v0, "com.facebook.orca.fbwebrtc.intent.action.SHOW_UI"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 143
    :goto_2
    const-string v0, "CONTACT_ID"

    invoke-virtual {v4, v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 144
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/i;->h:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/i;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/fbwebrtc/ay;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 146
    invoke-direct {p0, p1, v4}, Lcom/facebook/orca/fbwebrtc/i;->a(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_1

    .line 135
    :cond_4
    sget v0, Lcom/facebook/o;->webrtc_unable_call_ongoing_call:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/fbwebrtc/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 140
    :cond_5
    const-string v0, "com.facebook.orca.fbwebrtc.intent.action.CALL"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_2

    .line 148
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/i;->b:Lcom/facebook/c/s;

    invoke-virtual {v0, v4, p1}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    goto :goto_1
.end method
